package core;

 

public class Anagram {

 

       public static boolean validate(String s, String t) {
             if (s.replaceAll("\\s", "").length() != t.replaceAll("\\s", "").length()) {

             return false;}
             

              int value = 0;
              for (int i = 0; i < s.replaceAll("\\s", "").length(); i++) {

                     value += (s.replaceAll("\\s", "").toLowerCase().charAt(i));
                     value -= (t.replaceAll("\\s", "").toLowerCase().charAt(i));

              }

              return value == 0;
       }

       
       public static void main(String[] args) {

    	    //System.out.println("Debit Card and Bad Credit is anagram? - " + Anagram.validate("Debit Card", "Bad Credit"));
    	    //System.out.println("Охренеть and Не хрена себе is anagram? - " + Anagram.validate("Охренеть", "Не хрена себе"));
    	       }

}
