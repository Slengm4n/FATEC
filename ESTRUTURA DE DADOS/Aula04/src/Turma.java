public class Turma {
    // 1 turma tem N alunos
    // Vetor ou Array

    private Aluno alunos[]; // Criando um vetor de Alunos,
    // que irá permitir 1->N
    private String semestre;
    private int capacidade; // Quantidade máxima
    private int tamanhoDaTurma; // Quantidade atual

    public Turma(int capacidade, String semestre) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade inválida");
        } else {
            // definido o tamanho do vetor, usando um objeto de base
            this.alunos = new Aluno[capacidade];
            this.semestre = semestre;
            this.tamanhoDaTurma = 0;

        }

    }

    public boolean insert(Aluno aluno) {
        if (tamanhoDaTurma == alunos.length) {

            return false; // Signifca que o Vetor está cheio
        } else {
            alunos[tamanhoDaTurma++] = aluno;
            return true; // Aluno inserido no vetor!
        }
    }
    
    public Aluno[] read(){
        Aluno [] copia = new Aluno[tamanhoDaTurma];
        for(int i = 0; i <tamanhoDaTurma; i++){
            copia[i] = alunos[i];
        }
        return copia;
    }

    public boolean remove(int ra){
        for (int i = 0; i< tamanhoDaTurma; i++){
            if(alunos[i].getRa()==ra){
                alunos[i] = alunos[tamanhoDaTurma-1];
                alunos[tamanhoDaTurma-1] = null;
                tamanhoDaTurma--;
                return true;
                
            }
        }
        return false;
    }

    public Aluno readOne(int ra){
        for(int i=0; i<tamanhoDaTurma; i++){
            if(alunos[i].getRa() == ra){
                return alunos[i];
            }
        }
        return null;
    }


    public int capacidadeTurma() {
        return alunos.length - tamanhoDaTurma;
    }

}
