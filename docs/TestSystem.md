

# TestSystem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessLevel** | [**AccessLevelEnum**](#AccessLevelEnum) | 内测系统可配置的证书调用权限 |  [optional]
**alias** | **String** | 系统别名 |  [optional]
**authCount** | **Integer** | 授权次数:允许你设定一个该系统可签名的次数上限，达到上限后，使用该系统将不再签名 |  [optional]
**callback** | **String** | 系统默认的回调地址 |  [optional]
**codeLimit** | **Integer** | 授权码上限:系统可以生成授权码个数的上限 |  [optional]
**commission** | **Double** | 配额比例:系统配额的手续费比例，大于0，小于1，按照比例收取，0，不收配额比例，按包年包月计算，小于0，使用系统默认值 |  [optional]
**consume** | **BigDecimal** | 系统消费:给用户充值即表示配额消费了，仅使用官方提供的镜像部署的系统有效，API接口调用，无意义 |  [optional]
**createTime** | **String** | 创建时间 |  [optional]
**crt** | **String** | 系统证书CRT |  [optional]
**defaultZone** | **String** | 系统默认的使用区域 |  [optional]
**deploy** | [**DeployEnum**](#DeployEnum) | 部署模式 |  [optional]
**domain** | **String** | 域名 |  [optional]
**enable** | **Integer** | 内测系统是否可用 |  [optional]
**expend** | **BigDecimal** | 系统消耗:给用户充值后，用户实际消耗了该费用，仅使用官方提供的镜像部署的系统有效，API接口调用，无意义 |  [optional]
**flowSize** | **Long** | 系统流量 |  [optional]
**host** | **String** | 主机 |  [optional]
**image** | **String** | 主机 |  [optional]
**key** | **String** | 系统证书KEY |  [optional]
**linkLimit** | **Integer** | 授权链接上限:系统可以生成授权链接个数的上限 |  [optional]
**monthYear** | [**MonthYearEnum**](#MonthYearEnum) | 包年包月企业证书调用权限 |  [optional]
**payMode** | [**PayModeEnum**](#PayModeEnum) | 支付模式 |  [optional]
**payerCount** | **Integer** | 付费个数上限:同一个授权码或UDID,下载同一个用户的其他APP的付费个数上限，超过该上限，不再计费，小于等于零，表示都计费，无上限，大于0为上限的个数 |  [optional]
**pem** | **String** | 系统证书PEM |  [optional]
**plugins** | [**List&lt;PluginEntry&gt;**](PluginEntry.md) |  |  [optional]
**port** | **String** | 端口 |  [optional]
**publicIp** | **String** | 公网IP |  [optional]
**quota** | **BigDecimal** | 系统配额仅使用官方提供的镜像部署的系统有效，API接口调用，无意义 |  [optional]
**regionId** | **String** | 区域ID |  [optional]
**regionName** | **String** | 区域名称 |  [optional]
**release** | **Boolean** | 是否释放 |  [optional]
**releaseTime** | **String** | 释放时间 |  [optional]
**signLimit** | **BigDecimal** | 签名价格最低限制:签名系统不能修改为低于该价格的签名值 |  [optional]
**signedCount** | **Integer** | 已签次数:记录系统已签名的次数 |  [optional]
**stack** | **String** | 部署栈:仅供在使用一键部署时使用，用以做命名空间的区分 |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | 实例状态 |  [optional]
**systemStatus** | [**SystemStatusEnum**](#SystemStatusEnum) | 系统状态 |  [optional]
**tag** | **String** | 标签 |  [optional]
**udidLimit** | **Integer** | UDID直装上限:系统可以生成UDID直装链接个数的上限 |  [optional]
**useMode** | [**UseModeEnum**](#UseModeEnum) | 使用模式 |  [optional]
**userUuid** | **String** | 每个注册用户都有自己的UUID | 
**username** | **String** | 用户名 |  [optional]
**uuid** | **String** | 在云小朵官方网站后台开发内测菜单中，进入内测系统:创建一个&lt;手动配置实例&gt;类型，即可获得一个(uuid) | 
**version** | **String** | 版本号 |  [optional]
**zoneId** | **String** | 可用区ID |  [optional]
**zoneName** | **String** | 可用区名称 |  [optional]



## Enum: AccessLevelEnum

Name | Value
---- | -----
DISABLED | &quot;Disabled&quot;
INHERITED | &quot;Inherited&quot;
INTERNAL | &quot;Internal&quot;
PRIVATE | &quot;Private&quot;
PROTECTED | &quot;Protected&quot;
PUBLIC | &quot;Public&quot;



## Enum: DeployEnum

Name | Value
---- | -----
CLOUD | &quot;cloud&quot;
MANUAL | &quot;manual&quot;



## Enum: MonthYearEnum

Name | Value
---- | -----
DISABLED | &quot;Disabled&quot;
INHERITED | &quot;Inherited&quot;
INTERNAL | &quot;Internal&quot;
PRIVATE | &quot;Private&quot;
PROTECTED | &quot;Protected&quot;
PUBLIC | &quot;Public&quot;



## Enum: PayModeEnum

Name | Value
---- | -----
PERYEARMONTH | &quot;PerYearMonth&quot;
PREEMPTIVE | &quot;Preemptive&quot;
QUANTITY | &quot;Quantity&quot;



## Enum: StatusEnum

Name | Value
---- | -----
CREATED | &quot;Created&quot;
EXCEPTED | &quot;Excepted&quot;
FAILED | &quot;Failed&quot;
PAUSED | &quot;Paused&quot;
PAUSING | &quot;Pausing&quot;
PREPARING | &quot;Preparing&quot;
RELEASED | &quot;Released&quot;
RELEASING | &quot;Releasing&quot;
RETRY | &quot;Retry&quot;
RUNNING | &quot;Running&quot;
STARTING | &quot;Starting&quot;
STOPPED | &quot;Stopped&quot;
STOPPING | &quot;Stopping&quot;
UPGRADED | &quot;Upgraded&quot;
UPGRADING | &quot;Upgrading&quot;



## Enum: SystemStatusEnum

Name | Value
---- | -----
AVAILABLE | &quot;Available&quot;
EXCEPTED | &quot;Excepted&quot;
FORBIDDEN | &quot;Forbidden&quot;
NEEDUPGRADE | &quot;NeedUpgrade&quot;
NODEPLOY | &quot;NoDeploy&quot;
READYRELEASE | &quot;ReadyRelease&quot;



## Enum: UseModeEnum

Name | Value
---- | -----
BYSELF | &quot;BySelf&quot;
FREE | &quot;Free&quot;
SHARED | &quot;Shared&quot;



