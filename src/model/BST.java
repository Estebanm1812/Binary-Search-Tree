package model;


public class BST<T> {
	
	//Nodo<T> raiz;
	
	public BST() {
		raiz = null;
	}
	
	//inorder tree walk
	public void recorrido_inorder(Nodo x) {
		
		if(x != null) {
			recorrido_inorder(x.izq);
			System.out.println(x.llave);
			recorrido_inorder(x.der);
			
		}
	}
	
	public void insetar(int key, Object valor) {
		
		Nodo n= new Nodo(key);
		n.valor = valor;
		
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
	

}
