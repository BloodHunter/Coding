package com.wbl.api.framework.entity.request.param;

import java.util.Random;

/**
 * Created by wbl on 16/12/21.
 */
public interface ParamRange<T> {
    Random rdm = new Random();

    boolean isInRange(T value);

    String getDesc();

    String getBaseSample();

    boolean isCompatible(Class<?> type);
}
