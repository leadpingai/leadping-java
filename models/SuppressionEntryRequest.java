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
 * Request payload for suppression entry.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SuppressionEntryRequest implements AdditionalDataHolder, Parsable {
    /**
     * The actor ID associated with this ion entry.
     */
    private String actorId;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The business ID associated with this ion entry.
     */
    private String businessId;
    /**
     * The channel value for this ion entry.
     */
    private String channel;
    /**
     * The email address associated with this ion entry.
     */
    private String email;
    /**
     * The phone number associated with this ion entry.
     */
    private String phoneNumber;
    /**
     * The provider event ID associated with this ion entry.
     */
    private String providerEventId;
    /**
     * The human-readable reason explaining this ion entry.
     */
    private String reason;
    /**
     * The recipient identifier value for this ion entry.
     */
    private String recipientIdentifier;
    /**
     * The safe metadata key-value data carried with this ion entry; values must be safe to expose in API responses.
     */
    private SuppressionEntryRequestSafeMetadata safeMetadata;
    /**
     * The source value for this ion entry.
     */
    private String source;
    /**
     * The source event ID associated with this ion entry.
     */
    private String sourceEventId;
    /**
     * The date and time for the timestamp value on this ion entry.
     */
    private OffsetDateTime timestamp;
    /**
     * Instantiates a new {@link SuppressionEntryRequest} and sets the default values.
     */
    public SuppressionEntryRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SuppressionEntryRequest}
     */
    @jakarta.annotation.Nonnull
    public static SuppressionEntryRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SuppressionEntryRequest();
    }
    /**
     * Gets the actorId property value. The actor ID associated with this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActorId() {
        return this.actorId;
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
     * Gets the email property value. The email address associated with this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("actorId", (n) -> { this.setActorId(n.getStringValue()); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("providerEventId", (n) -> { this.setProviderEventId(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("recipientIdentifier", (n) -> { this.setRecipientIdentifier(n.getStringValue()); });
        deserializerMap.put("safeMetadata", (n) -> { this.setSafeMetadata(n.getObjectValue(SuppressionEntryRequestSafeMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getStringValue()); });
        deserializerMap.put("sourceEventId", (n) -> { this.setSourceEventId(n.getStringValue()); });
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the phoneNumber property value. The phone number associated with this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the providerEventId property value. The provider event ID associated with this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderEventId() {
        return this.providerEventId;
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
     * Gets the safeMetadata property value. The safe metadata key-value data carried with this ion entry; values must be safe to expose in API responses.
     * @return a {@link SuppressionEntryRequestSafeMetadata}
     */
    @jakarta.annotation.Nullable
    public SuppressionEntryRequestSafeMetadata getSafeMetadata() {
        return this.safeMetadata;
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
     * Gets the sourceEventId property value. The source event ID associated with this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceEventId() {
        return this.sourceEventId;
    }
    /**
     * Gets the timestamp property value. The date and time for the timestamp value on this ion entry.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actorId", this.getActorId());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeStringValue("channel", this.getChannel());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeStringValue("providerEventId", this.getProviderEventId());
        writer.writeStringValue("reason", this.getReason());
        writer.writeStringValue("recipientIdentifier", this.getRecipientIdentifier());
        writer.writeObjectValue("safeMetadata", this.getSafeMetadata());
        writer.writeStringValue("source", this.getSource());
        writer.writeStringValue("sourceEventId", this.getSourceEventId());
        writer.writeOffsetDateTimeValue("timestamp", this.getTimestamp());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actorId property value. The actor ID associated with this ion entry.
     * @param value Value to set for the actorId property.
     */
    public void setActorId(@jakarta.annotation.Nullable final String value) {
        this.actorId = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
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
     * Sets the email property value. The email address associated with this ion entry.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the phoneNumber property value. The phone number associated with this ion entry.
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the providerEventId property value. The provider event ID associated with this ion entry.
     * @param value Value to set for the providerEventId property.
     */
    public void setProviderEventId(@jakarta.annotation.Nullable final String value) {
        this.providerEventId = value;
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
     * Sets the safeMetadata property value. The safe metadata key-value data carried with this ion entry; values must be safe to expose in API responses.
     * @param value Value to set for the safeMetadata property.
     */
    public void setSafeMetadata(@jakarta.annotation.Nullable final SuppressionEntryRequestSafeMetadata value) {
        this.safeMetadata = value;
    }
    /**
     * Sets the source property value. The source value for this ion entry.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.source = value;
    }
    /**
     * Sets the sourceEventId property value. The source event ID associated with this ion entry.
     * @param value Value to set for the sourceEventId property.
     */
    public void setSourceEventId(@jakarta.annotation.Nullable final String value) {
        this.sourceEventId = value;
    }
    /**
     * Sets the timestamp property value. The date and time for the timestamp value on this ion entry.
     * @param value Value to set for the timestamp property.
     */
    public void setTimestamp(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.timestamp = value;
    }
}
