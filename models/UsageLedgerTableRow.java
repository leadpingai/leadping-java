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
     * The ID and name for this business.
     */
    private UsageLedgerTableRowBusiness business;
    /**
     * The channel value for this usage ledger.
     */
    private UsageChannel channel;
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
     * Whether this usage ledger is billable.
     */
    private Boolean isBillable;
    /**
     * The ID and name for this lead.
     */
    private UsageLedgerTableRowLead lead;
    /**
     * The phone number associated with this usage ledger.
     */
    private String phoneNumber;
    /**
     * The phone number ID associated with this usage ledger.
     */
    private String phoneNumberId;
    /**
     * The quantity value for this usage ledger.
     */
    private Double quantity;
    /**
     * The SMS segments value for this usage ledger.
     */
    private UntypedNode smsSegments;
    /**
     * The current status for this usage ledger.
     */
    private UsageRecordStatus status;
    /**
     * The unit price value for this usage ledger.
     */
    private Double unitPrice;
    /**
     * The ID and name for this user.
     */
    private UsageLedgerTableRowUser user;
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
     * Gets the business property value. The ID and name for this business.
     * @return a {@link UsageLedgerTableRowBusiness}
     */
    @jakarta.annotation.Nullable
    public UsageLedgerTableRowBusiness getBusiness() {
        return this.business;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("billableSeconds", (n) -> { this.setBillableSeconds(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("billableUnit", (n) -> { this.setBillableUnit(n.getEnumValue(BillableUnit::forValue)); });
        deserializerMap.put("business", (n) -> { this.setBusiness(n.getObjectValue(UsageLedgerTableRowBusiness::createFromDiscriminatorValue)); });
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getEnumValue(UsageChannel::forValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customerChargeAmount", (n) -> { this.setCustomerChargeAmount(n.getDoubleValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("durationSeconds", (n) -> { this.setDurationSeconds(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isBillable", (n) -> { this.setIsBillable(n.getBooleanValue()); });
        deserializerMap.put("lead", (n) -> { this.setLead(n.getObjectValue(UsageLedgerTableRowLead::createFromDiscriminatorValue)); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("phoneNumberId", (n) -> { this.setPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("quantity", (n) -> { this.setQuantity(n.getDoubleValue()); });
        deserializerMap.put("smsSegments", (n) -> { this.setSmsSegments(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(UsageRecordStatus::forValue)); });
        deserializerMap.put("unitPrice", (n) -> { this.setUnitPrice(n.getDoubleValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(UsageLedgerTableRowUser::createFromDiscriminatorValue)); });
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
     * Gets the isBillable property value. Whether this usage ledger is billable.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBillable() {
        return this.isBillable;
    }
    /**
     * Gets the lead property value. The ID and name for this lead.
     * @return a {@link UsageLedgerTableRowLead}
     */
    @jakarta.annotation.Nullable
    public UsageLedgerTableRowLead getLead() {
        return this.lead;
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
     * Gets the user property value. The ID and name for this user.
     * @return a {@link UsageLedgerTableRowUser}
     */
    @jakarta.annotation.Nullable
    public UsageLedgerTableRowUser getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("billableSeconds", this.getBillableSeconds());
        writer.writeEnumValue("billableUnit", this.getBillableUnit());
        writer.writeObjectValue("business", this.getBusiness());
        writer.writeEnumValue("channel", this.getChannel());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeDoubleValue("customerChargeAmount", this.getCustomerChargeAmount());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("durationSeconds", this.getDurationSeconds());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isBillable", this.getIsBillable());
        writer.writeObjectValue("lead", this.getLead());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeStringValue("phoneNumberId", this.getPhoneNumberId());
        writer.writeDoubleValue("quantity", this.getQuantity());
        writer.writeObjectValue("smsSegments", this.getSmsSegments());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeDoubleValue("unitPrice", this.getUnitPrice());
        writer.writeObjectValue("user", this.getUser());
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
     * Sets the business property value. The ID and name for this business.
     * @param value Value to set for the business property.
     */
    public void setBusiness(@jakarta.annotation.Nullable final UsageLedgerTableRowBusiness value) {
        this.business = value;
    }
    /**
     * Sets the channel property value. The channel value for this usage ledger.
     * @param value Value to set for the channel property.
     */
    public void setChannel(@jakarta.annotation.Nullable final UsageChannel value) {
        this.channel = value;
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
     * Sets the isBillable property value. Whether this usage ledger is billable.
     * @param value Value to set for the isBillable property.
     */
    public void setIsBillable(@jakarta.annotation.Nullable final Boolean value) {
        this.isBillable = value;
    }
    /**
     * Sets the lead property value. The ID and name for this lead.
     * @param value Value to set for the lead property.
     */
    public void setLead(@jakarta.annotation.Nullable final UsageLedgerTableRowLead value) {
        this.lead = value;
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
     * Sets the user property value. The ID and name for this user.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final UsageLedgerTableRowUser value) {
        this.user = value;
    }
}
