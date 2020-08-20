//Done by Zun Hui
public class Transaction {

  private int transcationID;
  private String customername;
  private String productname;
  private String staffname;

  public Transaction(int transcationID, String customername, String productname, String staffname) {
    super();
    this.transcationID = transcationID;
    this.customername = customername;
    this.productname = productname;
    this.staffname = staffname;
  }
  public int getTranscationID() {
    return transcationID;
  }
  public void setTranscationID(int transcationID) {
    this.transcationID = transcationID;
  }
  public String getCustomername() {
    return customername;
  }
  public void setCustomername(String customername) {
    this.customername = customername;
  }
  public String getProductname() {
    return productname;
  }
  public void setProductname(String productname) {
    this.productname = productname;
  }
  public String getStaffname() {
    return staffname;
  }
  public void setStaffname(String staffname) {
    this.staffname = staffname;
  }

  }
