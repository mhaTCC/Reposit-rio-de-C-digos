package model;

public class Carta {

	private String nome;
	private Cor custo;
	private LinhaDeTipo tipo;
	private String raridade;
	private String estado;
	private String descEfeito;
	private double valor;
	private String imagem;
	private String edicao;
	private Deck deckAssociado;

	// INICIO DO BLOCO
	// PRINCIPAL_________________________________________________________

	
	
		
	
	// FIM DO BLOCO
	// PRINCIPAL_________________________________________________________

	// GETTERS
	
	public String getNome() {
		return nome;
	}
	public Cor getCusto() {
		return custo;
	}
	public LinhaDeTipo getTipo() {
		return tipo;
	}
	public String getRaridade() {
		return raridade;
	}
	public String getEstado() {
		return estado;
	}
	public String getDescEfeito() {
		return descEfeito;
	}
	public double getValor() {
		return valor;
	}
	public String getImagem() {
		return imagem;
	}
	public String getEdicao() {
		return edicao;
	}
	public Deck getDeckAssociado() {
		return deckAssociado;
	}
	
	//SETTERS
	
	public void setDadosDaCarta(Cor custo, Deck deckAssociado, String descEfeito,
			String edicao, String estado, String imagem, String nome, String raridade,
			LinhaDeTipo tipo, double valor){
		
		this.custo = custo;
		this.deckAssociado = deckAssociado;
		this.descEfeito = descEfeito; 
		this.edicao = edicao;
		this.estado = estado;
		this.imagem = imagem;
		this.nome = nome;
		this.raridade = raridade;
		this.tipo = tipo;
		this.valor = valor;
	}

	
}
