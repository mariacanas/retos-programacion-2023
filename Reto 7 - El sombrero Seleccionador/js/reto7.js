
const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

async function  contadorRespuestas(){

   
    let respuestas = [0,0,0,0]; 
    let casas = ["Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"];

    let preguntas = [
        "Como te definirias?",
        "Cual es tu clase favorita?",
        "Donde pasarias mas tiempo?",
        "Cual es tu color favorito?",
        "Cual es tu mascota?"
    ];

    let opciones = [
        ["Valiente (Gryffindor)", "Leal (Hufflepuff)", "Sabio (Ravenclaw)", "Ambicioso (Slytherin)"],
        ["Vuelo (Gryffindor)", "Pociones (Ravenclaw)", "Defensa contra las artes oscuras", "Animales fantasticos (Hufflepuff)"],
        ["Invernadero (Hufflepuff)", "Biblioteca (Ravenclaw)", "Sala comun (Slytherin)", "Explorando (Gryffindor)"],
        ["Rojo (Gryffindor)", "Azul (Ravenclaw)", "Verde (Slytherin)", "Amarillo (Hufflepuff)"],
        ["Sapo (Ravenclaw)", "Lechuza (Gryffindor)", "Gato (Hufflepuff)", "Serpiente (Slytherin)"]
    ];

// Pregunta y respuestas
    for (let i = 0; i < 5; i++) {
        console.log("Pregunta " + (i + 1) + ": " + preguntas[i]);
        for (let j = 0; j < 4; j++) {
            console.log( j + 1 + ". " + opciones[i][j]);
        }

        let respuesta = parseInt(await askQuestion("Respuesta: "));

        // Validación de respuesta
        while (respuesta <= 0 || respuesta > 4) {
            respuesta = parseInt(await askQuestion("Respuesta: "));
        }

        respuestas[respuesta - 1]++;
    }

    let maxVotos = respuestas[0];
    let casa = casas[0];

    for (let i = 1; i < 4; i++) {
        if (respuestas[i] > maxVotos) {
            maxVotos = respuestas[i];
            casa = casas[i];
        }
    }

    console.log("Resultado: " + casa + " (" + maxVotos + " votos)");

}

function askQuestion(question) {
    return new Promise((resolve) => {
      rl.question(question, (answer) => {
        resolve(answer);
      });
    });
}


contadorRespuestas();

