   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for two numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calculate the sum
        int sum = number1 + number2;

        // Display the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);

        scanner.close(); // Close the Scanner

