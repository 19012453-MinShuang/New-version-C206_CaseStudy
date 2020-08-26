import java.util.ArrayList;

import com.sun.glass.ui.Pixels.Format;

public class C206_CaseStudy {
	private static String out;
	
		  //Done by Lanxin 
		private static final int PRODUCT_QUIT = 7;
		private static final int UPDATE_PRODUCT_CONDITION = 6;
		private static final int NUMBEROFPRODUCT_RETURNED = 5;
		private static final int SEARCH_PRODUCT = 4;
		private static final int SEARCH_PRODUCTBYVENDORNAME = SEARCH_PRODUCT;
		private static final int DELETE_PRODUCT = 3;
		private static final int DISPLAY_PRODUCT = 1;
		private static final int ADD_PRODUCT = 2;
		//Done by Elizabeth
		private static final int EXITPROCEDURE = 6;
		private static final int SEARCHPROCEDURE = 5;
		private static final int UPDATEPROCEDURE = 4;
		private static final int customer = 4;
		private static final int product = 3;
		private static final int Procedure = 1;
		  private static final int DELETEPROCEDURE = 3;
		  private static final int VIEWPROCEDURE = 2;
		  private static final int ADDPROCEDURE = 1;
		  
		  //Done by Zun Hui
		  private static final int OPTION_ARCHIVE = 3;
		  private static final int OPTION_ADD = 1;
		  private static final int OPTION_VIEW = 2;
		  private static final int OPTION_ADD_VIEW_ARCHIVE = 2;
		  private static final int OPTION_UPDATE = 0;
		  private static final int _5 = 5;
		  private static final int OPTION_QUIT = _5;
		  
		  //Done by Min Shuang
		  private static final int QUIT = 7;
		  private static final int END = 6;
		  private static final int TOP_CUSTOMER = 5;
		  private static final int UPDATE_REWARDPOINT = 4;
		  private static final int DELETE_CUSTOMER = 3;
		  private static final int VIEW_CUSTOMER = 2;
		  private static final int ADD_CUSTOMER = 1;
		  // done by lanxin
		  
