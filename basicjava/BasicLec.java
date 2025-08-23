package basicjava;

class Car{
  public String color;

  public void printColor(String color){
 this.color=color;
    System.out.println("I am public method " + this.color);
  }
}
public class BasicLec{
    public static void main(String[] args){
      //taking input from user
        //   Scanner sc= new Scanner(System.in);
        // System.out.println("Enter your name:");
        // String name= sc.nextLine();
        //   System.out.println("hello"+name+"welocme");
        
    Car bmw = new Car();
    bmw.printColor("blue");
    }
} 