

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        while(true){
            String input = getInput();
            String binary = stringToBinary(input);
            System.out.println(binary);
        }
    }

    //Gets user input and returns the string
    public static String getInput(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        return str;
    }

    //This function takes character and converts it to deciaml ascii
    public static int charToAscii(char ch){
        return (int) ch;
    }

    //Takes a string and converts it to a list of decimal ascii
    public static int[] stringToAscii(String str){
        int[] decimalList = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            decimalList[i] = charToAscii(str.charAt(i));
        }
        return decimalList;
    }

    public static String asciiToBinary(int[] decimalList){
        String binaryString = "";
        for (int i = 0; i < decimalList.length; i++){
            int start = 64;
            String binaryNum = "";
            for (int j = 0; j < 7; j++){
                if(decimalList[i] >= start){
                    decimalList[i] = decimalList[i] - start;
                    binaryNum += '1';
                }else{
                    binaryNum += '0';
                }
                start = start/2;
            }
            binaryString += binaryNum + " ";
        }
        binaryString = binaryString.substring(0,binaryString.length()-1);
        return binaryString;
    }

    //Takes a string and converts it to string binary
    public static String stringToBinary(String str){
        int[] asciiList = stringToAscii(str);
        String binary = asciiToBinary(asciiList);
        return binary;
    }

}
