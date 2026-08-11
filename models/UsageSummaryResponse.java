package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Describes usage summary response data used by Leadping.
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
    private UntypedNode billableQuantityTotal;
    /**
     * The named usage counters included with this usage summary.
     */
    private java.util.List<UsageCounterLine> counters;
    /**
     * The customer charge total for this usage summary.
     */
    private UntypedNode customerChargeTotal;
    /**
     * The failed count for this usage summary.
     */
    private UntypedNode failedCount;
    /**
     * The lines included with this usage summary.
     */
    private java.util.List<UsageSummaryLine> lines;
    /**
     * The pending invoice count for this usage summary.
     */
    private UntypedNode pendingInvoiceCount;
    /**
     * UTC timestamp for period end on this usage summary.
     */
    private OffsetDateTime periodEnd;
    /**
     * UTC timestamp for period start on this usage summary.
     */
    private OffsetDateTime periodStart;
    /**
     * The usage record count for this usage summary.
     */
    private UntypedNode transactionCount;
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
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getBillableQuantityTotal() {
        return this.billableQuantityTotal;
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
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCustomerChargeTotal() {
        return this.customerChargeTotal;
    }
    /**
     * Gets the failedCount property value. The failed count for this usage summary.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getFailedCount() {
        return this.failedCount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("billableQuantityTotal", (n) -> { this.setBillableQuantityTotal(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("counters", (n) -> { this.setCounters(n.getCollectionOfObjectValues(UsageCounterLine::createFromDiscriminatorValue)); });
        deserializerMap.put("customerChargeTotal", (n) -> { this.setCustomerChargeTotal(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("failedCount", (n) -> { this.setFailedCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("lines", (n) -> { this.setLines(n.getCollectionOfObjectValues(UsageSummaryLine::createFromDiscriminatorValue)); });
        deserializerMap.put("pendingInvoiceCount", (n) -> { this.setPendingInvoiceCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("periodEnd", (n) -> { this.setPeriodEnd(n.getOffsetDateTimeValue()); });
        deserializerMap.put("periodStart", (n) -> { this.setPeriodStart(n.getOffsetDateTimeValue()); });
        deserializerMap.put("transactionCount", (n) -> { this.setTransactionCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the pendingInvoiceCount property value. The pending invoice count for this usage summary.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getPendingInvoiceCount() {
        return this.pendingInvoiceCount;
    }
    /**
     * Gets the periodEnd property value. UTC timestamp for period end on this usage summary.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPeriodEnd() {
        return this.periodEnd;
    }
    /**
     * Gets the periodStart property value. UTC timestamp for period start on this usage summary.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPeriodStart() {
        return this.periodStart;
    }
    /**
     * Gets the transactionCount property value. The usage record count for this usage summary.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getTransactionCount() {
        return this.transactionCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("billableQuantityTotal", this.getBillableQuantityTotal());
        writer.writeCollectionOfObjectValues("counters", this.getCounters());
        writer.writeObjectValue("customerChargeTotal", this.getCustomerChargeTotal());
        writer.writeObjectValue("failedCount", this.getFailedCount());
        writer.writeCollectionOfObjectValues("lines", this.getLines());
        writer.writeObjectValue("pendingInvoiceCount", this.getPendingInvoiceCount());
        writer.writeOffsetDateTimeValue("periodEnd", this.getPeriodEnd());
        writer.writeOffsetDateTimeValue("periodStart", this.getPeriodStart());
        writer.writeObjectValue("transactionCount", this.getTransactionCount());
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
    public void setBillableQuantityTotal(@jakarta.annotation.Nullable final UntypedNode value) {
        this.billableQuantityTotal = value;
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
    public void setCustomerChargeTotal(@jakarta.annotation.Nullable final UntypedNode value) {
        this.customerChargeTotal = value;
    }
    /**
     * Sets the failedCount property value. The failed count for this usage summary.
     * @param value Value to set for the failedCount property.
     */
    public void setFailedCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.failedCount = value;
    }
    /**
     * Sets the lines property value. The lines included with this usage summary.
     * @param value Value to set for the lines property.
     */
    public void setLines(@jakarta.annotation.Nullable final java.util.List<UsageSummaryLine> value) {
        this.lines = value;
    }
    /**
     * Sets the pendingInvoiceCount property value. The pending invoice count for this usage summary.
     * @param value Value to set for the pendingInvoiceCount property.
     */
    public void setPendingInvoiceCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.pendingInvoiceCount = value;
    }
    /**
     * Sets the periodEnd property value. UTC timestamp for period end on this usage summary.
     * @param value Value to set for the periodEnd property.
     */
    public void setPeriodEnd(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.periodEnd = value;
    }
    /**
     * Sets the periodStart property value. UTC timestamp for period start on this usage summary.
     * @param value Value to set for the periodStart property.
     */
    public void setPeriodStart(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.periodStart = value;
    }
    /**
     * Sets the transactionCount property value. The usage record count for this usage summary.
     * @param value Value to set for the transactionCount property.
     */
    public void setTransactionCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.transactionCount = value;
    }
}
