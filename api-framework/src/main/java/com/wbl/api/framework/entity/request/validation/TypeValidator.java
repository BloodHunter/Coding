package com.wbl.api.framework.entity.request.validation;

import java.util.List;

/**
 * Created by wbl on 16/12/21.
 */
public interface TypeValidator {

    boolean isValid(List<String> values);

    String getDesc();
}
