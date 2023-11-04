

const scores = ["Love", "15","30","40"];

const secuenciaPartido =  ["P1","P1","P2","P2","P1","P2","P1","P1"];

let jugador1 = 0, jugador2 = 0;
let hayGanador = false;

secuenciaPartido.map(punto => {

    if(hayGanador) return;

    let jugador1Text = "", jugador2Text = "";

    if(punto === "P1" ? jugador1++ : jugador2++);

    switch(jugador1){
        case 0: jugador1Text = scores[0] + " - "; break;
        case 1: jugador1Text = scores[1] + " - "; break;
        case 2: jugador1Text = scores[2] + " - "; break;
        case 3:
            if(jugador1 == jugador2){
                jugador1Text = "Deuce";
            }
            else{
                jugador1Text = scores[3] + " - ";
            }
            break;
        default:
            if(jugador1 > jugador2){
                hayGanador = true;
                jugador1Text = "Ha ganado el jugador1"; break;
            } 
    }

    switch(jugador2){
        case 0: jugador2Text = scores[0]; break;
        case 1: jugador2Text = scores[1]; break;
        case 2: jugador2Text = scores[2]; break;
        case 3:
            if(jugador1 != jugador2){
                jugador2Text = "";
            }
            else{
                jugador2Text = "";
            }
            break;
        default:
            if(jugador2 > jugador1){
                hayGanador = true;
                jugador2Text = "Ha ganado el jugador2"; break;
            } 

    }

    console.log(jugador1Text + jugador2Text);
})
