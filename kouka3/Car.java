public class Car extends Info{
    // public String name;
    // public String year;
    // public String price;

    public Car(String name, String year, String price) {
        // this.name = name;
        // this.year = year;
        // this.price = price;
        super(name,year,price);
    }


    void print() {
        System.out.println("氏名: " + name);
        System.out.println("年: " + year);
        System.out.println("値段: " + price);
    }
}




// public class Car extends Info {

//     public Car(String name, String year, String price) {
//         super(name, year, price);
//     }

//     @Override
//     void print() {
//         System.out.println("氏名: " + getName());
//         System.out.println("年: " + getYear());
//         System.out.println("値段: " + getPrice());
//     }
// }