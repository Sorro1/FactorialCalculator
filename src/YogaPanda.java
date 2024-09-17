public class YogaPanda {
    public static void main(String[] args) {
        boolean passIsValid = true;
        boolean inCarantine = true;

        boolean isPersonnel = true;

        String massage;
        if (passIsValid && !inCarantine) {
            massage = "Проход открыт";
        } else if (isPersonnel) {
            massage = "Проход открыт только для персонала";
        } else {
            massage = "Проход закрыт";
        }

    }
}