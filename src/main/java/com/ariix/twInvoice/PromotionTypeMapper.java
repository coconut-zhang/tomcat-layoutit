package com.ariix.twInvoice;

import com.ariix.twInvoice.PromotionType;

public interface PromotionTypeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROMOTION_TYPE
	 * @mbggenerated  Mon Jan 22 16:22:52 CST 2018
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROMOTION_TYPE
	 * @mbggenerated  Mon Jan 22 16:22:52 CST 2018
	 */
	int insert(PromotionType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROMOTION_TYPE
	 * @mbggenerated  Mon Jan 22 16:22:52 CST 2018
	 */
	int insertSelective(PromotionType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROMOTION_TYPE
	 * @mbggenerated  Mon Jan 22 16:22:52 CST 2018
	 */
	PromotionType selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROMOTION_TYPE
	 * @mbggenerated  Mon Jan 22 16:22:52 CST 2018
	 */
	int updateByPrimaryKeySelective(PromotionType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROMOTION_TYPE
	 * @mbggenerated  Mon Jan 22 16:22:52 CST 2018
	 */
	int updateByPrimaryKey(PromotionType record);
}