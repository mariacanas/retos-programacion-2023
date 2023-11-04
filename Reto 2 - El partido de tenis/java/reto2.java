


public class reto2{

    static String[] scores = {"Love", "15","30","40"};

    public static void finalMatch(String[] listaPuntos){
        int jugador1 = 0, jugador2 = 0;

        for(String p : listaPuntos){
            if(p.equals("P1")) jugador1++;
            else jugador2++;

            switch(jugador1){
                case 0: System.out.print(scores[0] + " - "); break;
                case 1: System.out.print(scores[1] + " - "); break;
                case 2: System.out.print(scores[2] + " - "); break;
                case 3:
                    if(jugador1 == jugador2){
                       System.out.println("Deuce");
                    }
                    else{
                        System.out.print(scores[3] + " - ");
                    }
                    break;
                default:
                    if(jugador1 > jugador2) System.out.println("Ha ganado el jugador1"); break;
            }
    
            switch(jugador2){
                case 0: System.out.println(scores[0]); break;
                case 1: System.out.println(scores[1]); break;
                case 2: System.out.println(scores[2]); break;
                case 3:
                    if(jugador1 != jugador2){
                        System.out.println("Deuce");
                    }
                    else{
                        System.out.println(scores[3]);
                    }
                    break;
                default:
                    if(jugador2 > jugador1) System.out.println("Ha ganado el jugador2"); break;

            }
        }
    }

    public static void main(String[] args){

        String[] listaPuntos = {"P1","P1","P2","P2","P1","P2","P1","P1"};

        finalMatch(listaPuntos);

    }
}

