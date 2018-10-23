package br.com.bg.bibliotecBG.dominio;

/**
 *
 * @author 2binfo
 */
public class Usuario {

    private String nome;
    private String eMail;
    private String cpf;
    private String rg;
    private int idade;
    private String sexo;

    public Usuario() {
    }

    public Usuario(String nome, String eMail, String cpf, String rg, int idade, String sexo) {
        this.nome = nome;
        this.eMail = eMail;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", eMail=" + eMail + ", cpf=" + cpf + ", rg=" + rg + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
    
    
}
