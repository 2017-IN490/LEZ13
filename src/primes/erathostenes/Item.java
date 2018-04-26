package primes.erathostenes ;
import java.math.BigInteger ;
public abstract class Item {

// fields

    Item  next ;

// costruttori (initialise)
Item() {
		this.set(null) ;
    }   

public Item(Item tail) {
		this.set(tail) ;
    }   

// di trasformazione (setters)

public void set ( Item list) {
		this.next = list ;
    }

// di accesso (getters)
	
int length() {
		Item lista = this ;
		int i = 0 ;
	
		while((lista != null)) {
			i++ ;
			lista = lista. next ;
		}
		
		return i;
	}
	
public	Item next() {
		return next ;
	}
	
int rlength() {
		if (this.next==null)
			return 1;
		else
			return (next.rlength()+1);
	}

abstract public void print() ;
	
abstract public Token get() ;
	
abstract public BigInteger value() ;

}
