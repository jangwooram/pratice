package objectClass;

public class Rectangle {
    private int width, height;  // 캡슐 = 접근 제한


    public Rectangle(int width, int height) throws Exception {
        if (width <=0 || height <=0) {
            throw new Exception("음수 ㄴㄴ");
        }
        this.width =width;
        this.height=height;
    }
    public void setWidth(int width) {
        if (width>0) {
            this.width = width;
        }
    }
    public void setHeight(int height) {
        if (height>0) {
            this.height=height;
        }
    }
    int getArea() {
        return width*height;
    }

    int getWidth() {  // get 으로 캡슐화한 정보를 출력 할 수 있다.
        return width;
    }
    int getHeight() {
        return height;
    }


}
