public class App {
    public static void main(String[] args) throws Exception {
        Director director1 = new Director("Yousef", "IT", 5000, 50000.2);
        Engineer engineer1 = new Engineer("Saleh", "CE", 4000.5,
                new String[] { "Communication", "Leadership", "Creative Thinking" });
        SalesPerson salesPerson1 = new SalesPerson("Hamad", "Sales", 3000.5, 48);

        System.out.println(director1 + "\n");
        System.out.println(engineer1 + "\n");
        System.out.println(salesPerson1 + "\n");

    }
}
