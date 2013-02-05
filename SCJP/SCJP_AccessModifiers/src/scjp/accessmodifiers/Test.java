package scjp.accessmodifiers;

public class Test {

    public static void main(String[] args) {
        double temp = Math.random();
        if (temp < 0.5) {
            System.out.println("left");
        } else {
            System.out.println("right");
        }
    }

}

class A {
    protected int x;

    protected void f() {
    }

    protected static String name = "Ku-Ku";
}

class B extends A {
    public void someFunc() {
        x = 10; // Доступ к защищённому члену материнского класса
        f();
        A ref = new A();
        ref.x = 13; // В контексте дочернего класса отношение к защищённым
                    // членам как к публичным
        @SuppressWarnings("unused")
        String bebe = A.name; // Статические переменные - не исключение
    }
}

class C {
    @SuppressWarnings("unused")
    public void someFunc() {
        String mmm = A.name; // Неверный вызов. Переменная name - защищена и не
                             // видна извне (Только если класс С находится
                             // в другом пакете. Если класс С находится в том же
                             // пакете, что и А, то будет доступна)
        A a = new A();
        int myX = a.x; // Неверный вызов. Переменная x - не видна извне (Только
                       // если класс С находится в другом пакете. Если
                       // класс С находится в том же пакете, что и А, то будет
                       // доступна)
        a.x = 1; // Неверный вызов. Переменная x - не видна извне (Только если
                 // класс С находится в другом пакете. Если класс С
                 // находится в том же пакете, что и А, то будет доступна)}}
        a.f(); // Неверный вызов. Функция f - не видна извне (Только если класс
               // С находится в другом пакете. Если класс С находится
               // в том же пакете, что и А, то будет доступна)}}
    }
}