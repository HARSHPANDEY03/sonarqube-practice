class Human{
    private int age;
    private String name;

    public String getName()
        {
            return name;
        }

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }
    public void setName(String n)
    {
        name = n;
    }
}



public class Encapsulation40 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setName("Akash");
        obj.setAge(26);
//        obj.name = "Harsh";
//        obj.age = 20;
        System.out.println(obj.getName() + ":" + obj.getAge());
    }
}
