
package lp2.atividade;

public class funcionario {

    funcionario() {
       
        String nome1 = this.nome;
    }

   

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the datadenascimento
     */
    public String getDatadenascimento() {
        return datadenascimento;
    }

    /**
     * @param datadenascimento the datadenascimento to set
     */
    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

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
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

   String matricula;
   String cpf;
   String nome;
   String datadenascimento;
   private String pis;
   String usuario;
   String senha;
    
   public funcionario (String matricula,String cpf,String nome,String datadenascimento,String pis,  String usuario,String senha){
       
       this.matricula = matricula; 
       this.cpf = cpf;
       this.nome = nome; 
       this.datadenascimento = datadenascimento; 
       this.pis = pis; 
       this.usuario = usuario; 
       this.senha = senha; 
       
   }

}
