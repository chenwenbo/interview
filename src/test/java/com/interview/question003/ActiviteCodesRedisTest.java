package com.interview.question003;

import org.junit.Test;

/**
 * 第 0003 题：将 0001 题生成的 200 个激活码（或者优惠券）保存到 Redis 非关系型数据库中。
 */
public class ActiviteCodesRedisTest {

    public static final String ACTIVITE_NAME = "couponCodes";

//    private ActiviteCode activiteCode = new ActiviteCode();
//    private ActiviteCodeRedis activiteCodeRedis = new ActiviteCodeRedis();
//    private Set<String> activiteCodes;
//
//    @Before
//    public void before() {
//        activiteCodes = this.activiteCode.getActiviteCode(200, 15);
//    }

    @Test
    public void saveCouponsTest() {
        //given
//        activiteCodeRedis.clearActiviteCodes(ACTIVITE_NAME);
        //when
//        activiteCodeRedis.saveActiviteCode(ACTIVITE_NAME, activiteCodes);
        //then
//        List<String> activiteCodes = activiteCodeRedis.queryActivitesCode(ACTIVITE_NAME);
//        assertEquals(200, activiteCodes.size());
    }

}
