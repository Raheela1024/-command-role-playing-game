package com.fg.menu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by raheela on 01/02/2019.
 */
public enum MenuEnum {
    ADD_CHARACTER(1),
    EXPLORE(2),
    PLAY(3),
    RESUME(4),
    EXIT(5);

    private int value;

    private static Map<Integer, MenuEnum> map = new HashMap<>();

    MenuEnum(int i) {
        this.value = i;
    }

    static {
        Arrays.stream(MenuEnum.values()).forEach(k -> map.put(k.value, k));
    }

    public static MenuEnum valueOf(Integer i) {
        return map.get(i);
    }

    public int value() {
        return this.value;
    }
}
