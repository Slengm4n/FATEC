<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Cadastro de Alunos</title>
  <link rel="stylesheet" href="../assets/styles/pages/product.css">
</head>
<header>
  <nav class="header">
    <label class="logo">HYPESEC</label>
    <ul>
      <li><a href="../index.php">HOME</a></li>
      <li><a href="./pages/stock.php">ESTOQUE</a></li>
    </ul>
  </nav>
</header>

<div>
<div class="body-pages">
  <div class="container-pages">
  <section class="header-pages">
      <h2>NOVO PRDUTO</h2>
  </section>
  <form action="../services/process_product.php" method="post">

    <div class="form-content">
      <label for="pd_name">Nome do produto</label>
      <input type="text" name="pd_name" id="pd_name">
    </div>

    <div class="form-content">
      <label for="pd_description">Descrição do produto</label>
      <input type="text" name="pd_description" id="pd_description">
    </div>

    <div class="form-content">
      <label for="pd_code">Código</label>
      <input type="number" name="pd_code" id="pd_code">
    </div>

    <div class="form-content">
      <label for="pd_category">Categoria</label>
      <input type="text" name="pd_category" id="pd_category">
    </div>

  <div class="form-content">
    <label for="pd_quantity">Quantidade</label>
    <input type="number" name="pd_quantity" id="pd_quantity">
  </div>

  <div class="form-content">
    <label for="pd_valor">Valor</label>
    <input type="number" name="pd_valor" id="pd_valor">
  </div>

   <button type="submit">Cadastrar</button>
  </form>
  <a href="index.php">Voltar</a>
</div>
</div>
</div>
</body>

</html>