package model;

public class Aluno {
    private String nome;
    private int ra;
    private String curso;
    private String telefone;

    public Aluno(){
    }
    
    public Aluno(String nome, int ra, String curso, String telefone) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
