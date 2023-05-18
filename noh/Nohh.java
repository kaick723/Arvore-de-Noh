package noh;

public class Nohh {
	//atributos
	private int valor;
	private Nohh NohEsq;
	private Nohh NohDir;
	//construtores
	public Nohh(int v){
		this.valor = v;
		this.NohEsq = null;
		this.NohDir = null;
	}
	public Nohh(int v, Nohh esq, Nohh dir){
		this.valor = v;
		this.NohEsq = esq;
		this.NohDir = dir;
	}
	//metodos	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Nohh getNohEsq() {
		return NohEsq;
	}
	public void setNohEsq(Nohh nohEsq) {
		NohEsq = nohEsq;
	}
	public Nohh getNohDir() {
		return NohDir;
	}
	public void setNohDir(Nohh nohDir) {
		NohDir = nohDir;
	}
	public void imprimeNoh(){
		System.out.print(" {" + this.valor + "}");
	}
}