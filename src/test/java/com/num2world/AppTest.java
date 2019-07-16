package com.num2world;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * @author npradeep
 *
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testNumber2Word() {	
       System.out.println("Inside testNumber2Word()");    
       App obj = new App();
       assertEquals("one", obj.convert(1));     
    }
    
    public void testNegativeNumber2Word() {	
        System.out.println("Inside testNegativeNumber2Word()");    
        App obj = new App();
        assertEquals("negative eighty one", obj.convert(-81));     
     }
    
   
}
