
package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author Luiz Gustavo Mesquita de Oliveira RA: 0030481913045   
 * @author Eduardo Steiner Hessel RA: 0030481913009
 */
public class Vendedor extends Pessoa{
    private double salarioBase;
    private double taxaComissao;
    private ArrayList<Pedido> pedidos; //Multiplicidade 1..*

    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
        pedidos = new ArrayList<Pedido>();
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }
    
    public void addPedido(Pedido p){
        pedidos.add(p); //Estabelecendo a ligação entre Vendedor ---> Pedido
        p.setVendedor(this); //Estabelecendo a ligação entre Pedido ---> Vendedor
    }
}
