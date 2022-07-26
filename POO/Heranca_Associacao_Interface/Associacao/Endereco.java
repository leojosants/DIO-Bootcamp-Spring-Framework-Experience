package modulo_1_POO_JAVA.POO.Heranca_Associacao_Interface.Associacao;

public class Endereco {

	String rua;
	int numero;
	String complemento;
	String bairro;
	String cidade;
	String estado;

	Endereco() {
	}

	Endereco(String rua, int numero, String bairro) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
