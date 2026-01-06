package tazo0519.codingtest.beginner;

public class ReverseString {

    public static void main(String[] args) {
        String my_string = "bread";
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();
        System.out.println(sb);
    }
}
