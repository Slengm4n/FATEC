<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Alunos</title>
    <link rel="stylesheet" href="assets/css/style.css">
</head>

<body>
    <div class="container_main">
        <h1>Formulario de cadastro de alunos</h1>
        <form action="ProcessAluno.php" method="post">
            <label for="name">Nome:</label>
            <input type="text" name="name" id="name" placeholder="Nome do aluno">
            <label for="email">Email: </label>
            <input type="email" name="email" id="email" placeholder="Email">
            <label for="cell">Número de telefone: </label>
            <input type="number" name="cell" id="cell" placeholder="Telefone">
            <input class="btn_submit" type="submit" value="cadastrar">
        </form>
        <a href="index.php">Voltar</a>
    </div>
</body>

</html>