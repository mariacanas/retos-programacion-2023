
#include <iostream>
#include <map>
#include <stdio.h>
using namespace std;



map<char, string> diccionarioMap = {
    {'A', "4"}, {'B', "I3"}, {'C', "["}, {'D', ")"}, {'E', "3"}, {'F', "|="}, {'G', "&"}, {'H', "#"}, {'I', "1"},
    {'J', ",_|"}, {'K', ">|"}, {'L', "1"}, {'M', "|\\/|"}, {'N', "^/"}, {'O', "0"}, {'P', "|*"}, {'Q', "(_,)"},
    {'R', "I2"}, {'S', "5"}, {'T', "7"}, {'U', "(_)"}, {'V', "\\/"}, {'W', "\\/\\/"}, {'X', "><"}, {'Y', "j"}, {'Z', "2"},
    {'1', "L"}, {'2', "R"}, {'3', "E"}, {'4', "A"}, {'5', "S"}, {'6', "b"}, {'7', "T"}, {'8', "B"}, {'9', "g"}, {'0', "o"}
};

string convertoHacker(string palabra){
    string palabraHacker = "";

    for(char c: palabra){
        char upperCase = toupper(c);
        palabraHacker += diccionarioMap[upperCase];
    }


    return palabraHacker;
}

int main(){

    string linea;
    cout << "Frase a pasar a hacker: ";
    getline(cin,linea);

    cout << "Frase convertida: " << convertoHacker(linea);

    return 0;
}

