package com.example.exam;

import com.example.exam.answer.SurperMarket;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class ExamApplicationTests {
    //验证第一题
    @Test
    void calculateTotalPriceA() {
        Integer appleWeight = new Integer(2); // 购买的苹果斤数
        Integer strawberryWeight =  new Integer(3); // 购买的草莓斤数

        BigDecimal totalPriceA = SurperMarket.calculateTotalPriceA(appleWeight, strawberryWeight);

        System.out.println("总价为：" + totalPriceA + " 元");
    }
    //验证第二题
    @Test
    void calculateTotalPriceB() {
        Integer appleWeight = new Integer(2); // 购买的苹果斤数
        Integer strawberryWeight =  new Integer(3); // 购买的草莓斤数
        Integer mangoWeight =  new Integer(4);; // 购买的芒果斤数

        BigDecimal totalPriceA = SurperMarket.calculateTotalPriceB(appleWeight, strawberryWeight, mangoWeight);

        System.out.println("总价为：" + totalPriceA + " 元");
    }
    //验证第三题
    @Test
    void calculateTotalPriceC() {
        Integer appleWeight = new Integer(2); // 购买的苹果斤数
        Integer strawberryWeight =  new Integer(3); // 购买的草莓斤数
        Integer mangoWeight =  new Integer(4);; // 购买的芒果斤数

        BigDecimal totalPriceA = SurperMarket.calculateTotalPriceC(appleWeight, strawberryWeight, mangoWeight);

        System.out.println("总价为：" + totalPriceA + " 元");
    }
    //验证第四题
    @Test
    void calculateTotalPriceD() {
        Integer appleWeight = new Integer(2); // 购买的苹果斤数
        Integer strawberryWeight =  new Integer(3); // 购买的草莓斤数
        Integer mangoWeight =  new Integer(4);; // 购买的芒果斤数

        BigDecimal totalPriceA = SurperMarket.calculateTotalPriceD(appleWeight, strawberryWeight, mangoWeight);

        System.out.println("总价为：" + totalPriceA + " 元");
    }

}
