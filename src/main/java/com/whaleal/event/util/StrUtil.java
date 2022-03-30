package com.whaleal.event.util;

/**
 *
 * @author wh
 */
public class StrUtil {

    private StrUtil(){}

    public static boolean isBlank( String str ) {
        int strLen;
        if (str != null && (strLen = str.length()) != 0) {
            for (int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }
}