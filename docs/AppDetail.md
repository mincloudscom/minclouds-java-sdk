

# AppDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accelerateEnable** | **Integer** |  |  [optional]
**acceleratePreload** | **Integer** | 只有当加速开关开启后有效 |  [optional]
**accessLevel** | [**AccessLevelEnum**](#AccessLevelEnum) |  |  [optional]
**apkLinkAddress** | **String** | 第三方安卓包下载地址 |  [optional]
**appAddress** | **String** |  |  [optional]
**appCodePlus** | **BigDecimal** |  |  [optional]
**appDomain** | **String** |  |  [optional]
**appImgs** | **String** |  |  [optional]
**appName** | **String** |  |  [optional]
**appScore** | **String** |  |  [optional]
**appSignal** | **String** |  |  [optional]
**appSigned** | **Integer** |  |  [optional]
**appSize** | **String** |  |  [optional]
**appStar** | **String** |  |  [optional]
**appStatus** | **Integer** | 100,表示已上线;10,用户手动下线;20,触发限额自动下线;30,余额不足自动下线;40,系统强制下线;90,其他情况下线;-100,应用删除进入回收站 |  [optional]
**appSuffix** | **String** |  |  [optional]
**appType** | **Integer** |  |  [optional]
**appTypeStr** | **String** |  |  [optional]
**appVersion** | **String** |  |  [optional]
**authCodePlus** | **BigDecimal** |  |  [optional]
**autoMobileConfig** | **Integer** | 0,不自动;1,自动 |  [optional]
**autoRenew** | **Boolean** | 当signType&#x3D;MonthEnterprise时有效，表示是否自动开启到期续费，用户余额不足将自动续费失败 |  [optional]
**autoSelect** | **Boolean** | 开启智能选择后，系统将自动判断使用哪种签名类型，系统优先使用用户自己的企业证书，依次使用个人证书，自动判断公有企业证书或个人证书中较便宜的签名类型，并自动切换 |  [optional]
**banner** | **String** |  |  [optional]
**bindDomain** | **String** |  |  [optional]
**bundleId** | **String** |  |  [optional]
**callback** | **String** |  |  [optional]
**contact** | **String** |  |  [optional]
**createTime** | **String** |  |  [optional]
**deadline** | **String** | 当signType&#x3D;MonthEnterprise时有效，包月到期的时间 |  [optional]
**description** | **String** |  |  [optional]
**developer** | **String** |  |  [optional]
**dynamicMobileConfig** | **Integer** |  |  [optional]
**enterpriseSigned** | **Integer** |  |  [optional]
**fileSize** | **Long** |  |  [optional]
**fileVersion** | **String** |  |  [optional]
**icon** | **String** |  |  [optional]
**inject** | **Boolean** |  |  [optional]
**installJump** | **String** |  |  [optional]
**installTime** | **Integer** |  |  [optional]
**installType** | [**InstallTypeEnum**](#InstallTypeEnum) |  |  [optional]
**jumpUrl** | **String** |  |  [optional]
**lang** | **String** |  |  [optional]
**lastSignTimer** | **Long** | 单位秒 |  [optional]
**lastVisitTime** | **String** |  |  [optional]
**limitType** | [**LimitTypeEnum**](#LimitTypeEnum) |  |  [optional]
**linkedUuid** | **String** |  |  [optional]
**md5** | **String** |  |  [optional]
**mobileConfig** | **String** |  |  [optional]
**newAppName** | **String** |  |  [optional]
**newBundleId** | **String** |  |  [optional]
**notification** | **String** |  |  [optional]
**packAppUuid** | **Integer** |  |  [optional]
**packUdid** | **Integer** |  |  [optional]
**password** | **String** |  |  [optional]
**payType** | [**PayTypeEnum**](#PayTypeEnum) |  |  [optional]
**priceLimit** | **BigDecimal** |  |  [optional]
**progressType** | **Integer** | -1:关闭页面打包安装进度提示,0:默认开启 |  [optional]
**qrcodeUrl** | **String** |  |  [optional]
**separateType** | [**SeparateTypeEnum**](#SeparateTypeEnum) |  |  [optional]
**shortCode** | **String** |  |  [optional]
**shortUrl** | **String** |  |  [optional]
**shorten** | **String** |  |  [optional]
**showNote** | **Integer** |  |  [optional]
**signCertUuid** | **String** | 签名证书的UUID, 企业签包年包月时，签名APP的证书的UUID |  [optional]
**signHost** | **String** |  |  [optional]
**signTime** | **String** | 当signType&#x3D;MonthEnterprise时有效，记录上一次包年包月企业签的包的重签时间 |  [optional]
**signType** | [**SignTypeEnum**](#SignTypeEnum) |  |  [optional]
**signedIpa** | **String** | 签名后的安装包的存放地址，可供用户下载使用 |  [optional]
**signedMd5** | **String** | 签名后的安装包的MD5值 |  [optional]
**signedSize** | **Long** |  |  [optional]
**unzipCharset** | **String** |  |  [optional]
**updateTime** | **String** |  |  [optional]
**userAge** | **String** |  |  [optional]
**userCount** | **Long** |  |  [optional]
**userUuid** | **String** |  |  [optional]
**uuid** | **String** |  |  [optional]
**videoBackground** | **String** |  |  [optional]
**videoMedia** | **String** |  |  [optional]



## Enum: AccessLevelEnum

Name | Value
---- | -----
DISABLED | &quot;Disabled&quot;
INHERITED | &quot;Inherited&quot;
INTERNAL | &quot;Internal&quot;
PRIVATE | &quot;Private&quot;
PROTECTED | &quot;Protected&quot;
PUBLIC | &quot;Public&quot;



## Enum: InstallTypeEnum

Name | Value
---- | -----
APPCODE | &quot;AppCode&quot;
AUTHCODE | &quot;AuthCode&quot;
DIRECT | &quot;Direct&quot;
PASSWORD | &quot;Password&quot;
SLIDER | &quot;Slider&quot;
UDIDDIRECT | &quot;UdidDirect&quot;
UDIDPAY | &quot;UdidPay&quot;
VERIFYCODE | &quot;VerifyCode&quot;



## Enum: LimitTypeEnum

Name | Value
---- | -----
ALL | &quot;All&quot;
INHERITED | &quot;Inherited&quot;
MULTIPLEAPP | &quot;MultipleApp&quot;
MULTIPLEONLY | &quot;MultipleOnly&quot;
SINGLEAPP | &quot;SingleApp&quot;
SINGLEONLY | &quot;SingleOnly&quot;
UNLIMITEDAPP | &quot;UnlimitedApp&quot;
UNLIMITEDONLY | &quot;UnlimitedOnly&quot;



## Enum: PayTypeEnum

Name | Value
---- | -----
ALL | &quot;All&quot;
BYMONTH | &quot;ByMonth&quot;
BYTIMES | &quot;ByTimes&quot;
BYYEAR | &quot;ByYear&quot;
INHERITED | &quot;Inherited&quot;
MONTHONLY | &quot;MonthOnly&quot;
TIMESONLY | &quot;TimesOnly&quot;
YEARONLY | &quot;YearOnly&quot;



## Enum: SeparateTypeEnum

Name | Value
---- | -----
DYNAMIC | &quot;Dynamic&quot;
ORIGINAL | &quot;Original&quot;



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



