

const caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_+=[]{}|;:,.<>?";



function generatorPassword(longitud){

    let password = "";

    for(let i = 0; i <  longitud; i++){
        let indice = Math.floor(Math.random() * caracteres.length);
        password += caracteres.charAt(indice);
    }

    return password;
}

const password = generatorPassword(8);
console.log("La contraseña generada es " + password);


