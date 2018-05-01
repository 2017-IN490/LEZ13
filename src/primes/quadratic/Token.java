/**
 * This new variant of the Token class has to manage
 * residuals of the factoring integer
 * @author MP
 */

package primes.quadratic ;

import java.math.BigInteger ;
import primes.erathostenes.Sieve ;
import primes.erathostenes.Item ;

class Token extends primes.erathostenes.Token {
//private BigInteger num ;
private BigInteger safenum ;
//private Item row ;
	//prova
private boolean primality ;

	static final BigInteger TWO = new BigInteger("2");
	
	//costruttori
	 Token() {
		this.Set(BigInteger.ZERO) ;
		
	}

	// setters
/*	void Set(BigInteger n) {
		
		this.num = n ;
		
		
	}
*/
	
	public void Set(Sieve sieve,BigInteger n) {
		this.Set(n) ;
		this.safenum = n;

		//this.row = null ;
		this.primality = true ;
	}
	
	
	// getters
/*	BigInteger value() {
		
		return this.num;
	}
*/
	public void SetPrimality(boolean b) {
		
		this.primality = b;
	}
	
	public BigInteger value2() {
		return this.safenum ;
		
	}
	
	boolean primality() {
		
		return this.primality;
	}



}
