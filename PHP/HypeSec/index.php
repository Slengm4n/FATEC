<!DOCTYPE html>
<html lang="pt_br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="./assets/styles/index.css">
    <title>HYPSEC</title>
</head>
<body>
      <!--HEADER-->
      <nav class="Header">
        <label class="logo">HYPESEC</label>
        <ul>
            <li><a href="./pages/options.php">OPÇÕES</a></li>
        </ul>
    </nav>
    <!--FIM HEADER-->
    <div class="container-index"></div>

     <!--CONFIGURANDO O CARROSSEL DE IMAGENS-->
     <article class="carrossel-article">
        <div class="carrossel-title">
            <h1>CONHEÇA NOSSOS PRODUTOS</h1>
        </div>
        <div class="carrossel">
            <div class="slider">
                <div class="slides">
                    <!--Radio Buttons-->
                    <input type="radio" name="radio-btn" id="radio1">
                    <input type="radio" name="radio-btn" id="radio2">
                    <input type="radio" name="radio-btn" id="radio3">
                    <input type="radio" name="radio-btn" id="radio4">
                    <!--Fim Radio Buttons-->
    
                    <!--Slide Images-->
                    <div class="slide first">
                        <img src="./assets/img/teste.jpg"
                            alt="Img1">
                    </div>
                    <div class="slide">
                        <img src="./assets/img/teste1.jpg"
                            alt="Img2">
                    </div>
                    <div class="slide">
                        <img src="./assets/img/teste2.jpg" 
                        alt="Img3">
                    </div>
                    <div class="slide">
                        <img src="./assets/img/teste3.jpg"
                            alt="Img4">
                    </div>
                    <!--Fim Slide Images-->
    
                    <!--Navigation Auto-->
                    <div class="navigation-auto">
                        <div class="auto-btn1"></div>
                        <div class="auto-btn2"></div>
                        <div class="auto-btn3"></div>
                        <div class="auto-btn4"></div>
                    </div>
    
                </div>
    
                <div class="manual-navigation">
                    <label for="radio1" class="manual-btn"></label>
                    <label for="radio2" class="manual-btn"></label>
                    <label for="radio3" class="manual-btn"></label>
                    <label for="radio4" class="manual-btn"></label>
                </div>
    
            </div>
        </div>
    </article>
    <!--FIM CONFIGURANDO O CARROSSEL DE IMAGENS-->
    

        <footer>
            <div class="footer-img">
            <img src="./assets/img/HS.png">
            </div>
            <div class="footer-text">
                <p>Copyright©2024 HYPESEC.LTDA</p>
                </div>

                <div class="social-media">
                    <img src="./assets/img/facebook.png">
                    <img src="./assets/img/instagram.png">
                    <img src="./assets/img/whatsapp.png">
                </div>
        </footer>
    </div>   
    <script src="./assets/scripts/slider.js"></script>
</body>
</html>