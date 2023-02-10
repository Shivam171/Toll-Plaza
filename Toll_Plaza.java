import java.util.Scanner;

interface Vehicle {
    void twowheeler();

    void fourwheeler();
}

interface Ways extends Vehicle {
    void OneWay_two();

    void TwoWay_two();

    void OneWay_four();

    void TwoWay_four();
}

interface Charges extends Ways {
    void charge_two_wheeler_one();

    void charge_four_wheeler_two();

    void charge_two_wheeler_two();

    void charge_four_wheeler_one();

    void revenue();
}

class TollPlaza implements Vehicle, Ways, Charges {
    int price = 0, i = 0;
    Scanner sc = new Scanner(System.in);

    public void twowheeler() {
        System.out.println("\nSELECT YOUR ROUTE\n1. ONE WAY ROUTE\n2. TWO ROUTE\n");
        System.out.print("Choose Option -> ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                OneWay_two();
                break;
            case 2:
                TwoWay_two();
                break;
        }
    }

    public void fourwheeler() {
        System.out.println("\nSELECT YOUR ROUTE\n1. ONE WAY ROUTE\n2. TWO ROUTE\n");
        System.out.print("Choose Option -> ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                OneWay_four();
                break;
            case 2:
                TwoWay_four();
                break;
        }
    }

    public void ambulance() {
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|                  AMOUNT CHARGED: Rs. 0                     |");
        System.out.println("|------------------------------------------------------------|\n");
        i = i + 1;
    }

    public void policecar() {
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|                  AMOUNT CHARGED: Rs. 0                     |");
        System.out.println("|------------------------------------------------------------|\n");
        i = i + 1;
    }

    public void firebrigade() {
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|                  AMOUNT CHARGED: Rs. 0                     |");
        System.out.println("|------------------------------------------------------------|\n");
        i = i + 1;
    }

    public void OneWay_two() {
        System.out.println("\nDO YOU HAVE PLAZA PASS !!\n1. YES\n2. NO\n");
        System.out.print("Choose Option -> ");
        int n = sc.nextInt();
        if (n == 1) {
            i = i + 1;
            System.out.println("|------------------------------------------------------------|");
            System.out.println("|                  AMOUNT CHARGED: Rs. 0                     |");
            System.out.println("|------------------------------------------------------------|\n");
        } else if (n == 2) {
            charge_two_wheeler_one();
        }
    }

    public void TwoWay_two() {
        System.out.println("\nDO YOU HAVE PLAZA PASS !!\n1. YES\n2. NO\n");
        System.out.print("Choose Option -> ");
        int n = sc.nextInt();
        if (n == 1) {
            i = i + 1;
            System.out.println("|------------------------------------------------------------|");
            System.out.println("|                  AMOUNT CHARGED: Rs. 0                     |");
            System.out.println("|------------------------------------------------------------|\n");
        } else if (n == 2) {
            charge_two_wheeler_two();
        }
    }

