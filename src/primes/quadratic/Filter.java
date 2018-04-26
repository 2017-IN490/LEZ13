package primes.quadratic ;

import java.math.BigInteger ;
import primes.erathostenes.Item;

class Filter extends primes.erathostenes.Filter implements Bidimensional {
	Matrix column ;
	
	
// costruttori
Filter(Item tail, BigInteger p) {
		super(tail,p) ;
		System.out.print("new quadratic Filter");
		this.column = new Matrix(((Filter)tail).column(), this.setzerocolumn(((Filter) tail).column()), BigInteger.ONE);
	}

Item setzerocolumn(Item r) {
		if (((Matrix)r).column() != null)
			return (new Matrix(((Matrix)r).column(),this.setzerocolumn(((Matrix)r).column()),BigInteger.ZERO));
		else
			return null ;
	}

Token factorize(Token tok) {
		
		BigInteger exp = BigInteger.ZERO ;
		
		while(test(tok)) {
			exp = exp.add(BigInteger.ONE);
			tok.Set(tok.value().divide(this.value()));
			tok.SetPrimality(false) ;
		}
					
		this.column = new Matrix( ((Filter) this.next()).column(), this.column(), exp ) ;
	return tok;
	}
	

/**
 
 */
public Token get() {
		Token token;
		token=(Token)this.next().get() ;
		token = factorize(token);
		return token;
		
	}
	
	
public Item column () {
		
		return this.column ;
	}

}










