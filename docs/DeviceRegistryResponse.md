

# DeviceRegistryResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountUuid** | **String** | 返回注册后使用的账号的UUID | 
**appData** | **String** | 签名时传的的APP签名数据，比如渠道信息，该数据，在回调时原路返回 |  [optional]
**appUuid** | **String** | 系统默认将为UDID关联到某一个APP UUID上，用已确认某个UDID在某个APP中是否已注册，通过API接口调用时，如果没有APPUUID，可以使用(System Uuid)代替，或随机生成一个 | 
**bundleId** | **String** | 当前签名账号的BundleID，仅作为参考，无实际用途 |  [optional]
**callback** | **String** | 回到地址 |  [optional]
**certificate** | **String** | P12证书的Base64编码格式，客户系统需要自行解码并保持为P12文件，用签名工具打包签名APP | 
**certificateId** | **String** | 当前签名账号的证书ID，仅作为参考，无实际用途 |  [optional]
**code** | **Integer** | 失败码，成功一般都返回0，非0，即表示失败，查看对应失败码的描述 |  [optional]
**extra** | **String** | 额外参数，传递后原路返回 |  [optional]
**flowNum** | **String** | 流水号:防止重复提交与计费 |  [optional]
**groupId** | **String** | BundleID关联的GroupID |  [optional]
**msg** | **String** | 设备注册失败的提示信息 |  [optional]
**orderId** | **String** | 订单号，传递后原路返回 |  [optional]
**password** | **String** | P12证书的密码，APP签名时需要，必要的返回数据 | 
**productId** | **String** | 计费的产品ID, 一键部署的第三方系统将根据该ID进行计费，API接口调用也使用该ID计费 |  [optional]
**profile** | **String** | 描述文件的Base64编码格式，客户系统需要自行解码并保持为.mobileprovision文件，用签名工具打包签名APP，该文件即为APP重签名后的APP安装包中的embedded.mobileprovision文件 |  [optional]
**profileId** | **String** | 描述文件的ID，仅作为参考，无实际用途 |  [optional]
**separate** | **String** | 应用分身的记录ID |  [optional]
**signType** | [**SignTypeEnum**](#SignTypeEnum) | 返回实际调用的签名类型 |  [optional]
**systemUuid** | **String** | 在云小朵官方网站后台开发内测菜单中，进入内测系统:创建一个&lt;手动配置实例&gt;类型，即可获得一个(System Uuid) | 
**tradeNum** | **String** | 交易单号:业务系统计费的订单 |  [optional]
**udid** | **String** | iOS或iPad设备UDID | 
**valid** | **Boolean** |  |  [optional]
**value** | **BigDecimal** | 注册UDID消费金额 |  [optional]



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



