import junit.framework.TestCase;

public class Test extends TestCase
{
    private Triangle testTraingle;
    
    public void testConstructor()
    {
        testTraingle = new Triangle(3,5,7);

        assertTrue(testTraingle.getA()==3);
        assertTrue(testTraingle.getB()==5);
        assertTrue(testTraingle.getC()==7);
    }
    
    public void testIsValid()
    {
        testTraingle = new Triangle(-5,3,7);
        assertFalse(testTraingle.isValid());
        
        testTraingle = new Triangle(3,5,7);
        assertTrue(testTraingle.isValid());
    }

    public void testAllSatisfyInequality()
    {
        testTraingle = new Triangle(10,5,2);
        assertFalse(testTraingle.allSatisfyInequality());

        testTraingle = new Triangle(5,15,2);
        assertFalse(testTraingle.allSatisfyInequality());

        testTraingle = new Triangle(3,4,7);
        assertFalse(testTraingle.allSatisfyInequality());

        testTraingle = new Triangle(5,6,3);
        assertTrue(testTraingle.allSatisfyInequality());
    }

    
    

}
