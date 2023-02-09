import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        Field[] fields = time.getClass().getFields();
        Method[] methods = time.getClass().getDeclaredMethods();
        for (Method method : methods) {
            CustomManageTime customManageTime = method.getDeclaredAnnotation(CustomManageTime.class);
            if (customManageTime != null) {
                System.out.println(method.getName()+": "+customManageTime.value());

            }
        }
    }
}