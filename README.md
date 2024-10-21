# poo-fatec


import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Gui", 20, 2024, "ADS");
		System.out.println(aluno);
	}
}


public class Pessoa 
{
    private String nome;
    private int idade;
    private int matricula;
    
    public Pessoa (String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public int getMatricula() {
        return this.matricula;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}

public class Aluno extends Pessoa {
    private String curso;
    public Aluno (String nome, int idade, int matricula, String curso) {
        super(nome,idade,matricula);
        this.curso = curso;
    }
}
