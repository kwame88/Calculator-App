package cc;

public class Calculator
{

    private double op1;
    private double op2;
    
    
    public double getAdd () {
        return op1+op2;
    }
    public double getSubtract () {
        return (op1-op2);
    }
    
    public double getDivide () {
        return( op1/op2);
    }
    
    public double getMultiply () {
        return op1*op2;
    }
    
    
//    @Override
//    public String toString ()
//    {
//        return "Calculator [op1=" + op1 + ", op2=" + op2 + "]";
//    }
    public double getOp1 ()
    {
        return op1;
    }
    public void setOp1 (double op1)
    {
        this.op1 = op1;
    }
    public double getOp2 ()
    {
        return op2;
    }
    public void setOp2 (double op2)
    {
        this.op2 = op2;
    }
  
}
