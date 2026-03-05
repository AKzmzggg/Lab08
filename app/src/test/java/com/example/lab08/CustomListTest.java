package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // hasCity() 还不存在时，这里会报错/失败（这就是 RED）
        assertTrue(list.hasCity(calgary));
    }

}
