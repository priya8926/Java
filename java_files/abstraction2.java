abstract class shape
{
abstract void draw();
}
class Rectangle extends shape 
{
void draw()
{
System.out.print ("drawing Rectangle");
}
}
class Circle extends shape
{
void draw ()
{
System.out.print(" drawing circle ");
}
public static void main (String [] args)
{
Rectangle r= new Rectangle ();
r.draw();
}
}