import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
//Done by Zun Hui  
  private static Transaction t1;
  private static Transaction t2;
  
  //Done by Zun Hui
  private ArrayList<Transaction> TransactionList;
  private ArrayList<Transaction> ArchiveList;

  //Done by Elizabeth
  private procedure p; 
  private procedure p1; 
  private ArrayList <procedure> procedureList; 
  
  //Done by Min Shuang
  private Customer customer1;
  private Customer customer2;
  private ArrayList <Customer> customerList;
  
  //Done by Lan Xin
  private Product pp1;
  private Product pp2 ;

  private ArrayList<Product> productList;
  
  public C206_CaseStudyTest() {
    super();
  }
  @Before
  public void setUp() throws Exception {
    //Done by Zun Hui
    //Prepare the test data
      //Transaction ID
	  t1 = new Transaction(9000, 1, "container","Mary","Refund", "Completed");
      t2 =new Transaction(9000,2, "container","Mary","Refund", "Completed" );   
  }

  @After
  public void tearDown() throws Exception {

  }
        //Done by Zun Hui(Transaction)
            //=======Add Transaction========
            public void addTransactionTest() {
                // Item list is not null, so can add a new item(Normal)
                assertNotNull("Test if there is valid Transaction arraylist to add to", TransactionList);
                
                //The item just added is as same as the first item of the list - can be used to test error(Error)
                assertSame("Test that Transaction is added same as 1st item of the list?", t1, TransactionList.get(0));
                
                //Add another item. Test that the size of the list is 2?(Boundary)
                C206_CaseStudy.addTransaction(TransactionList, t2);
                assertEquals("Test that Transaction arraylist size is 2?", 2, TransactionList.size());
            }
          //========View transaction============
                
                public void retrieveAllTransactions() {
                    // Test if Item list is not null but empty, so that can add a new item.There will have error if lift is null)
                    assertNotNull("Test if there is valid Camcorder arraylist to add to", TransactionList);
                    
                    //Test if the list of Transaction retrieved is empty(Normal)
                        String allTransaction= C206_CaseStudy.retrieveTransactionList(TransactionList);
                        String testOutput = "";
                        assertEquals("Check that ViewAllCamcorderlist", testOutput, allTransaction);
                        
                    //Given an empty list, after adding 2 items, test if the size of the list is 2(Boundary)
                    C206_CaseStudy.addTransaction(TransactionList, t1);
                    C206_CaseStudy.addTransaction(TransactionList, t2);
                    assertEquals("Test if that Camcorder arraylist size is 2?", 2, TransactionList.size());
                }
          //===========Archive Transaction=============
                    public void archiveTransactionInfoTest() {
                        ArrayList<Transaction> archiveList = null;
                        
                        //After archiving an old transaction, transaction list size will reduce(Normal);
                        C206_CaseStudy.archiveOldTransaction(TransactionList, archiveList);
                        assertEquals("Test if transaction arraylist is 0", 0, TransactionList.size());
                      
                        //After archiving an old transaction, transaction list should not consist the old transaction again(Error);
                        C206_CaseStudy.archiveOldTransaction(TransactionList, archiveList);
                        assertEquals("Test if transaction arraylist still consists the old transaction", 0, TransactionList);
                      
                        //Transaction list cannot be null before archiving an old transaction(Boundary);
                        
                        assertNotNull("Test if an old transaction can be archived despite transaction list being null", TransactionList);
                        
                    }
                   //===========Update Transaction=============
              public void updateTransactionTest() {
                    		                    
                    		                        
             //After updating an old transaction, the transaction status will be updated.(Normal);
              assertNotNull("Test if there is valid Transaction arraylist to update to", TransactionList);
                    		                      
              //The transaction's status is same as the previous item status - can be used to test error(Error)
             assertSame("Test that Transactions status is same as the previous one?", t1, TransactionList.get(0));
                    		                      
              //Transaction cannot be empty when updating(Boundary)
              assertNotNull("Test if transaction can be updated  despite transaction list being null", TransactionList);
                    		                  
                    		                        
                    		                      }

                  //Done by Elizabeth(Procedure)
                  @Before
                  public void setUp3() throws Exception {
                    p = new procedure (1, 1, "hello", "11/22/2020");  
                    procedureList = new ArrayList<procedure>(); 
                  }
                  @After
                  public void tearDown1() throws Exception {
                    p=null; 
                    procedureList = null;  
                  }
                  @Test
                  public void add_proceduretest() {
                    //fail("Not yet implemented");
                    assertTrue("C206_CaseStudy_SampleTest",true);
                    //ADD NORMAL
                    //if a procedure is added, procedure list should increase
                    C206_CaseStudy.addProcedure(procedureList); 
                    assertNotEquals("Test if procedure list is updated?",0, procedureList);
                    
                    //ADD BOUNDARY
                    assertNotNull("Check if there is valid Procedure ArrayList to add to",procedureList);   
                  }
                  public void view_proceduretest() { 
                    //VIEW NORMAL
                    //procedure ArrayList should increase after administrator adds procedure
                    C206_CaseStudy.addProcedure(procedureList);
                    assertNotEquals("Test if new Procedure ArrayList has updated information",0, procedureList);
                    
                    //VIEW BOUNDARY
                    //ensure there are procedures in the procedure ArrayList  for it to be displayed and viewed
                    assertNotNull("Test if there is valid Procedure arraylist to retrieve item from",procedureList );
                    
                    //VIEW ERROR 
                    //if an item does not exist in the ProcedureList, it should not be displayed
                    String viewProcedureList = C206_CaseStudy.retrieveProcedureList(procedureList);
                    String testoutput = "";
                    assertEquals("Test if procedure can be viewed if it is not available", testoutput, viewProcedureList);
                  }
                  public void delete_proceduretest() {
                    //DELETE NORMAL
                    //procedure ArrayList should decrease after administrator deletes procedure
                    
                    //DELETE BOUNDARY
                    //Test if procedure ArrayList is not null 
                    assertNotNull("Test if there is valid procedure ArrayList to delete procedures", procedureList);
                    
                    //DELETE ERROR
                    //procedure that the administrator deleted should not be displayed 
                    C206_CaseStudy.delProcedure(procedureList);
                    assertEquals("Test if Procedure ArrayList is available",0, procedureList);
                  }
                  public void update_proceduretest() { 
                	  //UPDATE NORMAL
                	  C206_CaseStudy.addProcedure(procedureList); 
                	  C206_CaseStudy.updateProcedure(procedureList);
                	  assertSame("Test that procedure added and updated is same as first item of list", p, procedureList.get(0)); 
                	 
                	  //UPDATE ERROR
                	  C206_CaseStudy.updateProcedure(procedureList); 
                	  assertNotSame("Test that procedure updated is not the same as first item of list", p, procedureList.get(0));    	  
                  }
                	  
                
                  
                  //Done by Min Shuang(Customer)
                  @Before
                  public void setUp2() throws Exception {
                    // Prepare test data
                    customer1 = new Customer("Min Shuang", 19000, 500);
                	customer2 = new Customer("Alice Tan", 18000, 800);
                    customerList = new ArrayList<Customer>();
                  }
                  public void viewAllCustomer() {
                	    //NORMAL: After adding 2 customers in an empty list, test if able to view 2 customers in the list 
                	    //The customer just added is as same as the third item of the list
                	    C206_CaseStudy.addCustomer(customerList);
                	    assertEquals("Test that Customer arraylist size is 2", 2, customerList.size());
                	    assertSame("Test that customer is added", customer2, customerList.get(1));
                	    
                	    //BOUNDARY: Test if empty Customer list is not null 
                	    assertNotNull("Test if there is valid Customer arraylist to view the customers", customerList);
                	    
                	    //ERROR: If customer does not exist in the list, it cannot be viewed
                	    C206_CaseStudy.viewAllCustomer(customerList);
                	    assertEquals("Test if customer exist in the customer arraylist", 0, customerList);
                	  }
                	  
                	  @Test
                	  public void deleteCustomer() {
                	    //NORMAL: Number of customer in the list will decrease by 1 after one customer is deleted
                	    C206_CaseStudy.deleteCustomer(customerList);
                	    assertEquals("Check that arraylist is 0", 0, customerList.size());
                	    
                	    //BOUNDARY: Selecting more than 100 customers to delete from the list, 
                	            //  it will not be able to display as the system has a limit of 100 customers only. 
                	    
                	    C206_CaseStudy.deleteCustomer(customerList);
                	    assertEquals("Check that arraylist has a limit of 100", 100, customerList.size());
                	    
                	    //ERROR: If the customer name does not exist in the list, nothing can be deleted
                	    C206_CaseStudy.deleteCustomer(customerList);
                	    assertEquals("Test if customer exist in the customer arraylist", 0, customerList);

                	  }
                	  
                	  @Test
                	  public void updateRewardPoint() {
                	    //NORMAL: Select a customer to update his/her reward points, it will display updated reward points
                	    C206_CaseStudy.updateRewardPoint(customerList);
                	    assertEquals("Test if customer's reward point has been updated", "Updated", customerList);
                	    
                	    //BOUNDARY: Selecting more than 100 customers to update their reward points,
                	        //  unable to display due to system having a limit of 100 customers
                	    C206_CaseStudy.updateRewardPoint(customerList);
                	    assertEquals("Check that arraylist has a limit of 100", 100, customerList.size());
                	    
                	    //ERROR: Customer name does not exist in the list, it cannot be updated
                	    C206_CaseStudy.updateRewardPoint(customerList);
                	    assertEquals("Test if customer exist in the customer arraylist", 0, customerList);
                	  }
                	  
                	  public void topRewardPoint() {
                	    //NORMAL: Select "Top Customer Reward Point", system will display the customer with highest reward point
                	    C206_CaseStudy.topRewardPoint(customerList);
                	    assertEquals("Test if top customer is displayed", "Top customer displayed", customerList);

                	    //BOUNDARY: Customer list should not be null before finding top customer reward point
                	    assertNotNull("Test if there is valid Customer arraylist to view the reward points of customers", customerList);
                	    
                	    //ERROR: Finding top customer point, system displays the lowest reward point
                	    C206_CaseStudy.topRewardPoint(customerList);
                	    assertNotEquals("Test if top customer is displayed", "Top customer displayed", customerList);
                	  }
                  @After
                  public void tearDown2() throws Exception {
                    customer1 = null;
                    customerList = null;
                  }
                  //Done by Lan Xin(Product)
                  @Before
                  public void setUp1() throws Exception {
                	  pp1= new Product(0, "Pork", "Food", "China Pork", 8.9, "Exchange", 8, "LiuJiaZhuRou");
                	  pp2= new Product(1, "Toothbrush", "Household", "Janpan toothbrush",7.8, "Refund" , 7, "YuKu Brush");

                	  productList= new ArrayList<Product>();
                	  
                	 }
 @After
 public void tearDown() throws Exception {
 pp1 = null;
 pp2 = null;
 productList = null;
 
}

 @Test
 public void addProductTest() {
 //fail("Not yet implemented"); 
 assertTrue("C206_CaseStudy_SampleTest ",true);

 //ADD
 // Item list is not null, so that can add a new item-(boundary)
 
 C206_CaseStudy.addProduct(productList, pp1);
 C206_CaseStudy.addProduct(productList, pp2);
 assertEquals("Test that product arraylist size is 2", 2, productList.size());
 //Test whether product name entered matched with its vendor name 
 C206_CaseStudy.addProduct(productList, pp1); 
 assertSame("Test that Product is added same as 1st item of the list?", pp1, productList.get(0));
 
 //
 //Add another item. test The size of the list is 2 or not the same
 C206_CaseStudy.addProduct(productList, pp2);
   assertNotSame("Test that Product arraylist size is 2 or not the same ?",2, productList.size());
  }
  @Test
