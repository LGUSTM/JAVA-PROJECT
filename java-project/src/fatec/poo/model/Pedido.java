
package fatec.poo.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;

/**
 * @author Luiz Gustavo Mesquita de Oliveira RA: 0030481913045   
 * @author Eduardo Steiner Hessel RA: 0030481913009
 */
public class Pedido {
    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagto; //true = pagamento a vista - false = pagamento a prazo
    private boolean situacao;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<ItemPedido> itensPedido; //Multiplicidade 1..*   

    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        itensPedido = new ArrayList<ItemPedido>();
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean getFormaPagto() {
        return formaPagto;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
        
    public void addItemPedido(ItemPedido p){
        itensPedido.add(p); //Estabelecendo a ligação entre Pedido ---> ItemPedido
        p.setPedido(this); //Estabelecendo a ligação entre ItemPedido ---> Pedido
        cliente.setLimiteDisp(cliente.getLimiteDisp() - p.getTotalItem());
    }
    
    public static boolean validarData(String data){
        boolean retorno;
        
        String dateFormat = "dd/MM/uuuu";

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate d = LocalDate.parse(data, formatter);    
            retorno = true;
        } catch (DateTimeParseException e) {
            retorno = false;
        }   
        return retorno;
    }
}
