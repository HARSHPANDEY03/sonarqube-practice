class Mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + ":"+ price + ":"+ name);
    }

}



public class StaticVar37 {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1300;
//        obj1.name = "Smart Phone";    ----> this will work, but it is not a good practice to call a static variable using the object
        Mobile.name = "Smart Phone";
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1200;
//        obj2.name = "Smart Phone";

//        obj1.name = "phone";

        obj1.show();
        obj2.show();
    }
}
