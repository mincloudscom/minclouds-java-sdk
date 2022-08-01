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
import java.math.BigDecimal;

/**
 * DeviceRegistryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-01T22:42:19.023+08:00[Asia/Shanghai]")
public class DeviceRegistryResponse {
  public static final String SERIALIZED_NAME_ACCOUNT_UUID = "accountUuid";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_UUID)
  private String accountUuid;

  public static final String SERIALIZED_NAME_APP_DATA = "appData";
  @SerializedName(SERIALIZED_NAME_APP_DATA)
  private String appData;

  public static final String SERIALIZED_NAME_APP_UUID = "appUuid";
  @SerializedName(SERIALIZED_NAME_APP_UUID)
  private String appUuid;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundleId";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_CALLBACK = "callback";
  @SerializedName(SERIALIZED_NAME_CALLBACK)
  private String callback;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private String certificate;

  public static final String SERIALIZED_NAME_CERTIFICATE_ID = "certificateId";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ID)
  private String certificateId;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private String extra;

  public static final String SERIALIZED_NAME_FLOW_NUM = "flowNum";
  @SerializedName(SERIALIZED_NAME_FLOW_NUM)
  private String flowNum;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  private String msg;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private String profile;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private String profileId;

  public static final String SERIALIZED_NAME_SEPARATE = "separate";
  @SerializedName(SERIALIZED_NAME_SEPARATE)
  private String separate;

  /**
   * 返回实际调用的签名类型
   */
  @JsonAdapter(SignTypeEnum.Adapter.class)
  public enum SignTypeEnum {
    APPSTORE("AppStore"),
    
    MDMENTERPRISE("MdmEnterprise"),
    
    MONTHENTERPRISE("MonthEnterprise"),
    
    ORIGINALMODE("OriginalMode"),
    
    SUPERENTERPRISE("SuperEnterprise"),
    
    SUPERPERSONAL("SuperPersonal"),
    
    TESTFLIGHT("TestFlight");

    private String value;

    SignTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SignTypeEnum fromValue(String value) {
      for (SignTypeEnum b : SignTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SignTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SignTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SignTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SignTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SIGN_TYPE = "signType";
  @SerializedName(SERIALIZED_NAME_SIGN_TYPE)
  private SignTypeEnum signType;

  public static final String SERIALIZED_NAME_SYSTEM_UUID = "systemUuid";
  @SerializedName(SERIALIZED_NAME_SYSTEM_UUID)
  private String systemUuid;

  public static final String SERIALIZED_NAME_TRADE_NUM = "tradeNum";
  @SerializedName(SERIALIZED_NAME_TRADE_NUM)
  private String tradeNum;

  public static final String SERIALIZED_NAME_UDID = "udid";
  @SerializedName(SERIALIZED_NAME_UDID)
  private String udid;

  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;


  public DeviceRegistryResponse accountUuid(String accountUuid) {
    
    this.accountUuid = accountUuid;
    return this;
  }

   /**
   * 返回注册后使用的账号的UUID
   * @return accountUuid
  **/
  @ApiModelProperty(required = true, value = "返回注册后使用的账号的UUID")

  public String getAccountUuid() {
    return accountUuid;
  }


  public void setAccountUuid(String accountUuid) {
    this.accountUuid = accountUuid;
  }


  public DeviceRegistryResponse appData(String appData) {
    
    this.appData = appData;
    return this;
  }

   /**
   * 签名时传的的APP签名数据，比如渠道信息，该数据，在回调时原路返回
   * @return appData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "签名时传的的APP签名数据，比如渠道信息，该数据，在回调时原路返回")

  public String getAppData() {
    return appData;
  }


  public void setAppData(String appData) {
    this.appData = appData;
  }


  public DeviceRegistryResponse appUuid(String appUuid) {
    
    this.appUuid = appUuid;
    return this;
  }

   /**
   * 系统默认将为UDID关联到某一个APP UUID上，用已确认某个UDID在某个APP中是否已注册，通过API接口调用时，如果没有APPUUID，可以使用(System Uuid)代替，或随机生成一个
   * @return appUuid
  **/
  @ApiModelProperty(required = true, value = "系统默认将为UDID关联到某一个APP UUID上，用已确认某个UDID在某个APP中是否已注册，通过API接口调用时，如果没有APPUUID，可以使用(System Uuid)代替，或随机生成一个")

  public String getAppUuid() {
    return appUuid;
  }


  public void setAppUuid(String appUuid) {
    this.appUuid = appUuid;
  }


  public DeviceRegistryResponse bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * 当前签名账号的BundleID，仅作为参考，无实际用途
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "当前签名账号的BundleID，仅作为参考，无实际用途")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public DeviceRegistryResponse callback(String callback) {
    
    this.callback = callback;
    return this;
  }

   /**
   * 回到地址
   * @return callback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "回到地址")

  public String getCallback() {
    return callback;
  }


  public void setCallback(String callback) {
    this.callback = callback;
  }


  public DeviceRegistryResponse certificate(String certificate) {
    
    this.certificate = certificate;
    return this;
  }

   /**
   * P12证书的Base64编码格式，客户系统需要自行解码并保持为P12文件，用签名工具打包签名APP
   * @return certificate
  **/
  @ApiModelProperty(required = true, value = "P12证书的Base64编码格式，客户系统需要自行解码并保持为P12文件，用签名工具打包签名APP")

  public String getCertificate() {
    return certificate;
  }


  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  public DeviceRegistryResponse certificateId(String certificateId) {
    
    this.certificateId = certificateId;
    return this;
  }

   /**
   * 当前签名账号的证书ID，仅作为参考，无实际用途
   * @return certificateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "当前签名账号的证书ID，仅作为参考，无实际用途")

  public String getCertificateId() {
    return certificateId;
  }


  public void setCertificateId(String certificateId) {
    this.certificateId = certificateId;
  }


  public DeviceRegistryResponse code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * 失败码，成功一般都返回0，非0，即表示失败，查看对应失败码的描述
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "失败码，成功一般都返回0，非0，即表示失败，查看对应失败码的描述")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public DeviceRegistryResponse extra(String extra) {
    
    this.extra = extra;
    return this;
  }

   /**
   * 额外参数，传递后原路返回
   * @return extra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "额外参数，传递后原路返回")

  public String getExtra() {
    return extra;
  }


  public void setExtra(String extra) {
    this.extra = extra;
  }


  public DeviceRegistryResponse flowNum(String flowNum) {
    
    this.flowNum = flowNum;
    return this;
  }

   /**
   * 流水号:防止重复提交与计费
   * @return flowNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "流水号:防止重复提交与计费")

  public String getFlowNum() {
    return flowNum;
  }


  public void setFlowNum(String flowNum) {
    this.flowNum = flowNum;
  }


  public DeviceRegistryResponse groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * BundleID关联的GroupID
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BundleID关联的GroupID")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public DeviceRegistryResponse msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * 设备注册失败的提示信息
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "设备注册失败的提示信息")

  public String getMsg() {
    return msg;
  }


  public void setMsg(String msg) {
    this.msg = msg;
  }


  public DeviceRegistryResponse orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 订单号，传递后原路返回
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "订单号，传递后原路返回")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public DeviceRegistryResponse password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * P12证书的密码，APP签名时需要，必要的返回数据
   * @return password
  **/
  @ApiModelProperty(required = true, value = "P12证书的密码，APP签名时需要，必要的返回数据")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public DeviceRegistryResponse productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 计费的产品ID, 一键部署的第三方系统将根据该ID进行计费，API接口调用也使用该ID计费
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "计费的产品ID, 一键部署的第三方系统将根据该ID进行计费，API接口调用也使用该ID计费")

  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }


  public DeviceRegistryResponse profile(String profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * 描述文件的Base64编码格式，客户系统需要自行解码并保持为.mobileprovision文件，用签名工具打包签名APP，该文件即为APP重签名后的APP安装包中的embedded.mobileprovision文件
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "描述文件的Base64编码格式，客户系统需要自行解码并保持为.mobileprovision文件，用签名工具打包签名APP，该文件即为APP重签名后的APP安装包中的embedded.mobileprovision文件")

  public String getProfile() {
    return profile;
  }


  public void setProfile(String profile) {
    this.profile = profile;
  }


  public DeviceRegistryResponse profileId(String profileId) {
    
    this.profileId = profileId;
    return this;
  }

   /**
   * 描述文件的ID，仅作为参考，无实际用途
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "描述文件的ID，仅作为参考，无实际用途")

  public String getProfileId() {
    return profileId;
  }


  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  public DeviceRegistryResponse separate(String separate) {
    
    this.separate = separate;
    return this;
  }

   /**
   * 应用分身的记录ID
   * @return separate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "应用分身的记录ID")

  public String getSeparate() {
    return separate;
  }


  public void setSeparate(String separate) {
    this.separate = separate;
  }


  public DeviceRegistryResponse signType(SignTypeEnum signType) {
    
    this.signType = signType;
    return this;
  }

   /**
   * 返回实际调用的签名类型
   * @return signType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "返回实际调用的签名类型")

  public SignTypeEnum getSignType() {
    return signType;
  }


  public void setSignType(SignTypeEnum signType) {
    this.signType = signType;
  }


  public DeviceRegistryResponse systemUuid(String systemUuid) {
    
    this.systemUuid = systemUuid;
    return this;
  }

   /**
   * 在云小朵官方网站后台开发内测菜单中，进入内测系统:创建一个&lt;手动配置实例&gt;类型，即可获得一个(System Uuid)
   * @return systemUuid
  **/
  @ApiModelProperty(required = true, value = "在云小朵官方网站后台开发内测菜单中，进入内测系统:创建一个<手动配置实例>类型，即可获得一个(System Uuid)")

  public String getSystemUuid() {
    return systemUuid;
  }


  public void setSystemUuid(String systemUuid) {
    this.systemUuid = systemUuid;
  }


  public DeviceRegistryResponse tradeNum(String tradeNum) {
    
    this.tradeNum = tradeNum;
    return this;
  }

   /**
   * 交易单号:业务系统计费的订单
   * @return tradeNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "交易单号:业务系统计费的订单")

  public String getTradeNum() {
    return tradeNum;
  }


  public void setTradeNum(String tradeNum) {
    this.tradeNum = tradeNum;
  }


  public DeviceRegistryResponse udid(String udid) {
    
    this.udid = udid;
    return this;
  }

   /**
   * iOS或iPad设备UDID
   * @return udid
  **/
  @ApiModelProperty(required = true, value = "iOS或iPad设备UDID")

  public String getUdid() {
    return udid;
  }


  public void setUdid(String udid) {
    this.udid = udid;
  }


  public DeviceRegistryResponse valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public DeviceRegistryResponse value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * 注册UDID消费金额
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "注册UDID消费金额")

  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceRegistryResponse deviceRegistryResponse = (DeviceRegistryResponse) o;
    return Objects.equals(this.accountUuid, deviceRegistryResponse.accountUuid) &&
        Objects.equals(this.appData, deviceRegistryResponse.appData) &&
        Objects.equals(this.appUuid, deviceRegistryResponse.appUuid) &&
        Objects.equals(this.bundleId, deviceRegistryResponse.bundleId) &&
        Objects.equals(this.callback, deviceRegistryResponse.callback) &&
        Objects.equals(this.certificate, deviceRegistryResponse.certificate) &&
        Objects.equals(this.certificateId, deviceRegistryResponse.certificateId) &&
        Objects.equals(this.code, deviceRegistryResponse.code) &&
        Objects.equals(this.extra, deviceRegistryResponse.extra) &&
        Objects.equals(this.flowNum, deviceRegistryResponse.flowNum) &&
        Objects.equals(this.groupId, deviceRegistryResponse.groupId) &&
        Objects.equals(this.msg, deviceRegistryResponse.msg) &&
        Objects.equals(this.orderId, deviceRegistryResponse.orderId) &&
        Objects.equals(this.password, deviceRegistryResponse.password) &&
        Objects.equals(this.productId, deviceRegistryResponse.productId) &&
        Objects.equals(this.profile, deviceRegistryResponse.profile) &&
        Objects.equals(this.profileId, deviceRegistryResponse.profileId) &&
        Objects.equals(this.separate, deviceRegistryResponse.separate) &&
        Objects.equals(this.signType, deviceRegistryResponse.signType) &&
        Objects.equals(this.systemUuid, deviceRegistryResponse.systemUuid) &&
        Objects.equals(this.tradeNum, deviceRegistryResponse.tradeNum) &&
        Objects.equals(this.udid, deviceRegistryResponse.udid) &&
        Objects.equals(this.valid, deviceRegistryResponse.valid) &&
        Objects.equals(this.value, deviceRegistryResponse.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountUuid, appData, appUuid, bundleId, callback, certificate, certificateId, code, extra, flowNum, groupId, msg, orderId, password, productId, profile, profileId, separate, signType, systemUuid, tradeNum, udid, valid, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRegistryResponse {\n");
    sb.append("    accountUuid: ").append(toIndentedString(accountUuid)).append("\n");
    sb.append("    appData: ").append(toIndentedString(appData)).append("\n");
    sb.append("    appUuid: ").append(toIndentedString(appUuid)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    flowNum: ").append(toIndentedString(flowNum)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    separate: ").append(toIndentedString(separate)).append("\n");
    sb.append("    signType: ").append(toIndentedString(signType)).append("\n");
    sb.append("    systemUuid: ").append(toIndentedString(systemUuid)).append("\n");
    sb.append("    tradeNum: ").append(toIndentedString(tradeNum)).append("\n");
    sb.append("    udid: ").append(toIndentedString(udid)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

