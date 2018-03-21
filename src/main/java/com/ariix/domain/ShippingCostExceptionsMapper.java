package com.ariix.domain;

import com.ariix.domain.ShippingCostExceptions;
import com.ariix.domain.ShippingCostExceptionsExample;
import java.util.List;

public interface ShippingCostExceptionsMapper {
    int insert(ShippingCostExceptions record);

    int insertSelective(ShippingCostExceptions record);

    List<ShippingCostExceptions> selectByExample(ShippingCostExceptionsExample example);
}