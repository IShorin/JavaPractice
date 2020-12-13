package ru.IShorin.JavaPractice.laba28;

import java.util.Scanner;

class PayByCard implements PaymentStrategy {
    private int summ;
    private String cardnum, carddate;
    private int CVV;

    public PayByCard(int summ) {
        this.summ = summ;
        pay();
    }

    public boolean input_card_info() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("By Card");
            while (true) {
                cardnum = scanner.nextLine();
                String regex = "\\d{13,16}";
                if (cardnum.matches(regex)) {
                    System.out.println("Correct");
                    break;
                } else {
                    System.out.println("Incorrect, try again");
                }
            }
            System.out.println("write data like 12/2020");
            while (true) {
                carddate = scanner.nextLine();
                if (carddate.matches("(0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d")) {
                    System.out.println("Correct");
                    break;
                } else {
                    System.out.println("Incorrect, try again");
                }
            }
            System.out.println("Write CVV");
            while (true) {
                CVV = scanner.nextInt();
                if (CVV < 1000 && CVV > 99) {
                    System.out.println("Correct");
                    return true;
                } else {
                    System.out.println("Incorrect");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return false;
    }


    public void pay() {
        while (true) {
            if (input_card_info()) {
                System.out.println("Success");
                return;
            } else {
                System.out.println("Something went wrong(");
            }
        }
    }
}

    class PayByCash implements PaymentStrategy {
        private int summ;

        public PayByCash(int summ) {
            this.summ = summ;
            pay();
        }

        @Override
        public void pay() {
            System.out.println("Pay when you get your order:" + summ + " Thanks for purchase!");
        }
    }
    interface PaymentStrategy {
        void pay();
    }
