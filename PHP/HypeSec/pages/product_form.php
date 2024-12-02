<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="/services/process_product.php" method="post">
        <label id="pd_name">Nome do produto</label>
        <input type="text" name="pd_name">
        <br>
        <label id="pd_description">Descrição do produto</label>
        <input type="text" name="pd_description">
        <br>
        <label id="pd_code">Código do produto</label>
        <input type="number" name="pd_code">
        <br>
        <label id="pd_category">Categoria do produto</label>
        <input type="text" name="pd_category">
        <br>
        <label id="pd_quantity">Quantidade</label>
        <input type="number" name="pd_quantity">
        <br>
        <label id="pd_valor">Valor</label>
        <input type="number" name="pd_valor">
        <br>
        <input type="submit" value="enviar">
    </form>
</body>
</html>