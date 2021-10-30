package me.ermicioia.simpleapp.border;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class ControllerConstants {

    private static final String BASE_VERSION = "application/vnd.simpleapp.api";

    private static final String JSON_VERSION = BASE_VERSION + "+json";
    private static final String CSV_VERSION = BASE_VERSION + "+csv";

    public static final String JSON_VERSION_1 = JSON_VERSION + ";version=1";

    public static final String CSV_VERSION_1 = CSV_VERSION + ";version=1";

}
