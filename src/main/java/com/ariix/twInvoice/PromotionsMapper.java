package com.ariix.twInvoice;

import com.ariix.twInvoice.Promotions;

public interface PromotionsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROMOTIONS
	 * @mbggenerated  Mon Jan 22 16:22:52 CST 2018
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROMOTIONS
	 * @mbggenerated  Mon Jan 22 16:22:52 CST 2018
	 */
	int insert(Promotions record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROMOTIONS
	 * @mbggenerated  Mon Jan 22 16:22:52 CST 2018
	 */
	int insertSelective(Promotions record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROMOTIONS
	 * @mbggenerated  Mon Jan 22 16:22:52 CST 2018
	 */
	Promotions selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROMOTIONS
	 * @mbggenerated  Mon Jan 22 16:22:52 CST 2018
	 */
	int updateByPrimaryKeySelective(Promotions record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PROMOTIONS
	 * @mbggenerated  Mon Jan 22 16:22:52 CST 2018
	 */
	int updateByPrimaryKey(Promotions record);
}