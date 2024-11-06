public class Station {
    private String name;
    private String code;
    private int distance;

    Station(String name, String code, int distance){
        this.name=name;
        this.code=code;
        this.distance=distance;
    }

    public String getName(){
        return name;
    }
    public int getDistance(){
        return distance;
    }

    public void print(){
        System.out.println("Station name is "+name+"and distance is "+distance);
    }
}
