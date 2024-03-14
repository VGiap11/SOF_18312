package TestCase;

import Controller.ExceptionDemoCtl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ExceptionDemo {

//    @Test(expected = ArithmeticException.class)
//    public void DemoExceptionTest() throws Exception{
//        ExceptionDemoCtl.divizero(100,0); //roi vao exception
////        ExceptionDemoCtl.divizero(0,10); // = 0
////        ExceptionDemoCtl.divizero(100,3); // = 33.333333
////        ExceptionDemoCtl.divizero(100,2); // = 50
//    }
//
//    @Test
//    public void DemoExceptionTest1() throws Exception{
//        try{
//            ExceptionDemoCtl.divizero(100,0);
//            fail("Not throw exception");
//        }catch (Exception e){
//            assertThat(e, instanceOf(ArithmeticException.class));
//            assertEquals(e.getMessage(),"Divide by zero");
//        }
//    }
//
//    @Rule
//    public ExpectedException thrown = ExpectedException.none();
//    @Test
//    public void testRule() throws Exception{
//        thrown.expect(ArithmeticException.class);
//        thrown.expectMessage("Divide by zero");
//        ExceptionDemoCtl.divizero(100,0);
//    }

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void TestErrorCollector(){
        collector.addError(new Throwable("Loi dong dau tien"));
        collector.addError(new Throwable("Loi cuoi dong"));

        System.out.println("Hello");
        try{
            assertTrue("a" == "b");
        }catch (Throwable e){
            collector.addError(new Throwable(e));
        }
        System.out.println("Ket Thuc !!!!");
    }

}
