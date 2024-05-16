public class OperatorExample {
    public static void unaryOperator(){
        int x=10;  
        System.out.println(x++);//10 (11)  
        System.out.println(++x);//12  
        System.out.println(x--);//12 (11)  
        System.out.println(--x);//10  

        int a=10;  
        int b=10;  
        System.out.println(a++ + ++a);//10+12=22  
        System.out.println(b++ + b++);//10+11=21 

        int a1=10;  
        int b1=-10;  
        boolean c=true;  
        boolean d=false;  
        System.out.println(~a1);//-11 (minus of total positive value which starts from 0)  
        System.out.println(~b1);//9 (positive of total minus, positive starts from 0)  
        System.out.println(!c);//false (opposite of boolean value)  
        System.out.println(!d);//true  
    }
    public static void arithmeticOperators(){
        int a=10;
        int b = 5;
        System.out.println(a+b);//15  
        System.out.println(a-b);//5  
        System.out.println(a*b);//50  
        System.out.println(a/b);//2  
        System.out.println(a%b);//0 
        System.out.println(10*10/5+3-1*4/2); //Expression
    }
    public static void leftShiftOperators(){
        System.out.println(10<<2);//10*2^2=10*4=40  
        System.out.println(10<<3);//10*2^3=10*8=80  
        System.out.println(20<<2);//20*2^2=20*4=80  
        System.out.println(15<<4);//15*2^4=15*16=240  
    }
    public static void rightShiftOperators(){
        System.out.println(10>>2);//10/2^2=10/4=2  
        System.out.println(20>>2);//20/2^2=20/4=5  
        System.out.println(20>>3);//20/2^3=20/8=2  

        //For negative number, >>> changes parity bit (MSB) to 0  
        System.out.println(-20>>2);  
        System.out.println(-20>>>2);  
    }
    public static void logicaloperators(){
        int a=10;  
        int b=5;  
        int c=20;  
        System.out.println(a<b&&a<c);//(logical AND)false && true = false  
        System.out.println(a<b&a<c);//(Bitwise AND)false & true = false 

        int a1=10;  
        int b1=5;  
        int c1=20;  
        System.out.println(a1<b1&&a1++<c1);//false && true = false  
        System.out.println(a1);//10 because second condition is not checked  
        System.out.println(a1<b1&a1++<c1);//false && true = false  
        System.out.println(a1);//11 because second condition is checked  
    }

    public static void main(String args[]){  
        //unaryOperator();
        //arithmeticOperators();
        //leftShiftOperators(); 
        //rightShiftOperators();
        logicaloperators();
}
}