package de.ait.model;

public class Dog {
    public int age;
    public double weight;
    public boolean isAgressive;
    public String name;
    public String color;
    public boolean isMale;
    public String breed;
public Dog(){

}
  public  Dog(String name){
      this.name=name;
  }
  public  Dog (String name, int age){
    this.name=name;
    this.age=age;
  }
  public  Dog(String name, int age, double weight, boolean isAgressive, String breed){
    this.name=name;
    this.age=age;
    this.weight=weight;
    this.isAgressive=isAgressive;
    this.breed=breed;

  }
    public  void displayDog() {
        System.out.println("-------------");
        System.out.println("name: " + name + " weight: " + weight + " breed: " + breed+ " wof");

    }
}
