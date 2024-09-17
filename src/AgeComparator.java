public class AgeComparator {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (katyaAge < vasyaAge && katyaAge < mishaAge) {
            min = katyaAge;
        } else if (katyaAge < vasyaAge) {
            middle = katyaAge;
        } else {
            max = katyaAge;
        }

        if (vasyaAge < katyaAge && vasyaAge < mishaAge) {
            min = vasyaAge;
        } else if ( vasyaAge < mishaAge) {
            middle = vasyaAge;
        } else {
            max = vasyaAge;
        }

        if (mishaAge < katyaAge && mishaAge < vasyaAge) {
            min = mishaAge;
        } else if (mishaAge < vasyaAge) {
            middle = mishaAge;
        } else {
            max = mishaAge;
        }

        System.out.println("Minimal age: "+ min);
        System.out.println("Middle age: "+ middle);
        System.out.println("Maximal age: "+ max);
    }
}
