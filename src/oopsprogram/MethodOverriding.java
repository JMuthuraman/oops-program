package oopsprogram;
   
class Override1 {

    // Method to be overridden
    public void work() 
    {
        System.out.println("testing...");
    }
}

public class MethodOverriding extends Override1 {
    
    @Override
    public void work()
    {
        System.out.println("development...");
    }
    public static void main(String[] args) 
    {
        MethodOverriding ob = new MethodOverriding();
        ob.work();
    }
}

