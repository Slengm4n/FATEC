import java.util.Scanner;

import javax.swing.plaf.synth.SynthIcon;

public class App {
    public static void main(String[] args) throws Exception {
        Turma turma = new Turma(3, "3SEM_ADS");
        Scanner sc = new Scanner(System.in);
        int option = 0;

        do{
            try{
                System.out.println("\n [1]Inserir \n [2] Buscar \n [3] Remover \n [4] Listar \n [0] Sair");
                System.out.println("Opção:");
                option = Integer.parseInt(sc.nextLine());

                switch (option) {
                    case 1:
                        System.out.print("RA: ");
                        int ra = Integer.parseInt(sc.nextLine());
                        System.out.print("Nome:");
                        String nome = sc.nextLine();

                        boolean status = turma.insert(new Aluno(ra, nome));

                        System.out.println(status ? "Inserido com sucesso!" : "Falha ao inserir :(");

                        break;
                    
                    case 2:
                        System.out.print("RA: ");
                        ra = Integer.parseInt(sc.nextLine());
                        Aluno a = turma.readOne(ra);
                        System.out.println(a!=null ? a : "Não encontrado!");
                    break;

                    case 3:
                        System.out.print("RA:");
                        ra = Integer.parseInt(sc.nextLine());
                        System.out.println(turma.remove(ra)?
                        "Removido" : "Não localizado");
                        break;
                    
                    case 4:
                        for(Aluno al: turma.read()){
                            System.out.println(al.getRa()+ "|"+al.getNome());                       
                        }
                        System.out.println("Vagas livres: "+turma.capacidadeTurma());
                        break;
                        
                    case 0:
                        System.out.println("Encerrando!");
                        default:
                        System.out.println("Opção inválida");
                        break;
                }
            }catch (Exception e){

            }

        }while(option!=0);sc.close();

    Aluno a1 = new Aluno(1, "Maria Joaquina");
    Aluno a2 = new Aluno(2, "Cilindro");
    Aluno a3 = new Aluno(3, "Carmen");

    System.out.println(turma.capacidadeTurma());System.out.println(turma.insert(a1));System.out.println(turma.insert(a2));System.out.println(turma.insert(a3));System.out.println(turma.capacidadeTurma());

}}
