package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

    // message sent from client to create topic on the broker
    private String topic; //Objekt variabler for topic


    public DeleteTopicMsg(String user, String topic) {
        super(MessageType.DELETETOPIC, user);
        this.topic = topic;
    }

    // TODO:
    //Getter for topic
    public String getTopic() {
        return topic;
    }

    //setter for topic
    public void setTopic(String topic) {
        this.topic = topic;
    }

    //toString metoder
    @Override
    public String toString() {
        return "DeleteTopicMsg [user=" + getUser() + ", topic=" + topic + "]";
    }

}
