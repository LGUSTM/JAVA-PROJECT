
package fatec.poo.model;

/**
 * @author Luiz Gustavo Mesquita de Oliveira RA: 0030481913045   
 * @author Eduardo Steiner Hessel RA: 0030481913009
 */
public class ItemPedido{
    private int sequencia;
    private double qtdeVendida;
    private Pedido pedido; //multiplicidade 1
    private Produto produto; //multiplicidade 1

    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
        this.produto = produto;
    }

    public void setQtdeVendida(double qtdeVendida) {
        //atribuir o valor de quantidade vendida na classe ItemPedido
        this.qtdeVendida = qtdeVendida;
        
        //subtrair do estoque com o novo valor
        this.produto.setQtdeEstoque(produto.getQtdeEstoque() - this.qtdeVendida);
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public double getTotalItem(){
        return qtdeVendida * produto.getPreco();
    }
}
