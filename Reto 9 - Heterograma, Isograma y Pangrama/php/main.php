

<?php 



function char_Counter($cadena){
    $charCounter = array();

    foreach(str_split($cadena) as $c){
        if(isset($charCounter[$c])){
            $charCounter[$c]++;
        }
        else $charCounter[$c]=1;
    }
    return $charCounter;
}

function isHeterogram($cadena){
   $charCounter = char_Counter($cadena);

    foreach($charCounter as $count){
        if($count>1) return false;
    }
    return true;
}

function isIsogram($cadena){
    $charCounter = char_Counter($cadena);
    foreach($charCounter as $count){
        if($count > 1) return false;
    }
    return true;
}

function isPangram($cadena){
    $ALPHABET = "abcdefghijklmnñopqrstuvwxyz";
    $charCounter = char_Counter($cadena);

    if(count($charCounter) == strlen($ALPHABET)) return true;
    else return false;
}

    $exampleText = "Benjamín pidió una bebida de kiwi y fresa. Noé, sin vergüenza, la más exquisita champaña del menú";

    echo "Is Heterogram: " . (isHeterogram($exampleText) ? 'true' : 'false') . "\n";
    echo "Is Isogram: " . (isIsogram($exampleText)  ? 'true' : 'false')  . "\n";
    echo "Is Pangram: " . (isPangram($exampleText)  ? 'true' : 'false');


?>