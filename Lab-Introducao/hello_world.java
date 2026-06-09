import java.util.Arrays;

public class hello_world {

  public static void print_inter(int value) {
    System.out.println(value);
  }

  public static void print_string(String[] args) {
    System.out.println(Arrays.toString(args));
  }

  public static void main(String[] args) {
    print_string(new String[]{"args"});
    print_inter(22);
  }
}