package teme.util.ta_utils;

import org.apache.commons.lang3.SystemUtils;

public class DriversPath {

    public static String getDriverDirPath() {
        return System.getProperty("user.dir") + "/src/test/resources/drivers/" + getDriverDir();
    }

    private static String getDriverDir() {
        return (SystemUtils.IS_OS_WINDOWS) ? "windows/" : "mac/";
    }

    public static String getDriverExtension() {
        return (SystemUtils.IS_OS_WINDOWS) ? ".exe" : "";
    }
}