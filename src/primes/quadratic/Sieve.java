package primes.quadratic ;
import java.math.BigInteger;

import primes.erathostenes.Counter;
import primes.erathostenes.Item;

//import primes.erathostenes.Token;
public class Sieve extends primes.erathostenes.Sieve {
	
/**
 * In the extension of a class constructors arenot inherited
 */
public	Sieve (String[] args) {
		super(args, new Counter()) ;
	
		
		System.out.println("constructing quadratic Sieve");
	
		this.mainloop();
		this.print() ;
	}
	
public	boolean testloop(Token token) {
	return ( token.value2().compareTo(this.getmax()) != 1) ;
}
	
	
/**
 * @override of the erathosenes.Sieve mainloop
 * the only difference is on the test of
 * the primality boolean in order to create a new Filter objet
 */
	public void mainloop() {
		Token token ;
		
		token = (Token) this.next().get() ;
		
		while (testloop(token)) {
			if (token.primality()) {
				this.seteuler() ;
				this.set( new Filter((Item)this.next() , token.value() ));
			}
			token = (Token)this.next().get() ;
		};
		
	}
	
	public void printmatrix() {
		
		((Filter)this.next()).column().print() ;
		
	}


}
