package model;


public class BST<T> {
	
	Nodo<T> raiz;
	
	public BST() {

	}
	
	//inorder tree walk
	public void recorrido_inorder(Nodo<T> x) {
		
		if(x != null) {
			recorrido_inorder(x.getIzq());
			System.out.println(x.getValue());
			recorrido_inorder(x.getDer());
			
		}
	}
	
	public void insetar(T key, T valor) {
		
		Nodo<T> n= new Nodo(key);
		n.setValue(valor);
		
		if(raiz == null) {
			raiz = n;
		}else {
			Nodo temporalNodo = raiz;
			while (temporalNodo != null) {
				
				n.p = temporalNodo;
				if (n.llave >= temporalNodo.llave) {
					
					temporalNodo = temporalNodo.der;
				}else {
					temporalNodo = temporalNodo.izq;
				}
				
			}
			if(n.llave < n.p.llave) {
				
				n.p.izq = n;
			}else {
				n.p.der = n;
			}
		}
		
	}
	/*
	private class Nodo{
			
		 public Nodo p; //padre	
		 public Nodo der;
		 public Nodo izq;
		 public int llave;
		 public Object valor;
		 
		 public Nodo(int key) {
			 
			 llave = key;
			 der = null;
			 izq = null;
			 p= null;
			 valor = null;
		 }
		 
			
	}
	*/

}
