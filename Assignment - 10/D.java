class A {
    void showA() {
        System.out.println("Class A");
    }
}

class B extends A {
    void showB() {
        System.out.println("Class B");
    }
}

class C extends B {
    void showC() {
        System.out.println("Class C");
    }
}

class D extends B {
    void showD() {
        System.out.println("Class D");
    }
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.showA();
        obj1.showB();
        obj1.showC();

        D obj2 = new D();
        obj2.showA();
        obj2.showB();
        obj2.showD();
    }
}