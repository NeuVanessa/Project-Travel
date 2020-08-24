
package lp2.atividade;


public class motorista extends funcionario{

    /**
     * @return the pis
     */
    public String getPis() {
        return pis;
    }

    /**
     * @param pis the pis to set
     */
    public void setPis(String pis) {
        this.pis = pis;
    }

    /**
     * @return the cnh
     */
    public String getCnh() {
        return cnh;
    }

    /**
     * @param cnh the cnh to set
     */
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    /**
     * @return the rota
     */
    public String getRota() {
        return rota;
    }

    /**
     * @param rota the rota to set
     */
    public void setRota(String rota) {
        this.rota = rota;
    }
    private String pis;
    private String cnh;
    private String rota;
    public motorista(String matricula, String cpf, String nome, String datadenascimento, String pis, String usuario, String senha, String cnh, String rota) {
        super(matricula, cpf, nome, datadenascimento, pis, usuario, senha);
        this.nome = nome;
        this.datadenascimento = datadenascimento;
        this.cpf = cpf;
        this.matricula = matricula;
        this.usuario = usuario;
        this.senha = senha;
        this.cnh = cnh;
        this.rota = rota;
        
        
    }
    
}
