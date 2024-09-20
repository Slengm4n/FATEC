<?php

$media = $_GET['media'];

if ($media >=0 and $media <=10){
    if ($media >=5){
        echo "Aprovado";
    }
    else{
        if ($media < 3){
            echo "Reprovado";
        }
        else{
            echo "Exame";
        }
    }
}
else{
    echo "Média inválida";
}    
    echo "<br><br>";
    echo "<a href='index.php'>Voltar</a>";

    