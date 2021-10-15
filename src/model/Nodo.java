package model;

public class Nodo<T> {
	
	T value;
	Nodo<T> izq, der;
	
	public Nodo(T d) {
		this.value = d;
		this.der = null;
		this.izq= null;
	}
	
	
}
