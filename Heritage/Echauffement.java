

abstract class D {
    abstract String un(char x);
    abstract String un(String s);
    abstract String deux();
    String un(int n) {
        return "D un "+n;
    }
}

abstract class E extends D {

    String un(char x) {
        return "E un " + x;
    }
    String un(String s) {
        return "E un " + s;
    }
}

class F extends E {
    String un(String s) {
        return "F un " + s;
    }
    String deux() {
        return "F deux";
    }
}


public class Echauffement {
    public static void main(String [] args) {
        D objet = new F();
        System.out.println(objet.un(42));
        System.out.println(objet.un('X'));
        System.out.println(objet.un("42"));
        System.out.println(objet.deux());
    }
}


