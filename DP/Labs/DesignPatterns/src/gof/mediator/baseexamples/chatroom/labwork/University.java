package gof.mediator.baseexamples.chatroom.labwork;

import java.util.Date;

public class University implements IChatter{
    public String name;
    public String campusName;
    private ChatRoom chatRoomMediator;

    public University(String name,String campusName,ChatRoom mediator){
        this.name=name;
        this.campusName=campusName;
        this.chatRoomMediator = mediator;
    }

    @Override
    public String getSenderName() {
        return name + " - "+campusName;
    }

    @Override
    public void receiveMessage(IChatter sender, String message) {
        System.out.println(new Date().toString() + " [" + sender.getSenderName() + " -> "+this.getSenderName()+"] : " + message);
    }

    @Override
    public void sendMessage(IChatter... receiver) {
        chatRoomMediator.sendMessage(this,"hello");
    }
}
