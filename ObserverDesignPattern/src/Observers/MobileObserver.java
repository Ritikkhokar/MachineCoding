package Observers;

import Observabale.Subject;

public class MobileObserver implements Observers{
    Subject subject;
    String name;

    public MobileObserver(Subject subject, String name){
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("Message sent to " + name + "for update on weather:" + subject.getData());
    }

    @Override
    public void update() {
        display();
    }
}
