package TestCase;

import Controller.Airthematic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AirthematicTest {
    private int a;
    private int b;
    private int exceptedResult;
    private Airthematic airthematic;

    public AirthematicTest(int a, int b, int exceptedResult) {
        super();
        this.a = a;
        this.b = b;
        this.exceptedResult = exceptedResult;
    }

    @Test
    public void TestSum(){
        airthematic = new Airthematic();
        int result = airthematic.sum(a,b);
        assertEquals(exceptedResult,result);
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{
                {1,2,3},{4,5,6},{7,8,9},{11,12,13}
        });
    }
}
