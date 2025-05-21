public class Endereco {
    private String logradoro,cidade,cep;

    public Endereco(String logradoro, String cidade, String cep) {
        this.logradoro = logradoro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getLogradoro() {
        return logradoro;
    }

    public void setLogradoro(String logradoro) {
        this.logradoro = logradoro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
}
