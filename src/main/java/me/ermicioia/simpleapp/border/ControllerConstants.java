package me.ermicioia.simpleapp.border;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
class ControllerConstants {

    public static final String BASE_VERSION = "application/vnd.simpleapp.api";

    public static final String JSON_VERSION = BASE_VERSION + "+json";

    public static final String JSON_VERSION_1 = JSON_VERSION + ";version=1";

}
