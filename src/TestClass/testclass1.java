package TestClass;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import BaseClass.ClassA;


public class testclass1 {

        
		
		static WebDriver driver;
		@Parameters("browser")
		@BeforeClass
		public void beforeClass(String a) throws InterruptedException
		{
			driver=ClassA.getDriver(a);
			System.out.println("before class");
		}
		
		@BeforeMethod
		public void beforemethod() 
		{
			System.out.println("beforemethod");
		}

		
		@Test
		public void test1()
		{
			System.out.println("Test1");
		}
		
		@Test
		
		
		public   void  test2()
		{
			System.out.println("Test2");
		}
		
		@Test
		
		
		public void test3()
		{
			System.out.println("Test3");
		}
		
		@Test
		
		
		public void test4()
		{
			System.out.println("Test4");
		}
		
		@AfterMethod
		public void aftermethod()
		{
			System.out.println("After method");
		}
		
//		@AfterClass
//		public void afterclass()
//		{
//			System.out.println("After class");
//			driver.quit();
//		}
//		

	

}
