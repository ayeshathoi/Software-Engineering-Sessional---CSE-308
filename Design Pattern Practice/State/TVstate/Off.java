package BehaviouralDesignPattern.State.TVstate;

public class Off extends RemoteControl{
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already On .Going to be Off now");
        context.setState(new Off());

    }
}
