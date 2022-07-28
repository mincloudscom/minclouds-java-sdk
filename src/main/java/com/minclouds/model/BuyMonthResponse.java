/*
 * 云小朵开发者服务平台
 * 云小朵开发者服务平台应用程序接口文档
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: minclouds@163.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.minclouds.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * BuyMonthResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-28T14:53:45.749+08:00[Asia/Shanghai]")
public class BuyMonthResponse {
  public static final String SERIALIZED_NAME_APP_UUID = "appUuid";
  @SerializedName(SERIALIZED_NAME_APP_UUID)
  private String appUuid;

  public static final String SERIALIZED_NAME_CERT_UUID = "certUuid";
  @SerializedName(SERIALIZED_NAME_CERT_UUID)
  private String certUuid;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_DEADLINE = "deadline";
  @SerializedName(SERIALIZED_NAME_DEADLINE)
  private OffsetDateTime deadline;

  public static final String SERIALIZED_NAME_FLOW_NUM = "flowNum";
  @SerializedName(SERIALIZED_NAME_FLOW_NUM)
  private String flowNum;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_SPECIFICS = "specifics";
  @SerializedName(SERIALIZED_NAME_SPECIFICS)
  private Boolean specifics;

  public static final String SERIALIZED_NAME_SUB_USER_UUID = "subUserUuid";
  @SerializedName(SERIALIZED_NAME_SUB_USER_UUID)
  private String subUserUuid;

  public static final String SERIALIZED_NAME_SYSTEM_UUID = "systemUuid";
  @SerializedName(SERIALIZED_NAME_SYSTEM_UUID)
  private String systemUuid;

  public static final String SERIALIZED_NAME_TRADE_NUM = "tradeNum";
  @SerializedName(SERIALIZED_NAME_TRADE_NUM)
  private String tradeNum;

  public static final String SERIALIZED_NAME_USER_UUID = "userUuid";
  @SerializedName(SERIALIZED_NAME_USER_UUID)
  private String userUuid;

  public static final String SERIALIZED_NAME_VALID_KEY = "validKey";
  @SerializedName(SERIALIZED_NAME_VALID_KEY)
  private Boolean validKey;


  public BuyMonthResponse appUuid(String appUuid) {
    
    this.appUuid = appUuid;
    return this;
  }

   /**
   * Get appUuid
   * @return appUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAppUuid() {
    return appUuid;
  }


  public void setAppUuid(String appUuid) {
    this.appUuid = appUuid;
  }


  public BuyMonthResponse certUuid(String certUuid) {
    
    this.certUuid = certUuid;
    return this;
  }

   /**
   * Get certUuid
   * @return certUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertUuid() {
    return certUuid;
  }


  public void setCertUuid(String certUuid) {
    this.certUuid = certUuid;
  }


  public BuyMonthResponse code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public BuyMonthResponse deadline(OffsetDateTime deadline) {
    
    this.deadline = deadline;
    return this;
  }

   /**
   * Get deadline
   * @return deadline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDeadline() {
    return deadline;
  }


  public void setDeadline(OffsetDateTime deadline) {
    this.deadline = deadline;
  }


  public BuyMonthResponse flowNum(String flowNum) {
    
    this.flowNum = flowNum;
    return this;
  }

   /**
   * Get flowNum
   * @return flowNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFlowNum() {
    return flowNum;
  }


  public void setFlowNum(String flowNum) {
    this.flowNum = flowNum;
  }


  public BuyMonthResponse msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }


  public BuyMonthResponse productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }


  public BuyMonthResponse specifics(Boolean specifics) {
    
    this.specifics = specifics;
    return this;
  }

   /**
   * Get specifics
   * @return specifics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSpecifics() {
    return specifics;
  }


  public void setSpecifics(Boolean specifics) {
    this.specifics = specifics;
  }


  public BuyMonthResponse subUserUuid(String subUserUuid) {
    
    this.subUserUuid = subUserUuid;
    return this;
  }

   /**
   * Get subUserUuid
   * @return subUserUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubUserUuid() {
    return subUserUuid;
  }


  public void setSubUserUuid(String subUserUuid) {
    this.subUserUuid = subUserUuid;
  }


  public BuyMonthResponse systemUuid(String systemUuid) {
    
    this.systemUuid = systemUuid;
    return this;
  }

   /**
   * Get systemUuid
   * @return systemUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSystemUuid() {
    return systemUuid;
  }


  public void setSystemUuid(String systemUuid) {
    this.systemUuid = systemUuid;
  }


  public BuyMonthResponse tradeNum(String tradeNum) {
    
    this.tradeNum = tradeNum;
    return this;
  }

   /**
   * Get tradeNum
   * @return tradeNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTradeNum() {
    return tradeNum;
  }


  public void setTradeNum(String tradeNum) {
    this.tradeNum = tradeNum;
  }


  public BuyMonthResponse userUuid(String userUuid) {
    
    this.userUuid = userUuid;
    return this;
  }

   /**
   * Get userUuid
   * @return userUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserUuid() {
    return userUuid;
  }


  public void setUserUuid(String userUuid) {
    this.userUuid = userUuid;
  }


  public BuyMonthResponse validKey(Boolean validKey) {
    
    this.validKey = validKey;
    return this;
  }

   /**
   * Get validKey
   * @return validKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getValidKey() {
    return validKey;
  }


  public void setValidKey(Boolean validKey) {
    this.validKey = validKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyMonthResponse buyMonthResponse = (BuyMonthResponse) o;
    return Objects.equals(this.appUuid, buyMonthResponse.appUuid) &&
        Objects.equals(this.certUuid, buyMonthResponse.certUuid) &&
        Objects.equals(this.code, buyMonthResponse.code) &&
        Objects.equals(this.deadline, buyMonthResponse.deadline) &&
        Objects.equals(this.flowNum, buyMonthResponse.flowNum) &&
        Objects.equals(this.msg, buyMonthResponse.msg) &&
        Objects.equals(this.productId, buyMonthResponse.productId) &&
        Objects.equals(this.specifics, buyMonthResponse.specifics) &&
        Objects.equals(this.subUserUuid, buyMonthResponse.subUserUuid) &&
        Objects.equals(this.systemUuid, buyMonthResponse.systemUuid) &&
        Objects.equals(this.tradeNum, buyMonthResponse.tradeNum) &&
        Objects.equals(this.userUuid, buyMonthResponse.userUuid) &&
        Objects.equals(this.validKey, buyMonthResponse.validKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appUuid, certUuid, code, deadline, flowNum, msg, productId, specifics, subUserUuid, systemUuid, tradeNum, userUuid, validKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyMonthResponse {\n");
    sb.append("    appUuid: ").append(toIndentedString(appUuid)).append("\n");
    sb.append("    certUuid: ").append(toIndentedString(certUuid)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    flowNum: ").append(toIndentedString(flowNum)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    specifics: ").append(toIndentedString(specifics)).append("\n");
    sb.append("    subUserUuid: ").append(toIndentedString(subUserUuid)).append("\n");
    sb.append("    systemUuid: ").append(toIndentedString(systemUuid)).append("\n");
    sb.append("    tradeNum: ").append(toIndentedString(tradeNum)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    validKey: ").append(toIndentedString(validKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

