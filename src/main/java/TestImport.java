import garden.vegetable.VineVegetable;
import nursery.vegetable.*;
public class TestImport {
    public static void main(String[] args) {
        String s = "Testing import statements!";
        System.out.println(s);

        VineVegetable.main(args);
        nursery.vegetable.VineVegetable.main(args);
    }
}
