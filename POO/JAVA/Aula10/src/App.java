public class App {
    public static void main(String[] args) {
        Professor p1 = new Professor("Joao", 215, "1312");
        Professor p2 = new Professor("Fernado", 252, "123123");
        Professor p3 = new Professor("Rafael", 432, "1313");
        Professor p4 = new Professor("Kaue", 134, "13123");
        Professor p5 = new Professor("Paulo", 596, "13213");
        
        Departamento colegiado = new Departamento("ADS", 1);

        colegiado.adiconarProfessor(p1);
        colegiado.adiconarProfessor(p2);
        colegiado.adiconarProfessor(p3);
        colegiado.adiconarProfessor(p4);
        colegiado.adiconarProfessor(p5);

        colegiado.listarProfessor();
    }
}
