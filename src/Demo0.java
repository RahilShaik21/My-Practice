import java.util.ArrayList;
import java.util.List;

public class Demo0{
    static void main(String[] args) {
        List<int[]> list=new ArrayList<>();
        int c=0;
        while (true){
            list.add(new int[250000]);
            c++;
            System.out.println("Allocated Block :"+c);
        }
    }
        }