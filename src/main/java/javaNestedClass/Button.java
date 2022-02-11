package javaNestedClass;

public class Button {

    OnclickListener listener;

    void setOnClickListener(OnclickListener aa) {
        this.listener = aa;
    }

    void touch() {
        listener.onClick();
    }

    interface OnclickListener {
        void onClick();
    }
}
