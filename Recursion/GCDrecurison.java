public class GCDrecurison {

    static  int gcdRes(int x ,int y){
        if(y==0) return  x;
        
        return gcdRes(y,x%y);
    }

    static  int lcm(int x ,int y,int gcdVal){
        int lcmVal= (x*y)/gcdVal;
        return  lcmVal;
    }
    
    public static void main(String[] args) {
        System.out.println(gcdRes(10,20));


        int gcdVal=gcdRes(10, 15);
        System.out.println(lcm(10,15,gcdVal));
    }
}