		  public static void main(String[] args) {
		    //Done by Elizabeth
		    ArrayList <procedure> procedureList = new ArrayList <procedure>(); 
		    //Done by Min Shuang
		    ArrayList <Customer> customerList = new ArrayList <Customer>();
		    //Done by Zun Hui
		    ArrayList <Transaction> TransactionList = new ArrayList<Transaction>();
		    ArrayList <Transaction> ArchiveTransactionList = new ArrayList<Transaction>();
		    //Done by lan xin
		    
		    ArrayList<Product> productList = new ArrayList<Product>();
		    ArrayList<Product> sortingList = new ArrayList<Product>();

		    productList.add(new Product(0, "Pork", "Food", "China Pork", 8.9, "Exchange", 8, "LiuJiaZhuRou"));
		    productList.add(new Product(1, "Toothbrush", "Household", "Janpan toothbrush", 7.8, "Refund", 7, "YuKu Brush"));
		    
		    int option = 0;
		    while (option != 5) {
		    	C206_CaseStudy.menu();
		    	option = Helper.readInt("Enter option> ");
		    	if (option == Procedure) { //Elizabeth
		    		option=0; 
		    		while (option != 5) { 
		    			C206_CaseStudy.procedureMenu(); 
		    			option  = Helper.readInt("Enter an option >"); 
		      
		    			if (option==ADDPROCEDURE) { 
		    				addProcedure(procedureList);
		    			}
		    			else if (option == VIEWPROCEDURE) {
		    				C206_CaseStudy.viewProcedureList(procedureList);
		    			}
		    			else if (option == DELETEPROCEDURE) {
		    				delProcedure(procedureList);
		    			}
		    			else if (option == UPDATEPROCEDURE) {
		    				C206_CaseStudy.updateProcedure(procedureList);
		    			}
		    			else if (option == SEARCHPROCEDURE) {
		    				C206_CaseStudy.searchProcedure(procedureList);
		    			}
		    			else if (option == EXITPROCEDURE) {
		    				System.out.println("Bye");
		    			}
		    			else {
		    				System.out.println("Invalid Option.");
		    			}
		    		}
		    	} // ELI PROCEDURE 
		    	//Done by Zun Hui
		             else if (option == OPTION_ADD_VIEW_ARCHIVE) {
		                 System.out.println("1. Add");
		                 System.out.println("2. View All");
		                 System.out.println("3. Archive");
		                 System.out.println("4. Update Transcation");  
		                 int suboption=Helper.readInt("Enter option :");
		                 if(suboption==OPTION_ADD) {
		                   C206_CaseStudy.addTransaction(TransactionList,customerList);
		                 }else if(suboption==OPTION_VIEW) {
		                   C206_CaseStudy.viewTransaction(TransactionList);
		                 }else if(suboption==3) {
		                   
		                 }else if(suboption==OPTION_ARCHIVE){
		                   C206_CaseStudy.archiveOldTransaction(TransactionList, ArchiveTransactionList); 
		                 }else if(suboption==OPTION_UPDATE){
		                   C206_CaseStudy.updateTranscation(TransactionList);
		                 }else {
		                   System.out.println("Invalid option");
		    	}
		             } //ZUNHUI ARCHIVE 
		             else if (option == 3) {
		    	
		    			while (option != 7) {
		    				C206_CaseStudy.menu();
		    				option = Helper.readInt("Enter an option > ");

		    				if (option == DISPLAY_PRODUCT) {
		    				// View all product
		    					C206_CaseStudy.viewAllProduct(productList);
		    					System.out.println(out); 
		    				} 
		    				else if (option == ADD_PRODUCT) {

		    					// Add product

		    					C206_CaseStudy.addProduct(productList);

		    				} 
		    				else if (option == DELETE_PRODUCT) {

		    					// delete product
		    					C206_CaseStudy.deleteAllProduct(productList);

		    				} 
		    				else if (option == SEARCH_PRODUCTBYVENDORNAME) {
		    					C206_CaseStudy.ItemTypeMenu1();
		    					int ItemType = Helper.readInt("Enter option to select item type : ");

		    					if (ItemType == 1) {
		    					// Search product by vendor name
		    						C206_CaseStudy.searchAllProduct(productList);

		    					}
		    					else if (ItemType == 2) {

		    					// update vendor name
		    						C206_CaseStudy.UpdateVendorName(productList);
		    					} 
		    					else {
		    						System.out.println("Invalid item type");
		    					}
		    				} 
		    				else if (option == NUMBEROFPRODUCT_RETURNED) {

		    					C206_CaseStudy.productTypeMenu1();
		    					int productType = Helper.readInt("Enter option to select product type : ");

		    					if (productType == 1) {

		    					// update
		    					C206_CaseStudy.updateReturns(productList);

		    					}
		    					else if (productType == 2) {

		    					// sorting
		    						C206_CaseStudy.displayAllProduct(productList);
		    					} 
		    					else {
		    						System.out.println("Invalid product type");
		    					}

		    				}
		    				else if (option == UPDATE_PRODUCT_CONDITION) {

		    					// Update product condition

		    					C206_CaseStudy.UpdateProductCondition(productList);

		    				}
		    				else if (option == PRODUCT_QUIT) {
		    					System.out.println("Bye!");

		    				} 
		    				else {
		    					System.out.println("Invalid option");
		    				}
		    			} 
		    		 }

		    			 else if (option == customer) { //MinShuang
		    				 C206_CaseStudy.menu();
		    				 int suboption = Helper.readInt("Enter an option > ");

		    				 if (option == ADD_CUSTOMER) {
		    				// Add item
		    					 C206_CaseStudy.setHeader("ADD CUSTOMER");
		    					 C206_CaseStudy.customerMenu();

		    					 int customerType = Helper.readInt("Enter option to select customer type > ");

		    					 if (customerType == 1) {
		    						
		    						 // Add customer
		    						 C206_CaseStudy.addCustomer(customerList);
		    					 }
		    				 }

		    				 else if (option == VIEW_CUSTOMER) {
		    					 // View item
		    					 if (customerList.isEmpty()) {
		    						 System.out.println("Customer list is empty.");
		    					 } else {
		    						 C206_CaseStudy.viewAllCustomer(customerList);
		    					 }

		    				 } 	
		    				 else if (option == DELETE_CUSTOMER) {
		    					 // Delete item
		    					 C206_CaseStudy.setHeader("DELETE CUSTOMER");
		    					 C206_CaseStudy.customerMenu();

		    					 int customerType = Helper.readInt("Enter option to select customer type > ");

		    					 if (customerType == 3) {
		    						 // Delete customer
		    						 C206_CaseStudy.deleteCustomer(customerList);
		    					 } 
		    					 else {
		    						 System.out.println("This is invalid.");
		    					 }

		    				 }
		    				 else if (option == UPDATE_REWARDPOINT) {
		    					 // Update item
		    					 C206_CaseStudy.setHeader("UPDATE REWARD POINTS");
		    					 C206_CaseStudy.customerMenu();

		    					 int customerType = Helper.readInt("Enter option to select customer type > ");

		    					 if (customerType == 4) {
		    						 // Update customer reward point
		    						 C206_CaseStudy.updateRewardPoint(customerList);
		    					 } 
		    					 else {
		    						 System.out.println("This is invalid.");
		    					 }

		    				 } 
		    				 else if (option == TOP_CUSTOMER) {
		    					 // Find top customer
		    					 C206_CaseStudy.setHeader("TOP CUSTOMER REWARD POINT");
		    					 C206_CaseStudy.customerMenu();
		    	        
		    					 int customerType = Helper.readInt("Enter option to select customer type > ");

		    					 // Find Top customer reward point
		    					 C206_CaseStudy.topRewardPoint(customerList);

		    				 } 	
		    				 else if (option == END) {
		    					 System.out.println("Bye!");
		    				 } 
		    				 else {
		    					 System.out.println("Invalid option");
		    				 }

		    			 }
		    		}
		    	} 
		    	
