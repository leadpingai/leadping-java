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
 * API DTO containing usage ledger data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsageLedgerTableRow implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The billable seconds value for this usage ledger.
     */
    private UntypedNode billableSeconds;
    /**
     * The billable unit value for this usage ledger.
     */
    private BillableUnit billableUnit;
    /**
     * The business ID associated with this usage ledger.
     */
    private String businessId;
    /**
     * The business name value for this usage ledger.
     */
    private String businessName;
    /**
     * The channel value for this usage ledger.
     */
    private UsageChannel channel;
    /**
     * The correlation ID associated with this usage ledger.
     */
    private String correlationId;
    /**
     * The date and time for the created at value on this usage ledger.
     */
    private OffsetDateTime createdAt;
    /**
     * The monetary customer charge amount for this usage ledger.
     */
    private Double customerChargeAmount;
    /**
     * The human-readable description of this usage ledger.
     */
    private String description;
    /**
     * The duration seconds value for this usage ledger.
     */
    private UntypedNode durationSeconds;
    /**
     * The unique ID for this usage ledger.
     */
    private String id;
    /**
     * The idempotency key value for this usage ledger.
     */
    private String idempotencyKey;
    /**
     * The monetary internal cost amount for this usage ledger.
     */
    private UntypedNode internalCostAmount;
    /**
     * Whether this usage ledger is billable.
     */
    private Boolean isBillable;
    /**
     * Whether this usage ledger is internal.
     */
    private Boolean isInternal;
    /**
     * The lead ID associated with this usage ledger.
     */
    private String leadId;
    /**
     * The lead name value for this usage ledger.
     */
    private String leadName;
    /**
     * The phone number associated with this usage ledger.
     */
    private String phoneNumber;
    /**
     * The phone number ID associated with this usage ledger.
     */
    private String phoneNumberId;
    /**
     * The monetary provider cost amount for this usage ledger.
     */
    private UntypedNode providerCostAmount;
    /**
     * The quantity value for this usage ledger.
     */
    private Double quantity;
    /**
     * The SMS segments value for this usage ledger.
     */
    private UntypedNode smsSegments;
    /**
     * The source event ID associated with this usage ledger.
     */
    private String sourceEventId;
    /**
     * The current status for this usage ledger.
     */
    private UsageRecordStatus status;
    /**
     * The unit price value for this usage ledger.
     */
    private Double unitPrice;
    /**
     * The user ID associated with this usage ledger.
     */
    private String userId;
    /**
     * The user name value for this usage ledger.
     */
    private String userName;
    /**
     * Instantiates a new {@link UsageLedgerTableRow} and sets the default values.
     */
    public UsageLedgerTableRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UsageLedgerTableRow}
     */
    @jakarta.annotation.Nonnull
    public static UsageLedgerTableRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UsageLedgerTableRow();
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
     * Gets the billableSeconds property value. The billable seconds value for this usage ledger.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getBillableSeconds() {
        return this.billableSeconds;
    }
    /**
     * Gets the billableUnit property value. The billable unit value for this usage ledger.
     * @return a {@link BillableUnit}
     */
    @jakarta.annotation.Nullable
    public BillableUnit getBillableUnit() {
        return this.billableUnit;
    }
    /**
     * Gets the businessId property value. The business ID associated with this usage ledger.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the businessName property value. The business name value for this usage ledger.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessName() {
        return this.businessName;
    }
    /**
     * Gets the channel property value. The channel value for this usage ledger.
     * @return a {@link UsageChannel}
     */
    @jakarta.annotation.Nullable
    public UsageChannel getChannel() {
        return this.channel;
    }
    /**
     * Gets the correlationId property value. The correlation ID associated with this usage ledger.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * Gets the createdAt property value. The date and time for the created at value on this usage ledger.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the customerChargeAmount property value. The monetary customer charge amount for this usage ledger.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getCustomerChargeAmount() {
        return this.customerChargeAmount;
    }
    /**
     * Gets the description property value. The human-readable description of this usage ledger.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the durationSeconds property value. The duration seconds value for this usage ledger.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getDurationSeconds() {
        return this.durationSeconds;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(27);
        deserializerMap.put("billableSeconds", (n) -> { this.setBillableSeconds(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("billableUnit", (n) -> { this.setBillableUnit(n.getEnumValue(BillableUnit::forValue)); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("businessName", (n) -> { this.setBusinessName(n.getStringValue()); });
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getEnumValue(UsageChannel::forValue)); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customerChargeAmount", (n) -> { this.setCustomerChargeAmount(n.getDoubleValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("durationSeconds", (n) -> { this.setDurationSeconds(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("idempotencyKey", (n) -> { this.setIdempotencyKey(n.getStringValue()); });
        deserializerMap.put("internalCostAmount", (n) -> { this.setInternalCostAmount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("isBillable", (n) -> { this.setIsBillable(n.getBooleanValue()); });
        deserializerMap.put("isInternal", (n) -> { this.setIsInternal(n.getBooleanValue()); });
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("leadName", (n) -> { this.setLeadName(n.getStringValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("phoneNumberId", (n) -> { this.setPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("providerCostAmount", (n) -> { this.setProviderCostAmount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("quantity", (n) -> { this.setQuantity(n.getDoubleValue()); });
        deserializerMap.put("smsSegments", (n) -> { this.setSmsSegments(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceEventId", (n) -> { this.setSourceEventId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(UsageRecordStatus::forValue)); });
        deserializerMap.put("unitPrice", (n) -> { this.setUnitPrice(n.getDoubleValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique ID for this usage ledger.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the idempotencyKey property value. The idempotency key value for this usage ledger.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdempotencyKey() {
        return this.idempotencyKey;
    }
    /**
     * Gets the internalCostAmount property value. The monetary internal cost amount for this usage ledger.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getInternalCostAmount() {
        return this.internalCostAmount;
    }
    /**
     * Gets the isBillable property value. Whether this usage ledger is billable.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBillable() {
        return this.isBillable;
    }
    /**
     * Gets the isInternal property value. Whether this usage ledger is internal.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInternal() {
        return this.isInternal;
    }
    /**
     * Gets the leadId property value. The lead ID associated with this usage ledger.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the leadName property value. The lead name value for this usage ledger.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadName() {
        return this.leadName;
    }
    /**
     * Gets the phoneNumber property value. The phone number associated with this usage ledger.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the phoneNumberId property value. The phone number ID associated with this usage ledger.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }
    /**
     * Gets the providerCostAmount property value. The monetary provider cost amount for this usage ledger.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getProviderCostAmount() {
        return this.providerCostAmount;
    }
    /**
     * Gets the quantity property value. The quantity value for this usage ledger.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getQuantity() {
        return this.quantity;
    }
    /**
     * Gets the smsSegments property value. The SMS segments value for this usage ledger.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getSmsSegments() {
        return this.smsSegments;
    }
    /**
     * Gets the sourceEventId property value. The source event ID associated with this usage ledger.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceEventId() {
        return this.sourceEventId;
    }
    /**
     * Gets the status property value. The current status for this usage ledger.
     * @return a {@link UsageRecordStatus}
     */
    @jakarta.annotation.Nullable
    public UsageRecordStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the unitPrice property value. The unit price value for this usage ledger.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getUnitPrice() {
        return this.unitPrice;
    }
    /**
     * Gets the userId property value. The user ID associated with this usage ledger.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userName property value. The user name value for this usage ledger.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("billableSeconds", this.getBillableSeconds());
        writer.writeEnumValue("billableUnit", this.getBillableUnit());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeStringValue("businessName", this.getBusinessName());
        writer.writeEnumValue("channel", this.getChannel());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeDoubleValue("customerChargeAmount", this.getCustomerChargeAmount());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("durationSeconds", this.getDurationSeconds());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("idempotencyKey", this.getIdempotencyKey());
        writer.writeObjectValue("internalCostAmount", this.getInternalCostAmount());
        writer.writeBooleanValue("isBillable", this.getIsBillable());
        writer.writeBooleanValue("isInternal", this.getIsInternal());
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeStringValue("leadName", this.getLeadName());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeStringValue("phoneNumberId", this.getPhoneNumberId());
        writer.writeObjectValue("providerCostAmount", this.getProviderCostAmount());
        writer.writeDoubleValue("quantity", this.getQuantity());
        writer.writeObjectValue("smsSegments", this.getSmsSegments());
        writer.writeStringValue("sourceEventId", this.getSourceEventId());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeDoubleValue("unitPrice", this.getUnitPrice());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userName", this.getUserName());
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
     * Sets the billableSeconds property value. The billable seconds value for this usage ledger.
     * @param value Value to set for the billableSeconds property.
     */
    public void setBillableSeconds(@jakarta.annotation.Nullable final UntypedNode value) {
        this.billableSeconds = value;
    }
    /**
     * Sets the billableUnit property value. The billable unit value for this usage ledger.
     * @param value Value to set for the billableUnit property.
     */
    public void setBillableUnit(@jakarta.annotation.Nullable final BillableUnit value) {
        this.billableUnit = value;
    }
    /**
     * Sets the businessId property value. The business ID associated with this usage ledger.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the businessName property value. The business name value for this usage ledger.
     * @param value Value to set for the businessName property.
     */
    public void setBusinessName(@jakarta.annotation.Nullable final String value) {
        this.businessName = value;
    }
    /**
     * Sets the channel property value. The channel value for this usage ledger.
     * @param value Value to set for the channel property.
     */
    public void setChannel(@jakarta.annotation.Nullable final UsageChannel value) {
        this.channel = value;
    }
    /**
     * Sets the correlationId property value. The correlation ID associated with this usage ledger.
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.correlationId = value;
    }
    /**
     * Sets the createdAt property value. The date and time for the created at value on this usage ledger.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the customerChargeAmount property value. The monetary customer charge amount for this usage ledger.
     * @param value Value to set for the customerChargeAmount property.
     */
    public void setCustomerChargeAmount(@jakarta.annotation.Nullable final Double value) {
        this.customerChargeAmount = value;
    }
    /**
     * Sets the description property value. The human-readable description of this usage ledger.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the durationSeconds property value. The duration seconds value for this usage ledger.
     * @param value Value to set for the durationSeconds property.
     */
    public void setDurationSeconds(@jakarta.annotation.Nullable final UntypedNode value) {
        this.durationSeconds = value;
    }
    /**
     * Sets the id property value. The unique ID for this usage ledger.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the idempotencyKey property value. The idempotency key value for this usage ledger.
     * @param value Value to set for the idempotencyKey property.
     */
    public void setIdempotencyKey(@jakarta.annotation.Nullable final String value) {
        this.idempotencyKey = value;
    }
    /**
     * Sets the internalCostAmount property value. The monetary internal cost amount for this usage ledger.
     * @param value Value to set for the internalCostAmount property.
     */
    public void setInternalCostAmount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.internalCostAmount = value;
    }
    /**
     * Sets the isBillable property value. Whether this usage ledger is billable.
     * @param value Value to set for the isBillable property.
     */
    public void setIsBillable(@jakarta.annotation.Nullable final Boolean value) {
        this.isBillable = value;
    }
    /**
     * Sets the isInternal property value. Whether this usage ledger is internal.
     * @param value Value to set for the isInternal property.
     */
    public void setIsInternal(@jakarta.annotation.Nullable final Boolean value) {
        this.isInternal = value;
    }
    /**
     * Sets the leadId property value. The lead ID associated with this usage ledger.
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the leadName property value. The lead name value for this usage ledger.
     * @param value Value to set for the leadName property.
     */
    public void setLeadName(@jakarta.annotation.Nullable final String value) {
        this.leadName = value;
    }
    /**
     * Sets the phoneNumber property value. The phone number associated with this usage ledger.
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the phoneNumberId property value. The phone number ID associated with this usage ledger.
     * @param value Value to set for the phoneNumberId property.
     */
    public void setPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.phoneNumberId = value;
    }
    /**
     * Sets the providerCostAmount property value. The monetary provider cost amount for this usage ledger.
     * @param value Value to set for the providerCostAmount property.
     */
    public void setProviderCostAmount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.providerCostAmount = value;
    }
    /**
     * Sets the quantity property value. The quantity value for this usage ledger.
     * @param value Value to set for the quantity property.
     */
    public void setQuantity(@jakarta.annotation.Nullable final Double value) {
        this.quantity = value;
    }
    /**
     * Sets the smsSegments property value. The SMS segments value for this usage ledger.
     * @param value Value to set for the smsSegments property.
     */
    public void setSmsSegments(@jakarta.annotation.Nullable final UntypedNode value) {
        this.smsSegments = value;
    }
    /**
     * Sets the sourceEventId property value. The source event ID associated with this usage ledger.
     * @param value Value to set for the sourceEventId property.
     */
    public void setSourceEventId(@jakarta.annotation.Nullable final String value) {
        this.sourceEventId = value;
    }
    /**
     * Sets the status property value. The current status for this usage ledger.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final UsageRecordStatus value) {
        this.status = value;
    }
    /**
     * Sets the unitPrice property value. The unit price value for this usage ledger.
     * @param value Value to set for the unitPrice property.
     */
    public void setUnitPrice(@jakarta.annotation.Nullable final Double value) {
        this.unitPrice = value;
    }
    /**
     * Sets the userId property value. The user ID associated with this usage ledger.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userName property value. The user name value for this usage ledger.
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.userName = value;
    }
}
