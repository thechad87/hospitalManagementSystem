package com.hospitalApp.hospitalApp.misc;

import java.util.UUID;

/**
 * Created by ChadMarthinussen2 on 2019/10/10.
 */
public class Misc {

    public static int generateRandomId() {
        return Integer.parseInt(UUID.randomUUID().toString());
    }
}
