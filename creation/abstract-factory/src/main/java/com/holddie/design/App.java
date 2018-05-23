package com.holddie.design;

/**
 * 定义：
 * 1、提供一个接口，用于制造一族相关或者相互依赖的产品，无需指定具体的实现类
 *
 * 2、创建工厂的工厂
 *
 * 好处：
 * 1、解耦，客户代码和具体产品解耦
 * 2、比工厂模式更高级的设计模式
 * 3、标准化产品构造流程
 * 4、可以替换某个实现家族
 *
 * Factorybean 接口基于抽象工厂模式：
 * 1、ProxyFactoryBean
 * 2、JndiFactoryBean
 * 3、LocalSessionFactoryBean
 * 4、LocalContainerEntityManagerFactoryBean
 *
 * 构造具有很多依赖的复杂对象
 * 构造逻辑易变且依赖于配置
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