		//Procedure -done by Elizabeth
		public static void addProcedure(ArrayList<procedure> procedureList) {
			int AdminID = Helper.readInt("Enter Administrator ID >");
			int ProcID = Helper.readInt("Enter Procedure ID >");
			String ProcName = Helper.readString("Enter Procedure Name >");
			String date = Helper.readString("Enter date > ");
			
			procedureList.add(new procedure(AdminID, ProcID, ProcName, date));
			System.out.println("Procedure added!"); 
		}
		public static void delProcedure(ArrayList<procedure> procedureList) {
			int procID = Helper.readInt("Enter Procedure ID >");
			for (int i = 0; i < procedureList.size(); i++) {
			  if (procID == procedureList.get(i).getProcedure_id()) {
			    procedureList.remove(i);
			  } 
			  else {
			    System.out.println("Invalid Procedure ID");
			  }
			}
		}
		  public static String retrieveProcedureList (ArrayList<procedure>procedureList) {
		    String output = "";
		    for (int i = 0; i < procedureList.size(); i++) {
		       output += String.format("%d %-20d %-20d %-20s %-20s \n", (i+1),procedureList.get(i).getAdminstrator_id(), procedureList.get(i).getProcedure_id(), procedureList.get(i).getProcedure(), procedureList.get(i).getDate());
		    }
		    return output;
		  }
		  public static void viewProcedureList(ArrayList<procedure>procedureList) {
		    C206_CaseStudy.setHeader("Procedure List");
		    String output = String.format("%s %-20s %-20s %-20s %-20s \n", "No.", "Adminstrator ID", "Procedure ID", "Procedure", "Date");
		    output += retrieveProcedureList(procedureList);
		    System.out.println(output);
		  }
		  
		  public static void updateProcedure (ArrayList<procedure>procedureList) { 
			  String name= Helper.readString("Enter procedure name > " ); 
			  
			  for (int i=0; i<procedureList.size(); i++) { 
				  if(name.equalsIgnoreCase(procedureList.get(i).getProcedure())) { 
					  String newDate = Helper.readString("Enter new date > ");
					  procedureList.get(i).setDate(newDate);
					  System.out.println("Procedure date has been changed to " + newDate);
					  break;
				  }
				  else {
					  System.out.println("Invalid Procedure");
				  }
			  }
		  }
		  public static void searchProcedure(ArrayList<procedure>procedureList) { 
			  String procedure = Helper.readString("Enter procedure to find >"); 
			  String output = String.format("%-20s %-20s %-20s %-20s \n", "Adminstrator ID", "Procedure ID", "Procedure", "Date");
			  for (int i = 0; i < procedureList.size(); i++) {
				  if (procedure.equalsIgnoreCase(procedureList.get(i).getProcedure())) {
					  output += String.format("%-20d %-20d %-20s %-20s", procedureList.get(i).getAdminstrator_id(), procedureList.get(i).getProcedure_id(), procedureList.get(i).getProcedure(), procedureList.get(i).getDate());
					  System.out.println(output);
					  break;
				  }
				  else {
					  System.out.println("Invalid procedure");
				  }
			  }
			  
		  }
		  //Transaction - done by ZunHui
		//=================Add====================================
		    public static void addTransaction(ArrayList<Transaction> TransactionList,ArrayList<Customer> customerList) {
		      boolean customer_exist=false;
		        int transcationID= Helper.readInt("Transaction ID:");
		        int customerid=Helper.readInt("ID of customer:");
		        for(int i=0;i<customerList.size();i++) {
		          if (customerList.get(i).getCustomerID()==customerid) {
		            customer_exist=true;
		               }else {
		                 System.out.println("There is no such customer");
		                 break;
		               }
		        String productname=Helper.readString("Name of product:");
		        String staffname=Helper.readString("Name of staff handling the return:");
		        String return_type=Helper.readString("Type of transaction:");
		        String status="In-Progress";
		        if(return_type.equalsIgnoreCase("Refund")) {
		          int addRewardpoint=Helper.readInt("Amount of points to be added:");
		          for(int z=0;i<customerList.size();z++) {
		            if (customerList.get(z).getCustomerID()==customerid) {
		              customerList.get(z).setRewardPoint(customerList.get(z).getRewardPoint()+addRewardpoint);
		              customer_exist=true;
		              break;
		            }
		          }
		        }
		         
		        Transaction tra=new Transaction(transcationID, customerid, productname, staffname,return_type,status);
		        TransactionList.add(tra);
		        System.out.println("Transaction added");
		        
		        }
		        
		      }

		      

