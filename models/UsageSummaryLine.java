package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * API DTO containing usage summary line data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsageSummaryLine implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The billable unit value for this usage summary line.
     */
    private BillableUnit billableUnit;
    /**
     * The channel value for this usage summary line.
     */
    private UsageChannel channel;
    /**
     * The monetary customer charge amount for this usage summary line.
     */
    private Double customerChargeAmount;
    /**
     * The monetary internal cost amount for this usage summary line.
     */
    private Double internalCostAmount;
    /**
     * The monetary provider cost amount for this usage summary line.
     */
    private Double providerCostAmount;
    /**
     * The quantity value for this usage summary line.
     */
    private Double quantity;
    /**
     * The record count for this usage summary line.
     */
    private Integer recordCount;
    /**
     * The current status for this usage summary line.
     */
    private UsageRecordStatus status;
    /**
     * Instantiates a new {@link UsageSummaryLine} and sets the default values.
     */
    public UsageSummaryLine() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UsageSummaryLine}
     */
    @jakarta.annotation.Nonnull
    public static UsageSummaryLine createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UsageSummaryLine();
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
     * Gets the billableUnit property value. The billable unit value for this usage summary line.
     * @return a {@link BillableUnit}
     */
    @jakarta.annotation.Nullable
    public BillableUnit getBillableUnit() {
        return this.billableUnit;
    }
    /**
     * Gets the channel property value. The channel value for this usage summary line.
     * @return a {@link UsageChannel}
     */
    @jakarta.annotation.Nullable
    public UsageChannel getChannel() {
        return this.channel;
    }
    /**
     * Gets the customerChargeAmount property value. The monetary customer charge amount for this usage summary line.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getCustomerChargeAmount() {
        return this.customerChargeAmount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("billableUnit", (n) -> { this.setBillableUnit(n.getEnumValue(BillableUnit::forValue)); });
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getEnumValue(UsageChannel::forValue)); });
        deserializerMap.put("customerChargeAmount", (n) -> { this.setCustomerChargeAmount(n.getDoubleValue()); });
        deserializerMap.put("internalCostAmount", (n) -> { this.setInternalCostAmount(n.getDoubleValue()); });
        deserializerMap.put("providerCostAmount", (n) -> { this.setProviderCostAmount(n.getDoubleValue()); });
        deserializerMap.put("quantity", (n) -> { this.setQuantity(n.getDoubleValue()); });
        deserializerMap.put("recordCount", (n) -> { this.setRecordCount(n.getIntegerValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(UsageRecordStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the internalCostAmount property value. The monetary internal cost amount for this usage summary line.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getInternalCostAmount() {
        return this.internalCostAmount;
    }
    /**
     * Gets the providerCostAmount property value. The monetary provider cost amount for this usage summary line.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getProviderCostAmount() {
        return this.providerCostAmount;
    }
    /**
     * Gets the quantity property value. The quantity value for this usage summary line.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getQuantity() {
        return this.quantity;
    }
    /**
     * Gets the recordCount property value. The record count for this usage summary line.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRecordCount() {
        return this.recordCount;
    }
    /**
     * Gets the status property value. The current status for this usage summary line.
     * @return a {@link UsageRecordStatus}
     */
    @jakarta.annotation.Nullable
    public UsageRecordStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("billableUnit", this.getBillableUnit());
        writer.writeEnumValue("channel", this.getChannel());
        writer.writeDoubleValue("customerChargeAmount", this.getCustomerChargeAmount());
        writer.writeDoubleValue("internalCostAmount", this.getInternalCostAmount());
        writer.writeDoubleValue("providerCostAmount", this.getProviderCostAmount());
        writer.writeDoubleValue("quantity", this.getQuantity());
        writer.writeIntegerValue("recordCount", this.getRecordCount());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the billableUnit property value. The billable unit value for this usage summary line.
     * @param value Value to set for the billableUnit property.
     */
    public void setBillableUnit(@jakarta.annotation.Nullable final BillableUnit value) {
        this.billableUnit = value;
    }
    /**
     * Sets the channel property value. The channel value for this usage summary line.
     * @param value Value to set for the channel property.
     */
    public void setChannel(@jakarta.annotation.Nullable final UsageChannel value) {
        this.channel = value;
    }
    /**
     * Sets the customerChargeAmount property value. The monetary customer charge amount for this usage summary line.
     * @param value Value to set for the customerChargeAmount property.
     */
    public void setCustomerChargeAmount(@jakarta.annotation.Nullable final Double value) {
        this.customerChargeAmount = value;
    }
    /**
     * Sets the internalCostAmount property value. The monetary internal cost amount for this usage summary line.
     * @param value Value to set for the internalCostAmount property.
     */
    public void setInternalCostAmount(@jakarta.annotation.Nullable final Double value) {
        this.internalCostAmount = value;
    }
    /**
     * Sets the providerCostAmount property value. The monetary provider cost amount for this usage summary line.
     * @param value Value to set for the providerCostAmount property.
     */
    public void setProviderCostAmount(@jakarta.annotation.Nullable final Double value) {
        this.providerCostAmount = value;
    }
    /**
     * Sets the quantity property value. The quantity value for this usage summary line.
     * @param value Value to set for the quantity property.
     */
    public void setQuantity(@jakarta.annotation.Nullable final Double value) {
        this.quantity = value;
    }
    /**
     * Sets the recordCount property value. The record count for this usage summary line.
     * @param value Value to set for the recordCount property.
     */
    public void setRecordCount(@jakarta.annotation.Nullable final Integer value) {
        this.recordCount = value;
    }
    /**
     * Sets the status property value. The current status for this usage summary line.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final UsageRecordStatus value) {
        this.status = value;
    }
}
