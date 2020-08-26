//Done by LanXin
public class Product {

    private int productID;
 private String  productDescription;
 private String productCategory;
 private String productName;
 private double productPrice;
 private String productCondition;
 private int productReturnNum;
 private String vendorName;
 private boolean Availability;
 //
 public Product(int productID, String productDescription, String productCategory, String productName,
   double productPrice, String productCondition, int productReturnNum, String vendorName) {
  
  this.productID = productID;
  this.productDescription = productDescription;
  this.productCategory = productCategory;
  this.productName = productName;
  this.productPrice = productPrice;
  this.productCondition = productCondition;
  this.productReturnNum = productReturnNum;
  this.vendorName = vendorName;
  
 }
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
 public double getProductPrice() {
  return productPrice;
 }
 public void setProductPrice(double productPrice) {
  this.productPrice = productPrice;
 }
 public String getProductCondition() {
  return productCondition;
 }
 public void setProductCondition(String productCondition) {
  this.productCondition = productCondition;
 }
 public int getProductReturnNum() {
  return productReturnNum;
 }
 public void setProductReturnNum(int productReturnNum) {
  this.productReturnNum = productReturnNum;
 }
 public String getVendorName() {
  return vendorName;
 }
 public void setVendorName(String vendorName) {
  this.vendorName = vendorName;
 }
 public boolean isAvailability() {
  return Availability;
 }
 public void setAvailability(boolean availability) {
  Availability = availability;
 }
}