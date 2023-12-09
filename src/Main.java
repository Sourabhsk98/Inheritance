
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class One {
    public void Number()
    {
        System.out.println("One");
    }
}
class Two extends One {
    public void Number() {
        System.out.println("Two");
    }
}

class Three extends Two {
    public void Number()
    {
        System.out.println("Three");
    }
}

// Drived class
public class Main {
    public static void main(String[] args)
    {
        One o = new One();
        Two T = new Two();
        Three t = new Three();
        o.Number();
        T.Number();
        t.Number();
    }
}