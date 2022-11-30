public class HomeWork23_11 {
    public static void main(String[] args) {

        trafficLights("green");
    }
    public  static void trafficLights(String color){
        if(color.equals("red")){
            System.out.println("stop");
        } else if(color.equals("yellow")){
            System.out.println("prepare");
        } else if(color.equals("green")){
            System.out.println("go forward");
        } else {
            System.out.println("error");
        }
    }
}
