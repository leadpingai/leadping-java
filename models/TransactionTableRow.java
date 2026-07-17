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
 * List item schema for Leadping API billing transaction table row results shown in searchable tables.
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
     * The ID and name for this business.
     */
    private TransactionTableRowBusiness business;
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
     * The ID and name for this lead.
     */
    private TransactionTableRowLead lead;
    /**
     * Net monetary amount after fees, credits, or adjustments.
     */
    private Double netAmount;
    /**
     * Masked or human-readable payment method shown for this transaction.
     */
    private String paymentMethodDisplay;
    /**
     * Processing status for this wallet transaction.
     */
    private TransactionStatus transactionStatus;
    /**
     * Debit or credit classification for this wallet transaction.
     */
    private TransactionType transactionType;
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
     * Gets the business property value. The ID and name for this business.
     * @return a {@link TransactionTableRowBusiness}
     */
    @jakarta.annotation.Nullable
    public TransactionTableRowBusiness getBusiness() {
        return this.business;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getDoubleValue()); });
        deserializerMap.put("business", (n) -> { this.setBusiness(n.getObjectValue(TransactionTableRowBusiness::createFromDiscriminatorValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("lead", (n) -> { this.setLead(n.getObjectValue(TransactionTableRowLead::createFromDiscriminatorValue)); });
        deserializerMap.put("netAmount", (n) -> { this.setNetAmount(n.getDoubleValue()); });
        deserializerMap.put("paymentMethodDisplay", (n) -> { this.setPaymentMethodDisplay(n.getStringValue()); });
        deserializerMap.put("transactionStatus", (n) -> { this.setTransactionStatus(n.getEnumValue(TransactionStatus::forValue)); });
        deserializerMap.put("transactionType", (n) -> { this.setTransactionType(n.getEnumValue(TransactionType::forValue)); });
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
     * Gets the lead property value. The ID and name for this lead.
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
     * Gets the paymentMethodDisplay property value. Masked or human-readable payment method shown for this transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPaymentMethodDisplay() {
        return this.paymentMethodDisplay;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("amount", this.getAmount());
        writer.writeObjectValue("business", this.getBusiness());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("lead", this.getLead());
        writer.writeDoubleValue("netAmount", this.getNetAmount());
        writer.writeStringValue("paymentMethodDisplay", this.getPaymentMethodDisplay());
        writer.writeEnumValue("transactionStatus", this.getTransactionStatus());
        writer.writeEnumValue("transactionType", this.getTransactionType());
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
     * Sets the business property value. The ID and name for this business.
     * @param value Value to set for the business property.
     */
    public void setBusiness(@jakarta.annotation.Nullable final TransactionTableRowBusiness value) {
        this.business = value;
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
     * Sets the lead property value. The ID and name for this lead.
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
     * Sets the paymentMethodDisplay property value. Masked or human-readable payment method shown for this transaction.
     * @param value Value to set for the paymentMethodDisplay property.
     */
    public void setPaymentMethodDisplay(@jakarta.annotation.Nullable final String value) {
        this.paymentMethodDisplay = value;
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
}
