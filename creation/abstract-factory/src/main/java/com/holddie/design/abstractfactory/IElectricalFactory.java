package com.holddie.design.abstractfactory;

/**
 * 抽象电器工厂接口
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/5/23 9:21
 */
public interface IElectricalFactory {
    IFan createFan();

    ITubeLight createTubeLight();
}
