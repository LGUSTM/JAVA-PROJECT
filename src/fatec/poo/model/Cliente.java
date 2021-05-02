package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author Luiz Gustavo Mesquita de Oliveira RA: 0030481913045
 * @author Eduardo Steiner Hessel RA: 0030481913009
 */
public class Cliente extends Pessoa {

    private double limiteCred;
    private double limiteDisp;
    private ArrayList<Pedido> pedidos; //Multiplicidade 1..*

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        pedidos = new ArrayList<Pedido>();
        limiteDisp = limiteCred;
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }

    public void setLimiteDisp(double limiteDisp) {
        this.limiteDisp = limiteDisp;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }

    public void addPedido(Pedido p) {
        pedidos.add(p); //Estabelecendo a ligação entre Cliente ---> Pedido
        p.setCliente(this); //Estabelecendo a ligação entre Pedido ---> Cliente
    }
}
