import java.io.OutputStream;
import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        // LISTA DE EXERCICIOS 1

        // 1. Faça um programa que leia um número inteiro e o imprima.

        System.out.println("Digite um número inteiro: ");
        int numInt = scr.nextInt();
        System.out.println(numInt);

        // 2. Faça um programa que leia um número real e o imprima.
        System.out.println("Digite um número real:");
        double numDouble = scr.nextDouble();
        System.out.println(numDouble);

        // 3. Peça ao usuário para digitar três valores inteiros e imprima a soma deles.
        System.out.println("Digite três números inteiro e receba soma deles: ");
        int num1 = scr.nextInt();
        int num2 = scr.nextInt();
        int num3 = scr.nextInt();

        int soma = num1 + num2 + num3;

        System.out.println("O resultado é: " + soma);

        // 4. Leia um número real e imprima o resultado do quadrado desse número.
        System.out.println("Digite um número real para saber o quadrado dele: ");
        double numSquare = scr.nextDouble();
        double result = numSquare * numSquare;
        System.out.println(result);

        // 5. Leia um número real e imprima a quinta parte desse número.
        System.out.println("Digite um número real para receber a quinta parte dele: ");
        double numDivisionPart = scr.nextDouble();
        double resultNumDivisonPart = numDivisionPart / 5;
        System.out.println(resultNumDivisonPart);

        /**
         * 6. Leia uma temperatura em graus Celsius e apresente-a convertida em graus
         * Fahrenheit.
         * Fórmula: F = C × (9.0/5.0) + 32.0
         **/
        System.out.println("Digite uma temperatura em °C para converter em Fahrenheit: ");
        double celsiusTemperature = scr.nextDouble();
        double converterCelsiusTemperature = celsiusTemperature * (9.0 / 5.0) + 32.0;
        System.out.println("A temperatura convertida é: " + converterCelsiusTemperature);

        /**
         * Leia uma temperatura em graus Fahrenheit e apresente-a convertida em
         * graus Celsius.
         * Fórmula: C = 5.0 × (F − 32.0) / 9.0
         **/
        System.out.println("Digite um temperatura em Fahrenheit para converter para °C: ");
        double fahrenheitTemperature = scr.nextDouble();
        double converterFahrenheitTemperature = 5.0 * (fahrenheitTemperature - 32.0) / 9.0;
        System.out.println("A temperatura convertida é: " + converterFahrenheitTemperature);

        /**
         * 8. Leia uma temperatura em graus Kelvin e apresente-a convertida em graus
         * Celsius.
         * Fórmula: C = K − 273.15
         **/
        System.out.println("Digite uma temperatura em °K para conveter para °C: ");
        double kelvinTemperature = scr.nextDouble();
        double converterKelvinTemperature = kelvinTemperature - 273.15;
        System.out.println("A temperatura convertida é: " + converterKelvinTemperature);

        /**
         * 9. Leia uma temperatura em graus Celsius e apresente-a convertida em graus
         * Kelvin.
         * Fórmula: K = C + 273.15
         **/
        System.out.println("Digite uma temperatura em °C para converter em °K: ");
        double celsiusTemperature = scr.nextDouble();
        double converterCelsiusTemperature = celsiusTemperature + 273.15;
        System.out.println("A temperatura convertida é: " + converterCelsiusTemperature);

        /**
         * 10. Leia uma velocidade em km/h e apresente-a convertida em m/s.
         * Fórmula: M = K / 3.6
         **/
        System.out.println("Digite uma velocidade em KM/h para converter em M/s: ");
        double kmhVelocity = scr.nextDouble();
        double converterKhmVelocity = kmhVelocity / 3.6;
        System.out.println("A velocidade convertida é: " + converterKhmVelocity);

        /**
         * 11. Leia uma velocidade em m/s e apresente-a convertida em km/h.
         * Fórmula: K = M × 3.6
         **/
        System.out.println("Digite uma velocidade em M/s para converter em KM/h: ");
        double msVelocity = scr.nextDouble();
        double converterMsVelocity = msVelocity * 3.6;
        System.out.println("A velocidade convertida é: " + converterMsVelocity);

        /**
         * 12. Leia uma distância em milhas e apresente-a convertida em quilômetros.
         * Fórmula: K = 1.61 × M
         **/
        System.out.println("Digite uma distânica em Milhas para converter em KM: ");
        double mileDistance = scr.nextDouble();
        double converterMileDistance = 1.61 * mileDistance;
        System.out.println("A distância convertida é: " + converterMileDistance);

        /**
         * 13. Leia uma distância em quilômetros e apresente-a convertida em milhas.
         * Fórmula: M = K / 1.61
         **/
        System.out.println("Digite uma distância em KM para converter em Milhas: ");
        double kilometerDistance = scr.nextDouble();
        double converterKilometerDistance = kilometerDistance / 1.61;
        System.out.println("A distância convetida é: " + converterKilometerDistance);

        /**
         * 14. Leia um ângulo em graus e apresente-o convertido em radianos.
         * Fórmula: R = G × π / 180 (π = 3.14)
         **/
        System.out.println("Digite um ângulo em ° para conveter em radianos: ");
        double angle = scr.nextDouble();
        double converterAngle = angle * 3.14159265359 / 180;
        System.out.println("O ângulo convetido em radianos é: " + converterAngle);

        /**
         * 15. Leia um ângulo em radianos e apresente-o convertido em graus.
         * Fórmula: G = R × 180 / π (π = 3.14)
         **/
        System.out.println("Digite um valor em radianos para conveter em ângulo:: ");
        double radius = scr.nextDouble();
        double conveterRadius = radius * 180 / 3.14159265359;
        System.out.println("O valor radiano convertido em ângulo é: " + conveterRadius);

        /**
         * 16. Leia um valor de comprimento em polegadas e apresente-o convertido em
         * centímetros.
         * Fórmula: C = P × 2.54
         **/
        System.out.println("Digite um comprimento em pol para converter em cm: ");
        double pol = scr.nextDouble();
        double converterPol = pol * 2.54;
        System.out.println("O valor em pol para cm é: " + converterPol);

        /**
         * 17. Leia um valor de comprimento em centímetros e apresente-o convertido
         * em polegadas.
         * Fórmula: P = C / 2.54
         **/
        System.out.println("Digite um valor em cm para converter em pol: ");
        double cm = scr.nextDouble();
        double conveterCm = cm / 2.54;
        System.out.println("O valor em cm para pol é: " + conveterCm);

        /**
         * 18. Leia um volume em metros cúbicos (m3) e converta para litros.
         * Fórmula: L = 1000 × M
         **/
        System.out.println("Digite um valor em metros cúbicos (m3) para converter em litros: ");
        double metersCubic = scr.nextDouble();
        double converterMetersCubic = 1000 * metersCubic;
        System.out.println("O valor em metros cúbicos (m3) para litros é: " + converterMetersCubic);

        /**
         * 19. Leia um volume em litros e converta para metros cúbicos.
         * órmula: M = L / 1000
         **/
        System.out.println("Digite um valor em litros para converter em metros cúbicos (m3): ");
        double liters = scr.nextDouble();
        double converterLiters = liters / 1000;
        System.out.println("O valor em litros para metros cúbicos (m3) é: " + converterLiters);

        /**
         * 20. Leia uma massa em quilogramas e converta para libras.
         * Fórmula: L = K / 0.45
         */
        System.out.println("Digite um valor em kg para converter em libras: ");
        double kg = scr.nextDouble();
        double conventerKg = kg / 0.45;
        System.out.println("O valor em kg para libras é: " + conventerKg);

        /**
         * 21. Leia uma massa em libras e converta para quilogramas.
         * Fórmula: K = L × 0.45
         */
        System.out.println("Digite um valor em libras para converter em kg: ");
        double lbs = scr.nextDouble();
        double converterLbs = lbs * 0.45;
        System.out.println("O valor em libras para kg é: " + converterLbs);

        /**
         * 22. Leia um comprimento em jardas e converta para metros.
         * Fórmula: M = 0.91 × J
         */
        System.out.println("Digite um comprimento em jardas para converter em metros: ");
        double yards = scr.nextDouble();
        double converterYards = yards * 0.91;
        System.out.println("O valor em jardas para metros é: " + converterYards);

        /**
         * 23. Leia um comprimento em metros e converta para jardas.
         * Fórmula: J = M / 0.91
         */
        System.out.println("Digite um comprimento em metros para converter em jardas: ");
        double meters = scr.nextDouble();
        double converterMeters = meters / 0.91;
        System.out.println("O valor em metros para jardas é: " + converterMeters);

        /**
         * 24. Leia uma área em metros quadrados e converta para acres.
         * Fórmula: A = M × 0.000247
         */
        System.out.println("Digite uma área em metros quadrados para converter em acres: ");
        double squareMeters = scr.nextDouble();
        double converterSquareMeters = squareMeters * 0.000247;
        System.out.println("O valor em metros quadrados para acres é: " + converterSquareMeters);

        /**
         * 25. Leia uma área em acres e converta para metros quadrados.
         * Fórmula: M = A × 4048.58
         */
        System.out.println("Digite uma área em acres para converter em metros quadrados: ");
        double acres = scr.nextDouble();
        double converterAcres = acres * 4048.58;
        System.out.println("O valor em acres para metros quadrados é: " + converterAcres);

        /**
         * 26. Leia uma área em metros quadrados e converta para hectares.
         * Fórmula: H = M × 0.0001
         */
        System.out.println("Digite uma área em metros quadrados para converter em hectares: ");
        double squareMeter = scr.nextDouble();
        double converterSquareMeter = squareMeter * 0.0001;
        System.out.println("O valor em metros quadrados para hectares é: " + converterSquareMeter);

        /**
         * 27. Leia uma área em hectares e converta para metros quadrados.
         * Fórmula: M = H × 10000
         */
        System.out.println("Digite uma área em hectares para converter em metros quadrados: ");
        double hectares = scr.nextDouble();
        double converterHectares = hectares * 10000;
        System.out.println("O valor em hectares para metros quadrados é: " + converterHectares);

        /**
         * 28. Leia três valores e apresente a soma dos quadrados deles.
         */
        System.out.println("Digite três valores para receber a soma dos quadrados deles: ");
        double value1 = scr.nextDouble();
        double value2 = scr.nextDouble();
        double value3 = scr.nextDouble();
        double sumSquares = (value1 * value1) + (value2 * value2) + (value3 * value3);
        System.out.println("A soma dos quadrados é: " + sumSquares);

        /**
         * 29. Leia quatro notas, calcule a média aritmética e imprima o resultado.
         */
        System.out.println("Digite quatro notas para receber a média aritmética: ");
        double grade1 = scr.nextDouble();
        double grade2 = scr.nextDouble();
        double grade3 = scr.nextDouble();
        double grade4 = scr.nextDouble();
        double average = (grade1 + grade2 + grade3 + grade4) / 4;
        System.out.println("A média aritmética é: " + average);

        /**
         * 30. Leia um valor em reais e a cotação do dólar. Imprima o valor em dólares.
         */
        System.out.println("Digite um valor em R$ para converter em US$: ");
        double reais = scr.nextDouble();
        System.out.println("Digite a cotação do dólar: ");
        double dollarQuotation = scr.nextDouble();
        double converterReais = reais / dollarQuotation;
        System.out.println("O valor em R$ para US$ é: " + converterReais);
    }
}