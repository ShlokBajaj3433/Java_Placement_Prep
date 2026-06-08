package Basic.String;

public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Shlok");

        sb.append(" Bajaj");
        System.out.println(sb);

        sb.insert(6, "Kumar ");
        System.out.println(sb);

        sb.replace(6, 12, "Bajaj");
        System.out.println(sb);

        sb.delete(6, 12);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
