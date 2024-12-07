<?php
include '../database/db.php';

$q = "SELECT * FROM products";
$qResult = mysqli_query($conn, $q);
?>

<!DOCTYPE html>
<html lang="pt_br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <link rel="stylesheet" href="../assets/styles/index.css">
    <title>Estoque</title>
</head>

<body>

    <nav class="Header">
        </label>
        <label class="logo">HYPESEC</label>
        <ul>
            <li><a href="./options.php">OPÇÕES</a></li>
            <li><a href="../index.php">HOME</a></li>
        </ul>
    </nav>

    <div class="header_stock">
        <h2>Registros Cadastrados</h2>
    </div>

    <div class="form">
        <div class="form-content">
            <table class="content-table">
                <thead>
                    <tr>
                        <th>Nome do produto</th>
                        <th>Descrição</th>
                        <th>Código</th>
                        <th>Categoria</th>
                        <th>Quantidade</th>
                        <th>Valor</th>
                        <th>Atualizar</th>
                        <th>Excluir</th>
                    </tr>
                </thead>
                <tbody>
                    <?php while ($datas = mysqli_fetch_array($qResult)): ?>
                        <td><?php echo $datas['pd_name']; ?></td>
                        <td><?php echo $datas['pd_description']; ?></td>
                        <td><?php echo $datas['pd_code']; ?></td>
                        <td><?php echo $datas['pd_category']; ?></td>
                        <td><?php echo $datas['pd_quantity']; ?></td>
                        <td><?php echo $datas['pd_valor']; ?></td>
                        <td>
                            <a href="../pages/FormUpdateProduct.php?id=<?php echo $datas['id']; ?>">
                                <img src="../assets/img/update.png" alt="Atualizar" title="Atualizar" style="width: 25px; height: 25px;">
                            </a>
                        <td>
                            <a href="../services/delete_product.php?id=<?php echo $datas['id']; ?>">
                                <img src="../assets/img/delete.png" alt="Deletar" title="Deletar" style="width: 25px; height: 25px;">
                            </a>
                            </tr>
                        <?php endwhile; ?>
                </tbody>
            </table>
        </div>
    </div>
    </div>
<script src="../assets/scripts/alert.js"></script>
</body>
</html>