		      //=================view all=================================
		    public static String retrieveAllTransaction(ArrayList<Transaction> TransactionList) {
		      String output="";
		      for (int i = 0; i < TransactionList.size(); i++) {
		        output += String.format("%-25d %-25d %-25s %-25s %-25s\n", TransactionList.get(i).getTranscationID(),TransactionList.get(i).getcustomerid(),TransactionList.get(i).getProductname(),
		            TransactionList.get(i).getStaffname(),TransactionList.get(i).getStatus());
		      }
		      return output;
		    }
		    public static void viewTransaction(ArrayList<Transaction> TransactionList) {
		      Helper.line(80, "-");
		      System.out.println("TRANSACTION LIST");
		      Helper.line(80, "-");
		      String output = String.format("%-25s %-25s %-25s %-25s %-25s\n", "TRANSACTION ID", "CUSTOMER ID",
		          "PRODUCT NAME","STAFF HANDLING NAME", "STATUS");
		       output += retrieveAllTransaction(TransactionList);  
		      System.out.println(output);
		    }
		      //=================Archive transactions===============================
		    public static void archiveOldTransaction(ArrayList<Transaction> TransactionList,ArrayList<Transaction> ArchiveTransactionList) {
		        C206_CaseStudy.viewTransaction(TransactionList);
		        String yesorno=Helper.readString("Do you want to archive transaction? (Yes/No) :");
		        if(yesorno.equalsIgnoreCase("Yes")) {
		        for(int i=0;i<TransactionList.size();i++) {
		          ArchiveTransactionList.add(ArchiveTransactionList.size(),TransactionList.get(i));
		        }
		        TransactionList.clear();
		        System.out.println("List has been archived");
		              
		        
		      }
		        
		      }
		    public static String retrieveTransactionList(ArrayList<Transaction> transactionList) {
		        // TODO Auto-generated method stub
		        return null;
		      }
		      //=================Update Transaction===============================
		      public static void updateTranscation(ArrayList<Transaction> TransactionList) {
		        boolean transexist=false;
		        C206_CaseStudy.viewTransaction(TransactionList);
		        int transcationID=Helper.readInt("Enter the transcation ID to update:");
		        for(int i=0;i<TransactionList.size();i++) {
		          if(TransactionList.get(i).getTranscationID()==transcationID) {
		            transexist=true;
		            TransactionList.get(i).setStatus(Helper.readString("Enter Status of the Transaction:"));
		          }
		        }if(transexist) {
		          System.out.println("Transaction Updated");
		        }else {
		          System.out.println("No such transcation found");
		          System.out.println("Returning to home page");
		        }
		      }
		      public static void addTransaction(ArrayList<Transaction> transactionList, Transaction t2) {
		        // TODO Auto-generated method stub

		    }
		  //Product - done by LanXin
		 // Write the code for the viewAllProduct method.
		    // Note: This method is a public static method that takes in an ArrayList of
		    // Product objects.
		      public static String viewAllProduct(ArrayList<Product> productList) {
		    	  Helper.line(45, "=");
		    	  System.out.println("Product List");
		    	  Helper.line(45, "=");

		    	  if (productList.isEmpty()) {
		    	   System.out.println("There is no product available.");
		    	  } else {
		    	   out = String.format("%-10s  %-25s %-40s %-55s %-70s %-55s %-40s %-15s\n", "Product ID ",
		    	     "Product Description", "Product Category ", "Product Name", "Product Price", "Product Condition",
		    	     "Numbers of returns", "Vendor Name");
		    	   for (int i = 0; i < productList.size(); i++) {
		    	    Product ppp = productList.get(i);
		    	    out += String.format("%-10d  %-25s %-40s %-55s $%-70.2f %-55s %-40d %-15s\n", ppp.getProductID(),
		    	      ppp.getProductDescription(), ppp.getProductCategory(), ppp.getProductName(),
		    	      ppp.getProductPrice(), ppp.getProductCondition(), ppp.getProductReturnNum(),
		    	      ppp.getVendorName());
		    	   }

		    	  }
		    	  return out;
		    	 }

		    	 // add
		    	 public static void addProduct(ArrayList<Product> productList) {
		    	  int ID = Helper.readInt("Enter product ID: ");
		    	  String Description = Helper.readString("Enter  product description: ");
		    	  String Category = Helper.readString("Enter product category : ");
		    	  String PName = Helper.readString("Enter product name: ");
		    	  double Pprice = Helper.readDouble("Enter the product price: ");
		    	  String Pcondition = Helper.readString("Enter the product condition: ");
		    	  int PReturnNum = Helper.readInt("Enter the numbers of return for the product :");
		    	  String vendorName = Helper.readString("Enter vendor name  : ");

		    	  // duplicating
		    	  boolean isDuplicate = false;
		    	  for (int i = 0; i < productList.size(); i++) {
		    	   if (ID == productList.get(i).getProductID()
		    	     || PName.equalsIgnoreCase(productList.get(i).getProductName())) {

		    	    System.out.println("This product  already exists!");
		    	    isDuplicate = true;
		    	    break;
		    	   }
		    	  }

		    	  if (isDuplicate == false) {
		    	   productList.add(new Product(ID, Description, Category, PName, Pprice, Pcondition, PReturnNum, vendorName));
		    	   System.out.println(" New product added!");
		    	  }

		    	 }

