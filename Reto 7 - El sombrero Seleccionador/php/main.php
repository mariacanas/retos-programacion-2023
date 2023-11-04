


<?php 


class main {
    

    private static function contadorRespuestas(){

        
        $respuestas = [0,0,0,0]; 
        $casas = ["Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"];

        $preguntas = [
            "Como te definirias?",
            "Cual es tu clase favorita?",
            "Donde pasarias mas tiempo?",
            "Cual es tu color favorito?",
            "Cual es tu mascota?"
        ];

        $opciones = [
            ["Valiente (Gryffindor)", "Leal (Hufflepuff)", "Sabio (Ravenclaw)", "Ambicioso (Slytherin)"],
            ["Vuelo (Gryffindor)", "Pociones (Ravenclaw)", "Defensa contra las artes oscuras", "Animales fantasticos (Hufflepuff)"],
            ["Invernadero (Hufflepuff)", "Biblioteca (Ravenclaw)", "Sala comun (Slytherin)", "Explorando (Gryffindor)"],
            ["Rojo (Gryffindor)", "Azul (Ravenclaw)", "Verde (Slytherin)", "Amarillo (Hufflepuff)"],
            ["Sapo (Ravenclaw)", "Lechuza (Gryffindor)", "Gato (Hufflepuff)", "Serpiente (Slytherin)"]
        ];

        // Pregunta y respuestas
        for ($i = 0; $i < 5; $i++) {
            echo "Pregunta " . ($i + 1) . ": " . $preguntas[$i];
            for ($j = 0; $j < 4; $j++) {
                echo  $j + 1 . ". " . $opciones[$i][$j];
            }

            $respuesta = "";
            echo "Respuesta: ";
            $respuesta = readline();

            // Validación de respuesta
            while ($respuesta <= 0 || $respuesta > 4) {
                echo "Respuesta: ";
                $respuesta = readline();
            }

            $respuestas[$respuesta - 1]++;
        }

        $maxVotos = $respuestas[0];
        $casa = $casas[0];

        for ($i = 1; $i < 4; $i++) {
            if ($respuestas[$i] > $maxVotos) {
                $maxVotos = $respuestas[$i];
                $casa = $casas[$i];
            }
        }

        echo "Resultado: " . $casa . " (" . $maxVotos . " votos)";

    }

    public function __construct(){

        self::contadorRespuestas();

    }
}

$programa = new main();

?>