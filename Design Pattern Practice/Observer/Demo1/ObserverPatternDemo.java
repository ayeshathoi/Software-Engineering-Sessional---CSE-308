package BehaviouralDesignPattern.Observer.Demo1;

public class ObserverPatternDemo {
    public static void main(String[]args)
    {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexObserver(subject);
        new OctObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("\n");
        System.out.println("Last state change: 20");
        subject.setState(20);
        System.out.println("\n");
    }
}
