package com.example.exam;

import com.example.exam.answer.SurperMarket;
import com.example.exam.pojo.Fruit;
import com.example.exam.pojo.ShopCar;
import com.example.exam.util.Constant;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class ExamApplicationTests {

    //验证第一题
    @Test
    void calculateTotalPriceA(){
        ShopCar shopCar = new ShopCar();
        List<Fruit> fruitList = new ArrayList<>();
        Fruit apple = new Fruit();

        apple.setFruitName("苹果");
        apple.setFruitPrice(Constant.applePrice);
        apple.setDiscount(Constant.noDiscounts);//不打折
        apple.setFruitType(1);
        apple.setFruitNum(2);//两斤苹果

        fruitList.add(apple);

        Fruit strawberry = new Fruit();

        strawberry.setFruitName("草莓");
        strawberry.setFruitPrice(Constant.strawberryPrice);
        strawberry.setDiscount(Constant.noDiscounts);//不打折
        strawberry.setFruitType(2);
        strawberry.setFruitNum(3);//3斤草莓
        fruitList.add(strawberry);

        shopCar.setFruitList(fruitList);//加购

        BigDecimal totalPrice = SurperMarket.calculateTotalPrice(shopCar);
        System.out.println("总价为：" + totalPrice + " 元");
    }

    //验证第二题
    @Test
    void calculateTotalPriceB(){
        ShopCar shopCar = new ShopCar();
        List<Fruit> fruitList = new ArrayList<>();
        Fruit apple = new Fruit();

        apple.setFruitName("苹果");
        apple.setFruitPrice(Constant.applePrice);
        apple.setDiscount(Constant.noDiscounts);//不打折
        apple.setFruitType(1);
        apple.setFruitNum(2);//两斤苹果

        fruitList.add(apple);

        Fruit strawberry = new Fruit();

        strawberry.setFruitName("草莓");
        strawberry.setFruitPrice(Constant.strawberryPrice);
        strawberry.setDiscount(Constant.noDiscounts);//不打折
        strawberry.setFruitType(2);
        strawberry.setFruitNum(3);//3斤草莓
        fruitList.add(strawberry);

        Fruit mango = new Fruit();

        mango.setFruitName("芒果");
        mango.setFruitPrice(Constant.mangoPrice);
        mango.setDiscount(Constant.noDiscounts);//不打折
        mango.setFruitType(3);
        mango.setFruitNum(4);//4斤芒果
        fruitList.add(mango);

        shopCar.setFruitList(fruitList);//加购

        BigDecimal totalPrice = SurperMarket.calculateTotalPrice(shopCar);
        System.out.println("总价为：" + totalPrice + " 元");
    }

    //验证第三题
    @Test
    void calculateTotalPriceC(){
        ShopCar shopCar = new ShopCar();
        List<Fruit> fruitList = new ArrayList<>();
        Fruit apple = new Fruit();

        apple.setFruitName("苹果");
        apple.setFruitPrice(Constant.applePrice);
        apple.setDiscount(Constant.noDiscounts);//不打折
        apple.setFruitType(1);
        apple.setFruitNum(2);//两斤苹果

        fruitList.add(apple);

        Fruit strawberry = new Fruit();

        strawberry.setFruitName("草莓");
        strawberry.setFruitPrice(Constant.strawberryPrice);
        strawberry.setDiscount(Constant.twentyPercentOff);//八折
        strawberry.setFruitType(2);
        strawberry.setFruitNum(3);//3斤草莓
        fruitList.add(strawberry);

        Fruit mango = new Fruit();

        mango.setFruitName("芒果");
        mango.setFruitPrice(Constant.mangoPrice);
        mango.setDiscount(Constant.noDiscounts);//不打折
        mango.setFruitType(3);
        mango.setFruitNum(4);//4斤芒果
        fruitList.add(mango);

        shopCar.setFruitList(fruitList);//加购

        BigDecimal totalPrice = SurperMarket.calculateTotalPrice(shopCar);
        System.out.println("总价为：" + totalPrice + " 元");
    }

    @Test
    void calculateTotalPriceD(){
        ShopCar shopCar = new ShopCar();
        List<Fruit> fruitList = new ArrayList<>();
        Fruit apple = new Fruit();

        apple.setFruitName("苹果");
        apple.setFruitPrice(Constant.applePrice);
        apple.setDiscount(Constant.noDiscounts);//不打折
        apple.setFruitType(1);
        apple.setFruitNum(2);//两斤苹果

        fruitList.add(apple);

        Fruit strawberry = new Fruit();

        strawberry.setFruitName("草莓");
        strawberry.setFruitPrice(Constant.strawberryPrice);
        strawberry.setDiscount(Constant.twentyPercentOff);//八折
        strawberry.setFruitType(2);
        strawberry.setFruitNum(3);//3斤草莓
        fruitList.add(strawberry);

        Fruit mango = new Fruit();

        mango.setFruitName("芒果");
        mango.setFruitPrice(Constant.mangoPrice);
        mango.setDiscount(Constant.noDiscounts);//不打折
        mango.setFruitType(3);
        mango.setFruitNum(4);//4斤芒果
        fruitList.add(mango);

        shopCar.setFruitList(fruitList);//加购
        shopCar.setPromotions(1);//参与活动
        BigDecimal totalPrice = SurperMarket.calculateTotalPrice(shopCar);
        System.out.println("总价为：" + totalPrice + " 元");
    }

    //验证第一题
//    @Test
//    void calculateTotalPriceA() {
//        Integer appleWeight = new Integer(2); // 购买的苹果斤数
//        Integer strawberryWeight =  new Integer(3); // 购买的草莓斤数
//
//        BigDecimal totalPriceA = SurperMarket.calculateTotalPriceA(appleWeight, strawberryWeight);
//
//        System.out.println("总价为：" + totalPriceA + " 元");
//    }
//    //验证第二题
//    @Test
//    void calculateTotalPriceB() {
//        Integer appleWeight = new Integer(2); // 购买的苹果斤数
//        Integer strawberryWeight =  new Integer(3); // 购买的草莓斤数
//        Integer mangoWeight =  new Integer(4);; // 购买的芒果斤数
//
//        BigDecimal totalPriceA = SurperMarket.calculateTotalPriceB(appleWeight, strawberryWeight, mangoWeight);
//
//        System.out.println("总价为：" + totalPriceA + " 元");
//    }
//    //验证第三题
//    @Test
//    void calculateTotalPriceC() {
//        Integer appleWeight = new Integer(2); // 购买的苹果斤数
//        Integer strawberryWeight =  new Integer(3); // 购买的草莓斤数
//        Integer mangoWeight =  new Integer(4);; // 购买的芒果斤数
//
//        BigDecimal totalPriceA = SurperMarket.calculateTotalPriceC(appleWeight, strawberryWeight, mangoWeight);
//
//        System.out.println("总价为：" + totalPriceA + " 元");
//    }
//    //验证第四题
//    @Test
//    void calculateTotalPriceD() {
//        Integer appleWeight = new Integer(2); // 购买的苹果斤数
//        Integer strawberryWeight =  new Integer(3); // 购买的草莓斤数
//        Integer mangoWeight =  new Integer(4);; // 购买的芒果斤数
//
//        BigDecimal totalPriceA = SurperMarket.calculateTotalPriceD(appleWeight, strawberryWeight, mangoWeight);
//
//        System.out.println("总价为：" + totalPriceA + " 元");
//    }

}
