public class Main {

    public static void main(String[] args) {
        MagicBox<String> magicBox1 = new MagicBox<String>(3);
        MagicBox<Integer> magicBox2 = new MagicBox<Integer>(2);
        magicBox1.add("Вова ");
        magicBox1.add("Катя ");
        magicBox1.add("Олег ");
        System.out.println(magicBox1.pick());
        System.out.println(magicBox1.pick());
        System.out.println(magicBox1.pick());
        magicBox2.add(5);
        magicBox2.add(10);
        System.out.println(magicBox2.pick());
        System.out.println(magicBox2.pick());
        System.out.println(magicBox2.pick());
    }
}
