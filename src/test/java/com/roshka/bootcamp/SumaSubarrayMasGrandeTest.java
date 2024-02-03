package com.roshka.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaSubarrayMasGrandeTest {
    @Test
    public void basicTests() {
        assertEquals(0, SumaSubarrayMasGrande.maximoSubArray(new int[] {}));
        assertEquals(6, SumaSubarrayMasGrande.maximoSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        assertEquals(1, SumaSubarrayMasGrande.maximoSubArray(new int[] {1}));
        assertEquals(7, SumaSubarrayMasGrande.maximoSubArray(new int[] {1, -2, 3, -1, 5}));
        assertEquals(0, SumaSubarrayMasGrande.maximoSubArray(new int[] {-1, -2, -3, -1, -5}));
        assertEquals(3, SumaSubarrayMasGrande.maximoSubArray(new int[] {2, -1, 2}));

    }
}
