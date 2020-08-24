package lp2.atividade;

public abstract class dados {
 String cpf;
 String nome;
 private int DatadeNascimento;
 private int pis;
 String usuario;
 String senha;
 public static int matricula = 1;
 
 public dados(String cpf, String nome, int DatadeNascimento, int pis, String usuario, String senha){
 this.cpf = cpf;
 this.nome = nome;
 this.DatadeNascimento = DatadeNascimento;
 this.pis = pis;
 this.usuario = usuario;
 this.senha = senha;
}
 public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getDatadeNascimento() {
	return DatadeNascimento;
}
public void setDatadeNascimento(int datadeNascimento) {
	DatadeNascimento = datadeNascimento;
}
public int getPis() {
	return pis;
}
public void setPis(int pis) {
	this.pis = pis;
}
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public dados(String cpf, String nome) {
 this.cpf = cpf;
 this.nome = nome;
}
 public static int getMatricula() { 
  return matricula++;
}
}