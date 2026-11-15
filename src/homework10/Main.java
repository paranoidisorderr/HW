package homework10;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Alex", "", "Mike"};
        int[] ages = {20, 20, -5};

        for (int i = 0; i < names.length; i++) {
            try {
                String name = registerUser(names[i], ages[i]);
                System.out.println("User registered: " + name);
            } catch (InvalidAgeException | EmptyNameException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Registration check finished");
            }
        }

        try {
            double balance = withdrawMoney(100, 150);
            System.out.println("Remaining balance: " + balance);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Withdrawal check finished");
        }
    }

    public static String registerUser(String name, int age) throws InvalidAgeException {
        if (name == null || name.trim().isEmpty()) {
            throw new EmptyNameException("Name cannot be empty");
        }
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        return name;
    }

    public static double withdrawMoney(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough money");
        }
        return balance - amount;
    }
}