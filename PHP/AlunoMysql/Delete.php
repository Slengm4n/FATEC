<?php

include "database/db.php";

$id = $_GET['id'];

$querry_id = "DELETE FROM alunos WHERE id = '$id' ";

if(mysqli_query($conn, $querry_id))
{
    header("Location: ViewAluno.php");
}else{
    echo "Erro ao excluir cadastro :(";
}
