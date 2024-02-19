package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

    private String topic; // Object variable for the topic

    // Constructor
    public SubscribeMsg(String user, String topic) {
        super(MessageType.SUBSCRIBE, user);
        this.topic = topic;
    }

    // Getter method for the topic
    public String getTopic() {
        return this.topic;
    }

    // Setter method for the topic
    public void setTopic(String topic) {
        this.topic = topic;
    }

    // toString method
    @Override
    public String toString() {
        return "SubscribeMsg{" +
                "user='" + getUser() + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}