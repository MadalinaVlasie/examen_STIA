
public abstract class SpiceMobile {
	public double price;
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	//temp. desing pattern
	
	public final void makeMobile() {	     	      	      	      	         
		prepare();
		 bundle();
		 label();
	    }

	public abstract void prepare();

	public abstract void bundle();

	public abstract void label();
}