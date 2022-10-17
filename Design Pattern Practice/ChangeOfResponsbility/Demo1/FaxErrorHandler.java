package BehaviouralDesignPattern.ChangeOfResponsbility.Demo1;


public class FaxErrorHandler implements IReceiver {
    private IReceiver _nextReceiver;

    public FaxErrorHandler(IReceiver nextReceiver) {
        _nextReceiver = nextReceiver;
    }

    @Override
    public Boolean ProcessMessage(Message msg) {
        {
            if (msg.text.contains("Fax"))
            {
                System.out.println("FaxErrorHandler processed "+ msg.Priority+
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
}