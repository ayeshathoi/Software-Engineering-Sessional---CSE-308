package BehaviouralDesignPattern.Mediator.Practice;

public class MediatorDemo {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();
        Friend1 friend1 = new Friend1(m,"Pritom");
        Friend2 friend2 = new Friend2(m,"Ayesha");
        Friend3 friend3 = new Friend3(m,"Sabit");
        m.setFriend1(friend1);
        m.setFriend2(friend2);
        m.setFriend3(friend3);

        m.sendMsg(friend1, "What a life , man! ");
        m.sendMsg(friend2, "Have you enjoyed the weed?");
        m.sendMsg(friend2, "You people are sleep deprived");
    }



}
