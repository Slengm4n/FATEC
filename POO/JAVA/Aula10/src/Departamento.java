import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nomeDepartamento;
    private int id;
    private List<Professor> professores;

    public Departamento(){
        this.professores = new ArrayList<>();//Iniciar a lista
    }
    
    public Departamento(String nomeDepartamento, int id) {
        this.nomeDepartamento = nomeDepartamento;
        this.id = id;
        this.professores = new ArrayList<>();//Iniciar a lista
    }

    //Criar o métodos da Lista (create,delete,read)
    public void adiconarProfessor(Professor prof){

        professores.add(prof);

    }

    public void removerProfessor(Professor prof){
        professores.remove(prof);
    }

    public void listarProfessor(){
        for(Professor professor : professores){
            professor.exibir();
        }
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }
    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    
}
