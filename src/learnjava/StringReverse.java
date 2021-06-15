package learnjava;

public class StringReverse {

    public static void main(String[] args) {
        StringReverse obj = new StringReverse();
        obj.reverseString("Hello World");           //main string
    
    }

    public void reverseString(String str) {             //reverse funstion
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];                         
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {

                reverseWord = reverseWord + word.charAt(j);     
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(str);
        System.out.println(reversedString);
    }

}
