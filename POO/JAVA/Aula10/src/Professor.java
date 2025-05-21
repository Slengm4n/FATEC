public class Professor {
 private String nome;
 private int rm;
 private String cpf;

 public Professor(String nome, int rm, String cpf) {
    this.nome = nome;
    this.rm = rm;
    this.cpf = cpf;
}

 public String getNome() {
    return nome;
 }
 public void setNome(String nome) {
    this.nome = nome;
 }

public void getCPF(String cpf){
   this.cpf = cpf;
 }

 public void setCPF(String cpf){
   this.cpf = cpf;
 }

 public int getRm() {
    return rm;
 }
 public void setRm(int rm) {
    this.rm = rm;
 }


 public void exibir(){
    System.out.println("Nome: " + nome);
    System.out.println("RM: " + rm);
    System.out.println("CPF: " + cpf);
 }
 
}
