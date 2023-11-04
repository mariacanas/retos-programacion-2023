import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class reto1{

    public static Map getMap(){
        Map<String, String> map = new HashMap<>();
        String[][] pares = {
            {"A", "4"}, {"B", "I3"}, {"C", "["}, {"D", ")"}, {"E", "3"},
            {"F", "|="}, {"G", "&"}, {"H", "#"}, {"I", "1"}, {"J", ",_|"},
            {"K", ">|"}, {"L", "1"}, {"M", "/\\/\\/"}, {"N", "^/"}, {"O", "0"},
            {"P", "|*"}, {"Q", "(_,)"}, {"R", "I2"}, {"S", "5"}, {"T", "7"},
            {"U", "(_)"}, {"V", "\\/"}, {"W", "\\/\\/"}, {"X", "><"}, {"Y", "j"}, {"Z", "2"},
            {"1", "L"}, {"2", "R"}, {"3", "E"}, {"4", "A"}, {"5", "S"}, {"6", "b"},
            {"7", "T"}, {"8", "B"}, {"9", "g"}, {"0", "o"}
        };

        for (String[] par : pares) {
            map.put(par[0], par[1]);
        }

        return map;
    }
   

    public static void main(String[] args){
       Map diccionarioMap = getMap();

       Scanner userInput = new Scanner(System.in);
       System.out.println("Introduce una frase: ");
       String message = userInput.nextLine();
        String respuesta ="";
        
        for (char c : message.toCharArray()) {
            String palabra = (String) diccionarioMap.get(String.valueOf(c));
            respuesta += palabra;
        }
       System.out.println("La frase en Hacker es: " + respuesta);
    }
}



