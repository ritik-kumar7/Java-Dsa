package  builder;

public class UpperLowerToggle {
    public static void main(String[] args) {
        String a= "YEllo wORld";
        String b="";

        for(int i=0; i<a.length(); i++){
            char ch=a.charAt(i);

            if(ch>=97 && ch<123){
              ch +=(char)-32;
             b +=ch;

            }else if(ch==32){
                b +=" ";
            }
            else{
                ch +=(char)+32;
                b +=ch;
            }
        }
        System.out.println(b);

    }
}
