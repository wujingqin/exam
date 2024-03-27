package com.example.exam.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author qin
 * @version 2.0
 * @project exam
 * @description 购物车类
 * @date 2024/3/27 13:09:49
 */
@Data
public class ShopCar {
    private List<Fruit> fruitList;
    //优惠活动 0:尚未开始  1:正在进行时 默认没开始
    private Integer promotions = 0;
}
