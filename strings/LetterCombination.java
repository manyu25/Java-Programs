package strings;

import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        System.out.println(combinations("","12"));
    }
//    static void combinations(String newer, String old){
//        if(old.isEmpty()){
//            System.out.println(newer);
//            return;
//        }
//        int digit = newer.charAt(0) - '0'; //converts '3' to 3
//        for(int i = (digit - 1)*3; i < digit * 3; i++){
//            char ch = (char) ('a' + i);
//            combinations(newer + ch, old.substring(1));
//        }
//    }


    static ArrayList<String> combinations(String newer, String old){
        if(old.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(newer);
           return list;
        }
        int digit = newer.charAt(0) - '0'; //converts '3' to 3

        ArrayList<String> list = new ArrayList<>();
        for(int i = (digit - 1)*3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            list.addAll(combinations(newer + ch, old.substring(1)));
        }

        return list;
    }
}
