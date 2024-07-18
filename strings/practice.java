package strings;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class practice {
    public static void main(String[] args) {
       char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
        static void reverseString(char[] s) {
                int i = 0;
                for(int j = s.length-1; j>=s.length/2; j--){
                    char temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                    i++;
                }
            System.out.println(Arrays.toString(s));
        }
    }


