package com.ariix.twInvoice;

import com.ariix.twInvoice.OrderInvoice;
import com.ariix.twInvoice.OrderInvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderInvoiceMapper {
    int countByExample(OrderInvoiceExample example);

    int deleteByExample(OrderInvoiceExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderInvoice record);

    int insertSelective(OrderInvoice record);

    List<OrderInvoice> selectByExample(OrderInvoiceExample example);

    OrderInvoice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderInvoice record, @Param("example") OrderInvoiceExample example);

    int updateByExample(@Param("record") OrderInvoice record, @Param("example") OrderInvoiceExample example);

    int updateByPrimaryKeySelective(OrderInvoice record);

    int updateByPrimaryKey(OrderInvoice record);
}