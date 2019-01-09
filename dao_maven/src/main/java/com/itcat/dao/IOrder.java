package com.itcat.dao;

import com.itcast.domain.Member;
import com.itcast.domain.Order;
import com.itcast.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IOrder {

    @Select("select * from orders")
    @Results(id = "co",value = {
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.itcat.dao.IProduct.findById"))})
    List<Order> find();


    @Select("select * from orders")
    @Results(id = "pro",value = {
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.itcat.dao.IProduct.findById")),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
    })
    List<Order> findAll();


    @Select("select * from orders where id=#{id}")
    @Results(id = "ss",value = {
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.itcat.dao.IProduct.findById")),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "member",column = "memberId",javaType = Member.class,one = @One(select = "com.itcat.dao.IMember.findById")),
            @Result(property = "travellers",javaType = java.util.List.class,  column = "id",many = @Many(select = "com.itcat.dao.ITraveller.findById")),
    })
    Order findById(String id);
}
