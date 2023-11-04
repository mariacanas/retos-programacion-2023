
<?php

function fizzBuzz(){
    for($i = 0; $i <= 100; $i++){
        $output = ($i%3==0 ? "Fizz" : "") . ($i%5==0 ? "Buzz" : "");
        echo (empty($output) ? $i : $output);
    }
}

fizzBuzz();

?>