import java.util.Scanner;

public class reto7 {
    

    private static void contadorRespuestas(){

        Scanner in = new Scanner(System.in);
        int respuestas[] = {0,0,0,0}; 
        String casas[] = {"Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"};

    String preguntas[] = {
        "Como te definirias?",
        "Cual es tu clase favorita?",
        "Donde pasarias mas tiempo?",
        "Cual es tu color favorito?",
        "Cual es tu mascota?"
    };

    String opciones[][] = {
        {"Valiente (Gryffindor)", "Leal (Hufflepuff)", "Sabio (Ravenclaw)", "Ambicioso (Slytherin)"},
        {"Vuelo (Gryffindor)", "Pociones (Ravenclaw)", "Defensa contra las artes oscuras", "Animales fantasticos (Hufflepuff)"},
        {"Invernadero (Hufflepuff)", "Biblioteca (Ravenclaw)", "Sala comun (Slytherin)", "Explorando (Gryffindor)"},
        {"Rojo (Gryffindor)", "Azul (Ravenclaw)", "Verde (Slytherin)", "Amarillo (Hufflepuff)"},
        {"Sapo (Ravenclaw)", "Lechuza (Gryffindor)", "Gato (Hufflepuff)", "Serpiente (Slytherin)"}
    };

    // Pregunta y respuestas
    for (int i = 0; i < 5; i++) {
        System.out.println("Pregunta " + (i + 1) + ": " + preguntas[i]);
        for (int j = 0; j < 4; j++) {
             System.out.println( j + 1 + ". " + opciones[i][j]);
        }

        int respuesta;
        System.out.print("Respuesta: ");
        respuesta = in.nextInt();

        // Validación de respuesta
        while (respuesta <= 0 || respuesta > 4) {
            System.out.print("Respuesta: ");
            respuesta = in.nextInt();
        }

        respuestas[respuesta - 1]++;
    }

    int maxVotos = respuestas[0];
    String casa = casas[0];

    for (int i = 1; i < 4; i++) {
        if (respuestas[i] > maxVotos) {
            maxVotos = respuestas[i];
            casa = casas[i];
        }
    }

    System.out.println("Resultado: " + casa + " (" + maxVotos + " votos)");

    }

    public static void main(String[] args){

        contadorRespuestas();


    }
}
