package primes.erathostenes ;

import java.math.BigInteger ;

public class Filter extends Item {
 private BigInteger prime ;

    // costruttori
public Filter(Item tail, BigInteger p ) {
	System.out.print("new erathostenes Filter");
	this.Set(tail,p) ;
    }

    // setters
private void Set(Item tail, BigInteger p) {
	this.prime = p ;
	super.set(tail) ;
    }

    // getters
public void print() {
		
		System.out.print("F:"+this.prime+"->");
		//if (!(this.next==null))
		this.next.print() ;
		
	}

public boolean test(Token t) {
		return (t.value().mod(this.value()).compareTo(BigInteger.ZERO) == 0) ;
	}
	
public Token get() {
		Token token;
		token=next.get() ;
		while (test(token)) token=next.get();
		return token;

	}
	
	
public	BigInteger value() {
		return this.prime ;
		
	}

}










