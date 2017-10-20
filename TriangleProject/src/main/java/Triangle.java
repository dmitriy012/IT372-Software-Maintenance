public class Triangle
{
    private int a, b, c;

    public Triangle(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public boolean isValid()
    {
        return a>0 && b>0 && c>0;
    }

    public boolean allSatisfyInequality()
    {
        return (a<(b+c)) && (b<(a+c)) && (c<(a+b));
    }

    public int getA()
    {
        return a;
    }

    public int getB()
    {
        return b;
    }

    public int getC()
    {
        return c;
    }

}
