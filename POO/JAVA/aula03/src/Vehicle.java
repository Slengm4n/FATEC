public class Vehicle {
   public String Model;
   String Color;
   public int velocity = 0;
   protected String Chevrolet;
   private Float tankCapacity;
   private Float engineHP;

   public String honking(){
    String honk = "bi bi";
    return honk;
   }

   public void acellerate(int valor){
    velocity = velocity + valor;
   }
}