		    	 public static void deleteAllProduct(ArrayList<Product> productList) {
		    	  Helper.line(45, "=");
		    	  System.out.println("Delete product");
		    	  Helper.line(45, "=");

		    	  boolean isFound = false;
		    	  int product = 0;

		    	  int id = Helper.readInt("Enter product ID to delete item: ");
		    	  String confirm = Helper.readString("Are you sure you want to delete product from list?(Y/N): ");
		    	  for (int i = 0; i < productList.size(); i++) {
		    	   if (productList.get(i).getProductID() == id) {

		    	    isFound = true;
		    	    product = i;

		    	   }

		    	  }
		    	  if (isFound == true && confirm.equalsIgnoreCase("y")) {

		    	   productList.remove(product);
		    	   System.out.println("Successfully deleted");

		    	  } else {
		    	   System.out.println("Invalid Product ID");

		    	  }
		    	 }
		    //Customer - done by MinShuang
		 // ==================================== Option 1 Add ====================================

		    public static void addCustomer(ArrayList<Customer> customerList) {
		      C206_CaseStudy.setHeader("ADD CUSTOMER");
		      String customerName = Helper.readString("Enter Customer name > ");
		      int customerID = Helper.readInt("Enter Customer ID > ");
		      int rewardPoint = Helper.readInt("Enter customer's reward point > ");

		      customerList.add(new Customer(customerName, customerID, rewardPoint));
		      System.out.println("Customer added.");

		    }

		    // ==================================== Option 2 View ====================================

		    public static String retrieveAllCustomer(ArrayList<Customer> customerList) {
		      String output = "";

		      for (int i = 0; i < customerList.size(); i++) {
		        output += String.format("%-30s %-30d %-30d\n", customerList.get(i).getCustomerName(),
		            customerList.get(i).getCustomerID(), customerList.get(i).getRewardPoint());

		      }
		      return output;

		    }

		    public static void viewAllCustomer(ArrayList<Customer> customerList) {
		      C206_CaseStudy.setHeader("CAMCORDER LIST");
		      String output = String.format("%-30s %-30s %-30s\n", "CUSTOMER NAME", "CUSTOMER ID", "CUSTOMER'S REWARD POINT");
		      output += retrieveAllCustomer(customerList);

		      System.out.println(output);
		    }

		    // ==================================== Option 3 Delete ====================================

		    public static void deleteCustomer(ArrayList<Customer> customerList) {
		      C206_CaseStudy.setHeader("DELETE CUSTOMER");

		      String deleteCustName = Helper.readString("Enter name of customer to delete > ");
		      int deleteCustID = Helper.readInt("Enter customer ID to delete >");

		      boolean custinfo = true;
		      int i = 0;

		      while (i < customerList.size()) {
		        Customer cust = customerList.get(i);
		        if (cust.getCustomerName().equalsIgnoreCase(deleteCustName) || cust.getCustomerID() == deleteCustID) {
		          custinfo = true;
		          break;
		        } else {
		          custinfo = false;

		        }
		        i++;
		      }
		      if (custinfo == true) {
		        customerList.remove(i);
		        System.out.println("Customer is deleted.");
		      } else {
		        System.out.println("Invalid customer details entered!");
		      }

		    }

		    // ================================ Option 4 Update Reward Point ================================

		    public static void updateRewardPoint(ArrayList<Customer> customerList) {
		      C206_CaseStudy.setHeader("UPDATE REWARD POINTS");

		      String customerName = Helper.readString("Enter customer name > ");
		      boolean isFound = false;

		      for (int i = 0; i < customerList.size(); i++) {
		        if (customerName.equalsIgnoreCase(customerList.get(i).getCustomerName())) {
		          int currentRewardPoint = Helper.readInt("Enter current reward points > ");
		          int newRewardPoint = Helper.readInt("Enter new reward points > ");
		          customerList.get(i).setRewardPoint(newRewardPoint);
		          
		        } else {
		          System.out.println("The reward point is unable to update.");
		        }
		        isFound = true;
		        break;
		      }
		      if (isFound == false)

		      {
		        System.out.println("This customer does not exist.");
		      }

		    }
		    //
		    public static void searchAllProduct(ArrayList<Product> productList) {
		    	  Helper.line(45, "=");
		    	  System.out.println("Search by vendor name");
		    	  Helper.line(45, "=");

		    	  String searchName = Helper.readString("Enter vendor name to search :");
		    	  String output = String.format("%-10s  %-25s %-40s %-55s %-70s %-55s %-40s %-15s\n ", "Product ID ",
		    	    "Product Description", "Product Category ", "Product Name", "Product Price", "Product Condition",
		    	    "Numbers of returns", "Vendor Name");
		    	  for (int i = 0; i < productList.size(); i++) {
		    	   if (productList.get(i).getVendorName().equalsIgnoreCase(searchName)) {
		    	    Product ppp = productList.get(i);
		    	    output += String.format("%-10d  %-25s %-40s %-55s $%-70.2f %-55s %-40d %-15s\n", ppp.getProductID(),
		    	      ppp.getProductDescription(), ppp.getProductCategory(), ppp.getProductName(),
		    	      ppp.getProductPrice(), ppp.getProductCondition(), ppp.getProductReturnNum(),
		    	      ppp.getVendorName());

		    	   }

		    	  }
		    	  System.out.println(output);
		    	 }

