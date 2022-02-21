package javaCollection;

import java.util.LinkedList;
import java.util.Queue;

public class QueEx {
    public static void main(String[] args) {
        Queue<Message> msgQue = new LinkedList<>();
        msgQue.offer(new Message("send mail","hong"));
        msgQue.offer(new Message("send sms","kim"));
        msgQue.offer(new Message("send kko","park"));

        while (!msgQue.isEmpty()) {
            Message msg = msgQue.poll();
            switch (msg.command) {
                case "send mail":
                    System.out.println(msg.to + " 님에게 메일보냄");
                    break;
                case "send sms":
                    System.out.println(msg.to + " 님에게 문자보냄");
                    break;
                case "send kko":
                    System.out.println(msg.to + " 님에게 카톡보냄");
                    break;
            }
        }
    }
}
