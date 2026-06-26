package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * API DTO containing usage summary response data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsageSummaryResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The billable quantity total for this usage summary.
     */
    private Double billableQuantityTotal;
    /**
     * The billing blocked count for this usage summary.
     */
    private Integer billingBlockedCount;
    /**
     * The named usage counters included with this usage summary.
     */
    private java.util.List<UsageCounterLine> counters;
    /**
     * The customer charge total for this usage summary.
     */
    private Double customerChargeTotal;
    /**
     * The failed count for this usage summary.
     */
    private Integer failedCount;
    /**
     * The internal cost total for this usage summary.
     */
    private Double internalCostTotal;
    /**
     * The lines included with this usage summary.
     */
    private java.util.List<UsageSummaryLine> lines;
    /**
     * The non billable internal count for this usage summary.
     */
    private Integer nonBillableInternalCount;
    /**
     * The pending invoice count for this usage summary.
     */
    private Integer pendingInvoiceCount;
    /**
     * The date and time for the period end value on this usage summary.
     */
    private OffsetDateTime periodEnd;
    /**
     * The date and time for the period start value on this usage summary.
     */
    private OffsetDateTime periodStart;
    /**
     * The provider cost total for this usage summary.
     */
    private Double providerCostTotal;
    /**
     * The usage record count for this usage summary.
     */
    private Integer usageRecordCount;
    /**
     * Instantiates a new {@link UsageSummaryResponse} and sets the default values.
     */
    public UsageSummaryResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UsageSummaryResponse}
     */
    @jakarta.annotation.Nonnull
    public static UsageSummaryResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UsageSummaryResponse();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the billableQuantityTotal property value. The billable quantity total for this usage summary.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getBillableQuantityTotal() {
        return this.billableQuantityTotal;
    }
    /**
     * Gets the billingBlockedCount property value. The billing blocked count for this usage summary.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBillingBlockedCount() {
        return this.billingBlockedCount;
    }
    /**
     * Gets the counters property value. The named usage counters included with this usage summary.
     * @return a {@link java.util.List<UsageCounterLine>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UsageCounterLine> getCounters() {
        return this.counters;
    }
    /**
     * Gets the customerChargeTotal property value. The customer charge total for this usage summary.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getCustomerChargeTotal() {
        return this.customerChargeTotal;
    }
    /**
     * Gets the failedCount property value. The failed count for this usage summary.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedCount() {
        return this.failedCount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("billableQuantityTotal", (n) -> { this.setBillableQuantityTotal(n.getDoubleValue()); });
        deserializerMap.put("billingBlockedCount", (n) -> { this.setBillingBlockedCount(n.getIntegerValue()); });
        deserializerMap.put("counters", (n) -> { this.setCounters(n.getCollectionOfObjectValues(UsageCounterLine::createFromDiscriminatorValue)); });
        deserializerMap.put("customerChargeTotal", (n) -> { this.setCustomerChargeTotal(n.getDoubleValue()); });
        deserializerMap.put("failedCount", (n) -> { this.setFailedCount(n.getIntegerValue()); });
        deserializerMap.put("internalCostTotal", (n) -> { this.setInternalCostTotal(n.getDoubleValue()); });
        deserializerMap.put("lines", (n) -> { this.setLines(n.getCollectionOfObjectValues(UsageSummaryLine::createFromDiscriminatorValue)); });
        deserializerMap.put("nonBillableInternalCount", (n) -> { this.setNonBillableInternalCount(n.getIntegerValue()); });
        deserializerMap.put("pendingInvoiceCount", (n) -> { this.setPendingInvoiceCount(n.getIntegerValue()); });
        deserializerMap.put("periodEnd", (n) -> { this.setPeriodEnd(n.getOffsetDateTimeValue()); });
        deserializerMap.put("periodStart", (n) -> { this.setPeriodStart(n.getOffsetDateTimeValue()); });
        deserializerMap.put("providerCostTotal", (n) -> { this.setProviderCostTotal(n.getDoubleValue()); });
        deserializerMap.put("usageRecordCount", (n) -> { this.setUsageRecordCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internalCostTotal property value. The internal cost total for this usage summary.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getInternalCostTotal() {
        return this.internalCostTotal;
    }
    /**
     * Gets the lines property value. The lines included with this usage summary.
     * @return a {@link java.util.List<UsageSummaryLine>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UsageSummaryLine> getLines() {
        return this.lines;
    }
    /**
     * Gets the nonBillableInternalCount property value. The non billable internal count for this usage summary.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNonBillableInternalCount() {
        return this.nonBillableInternalCount;
    }
    /**
     * Gets the pendingInvoiceCount property value. The pending invoice count for this usage summary.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPendingInvoiceCount() {
        return this.pendingInvoiceCount;
    }
    /**
     * Gets the periodEnd property value. The date and time for the period end value on this usage summary.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPeriodEnd() {
        return this.periodEnd;
    }
    /**
     * Gets the periodStart property value. The date and time for the period start value on this usage summary.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPeriodStart() {
        return this.periodStart;
    }
    /**
     * Gets the providerCostTotal property value. The provider cost total for this usage summary.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getProviderCostTotal() {
        return this.providerCostTotal;
    }
    /**
     * Gets the usageRecordCount property value. The usage record count for this usage summary.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUsageRecordCount() {
        return this.usageRecordCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("billableQuantityTotal", this.getBillableQuantityTotal());
        writer.writeIntegerValue("billingBlockedCount", this.getBillingBlockedCount());
        writer.writeCollectionOfObjectValues("counters", this.getCounters());
        writer.writeDoubleValue("customerChargeTotal", this.getCustomerChargeTotal());
        writer.writeIntegerValue("failedCount", this.getFailedCount());
        writer.writeDoubleValue("internalCostTotal", this.getInternalCostTotal());
        writer.writeCollectionOfObjectValues("lines", this.getLines());
        writer.writeIntegerValue("nonBillableInternalCount", this.getNonBillableInternalCount());
        writer.writeIntegerValue("pendingInvoiceCount", this.getPendingInvoiceCount());
        writer.writeOffsetDateTimeValue("periodEnd", this.getPeriodEnd());
        writer.writeOffsetDateTimeValue("periodStart", this.getPeriodStart());
        writer.writeDoubleValue("providerCostTotal", this.getProviderCostTotal());
        writer.writeIntegerValue("usageRecordCount", this.getUsageRecordCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the billableQuantityTotal property value. The billable quantity total for this usage summary.
     * @param value Value to set for the billableQuantityTotal property.
     */
    public void setBillableQuantityTotal(@jakarta.annotation.Nullable final Double value) {
        this.billableQuantityTotal = value;
    }
    /**
     * Sets the billingBlockedCount property value. The billing blocked count for this usage summary.
     * @param value Value to set for the billingBlockedCount property.
     */
    public void setBillingBlockedCount(@jakarta.annotation.Nullable final Integer value) {
        this.billingBlockedCount = value;
    }
    /**
     * Sets the counters property value. The named usage counters included with this usage summary.
     * @param value Value to set for the counters property.
     */
    public void setCounters(@jakarta.annotation.Nullable final java.util.List<UsageCounterLine> value) {
        this.counters = value;
    }
    /**
     * Sets the customerChargeTotal property value. The customer charge total for this usage summary.
     * @param value Value to set for the customerChargeTotal property.
     */
    public void setCustomerChargeTotal(@jakarta.annotation.Nullable final Double value) {
        this.customerChargeTotal = value;
    }
    /**
     * Sets the failedCount property value. The failed count for this usage summary.
     * @param value Value to set for the failedCount property.
     */
    public void setFailedCount(@jakarta.annotation.Nullable final Integer value) {
        this.failedCount = value;
    }
    /**
     * Sets the internalCostTotal property value. The internal cost total for this usage summary.
     * @param value Value to set for the internalCostTotal property.
     */
    public void setInternalCostTotal(@jakarta.annotation.Nullable final Double value) {
        this.internalCostTotal = value;
    }
    /**
     * Sets the lines property value. The lines included with this usage summary.
     * @param value Value to set for the lines property.
     */
    public void setLines(@jakarta.annotation.Nullable final java.util.List<UsageSummaryLine> value) {
        this.lines = value;
    }
    /**
     * Sets the nonBillableInternalCount property value. The non billable internal count for this usage summary.
     * @param value Value to set for the nonBillableInternalCount property.
     */
    public void setNonBillableInternalCount(@jakarta.annotation.Nullable final Integer value) {
        this.nonBillableInternalCount = value;
    }
    /**
     * Sets the pendingInvoiceCount property value. The pending invoice count for this usage summary.
     * @param value Value to set for the pendingInvoiceCount property.
     */
    public void setPendingInvoiceCount(@jakarta.annotation.Nullable final Integer value) {
        this.pendingInvoiceCount = value;
    }
    /**
     * Sets the periodEnd property value. The date and time for the period end value on this usage summary.
     * @param value Value to set for the periodEnd property.
     */
    public void setPeriodEnd(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.periodEnd = value;
    }
    /**
     * Sets the periodStart property value. The date and time for the period start value on this usage summary.
     * @param value Value to set for the periodStart property.
     */
    public void setPeriodStart(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.periodStart = value;
    }
    /**
     * Sets the providerCostTotal property value. The provider cost total for this usage summary.
     * @param value Value to set for the providerCostTotal property.
     */
    public void setProviderCostTotal(@jakarta.annotation.Nullable final Double value) {
        this.providerCostTotal = value;
    }
    /**
     * Sets the usageRecordCount property value. The usage record count for this usage summary.
     * @param value Value to set for the usageRecordCount property.
     */
    public void setUsageRecordCount(@jakarta.annotation.Nullable final Integer value) {
        this.usageRecordCount = value;
    }
}
