public class TrigonometricOperations {
    public static double sin(double angle, String unit) {
        if (unit.equals("deg")) {
            angle = Math.toRadians(angle);
        }
        return Math.sin(angle);
    }

    public static double cos(double angle, String unit) {
        if (unit.equals("deg")) {
            angle = Math.toRadians(angle);
        }
        return Math.cos(angle);
    }

    public static double tan(double angle, String unit) {
        if (unit.equals("deg")) {
            angle = Math.toRadians(angle);
        }
        return Math.tan(angle);
    }

    public static double cot(double angle, String unit) {
        if (unit.equals("deg")) {
            angle = Math.toRadians(angle);
        }
        return 1 / Math.tan(angle);
    }

    public static double sec(double angle, String unit) {
        if (unit.equals("deg")) {
            angle = Math.toRadians(angle);
        }
        return 1 / Math.cos(angle);
    }

    public static double csc(double angle, String unit) {
        if (unit.equals("deg")) {
            angle = Math.toRadians(angle);
        }
        return 1 / Math.sin(angle);
    }
}
