import java.io.Print Writer;
class Test{
    public static void main(string args[]){
        try{
                    Print Writer p = new Print Writer ("data.txt");
        }
     catch(FileNotFound fnf){
                 System.out.println(fnf.getMessage());

        }
    }
}