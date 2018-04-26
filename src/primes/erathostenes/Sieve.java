package primes.erathostenes ;

import java.math.BigInteger ;

public class Sieve extends Item {
private    BigInteger maxprime ;
private    BigInteger euler ;

/*
public Sieve(String[] args) {
		super(new Counter());
		
		Token token ;
		
		this.maxprime = new BigInteger(args[0]) ;
		this.euler = BigInteger.ZERO ;
		
		token = next.get() ;
		
		while ( token.value().compareTo(this.maxprime) != 1) {
			this.euler = this.euler.add(BigInteger.ONE) ;
			this.set( new Filter(this.next , token.value() ));
			token = this.next.get() ;

		};

		this.print() ;

	}
*/
	
	public Sieve(String[] args, Item next) {
		super(next);
		
		this.maxprime = new BigInteger(args[0]) ;
		this.euler = BigInteger.ZERO ;
	}
	
	public Sieve () {
		super(null) ;
		this.euler = BigInteger.ZERO ;
	}
	
	public Sieve(String[] args) {
		this(args, new Counter()) ;
		System.out.println("new erathostenes Sieve with string args");
		
		this.mainloop();
		this.print() ;
	}
	
public	boolean testloop(Token token) {
		return ( token.value().compareTo(this.maxprime) != 1) ;
	}
	
	private void mainloop() {
		Token token ;
		
		token = next.get() ;
		
		while (testloop(token)) {
			this.euler = this.euler.add(BigInteger.ONE) ;
			this.set( new Filter(this.next , token.value() ));
			token = this.next.get() ;
		};
		
	}
	
	// setters
	public void setmax(BigInteger max) {
		this.maxprime = max ;
	}
	
	public void seteuler() {
		this.euler = this.euler.add(BigInteger.ONE) ;
	}
	
	// getters
	
	public BigInteger getmax() {
		return this.maxprime ;
		
	}
	
	
	public void print2() {
		this.print() ;
	}
	
	public void print() {
		
		System.out.print("S:"+this.euler+"->");
		//if (!(this.next==null))
		this.next.print() ;
		
	}

public	Token get() {
		return null ;

	}
	
	public BigInteger value() {
		
		return this.euler ;
	}

}
