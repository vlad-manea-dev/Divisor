import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Type a start integer");
    int start = sc.nextInt();

    System.out.println("Type an end integer");
    int end = sc.nextInt();

    System.out.println("Type a divisor");
    int divisor = sc.nextInt();

    int total = 0;
//        while (count < end){
//          res = res * (count + 1);
//          count++;
    for (int count = start; count <= end; count++) {
      if (count % divisor == 0) {
        total += count;
        System.out.println("Total: " + total);
      }
    }
    sc.close();
  }
}
