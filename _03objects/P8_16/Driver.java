package _03objects.P8_16;

public class Driver {
    public static void main(String[] args) {
        Message m1 = new Message("A","B");
        m1.append("How is it going?");
        m1.append("I miss you a lot.");
        System.out.println("The first message contet is: "+m1.toString());

        Message m2 = new Message("C","D");
        m1.append("Good morning!");
        m1.append("How are you?");
        System.out.println("The second message contet is: "+m2.toString());

        Mailbox mb = new Mailbox();
        mb.addMessage(m1); // add message 1
        mb.addMessage(m2); // add message 2
        Message newM = mb.getMessage(0); // get the first message
        System.out.println("The message contet is: "+newM.toString());
        mb.removeMessage(0); // remove the message with index 0
        Message newM2 = mb.getMessage(0); // get the first message
        System.out.println("The message contet is: "+newM2.toString());

    }
}
