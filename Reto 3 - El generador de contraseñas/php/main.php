
<?php 

$caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_+=[]{}|;:,.<>?";


function  generatePassword($longitud){
    global $caracteres;
    $password = "";

    for ($i = 0; $i < $longitud; $i++) {
        $password .= $caracteres[rand(0, strlen($caracteres) - 1)];
    }

    return $password;
}


echo "Escribe la longitud ";
$userInput = (int)readLine();

while ($userInput < 8 || $userInput > 16) {
    echo "Escribe la longitud "; 
    $userInput = (int)readLine();
}
echo "La frase en hacker es: " .generatePassword($userInput);

?>