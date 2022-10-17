package BehaviouralDesignPattern.Observer.Demo1;

public class OctObserver  extends Observer {
        public OctObserver(Subject subject)
        {
            this.subject = subject;
            this.subject.attach(this);

        }
        @Override
        public void update() {
            System.out.println("Octadecimal String : " + Integer.toOctalString(subject.getState()));

        }
}
