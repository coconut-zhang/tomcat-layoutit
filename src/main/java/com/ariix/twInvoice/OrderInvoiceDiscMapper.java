package com.ariix.twInvoice;

import com.ariix.twInvoice.OrderInvoiceDisc;
import com.ariix.twInvoice.OrderInvoiceDiscExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderInvoiceDiscMapper {
    int countByExample(OrderInvoiceDiscExample example);

    int deleteByExample(OrderInvoiceDiscExample example);

    int insert(OrderInvoiceDisc record);

    int insertSelective(OrderInvoiceDisc record);

    List<OrderInvoiceDisc> selectByExample(OrderInvoiceDiscExample example);

    int updateByExampleSelective(@Param("record") OrderInvoiceDisc record, @Param("example") OrderInvoiceDiscExample example);

    int updateByExample(@Param("record") OrderInvoiceDisc record, @Param("example") OrderInvoiceDiscExample example);
}