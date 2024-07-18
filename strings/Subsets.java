package strings;

public class Subsets {
    public static void main(String[] args) {
        Subset("", "abc");
    }

    static void Subset(String newer, String old){
        if(old.isEmpty()){
            System.out.println(newer);
            return;
        }

        char ch = old.charAt(0);
        Subset(newer+ch, old.substring(1));
        Subset(newer, old.substring(1));
    }
}
