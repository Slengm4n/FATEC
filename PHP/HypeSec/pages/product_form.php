<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <link rel="stylesheet" href="../assets/styles/index.css">
    <title>HYPESEC</title>
</head>
<body>
      <!--HEADER-->
      <nav class="Header">
        </label>
        <label class="logo">HYPESEC</label>
        <ul>
            <li><a href="./options.php">OPÇÕES</a></li>
            <li><a href="../index.php">HOME</a></li>
        </ul>
    </nav>
    <!--FIM HEADER-->
<div class="body-pages">
    <div class="container-pages">
      <section class="header-pages">
      <h2>NOVO PRODUTO</h2>
    </section>
    
    <form class=form action="../services/process_product.php" method="post">
      <div class="form-content">
        <label for="pd_name">Nome do produto:</label>
        <input type="text" name="pd_name" placeholder="Nome do produto." required>
      </div>

      <div class="form-content">
        <label for="pd_description">Descrição do produto:</label>
        <input type="textarea" name="pd_description" placeholder="Descrição do produto." required>
      </div>

      <div class="form-content">
        <label for="pd_code">Código da barras:</label>
        <input type="number" name="pd_code" placeholder="Código de barras do produto." required>
      </div>

      <div class="form-content">
        <label for="pd_category">Categoria:</label>
        <input type="text" name="pd_category" placeholder="Categoria do produto." required>
      </div>

      <div class="form-content">
        <label for="pd_quantity">Quantidade:</label>
        <input type="number" name="pd_quantity" placeholder="Quantidade disponível." required>
      </div>

      <div class="form-content">
        <label for="pd_tvalor">Valor:</label>
        <input type="valor" name="pd_valor" placeholder="Valor do produto." required>
      </div>
      <button type="submit">Cadastrar</button>

    </form>

  </div>
  <div>

<script src="../assets/scripts/alert.js"></script>
</body>
</html>