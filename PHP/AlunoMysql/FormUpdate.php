<?php
    
    include "database/db.php";

    $id = $_GET['id'];
    
    $querry_id = "SELECT * FROM alunos WHERE id = '$id'";

    $result= mysqli_query($conn, $querry_id); 

    $id_data = mysqli_fetch_assoc($result);

?>
<!DOCTYPE html>
<html lang="pt_br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/style.css">
    <title>Atulizar alunos</title>
</head>

<body>
    <div class="container_main">
        <h1>Formulario de atulizar alunos</h1>
        <form  method="post">
            <label for="name">Nome:</label>
            <input type="text" name="name" id="name" value="<?php echo $id_data['name']?>">
            <label for="email">Email: </label>
            <input type="email" name="email" id="email" value="<?php echo $id_data['email']?>">
            <label for="cell">Número de telefone: </label>
            <input type="number" name="cell" id="cell" value="<?php echo $id_data['cell']?>">
            <input class="btn_submit" type="submit" value="Atualizar">
        </form>
        <a href="index.php">Voltar</a>
    </div>
</body>

</html>