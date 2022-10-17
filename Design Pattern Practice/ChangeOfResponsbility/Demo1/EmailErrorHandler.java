package BehaviouralDesignPattern.ChangeOfResponsbility.Demo1;

public class EmailErrorHandler implements IReceiver
{
    private IReceiver _nextReceiver;
    public EmailErrorHandler(IReceiver nextReceiver)
    {
        _nextReceiver = nextReceiver;
    }
    public Boolean ProcessMessage(Message msg)
    {
        if (msg.text.contains("Email"))
        {
            System.out.println("EmailErrorHandler processed "+ msg.Priority+
                    " priority issue: "+ msg.text);
            return true;
        }
        else
        {
            if (_nextReceiver != null)
                _nextReceiver.ProcessMessage(msg);
        }
        return false;
    }
}