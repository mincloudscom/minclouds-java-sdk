

# UdidPayData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appCount** | **Integer** |  |  [optional]
**buyData** | **Long** |  |  [optional]
**giveData** | **Long** |  |  [optional]
**lastPay** | **BigDecimal** |  |  [optional]
**limitType** | [**LimitTypeEnum**](#LimitTypeEnum) |  |  [optional]
**orderId** | **String** |  |  [optional]
**payTime** | **OffsetDateTime** |  |  [optional]
**payType** | [**PayTypeEnum**](#PayTypeEnum) |  |  [optional]
**phone** | **String** |  |  [optional]
**subUuid** | **String** |  |  [optional]
**udid** | **String** |  |  [optional]
**userUuid** | **String** |  |  [optional]



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



