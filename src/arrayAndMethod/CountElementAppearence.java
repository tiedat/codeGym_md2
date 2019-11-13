package arrayAndMethod;

import java.util.Arrays;

public class CountElementAppearence {

    public static void main(String[] args) {
        String str = "Hello world. I am your King.";
        char character = 'o';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==character){
                count++;
            }
        }

        System.out.printf("%c appears %d times in string: %s",character,count,str);

    }
}
