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
 * UdidInstall
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-01T22:42:19.023+08:00[Asia/Shanghai]")
public class UdidInstall {
  public static final String SERIALIZED_NAME_APP_UUID = "appUuid";
  @SerializedName(SERIALIZED_NAME_APP_UUID)
  private String appUuid;

  public static final String SERIALIZED_NAME_UDID = "udid";
  @SerializedName(SERIALIZED_NAME_UDID)
  private String udid;

  public static final String SERIALIZED_NAME_USER_UUID = "userUuid";
  @SerializedName(SERIALIZED_NAME_USER_UUID)
  private String userUuid;


  public UdidInstall appUuid(String appUuid) {
    
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


  public UdidInstall udid(String udid) {
    
    this.udid = udid;
    return this;
  }

   /**
   * Get udid
   * @return udid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUdid() {
    return udid;
  }


  public void setUdid(String udid) {
    this.udid = udid;
  }


  public UdidInstall userUuid(String userUuid) {
    
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
    UdidInstall udidInstall = (UdidInstall) o;
    return Objects.equals(this.appUuid, udidInstall.appUuid) &&
        Objects.equals(this.udid, udidInstall.udid) &&
        Objects.equals(this.userUuid, udidInstall.userUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appUuid, udid, userUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UdidInstall {\n");
    sb.append("    appUuid: ").append(toIndentedString(appUuid)).append("\n");
    sb.append("    udid: ").append(toIndentedString(udid)).append("\n");
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

