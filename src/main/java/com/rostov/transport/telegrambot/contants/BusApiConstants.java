package com.rostov.transport.telegrambot.contants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class BusApiConstants {

    public static String GET_BUS_LIST_URL = "https://rnd.don.su/get_bus_list";
    public static String POST_BUS_LIST_URL = "https://rnd.don.su/get_bus";
}
