public class Info {
    public String name;
    public String year;
    public String price;

    // Constructor with parameters
    public Info(String name, String year, String price) {
        this.name = name;
        this.year = year;
        this.price = price;
    }

    void print(){
        // System.out.println("氏名: " + name);
        // System.out.println("年: " + year);
        // System.out.println("値段: " + price);

    }
    // // Getter methods to access private fields
    // public String getName() {
    //     System.out.println("Displaying Encyclopedia Information");
    //     return name;
    // }

    // public String getYear() {
    //     return year;
    // }

    // public String getPrice() {
    //     return price;
    // }
}




// public class Info {
//     private String name;
//     private String year;
//     private String price;

//     // Constructor with parameters
//     public Info(String name, String year, String price) {
//         this.name = name;
//         this.year = year;
//         this.price = price;
//     }

//     // Getters for private fields
//     public String getName() {
//         return name;
//     }

//     public String getYear() {
//         return year;
//     }

//     public String getPrice() {
//         return price;
//     }

//     void print() {
//         System.out.println("氏名: " + name);
//         System.out.println("年: " + year);
//         System.out.println("値段: " + price);
//     }
// }