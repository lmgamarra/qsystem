package pe.qsystem.prueba.domain.util;

public class PasswordUtil {

    public static String NUMEROS = "0123456789";

    public static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";

    public static String ESPECIALES = "<>@/-#${}[]_.'?¿";

    public static String generatePassword(Integer length) {
        return getPassword(length);
    }

    private static String getPassword(int length) {
        return getPassword(NUMEROS + MAYUSCULAS + MINUSCULAS + ESPECIALES, length);
    }

    private static String getPassword(String key, int length) {
        String pswd = "";
        for (int i = 0; i < length; i++) {
            pswd += (key.charAt((int) (Math.random() * key.length())));
        }
        return pswd;
    }
}
