public class App {

    public static void main(String[] args) throws Exception{
        //instanciar a calsse ou criar objeto
        Corpo_Humano obj = new Corpo_Humano(0, 0);
        obj.setPeso(10);
        obj.setAltura(20);
        //obj.imc = 10;
            //Qual ocorrência?
            //R: Deu erro no código
            //Qual a conclusão sobre o que aconteceu?
            //R: O atributo está sendo acessado de forma direta, mas está como private
        System.out.println(obj.getImc());
    }
}