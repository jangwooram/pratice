package inheritance;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationEx {
    public static void main(String[] args) {
        Method[] declareShoot = Shooting.class.getDeclaredMethods();
        for(Method i : declareShoot) {
            if(i.isAnnotationPresent(PrintAnno.class)) {
                PrintAnno anno = i.getAnnotation(PrintAnno.class);
                System.out.println("[" + i.getName() + "]");
                try {
                    i.invoke(new Shooting());
                } catch (Exception e) {
                    System.out.println("오류");
                }

                for (int j =0; j< anno.number(); j++) {
                    System.out.print(anno.value());
                }
                System.out.println();
            }
        }

    }
}
