public class HiFriend {
    public static void main(String[] args) throws Exception {
        String s1 = "Hi ";
        String s2 = "Peter ";
        String s3 = "Dinkleberg!";
        String s4 = s1.concat(s2 + s3);
        System.out.println(s4);
    }
}