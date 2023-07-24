import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       /* System.out.println("Hello world!");*/
        System.out.println("-------ShouldWakeUp-------");

        boolean response1 = shouldWakeUp(true,1);
        System.out.println(response1);
        boolean response2 = shouldWakeUp(false,2);
        System.out.println(response2);
        boolean response3 = shouldWakeUp(true,8);
        System.out.println(response3);
        boolean response4 = shouldWakeUp(true,-1);
        System.out.println(response4);

        System.out.println("---------hasTeen--------");

        boolean response5 = hasTeen(9,99,19);
        System.out.println(response5);
        boolean response6 = hasTeen(23,15,42);
        System.out.println(response6);
        boolean response7 = hasTeen(22,23,34);
        System.out.println(response7);

        System.out.println("-------isCatPlaying-------");

        boolean response8 = isCatPlaying(true,10);
        System.out.println(response8);
        boolean response9 = isCatPlaying(false,36);
        System.out.println(response9);
        boolean response10 = isCatPlaying(false,35);
        System.out.println(response10);

        System.out.println("----------Rectangle Area-------------");

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter width of rectangle : ");
            double x = scanner.nextDouble();
            System.out.println("Enter height of rectangle: ");
            double y = scanner.nextDouble();
            double result = area(x,y);
            System.out.println(" Rectangle Area : " + result);
        } catch (Exception ex) {
            System.out.println("Invalid Input");
        }

        System.out.println("----------Rectangle Area--------------");
        System.out.println("Enter radius of circle : ");
        double r = scanner.nextDouble();
        double circleAreaResult = circleArea(r);
        System.out.println("Enter width of rectangle : " + circleAreaResult);
    }

    public static boolean shouldWakeUp (boolean hav, int hour) {
        if (hour >= 1 && hour <= 23) {
            if ((hav == true) && (hour >20 || hour < 8)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    public  static boolean  hasTeen (int age1, int age2, int age3) {
        if ( age1 >= 13 && age1 <=19 || age2 >= 13 && age2 <=19 || age3 >= 13 && age3 <=19 ) {
            return  true;
        } else {
            return  false;
        }
    }


    public  static boolean isCatPlaying (boolean isSummer, int temp ) {
        if (isSummer ) {
            return  temp >=25 && temp <=45 ;
        } else
            return temp >= 25 && temp <= 35;
    }


    public static double area ( double uk , double kk ) {
        if ( uk <0 ||  kk<0) {
            return -1 ;
        } else
        return  uk * kk ;
    }


    public static double circleArea ( double radius  ) {
        if ( radius < 0 ) {
            return -1 ;
        } else
            return  radius*radius*Math.PI ;
    }
}

