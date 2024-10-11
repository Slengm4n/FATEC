<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Alunos</title>
    <link rel="stylesheet" href="css\form.css">
</head>
<body>
    <h3>Formulario de cadastro de alunos</h3>
    <div id="id">Meu ID</div>
    <div class="minhaClasse">Minha classe</div>
    <form action="ProcessAluno.php" method="post">
    <label for="name" >Nome:</label>
    <input type="text" name="name" id="name">
    <label for="email">Email: </label>
    <input type="text" name="email" id="email">
    <label for="cell">Número de telefone: </label>
    <input type="text" name="cell" id="cell">
    <input type="submit" value="cadastrar">
    </form>

</body>
</html>