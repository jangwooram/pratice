package exercise2;

public class Chatting {
boolean vcvc = true;
    void startChatt(String chatId) {
        Chat chat = new Chat(){
            @Override
            public void start() {
                while (vcvc) {
                    String inputData = "안녕하세요";
                    String iMessage = "[" + chatId + "]"+ inputData;
                    message(iMessage);
                    vcvc = false;
                }
            }
        };
        chat.start();
    }

    class Chat {
        void start(){}
        void message(String iMessage){
            System.out.println(iMessage);
        }
    }
}
