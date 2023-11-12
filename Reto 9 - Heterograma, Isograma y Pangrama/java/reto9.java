import java.util.HashMap;
import java.util.Map;

public class reto9 {
    
    private static final String ALPHABET = "abcdefghijklmnñopqrstuvwxyz";

    private static Map<Character, Integer> char_Counter(String cadena){
        Map<Character,Integer> charCounter = new HashMap<>();

        for(char c : cadena.toCharArray()){
            if(charCounter.containsKey(c)){
                charCounter.put(c,charCounter.get(c)+1);
            }
            else charCounter.put(c,1);
        }
        return charCounter;
    }

    public static boolean isHeterogram(String cadena){
        Map<Character,Integer> charCounter = char_Counter(cadena);

        for(int count: charCounter.values()){
            if(count>1) return false;
        }
        return true;
    }

    public static boolean isIsogram(String cadena){
        Map<Character,Integer> charCounter = char_Counter(cadena);
        for(int count: charCounter.values()){
            if(count > 1) return false;
        }
        return true;
    }

    public static boolean isPangram(String cadena){
        Map<Character,Integer> charCounter = char_Counter(cadena);

        if(charCounter.size() == ALPHABET.length()) return true;
        else return false;
    }
    
    public static void main(String[] args){
        String exampleText = "Benjamín pidió una bebida de kiwi y fresa. Noé, sin vergüenza, la más exquisita champaña del menú";

        System.out.println("Is Heterogram: " + isHeterogram(exampleText));
        System.out.println("Is Isogram: " + isIsogram(exampleText));
        System.out.println("Is Pangram: " + isPangram(exampleText));
    }
  
}
