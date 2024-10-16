<?php
include 'database/db.php';

$q = "SELECT * FROM alunos";

$qResult = mysqli_query($conn, $q);
?>

<!DOCTYPE html>
<html lang="pt_br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/style.css">
    <title>Alunos cadastrados</title>
</head>

<body>
    <div class="container_main">
        <table>
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>E-mail</th>
                    <th>Celular</th>
                    <th>Atualizar</th>
                    <th>Excluir</th>
                </tr>
            </thead>
            <tbody>
                <?php while ($datas = mysqli_fetch_array($qResult)): ?>
                    <tr>
                        <td><?php echo $datas['name']; ?></td>
                        <td><?php echo $datas['email']; ?></td>
                        <td><?php echo $datas['cell']; ?></td>
                        <td><a href="FormUpdate.php?id=<?php echo $datas['id'];?>">Atualizar</a> </td>
                        <td><a href="delete.php?id=<?php echo $datas['id']; ?>">Excluir</a></td>
                    <?php endwhile; ?>
                    </tr>
            </tbody>
        </table>
        <a href="index.php">Voltar</a>
    </div>
</body>

</html>