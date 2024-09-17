public class CoffeMachine {
    public static void main(String[] args) {
        int coffeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkamAmount = 1;

        boolean isBlocked = true;

        int cappucinoMilkReqird = 60; // in grams
        int cappucinoCofffeReqird = 15; // in grams

        boolean milkIsEnougt = skimmedMilkamAmount >= cappucinoMilkReqird ||
                milkAmount >= cappucinoMilkReqird;boolean coffeeIsEnougt = coffeAmount >= cappucinoCofffeReqird;

        // TODO: ckeck another types of coffee
        boolean coffeeIsEnough = coffeAmount >= cappucinoCofffeReqird;

        boolean hasErrors = false;
        if (isBlocked) {
            System.out.println("Кофе-машина заблокирована");
            hasErrors = true;

        }

        if (!coffeeIsEnough) {
            System.out.println("Кофе недостаточно");
            // TODO: some action
            hasErrors = true;
        }


        if (!milkIsEnougt) {
            System.out.println("Малака недостаточно");
            hasErrors = true;
        }
        if (!hasErrors) {
            System.out.println("Готовим кофе");
        }
    }
}
