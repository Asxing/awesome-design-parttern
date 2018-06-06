package com.holddie.design.iterator;

import com.holddie.design.aggregate.Channel;

/**
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/6/6 9:00
 */
public interface ChannelIterator {

    public boolean hasNext();

    public Channel next();

}
