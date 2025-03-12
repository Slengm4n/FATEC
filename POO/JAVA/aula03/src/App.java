public class App {
    public static void main(String[] args) throws Exception {
        Vehicle Corsa = new Vehicle(); //Criando um objeto
        Vehicle Palio = new Vehicle();
        //Separar os objetos ou distinguir cada um

        System.out.println(Corsa.honking());
        System.out.println(Palio.honking());

        Corsa.acellerate(10);
        System.out.println(Corsa.velocity);

        Corsa.acellerate(15);
        System.out.println(Corsa.velocity);

        System.out.println(Palio.velocity);
    }
}

