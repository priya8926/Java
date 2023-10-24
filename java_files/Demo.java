abstract class Vehicle 
{
    abstract void start ();
}
class car extends Vehicle 
{
    void start()
    {
        System.out.println("car start with key");
    }
}
class Scooter extends Vehicle 
{
    void start ()
    {
        System.out.print ("Scooter starts with key");
    }
  public static void main (String [] args)
  {
      //Vehicle v = new Vehicle ();
      
      car c = new car();
      c.start();
      
      Scooter s= new Scooter ();
      s.start();
  }
}
