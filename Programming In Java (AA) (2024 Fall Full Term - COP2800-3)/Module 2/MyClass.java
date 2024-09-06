public class MyClass {
    // Instance variable
    int instanceVar;
    // Static variable
    static int staticVar = 10;

    public static void main(String[] args) {
        // Create two objects of MyClass
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        // Access instance variable (unique to each object)
        obj1.instanceVar = 20;
        obj2.instanceVar = 30;
        System.out.println("Object  1 instanceVar: " + obj1.instanceVar);
        System.out.println("Object  2 instanceVar: " + obj2.instanceVar);

        // Access static variable (share among all objects)
        System.out.println("static Variable ( before  modification) : " + MyClass.staticVar);
        obj1.staticVar = 20;
        System.out.println("static Variable ( after  modification) : " + MyClass.staticVar);
    }
}
