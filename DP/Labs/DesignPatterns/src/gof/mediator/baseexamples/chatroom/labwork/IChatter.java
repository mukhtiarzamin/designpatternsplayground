package gof.mediator.baseexamples.chatroom.labwork;

public interface IChatter {
    String getSenderName();
    void receiveMessage(IChatter sender,String message);
    void sendMessage(IChatter... receivers);
}
