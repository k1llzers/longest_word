import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        String sen = input.nextLine();
        System.out.println(LongestWord(sen));

    }

    public static String LongestWord(String sen){
        sen.replaceAll("\\. | , | -","");
        String[] array = sen.split(" ");
        String word=array[0];

        for(int i=1; i<array.length; i++){
            if(array[i].length()>word.length()) {
                word = array[i];
            }
        }
        return word;
    }

}