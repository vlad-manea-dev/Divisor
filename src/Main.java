import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Type a start integer");
    int start = sc.nextInt();

    System.out.println("Type an end integer");
    int end = sc.nextInt();

    System.out.println("Type a divisor");
    int divisior = sc.nextInt();

//        while (count < end){
//          res = res * (count + 1);
//          count++;
    for (int count = 0; count < 10; count++){
      int res = count;
      if (count % divisior == 0);
      System.out.println("Number: " + res);
        }
    }
    }
