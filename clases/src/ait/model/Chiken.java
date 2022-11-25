package ait.model;

public class Chiken {
    public String name;
    public double weight;
    public boolean isFemale;
    private double cost;
public double getCost(){
    return this.cost;
}
public  void setCost(double newCost){
    this.cost=newCost;
}
   public Chiken(){

   }
   public Chiken (String name, double weight,boolean isFemale,double cost){
       this.name=name;
       this.weight=weight;
       this.isFemale=isFemale;
       this.cost=cost;
   }

   public  void say(){
       System.out.println("Hello, i am chiken. My name is "+ name+". My weight is "+ weight+ ". And my 'isFemale' is "+ isFemale+ ".");
   }
   public int chickenEggs(int day){
       return day*3;
   }
   public void chickenTalking(){
       System.out.println("co co co co it is a nice day!");
   }
}