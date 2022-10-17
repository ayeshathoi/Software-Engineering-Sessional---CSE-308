package BehaviouralDesignPattern.Strategy.Demo1;

public class StrategyPatternDemo {
    public static void main(String[]args)
    {
        Context context1 = new Context(new OperationAdd());
        System.out.println(context1.ExecuteStrategy(10,5));
        Context context21 = new Context(new OperationSubtraction());
        System.out.println(context21.ExecuteStrategy(10,5));
        Context context11 = new Context(new OperationMultiplication());
        System.out.println(context11.ExecuteStrategy(10,5));
    }
}
