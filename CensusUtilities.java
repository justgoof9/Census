import java.util.ArrayList;

public class CensusUtilities {
    public static int letterToNumber(String letter) {
        //returns a letter’s numeric value as defined by the Soundex system
                      //dropped letters return the value -1
                     //precondition: letter is an uppercase or lowercase letter A-Z/a-z    }
        if(letter.equalsIgnoreCase("b") || letter.equalsIgnoreCase("f") || letter.equalsIgnoreCase("p") || letter.equalsIgnoreCase("v")) {
            return 1;
        }
        if(letter.equalsIgnoreCase("c") || letter.equalsIgnoreCase("g") || letter.equalsIgnoreCase("j") || letter.equalsIgnoreCase("k") || letter.equalsIgnoreCase("q") || letter.equalsIgnoreCase("s") ||
        letter.equalsIgnoreCase("x") || letter.equalsIgnoreCase("z")) {
            return 2;
        }
        if(letter.equalsIgnoreCase("d") || letter.equalsIgnoreCase("t")) {
            return 3;
        }
        if(letter.equalsIgnoreCase("l")) {
            return 4;
        }
        if(letter.equalsIgnoreCase("m") || letter.equalsIgnoreCase("n")){
            return 5;
        }
        if(letter.equalsIgnoreCase("r")) {
            return 6;
        }
        return -1;
    }

    public static String getFirstSurname(String sur) {
        String [] arrOfStr =sur.split("\t");
        String [] arrOfName = arrOfStr[0].split(" ");

        return arrOfName[arrOfName.length-1];
        
    }

    public static String getSoundex(String name) {
        String [] arr = name.split("");

        ArrayList <Integer> temp = new ArrayList <Integer>(); 
        String total = "";
        for(int i = 0; i < arr.length; i++) {
            if(letterToNumber(arr[i]) == -1) {
                temp.add(0);
            }
            temp.add(letterToNumber(arr[i]));
        }
        temp.remove(1);
        if(name.length() < 1) {
            return null;
        }


        for(int i = 0; i < temp.size(); i++) {
            if(temp.get(i) == 0) {
                temp.remove(i);
            }
        }
        return name.substring(0,1)+temp.get(0)+temp.get(1)+temp.get(2);
    }

}