public class Main {
    public static void main(String[] args) {
        Block b = new Block(10);
        int[] n = {3,4,5,6,7,8,9,20,23};
        Block b2 = new Block(5,6,26,7,8,9,34);
        System.out.println(b.toString());
        System.out.println(b2);


        Ticket ticket1 = new Ticket(8);
        System.out.println(ticket1);
        System.out.println("-----------------------------");
        Block block = new Block(1,3,10,14,16,20,23,30,42,49);
        System.out.println(block);
    }
}

