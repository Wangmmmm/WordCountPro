import java.util.ArrayList;

public class Program {
    public static void main(String[] args)throws Exception {
        String path=args[0];

        if(!InputMod.ReadContent(path)){
            System.out.println("Read file failed");
        }
        Output o=new Output();

        if(o.write()==1){
            System.out.println("out put success");
        }else {
            System.out.println("out put failed");

        }

    }

}
