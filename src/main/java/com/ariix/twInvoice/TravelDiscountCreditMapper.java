package com.ariix.twInvoice;

import com.ariix.twInvoice.TravelDiscountCredit;
import com.ariix.twInvoice.TravelDiscountCreditExample;
import java.util.List;

public interface TravelDiscountCreditMapper {
    int insert(TravelDiscountCredit record);

    int insertSelective(TravelDiscountCredit record);

    List<TravelDiscountCredit> selectByExample(TravelDiscountCreditExample example);
}