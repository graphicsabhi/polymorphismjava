// class student{
//     String name;
//     int age;

//     public void printInfo(String name){
//         System.out.println(name);
//     }
//     public void printInfo( int age){
//         System.out.println(age);
//     }
//     public void printInfo(String name, int age){
//         System.out.println(name + " " + age);
//     }
// }

class Bike{
    String name;
    int price;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo (int price){
        System.out.println(price);
    }

}
public class polymorphism{
    public static void main(String[] args) {
        
        // student s1 = new student();
        // s1.name="satyam";
        // s1.age =23;

        // s1.printInfo(s1.name);
        // s1.printInfo(s1.age);

        Bike b1 = new Bike();
        b1.price=1000;
        b1.name="satyam";

        b1.printInfo(b1.name);
    }
}