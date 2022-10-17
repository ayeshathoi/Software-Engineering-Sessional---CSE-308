package BehaviouralDesignPattern.ChangeOfResponsbility.Demo1;

enum messagePriority {
    Normal,
    High
}
public class Message {
    public String text;
    public messagePriority Priority;
    public Message(String text,messagePriority Priority)
    {
        this.text = text;
        this.Priority = Priority;
    }
}
