package strings;

public class Permutations {
    public static void main(String[] args) {
       // permutations("","abc");
        System.out.println(permutationcount("","abc"));
    }

    static void permutations(String newer, String old){
        if(old.isEmpty()){
            System.out.println(newer);
            return;
        }

        char ch = old.charAt(0);

        for(int i = 0; i <= newer.length(); i++){
            String f = newer.substring(0,i);
            String s = newer.substring(i, newer.length());
            permutations(f+ch+s, old.substring(1));
        }
    }

    static int permutationcount(String newer, String old){
        if(old.isEmpty()){
           return 1;
        }

        char ch = old.charAt(0);
        int count = 0;
        for(int i = 0; i <= newer.length(); i++){
            String f = newer.substring(0,i);
            String s = newer.substring(i, newer.length());
            count = count + permutationcount(f+ch+s, old.substring(1));
        }

        return count;
    }
}
