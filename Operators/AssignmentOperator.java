package Operators;

public class AssignmentOperator {
    public static void main(String[] args){
     /*   int a=10;
        int b=20;
        a+=4;
        b-=4;
        System.out.println(a);
        System.out.println(b); */

       /** int a=10;
        a+=3;//10+3
        System.out.println(a);
        a-=4;//13-4
        System.out.println(a);
        a*=2;//9*2
        System.out.println(a);
        a/=2;//18/2
        System.out.println(a); **/

       /** short a=10;
        short b=10;
//a+=b;//a=a+b internally so fine
        a=a+b;//Compile time error because 10+10=20 now int
        System.out.println(a); **/

        short a=10;
        short b=10;
        a=(short)(a+b);//20 which is int now converted to short
        System.out.println(a);
    }
}
