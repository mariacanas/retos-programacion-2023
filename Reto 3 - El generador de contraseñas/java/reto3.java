import java.util.Random;
import java.util.Scanner;

public class reto3 {

    static String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_+=[]{}|;:,.<>?";
   

    public static String generatorPassword(int longitud){
        String password = "";
        Random random = new Random();
        
        for(int i = 0; i < longitud;i++){
            int indice = random.nextInt(caracteres.length());
            password += caracteres.charAt(indice);
        }


         return password;
    }

    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        int longitud;
        System.out.print("Longitud de la contraseña ");
        longitud = userInput.nextInt();

        while(longitud < 8 || longitud > 16){
            System.out.print("Longitud de la Contraseña ");
            longitud = userInput.nextInt();
        }

        String password = generatorPassword(longitud);
        System.out.println("La contraseña generada es: " + password);


    }
}