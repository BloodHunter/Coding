package com.wbl.api.framework.entity.request.validation;

import com.wbl.api.framework.entity.request.param.ParamRange;

import java.util.List;

/**
 * Created by wbl on 16/12/21.
 */
public abstract class AbstractTypeValidator<T> implements TypeValidator {

    private ParamRange<T> range;

    public AbstractTypeValidator(Class<?> supportType,ParamRange<T> range){
        this.range = range;
        if (this.range != null && !this.range.isCompatible(supportType)){
            throw new IllegalArgumentException();
        }
    }

    protected abstract T convert(String value);

    protected abstract String getTypeName();

    @Override
    public boolean isValid(List<String> values) {
        for (int i = 0; i < values.size(); i++){
            String value = values.get(i);
            try {
                T t = this.convert(value);
                if (t instanceof Boolean){
                    values.set(i,t.toString());
                }else if (t instanceof Enum){
                    values.set(i,((Enum) t).name());
                }
                if (this.range != null) {
                    if (!this.range.isInRange(t)) {
                        return false;
                    }
                }
            }catch (Exception e){
                return false;
            }
        }
        return true;
    }

    @Override
    public String getDesc() {
        return this.getTypeName() + (this.range == null ? "" : "[" + this.range.getDesc() + "]");
    }
}
