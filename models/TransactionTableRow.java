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
 * Summarizes billing transaction data in paginated and searchable results.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TransactionTableRow implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Monetary amount for this billing transaction or wallet operation.
     */
    private Double amount;
    /**
     * Defines the supported Billable Unit values.
     */
    private TransactionTableRowBillableUnit billableUnit;
    /**
     * Customer-facing amount billed for the metered usage or wallet transaction.
     */
    private Double billedAmount;
    /**
     * Defines the supported Usage Channel values.
     */
    private TransactionTableRowBillingChannel billingChannel;
    /**
     * UTC timestamp when this billing transaction table row was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Human-readable description that explains this billing transaction table row to API users.
     */
    private String description;
    /**
     * Unique Leadping identifier for this billing transaction table row.
     */
    private String id;
    /**
     * Identifier and display name of the related lead.
     */
    private TransactionTableRowLead lead;
    /**
     * Net monetary amount after fees, credits, or adjustments.
     */
    private Double netAmount;
    /**
     * Identifier and display name of the related organization.
     */
    private TransactionTableRowOrganization organization;
    /**
     * Masked or human-readable payment method shown for this transaction.
     */
    private String paymentMethodDisplay;
    /**
     * Version of the pricing rules used to calculate the billed amount.
     */
    private String pricingVersion;
    /**
     * Number of billable units measured for this transaction, when usage-based pricing applies.
     */
    private Double quantity;
    /**
     * Identifier of the event that created this billing transaction, when available.
     */
    private String sourceEventId;
    /**
     * Event type that created this billing transaction, when available.
     */
    private String sourceEventType;
    /**
     * Processing status for this wallet transaction.
     */
    private TransactionStatus transactionStatus;
    /**
     * Debit or credit classification for this wallet transaction.
     */
    private TransactionType transactionType;
    /**
     * Price charged per billable unit when usage-based pricing applies.
     */
    private Double unitPrice;
    /**
     * Instantiates a new {@link TransactionTableRow} and sets the default values.
     */
    public TransactionTableRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TransactionTableRow}
     */
    @jakarta.annotation.Nonnull
    public static TransactionTableRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TransactionTableRow();
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
     * Gets the amount property value. Monetary amount for this billing transaction or wallet operation.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAmount() {
        return this.amount;
    }
    /**
     * Gets the billableUnit property value. Defines the supported Billable Unit values.
     * @return a {@link TransactionTableRowBillableUnit}
     */
    @jakarta.annotation.Nullable
    public TransactionTableRowBillableUnit getBillableUnit() {
        return this.billableUnit;
    }
    /**
     * Gets the billedAmount property value. Customer-facing amount billed for the metered usage or wallet transaction.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getBilledAmount() {
        return this.billedAmount;
    }
    /**
     * Gets the billingChannel property value. Defines the supported Usage Channel values.
     * @return a {@link TransactionTableRowBillingChannel}
     */
    @jakarta.annotation.Nullable
    public TransactionTableRowBillingChannel getBillingChannel() {
        return this.billingChannel;
    }
    /**
     * Gets the createdAt property value. UTC timestamp when this billing transaction table row was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the description property value. Human-readable description that explains this billing transaction table row to API users.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getDoubleValue()); });
        deserializerMap.put("billableUnit", (n) -> { this.setBillableUnit(n.getEnumValue(TransactionTableRowBillableUnit::forValue)); });
        deserializerMap.put("billedAmount", (n) -> { this.setBilledAmount(n.getDoubleValue()); });
        deserializerMap.put("billingChannel", (n) -> { this.setBillingChannel(n.getEnumValue(TransactionTableRowBillingChannel::forValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("lead", (n) -> { this.setLead(n.getObjectValue(TransactionTableRowLead::createFromDiscriminatorValue)); });
        deserializerMap.put("netAmount", (n) -> { this.setNetAmount(n.getDoubleValue()); });
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getObjectValue(TransactionTableRowOrganization::createFromDiscriminatorValue)); });
        deserializerMap.put("paymentMethodDisplay", (n) -> { this.setPaymentMethodDisplay(n.getStringValue()); });
        deserializerMap.put("pricingVersion", (n) -> { this.setPricingVersion(n.getStringValue()); });
        deserializerMap.put("quantity", (n) -> { this.setQuantity(n.getDoubleValue()); });
        deserializerMap.put("sourceEventId", (n) -> { this.setSourceEventId(n.getStringValue()); });
        deserializerMap.put("sourceEventType", (n) -> { this.setSourceEventType(n.getStringValue()); });
        deserializerMap.put("transactionStatus", (n) -> { this.setTransactionStatus(n.getEnumValue(TransactionStatus::forValue)); });
        deserializerMap.put("transactionType", (n) -> { this.setTransactionType(n.getEnumValue(TransactionType::forValue)); });
        deserializerMap.put("unitPrice", (n) -> { this.setUnitPrice(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this billing transaction table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the lead property value. Identifier and display name of the related lead.
     * @return a {@link TransactionTableRowLead}
     */
    @jakarta.annotation.Nullable
    public TransactionTableRowLead getLead() {
        return this.lead;
    }
    /**
     * Gets the netAmount property value. Net monetary amount after fees, credits, or adjustments.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getNetAmount() {
        return this.netAmount;
    }
    /**
     * Gets the organization property value. Identifier and display name of the related organization.
     * @return a {@link TransactionTableRowOrganization}
     */
    @jakarta.annotation.Nullable
    public TransactionTableRowOrganization getOrganization() {
        return this.organization;
    }
    /**
     * Gets the paymentMethodDisplay property value. Masked or human-readable payment method shown for this transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentMethodDisplay() {
        return this.paymentMethodDisplay;
    }
    /**
     * Gets the pricingVersion property value. Version of the pricing rules used to calculate the billed amount.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPricingVersion() {
        return this.pricingVersion;
    }
    /**
     * Gets the quantity property value. Number of billable units measured for this transaction, when usage-based pricing applies.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getQuantity() {
        return this.quantity;
    }
    /**
     * Gets the sourceEventId property value. Identifier of the event that created this billing transaction, when available.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceEventId() {
        return this.sourceEventId;
    }
    /**
     * Gets the sourceEventType property value. Event type that created this billing transaction, when available.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceEventType() {
        return this.sourceEventType;
    }
    /**
     * Gets the transactionStatus property value. Processing status for this wallet transaction.
     * @return a {@link TransactionStatus}
     */
    @jakarta.annotation.Nullable
    public TransactionStatus getTransactionStatus() {
        return this.transactionStatus;
    }
    /**
     * Gets the transactionType property value. Debit or credit classification for this wallet transaction.
     * @return a {@link TransactionType}
     */
    @jakarta.annotation.Nullable
    public TransactionType getTransactionType() {
        return this.transactionType;
    }
    /**
     * Gets the unitPrice property value. Price charged per billable unit when usage-based pricing applies.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getUnitPrice() {
        return this.unitPrice;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("amount", this.getAmount());
        writer.writeEnumValue("billableUnit", this.getBillableUnit());
        writer.writeDoubleValue("billedAmount", this.getBilledAmount());
        writer.writeEnumValue("billingChannel", this.getBillingChannel());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("lead", this.getLead());
        writer.writeDoubleValue("netAmount", this.getNetAmount());
        writer.writeObjectValue("organization", this.getOrganization());
        writer.writeStringValue("paymentMethodDisplay", this.getPaymentMethodDisplay());
        writer.writeStringValue("pricingVersion", this.getPricingVersion());
        writer.writeDoubleValue("quantity", this.getQuantity());
        writer.writeStringValue("sourceEventId", this.getSourceEventId());
        writer.writeStringValue("sourceEventType", this.getSourceEventType());
        writer.writeEnumValue("transactionStatus", this.getTransactionStatus());
        writer.writeEnumValue("transactionType", this.getTransactionType());
        writer.writeDoubleValue("unitPrice", this.getUnitPrice());
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
     * Sets the amount property value. Monetary amount for this billing transaction or wallet operation.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Double value) {
        this.amount = value;
    }
    /**
     * Sets the billableUnit property value. Defines the supported Billable Unit values.
     * @param value Value to set for the billableUnit property.
     */
    public void setBillableUnit(@jakarta.annotation.Nullable final TransactionTableRowBillableUnit value) {
        this.billableUnit = value;
    }
    /**
     * Sets the billedAmount property value. Customer-facing amount billed for the metered usage or wallet transaction.
     * @param value Value to set for the billedAmount property.
     */
    public void setBilledAmount(@jakarta.annotation.Nullable final Double value) {
        this.billedAmount = value;
    }
    /**
     * Sets the billingChannel property value. Defines the supported Usage Channel values.
     * @param value Value to set for the billingChannel property.
     */
    public void setBillingChannel(@jakarta.annotation.Nullable final TransactionTableRowBillingChannel value) {
        this.billingChannel = value;
    }
    /**
     * Sets the createdAt property value. UTC timestamp when this billing transaction table row was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the description property value. Human-readable description that explains this billing transaction table row to API users.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this billing transaction table row.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the lead property value. Identifier and display name of the related lead.
     * @param value Value to set for the lead property.
     */
    public void setLead(@jakarta.annotation.Nullable final TransactionTableRowLead value) {
        this.lead = value;
    }
    /**
     * Sets the netAmount property value. Net monetary amount after fees, credits, or adjustments.
     * @param value Value to set for the netAmount property.
     */
    public void setNetAmount(@jakarta.annotation.Nullable final Double value) {
        this.netAmount = value;
    }
    /**
     * Sets the organization property value. Identifier and display name of the related organization.
     * @param value Value to set for the organization property.
     */
    public void setOrganization(@jakarta.annotation.Nullable final TransactionTableRowOrganization value) {
        this.organization = value;
    }
    /**
     * Sets the paymentMethodDisplay property value. Masked or human-readable payment method shown for this transaction.
     * @param value Value to set for the paymentMethodDisplay property.
     */
    public void setPaymentMethodDisplay(@jakarta.annotation.Nullable final String value) {
        this.paymentMethodDisplay = value;
    }
    /**
     * Sets the pricingVersion property value. Version of the pricing rules used to calculate the billed amount.
     * @param value Value to set for the pricingVersion property.
     */
    public void setPricingVersion(@jakarta.annotation.Nullable final String value) {
        this.pricingVersion = value;
    }
    /**
     * Sets the quantity property value. Number of billable units measured for this transaction, when usage-based pricing applies.
     * @param value Value to set for the quantity property.
     */
    public void setQuantity(@jakarta.annotation.Nullable final Double value) {
        this.quantity = value;
    }
    /**
     * Sets the sourceEventId property value. Identifier of the event that created this billing transaction, when available.
     * @param value Value to set for the sourceEventId property.
     */
    public void setSourceEventId(@jakarta.annotation.Nullable final String value) {
        this.sourceEventId = value;
    }
    /**
     * Sets the sourceEventType property value. Event type that created this billing transaction, when available.
     * @param value Value to set for the sourceEventType property.
     */
    public void setSourceEventType(@jakarta.annotation.Nullable final String value) {
        this.sourceEventType = value;
    }
    /**
     * Sets the transactionStatus property value. Processing status for this wallet transaction.
     * @param value Value to set for the transactionStatus property.
     */
    public void setTransactionStatus(@jakarta.annotation.Nullable final TransactionStatus value) {
        this.transactionStatus = value;
    }
    /**
     * Sets the transactionType property value. Debit or credit classification for this wallet transaction.
     * @param value Value to set for the transactionType property.
     */
    public void setTransactionType(@jakarta.annotation.Nullable final TransactionType value) {
        this.transactionType = value;
    }
    /**
     * Sets the unitPrice property value. Price charged per billable unit when usage-based pricing applies.
     * @param value Value to set for the unitPrice property.
     */
    public void setUnitPrice(@jakarta.annotation.Nullable final Double value) {
        this.unitPrice = value;
    }
}
