


function esPrimo(numeroUser){
    for(let i = 1; i < numeroUser; i++){
        if(numeroUser / i == 0) return false;
    }
    return true;
}

function esFibonachi(numeroUser){
    let num1 = 0;
    let num2 = 1;

    while (num1 <= numeroUser) {
        if (num1 === numeroUser) {
            return true;
        }
        let temp = num1 + num2;
        num1 = num2;
        num2 = temp;
    }

    return false;
}

function esPar(numeroUser){
    return (numeroUser % 2 == 0);
}


function definicionNumero(numeroUser){

    let primo = esPrimo(numeroUser) ? "es primo , " :  "no es primo , ";
    let fibonachi = esFibonachi(numeroUser) ? "fibonacci, " : "no es fibonacci, ";
    let par = esPar(numeroUser) ? "y es par. " : "y no es par.";

    console.log(numeroUser + " " + primo + fibonachi + par);
}

definicionNumero(7);
definicionNumero(2);