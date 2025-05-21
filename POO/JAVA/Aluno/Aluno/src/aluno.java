import java.util.Date;

public class aluno {
    private String cpf,nome,sexo;
    private int matricula;
    private Date dataNascimento;
    private endereco endereco;
    private contato contato;
    
    public aluno(String cpf, String nome, String sexo, int matricula, Date dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }
    

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getMatricula() {
        return matricula;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public boolean validaCPF(){
        return true;
    }
}
