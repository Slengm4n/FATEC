
<?php
include "db.php";
$name = $_POST["name"];
$email = $_POST["email"];
$cell = $_POST["cell"];

$querry = "INSERT INTO alunos (name, email, cell) 
           VALUES ('$name', '$email', '$cell');";

if (mysqli_query($conn, $querry)) 
{
    echo "Cadastro realizado com sucesso!!";
}
else 
{
    echo "Erro ao cadastrar";
}