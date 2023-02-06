  // abstract keyword is a non access modifier.
  // important note - in abstraction or abstract class - no objects can be created instead it needs to be inherited from other classes.
  // and abstract methods have no body, can be accessed by classes.
            //reference from W3 schools.
// abstract class
abstract class Coder{
  // Abstract method (does not have a body)
  public abstract void coding();
  // Regular method
  public void interview() {
    System.out.println("coding is W");
  }
}

// Subclass (inherit from Student)
class Student extends Coder{
  public void coding() {
    // The body of coding() is provided here
    System.out.println("Keep coding and youll do better!!");
  }
}

class Main {
  public static void main(String[] args) {
    Student me = new Student();
    me.coding();
    me.interview();
  }
}
