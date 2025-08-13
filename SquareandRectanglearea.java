import java.util.Scanner;
class Square{
 int side,areares,perires;
 Square(int a){
    side=a;
 }
 void operations(){
   areares=side*side;
   perires=4*side;
 }
 void display(){
    System.out.println("Area of square:"+ areares);
    System.out.println("Perimeter of square:"+  perires);
 }
}
class Rectangle{
  int len,bre,recarea,recperi;
  Rectangle(int l,int b){
    len=l;
    bre=b;
  }
  void opera(){
    recarea=len*bre;
    recperi=2*(len+bre);
  }
  void display(){
    System.out.println("Area of rectangle:"+ recarea);
    System.out.println("Perimeter of rectangle:"+  recperi);
  }
}

public class SquareandRectanglearea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1 Area and perimeter of Square:");
        System.out.println("2 Area and perimeter Rectangle:");
        System.out.println("Enter side of option:");
        int opt =sc.nextInt();

        if(opt == 1){
          System.out.println("Enter side of Square:");
          int s =sc.nextInt();
          Square sq= new Square(s);
          sq.operations();
          sq.display();
        }
        else if(opt == 2){
          System.out.println("Enter length and breath of Rectangle:");
          int l=sc.nextInt();
          int b=sc.nextInt();
          Rectangle rec=new Rectangle(l, b);
          rec.opera();
          rec.display();
        }else{
          System.out.println("Invalid option");
        }
        sc.close();
    }
}
 