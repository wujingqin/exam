package com.example.exam.answer;

import java.math.BigDecimal;

/**
 * @author qin
 * @version 1.0
 * @project exam
 * @description 超市类
 */
public class SurperMarket {
    private final static BigDecimal applePrice = new BigDecimal("8");//拼过单价
    private final static BigDecimal strawberryPrice = new BigDecimal("13");//草莓单价
    private final static BigDecimal mangoPrice = new BigDecimal("20");//芒果单价

    //第一题苹果草莓
    public static BigDecimal calculateTotalPriceA(Integer appleWeight, Integer strawberryWeight) {
        BigDecimal appleTotalPrice = applePrice.multiply(new BigDecimal(appleWeight));
        BigDecimal strawberryTotalPrice = strawberryPrice.multiply(new BigDecimal(strawberryWeight));
        return appleTotalPrice.add(strawberryTotalPrice);
    }
    //第二题苹果草莓+芒果
    public static BigDecimal calculateTotalPriceB(Integer appleWeight, Integer strawberryWeight, Integer mangoWeight) {
        BigDecimal totalPriceA = calculateTotalPriceA(appleWeight, strawberryWeight);
        BigDecimal mangoTotalPrice = mangoPrice.multiply(new BigDecimal(mangoWeight));
        return totalPriceA.add(mangoTotalPrice);
    }
    //第三题草莓八折
    public static BigDecimal calculateTotalPriceC(Integer appleWeight, Integer strawberryWeight, Integer mangoWeight) {
        BigDecimal appleTotalPrice = applePrice.multiply(new BigDecimal(appleWeight));
        BigDecimal strawberryTotalPrice = strawberryPrice.multiply(new BigDecimal(strawberryWeight)).multiply(new BigDecimal("0.8"));
        BigDecimal mangoTotalPrice = mangoPrice.multiply(new BigDecimal(mangoWeight));
        return appleTotalPrice.add(strawberryTotalPrice).add(mangoTotalPrice);
    }
    //第四题满100减10
    public static BigDecimal calculateTotalPriceD(Integer appleWeight, Integer strawberryWeight, Integer mangoWeight) {
        //草莓八折
        BigDecimal totalPrice = calculateTotalPriceC(appleWeight, strawberryWeight, mangoWeight);
        //满100减10
        if (totalPrice.compareTo(new BigDecimal("100")) >= 0) {
            return totalPrice.subtract(new BigDecimal("10"));
        } else {
            return totalPrice;
        }
    }

}
