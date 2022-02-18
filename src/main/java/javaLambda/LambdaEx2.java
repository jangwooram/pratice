package javaLambda;

public class LambdaEx2 {
    public static void main(String[] args) {
        Runnable runa = () -> {
            int luck =3;
            int num;
            for (int i=1; i <=10; i++){
                num = (int) (Math.random()*6)+1;
                if(num == luck) {
                    System.out.println("행운");
                } else {
                    System.out.println("실패 " + num);
                }
            }
        };
        Thread lucky = new Thread(runa);
        lucky.start();

        Thread thread = new Thread(() -> {
            int luck =3;
            int num;
            for (int i=1; i <=10; i++){
                num = (int) (Math.random()*6)+1;
                if(num == luck) {
                    System.out.println("행운");
                } else {
                    System.out.println("실패 " + num);
                }
            }
        });

        thread.start();
    }
}
