public class StrBuffer36 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Harsh");
//        System.out.println(sb.capacity());
//        System.out.println(sb.length());
        sb.append(" Pandey");
        System.out.println(sb);
//      String str = sb;    ----------> wont work
        String str = sb.toString();
        System.out.println(str);

    }
}
