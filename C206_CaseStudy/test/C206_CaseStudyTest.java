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
      t1 = new Transaction(9000,"John","container","Mary");
      t2 =new Transaction(9000,"John","container","Mary");
      
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

                  //Done by Elizabeth(Procedure)
                  @Before
                  public void setUp1() throws Exception {
                    p = new procedure (1, 1, "hello");  
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
                    C206_CaseStudy.addProcedure(procedureList,p); 
                    assertNotEquals("Test if procedure list is updated?",0, procedureList);
                    
                    //ADD BOUNDARY
                    assertNotNull("Check if there is valid Procedure ArrayList to add to",procedureList);   
                  }
                  public void view_proceduretest() { 
                    //VIEW NORMAL
                    //procedure ArrayList should increase after administrator adds procedure
                    C206_CaseStudy.addProcedure(procedureList,p);
                    assertNotEquals("Test if updated Procedure ArrayList can be viewed",0, procedureList);
                    
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
                    assertNotNull("Test if there is valid procedure ArrayList to delete  procedures", procedureList);
                    
                    //DELETE ERROR
                    //procedure that the administrator deleted should not be displayed 
                    C206_CaseStudy.deleteProcedure(procedureList);
                    assertEquals("Test if Procedure ArrayList is available",0, procedureList);
                  }
                  
                  
                  //Done by Min Shuang(Customer)
                  @Before
                  public void setUp2() throws Exception {
                    // Prepare test data
                    customer1 = new Customer(2000, "Min");
                    customer2 = new Customer(2001, "Shuang");
                    customerList = new ArrayList<Customer>();
                  }
                  
                  @Test
                  public void addCustomer() {
                    //NORMAL: Given an empty customerList, after adding 1 customer, the number of customers in the list is 1    
                    C206_CaseStudy.addCustomer(customerList, customer1);
                    assertEquals("Test if customer Arraylist size is 1?", 1 , customerList.size());
                    
                  //BOUNDARY: Customer list cannot be null before adding in new customer
                    assertNotNull("Test if there is valid Customer arraylist to add to", customerList);
                    
                    //ERROR: Added Customer’s name with special characters or number, the output will display an error 
                    C206_CaseStudy.addCustomer(customerList, customer1);
                    assertEquals("Test if the customer name has any special characters or number keyed", "Error", customerList);
                    
                  }
                  
                  @Test
                  public void viewCustomer() {
                    //NORMAL: Given an empty list, after adding 2 customers, test if able to view 2 customers in the list 
                    C206_CaseStudy.addCustomer(customerList, customer2);
                    assertEquals("Test that Customer arraylist size is 2", 2, customerList.size());
                    
                    //BOUNDARY: Test if Customer list is not null but empty
                    assertNotNull("Test if there is valid Customer arraylist to view the customers", customerList);
                    
                    //ERROR: If customer does not exist in the list, it cannot be viewed
                    String allCustomerInfo = C206_CaseStudy.retrieveAllCustomerInfo(customerList);

                    String testOutput = "";    
                    assertEquals("Test if customer information can be viewed if it is not available", testOutput, allCustomerInfo);
                  }
                  
                  @Test
                  public void deleteCustomer() {
                    //NORMAL: After the customer has been deleted from the list, the number of customers in the list will decrease by 1.
                    C206_CaseStudy.deleteCustomer(customerList);
                    assertEquals("Check that arraylist is 0", 0, customerList.size());
                    
                    //BOUNDARY: Selecting more than 100 customers to delete from the list, 
                            //  it will not be able to display as the system has a limit of 100 customers only. 
                    
                    C206_CaseStudy.deleteCustomer(customerList);
                    assertEquals("Check that arraylist has a limit of 100", 100, customerList.size());
                    
                    //ERROR: If the customer name does not exist in the list, it should not be able to delete anything
                    C206_CaseStudy.deleteCustomer(customerList);
                    assertEquals("Test if customer exist in the customer arraylist", 0, customerList);

                  }
                  
                  
                  @After
                  public void tearDown2() throws Exception {
                    customer1 = null;
                    customerList = null;
                  }
                
                  
                  
                  //Done by Lan Xin(Product)
                  @Before
                  public void setUp3() throws Exception {
                   pp1= new Product(0, "Pork", "Food", "China Pork", "LiuJiaZhuRou");
                   pp2= new Product(1, "Toothbrush", "Household", "Janpan toothbrush", "YuKu Brush");

                   productList= new ArrayList<Product>();
                   
                  }

                  @After
                  public void tearDown3() throws Exception {
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
                  assertNotNull("Test if there is valid Product arraylist to add to", productList);
                  
                  //Test whether product name entered matched with its vendor name 
                  C206_CaseStudy.addProduct(productList, pp1); 
                  assertSame("Test that Product is added same as 1st item of the list?", pp1, productList.get(0));
                  
                  //
                  //Add another item. test The size of the list is 2?
                  C206_CaseStudy.addProduct(productList, pp2);
                    assertEquals("Test that Product arraylist size is 2?",2, productList.get(0));
                   }
                   @Test
                 public void viewAllProductTest() {
                    //View
                    // Test if product list is not null but empty-boundary
                    assertNotNull("Test if there is valid Product arraylist to view", productList);
                    
                    // Normal
                    String allProduct = C206_CaseStudy.viewAllproduct(productList);
                    String testOutput = String.format("%-10d %-30s %-10s %-10s %-20s\n",0, "Pork", "Food", "China Pork", "LiuJiaZhuRou");
                    testOutput += String.format("%-10d %-30s %-10s %-10s %-20ds\n",1, "Toothbrush", "Household", "Janpan toothbrush", "YuKu Brush");

                    assertEquals("Check that viewAllProductt", testOutput, allProduct ); 
                   
                   //Error

                    C206_CaseStudy.addProduct(productList, pp1);
                    C206_CaseStudy.addProduct(productList, pp2);
                    assertEquals("Test that product arraylist size is 2", 2, productList.size());
                   }
                  
                        public void deleteAllProductTest() {
                         //boundary
                         assertNotNull("Test if there is valid Product arraylist to view", productList);
                         C206_CaseStudy.addProduct(productList, pp1);
                      //error
                      Boolean isDelete = C206_CaseStudy.deleteProduct(productList, "China Pork");
                      assertFalse("Test if available prodduct China Pork is returned -false?",isDelete);  
                      
                      //error
                      isDelete= C206_CaseStudy.deleteProduct(productList, "Russia fish");
                      assertFalse("Test if non-existing product Russia  is returned - false?", isDelete);
                      //normal
                      Boolean isDelete1 = C206_CaseStudy.deleteProduct(productList, "China Pork");
                      assertTrue("Test if available prodduct China Pork is returned -false?",isDelete1);  
                      
                         
                 }

                 
         
       
         
             
             


@Test
public void c206_test() {
 //fail("Not yet implemented"); 
 assertTrue("C206_CaseStudy_SampleTest ",true);
}

}
