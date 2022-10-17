package BehaviouralDesignPattern.ChangeOfResponsbility.Demo1;

public class IssueRaiser {
        public IReceiver setFirstReciever;
        public IssueRaiser(IReceiver s)
        {
            this.setFirstReciever = s;

        }
        public void RaiseMessage(Message message)
        {
            if(setFirstReciever!=null) {
                setFirstReciever.ProcessMessage(message);
            }
        }
    }
