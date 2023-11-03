package gof.mediator.baseexamples.chatroom.labwork;

public class ChatRoom {
    public void sendMessage(IChatter sender, String message, IChatter... receivers){
        for (IChatter receiver: receivers
             ) {
            receiver.receiveMessage(sender,message);
        }
    }
}
