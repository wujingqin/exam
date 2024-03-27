package com.example.exam.answer;

import com.example.exam.pojo.Fruit;
import com.example.exam.pojo.ShopCar;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author qin
 * @version 2.0
 * @project exam
 * @description 超市类
 */
public class SurperMarket {

    //计算购物车水果总价
    public static BigDecimal calculateTotalPrice(ShopCar shopcar) {
        List<Fruit> fruitList = shopcar.getFruitList();
        BigDecimal totalPrice = new BigDecimal(0.0);
        if(fruitList !=null){
            for (Fruit fruit:fruitList) {
                 totalPrice = totalPrice.add(fruit.getFruitPrice().multiply(new BigDecimal(fruit.getFruitNum())).multiply(fruit.getDiscount()));
            }
        }

        if(shopcar.getPromotions()!=null && shopcar.getPromotions() == 1 ){//判断是否开启活动
            if (totalPrice.compareTo(new BigDecimal("100")) >= 0) {//开启活动满100-10
                return totalPrice.subtract(new BigDecimal("10"));
            } else {
                return totalPrice;
            }
        };

        return totalPrice;
    }

}