		    	 //
		    	 public static void UpdateVendorName(ArrayList<Product> productList) {
		    	  Helper.line(45, "=");
		    	  System.out.println("Update vendor name");
		    	  Helper.line(45, "=");
		    	  boolean isUpdate = false;

		    	  while (isUpdate == false) {
		    	   int ProductId=Helper.readInt("Enter the product ID : ");

		    	   // if wrong keep on ask
		    	   for (int i = 0; i < productList.size(); i++) {

		    	    if (ProductId == productList.get(i).getProductID()) {
		    	     String NVname = Helper.readString("Enter new vendor name: ");

		    	     productList.get(i).setVendorName(NVname);

		    	     System.out.println("You have successfully updated new vendor  name !");

		    	     isUpdate = true;
		    	    }
		    	   }
		    	   // break;

		    	   if (isUpdate == false) {
		    	    System.out.println("This user does not exist.");

		    	   }

		    	  }
		    	  

		    	 }

		    	 //
		    	 public static void updateReturns(ArrayList<Product> productList) {
		    	  Helper.line(45, "=");
		    	  System.out.println("Update numbers of returns");
		    	  Helper.line(45, "=");
		    	  boolean isUpdate = false;

		    	  while (isUpdate == false) {
		    	   int productID = Helper.readInt("Enter the product ID   : ");

		    	   // if wrong keep on ask
		    	   for (int i = 0; i < productList.size(); i++) {

		    	    if (productID == productList.get(i).getProductID()) {
		    	     int newRNum = Helper.readInt("Enter new return number: ");

		    	     productList.get(i).setProductReturnNum(newRNum);

		    	     System.out.println("You have successfully updated new return number!");

		    	     isUpdate = true;
		    	    }
		    	   }
		    	   // break;

		    	   if (isUpdate == false) {
		    	    System.out.println("This user does not exist.");

		    	   }

		    	  }

		    	 }
		    	 //
		    	 public static ArrayList<Product> Sorting(ArrayList<Product> productList) {
		    		  ArrayList<Product> sortinglist = new ArrayList<Product>();

		    		  while (productList != null) {

		    		   if (productList.size() >= 1) {
		    		    int highest = productList.get(0).getProductReturnNum();
		    		    Product a = productList.get(0);
		    		    for (Product p : productList) {

		    		     if (highest < p.getProductReturnNum()) {
		    		      highest = p.getProductReturnNum();
		    		      a = p;
		    		      
		    		     }

		    		    }

		    		    sortinglist.add(a);// add the product with the highest return number to the new list
		    		    productList.remove(a);// remove the product from the old list
		    		   } else {
		    		    break;
		    		   }

		    		  }

		    		  return sortinglist;

		    		 }

		    		 //
		    		 public static void displayAllProduct(ArrayList<Product> productList) {
		    		  productList = Sorting(productList);
		    		  Helper.line(45, "=");
		    		  System.out.println("Sorting the numbers of returns(descending order)");
		    		  Helper.line(45, "=");

		    		  if (productList.isEmpty()) {
		    		   System.out.println("There is no product available.");
		    		  } else {
		    		   out = String.format("%-10s  %-25s %-40s %-55s %-70s %-55s %-40s %-15s\n ", "Product ID ",
		    		     "Product Description", "Product Category ", "Product Name", "Product Price", "Product Condition",
		    		     "Numbers of returns", "Vendor Name");
		    		   for (int i = 0; i < productList.size(); i++) {
		    		    Product ppp = productList.get(i);
		    		    out += String.format("%-10d  %-25s %-40s %-55s $%-70.2f %-55s %-40d %-15s\n", ppp.getProductID(),
		    		      ppp.getProductDescription(), ppp.getProductCategory(), ppp.getProductName(),
		    		      ppp.getProductPrice(), ppp.getProductCondition(), ppp.getProductReturnNum(),
		    		      ppp.getVendorName());
		    		   }

		    		   System.out.println(out);
		    		  }

		    		  Product highest = productList.get(0);
		    		  for (int i = 0; i < productList.size(); i++) {
		    		   if (productList.get(i).getProductReturnNum() > highest.getProductReturnNum()) {
		    		    highest = productList.get(i);
		    		   }
		    		  }

		    		  System.out.println("The product with the  highest number of returns is  : " + highest.getProductName()
		    		    + " with numbers of returns  " + highest.getProductReturnNum());
		    		 }
		    		 //
		    		 public static void UpdateProductCondition(ArrayList<Product> productList) {
		    			  Helper.line(45, "=");
		    			  System.out.println("Update product condition");
		    			  Helper.line(45, "=");
		    			  boolean isUpdate = false;

		    			  while (isUpdate == false) {
		    			   int Productid = Helper.readInt("Enter the product ID   : ");
		    			   
		    			   
		    			   for (int i = 0; i < productList.size(); i++) {

		    			    if (Productid == productList.get(i).getProductID()) {
		    			     String NPCondition = Helper.readString("Enter the new  product condition   : ");

		    			     productList.get(i).setProductCondition(NPCondition);

		    			     System.out.println("You have successfully updated new number!");

		    			     isUpdate = true;
		    			    }
		    			   }
		    			   // break;

		    			   if (isUpdate == false) {
		    			    System.out.println("There is  no  such Product ID.");

		    			   }

		    			  }

		    			 }

