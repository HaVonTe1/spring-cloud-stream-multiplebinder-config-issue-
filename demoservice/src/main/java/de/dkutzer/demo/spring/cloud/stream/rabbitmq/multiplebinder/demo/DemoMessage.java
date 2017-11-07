package de.dkutzer.demo.spring.cloud.stream.rabbitmq.multiplebinder.demo;

public class DemoMessage {

    private String text;

    public DemoMessage() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DemoMessage{");
        sb.append("text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
