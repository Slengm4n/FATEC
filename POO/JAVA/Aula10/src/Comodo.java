public class Comodo {
    private String nomeComodo;
    private double area;
    
    public Comodo(){
        
    }

    public Comodo(String nomeComodo, double area) {
        this.nomeComodo = nomeComodo;
        this.area = area;
    }

    public String getNomeComodo() {
        return nomeComodo;
    }

    public void setNomeComodo(String nomeComodo) {
        this.nomeComodo = nomeComodo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void exibir(){
        System.out.println("Nome: " + nomeComodo);
        System.out.println("Área: " + area);
    }    
}
