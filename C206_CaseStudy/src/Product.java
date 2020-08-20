public class Product {
	 
	 private int productID;
	 private String  productDescription;
	 private String productCategory;
	 private String productName;
	 private String vendorName;
	 //
	 public Product(int productID, String productDescription, String productCategory, String productName,
	   String vendorName) {
	  
	  this.productID = productID;
	  this.productDescription = productDescription;
	  this.productCategory = productCategory;
	  this.productName = productName;
	  this.vendorName = vendorName;
	 }
	  //
	  public int getProductID() {
	   return productID;
	  }
	  public void setProductID(int productID) {
	   this.productID = productID;
	  }
	  public String getProductDescription() {
	   return productDescription;
	  }
	  public void setProductDescription(String productDescription) {
	   this.productDescription = productDescription;
	  }
	  public String getProductCategory() {
	   return productCategory;
	  }
	  public void setProductCategory(String productCategory) {
	   this.productCategory = productCategory;
	  }
	  public String getProductName() {
	   return productName;
	  }
	  public void setProductName(String productName) {
	   this.productName = productName;
	  }
	  public String getVendorName() {
	   return vendorName;
	  }
	  public void setVendorName(String vendorName) {
	   this.vendorName = vendorName;
	  }
	}
