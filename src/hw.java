public class hw {



    public static void main(String[] args) {

        int year = 2022;
        hw hw = new hw();
        hw.isLeapYearAndPrint(year);


    int clientOs = 0;
    hw.checkAndPrintSuitableOs(clientOs, year);

        int deliveryDistance = 95;
        hw.calculateDeliveryDays(deliveryDistance);
        System.out.println(hw.calculateDeliveryDays(deliveryDistance) + " days delivery");


    }

    public void isLeapYearAndPrint(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(" year is leap" + year);
        } else {
            System.out.println(" year is not leap " + year);
    }




    }

    public void checkAndPrintSuitableOs(int clientOs, int year) {
        if (clientOs == 0 && year == 2022) {
            System.out.println("You need new version iOS");
        } else if (clientOs == 0 && year < 2022) {
            System.out.println(" you nee lite version iOS");
        } else if (clientOs == 1 && year == 2022) {
            System.out.println("You need new version Android");
        } else if (clientOs == 1 && year < 2022) {
            System.out.println("you nee lite version Android");
        } else {
            System.out.println(" your phone model out of service");
        }
    }

    public int calculateDeliveryDays(int distance) {
        if (distance < 20 && distance > 0) {
            return 1;
        } else if (distance < 60 && distance >= 20) {
            return 2;
        } else if (distance < 100 && distance >= 60) {
            return 3;
        } else {
            throw new RuntimeException("no delivery");

        }
    }

}
