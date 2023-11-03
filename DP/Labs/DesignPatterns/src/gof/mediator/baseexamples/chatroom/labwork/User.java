package gof.mediator.baseexamples.chatroom.labwork;

import java.util.Date;

public class User implements IChatter{
    private String name;
    private ChatRoom chatRoomMediator;

    public String getSenderName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, ChatRoom mediator){
        this.name  = name;
        this.chatRoomMediator = mediator;
    }


    @Override
    public void receiveMessage(IChatter sender, String message) {
        System.out.println(new Date().toString() + " [" + sender.getSenderName() + " -> "+this.name+"] : " + message);
    }

    @Override
    public void sendMessage(IChatter... receivers) {
        chatRoomMediator.sendMessage(this,"Hi from "+this.getSenderName(), receivers);
    }
}
