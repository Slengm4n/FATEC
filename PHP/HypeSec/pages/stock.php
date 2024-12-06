<?php
include '../database/db.php';

$q = "SELECT * FROM products";

$qResult = mysqli_query($conn, $q);
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../assets/styles/pages/stock.css">
    <title>Estoque</title>
</head>

<body>
    <header>
        <nav class="navigation">
            <a href="#" class="logo"><span>H</span><span>Y</span><span>P</span><span>E</span><span>S</span><span>E</span><span>C</span></a>
            <ul class="nav-menu">
                <li class="nav-item"><a href="pages/product_form.php">Cadastrar produto</a></li>
                <li class="nav-item"><a href="pages/stock.php">Estoque</a></li>
            </ul>
        </nav>
    </header>
    <table class="content-table">
        <thead>
            <tr>
                <th>Nome do produto</th>
                <th>Descrição</th>
                <th>Código</th>
                <th>Categoria</th>
                <th>Quantidade</th>
                <th>valor</th>
                <th>Atualizar</th>
                <th>Excluir</th>
            </tr>
        </thead>
        <tbody>
            <?php while ($datas = mysqli_fetch_array($qResult)): ?>
                <tr>
                    <td><?php echo $datas['pd_name']; ?></td>
                    <td><?php echo $datas['pd_description']; ?></td>
                    <td><?php echo $datas['pd_code']; ?></td>
                    <td><?php echo $datas['pd_category']; ?></td>
                    <td><?php echo $datas['pd_quantity']; ?></td>
                    <td><?php echo $datas['pd_valor']; ?></td>
                    <td><a href="FormUpdate.php?id=<?php echo $datas['id']; ?>">Atualizar</a> </td>
                    <td><a href="../services/delete_product.php?id=<?php echo $datas['id']; ?>">Excluir</a></td>
                <?php endwhile; ?>
                </tr>
        </tbody>
    </table>
    <a href="index.php">Voltar</a>
</body>

</html>