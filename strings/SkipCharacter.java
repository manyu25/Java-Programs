package strings;

public class SkipCharacter {
    public static void main(String[] args) {
        String newer = "";
        String old = "baccad";
        skip(newer, old);
    }

    static void skip(String newer, String old) {
        if (old.isEmpty()) {
            System.out.println(newer);
            return;
        }
        char ch = old.charAt(0);
        if (ch == 'a') {
            skip(newer, old.substring(1));
        } else {
            skip(newer + ch, old.substring(1));
        }
    }

}
