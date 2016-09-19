package com.interview;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * 第 0001 题：做为 Apple Store App 独立开发者，你要搞限时促销，为你的应用生成激活码（或者优惠券）
 * 第 0003 题：将 0001 题生成的 200 个激活码（或者优惠券）保存到 Redis 非关系型数据库中。
 */
public class CouponTest {

    public static final String ACTIVITE_NAME = "couponCodes";

    private Coupon coupon = new Coupon();

    @Test
    public void generateCouponCodeTest(){
        Set<String> coupons = coupon.getCouponCode(200, 15);
        assertEquals(200, coupons.size());
    }

    @Test
    public void saveCouponsTest(){
        Set<String> coupons = coupon.getCouponCode(200, 15);
        coupon.clearCoupons(ACTIVITE_NAME);
        coupon.saveCoupons(ACTIVITE_NAME,coupons);
    }


    @Test
    public void printCoupons(){
        coupon.printCoupons(ACTIVITE_NAME);
    }
}
