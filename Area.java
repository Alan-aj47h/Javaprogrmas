import java.util.Scanner;
class Square{
 int side,areares,perires;
 Square(int a){
    side=a;
 }
 void area(){
   areares=side*side;
   System.out.println("Area of square:"+ areares);
 }
 void peri(){
    perires=4*side;
    System.out.println("Perimeter of square:"+  perires);
 }
}

public class Area {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter side of square:");
        int s = sc.nextInt();
        Square sq= new Square(s);
        sq.area();
        sq.peri();

        sc.close();

    }
}
 