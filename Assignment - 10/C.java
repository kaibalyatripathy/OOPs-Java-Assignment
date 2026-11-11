interface A {
    default void show() {
        System.out.println("Method of Interface A");
    }
}

interface B {
    default void show() {
        System.out.println("Method of Interface B");
    }
}

class C implements A, B {
    public void show() {
        A.super.show();
        B.super.show();
        System.out.println("Method of Class C");
    }
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}