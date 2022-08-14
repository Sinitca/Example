package Work;

public class Option2 {
    public static void main(String[] args) {
        String str = "crying over java";
        System.out.println(reverse("crying over java"));
        Substring(str, str.length());
        int j = 0;
        int i = 0;
        System.out.println(str.substring(i, j));
        String newSt = str.substring(1, 4);
        System.out.println(str.substring(1, 4));


    }

    private static String reverse(String str) {
        if(str.length() <= 1){
            return str;
        }
        return reverse(str.substring(1)) + str.substring(0, 1);
    }

    public static void Substring(String str, int n)
    {
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j <= n; j++);
    }


}
