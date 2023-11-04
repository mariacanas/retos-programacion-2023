
#include <iostream>
#include <vector>
#include <string>
using namespace std;

vector <string> scores = {"Love", "15","30","40"};

void finalMatch(vector <string> listaPuntos){
    int jugador1 = 0, jugador2 = 0;

    for(string p : listaPuntos){
        if(p == "P1") jugador1++;
        else jugador2++;

        switch(jugador1){
            case 0: cout << scores[0] << " - "; break;
            case 1: cout << scores[1] << " - "; break;
            case 2: cout << scores[2] << " - "; break;
            case 3:
                if(jugador1 == jugador2){
                    cout << "Deuce" << endl;
                }
                else{
                    cout << scores[3] << " - ";
                }
                break;
            default:
                if(jugador1 > jugador2) cout << "Ha ganado el jugador1 " << endl;
                break;
        }

         switch(jugador2){
            case 0: cout << scores[0] << endl; break;
            case 1: cout << scores[1] << endl; break;
            case 2: cout << scores[2] << endl; break;
            case 3:
                if(jugador1 != jugador2){
                    cout << "Deuce" << endl;
                }
                else{
                    cout << scores[3] << endl;
                }
                break;
            default:
                if(jugador2 > jugador1) cout << "Ha ganado el jugador2 " << endl;
                break;
        }
    }
}

int main(){
    vector <string> listaPuntos = {"P1","P1","P2","P2","P1","P2","P1","P1"};

    finalMatch(listaPuntos);

    system("pause");
    return 0;
}

