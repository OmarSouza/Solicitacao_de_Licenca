package Controller;

public class Tratamento_De_Erro {
    private String mensagem;
    private boolean retorno;

    public Tratamento_De_Erro(String mensagem, boolean retorno) {
        this.mensagem = mensagem;
        this.retorno = retorno;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isRetorno() {
        return retorno;
    }

    public void setRetorno(boolean retorno) {
        this.retorno = retorno;
    }
    
    
}
