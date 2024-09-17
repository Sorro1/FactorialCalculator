public class FilingStation {
    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива");

        var fuelType = 678;
        int amout = -98;
        var hasDiscount = amout > 10;

        double fuel92price = 60.2;
        double fuel95price = 67.33;

        double discout = 0.1;
        String wrongFuelTypeMessage = "Указан неверный тип топлива";
        String fuelPriceMessage;

        double fuelprice = 0;
        if(fuelType == 92) {
            fuelprice = fuel92price;
        }
        else if(fuelType == 95) {
            fuelprice =  fuel95price;
        } else {
            System.out.println(wrongFuelTypeMessage);
        }

        if (hasDiscount) {
            fuelprice = (1 -discout)  * fuelprice;
        }

        if(amout < 1) {
            System.out.println("Указана слишком малое количество топлива");
            amout = 0;
        }
          fuelPriceMessage = "Цена выбранного топлива: " + fuelprice + " руб.";

        System.out.println(fuelPriceMessage);

        double totalPrice = fuelprice * amout;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }
}
