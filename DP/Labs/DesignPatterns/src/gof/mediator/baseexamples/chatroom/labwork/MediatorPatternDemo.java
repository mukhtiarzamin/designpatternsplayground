package gof.mediator.baseexamples.chatroom.labwork;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatRoom mediator=new ChatRoom();
        User robert = new User("Robert",mediator);
        User john = new User("John",mediator);
        Teacher ali = new Teacher("M Ali","MS(CS)",mediator);
        University university1 = new University("COMSATS","Abbottabad",mediator);
        // 1. User send a message to another User
        robert.sendMessage(john);
        // 1. User send a message to another User and teacher
        robert.sendMessage(john);
        IChatter[] receivers = {robert,university1};
        john.sendMessage(receivers);
    }
}
