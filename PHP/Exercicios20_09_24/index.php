<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h3>Exercício 1</h3>
    <form action="media.php" method="GET">
        <label for="media">Média do aluno</label>
        <input type="number" name="media" id="media">
        <input type="submit" value="Calcular">
    </form>

    <h3>Exercício 2</h3>
    <form action="cargo.php" method="GET">
        <label for="cargo">ID de cargo</label>
        <input name="cargo" type="number" id="cargo">
        <input type="submit" value="Enviar">
    </form>

    <h3>Exercício 3</h3>
    <form action="eleitoral.php" method="GET">
        <label for="idade">Idade</label>
        <input name="idade" type="number" id="idade">
        <input type="submit" value="Enivar">
    </form>

    <h3>Exercício 4</h3>
    <form action="calculadora.php" method="GET">
        <label for="Num1">Número um</label>
        <input name="Num1" type="number" id="Num1">
        <br>
        <label for="Num2">Número dois</label>
        <input name="Num2" type="number" id="Num2">
        <select name="operacoes" id="operacoes">
            <option value=1>Soma</option>
            <option value=2>Multiplicação</option>
            <option value=3>Subtração</option>
            <option value=4>Divisão</option>
        </select>
        <input type="submit" value="Enviar">
    </form>

    <h3>Exercício 5</h3>
    <form action="hotel.php" method="GET">
        <label for="tipo_apto">Tipo de APTO:</label>
        <select name="tipo_apto" id="tipo_apto">
            <option value=1>A</option>
            <option value=2>B</option>
            <option value=3>C</option>
            <option value=4>D</option>
        </select>
        <br>
        <label for="nome_cliente">Nome do cliente:</label>
        <input name="nome_cliente" type="text" id="nome_cliente">
        <br>
        <label for="nome_cliente">N° de diárias:</label>
        <input name="qtd_diaria" type="number" id="qtd_diaria">
        <br>
        <label for="consumo_int">Consumo interno:</label>
        <input name="consumo_int" type="number" id="consumo_int">
        <br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>