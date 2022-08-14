package Work;


public class Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder a = new StringBuilder(sb);

        StringBuilder builder  = new StringBuilder("3 * 56 = 168");
        builder. deleteCharAt(7);
        String result = builder.toString();
        System.out.println(result);

        builder.replace(6,6, " равно");
        result = builder.toString();
        System.out.println(result);



        sb.append("3 ");
        sb.append("-");
        sb.append(" 53 ");

        sb.append("-56 ");
        sb.append(";");

        sb.append("  3 ");
        sb.append(" + ");
        sb.append(" 56 ");
        sb.append(" = ");
        sb.append(" 59");

        sb.append(" ; ");

        sb.append(" 3 ");
        sb.append("  * ");
        sb.append(" 56 ");
        sb.append(" = ");
        sb.append(" 168");


        sb.insert(6, " равно ");
        System.out.print(a);
        System.out.println(sb);



    }
}