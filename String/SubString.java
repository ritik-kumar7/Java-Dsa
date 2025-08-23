public class SubString {
    public static void main(String[] args) {
        String str="abcd";
        String gtr=new String("abcd");
        
        boolean a=str.equals(gtr);
        System.out.println();

        String newStr=str.substring(0,str.length());
        System.out.println(newStr);

        for(int i=0; i<=str.length(); i++){
         
            for(int j=i+1; j<=str.length(); j++){
                System.out.print(str.substring(i,j)+" ");
            }
     
        }
    }
}
