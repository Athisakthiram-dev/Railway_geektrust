import java.util.ArrayList;
import java.util.List;

public class Train {
    private String name;
    private List<Bogies> bogie=new ArrayList<>();
    Train(String name){
        this.name=name;
        this.bogie=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void addBogie(Bogies bogies ){
        bogie.add(bogies);
    }
    public List<Bogies> getBogies(){
        return bogie;
    }
    public void printBogies(){
        System.out.print("Bogies order and name ");
        for(Bogies bogies: bogie){
           System.out.println(bogies.getDestination().getName());
        }
    }
}
