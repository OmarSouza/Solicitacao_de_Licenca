package Controller;

public class Licenca_Controller {
    public Tratamento_De_Erro verificaDados(String veiculo_Placa_Cavalo, String veiculo_Placa_Reboque, String carga_Descricao, 
            String carga_Dimensao_Comprimento, String carga_Dimensao_Largura, String carga_Dimensao_Altura, 
            String carga_Dimensao_Peso, String rota_Origem, String rota_Destino, String rota_Rota, String cliente_Cliente, 
            String cliente_Nota_Fiscal){
        
        //Tratamento Entrada de Placa do Cavalo
        if(veiculo_Placa_Cavalo == null || veiculo_Placa_Cavalo.isEmpty()){
            Tratamento_De_Erro retorno = new Tratamento_De_Erro("Campo 'Placa Cavalo' não preenchido", false);
            return retorno;
        }
        
        //Tratamento Entrada de Descrição
        if(carga_Descricao == null || carga_Descricao.isEmpty()){
            Tratamento_De_Erro retorno = new Tratamento_De_Erro("Campo 'Descrição' não preenchido", false);
            return retorno;
        }
        
        //Tratamento Entrada de Origem
        if(rota_Origem == null || rota_Origem.isEmpty()){
            Tratamento_De_Erro retorno = new Tratamento_De_Erro("Campo 'Origem' não preenchido", false);
            return retorno;
        }
        
        //Tratamento Entrada de Destino
        if(rota_Destino == null || rota_Destino.isEmpty()){
            Tratamento_De_Erro retorno = new Tratamento_De_Erro("Campo 'Destino' não preenchido", false);
            return retorno;
        }
    }
}
