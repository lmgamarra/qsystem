package pe.qsystem.prueba.domain.util;


import org.apache.commons.lang3.StringUtils;

import java.text.Normalizer;

public class StringUtil {

    public static String removeAccent(String str){
        //String normalized = Normalizer.normalize(str, Normalizer.Form.NFD);
        //return normalized.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        //return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").replaceAll(" +", " ");
    }

    public static String removeAccentAndLatinCaracter(String str){
        return removeAccent(str); //replaceAll("ñ","n").replaceAll("Ñ","N");
    }

    public static boolean isEqualStringWithOutAccent(String str1, String str2){
        
        // Reemplaza caracteres vacios (\p{Z} or \p{Separator}: any kind of whitespace or invisible separator)
        if (str1 != null) {
            str1 = str1.replaceAll("\\p{Z}"," ");
        }
        
        if (str2 != null) {
            str2 = str2.replaceAll("\\p{Z}"," ");     
        }
       
        
        //si ambos son nulos son iguales
        if (StringUtils.isBlank(str1) && StringUtils.isBlank(str2))
            return true;
        //si uno es nulo y el otro no, se considera que no son iguales
        if (StringUtils.isNotBlank(str1) && StringUtils.isBlank(str2) || StringUtils.isBlank(str1) && !StringUtils.isNotBlank(str2)){
            return false;
        }
        if (removeAccent(str1).trim().equalsIgnoreCase(removeAccent(str2).trim()))
            return true;
        return false;
    }
}
