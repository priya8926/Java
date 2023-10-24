class Shape 
{
    int length;
    int width;
    
    void setValues(int a,int b)
    {
        length = a;
        width = b;
    }
}
class Rectangle extends Shape 
{
    int area()
    {
        return length* width ;
    }
}
class  Test 
{
    public static void main (String[]args)
    
    {
        Rectangle r = new Rectangle ();
        r.setValues(10,20);
        System.out.println("area="+r.area());        
    }
}