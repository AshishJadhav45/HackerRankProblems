class ExceptionDemo {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Invalid age");
        } else {
            System.out.println("Valid age");
        }
    }
}