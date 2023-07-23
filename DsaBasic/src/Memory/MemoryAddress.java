package Memory;

public class MemoryAddress {
    public static void main (String[] args) {
        System.out.println("Hello");
        /*In Java, you cannot directly access the memory address of a variable like you can in some
        lower-level programming languages such as C or C++. Java abstracts away direct memory
        manipulation for the sake of security and memory management. Therefore, you don't have direct
        control over memory addresses in Java.
        Getting the memory addresses of variables is meaningless within Java, since the JVM is at liberty
        to implement objects and move them as it seems fit (your objects may/will move around during
        garbage collection etc.)*/
    }
}
