
<?php 

function pseudoRandom() {
    $currentTime = microtime();
    list($usec, $sec) = explode(" ", $currentTime);
    $pseudoRandomNumber = (($sec * 1000000 + $usec) % 101); // Genera un número entre 0 y 100
    return $pseudoRandomNumber;
}

echo pseudoRandom();


?>