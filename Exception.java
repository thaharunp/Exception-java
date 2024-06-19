public class Test{
    public static void main(String args[]){
        try{
            int [] eids={101, 102, 103, 104};
            System.out.println(eids[3]);
        }
        catch(ArrayIndexOutofBoundException aiob){
          System.out.println(aiob.getMessage);
        }
    }
}