public class Main {
    public static void main(String[] args) {
        double amountKWD = 86;
        double conversionRate = 3.25;
        double amountUSD = amountKWD * conversionRate;
        System.out.println(amountKWD + " KWD = " + amountUSD + " USD");

        double amountUSD1 = 279.5;
        double amountEUR = 300;
        double usdToKwdRate = 1 / 3.25;
        double eurToKwdRate = 1 / 3.5;
        double amountKWDFromUSD = amountUSD1 * usdToKwdRate;
        double amountKWDFromEUR = amountEUR * eurToKwdRate;
        System.out.println(amountUSD1 + " USD = " + amountKWDFromUSD + " KWD");
        System.out.println(amountEUR + " EUR = " + amountKWDFromEUR + " KWD");

    }
}
