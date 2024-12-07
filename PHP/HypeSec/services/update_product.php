<?php
include "../database/db.php";

$id = $_POST["id"];
$pd_name = $_POST["pd_name"];
$pd_description = $_POST["pd_description"];
$pd_code = $_POST["pd_code"];
$pd_category = $_POST["pd_category"];
$pd_quantity = $_POST["pd_quantity"];
$pd_valor = $_POST["pd_valor"];

$sql_update = "UPDATE products SET pd_name = '$pd_name', pd_description = '$pd_description', pd_code = '$pd_code', pd_category = '$pd_category', pd_quantity = '$pd_quantity', pd_valor ='$pd_valor'
WHERE products.id = '$id'";

if (mysqli_query($conn, $sql_update)) {
    header("Location: ../pages/stock.php?status=success");
} else {
    header("Location: ../pages/stock.php?status=error");
}