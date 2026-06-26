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
 * Response schema for the Leadping API billing transaction response returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TransactionResponse implements AdditionalDataHolder, Parsable {
    /**
     * Leadping account identifier used for wallet and transaction reconciliation.
     */
    private String accountId;
    /**
     * Display name of the wallet or account used for this transaction.
     */
    private String accountName;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Monetary amount for this billing transaction or wallet operation.
     */
    private Double amount;
    /**
     * Business ID charged or credited by this wallet transaction.
     */
    private String businessId;
    /**
     * Business display name shown for this wallet transaction.
     */
    private String businessName;
    /**
     * Correlation ID used to trace this workflow or request across Leadping services.
     */
    private String correlationId;
    /**
     * The date and time when the entity was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Display name or identifier for the person or system that created this billing transaction response.
     */
    private String createdBy;
    /**
     * Human-readable description that explains this billing transaction response to API users.
     */
    private String description;
    /**
     * Payment gateway fee amount charged for the wallet transaction.
     */
    private UntypedNode gatewayFeeAmount;
    /**
     * Payment gateway identifier linked to this transaction.
     */
    private String gatewayId;
    /**
     * Payment gateway status returned for this transaction.
     */
    private String gatewayStatus;
    /**
     * The unique identifier for the entity.
     */
    private String id;
    /**
     * Lead ID connected to this transaction when the charge came from lead activity.
     */
    private String leadId;
    /**
     * Lead display name shown for lead-related wallet transactions.
     */
    private String leadName;
    /**
     * Structured metadata used for attribution, integrations, and reporting on this billing transaction response.
     */
    private TransactionResponseMetadata metadata;
    /**
     * The date and time when the entity was last modified, if applicable.
     */
    private OffsetDateTime modifiedAt;
    /**
     * Display name or identifier for the person or system that last modified this billing transaction response.
     */
    private String modifiedBy;
    /**
     * Net monetary amount after fees, credits, or adjustments.
     */
    private Double netAmount;
    /**
     * Additional billing notes that explain the transaction for admins or customers.
     */
    private String notes;
    /**
     * Masked or human-readable payment method shown for this transaction.
     */
    private String paymentMethodDisplay;
    /**
     * Leadping platform fee amount included in the transaction.
     */
    private UntypedNode platformFeeAmount;
    /**
     * Processing status for this wallet transaction.
     */
    private TransactionStatus transactionStatus;
    /**
     * Debit or credit classification for this wallet transaction.
     */
    private TransactionType transactionType;
    /**
     * Instantiates a new {@link TransactionResponse} and sets the default values.
     */
    public TransactionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TransactionResponse}
     */
    @jakarta.annotation.Nonnull
    public static TransactionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TransactionResponse();
    }
    /**
     * Gets the accountId property value. Leadping account identifier used for wallet and transaction reconciliation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * Gets the accountName property value. Display name of the wallet or account used for this transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccountName() {
        return this.accountName;
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
     * Gets the businessId property value. Business ID charged or credited by this wallet transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the businessName property value. Business display name shown for this wallet transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessName() {
        return this.businessName;
    }
    /**
     * Gets the correlationId property value. Correlation ID used to trace this workflow or request across Leadping services.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCorrelationId() {
        return this.correlationId;
    }
    /**
     * Gets the createdAt property value. The date and time when the entity was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the createdBy property value. Display name or identifier for the person or system that created this billing transaction response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the description property value. Human-readable description that explains this billing transaction response to API users.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(24);
        deserializerMap.put("accountId", (n) -> { this.setAccountId(n.getStringValue()); });
        deserializerMap.put("accountName", (n) -> { this.setAccountName(n.getStringValue()); });
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getDoubleValue()); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("businessName", (n) -> { this.setBusinessName(n.getStringValue()); });
        deserializerMap.put("correlationId", (n) -> { this.setCorrelationId(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("gatewayFeeAmount", (n) -> { this.setGatewayFeeAmount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("gatewayId", (n) -> { this.setGatewayId(n.getStringValue()); });
        deserializerMap.put("gatewayStatus", (n) -> { this.setGatewayStatus(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("leadName", (n) -> { this.setLeadName(n.getStringValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(TransactionResponseMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("modifiedBy", (n) -> { this.setModifiedBy(n.getStringValue()); });
        deserializerMap.put("netAmount", (n) -> { this.setNetAmount(n.getDoubleValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("paymentMethodDisplay", (n) -> { this.setPaymentMethodDisplay(n.getStringValue()); });
        deserializerMap.put("platformFeeAmount", (n) -> { this.setPlatformFeeAmount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("transactionStatus", (n) -> { this.setTransactionStatus(n.getEnumValue(TransactionStatus::forValue)); });
        deserializerMap.put("transactionType", (n) -> { this.setTransactionType(n.getEnumValue(TransactionType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the gatewayFeeAmount property value. Payment gateway fee amount charged for the wallet transaction.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getGatewayFeeAmount() {
        return this.gatewayFeeAmount;
    }
    /**
     * Gets the gatewayId property value. Payment gateway identifier linked to this transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGatewayId() {
        return this.gatewayId;
    }
    /**
     * Gets the gatewayStatus property value. Payment gateway status returned for this transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGatewayStatus() {
        return this.gatewayStatus;
    }
    /**
     * Gets the id property value. The unique identifier for the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the leadId property value. Lead ID connected to this transaction when the charge came from lead activity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the leadName property value. Lead display name shown for lead-related wallet transactions.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadName() {
        return this.leadName;
    }
    /**
     * Gets the metadata property value. Structured metadata used for attribution, integrations, and reporting on this billing transaction response.
     * @return a {@link TransactionResponseMetadata}
     */
    @jakarta.annotation.Nullable
    public TransactionResponseMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the modifiedAt property value. The date and time when the entity was last modified, if applicable.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the modifiedBy property value. Display name or identifier for the person or system that last modified this billing transaction response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModifiedBy() {
        return this.modifiedBy;
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
     * Gets the notes property value. Additional billing notes that explain the transaction for admins or customers.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.notes;
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
     * Gets the platformFeeAmount property value. Leadping platform fee amount included in the transaction.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getPlatformFeeAmount() {
        return this.platformFeeAmount;
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
        writer.writeStringValue("accountId", this.getAccountId());
        writer.writeStringValue("accountName", this.getAccountName());
        writer.writeDoubleValue("amount", this.getAmount());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeStringValue("businessName", this.getBusinessName());
        writer.writeStringValue("correlationId", this.getCorrelationId());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("gatewayFeeAmount", this.getGatewayFeeAmount());
        writer.writeStringValue("gatewayId", this.getGatewayId());
        writer.writeStringValue("gatewayStatus", this.getGatewayStatus());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeStringValue("leadName", this.getLeadName());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("modifiedBy", this.getModifiedBy());
        writer.writeDoubleValue("netAmount", this.getNetAmount());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeStringValue("paymentMethodDisplay", this.getPaymentMethodDisplay());
        writer.writeObjectValue("platformFeeAmount", this.getPlatformFeeAmount());
        writer.writeEnumValue("transactionStatus", this.getTransactionStatus());
        writer.writeEnumValue("transactionType", this.getTransactionType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountId property value. Leadping account identifier used for wallet and transaction reconciliation.
     * @param value Value to set for the accountId property.
     */
    public void setAccountId(@jakarta.annotation.Nullable final String value) {
        this.accountId = value;
    }
    /**
     * Sets the accountName property value. Display name of the wallet or account used for this transaction.
     * @param value Value to set for the accountName property.
     */
    public void setAccountName(@jakarta.annotation.Nullable final String value) {
        this.accountName = value;
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
     * Sets the businessId property value. Business ID charged or credited by this wallet transaction.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the businessName property value. Business display name shown for this wallet transaction.
     * @param value Value to set for the businessName property.
     */
    public void setBusinessName(@jakarta.annotation.Nullable final String value) {
        this.businessName = value;
    }
    /**
     * Sets the correlationId property value. Correlation ID used to trace this workflow or request across Leadping services.
     * @param value Value to set for the correlationId property.
     */
    public void setCorrelationId(@jakarta.annotation.Nullable final String value) {
        this.correlationId = value;
    }
    /**
     * Sets the createdAt property value. The date and time when the entity was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the createdBy property value. Display name or identifier for the person or system that created this billing transaction response.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.createdBy = value;
    }
    /**
     * Sets the description property value. Human-readable description that explains this billing transaction response to API users.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the gatewayFeeAmount property value. Payment gateway fee amount charged for the wallet transaction.
     * @param value Value to set for the gatewayFeeAmount property.
     */
    public void setGatewayFeeAmount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.gatewayFeeAmount = value;
    }
    /**
     * Sets the gatewayId property value. Payment gateway identifier linked to this transaction.
     * @param value Value to set for the gatewayId property.
     */
    public void setGatewayId(@jakarta.annotation.Nullable final String value) {
        this.gatewayId = value;
    }
    /**
     * Sets the gatewayStatus property value. Payment gateway status returned for this transaction.
     * @param value Value to set for the gatewayStatus property.
     */
    public void setGatewayStatus(@jakarta.annotation.Nullable final String value) {
        this.gatewayStatus = value;
    }
    /**
     * Sets the id property value. The unique identifier for the entity.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the leadId property value. Lead ID connected to this transaction when the charge came from lead activity.
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the leadName property value. Lead display name shown for lead-related wallet transactions.
     * @param value Value to set for the leadName property.
     */
    public void setLeadName(@jakarta.annotation.Nullable final String value) {
        this.leadName = value;
    }
    /**
     * Sets the metadata property value. Structured metadata used for attribution, integrations, and reporting on this billing transaction response.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final TransactionResponseMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the modifiedAt property value. The date and time when the entity was last modified, if applicable.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the modifiedBy property value. Display name or identifier for the person or system that last modified this billing transaction response.
     * @param value Value to set for the modifiedBy property.
     */
    public void setModifiedBy(@jakarta.annotation.Nullable final String value) {
        this.modifiedBy = value;
    }
    /**
     * Sets the netAmount property value. Net monetary amount after fees, credits, or adjustments.
     * @param value Value to set for the netAmount property.
     */
    public void setNetAmount(@jakarta.annotation.Nullable final Double value) {
        this.netAmount = value;
    }
    /**
     * Sets the notes property value. Additional billing notes that explain the transaction for admins or customers.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the paymentMethodDisplay property value. Masked or human-readable payment method shown for this transaction.
     * @param value Value to set for the paymentMethodDisplay property.
     */
    public void setPaymentMethodDisplay(@jakarta.annotation.Nullable final String value) {
        this.paymentMethodDisplay = value;
    }
    /**
     * Sets the platformFeeAmount property value. Leadping platform fee amount included in the transaction.
     * @param value Value to set for the platformFeeAmount property.
     */
    public void setPlatformFeeAmount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.platformFeeAmount = value;
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
