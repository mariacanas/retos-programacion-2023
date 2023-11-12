const ALPHABET = "abcdefghijklmnñopqrstuvwxyz";

function char_Counter(cadena) {
    let charCounter = {};

    for (let c of cadena) {
        if (charCounter[c]) {
            charCounter[c]++;
        } else {
            charCounter[c] = 1;
        }
    }
    return charCounter;
}

function isHeterogram(cadena) {
    let charCounter = char_Counter(cadena);

    for (let count in charCounter) {
        if (charCounter.hasOwnProperty(count) && charCounter[count] > 1) {
            return false;
        }
    }
    return true;
}

function isIsogram(cadena) {
    let charCounter = char_Counter(cadena);
    
    for (let count of Object.values(charCounter)) {
        if (count > 1) {
            return false;
        }
    }
    return true;
}

function isPangram(cadena) {
    let charCounter = char_Counter(cadena);

    if (Object.keys(charCounter).length === ALPHABET.length) {
        return true;
    } else {
        return false;
    }
}

function main() {
    let exampleText = "Benjamín pidió una bebida de kiwi y fresa. Noé, sin vergüenza, la más exquisita champaña del menú";

    console.log("Is Heterogram: " + isHeterogram(exampleText));
    console.log("Is Isogram: " + isIsogram(exampleText));
    console.log("Is Pangram: " + isPangram(exampleText));
}

main();
