class Test{
    public static  void main(String args[]){
        System.out.println(10/2);
        System.out.println(10/0);     // compile time error
        System.out.println(10/5);       // Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}