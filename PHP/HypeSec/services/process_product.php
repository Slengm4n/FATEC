<?php

include "../database/db.php";
$pd_name = $_POST["pd_name"];
$pd_description = $_POST["pd_description"];
$pd_code = $_POST["pd_code"];
$pd_category = $_POST["pd_category"];
$pd_quantity = $_POST["pd_quantity"];
$pd_valor = $_POST["pd_valor"];

$query = "INSERT INTO products (pd_name, pd_description, pd_code, pd_category, pd_quantity, pd_valor) 
           VALUES ('$pd_name', '$pd_description', '$pd_code', '$pd_category', '$pd_quantity', '$pd_valor');";

if (mysqli_query($conn, $query)) {
    echo "Cadastro realizado com sucesso!!";
} else {
    echo "Erro ao cadastrar";
}