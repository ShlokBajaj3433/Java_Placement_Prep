package Basic.String;

public class Demo {
    public static void main(String[] args) {
        String s1 = "Shlok";
        String s2 = "Shlok";

        System.out.println(s1 == s2); // true

        String s3 = new String("Shlok");
        String s4 = new String("Shlok");
        
        System.out.println(s3 == s4); // false
        System.out.println(s3.equals(s4)); // true
    }
}
