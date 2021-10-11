package Controller;

import Model.Licenca;

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
        
        //Tratamento Entrada Cliente
        if(cliente_Cliente == null || cliente_Cliente.isEmpty()){
            Tratamento_De_Erro retorno = new Tratamento_De_Erro("Campo 'Cliente' não preenchido", false);
            return retorno;
        }
        
        //Tratamento Entrada Nota Fiscal
        if(cliente_Nota_Fiscal == null || cliente_Nota_Fiscal.isEmpty()){
            Tratamento_De_Erro retorno = new Tratamento_De_Erro(("Campo 'Nota Fiscal' não preenchido"), false);
            return retorno;
        }
        
        Licenca licenca = new Licenca(veiculo_Placa_Cavalo, veiculo_Placa_Reboque, carga_Descricao, 
                carga_Dimensao_Comprimento, carga_Dimensao_Largura, carga_Dimensao_Altura, 
                carga_Dimensao_Peso, rota_Origem, rota_Destino, rota_Rota, cliente_Cliente, cliente_Nota_Fiscal);
        
        Tratamento_De_Erro retorno = new Tratamento_De_Erro("Solicitação Emitida com sucesso", true);
        return retorno;
    }
}
