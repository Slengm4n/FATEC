public class Corpo_Humano {
    //Definição dos atributos
    //Posso definir todas juntas como float
    // ou cada uma com um tipo (float,int,str,etc)
    private float peso;
    private float altura; 
    private float imc;

    //Construtor é a forma de atribuir os valores para todos os atributos na criação do objeto
    public Corpo_Humano(float peso, float altura){
        //This puxa fora do escopo, fora da classe
        this.peso = peso;
        this.altura = altura;
        this.imc = peso/altura;
    }
    //setters: atribuir valores aos atributos
    //Void: não possui retorno
    public void setPeso(float peso){
        this.peso = peso;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }


    //getter: recuperar valores de atributos
    //return se torna obrigatório a métodos que possui um tipo de dado
    public float getPeso(){
        return this.peso;
    }

    public float getAltura(){
        return this.altura;
    }

    public float getImc(){
        return this.imc;

    }
}