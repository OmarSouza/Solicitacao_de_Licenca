package Model;

public class Licenca {
    public String veiculo_Placa_Cavalo;
    public String veiculo_Placa_Reboque;
    public String carga_Descricao;
    public String carga_Dimensao_Comprimento;
    public String carga_Dimensao_Largura;
    public String carga_Dimensao_Altura;
    public String carga_Dimensao_Peso;
    public String rota_Origem;
    public String rota_Destino;
    public String rota_Rota;
    public String cliente_Cliente;
    public String cliente_NotaFiscal;

    public Licenca(String veiculo_Placa_Cavalo, String veiculo_Placa_Reboque, String carga_Descricao, String carga_Dimensao_Comprimento, String carga_Dimensao_Largura, String carga_Dimensao_Altura, String carga_Dimensao_Peso, String rota_Origem, String rota_Destino, String rota_Rota, String cliente_Cliente, String cliente_NotaFiscal) {
        this.veiculo_Placa_Cavalo = veiculo_Placa_Cavalo;
        this.veiculo_Placa_Reboque = veiculo_Placa_Reboque;
        this.carga_Descricao = carga_Descricao;
        this.carga_Dimensao_Comprimento = carga_Dimensao_Comprimento;
        this.carga_Dimensao_Largura = carga_Dimensao_Largura;
        this.carga_Dimensao_Altura = carga_Dimensao_Altura;
        this.carga_Dimensao_Peso = carga_Dimensao_Peso;
        this.rota_Origem = rota_Origem;
        this.rota_Destino = rota_Destino;
        this.rota_Rota = rota_Rota;
        this.cliente_Cliente = cliente_Cliente;
        this.cliente_NotaFiscal = cliente_NotaFiscal;
    }

    public String getVeiculo_Placa_Cavalo() {
        return veiculo_Placa_Cavalo;
    }

    public void setVeiculo_Placa_Cavalo(String veiculo_Placa_Cavalo) {
        this.veiculo_Placa_Cavalo = veiculo_Placa_Cavalo;
    }

    public String getVeiculo_Placa_Reboque() {
        return veiculo_Placa_Reboque;
    }

    public void setVeiculo_Placa_Reboque(String veiculo_Placa_Reboque) {
        this.veiculo_Placa_Reboque = veiculo_Placa_Reboque;
    }

    public String getCarga_Descricao() {
        return carga_Descricao;
    }

    public void setCarga_Descricao(String carga_Descricao) {
        this.carga_Descricao = carga_Descricao;
    }

    public String getCarga_Dimensao_Comprimento() {
        return carga_Dimensao_Comprimento;
    }

    public void setCarga_Dimensao_Comprimento(String carga_Dimensao_Comprimento) {
        this.carga_Dimensao_Comprimento = carga_Dimensao_Comprimento;
    }

    public String getCarga_Dimensao_Largura() {
        return carga_Dimensao_Largura;
    }

    public void setCarga_Dimensao_Largura(String carga_Dimensao_Largura) {
        this.carga_Dimensao_Largura = carga_Dimensao_Largura;
    }

    public String getCarga_Dimensao_Altura() {
        return carga_Dimensao_Altura;
    }

    public void setCarga_Dimensao_Altura(String carga_Dimensao_Altura) {
        this.carga_Dimensao_Altura = carga_Dimensao_Altura;
    }

    public String getCarga_Dimensao_Peso() {
        return carga_Dimensao_Peso;
    }

    public void setCarga_Dimensao_Peso(String carga_Dimensao_Peso) {
        this.carga_Dimensao_Peso = carga_Dimensao_Peso;
    }

    public String getRota_Origem() {
        return rota_Origem;
    }

    public void setRota_Origem(String rota_Origem) {
        this.rota_Origem = rota_Origem;
    }

    public String getRota_Destino() {
        return rota_Destino;
    }

    public void setRota_Destino(String rota_Destino) {
        this.rota_Destino = rota_Destino;
    }

    public String getRota_Rota() {
        return rota_Rota;
    }

    public void setRota_Rota(String rota_Rota) {
        this.rota_Rota = rota_Rota;
    }

    public String getCliente_Cliente() {
        return cliente_Cliente;
    }

    public void setCliente_Cliente(String cliente_Cliente) {
        this.cliente_Cliente = cliente_Cliente;
    }

    public String getCliente_NotaFiscal() {
        return cliente_NotaFiscal;
    }

    public void setCliente_NotaFiscal(String cliente_NotaFiscal) {
        this.cliente_NotaFiscal = cliente_NotaFiscal;
    }
    
    
}
