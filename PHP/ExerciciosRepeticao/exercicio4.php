<?php

//Laço feito for
$N = 5;
for ($j =1; $j<= $N; $j++){
    $Quad = $j * $j;
    echo "Número: $j, Quadrado: $Quad<br>";
}

echo "<br>";

//Laço feito com while
$N = 10;

$j = 1;

while ($j <= $N) {
    $Quad = $j * $j;
    echo "Número: $j, Quadrado: $Quad<br>";
    $j++;
}


echo "<br>";

//Laço feito com do while
$N = 15;
$j = 1;

do {
    $Quad = $j * $j;
    echo "Número: $j, Quadrado: $Quad<br>";
    $j++;
} while ($j <= $N);