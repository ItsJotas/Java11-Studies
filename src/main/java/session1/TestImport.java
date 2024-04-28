package session1;

import session1.garden.vegetable.VineVegetable;

public class TestImport {
    public static void main(String[] args) {
        String s = "Testing import statements!";
        System.out.println(s);

        VineVegetable.main(args);
        session1.nursery.vegetable.VineVegetable.main(args);
    }
}
