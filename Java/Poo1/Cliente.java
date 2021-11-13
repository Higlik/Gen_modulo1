package Poo1;


/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */


public class Cliente {

	// declaração dos atributos da classe
	private String nome;
	private String endereco;
	private int idade;
	private int numCelular;

	// declarar o método construtor
	public Cliente(String nome, String endereco, int idade, int numCelular) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.numCelular = numCelular;
	}

	public void dadosCliente() {
		System.out.println("O dados informados pelo cliente é: ");
		System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nEndereço: " + endereco + "\nNúmero de celular: "
				+ numCelular);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(int numCelular) {
		this.numCelular = numCelular;
	}

}
