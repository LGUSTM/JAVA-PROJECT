package fatec.poo.model;

/**
 * @author Luiz Gustavo Mesquita de Oliveira RA: 0030481913045
 * @author Eduardo Steiner Hessel RA: 0030481913009
 */
public class Pessoa {

    private String cpf;
    private String nome;
    private String endereco;
    private String cidade;
    private String uf;
    private String cep;
    private String ddd;
    private String telefone;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public static boolean validarCPF(String CPF) {
        boolean retorno;

        if (CPF.length() != 11) {
            retorno = false;
        } else {
            int digitoVer1, digitoVer2, resto, num, peso;

            int alg1 = Integer.parseInt(CPF.substring(0, 1));
            int alg2 = Integer.parseInt(CPF.substring(1, 2));
            int alg3 = Integer.parseInt(CPF.substring(2, 3));
            int alg4 = Integer.parseInt(CPF.substring(3, 4));
            int alg5 = Integer.parseInt(CPF.substring(4, 5));
            int alg6 = Integer.parseInt(CPF.substring(5, 6));
            int alg7 = Integer.parseInt(CPF.substring(6, 7));
            int alg8 = Integer.parseInt(CPF.substring(7, 8));
            int alg9 = Integer.parseInt(CPF.substring(8, 9));
            int alg10 = Integer.parseInt(CPF.substring(9, 10));
            int alg11 = Integer.parseInt(CPF.substring(10));

            //calculo do primeiro digito
            int soma = (alg1 * 1) + (alg2 * 2) + (alg3 * 3) + (alg4 * 4)
                    + (alg5 * 5) + (alg6 * 6) + (alg7 * 7) + (alg8 * 8)
                    + (alg9 * 9);
            
            resto = soma % 11;
            if (resto == 10) {
                digitoVer1 = 0;
            } else {
                digitoVer1 = resto; // converte no respectivo caractere numerico
            }

            if (digitoVer1 != alg10) {
                retorno = false;
            } else {

                // Calculo do 2o. Digito Verificador
                soma = (alg1 * 11) + (alg2 * 10) + (alg3 * 9) + (alg4 * 8)
                        + (alg5 * 7) + (alg6 * 6) + (alg7 * 5) + (alg8 * 4)
                        + (alg9 * 3) + (alg10 * 2);
                
                resto = (soma * 10) % 11;
                if (resto == 10 ) {
                    digitoVer2 = 0;
                } else {
                    digitoVer2 = resto;
                }
                // Verifica se os digitos calculados conferem com os digitos informados.
                if (digitoVer2 == alg11) {
                    retorno = true;
                } else {
                    retorno = false;
                }
            }
        }

        return retorno;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getDdd() {
        return ddd;
    }

    public String getTelefone() {
        return telefone;
    }
}
