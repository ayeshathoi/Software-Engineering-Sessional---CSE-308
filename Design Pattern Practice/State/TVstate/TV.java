package BehaviouralDesignPattern.State.TVstate;

public class TV {
    private RemoteControl remoteControl;

    public RemoteControl getState() {
        return remoteControl;
    }
    public void setState(RemoteControl state) {
        this.remoteControl = state;
    }
    public TV(RemoteControl state)
    {
        this.remoteControl=state;
    }
    public void pressButton()
    {
        remoteControl.pressSwitch(this);
    }
}
