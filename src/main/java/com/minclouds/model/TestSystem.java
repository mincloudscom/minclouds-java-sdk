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
 * TestSystem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-27T12:14:17.520431+08:00[Asia/Shanghai]")
public class TestSystem {
  /**
   * 内测系统可配置的证书调用权限
   */
  @JsonAdapter(AccessLevelEnum.Adapter.class)
  public enum AccessLevelEnum {
    DISABLED("Disabled"),
    
    INHERITED("Inherited"),
    
    INTERNAL("Internal"),
    
    PRIVATE("Private"),
    
    PROTECTED("Protected"),
    
    PUBLIC("Public");

    private String value;

    AccessLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessLevelEnum fromValue(String value) {
      for (AccessLevelEnum b : AccessLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccessLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccessLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCESS_LEVEL = "accessLevel";
  @SerializedName(SERIALIZED_NAME_ACCESS_LEVEL)
  private AccessLevelEnum accessLevel;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_AUTH_COUNT = "authCount";
  @SerializedName(SERIALIZED_NAME_AUTH_COUNT)
  private Integer authCount;

  public static final String SERIALIZED_NAME_CALLBACK = "callback";
  @SerializedName(SERIALIZED_NAME_CALLBACK)
  private String callback;

  public static final String SERIALIZED_NAME_CODE_LIMIT = "codeLimit";
  @SerializedName(SERIALIZED_NAME_CODE_LIMIT)
  private Integer codeLimit;

  public static final String SERIALIZED_NAME_COMMISSION = "commission";
  @SerializedName(SERIALIZED_NAME_COMMISSION)
  private Double commission;

  public static final String SERIALIZED_NAME_CONSUME = "consume";
  @SerializedName(SERIALIZED_NAME_CONSUME)
  private BigDecimal consume;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_CRT = "crt";
  @SerializedName(SERIALIZED_NAME_CRT)
  private String crt;

  public static final String SERIALIZED_NAME_DEFAULT_ZONE = "defaultZone";
  @SerializedName(SERIALIZED_NAME_DEFAULT_ZONE)
  private String defaultZone;

  /**
   * 部署模式
   */
  @JsonAdapter(DeployEnum.Adapter.class)
  public enum DeployEnum {
    CLOUD("cloud"),
    
    MANUAL("manual");

    private String value;

    DeployEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeployEnum fromValue(String value) {
      for (DeployEnum b : DeployEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeployEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeployEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeployEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeployEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEPLOY = "deploy";
  @SerializedName(SERIALIZED_NAME_DEPLOY)
  private DeployEnum deploy;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Integer enable;

  public static final String SERIALIZED_NAME_EXPEND = "expend";
  @SerializedName(SERIALIZED_NAME_EXPEND)
  private BigDecimal expend;

  public static final String SERIALIZED_NAME_FLOW_SIZE = "flowSize";
  @SerializedName(SERIALIZED_NAME_FLOW_SIZE)
  private Long flowSize;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_LINK_LIMIT = "linkLimit";
  @SerializedName(SERIALIZED_NAME_LINK_LIMIT)
  private Integer linkLimit;

  /**
   * 包年包月企业证书调用权限
   */
  @JsonAdapter(MonthYearEnum.Adapter.class)
  public enum MonthYearEnum {
    DISABLED("Disabled"),
    
    INHERITED("Inherited"),
    
    INTERNAL("Internal"),
    
    PRIVATE("Private"),
    
    PROTECTED("Protected"),
    
    PUBLIC("Public");

    private String value;

    MonthYearEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MonthYearEnum fromValue(String value) {
      for (MonthYearEnum b : MonthYearEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MonthYearEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MonthYearEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MonthYearEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MonthYearEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MONTH_YEAR = "monthYear";
  @SerializedName(SERIALIZED_NAME_MONTH_YEAR)
  private MonthYearEnum monthYear;

  /**
   * 支付模式
   */
  @JsonAdapter(PayModeEnum.Adapter.class)
  public enum PayModeEnum {
    PERYEARMONTH("PerYearMonth"),
    
    PREEMPTIVE("Preemptive"),
    
    QUANTITY("Quantity");

    private String value;

    PayModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayModeEnum fromValue(String value) {
      for (PayModeEnum b : PayModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PayModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAY_MODE = "payMode";
  @SerializedName(SERIALIZED_NAME_PAY_MODE)
  private PayModeEnum payMode;

  public static final String SERIALIZED_NAME_PAYER_COUNT = "payerCount";
  @SerializedName(SERIALIZED_NAME_PAYER_COUNT)
  private Integer payerCount;

  public static final String SERIALIZED_NAME_PEM = "pem";
  @SerializedName(SERIALIZED_NAME_PEM)
  private String pem;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_PUBLIC_IP = "publicIp";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP)
  private String publicIp;

  public static final String SERIALIZED_NAME_QUOTA = "quota";
  @SerializedName(SERIALIZED_NAME_QUOTA)
  private BigDecimal quota;

  public static final String SERIALIZED_NAME_REGION_ID = "regionId";
  @SerializedName(SERIALIZED_NAME_REGION_ID)
  private String regionId;

  public static final String SERIALIZED_NAME_REGION_NAME = "regionName";
  @SerializedName(SERIALIZED_NAME_REGION_NAME)
  private String regionName;

  public static final String SERIALIZED_NAME_RELEASE = "release";
  @SerializedName(SERIALIZED_NAME_RELEASE)
  private Boolean release;

  public static final String SERIALIZED_NAME_RELEASE_TIME = "releaseTime";
  @SerializedName(SERIALIZED_NAME_RELEASE_TIME)
  private String releaseTime;

  public static final String SERIALIZED_NAME_SIGN_LIMIT = "signLimit";
  @SerializedName(SERIALIZED_NAME_SIGN_LIMIT)
  private BigDecimal signLimit;

  public static final String SERIALIZED_NAME_SIGNED_COUNT = "signedCount";
  @SerializedName(SERIALIZED_NAME_SIGNED_COUNT)
  private Integer signedCount;

  public static final String SERIALIZED_NAME_STACK = "stack";
  @SerializedName(SERIALIZED_NAME_STACK)
  private String stack;

  /**
   * 实例状态
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("Created"),
    
    EXCEPTED("Excepted"),
    
    FAILED("Failed"),
    
    PAUSED("Paused"),
    
    PAUSING("Pausing"),
    
    PREPARING("Preparing"),
    
    RELEASED("Released"),
    
    RELEASING("Releasing"),
    
    RETRY("Retry"),
    
    RUNNING("Running"),
    
    STARTING("Starting"),
    
    STOPPED("Stopped"),
    
    STOPPING("Stopping"),
    
    UPGRADED("Upgraded"),
    
    UPGRADING("Upgrading");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  /**
   * 系统状态
   */
  @JsonAdapter(SystemStatusEnum.Adapter.class)
  public enum SystemStatusEnum {
    AVAILABLE("Available"),
    
    EXCEPTED("Excepted"),
    
    FORBIDDEN("Forbidden"),
    
    NEEDUPGRADE("NeedUpgrade"),
    
    NODEPLOY("NoDeploy"),
    
    READYRELEASE("ReadyRelease");

    private String value;

    SystemStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SystemStatusEnum fromValue(String value) {
      for (SystemStatusEnum b : SystemStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SystemStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SystemStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SystemStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SystemStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SYSTEM_STATUS = "systemStatus";
  @SerializedName(SERIALIZED_NAME_SYSTEM_STATUS)
  private SystemStatusEnum systemStatus;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_UDID_LIMIT = "udidLimit";
  @SerializedName(SERIALIZED_NAME_UDID_LIMIT)
  private Integer udidLimit;

  /**
   * 使用模式
   */
  @JsonAdapter(UseModeEnum.Adapter.class)
  public enum UseModeEnum {
    BYSELF("BySelf"),
    
    FREE("Free"),
    
    SHARED("Shared");

    private String value;

    UseModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UseModeEnum fromValue(String value) {
      for (UseModeEnum b : UseModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UseModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UseModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UseModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UseModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USE_MODE = "useMode";
  @SerializedName(SERIALIZED_NAME_USE_MODE)
  private UseModeEnum useMode;

  public static final String SERIALIZED_NAME_USER_UUID = "userUuid";
  @SerializedName(SERIALIZED_NAME_USER_UUID)
  private String userUuid;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_ZONE_ID = "zoneId";
  @SerializedName(SERIALIZED_NAME_ZONE_ID)
  private String zoneId;

  public static final String SERIALIZED_NAME_ZONE_NAME = "zoneName";
  @SerializedName(SERIALIZED_NAME_ZONE_NAME)
  private String zoneName;


  public TestSystem accessLevel(AccessLevelEnum accessLevel) {
    
    this.accessLevel = accessLevel;
    return this;
  }

   /**
   * 内测系统可配置的证书调用权限
   * @return accessLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "内测系统可配置的证书调用权限")

  public AccessLevelEnum getAccessLevel() {
    return accessLevel;
  }


  public void setAccessLevel(AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
  }


  public TestSystem alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * 系统别名
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统别名")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public TestSystem authCount(Integer authCount) {
    
    this.authCount = authCount;
    return this;
  }

   /**
   * 授权次数:允许你设定一个该系统可签名的次数上限，达到上限后，使用该系统将不再签名
   * @return authCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "授权次数:允许你设定一个该系统可签名的次数上限，达到上限后，使用该系统将不再签名")

  public Integer getAuthCount() {
    return authCount;
  }


  public void setAuthCount(Integer authCount) {
    this.authCount = authCount;
  }


  public TestSystem callback(String callback) {
    
    this.callback = callback;
    return this;
  }

   /**
   * 系统默认的回调地址
   * @return callback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统默认的回调地址")

  public String getCallback() {
    return callback;
  }


  public void setCallback(String callback) {
    this.callback = callback;
  }


  public TestSystem codeLimit(Integer codeLimit) {
    
    this.codeLimit = codeLimit;
    return this;
  }

   /**
   * 授权码上限:系统可以生成授权码个数的上限
   * @return codeLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "授权码上限:系统可以生成授权码个数的上限")

  public Integer getCodeLimit() {
    return codeLimit;
  }


  public void setCodeLimit(Integer codeLimit) {
    this.codeLimit = codeLimit;
  }


  public TestSystem commission(Double commission) {
    
    this.commission = commission;
    return this;
  }

   /**
   * 配额比例:系统配额的手续费比例，大于0，小于1，按照比例收取，0，不收配额比例，按包年包月计算，小于0，使用系统默认值
   * @return commission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "配额比例:系统配额的手续费比例，大于0，小于1，按照比例收取，0，不收配额比例，按包年包月计算，小于0，使用系统默认值")

  public Double getCommission() {
    return commission;
  }


  public void setCommission(Double commission) {
    this.commission = commission;
  }


  public TestSystem consume(BigDecimal consume) {
    
    this.consume = consume;
    return this;
  }

   /**
   * 系统消费:给用户充值即表示配额消费了，仅使用官方提供的镜像部署的系统有效，API接口调用，无意义
   * @return consume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统消费:给用户充值即表示配额消费了，仅使用官方提供的镜像部署的系统有效，API接口调用，无意义")

  public BigDecimal getConsume() {
    return consume;
  }


  public void setConsume(BigDecimal consume) {
    this.consume = consume;
  }


  public TestSystem createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "创建时间")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public TestSystem crt(String crt) {
    
    this.crt = crt;
    return this;
  }

   /**
   * 系统证书CRT
   * @return crt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统证书CRT")

  public String getCrt() {
    return crt;
  }


  public void setCrt(String crt) {
    this.crt = crt;
  }


  public TestSystem defaultZone(String defaultZone) {
    
    this.defaultZone = defaultZone;
    return this;
  }

   /**
   * 系统默认的使用区域
   * @return defaultZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统默认的使用区域")

  public String getDefaultZone() {
    return defaultZone;
  }


  public void setDefaultZone(String defaultZone) {
    this.defaultZone = defaultZone;
  }


  public TestSystem deploy(DeployEnum deploy) {
    
    this.deploy = deploy;
    return this;
  }

   /**
   * 部署模式
   * @return deploy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "部署模式")

  public DeployEnum getDeploy() {
    return deploy;
  }


  public void setDeploy(DeployEnum deploy) {
    this.deploy = deploy;
  }


  public TestSystem domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * 域名
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "域名")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


  public TestSystem enable(Integer enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * 内测系统是否可用
   * @return enable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "内测系统是否可用")

  public Integer getEnable() {
    return enable;
  }


  public void setEnable(Integer enable) {
    this.enable = enable;
  }


  public TestSystem expend(BigDecimal expend) {
    
    this.expend = expend;
    return this;
  }

   /**
   * 系统消耗:给用户充值后，用户实际消耗了该费用，仅使用官方提供的镜像部署的系统有效，API接口调用，无意义
   * @return expend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统消耗:给用户充值后，用户实际消耗了该费用，仅使用官方提供的镜像部署的系统有效，API接口调用，无意义")

  public BigDecimal getExpend() {
    return expend;
  }


  public void setExpend(BigDecimal expend) {
    this.expend = expend;
  }


  public TestSystem flowSize(Long flowSize) {
    
    this.flowSize = flowSize;
    return this;
  }

   /**
   * 系统流量
   * @return flowSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统流量")

  public Long getFlowSize() {
    return flowSize;
  }


  public void setFlowSize(Long flowSize) {
    this.flowSize = flowSize;
  }


  public TestSystem host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * 主机
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "主机")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public TestSystem image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * 主机
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "主机")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public TestSystem key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * 系统证书KEY
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统证书KEY")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public TestSystem linkLimit(Integer linkLimit) {
    
    this.linkLimit = linkLimit;
    return this;
  }

   /**
   * 授权链接上限:系统可以生成授权链接个数的上限
   * @return linkLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "授权链接上限:系统可以生成授权链接个数的上限")

  public Integer getLinkLimit() {
    return linkLimit;
  }


  public void setLinkLimit(Integer linkLimit) {
    this.linkLimit = linkLimit;
  }


  public TestSystem monthYear(MonthYearEnum monthYear) {
    
    this.monthYear = monthYear;
    return this;
  }

   /**
   * 包年包月企业证书调用权限
   * @return monthYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "包年包月企业证书调用权限")

  public MonthYearEnum getMonthYear() {
    return monthYear;
  }


  public void setMonthYear(MonthYearEnum monthYear) {
    this.monthYear = monthYear;
  }


  public TestSystem payMode(PayModeEnum payMode) {
    
    this.payMode = payMode;
    return this;
  }

   /**
   * 支付模式
   * @return payMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "支付模式")

  public PayModeEnum getPayMode() {
    return payMode;
  }


  public void setPayMode(PayModeEnum payMode) {
    this.payMode = payMode;
  }


  public TestSystem payerCount(Integer payerCount) {
    
    this.payerCount = payerCount;
    return this;
  }

   /**
   * 付费个数上限:同一个授权码或UDID,下载同一个用户的其他APP的付费个数上限，超过该上限，不再计费，小于等于零，表示都计费，无上限，大于0为上限的个数
   * @return payerCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "付费个数上限:同一个授权码或UDID,下载同一个用户的其他APP的付费个数上限，超过该上限，不再计费，小于等于零，表示都计费，无上限，大于0为上限的个数")

  public Integer getPayerCount() {
    return payerCount;
  }


  public void setPayerCount(Integer payerCount) {
    this.payerCount = payerCount;
  }


  public TestSystem pem(String pem) {
    
    this.pem = pem;
    return this;
  }

   /**
   * 系统证书PEM
   * @return pem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统证书PEM")

  public String getPem() {
    return pem;
  }


  public void setPem(String pem) {
    this.pem = pem;
  }


  public TestSystem port(String port) {
    
    this.port = port;
    return this;
  }

   /**
   * 端口
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "端口")

  public String getPort() {
    return port;
  }


  public void setPort(String port) {
    this.port = port;
  }


  public TestSystem publicIp(String publicIp) {
    
    this.publicIp = publicIp;
    return this;
  }

   /**
   * 公网IP
   * @return publicIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "公网IP")

  public String getPublicIp() {
    return publicIp;
  }


  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }


  public TestSystem quota(BigDecimal quota) {
    
    this.quota = quota;
    return this;
  }

   /**
   * 系统配额仅使用官方提供的镜像部署的系统有效，API接口调用，无意义
   * @return quota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统配额仅使用官方提供的镜像部署的系统有效，API接口调用，无意义")

  public BigDecimal getQuota() {
    return quota;
  }


  public void setQuota(BigDecimal quota) {
    this.quota = quota;
  }


  public TestSystem regionId(String regionId) {
    
    this.regionId = regionId;
    return this;
  }

   /**
   * 区域ID
   * @return regionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "区域ID")

  public String getRegionId() {
    return regionId;
  }


  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }


  public TestSystem regionName(String regionName) {
    
    this.regionName = regionName;
    return this;
  }

   /**
   * 区域名称
   * @return regionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "区域名称")

  public String getRegionName() {
    return regionName;
  }


  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }


  public TestSystem release(Boolean release) {
    
    this.release = release;
    return this;
  }

   /**
   * 是否释放
   * @return release
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否释放")

  public Boolean getRelease() {
    return release;
  }


  public void setRelease(Boolean release) {
    this.release = release;
  }


  public TestSystem releaseTime(String releaseTime) {
    
    this.releaseTime = releaseTime;
    return this;
  }

   /**
   * 释放时间
   * @return releaseTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "释放时间")

  public String getReleaseTime() {
    return releaseTime;
  }


  public void setReleaseTime(String releaseTime) {
    this.releaseTime = releaseTime;
  }


  public TestSystem signLimit(BigDecimal signLimit) {
    
    this.signLimit = signLimit;
    return this;
  }

   /**
   * 签名价格最低限制:签名系统不能修改为低于该价格的签名值
   * @return signLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "签名价格最低限制:签名系统不能修改为低于该价格的签名值")

  public BigDecimal getSignLimit() {
    return signLimit;
  }


  public void setSignLimit(BigDecimal signLimit) {
    this.signLimit = signLimit;
  }


  public TestSystem signedCount(Integer signedCount) {
    
    this.signedCount = signedCount;
    return this;
  }

   /**
   * 已签次数:记录系统已签名的次数
   * @return signedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "已签次数:记录系统已签名的次数")

  public Integer getSignedCount() {
    return signedCount;
  }


  public void setSignedCount(Integer signedCount) {
    this.signedCount = signedCount;
  }


  public TestSystem stack(String stack) {
    
    this.stack = stack;
    return this;
  }

   /**
   * 部署栈:仅供在使用一键部署时使用，用以做命名空间的区分
   * @return stack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "部署栈:仅供在使用一键部署时使用，用以做命名空间的区分")

  public String getStack() {
    return stack;
  }


  public void setStack(String stack) {
    this.stack = stack;
  }


  public TestSystem status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * 实例状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "实例状态")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public TestSystem systemStatus(SystemStatusEnum systemStatus) {
    
    this.systemStatus = systemStatus;
    return this;
  }

   /**
   * 系统状态
   * @return systemStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "系统状态")

  public SystemStatusEnum getSystemStatus() {
    return systemStatus;
  }


  public void setSystemStatus(SystemStatusEnum systemStatus) {
    this.systemStatus = systemStatus;
  }


  public TestSystem tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * 标签
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "标签")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public TestSystem udidLimit(Integer udidLimit) {
    
    this.udidLimit = udidLimit;
    return this;
  }

   /**
   * UDID直装上限:系统可以生成UDID直装链接个数的上限
   * @return udidLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UDID直装上限:系统可以生成UDID直装链接个数的上限")

  public Integer getUdidLimit() {
    return udidLimit;
  }


  public void setUdidLimit(Integer udidLimit) {
    this.udidLimit = udidLimit;
  }


  public TestSystem useMode(UseModeEnum useMode) {
    
    this.useMode = useMode;
    return this;
  }

   /**
   * 使用模式
   * @return useMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "使用模式")

  public UseModeEnum getUseMode() {
    return useMode;
  }


  public void setUseMode(UseModeEnum useMode) {
    this.useMode = useMode;
  }


  public TestSystem userUuid(String userUuid) {
    
    this.userUuid = userUuid;
    return this;
  }

   /**
   * 每个注册用户都有自己的UUID
   * @return userUuid
  **/
  @ApiModelProperty(required = true, value = "每个注册用户都有自己的UUID")

  public String getUserUuid() {
    return userUuid;
  }


  public void setUserUuid(String userUuid) {
    this.userUuid = userUuid;
  }


  public TestSystem username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * 用户名
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户名")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public TestSystem uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * 在云小朵官方网站后台开发内测菜单中，进入内测系统:创建一个&lt;手动配置实例&gt;类型，即可获得一个(uuid)
   * @return uuid
  **/
  @ApiModelProperty(required = true, value = "在云小朵官方网站后台开发内测菜单中，进入内测系统:创建一个<手动配置实例>类型，即可获得一个(uuid)")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public TestSystem version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * 版本号
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "版本号")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public TestSystem zoneId(String zoneId) {
    
    this.zoneId = zoneId;
    return this;
  }

   /**
   * 可用区ID
   * @return zoneId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "可用区ID")

  public String getZoneId() {
    return zoneId;
  }


  public void setZoneId(String zoneId) {
    this.zoneId = zoneId;
  }


  public TestSystem zoneName(String zoneName) {
    
    this.zoneName = zoneName;
    return this;
  }

   /**
   * 可用区名称
   * @return zoneName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "可用区名称")

  public String getZoneName() {
    return zoneName;
  }


  public void setZoneName(String zoneName) {
    this.zoneName = zoneName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSystem testSystem = (TestSystem) o;
    return Objects.equals(this.accessLevel, testSystem.accessLevel) &&
        Objects.equals(this.alias, testSystem.alias) &&
        Objects.equals(this.authCount, testSystem.authCount) &&
        Objects.equals(this.callback, testSystem.callback) &&
        Objects.equals(this.codeLimit, testSystem.codeLimit) &&
        Objects.equals(this.commission, testSystem.commission) &&
        Objects.equals(this.consume, testSystem.consume) &&
        Objects.equals(this.createTime, testSystem.createTime) &&
        Objects.equals(this.crt, testSystem.crt) &&
        Objects.equals(this.defaultZone, testSystem.defaultZone) &&
        Objects.equals(this.deploy, testSystem.deploy) &&
        Objects.equals(this.domain, testSystem.domain) &&
        Objects.equals(this.enable, testSystem.enable) &&
        Objects.equals(this.expend, testSystem.expend) &&
        Objects.equals(this.flowSize, testSystem.flowSize) &&
        Objects.equals(this.host, testSystem.host) &&
        Objects.equals(this.image, testSystem.image) &&
        Objects.equals(this.key, testSystem.key) &&
        Objects.equals(this.linkLimit, testSystem.linkLimit) &&
        Objects.equals(this.monthYear, testSystem.monthYear) &&
        Objects.equals(this.payMode, testSystem.payMode) &&
        Objects.equals(this.payerCount, testSystem.payerCount) &&
        Objects.equals(this.pem, testSystem.pem) &&
        Objects.equals(this.port, testSystem.port) &&
        Objects.equals(this.publicIp, testSystem.publicIp) &&
        Objects.equals(this.quota, testSystem.quota) &&
        Objects.equals(this.regionId, testSystem.regionId) &&
        Objects.equals(this.regionName, testSystem.regionName) &&
        Objects.equals(this.release, testSystem.release) &&
        Objects.equals(this.releaseTime, testSystem.releaseTime) &&
        Objects.equals(this.signLimit, testSystem.signLimit) &&
        Objects.equals(this.signedCount, testSystem.signedCount) &&
        Objects.equals(this.stack, testSystem.stack) &&
        Objects.equals(this.status, testSystem.status) &&
        Objects.equals(this.systemStatus, testSystem.systemStatus) &&
        Objects.equals(this.tag, testSystem.tag) &&
        Objects.equals(this.udidLimit, testSystem.udidLimit) &&
        Objects.equals(this.useMode, testSystem.useMode) &&
        Objects.equals(this.userUuid, testSystem.userUuid) &&
        Objects.equals(this.username, testSystem.username) &&
        Objects.equals(this.uuid, testSystem.uuid) &&
        Objects.equals(this.version, testSystem.version) &&
        Objects.equals(this.zoneId, testSystem.zoneId) &&
        Objects.equals(this.zoneName, testSystem.zoneName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLevel, alias, authCount, callback, codeLimit, commission, consume, createTime, crt, defaultZone, deploy, domain, enable, expend, flowSize, host, image, key, linkLimit, monthYear, payMode, payerCount, pem, port, publicIp, quota, regionId, regionName, release, releaseTime, signLimit, signedCount, stack, status, systemStatus, tag, udidLimit, useMode, userUuid, username, uuid, version, zoneId, zoneName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestSystem {\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    authCount: ").append(toIndentedString(authCount)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    codeLimit: ").append(toIndentedString(codeLimit)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    consume: ").append(toIndentedString(consume)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    crt: ").append(toIndentedString(crt)).append("\n");
    sb.append("    defaultZone: ").append(toIndentedString(defaultZone)).append("\n");
    sb.append("    deploy: ").append(toIndentedString(deploy)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    expend: ").append(toIndentedString(expend)).append("\n");
    sb.append("    flowSize: ").append(toIndentedString(flowSize)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    linkLimit: ").append(toIndentedString(linkLimit)).append("\n");
    sb.append("    monthYear: ").append(toIndentedString(monthYear)).append("\n");
    sb.append("    payMode: ").append(toIndentedString(payMode)).append("\n");
    sb.append("    payerCount: ").append(toIndentedString(payerCount)).append("\n");
    sb.append("    pem: ").append(toIndentedString(pem)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    releaseTime: ").append(toIndentedString(releaseTime)).append("\n");
    sb.append("    signLimit: ").append(toIndentedString(signLimit)).append("\n");
    sb.append("    signedCount: ").append(toIndentedString(signedCount)).append("\n");
    sb.append("    stack: ").append(toIndentedString(stack)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    systemStatus: ").append(toIndentedString(systemStatus)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    udidLimit: ").append(toIndentedString(udidLimit)).append("\n");
    sb.append("    useMode: ").append(toIndentedString(useMode)).append("\n");
    sb.append("    userUuid: ").append(toIndentedString(userUuid)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
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
