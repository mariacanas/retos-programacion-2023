

#include <iostream>
#include <string>
using namespace std;


void contadorRespuestas(){

    int respuestas[4] = {0}; 
    string casas[4] = {"Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"};

    string preguntas[5] = {
        "Como te definirias?",
        "Cual es tu clase favorita?",
        "Donde pasarias mas tiempo?",
        "Cual es tu color favorito?",
        "Cual es tu mascota?"
    };

    string opciones[5][4] = {
        {"Valiente (Gryffindor)", "Leal (Hufflepuff)", "Sabio (Ravenclaw)", "Ambicioso (Slytherin)"},
        {"Vuelo (Gryffindor)", "Pociones (Ravenclaw)", "Defensa contra las artes oscuras", "Animales fantasticos (Hufflepuff)"},
        {"Invernadero (Hufflepuff)", "Biblioteca (Ravenclaw)", "Sala comun (Slytherin)", "Explorando (Gryffindor)"},
        {"Rojo (Gryffindor)", "Azul (Ravenclaw)", "Verde (Slytherin)", "Amarillo (Hufflepuff)"},
        {"Sapo (Ravenclaw)", "Lechuza (Gryffindor)", "Gato (Hufflepuff)", "Serpiente (Slytherin)"}
    };

    // Pregunta y respuestas
    for (int i = 0; i < 5; i++) {
        cout << "Pregunta " << (i + 1) << ": " << preguntas[i] << endl;
        for (int j = 0; j < 4; j++) {
            cout << j + 1 << ". " << opciones[i][j] << endl;
        }

        int respuesta;
        cout << "Respuesta: ";
        cin >> respuesta;

        // Validación de respuesta
        while (respuesta <= 0 || respuesta > 4) {
            cout << "Respuesta: ";
            cin >> respuesta;
        }

        respuestas[respuesta - 1]++;
    }

    int maxVotos = respuestas[0];
    string casa = casas[0];

    for (int i = 1; i < 4; i++) {
        if (respuestas[i] > maxVotos) {
            maxVotos = respuestas[i];
            casa = casas[i];
        }
    }

    cout << "Resultado: " << casa << " (" << maxVotos << " votos)" << endl;


}


int main(){

    contadorRespuestas();

    return 0;
}