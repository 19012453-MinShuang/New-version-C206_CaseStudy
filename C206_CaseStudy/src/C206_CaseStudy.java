import java.util.ArrayList;

public class C206_CaseStudy {
	
		  private static final int quit_MainProgram = 5;
		private static final int customer = 4;
		private static final int product = 3;
		private static final int Procedure = 1;
		private static final int QUITPROCEDURE = 4;
		  private static final int DELETEPROCEDURE = 3;
		  private static final int VIEWPROCEDURE = 2;
		  private static final int ADDPROCEDURE = 1;
		  private static final int OPTION_ARCHIVE = 3;
		  private static final int OPTION_ADD = 1;
		  private static final int OPTION_VIEW = 2;
		  private static final int OPTION_ADD_VIEW_ARCHIVE = 2;
		  private static final int _5 = 5;
		  private static final int OPTION_QUIT = _5;
		  private static final int QUIT = 4;
		  private static final int DELETE_CUSTOMER = 3;
		  private static final int VIEW_CUSTOMER = 2;
		  private static final int ADD_CUSTOMER = 1;
		  private static final int END = 4;
		  public static void main(String[] args) {
		    
		    ArrayList <procedure> procedureList = new ArrayList <procedure>(); 
		    
		    ArrayList <Customer> customerList = new ArrayList <Customer>();
		    ArrayList <Transaction> TransactionList = new ArrayList<Transaction>();
		    ArrayList <Transaction> ArchiveTransactionList = new ArrayList<Transaction>();
		    ArrayList <Product> productList = new ArrayList<Product> ();
		    
		    productList.add(new Product(0, "Pork", "Food", "China Pork", "LiuJiaZhuRou"));
		    productList.add(new Product(1, "Toothbrush", "Household", "Janpan toothbrush", "YuKu Brush"));
		    
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
		    			else if (option == QUITPROCEDURE) {
		    				System.out.println("Bye");
		    			}
		    			else {
		    				System.out.println("Invalid Option.");
		    			}
		    		}
		    	}
		    	else if (option == OPTION_ADD_VIEW_ARCHIVE) { //ZunHui
		             System.out.println("1. Add");
		             System.out.println("2. View All");
		             System.out.println("3. Archive");  
		             int suboption=Helper.readInt("Enter option :");
		             if(suboption==OPTION_ADD) {
		               C206_CaseStudy.addTransaction(TransactionList);
		             }else if(suboption==OPTION_VIEW) {
		               C206_CaseStudy.viewTransaction(TransactionList);
		             }else if(suboption==OPTION_ARCHIVE) {
		               C206_CaseStudy.archiveOldTransaction(TransactionList, ArchiveTransactionList);
		             }else {
		               System.out.println("Invalid option");
		             }
		    	}
		    	else if (option == product) { //LanXin
		    		C206_CaseStudy.productMenu(); 
		    		   option = Helper.readInt("Enter an option > ");

		    		   if (option == 1) {
		    		    // View all product
		    		    C206_CaseStudy.viewAllProduct(productList);
		    		   } else if (option == 2) {

		    		    // Add product

		    		    C206_CaseStudy.addProduct(productList); 
		    		   } else if (option == 3) {

		    		    // delete product
		    		    C206_CaseStudy.deleteAllProduct(productList);

		    		   } else if (option == 5) {
		    		    System.out.println("Bye!");
		    		   } else {
		    		    System.out.println("Invalid option");
		    		   }
		    		  }
		    	else if (option == customer) { //MinShuang
		    		C206_CaseStudy.menu();
		    	      option = Helper.readInt("Enter an option > ");

		    	      if (option == ADD_CUSTOMER) {
		    	        // Add customer
		    	        Customer cust = inputCustomer();
		    	        C206_CaseStudy.addCustomer(customerList, cust);
		    	        
		    	      } else if (option == VIEW_CUSTOMER) {
		    	        // View customer
		    	        if (customerList.isEmpty()) {
		    	          System.out.println("Customer List is empty.");
		    	        } else {
		    	          C206_CaseStudy.viewCustomer(customerList);
		    	        }

		    	      } else if (option == DELETE_CUSTOMER) {
		    	        // Delete customer
		    	        if (customerList.isEmpty()) {
		    	          System.out.println("Customer List is already empty");
		    	        } else {
		    	          C206_CaseStudy.deleteCustomer(customerList);
		    	        }

		    	      } else if (option == QUIT) {
		    	        System.out.println("Bye!");
		    	      } else {
		    	        System.out.println("Invalid option");
		    	      }
		    	    }
		    	else if (option == quit_MainProgram) {
		    		System.out.println("Bye");
		    	}
		    	else {
		    		System.out.println("Invalid Option");
		    	}
		    	  }

		    	 
		    		 
		    	
		    
		
		
	  }
		//Procedure -done by Elizabeth
		public static void addProcedure(ArrayList<procedure> procedureList) {
			int AdminID = Helper.readInt("Enter Administrator ID >");
			int ProcID = Helper.readInt("Enter Procedure ID >");
			String ProcName = Helper.readString("Enter Procedure Name >");
			
			procedureList.add(new procedure(AdminID, ProcID, ProcName));
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
		       output += String.format("%d %-20d %-20d %-20s \n", (i+1),procedureList.get(i).getAdminstrator_id(), procedureList.get(i).getProcedure_id(), procedureList.get(i).getProcedure());
		    }
		    return output;
		  }
		  public static void viewProcedureList(ArrayList<procedure>procedureList) {
		    C206_CaseStudy.setHeader("Procedure List");
		    String output = String.format("%s %-20s %-20s %-20s \n", "No.", "Adminstrator ID", "Procedure ID", "Procedure");
		    output += retrieveProcedureList(procedureList);
		    System.out.println(output);
		  }
		  //Transaction - done by ZunHui
		//=================Add====================================
		    public static void addTransaction(ArrayList<Transaction> TransactionList) {
		        int transcationID= Helper.readInt("Transaction ID:");
		        String customername=Helper.readString("Name of customer:");
		        String productname=Helper.readString("Name of product:");
		        String staffname=Helper.readString("Name of staff handling the return:");
		        Transaction tra=new Transaction(transcationID, customername, productname, staffname);
		        TransactionList.add(tra);
		        System.out.println("Transaction added");
		        
		        
		      }
		    public static void addTransaction(ArrayList<Transaction> transactionList, Transaction t) {

		        transactionList.add(t);
		        System.out.println("Transaction added");
		      }
		  //=================view all=================================
		    public static String retrieveAllTransaction(ArrayList<Transaction> TransactionList) {
		      String output="";
		      for (int i = 0; i < TransactionList.size(); i++) {
		        output += String.format("%-25d %-25s %-25s %-25s \n", TransactionList.get(i).getTranscationID(),TransactionList.get(i).getCustomername(),TransactionList.get(i).getProductname(),
		            TransactionList.get(i).getStaffname());
		      }
		      return output;
		    }
		    public static void viewTransaction(ArrayList<Transaction> TransactionList) {
		      Helper.line(80, "-");
		      System.out.println("TRANSACTION LIST");
		      Helper.line(80, "-");
		      String output = String.format("%-25s %-25s %-25s %-25s \n", "TRANSACTION ID", "CUSTOMER NAME",
		          "PRODUCT NAME","STAFF HANDLING NAME");
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
		  //Product - done by LanXin
		 // Write the code for the viewAllProduct method.
		    // Note: This method is a public static method that takes in an ArrayList of
		    // Product objects.
		    public static void viewAllProduct(ArrayList<Product> productList) {
		     Helper.line(45, "=");
		     System.out.println("Product List");
		     Helper.line(45, "=");

		     if (productList.isEmpty()) {
		      System.out.println("There is no product available.");
		     } else {
		      String out = String.format("%-10s  %-5s %-15s %-20s %-5s\n ", "Product ID ", "Product Description",
		        "Product Category ", "Product Name", "Vendor Name");
		      for (int i = 0; i < productList.size(); i++) {
		       Product ppp = productList.get(i);//
		       out += String.format("%-10d %-20s %-20s  %-19s"
		         + " %-5s\n", ppp.getProductID(), ppp.getProductDescription(),
		         ppp.getProductCategory(), ppp.getProductName(), ppp.getVendorName());
		      }
		      System.out.println(out);
		     }
		    }

		    // add
		    public static void addProduct(ArrayList<Product> productList) {
		     int ID = Helper.readInt("Enter product ID: ");
		     String Description = Helper.readString("Enter  product description: ");
		     String Category = Helper.readString("Enter product category : ");
		     String PName = Helper.readString("Enter product name: ");
		     String vendorName = Helper.readString("Enter vendor name  : ");
		     
		     //duplicating
		     boolean isDuplicate = false;
		     for (int i = 0; i <productList.size(); i++) {
		      if(ID ==productList.get(i).getProductID() || PName.equalsIgnoreCase(productList.get(i).getProductName())) {
		       
		      System.out.println("This product  already exists!");
		      isDuplicate = true;
		      break;
		      }
		     }
		     
		      if (isDuplicate == false) {
		       productList.add(new Product(ID,Description,Category,PName,vendorName));
		       System.out.println(" New product added!");
		      }
		    
		    }
		    public static void deleteAllProduct(ArrayList<Product> productList) {
		     Helper.line(45, "=");
		     System.out.println("Delete product");
		     Helper.line(45, "=");
		     
		     boolean isFound = false;
		     
		     int id = Helper.readInt("Enter peoduct ID to delete item: ");
		     String confirm = Helper.readString("Are you sure you want to delete product from list?(Y/N): ");
		     for (int i = 0; i < productList.size(); i++) {
		      if (productList.get(i).getProductID() == id) {
		       if (confirm.equalsIgnoreCase("y")) {
		        isFound = true;

		       }
		      
		      } else {
		       System.out.println("Invalid Product ID");

		      }
		      if (isFound == true) {
		       productList.remove(i);
		       System.out.println("Successfully deleted");
		      }
		     }
		    }
		    //Customer - done by MinShuang
		 // ================================= Option 1 Add =================================
		    private static Customer inputCustomer() {
		      int customerID = Helper.readInt("Enter customer ID > ");
		      String customerName = Helper.readString("Enter customer name > ");
		      Customer cust = new Customer(customerID, customerName);
		      return cust;
		    }

		    public static void addCustomer(ArrayList<Customer> customerList, Customer cust) {
		      customerList.add(cust);
		      System.out.println("Customer is added");
		    }
		    
		    // ================================= Option 2 View =================================
		    public static String retrieveCustomer(ArrayList<Customer> customerList) {
		    String output = "";
		      
		     for (int i = 0; i < customerList.size(); i++) { 
		       output += String.format("%-84s\n", customerList.get(i).toString()); 
		     } 
		     return output;
		     
		     }

		    public static void viewCustomer(ArrayList<Customer> customerList) {
		      C206_CaseStudy.setHeader("CUSTOMER LIST");
		      String output = String.format("%-10d %-30s\n", "CUSTOMER ID", "CUSTOMER NAME");
		      for (int i = 0; i < customerList.size(); i++) {   
		        output += String.format(customerList.get(i).toString());
		      }
		      System.out.println(output);
		    }

		    // ================================= Option 3 Delete =================================
		    public static void deleteCustomer(ArrayList<Customer> customerList) {
		      
		      String deleteCust = Helper.readString("Enter customer name to delete > ");
		      
		      boolean isDeleted = true;
		      int i = 0;

		      while (i < customerList.size()) {
		        if (customerList.get(i).getCustomerName().equals(deleteCust)) {
		          isDeleted = true;
		          break;
		        } else {
		          isDeleted = false;

		        }
		        i++;
		      }

		      if (isDeleted == true) {
		        customerList.remove(i);
		        System.out.println("Customer has been deleted");
		      } else {
		        System.out.println("Invalid ID");
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
		    System.out.println("4. Quit");
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
			    System.out.println("1. View Customer");
			    System.out.println("2. Add Customer");
			    System.out.println("3. Delete Customer");
			    System.out.println("4. QUIT");
			    Helper.line(80, "-");
			  }
		  public static void setHeader(String header) {
		    Helper.line(80, "-");
		    System.out.println(header);
		    Helper.line(80, "-");
		  }
} 

