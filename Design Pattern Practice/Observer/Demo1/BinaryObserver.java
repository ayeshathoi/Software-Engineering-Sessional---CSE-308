package BehaviouralDesignPattern.Observer.Demo1;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject)
    {
        this.subject = subject;
        this.subject.attach(this);
        // attact comes from subject class

    }
    @Override
    public void update() {
        System.out.println("Binary String : " + Integer.toBinaryString(subject.getState()));

    }

}
