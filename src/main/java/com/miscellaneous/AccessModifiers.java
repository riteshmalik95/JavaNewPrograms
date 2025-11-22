//package com.miscellaneous;
//// Private Access modifier- It gives the access to the class,variable and Method
//// only in the class in which it is declared.
/// Private members cannot be accessed directly from outside the class
/// Private data members are accessible anywhere inside the same class, even via objects.
/// They are not accessible outside the class, even with objects.
/// They can be accessed through methods provided by the class- getters and setters
/// Purpose- To hide implementation details and enforce encapsulation.
//public class AccessModifiers {
//    private int a=25;
//
//    private void m1(){
//        System.out.println("Hello");
//    }
//    public static void main(String[] args) {
//        AccessModifiers am=new AccessModifiers();
//        am.m1();
//        System.out.println(am.a);
//
//    }
//}

////Default Access Modifier(package-private access modifier)
////It gives only acccess within the same package........
//package com.miscellaneous;
//
//public class AccessModifiers {
//     int a=25;
//
//    void m1(){
//        System.out.println("Hello");
//    }
//    public static void main(String[] args) {
//        AccessModifiers am=new AccessModifiers();
//        am.m1();
//        System.out.println(am.a);
//
//    }
//}

//Protected Access Modifier- It gives access within the same package and also
//to subclasses in different packages.....
//Purpose-It supports Inheritance.....
package com.miscellaneous;

public class AccessModifiers {
    protected int a=25;

    protected void m1(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        AccessModifiers am=new AccessModifiers();
        am.m1();
        System.out.println(am.a);

    }
}
//Public Access Modifier- It provides full visibility & making the members globally visible.