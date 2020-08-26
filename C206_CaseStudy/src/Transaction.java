//Done by Zun Hui
public class Transaction {

    private int transcationID;
    private int customerid;
    private String productname;
    private String staffname;
    private String return_type;
    private String status;


    public Transaction(int transcationID, int customerid, String productname, String staffname,String return_type,String status) {
      super();
      this.transcationID = transcationID;
      this.customerid = customerid;
      this.productname = productname;
      this.staffname = staffname;
      this.return_type=return_type;
      this.status=status;
    }


    public int getTranscationID() {
      return transcationID;
    }


    public void setTranscationID(int transcationID) {
      this.transcationID = transcationID;
    }


    public int getcustomerid() {
      return customerid;
    }


    public void setcustomerid(int customerid) {
      this.customerid = customerid;
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


    public String getReturn_type() {
      return return_type;
    }


    public void setReturn_type(String return_type) {
      this.return_type = return_type;
    }


  

    public String getStatus() {
      return status;
    }


    public void setStatus(String status) {
      this.status = status;
    }



    }