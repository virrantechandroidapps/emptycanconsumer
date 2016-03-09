package com.virrantech.emptycan.apputills;

import java.util.regex.Pattern;

/**
 * Created by Aniruthan on 3/8/2016.
 */
public class ValidationUtills {
    public static boolean emailIdValidation(String paramString) {
        return Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$").matcher(paramString).matches();
    }

    public static boolean tenDigitNumberValidation(String paramString1) {

        return paramString1.trim().length() != 10;

    }

}
