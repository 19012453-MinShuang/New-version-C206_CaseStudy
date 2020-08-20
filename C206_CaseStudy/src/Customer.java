public class Customer {

	  private int customerID;
	  private String customerName;
	  
	  public Customer (int customerID, String customerName) {
	    this.customerID = customerID;
	    this.customerName = customerName;	    
	  }	  
	  public int getCustomerID() {
	    return customerID;
	  }	  
	  public String getCustomerName() {
	    return customerName;
	  
	  } public String toString() {
	    String output = "";
	    output = String.format("%-10d %-10s\n", getCustomerID(), getCustomerName());
	    return output;
	    
	  }
	  
	    
	}
