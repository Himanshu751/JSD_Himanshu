// Java program to find factorial of given number 
  
// Factorial class
class Test { 
    // method to find factorial of given number 
    static int factorial(int n) 
    { 
        if (n == 0) 
            return 1; 
  
        return n * factorial(n - 1); 
    } 
  
    // main method 
    public static void main(String[] args) 
    { 
        int num = 9; 
        System.out.println("Factorial of " + num + " is "
                           + factorial(9)); 
    } 
}