package com.example.exam.util;

import java.math.BigDecimal;

/**
 * @author qin
 * @version 2.0
 * @project exam
 * @description 常量
 * @date 2024/3/27 13:17:14
 */
public class Constant {
    //苹果单价
    public final static BigDecimal applePrice = new BigDecimal("8");
    //草莓单价
    public final static BigDecimal strawberryPrice = new BigDecimal("13");
    //芒果单价
    public final static BigDecimal mangoPrice = new BigDecimal("20");

    //没有折扣
    public final static BigDecimal noDiscounts = new BigDecimal("1.0");
    //八折折扣
    public final static BigDecimal twentyPercentOff = new BigDecimal("0.8");

}
