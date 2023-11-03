package gof.mediator.baseexamples.chatroom.labwork;

import java.util.Date;

public class Teacher implements IChatter{
    public String name;
    public String qualification;
    private ChatRoom chatRoomMediator;

    public Teacher(String name,String qualification,ChatRoom mediator){
        this.name=name;
        this.qualification=qualification;
        this.chatRoomMediator = mediator;
    }

    @Override
    public String getSenderName() {
        return name + " - "+qualification;
    }

    @Override
    public void receiveMessage(IChatter sender, String message) {
        System.out.println(new Date().toString() + " [" + sender.getSenderName() + " -> "+this.name+"] : " + message);
    }

    @Override
    public void sendMessage(IChatter... receiver) {
        chatRoomMediator.sendMessage(this,"hello");
    }
}
