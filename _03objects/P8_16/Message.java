package _03objects.P8_16;

import java.util.ArrayList;

public class Message {
    public ArrayList<String> getMessage() {
        return message;
    }

    public String getMsender() {
        return msender;
    }

    public String getMrecipient() {
        return mrecipient;
    }

    public void setMessage(ArrayList<String> message) {
        this.message = message;
    }

    public void setMsender(String msender) {
        this.msender = msender;
    }

    public void setMrecipient(String mrecipient) {
        this.mrecipient = mrecipient;
    }

    private ArrayList<String> message = new ArrayList<String>(); // use to store the message
    private String msender;
    private String mrecipient;
    public Message(String sender, String recipient){
        msender = sender;
        mrecipient = recipient;
    }
    public void append(String text){
        message.add(text);
    }

    @Override
    public String toString(){
        // make the message to a long string
        String longText = "From:"+ msender + "%nTo: " + mrecipient + "%n ";
        for(int i=0; i < message.size();i++){
            longText += message.get(i)+" ";
        }
        return longText;
    }
}
