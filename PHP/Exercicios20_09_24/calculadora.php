<?php

$Num1 = $_GET['Num1'];
$Num2 = $_GET['Num2'];

$operacoes = $_GET['operacoes'];

switch ($operacoes) {
    case 1:
        $soma = $Num1 + $Num2;
        echo $soma;
        break;
    
    case 2:
        $mult = $Num1 * $Num2;
        echo $mult;
        break;
    
    case 3:
        $sub = $Num2 - $Num1;
        echo $sub;
        break;
    
    case 4:
        $div = $Num1 / $Num2;
        echo $div;
        break;
}

echo "<br><br>";
echo "<a href='index.php'>Voltar</a>";