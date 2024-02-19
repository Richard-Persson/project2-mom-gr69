package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

    private String topic;


    public UnsubscribeMsg(String user, String topic) {
        super(MessageType.UNSUBSCRIBE, user);
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
        return "UnsubscribeMsg{" +
                "user='" + getUser() + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
