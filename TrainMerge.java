import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainMerge {
    private Train trainA;
    private Train trainB;
    private Train  trainAB;

    TrainMerge(Train trainA, Train trainB){
        this.trainA=trainA;
        this.trainB=trainB;
        this.trainAB=new Train("AB");
    }
    public void mergeTrainBogies(){
        List<Bogies> combinedBogies=new ArrayList<>();
        combinedBogies.addAll(trainA.getBogies());
        combinedBogies.addAll(trainB.getBogies());
        combinedBogies.sort(Comparator.comparingInt((Bogies b)->b.getDestination().getDistance()).reversed());
        for(Bogies bogies:combinedBogies){
            trainAB.addBogie(bogies);
        }
    }
      public void printTrainorder(){
      System.out.print("Order of trainA");
      trainA.printBogies();
      System.out.print("Order of trainB");
      trainB.printBogies();
      System.out.println("Order of trainAB");
      trainAB.printBogies();
        }
    }