		    			 //
		    			 

		    			//
		    			 public static Product inputProduct() {
		    			  int ID = Helper.readInt("Enter product ID: ");
		    			  String Description = Helper.readString("Enter  product description: ");
		    			  String Category = Helper.readString("Enter product category : ");
		    			  String PName = Helper.readString("Enter product name: ");
		    			  double Pprice = Helper.readDouble("Enter the product price: ");
		    			  String Pcondition = Helper.readString("Enter the product condition: ");
		    			  int PReturnNum = Helper.readInt("Enter the numbers of return for the product :");
		    			  String vendorName = Helper.readString("Enter vendor name  : ");

		    			  Product pp = new Product(ID, Description, Category, PName, Pprice, Pcondition, PReturnNum, vendorName);
		    			  return pp;
		    			 }

		    			 public static void addProduct(ArrayList<Product> productList, Product pp) {

		    			  productList.add(pp);
		    			  System.out.println("Product added");
		    			 }

		    			 //
		    			 
		    			  public static String retrieveAllProduct(ArrayList<Product> productList) {
		    			   String output = "";
		    			   
		    			   for (int i = 0; i < productList.size(); i++) { 
		    			    output +=String.format("%-84s\n", productList.get(i).toString()); 
		    			    
		    			   } 
		    			   
		    			   return output;
		    			   
		    			   }
		    			  //
		    			  public static String ViewAllproduct(ArrayList<Product> productList) {

		    				  //C206_CaseStudy.setHeader("Product LIST");
		    				  String output = String.format("%-10s  %-25s %-40s %-55s %-70s %-55s %-40s %-15s\n ", "Product ID ",
		    				    "Product Description", "Product Category ", "Product Name", "Product Price", "Product Condition",
		    				    "Numbers of returns", "Vendor Name");
		    				  output += retrieveAllProduct(productList);
		    				  
		    				  System.out.println("Product view");
		    				  return output;
		    				 }

		    				 public static Boolean dodeleteProduct(ArrayList<Product> productList,int productID ) {
		    				  
		    				  //C206_CaseStudy.ViewAllproduct(productList);
		    				 
		    				  
		    				  boolean isDelete = false;

		    				  for (int i = 0; i < productList.size(); i++) {
		    				   int id= productList.get(i).getProductID();

		    				   if (productList.get(i).getProductID()==id && productList.get(i).isAvailability() == true) {

		    				    productList.get(i). setAvailability(false);
		    				    isDelete = true;

		    				   }
		    				  }
		    				  System.out.println("Product delete");
		    				  return isDelete;
		    				 }

		    				 public static void deleteProduct(ArrayList<Product> productList) {
		    				  // write your code here
		    				 
		    				  int productID = readInt("Enter the product ID :");

		    				  Boolean isDelete = dodeleteProduct(productList, productID);
		    				  if (isDelete == false) {
		    				   System.out.println("Invalid product ID");
		    				  } else {
		    				   System.out.println("Product with  product ID :  " + productID + " is deleted ");
		    				  }
		    				           
		    				 }
		    				 public static boolean doUpdateproduct(ArrayList<Product> productList, int PRODUCTID) {
		    					  boolean isUpdate = false;
		    					 
		    					  for (int i = 0; i < productList.size(); i++) {
		    					   int productID= productList.get(i).getProductID();
		    					   if (PRODUCTID==productID ) {
		    					    String NVname = Helper.readString("Enter new vendor name: ");

		    					    productList.get(i).setVendorName(NVname);
		    					    isUpdate = true;

		    					   }
		    					  }
		    					  System.out.println("Product update");
		    					  return isUpdate;
		    					 }

		    					 public static void UpdateProduct(ArrayList<Product> productList) {
		    					  
		    					  int PRODUCTID = Helper.readInt("Enter the product ID: ");
		    					  Boolean isUpdate = doUpdateproduct(productList, PRODUCTID);

		    					  if (isUpdate == false) {
		    					   System.out.println("Invalid priduct ID ");
		    					  } else {
		    					   System.out.println("Product with  product ID " + PRODUCTID  + " is updated ");
		    					  }
		    					  
		    					 }
		    					 //update numbers of returns 
		    					 public static boolean doUpdate1product(ArrayList<Product> productList,int PRODUCTID) {
		    					  boolean isUpdate = false;
		    					  
		    					  for (int i = 0; i < productList.size(); i++) {
		    					   int productID= productList.get(i).getProductID();
		    					   if (PRODUCTID==productID) {
		    					    int ReturnsNum = Helper.readInt(" Enter new numbers of return: ");

		    					    productList.get(i).setProductReturnNum(ReturnsNum );
		    					    
		    					    isUpdate = true;
		    					   }
		    					  }
		    					  System.out.println("Product updated");
		    					  return isUpdate;
		    					 }

