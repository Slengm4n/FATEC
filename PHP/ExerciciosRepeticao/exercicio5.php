<?php

//Laço feito com for
$N = 10;
for ($j =1; $j<= $N; $j++){
    $Metades = $j / 2;
    echo "Número: $j, Metade: $Metade<br>";
}

echo "<br>";

//Laço feito com while
$N = 10;

$j = 1;

while ($j <= $N) {
    $Metade = $j / 2;
    echo "Número: $j, Metade: $Metade<br>";
    $j++;
}


echo "<br>";

//Laço feito com do while
$N = 10;
$j = 1;

do {
    $Metade = $j / 2;
    echo "Número: $j, Metade: $Metade<br>";
    $j++;
} while ($j <= $N);