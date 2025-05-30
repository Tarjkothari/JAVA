class Result 
{

    double dbms;
    double os;
    double java;
    
    
    public Result(double dbms, double os, double java) 
    {
        this.dbms = dbms;
        this.os = os;
        this.java = java;
    }
    
    
    public final double calculate() 
    {
        return dbms + os + java;
    }
    
}

class ResultAllocation
{
    public static void main(String[] args) 
    {
        
        Result result = new Result(85.5, 76.0, 92.0);
        
        
        double total = result.calculate();
        
        
        System.out.println("Total marks: " + total);
    }
}
