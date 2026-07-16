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
 * API response containing suppression entry data returned to callers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SuppressionEntryResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The audit included with this ion entry.
     */
    private java.util.List<SuppressionEntryAudit> audit;
    /**
     * The business ID associated with this ion entry.
     */
    private String businessId;
    /**
     * The channel value for this ion entry.
     */
    private String channel;
    /**
     * The unique ID for this ion entry.
     */
    private String id;
    /**
     * The normalized email value for this ion entry.
     */
    private String normalizedEmail;
    /**
     * The phone number associated with this ion entry.
     */
    private String normalizedPhoneNumber;
    /**
     * The human-readable reason explaining this ion entry.
     */
    private String reason;
    /**
     * The recipient identifier value for this ion entry.
     */
    private String recipientIdentifier;
    /**
     * The date and time for the released at value on this ion entry.
     */
    private OffsetDateTime releasedAt;
    /**
     * The source value for this ion entry.
     */
    private String source;
    /**
     * The current status for this ion entry.
     */
    private String status;
    /**
     * The date and time for the suppressed at value on this ion entry.
     */
    private OffsetDateTime suppressedAt;
    /**
     * Instantiates a new {@link SuppressionEntryResponse} and sets the default values.
     */
    public SuppressionEntryResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SuppressionEntryResponse}
     */
    @jakarta.annotation.Nonnull
    public static SuppressionEntryResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SuppressionEntryResponse();
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
     * Gets the audit property value. The audit included with this ion entry.
     * @return a {@link java.util.List<SuppressionEntryAudit>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SuppressionEntryAudit> getAudit() {
        return this.audit;
    }
    /**
     * Gets the businessId property value. The business ID associated with this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the channel property value. The channel value for this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChannel() {
        return this.channel;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("audit", (n) -> { this.setAudit(n.getCollectionOfObjectValues(SuppressionEntryAudit::createFromDiscriminatorValue)); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("normalizedEmail", (n) -> { this.setNormalizedEmail(n.getStringValue()); });
        deserializerMap.put("normalizedPhoneNumber", (n) -> { this.setNormalizedPhoneNumber(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("recipientIdentifier", (n) -> { this.setRecipientIdentifier(n.getStringValue()); });
        deserializerMap.put("releasedAt", (n) -> { this.setReleasedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("suppressedAt", (n) -> { this.setSuppressedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique ID for this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the normalizedEmail property value. The normalized email value for this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNormalizedEmail() {
        return this.normalizedEmail;
    }
    /**
     * Gets the normalizedPhoneNumber property value. The phone number associated with this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNormalizedPhoneNumber() {
        return this.normalizedPhoneNumber;
    }
    /**
     * Gets the reason property value. The human-readable reason explaining this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the recipientIdentifier property value. The recipient identifier value for this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecipientIdentifier() {
        return this.recipientIdentifier;
    }
    /**
     * Gets the releasedAt property value. The date and time for the released at value on this ion entry.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReleasedAt() {
        return this.releasedAt;
    }
    /**
     * Gets the source property value. The source value for this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSource() {
        return this.source;
    }
    /**
     * Gets the status property value. The current status for this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the suppressedAt property value. The date and time for the suppressed at value on this ion entry.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSuppressedAt() {
        return this.suppressedAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("audit", this.getAudit());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeStringValue("channel", this.getChannel());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("normalizedEmail", this.getNormalizedEmail());
        writer.writeStringValue("normalizedPhoneNumber", this.getNormalizedPhoneNumber());
        writer.writeStringValue("reason", this.getReason());
        writer.writeStringValue("recipientIdentifier", this.getRecipientIdentifier());
        writer.writeOffsetDateTimeValue("releasedAt", this.getReleasedAt());
        writer.writeStringValue("source", this.getSource());
        writer.writeStringValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("suppressedAt", this.getSuppressedAt());
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
     * Sets the audit property value. The audit included with this ion entry.
     * @param value Value to set for the audit property.
     */
    public void setAudit(@jakarta.annotation.Nullable final java.util.List<SuppressionEntryAudit> value) {
        this.audit = value;
    }
    /**
     * Sets the businessId property value. The business ID associated with this ion entry.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the channel property value. The channel value for this ion entry.
     * @param value Value to set for the channel property.
     */
    public void setChannel(@jakarta.annotation.Nullable final String value) {
        this.channel = value;
    }
    /**
     * Sets the id property value. The unique ID for this ion entry.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the normalizedEmail property value. The normalized email value for this ion entry.
     * @param value Value to set for the normalizedEmail property.
     */
    public void setNormalizedEmail(@jakarta.annotation.Nullable final String value) {
        this.normalizedEmail = value;
    }
    /**
     * Sets the normalizedPhoneNumber property value. The phone number associated with this ion entry.
     * @param value Value to set for the normalizedPhoneNumber property.
     */
    public void setNormalizedPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.normalizedPhoneNumber = value;
    }
    /**
     * Sets the reason property value. The human-readable reason explaining this ion entry.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the recipientIdentifier property value. The recipient identifier value for this ion entry.
     * @param value Value to set for the recipientIdentifier property.
     */
    public void setRecipientIdentifier(@jakarta.annotation.Nullable final String value) {
        this.recipientIdentifier = value;
    }
    /**
     * Sets the releasedAt property value. The date and time for the released at value on this ion entry.
     * @param value Value to set for the releasedAt property.
     */
    public void setReleasedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.releasedAt = value;
    }
    /**
     * Sets the source property value. The source value for this ion entry.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.source = value;
    }
    /**
     * Sets the status property value. The current status for this ion entry.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the suppressedAt property value. The date and time for the suppressed at value on this ion entry.
     * @param value Value to set for the suppressedAt property.
     */
    public void setSuppressedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.suppressedAt = value;
    }
}
