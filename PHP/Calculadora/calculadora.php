
<?php

//variavel que recebo o valor = $_GET["campo name do form"]
    $numero1 = $_GET["numero1"];
    $numero2 = $_GET["numero2"];
    $numero3 = $_GET["numero3"];

    echo "<br>" ;$numero1 . "<br>" . $numero2. "<br>". $numero3 ."<br>";

    // laço feito com for
    // for( $i = 1;$i <=10; $i++)
    // {
    //     echo "Tabuado do $i: <br>";
    //     for($j = 1; $j <=10; $j++)
    //     {
    //         $resultado = $i * $j;
    //         echo "$i x $j =$resultado <br>";
    //     }
    //     echo "<br><br>";
    // }

    // laço feito com while
    $i = 1;

    // while($i<=10){
    // echo $i . "<br>";
    // //incrmento
    // $i+=1   ;
    // }
    echo "<br><br>";
    do{
        echo $i . "<br>";
        $i+=1;
    }while($i<=10);

?>