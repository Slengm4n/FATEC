<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <h3>calculadora</h3>
    <form action="calculadora.php" method="GET">
        <label for="numero1">Número 1:</label>        
        <input type="text" name="numero1" id="numero1" placeholder="número mt brabo">
        <br>
        <label for="numero2">Número 2:</label>
        <input type="number" name="numero2" id="numero2" placeholder="número mt brabo">
        <br>
        <h1>Selecione um número para realizar a tabuada:</h1>
        <label for="numero3">Número 3:</label>
        <select name="numero3" id="numero3">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
        </select>

        <input type="submit" value="Envia ai meu nobre">
        <br>
        <br>
        <br>    
        <button name="btn_all">Todas as tabuadas</button>
    </form>

</body>
</html>