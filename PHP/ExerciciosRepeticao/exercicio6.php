<?php

//Laço de repetição feito com for
$N = 50;

for($i=2; $i<=$N; $i+=2){
    echo "<br>",$i;
}

echo "<br>";

//Laço de repetição feito com while
$N = 50;
$i = 2;

while ($i <= $N){
    echo "<br>", $i;
    $i+=2;
}

echo "<br>";    

//Laço de repetição feito com do while

$N = 50;
$i = 2;

do{
    echo "<br>", $i;
    $i += 2;
}while ($i <= $N);