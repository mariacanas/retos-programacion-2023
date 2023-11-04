import java.util.Scanner;

public class reto4 {

    static boolean esPrimo(int numeroUser){
        for(int i = 1; i < numeroUser; i++){
            if(numeroUser / i == 0) return false;
        }
        return true;
    }

    static boolean esFibonachi(int numeroUser){
        int num1 = 0, num2 = 1;

        while (num1 <= numeroUser) {
            if (num1 == numeroUser) {
                return true;
            }
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }

        return false;
    }

    static boolean esPar(int numeroUser){
        return (numeroUser % 2 == 0);
    }


    static void definicionNumero(int numeroUser){

        System.out.print(numeroUser + " ");

        String primo = esPrimo(numeroUser) ? "es primo , " :  "no es primo , ";
        String fibonachi = esFibonachi(numeroUser) ? "fibonacci, " : "no es fibonacci, ";
        String par = esPar(numeroUser) ? "y es par. " : "y no es par.";

        System.out.println(primo + fibonachi + par);
    }

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int numeroUsuario;
        System.out.print("Numero ");
        numeroUsuario = userInput.nextInt();
        
        definicionNumero(numeroUsuario);

    }
}
