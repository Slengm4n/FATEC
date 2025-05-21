import java.util.ArrayList;
import java.util.List;

public class Casa {
    private Endereco endereco;//Associação 1 para 1(Da classe Enderco)
    private List<Comodo> comodos;

    public Casa(){

    }

    public Casa(Endereco endereco, List<Comodo> comodos){
        if(comodos == null || comodos.size()==0 || comodos.isEmpty()){
            System.out.println("Necessário ter pelo menos um comodo");
        }else{
        this.endereco = endereco;
        this.comodos = new ArrayList<>(comodos);
        }
        
    }

    public void adicionarComodo(Comodo comodo){
        comodos.add(comodo);
    }

    public void removerComodo(Comodo comodo){
        comodos.remove(comodo);
    }

    public void exibirComodo(){
        for(Comodo comodo : comodos){
            comodo.exibir();
        }
    }

}
