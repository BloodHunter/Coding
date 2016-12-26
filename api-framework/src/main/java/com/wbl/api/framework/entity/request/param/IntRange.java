package com.wbl.api.framework.entity.request.param;

/**
 * Created by wbl on 16/12/21.
 */
public class IntRange implements ParamRange<Integer>{

    private int max = Integer.MAX_VALUE;
    private int min = Integer.MIN_VALUE;

    public IntRange(){}

    public IntRange(String range){
        String[] values = range.split("~");
        this.min = Integer.parseInt(values[0]);
        this.max = Integer.parseInt(values[1]);
        if (this.max < this.min){
            this.max = Integer.MAX_VALUE;
        }
    }

    public IntRange(int min,int max){
        this.min = min;
        this.max = min > max ? Integer.MAX_VALUE : max;
    }

    @Override
    public boolean isInRange(Integer value) {
        return (value >= min && value <= max);
    }

    @Override
    public String getDesc() {
        return min + "~" + max;
    }

    @Override
    public String getBaseSample() {
        int num = rdm.nextInt(max - min + 1) + min;
        return num + "";
    }

    @Override
    public boolean isCompatible(Class<?> type) {
        return type == int.class || type == Integer.class;
    }
}
