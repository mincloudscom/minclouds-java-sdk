

# DeviceRegistryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessKey** | **String** | 调用接口凭证标识:在系统AccessKey管理中创建 | 
**accessLevel** | [**AccessLevelEnum**](#AccessLevelEnum) | 证书请求级别，默认为私有(Private), 目前仅支持：Private，Protected，Public | 
**accountUuid** | **String** | 账号的UUID,系统将优先使用指定的账户进行设备注册和签名，如果该账号无效或已无可用的注册设备数，则使用其他账号。在系统后台可以获取到账号的UUID, 签名回调中也包含该UUID |  [optional]
**appUuid** | **String** | 系统默认将为UDID关联到某一个APP UUID上，用已确认某个UDID在某个APP中是否已注册，通过API接口调用时，如果没有APPUUID，可以使用(System Uuid)代替，或随机生成一个 | 
**autoSelect** | **Boolean** | 开启智能选择后，系统将根据当前证书价格的情况自动选择个人证书还是企业证书，包月到期将自动切换到按次付费 |  [optional]
**callback** | **String** | 设备注册成功后，系统将申请的证书通过回调地址发送到业务系统上 |  [optional]
**deviceName** | **String** | 设置名称，如果为空，则使用UDID，作为设备名 |  [optional]
**extra** | **String** | 额外传递的数据，该数据，在回调时原路返回 |  [optional]
**imei** | **String** | 手机的IMEI |  [optional]
**interval** | **Integer** | 指定证书上传后的时间 |  [optional]
**priceLimit** | **BigDecimal** | 系统中大于该值的证书将不会被调用 | 
**product** | **String** | 手机产品类型 |  [optional]
**serial** | **String** | 手机的序列号 |  [optional]
**signType** | [**SignTypeEnum**](#SignTypeEnum) | 允许用户选择使用的签名类型 |  [optional]
**signature** | **String** | 签名校验，后台会对没错的设备注册进行数据校验，校验不通过，将不能签名；签名值：accessKey + udid + systemUuid + appUuid + accessLevel + priceLimit + timestamp + accessSecret; 签名算法：md5 | 
**systemUuid** | **String** | 在云小朵官方网站后台开发内测菜单中，进入内测系统:创建一个&lt;手动配置实例&gt;类型，即可获得一个(System Uuid) | 
**timestamp** | **Long** | 当前时间的时间戳，用于校验请求的合法性，如果时间偏离当前时间，将可能导致失败 | 
**udid** | **String** | iOS或iPad设备UDID | 
**version** | **String** | 手机版本号 |  [optional]



## Enum: AccessLevelEnum

Name | Value
---- | -----
DISABLED | &quot;Disabled&quot;
INHERITED | &quot;Inherited&quot;
INTERNAL | &quot;Internal&quot;
PRIVATE | &quot;Private&quot;
PROTECTED | &quot;Protected&quot;
PUBLIC | &quot;Public&quot;



## Enum: SignTypeEnum

Name | Value
---- | -----
APPSTORE | &quot;AppStore&quot;
MDMENTERPRISE | &quot;MdmEnterprise&quot;
MONTHENTERPRISE | &quot;MonthEnterprise&quot;
ORIGINALMODE | &quot;OriginalMode&quot;
SUPERENTERPRISE | &quot;SuperEnterprise&quot;
SUPERPERSONAL | &quot;SuperPersonal&quot;
TESTFLIGHT | &quot;TestFlight&quot;



