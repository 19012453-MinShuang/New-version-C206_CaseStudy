//Done By  MinShuang
public class Customer {

  private String customerName;
  private int customerID;
  private int rewardPoint;

  public Customer(String customerName, int customerID, int rewardPoint) {
    this.customerName = customerName;
    this.customerID = customerID;
    this.rewardPoint = rewardPoint;
  }

  public int getCustomerID() {
    return customerID;
  }

  public void setCustomerID(int customerID) {
    this.customerID = customerID;
  }

  public String getCustomerName() {
    return customerName;

  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;

  }

  public int getRewardPoint() {
    return rewardPoint;
  }

  public void setRewardPoint(int RewardPoint) {
    this.rewardPoint = RewardPoint;
    System.out.println("Reward points has been updated");

  }

  public String toString() {
    String output = "";
    output = String.format("%-10d %-10s\n", getCustomerID(), getCustomerName());
    return output;

  }

  private String rewardPt() {
    return null;
  }

  public void displayCustomer() {
    System.out.println("Total number of reward point: > " + rewardPoint);
  
  }

}