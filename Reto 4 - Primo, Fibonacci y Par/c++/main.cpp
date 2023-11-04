

#include <iostream>
#include <string>
using namespace std;


bool esPrimo(int numeroUser){
    for(int i = 1; i < numeroUser; i++){
        if(numeroUser / i == 0) return false;
    }
    return true;
}

bool esFibonachi(int numeroUser){
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

bool esPar(int numeroUser){
    return (numeroUser % 2 == 0);
}


void definicionNumero(int numeroUser){

    cout << numeroUser << " ";

    string primo = esPrimo(numeroUser) ? "es primo , " :  "no es primo , ";
    string fibonachi = esFibonachi(numeroUser) ? "fibonacci, " : "no es fibonacci, ";
    string par = esPar(numeroUser) ? "y es par. " : "y no es par.";

    cout << primo << fibonachi << par << endl;
}




int main(){

    int numeroUser;
    cout << "Introduce el numero ";
    cin >> numeroUser;

    definicionNumero(numeroUser);

    return 0;
}