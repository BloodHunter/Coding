package com.wbl.api.framework.entity.request.validation;

import com.wbl.api.framework.entity.request.param.ParamRange;

/**
 * Created by wbl on 16/12/21.
 */
public class IntegerValidator extends AbstractTypeValidator<Integer> {

    public IntegerValidator(){
        super(Integer.class,null);
    }

    public IntegerValidator(ParamRange<Integer> range){
        super(Integer.class,range);
    }

    @Override
    protected Integer convert(String value) {
        return Integer.parseInt(value);
    }

    @Override
    protected String getTypeName() {
        return "int";
    }
}
