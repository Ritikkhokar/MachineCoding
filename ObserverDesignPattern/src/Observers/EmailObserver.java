package Observers;

import Observabale.Subject;

public class EmailObserver implements Observers{

    Subject subject;
    String name;

    public EmailObserver(Subject subject, String name){
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void display() {
        System.out.println("Email sent to " + name + "for update on weather:" + subject.getData());
    }

    @Override
    public void update() {
     display();
    }

}
