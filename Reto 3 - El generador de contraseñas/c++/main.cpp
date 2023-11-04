

#include <iostream>
#include <string>
#include <time.h>
using namespace std;



string generadorPassword(int longitud){

    string caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_+=[]{}|;:,.<>?";
    string password = "";

    int numCaracteres = caracteres.length();

   for (int i = 0; i < longitud; i++) {
        int indiceAleatorio = rand() % numCaracteres;
        password += caracteres[indiceAleatorio];
    }

    return password;
}

int main(){

    srand(time(0));

    int longitud;
    cout << " Longitud de la Contraseña ";
    cin >> longitud;

    while(longitud < 8 || longitud > 16){
        cout << "Longitud de la Contraseña ";
        cin >> longitud;
    }

    string password = generadorPassword(longitud);

    cout << "Contraseña generada " << password << endl;

    return 0;
}