		    					 public static void Update1Product(ArrayList<Product> productList) {
		    					  
		    					  int PRODUCTID = Helper.readInt("Enter the product ID: ");
		    					  Boolean isUpdate = doUpdate1product(productList, PRODUCTID);

		    					  if (isUpdate == false) {
		    					   System.out.println("Invalid priduct ID");
		    					  } else {
		    					   System.out.println("Product with  product ID " + PRODUCTID  + " is updated ");
		    					  }
		    					 }
		    					 //
		    					 public static boolean doUpdate2product(ArrayList<Product> productList,int pRODUCTID ) {
		    						  boolean isUpdate = false;
		    						  
		    						  for (int i = 0; i < productList.size(); i++) {
		    						   int productID= productList.get(i).getProductID();
		    						   if (productID==pRODUCTID) {
		    						    String condition = Helper.readString(" Enter new condition: ");

		    						    productList.get(i).setProductCondition(condition);
		    						    
		    						    isUpdate = true;
		    						   }
		    						  }
		    						  System.out.println("Product updated");
		    						  return isUpdate;
		    						 }

		    						 public static void Update2Product(ArrayList<Product> productList) {
		    						  
		    						  int pRODUCTID = Helper.readInt("Enter the product ID: ");
		    						  Boolean isUpdate = doUpdate2product(productList, pRODUCTID);

		    						  if (isUpdate == false) {
		    						   System.out.println("Invalid priduct ID");
		    						  } else {
		    						   System.out.println("Product with  product ID " + pRODUCTID  + " is updated ");
		    						  }
		    						 }

		    						 private static int readInt(String string) {
		    						  // TODO Auto-generated method stub
		    						  return 0;
		    						 }
		    						
		    

		    // ================================ Option 5 Top Customer Reward Point ================================

		    public static void topRewardPoint(ArrayList<Customer> customerList) {
		      C206_CaseStudy.setHeader("TOP CUSTOMER REWARD POINT");

		      Customer highCT = customerList.get(0);
		      for (int i = 0; i < customerList.size(); i++) {
		        Customer highestCust = customerList.get(i);
		      

		        if (highestCust.getRewardPoint() > highCT.getRewardPoint()) {
		          highCT = highestCust;
		          
		          highestCust.displayCustomer();
		        }
		      }
		    }
		    
		  public static void menu() {
			    C206_CaseStudy.setHeader("Select option");
			    System.out.println("1. Procedure");
			    System.out.println("2. Transaction");
			    System.out.println("3. Product");
			    System.out.println("4. Customer");
			    System.out.println("5. Exit");
			    Helper.line(80, "-");
			  }
		  
		  public static void procedureMenu() {
		    C206_CaseStudy.setHeader("Procedure");
		    System.out.println("1. Add Procedure");
		    System.out.println("2. View Procedure");
		    System.out.println("3. Delete Procedure");
		    System.out.println("4. Update Procedure");
		    System.out.println("5. Search Procedure");
		    System.out.println("6. Quit");
		    Helper.line(80, "-");
		  }
		  public static void productMenu() {
			  C206_CaseStudy.setHeader("Diso APP");
			  System.out.println("1. Display product list");
			  System.out.println("2. Add product list");
			  System.out.println("3. Delete produt list");
			  System.out.println("5. Quit");
			  Helper.line(80, "-");
			 }
		  public static void customerMenu() {
			    C206_CaseStudy.setHeader("CUSTOMER LIST");
			    System.out.println("1. Add Customer");
			    System.out.println("2. View Customer");
			    System.out.println("3. Delete Customer");
			    System.out.println("4. Update Reward Points");
			    System.out.println("5. Top customer reward points");
			    System.out.println("4. QUIT");
			    Helper.line(80, "-");
			  }
		  public static void setHeader(String header) {
		    Helper.line(80, "-");
		    System.out.println(header);
		    Helper.line(80, "-");
		  }
		// TODO Auto-generated method stub

 		 public static void Productmenu() {
 		  C206_CaseStudy.setHeader1("Diso APP");
 		  System.out.println("1. Display product list");
 		  System.out.println("2. Add product list");
 		  System.out.println("3. Delete produt list");
 		  System.out.println("4. Search product by vendor name");
 		  System.out.println("5. Numbers of products returned");
 		  System.out.println("6. Update product condition ");
 		  System.out.println("8. Quit");
 		  Helper.line(80, "-");
 		 }
 		 public static void setHeader1(String header) {
 			  Helper.line(80, "-");
 			  System.out.println(header);
 			  Helper.line(80, "-");

 			 }

 			 public static void ItemTypeMenu1() {
 			  C206_CaseStudy.setHeader("ITEM TYPES");
 			  System.out.println("1. Search product by vendor name");
 			  System.out.println("2. Update vendor name to a new ");
 			 }

 			 public static void productTypeMenu1() {
 			  C206_CaseStudy.setHeader("PRODUCT TYPES");
 			  System.out.println("1. Update new numbers of returns");
 			  System.out.println("2. The highest to the lowest numbers of returns");
 			 }
} 

