import java.util.Scanner;


    public class Account {

        
    private int code;
    private String holder;
    private double balance;


    public Account(int code, String holder){
        this.code = code;

    }


        public int getCode() {
            return code;
        }

        public String getHolder() {
            return holder;
        }
        public double getBalance() {
            return balance;
        }
        public int setCode(int newCode){
            return this.code = newCode;
        }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);



        scanner.close();

        Account conta1 = new Account(10, "joão");
        System.out.println(conta1.getCode());
        System.out.println(conta1.getHolder());

        conta1.getCode();
        System.out.println(conta1.setCode(20));
        conta1.setCode(40);
        System.out.println(conta1.code);


    
}
    }
