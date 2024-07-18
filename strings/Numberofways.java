package strings;

public class Numberofways {
    public static void main(String[] args) {
        dice("", 5);
    }

    static void dice(String newer, int target){
        if(target == 0){
            System.out.println(newer);
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i++){
            dice(newer + i, target - i);
        }
    }
}
