
// templates define
class Employee{
    int id ;
    String name;
    public void  printDetails(){
        System.out.println("my name is: " +name);
        System.out.println("my id is  :" + id);
    }
}
public class classobjects {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        System.out.println(" ");
        // ensentive new objects
     Employee ansu = new Employee();
     Employee vikas = new Employee();
    // setting attributes
        vikas .name = "viky";
        vikas .id = 18;
         ansu .name = "ansu";
         ansu.id =10;
       ansu.printDetails();
       System.out.println(" ");
       vikas.printDetails();
          System.out.println(ansu.name);
          System.out.println(ansu.id);
    }
}