public void ViewAllProductTest() {
   
   // Test if product list is not null but empty-boundary
   
                 String allProduct2 = C206_CaseStudy.ViewAllproduct(productList);
   
   String testOutput2 = String.format("%-10d  %-25s %-40s %-55s %-70.2f %-55s %-40d %-15s\n",0, "Pork", "Food", "China Pork", 8.9, "Exchange", 8, "LiuJiaZhuRou");
   testOutput2 += String.format("%-10d  %-25s %-40s %-55s %-70.2f %-55s %-40d %-15s\n",1, "Toothbrush", "Household", "Janpan toothbrush", 7.8, "Refund", 7, "YuKu Brush");

   assertNotNull("Test if there is valid Camcorder arraylist to retrieve item",productList);
   // Normal
   
   String allProduct= C206_CaseStudy.ViewAllproduct(productList);
   String testOutput = String.format("%-10d  %-25s %-40s %-55s %-70.2f %-55s %-40d %-15s\n",0, "Pork", "Food", "China Pork", 8.9, "Exchange", 8, "LiuJiaZhuRou");
   testOutput += String.format("%-10d  %-25s %-40s %-55s %-70.2f %-55s %-40d %-15s\n",1, "Toothbrush", "Household", "Janpan toothbrush", 7.8, "Refund", 7, "YuKu Brush");

   assertNotNull("Test if there is valid Camcorder arraylist to retrieve item",productList);
  
  //Error
                    
   String allProduct1= C206_CaseStudy.ViewAllproduct(productList);
   String testOutput1 = String.format("%-10d  %-25s %-40s %-55s %-70.2f %-55s %-40d %-15s\n",0, "Pork", "Food", "China Pork", 8.9, "Exchange", 8, "LiuJiaZhuRou");
   testOutput1 += String.format("%-10d  %-25s %-40s %-55s %-70.2f %-55s %-40d %-15s\n",1, "Toothbrush", "Household", "Janpan toothbrush", 7.8, "Refund", 7, "YuKu Brush");

   assertNotSame("Test if there is valid product arraylist to retrieve item",productList);
  }
 
  @Test
       public void deleteAllProductTest() {
        //boundary
        assertNotNull("Test if there is valid Product arraylist to delete ", productList);
        C206_CaseStudy.dodeleteProduct(productList, 0);
     //error
     Boolean isDelete = C206_CaseStudy. dodeleteProduct(productList, 0);
     assertFalse("Test if available prodduct China Pork is returned -false?",isDelete);  
     
     //error
     isDelete= C206_CaseStudy.dodeleteProduct(productList,9);
     assertFalse("Test if non-existing product Russia  is deleted - false?", isDelete);
     //normal
     Boolean isDelete1 = C206_CaseStudy.dodeleteProduct(productList, 0);
     assertFalse("Test if available prodduct China Pork is deleted -false?",isDelete1);      
}
  @Test
    public void UpdateProductTest() {
          //boundary
          assertNotNull("Test if there is valid vendor name  in the productlist to update! ", productList);
                  C206_CaseStudy.doUpdateproduct(productList, 0 );
               //error
               Boolean isUpdate = C206_CaseStudy. doUpdateproduct(productList, 0);
               assertFalse("Test if valid vendor name is updated  -false?",isUpdate);  
               
               //error
               isUpdate= C206_CaseStudy.doUpdateproduct(productList,9);
               assertFalse("Test if non-exsisted  vendor name  can  updated  - false?", isUpdate);
               //normal
               isUpdate = C206_CaseStudy.doUpdateproduct(productList, 0);
               assertFalse("Test if available vendor name  is updated  -false?",isUpdate);      
          }
               //
          @Test
            public void Update1Product1Test() {
                  //boundary
                  assertNotNull("Test if there is valid  numbers of return  in the productlist to update!", productList);
                  C206_CaseStudy.doUpdate1product(productList, 0);
               //error
               Boolean isUpdate= C206_CaseStudy. doUpdate1product(productList, 0);
               assertFalse("Test if available numbers of return is updated -false?",isUpdate);  
               
               //error
               isUpdate= C206_CaseStudy.doUpdate1product(productList,9);
               assertFalse("Test if non-exsisted numbers of return  can  update- false?", isUpdate);
               //normal
              isUpdate = C206_CaseStudy.doUpdate1product(productList, 0);
               assertFalse("Test if available numbers of return  is updated  -false?",isUpdate);      
          }
          @Test
          public void Update2Product1Test() {
                 //boundary
                 assertNotNull("Test if there is valid  prodcut condition is   in the productlist to update!", productList);
                 C206_CaseStudy.doUpdate2product(productList, 0);
              //error
              Boolean isUpdate= C206_CaseStudy. doUpdate2product(productList, 0);
              assertFalse("Test if available product condition  is updated -false?",isUpdate);  
              
              //error
              isUpdate= C206_CaseStudy.doUpdate2product(productList,9);
              assertFalse("Test if non-existing product condition  can update - false?", isUpdate);
              //normal
             isUpdate = C206_CaseStudy.doUpdate2product(productList, 0);
              assertFalse("Test if available prodcution is updated -false?",isUpdate);      
         }
       }              
                        

                 
         
       
         
             
             


@Test
public void c206_test() {
 //fail("Not yet implemented"); 
 assertTrue("C206_CaseStudy_SampleTest ",true);
}

}
