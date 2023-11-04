

<?php 

class main{
        
    private static function esPrimo($numeroUser):bool{
        for($i = 1; $i < $numeroUser; $i++){
            if($numeroUser / $i == 0) return false;
        }
        return true;
    }

    private static function esFibonachi($numeroUser):bool{
        $num1 = 0; $num2 = 1;

        while ($num1 <= $numeroUser) {
            if ($num1 === $numeroUser) {
                return true;
            }
            $temp = $num1 + $num2;
            $num1 = $num2;
            $num2 = $temp;
        }

        return false;
    }

    private static function esPar($numeroUser):bool{
        return ($numeroUser % 2 == 0);
    }


    public static function definicionNumero($numeroUser):void{


        $primo = self::esPrimo($numeroUser) ? "es primo , " :  "no es primo , ";
        $fibonachi = self::esFibonachi($numeroUser) ? "fibonacci, " : "no es fibonacci, ";
        $par = self::esPar($numeroUser) ? "y es par. " : "y no es par.";

        echo $numeroUser . " " . $primo . $fibonachi . $par ."\n";
    }



    public function __construct(){ 
        self::definicionNumero(7);
        self::definicionNumero(2);
    }
}

$main = new main();

?>