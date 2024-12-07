<?php
    
    include "../database/db.php";

    $id = $_GET['id'];
    
    $querry_id = "SELECT * FROM products WHERE id = '$id'";

    $result= mysqli_query($conn, $querry_id); 

    $id_data = mysqli_fetch_assoc($result);

?>

<!DOCTYPE html>
<html lang="pt_br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <link rel="stylesheet" href="../assets/styles/index.css">
    <title>Atulizar produto</title>
</head>
<!-- HEADER -->
<nav class="Header">
        <label class="logo">HYPESEC</label>
        <ul>
            <li><a href="../index.php">Home</a></li>
        </ul>
    </nav>
    <!-- FIM HEADER -->
<body>
<div class="body-pages">
    <div class="container-pages">
      <section class="header-pages">
      <h2>ATUALIZAR PRODUTO</h2>
    </section>
    
    <form class=form action="../services/update_product.php" method="post">
    <input type="hidden" name="id" value="<?php echo $id_data['id']; ?>">
      <div class="form-content">
        <label for="pd_name">Nome:</label>
        <input type="text" name="pd_name" value= "<?php echo $id_data['pd_name'] ?>">
      </div>

      <div class="form-content">
        <label for="pd_description">Descrição do produto:</label>
        <input type="textarea" name="pd_description" value= "<?php echo $id_data['pd_description'] ?>">
      </div>

      <div class="form-content">
        <label for="pd_code">Código da barras:</label>
        <input type="number" name="pd_code" value= "<?php echo $id_data['pd_code'] ?>">
      </div>

      <div class="form-content">
        <label for="pd_category">Categoria:</label>
        <input type="text" name="pd_category" value= "<?php echo $id_data['pd_category'] ?>">
      </div>

      <div class="form-content">
        <label for="pd_quantity">Quantidade:</label>
        <input type="number" name="pd_quantity" value= "<?php echo $id_data['pd_quantity'] ?>">
      </div>

      <div class="form-content">
        <label for="pd_tvalor">Valor:</label>
        <input type="number" name="pd_valor" value= "<?php echo $id_data['pd_valor'] ?>">
      </div>
      <button type="submit">Cadastrar</button>

    </form>
  </div>
  <div>
<script>

  document.addEventListener('DOMContentLoaded', () => {
    const params = new URLSearchParams(window.location.search);
    const status = params.get('status');

    if (status === 'success') {
        Swal.fire({
            icon: 'success',
            title: 'Sucesso!',
            text: 'Produto atualizado com sucesso.',
            confirmButtonText: 'OK',
        });
    } else if (status === 'error') {
        Swal.fire({
            icon: 'error',
            title: 'Erro!',
            text: 'Ocorreu um erro ao cadastrar o produto. Tente novamente.',
            confirmButtonText: 'OK',
        });
    }
});
</script>
</body>
</html>