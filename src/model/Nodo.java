package model;

public class Nodo<T> {
	
	private T value;
	private Nodo<T> izq; 
	private Nodo<T> der;
	
	public Nodo(T d) {
		value = d;
		this.der = null;
		this.izq= null;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Nodo<T> getIzq() {
		return izq;
	}

	public void setIzq(Nodo<T> izq) {
		this.izq = izq;
	}

	public Nodo<T> getDer() {
		return der;
	}

	public void setDer(Nodo<T> der) {
		this.der = der;
	}
	
	
}
