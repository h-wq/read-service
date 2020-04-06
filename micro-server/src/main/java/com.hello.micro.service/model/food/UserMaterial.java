package com.hello.micro.service.model.food;

import java.io.Serializable;

public class UserMaterial implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_material.id
     *
     * @mbg.generated Mon Apr 06 09:51:22 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_material.user_id
     *
     * @mbg.generated Mon Apr 06 09:51:22 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_material.material_id
     *
     * @mbg.generated Mon Apr 06 09:51:22 CST 2020
     */
    private Integer materialId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_material.coefficient
     *
     * @mbg.generated Mon Apr 06 09:51:22 CST 2020
     */
    private Integer coefficient;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_material
     *
     * @mbg.generated Mon Apr 06 09:51:22 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_material.id
     *
     * @return the value of user_material.id
     *
     * @mbg.generated Mon Apr 06 09:51:22 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_material.id
     *
     * @param id the value for user_material.id
     *
     * @mbg.generated Mon Apr 06 09:51:22 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_material.user_id
     *
     * @return the value of user_material.user_id
     *
     * @mbg.generated Mon Apr 06 09:51:22 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_material.user_id
     *
     * @param userId the value for user_material.user_id
     *
     * @mbg.generated Mon Apr 06 09:51:22 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_material.material_id
     *
     * @return the value of user_material.material_id
     *
     * @mbg.generated Mon Apr 06 09:51:22 CST 2020
     */
    public Integer getMaterialId() {
        return materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_material.material_id
     *
     * @param materialId the value for user_material.material_id
     *
     * @mbg.generated Mon Apr 06 09:51:22 CST 2020
     */
    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_material.coefficient
     *
     * @return the value of user_material.coefficient
     *
     * @mbg.generated Mon Apr 06 09:51:22 CST 2020
     */
    public Integer getCoefficient() {
        return coefficient;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_material.coefficient
     *
     * @param coefficient the value for user_material.coefficient
     *
     * @mbg.generated Mon Apr 06 09:51:22 CST 2020
     */
    public void setCoefficient(Integer coefficient) {
        this.coefficient = coefficient;
    }
}