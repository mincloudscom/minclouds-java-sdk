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

/**
 * UserProduct
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-01T22:42:19.023+08:00[Asia/Shanghai]")
public class UserProduct {
  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_USER_UUID = "userUuid";
  @SerializedName(SERIALIZED_NAME_USER_UUID)
  private String userUuid;


  public UserProduct productId(String productId) {
    
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


  public UserProduct userUuid(String userUuid) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProduct userProduct = (UserProduct) o;
    return Objects.equals(this.productId, userProduct.productId) &&
        Objects.equals(this.userUuid, userProduct.userUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, userUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProduct {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
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

