<?php

$cargo = $_GET['cargo'];

switch ($cargo){
    case 1:
        echo "Escrituario";
        break;
    case 2:
        echo "Secretaria";
        break;
    case 3:
        echo "Caixa";
        break;           
    case 4:
        echo "Gerente";
        break;
    case 5:
        echo "Diretor";
        break;
}

echo "<br><br>";
echo "<a href='index.php'>Voltar</a>";