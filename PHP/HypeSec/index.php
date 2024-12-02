<!DOCTYPE html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./assets/styles/index.css">
        <title>HypeSec</title>
    </head>
    <header>
        <nav class="header">
            <label class="logo">HYPESEC</label>
            <ul>/
                <li><a href="./pages/product_form.php">CADASTRAR PRODUTO</a></li>
                <li><a href="./pages/stock.php">ESTOQUE</a></li>
            </ul>
        </nav>
    </header>

    <div class="container-index">
        <div class="title-index">
            <h1>HYPESEC</h1>
        </div>
        <div class="text-index">
            <p>A Hypesec é uma loja de streetwear que oferece peças modernas e autênticas, inspiradas na cultura urbana e nas tendências do cenário hype.</p>
        </div>
        <div class="btn-index">
            <a href="./public/opcoes.php" class="btn-comecar">COMEÇAR</a>
        </div>
    </div>

    <article class="carrossel-article">
        <div class="carrossel-title">
            <h1>CONHEÇA NOSSO ESTABELECIMENTO</h1>
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
                        <img src="./assets/img/LS1.png"
                            alt="Img1">
                    </div>
                    <div class="slide">
                        <img src="./assets/img/LS2.png"
                            alt="Img2">
                    </div>
                    <div class="slide">
                        <img src="./assets/img/LS3.png"
                            alt="Img3">
                    </div>
                    <div class="slide">
                        <img src="./assets/img/LS4.png"
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

    <footer>
        <div class="footer-img">
            <img src="./assets/img/LSCUSTOM.png">
        </div>
        <div class="footer-text">
            <p>Copyright©2023 LSCUSTOM.LTDA</p>
        </div>

        <div class="social-media">
            <img src="./assets/img/facebook.png">
            <img src="./assets/img/instagram.png">
            <img src="./assets/img/whatsapp.png">
        </div>
    </footer>
    </div>
    </body>
    </html>