
<?php

$idade = $_GET['idade'];

if ($idade <= 16){
    echo "Não eleitor";    
} 
else if($idade >=18 and $idade <=65){
        echo "Eleitor obrigatório";
}
else{
    echo "Eleitor facultativo";
}

echo "<br><br>";
echo "<a href='index.php'>Voltar</a>";