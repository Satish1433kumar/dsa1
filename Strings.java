// 1) Write a java program to display all positions of substring in a given main String
// 2)  Write a java program to reverse a given string 




public class Strings {

    // 1) Write a java program to display all positions of substring in a given main String
    public static void subString(String text, String substring) {
        boolean flag = false;
        int pos = -1;
        int c = 0;

        while (true) {
            pos = text.indexOf(substring, pos + 1);
            if (pos == -1) {
                break;
            }
            c = c + 1;
            System.out.println("Found at position: " + pos);
            flag = true;
        }
        if (flag==false) {
            System.out.println("Not found");
        }
        System.out.println("The number of occurrences: " + c);
    }

    // 2)  Write a java program to reverse a given string 
    public static void reverseString(String str){
        for(int i = str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        // String s1 = "abcabcabcaaa";
        // String s2 = "abc";
        String s1 = "Satish";
        //Strings.subString(s1, s2);
        Strings.reverseString(s1);
    }
}
