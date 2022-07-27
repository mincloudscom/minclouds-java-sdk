

# Product

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**append** | **BigDecimal** |  |  [optional]
**commissionType** | [**CommissionTypeEnum**](#CommissionTypeEnum) |  |  [optional]
**commissionValue** | **BigDecimal** |  |  [optional]
**detail** | **String** |  |  [optional]
**discount** | **BigDecimal** |  |  [optional]
**dynamic** | **Boolean** |  |  [optional]
**floating** | **Double** |  |  [optional]
**guide** | **BigDecimal** |  |  [optional]
**name** | **String** |  |  [optional]
**ownerType** | [**OwnerTypeEnum**](#OwnerTypeEnum) |  |  [optional]
**payType** | [**PayTypeEnum**](#PayTypeEnum) |  |  [optional]
**plus** | **BigDecimal** |  |  [optional]
**price** | **BigDecimal** |  |  [optional]
**productId** | **String** |  |  [optional]
**productStatus** | [**ProductStatusEnum**](#ProductStatusEnum) |  |  [optional]
**realPrice** | **BigDecimal** |  |  [optional]
**unit** | **String** |  |  [optional]



## Enum: CommissionTypeEnum

Name | Value
---- | -----
FIXEDVALUE | &quot;FixedValue&quot;
PERCENTAGE | &quot;Percentage&quot;



## Enum: OwnerTypeEnum

Name | Value
---- | -----
PLATFORM | &quot;Platform&quot;
THIRDPARTY | &quot;ThirdParty&quot;



## Enum: PayTypeEnum

Name | Value
---- | -----
POSTPAY | &quot;Postpay&quot;
PREPAY | &quot;Prepay&quot;



## Enum: ProductStatusEnum

Name | Value
---- | -----
AUDIT | &quot;Audit&quot;
FORBIDDEN | &quot;Forbidden&quot;
OFFLINE | &quot;Offline&quot;
ONLINE | &quot;Online&quot;



