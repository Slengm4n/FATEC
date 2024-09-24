<?php

$nome_cliente = $_GET['nome_cliente'];
$qtd_diaria = $_GET['qtd_diaria'];
$consumo_int = $_GET['consumo_int'];

$tipo_apto = $_GET['tipo_apto'];

switch ($tipo_apto){
    case 1 : 
        $valor_unitario = 150;
        $ValorTotal = $valor_unitario * $qtd_diaria;
        $Subtotal = $ValorTotal + $consumo_int;
        $TaxaServico = $Subtotal * 10/100;
        $TotalGeral = $Subtotal + $TaxaServico;

        echo "Nome do cliente: ",$nome_cliente;
        echo "<br>";
        echo "Quantidade de diárias: R$ ",$qtd_diaria;
        echo "<br>";
        echo "Consumo interno: R$ ", $consumo_int;
        echo "<br>";
        echo "Valor unitário do APTO: R$ ",$valor_unitario;
        echo "<br>";
        echo "Valor total das diárias: R$ ",$ValorTotal;
        echo "<br>";
        echo "Subtotal (diárias + consumo interno): R$ ",$Subtotal;
        echo "<br>";
        echo "Taxa de serviço: R$ ",$TaxaServico;
        echo "<br>";
        echo "Total a ser pago: R$ ",$TotalGeral;
        break;

    case 2 :
        $valor_unitario = 100;
        $ValorTotal = $valor_unitario * $qtd_diaria;
        $Subtotal = $ValorTotal + $consumo_int;
        $TaxaServico = $Subtotal * 10/100;
        $TotalGeral = $Subtotal + $TaxaServico;

        echo "Nome do cliente: ",$nome_cliente;
        echo "<br>";
        echo "Quantidade de diárias: R$ ",$qtd_diaria;
        echo "<br>";
        echo "Consumo interno: R$ ", $consumo_int;
        echo "<br>";
        echo "Valor unitário do APTO: R$ ",$valor_unitario;
        echo "<br>";
        echo "Valor total das diárias: R$ ",$ValorTotal;
        echo "<br>";
        echo "Subtotal (diárias + consumo interno): R$ ",$Subtotal;
        echo "<br>";
        echo "Taxa de serviço: R$ ",$TaxaServico;
        echo "<br>";
        echo "Total a ser pago: R$ ",$TotalGeral;
        break;

    case 3 :
        $valor_unitario = 75;
        $ValorTotal = $valor_unitario * $qtd_diaria;
        $Subtotal = $ValorTotal + $consumo_int;
        $TaxaServico = $Subtotal * 10/100;
        $TotalGeral = $Subtotal + $TaxaServico;

        echo "Nome do cliente: ",$nome_cliente;
        echo "<br>";
        echo "Quantidade de diárias: R$ ",$qtd_diaria;
        echo "<br>";
        echo "Consumo interno: R$ ", $consumo_int;
        echo "<br>";
        echo "Valor unitário do APTO: R$ ",$valor_unitario;
        echo "<br>";
        echo "Valor total das diárias: R$ ",$ValorTotal;
        echo "<br>";
        echo "Subtotal (diárias + consumo interno): R$ ",$Subtotal;
        echo "<br>";
        echo "Taxa de serviço: R$ ",$TaxaServico;
        echo "<br>";
        echo "Total a ser pago: R$ ",$TotalGeral;
        break;

    case 4:
        $valor_unitario = 50;
        $ValorTotal = $valor_unitario * $qtd_diaria;
        $Subtotal = $ValorTotal + $consumo_int;
        $TaxaServico = $Subtotal * 10/100;
        $TotalGeral = $Subtotal + $TaxaServico;

        echo "Nome do cliente: ",$nome_cliente;
        echo "<br>";
        echo "Quantidade de diárias: R$ ",$qtd_diaria;
        echo "<br>";
        echo "Consumo interno: R$ ", $consumo_int;
        echo "<br>";
        echo "Valor unitário do APTO: R$ ",$valor_unitario;
        echo "<br>";
        echo "Valor total das diárias: R$ ",$ValorTotal;
        echo "<br>";
        echo "Subtotal (diárias + consumo interno): R$ ",$Subtotal;
        echo "<br>";
        echo "Taxa de serviço: R$ ",$TaxaServico;
        echo "<br>";
        echo "Total a ser pago: R$ ",$TotalGeral;
        break;

}
    