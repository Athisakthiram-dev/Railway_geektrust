public class Main {
    public static void main(String[] args) {

        Station hyderabad = new Station("Hyderabad", "HYB", 1200);
        Station nagpur = new Station("Nagpur", "NGP", 1600);
        Station itarsi = new Station("Itarsi", "ITJ", 1900);
        Station bhopal = new Station("Bhopal", "BPL", 2000);
        Train trainA=new Train("Train A");
        trainA.addBogie(new Bogies(nagpur));
        trainA.addBogie(new Bogies(bhopal));
        Train trainB=new Train("Train B");
        trainB.addBogie(new Bogies(itarsi));
        trainB.addBogie(new Bogies(bhopal));
        TrainMerge merge=new TrainMerge(trainA,trainB);
        merge.mergeTrainBogies();
        merge.printTrainorder();




    }
}