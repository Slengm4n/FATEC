public class Aluno {
    
    private int ra;
    private String nome;

    public Aluno (int ra, String nome){
        this.ra = ra;
        this.nome = nome;
    }

    public void setRa(int ra){
        this.ra = ra;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getRa(){
        return this.ra;
    }

    public String getNome(){
        return this.nome;
    }

}