    public void OneWay_four() {
        System.out.println("\nDO YOU HAVE PLAZA PASS !!\n1. YES\n2. NO\n");
        System.out.print("Choose Option -> ");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("|------------------------------------------------------------|");
            System.out.println("|                  AMOUNT CHARGED: Rs. 0                     |");
            System.out.println("|------------------------------------------------------------|\n");
        } else if (n == 2) {
            charge_four_wheeler_one();
        }
    }

    public void TwoWay_four() {
        System.out.println("\nDO YOU HAVE PLAZA PASS !!\n1. YES\n2. NO\n");
        System.out.print("Choose Option -> ");
        int n = sc.nextInt();
        if (n == 1) {
            i = i + 1;
            System.out.println("|------------------------------------------------------------|");
            System.out.println("|                  AMOUNT CHARGED: Rs. 0                     |");
            System.out.println("|------------------------------------------------------------|\n");
        } else if (n == 2) {
            charge_four_wheeler_two();
        }
    }

    public void charge_two_wheeler_one() {
        int fixcharge = 25;
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|                  AMOUNT CHARGED: Rs. " + fixcharge + "                    |");
        System.out.println("|------------------------------------------------------------|\n");
        price = price + fixcharge;
        i = i + 1;
    }

    public void charge_four_wheeler_one() {
        int fixcharge = 100;
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|                  AMOUNT CHARGED: Rs. " + fixcharge + "                   |");
        System.out.println("|------------------------------------------------------------|\n");
        price = price + fixcharge;
        i = i + 1;

    }

    public void charge_two_wheeler_two() {
        int fixcharge = 50;
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|                  AMOUNT CHARGED: Rs. " + fixcharge + "                    |");
        System.out.println("|------------------------------------------------------------|\n");
        price = price + fixcharge;
        i = i + 1;
    }

    public void charge_four_wheeler_two() {
        int fixcharge = 100;
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|                  AMOUNT CHARGED: Rs. " + fixcharge + "                   |");
        System.out.println("|------------------------------------------------------------|\n");
        price = price + fixcharge;
        i = i + 1;
    }

    public void revenue() {
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|                  TOTAL REVENUE TO BE PAID                  |");
        System.out.println("|------------------------------------------------------------|");

        System.out.println("|     NO OF VEHICLES                      TOTAL AMOUNT       |");
        System.out.println("|     " + i + "                                   Rs. " + price + "              |");
        System.out.println("|------------------------------------------------------------|\n");
    }

    public void total_vechicle_count() {
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|                       VEHICLE COUNT                        |");
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|                            " + i + "                               |");
        System.out.println("|------------------------------------------------------------|\n");
    }
}

public class Toll_Plaza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        TollPlaza t = new TollPlaza();
        do {
            System.out.println(
                    "||======||  ||                   ======       ===============  ===============          ======        ");
            System.out.println(
                    "||      ||  ||                 {{      }}                ==                ==         {{      }}      ");
            System.out.println(
                    "||      ||  ||                {{        }}            ==                 ==          {{        }}     ");
            System.out.println(
                    "||======||  ||               {{          }}         ==                 ==           {{          }}    ");
            System.out.println(
                    "||          ||              {{============}}      ==                 ==            {{============}}   ");
            System.out.println(
                    "||          ||        ||   {{              }}   ==                 ==             {{              }}   ");
            System.out.println(
                    "==          ||========||  {{                }} ===============  ===============  {{                }}  ");
            System.out.println("|----------------------------------------|");
            System.out.println("|           SELECT VEHICLE TYPE          |");
            System.out.println("|----------------------------------------|");
            System.out.println("|             1. TWO WHEELER             |");
            System.out.println("|             2. FOUR WHEELER            |");
            System.out.println("|----------------------------------------|");
            System.out.println("|             3. AMBULANCE               |");
            System.out.println("|             4. POLICE CAR              |");
            System.out.println("|             5. FIRE BRIGADE            |");
            System.out.println("|----------------------------------------|");
            System.out.println("|             6. TRUCK                   |");
            System.out.println("|             7. AUTO & RICKSHAW         |");
            System.out.println("|             8. TRACTORS                |");
            System.out.println("|----------------------------------------|");
            System.out.println("|               CALCULATION              |");
            System.out.println("|----------------------------------------|");
            System.out.println("|           9. GENERATE REVENUE          |");
            System.out.println("|           10. VEHICLE COUNT            |");
            System.out.println("|----------------------------------------|");
            System.out.println("Press 0 for Exit !\n");
            System.out.print("Choose Option -> ");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    t.twowheeler();
                    break;
                case 2:
                    t.fourwheeler();
                    break;
                case 3:
                    t.ambulance();
                    break;
                case 4:
                    t.policecar();
                    break;
                case 5:
                    t.firebrigade();
                    break;
                case 9:
                    System.out.flush();
                    t.revenue();
                    System.out.flush();
                    break;
                case 10:
                    t.total_vechicle_count();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (n != 29);
    }
}