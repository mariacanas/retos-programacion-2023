

#include <iostream>
#include <chrono>
#include <cmath>
using namespace std;

int pseudoRandom(){
    auto start = chrono::high_resolution_clock::now();
    auto end = chrono::high_resolution_clock::now();
    double duration = round(chrono::duration_cast<chrono::milliseconds>(end - start).count()/1000);

    if(duration >= 0  && duration <=100){
        return duration;
    }
    else return -1;

}

int main(){

    cout << pseudoRandom() << endl;
    return 0;
}
