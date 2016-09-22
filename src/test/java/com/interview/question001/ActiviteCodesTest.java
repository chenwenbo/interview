package com.interview.question001;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * 第 0001 题：做为 Apple Store App 独立开发者，你要搞限时促销，为你的应用生成激活码（或者优惠券）
 */
public class ActiviteCodesTest {

    public static final String ACTIVITE_NAME = "couponCodes";

    private ActiviteCode activiteCode = new ActiviteCode();
    private Set<String> activiteCodes;

    @Before
    public void before() {
        activiteCodes = this.activiteCode.getActiviteCode(200, 15);
    }

    @Test
    public void generateCouponCodeTest() {
        for (String code : activiteCodes) {
            System.out.println(code);
        }
        assertEquals(200, activiteCodes.size());
    }

}
