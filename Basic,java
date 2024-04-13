public class Basic{
    public static void reverse(int n){ 
        int r, rev = 0, temp;
        temp = n;
        while(n > 0){
            r = n % 10;
            rev = (rev * 10) + r;
            n = n / 10;
        }
        System.out.println("Reverse: " + rev); 
        if(temp == rev){
            System.out.println(temp + " is a palindrome");
        }
        else{
            System.out.println(temp + " is not a palindrome");
        }
    }

    public static void main(String[] args){
        int n = 1221;
        reverse(n);
    }
}
