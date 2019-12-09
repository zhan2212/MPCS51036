package _03objects.P8_16;

import java.util.ArrayList;

public class Mailbox {
    public ArrayList<Message> getBox() {
        return box;
    }

    public void setBox(ArrayList<Message> box) {
        this.box = box;
    }

    private ArrayList<Message> box = new ArrayList<>();

    public void addMessage(Message m){
        box.add(m);
    }
    public Message getMessage(int i){
        return box.get(i);
    }
    public void removeMessage(int i){
        box.remove(i);
    }
}
