public class BasicConstrutre {
    int a,b;

    public BasicConstrutre(int x,int y) {
        this.a=x;
        this.b=y;
    }
    void printVal(){
        System.out.println(a+" and "+ b);
    }
    
}
class  B {
    public static void main(String[] args) {
        BasicConstrutre hel= new BasicConstrutre(6,100);
        hel.printVal();

    }
}