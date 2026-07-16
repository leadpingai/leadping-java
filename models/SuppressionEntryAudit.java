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
 * API DTO containing ion entry audit data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SuppressionEntryAudit implements AdditionalDataHolder, Parsable {
    /**
     * The actor ID associated with this ion entry audit.
     */
    private String actorId;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique ID for this ion entry audit.
     */
    private String id;
    /**
     * The human-readable reason explaining this ion entry audit.
     */
    private String reason;
    /**
     * The safe metadata key-value data carried with this ion entry audit; values must be safe to expose in API responses.
     */
    private SuppressionEntryAuditSafeMetadata safeMetadata;
    /**
     * The source value for this ion entry audit.
     */
    private String source;
    /**
     * The current status for this ion entry audit.
     */
    private String status;
    /**
     * The date and time for the timestamp value on this ion entry audit.
     */
    private OffsetDateTime timestamp;
    /**
     * Instantiates a new {@link SuppressionEntryAudit} and sets the default values.
     */
    public SuppressionEntryAudit() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SuppressionEntryAudit}
     */
    @jakarta.annotation.Nonnull
    public static SuppressionEntryAudit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SuppressionEntryAudit();
    }
    /**
     * Gets the actorId property value. The actor ID associated with this ion entry audit.
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("actorId", (n) -> { this.setActorId(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("safeMetadata", (n) -> { this.setSafeMetadata(n.getObjectValue(SuppressionEntryAuditSafeMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique ID for this ion entry audit.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the reason property value. The human-readable reason explaining this ion entry audit.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the safeMetadata property value. The safe metadata key-value data carried with this ion entry audit; values must be safe to expose in API responses.
     * @return a {@link SuppressionEntryAuditSafeMetadata}
     */
    @jakarta.annotation.Nullable
    public SuppressionEntryAuditSafeMetadata getSafeMetadata() {
        return this.safeMetadata;
    }
    /**
     * Gets the source property value. The source value for this ion entry audit.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSource() {
        return this.source;
    }
    /**
     * Gets the status property value. The current status for this ion entry audit.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the timestamp property value. The date and time for the timestamp value on this ion entry audit.
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
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("reason", this.getReason());
        writer.writeObjectValue("safeMetadata", this.getSafeMetadata());
        writer.writeStringValue("source", this.getSource());
        writer.writeStringValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("timestamp", this.getTimestamp());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actorId property value. The actor ID associated with this ion entry audit.
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
     * Sets the id property value. The unique ID for this ion entry audit.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the reason property value. The human-readable reason explaining this ion entry audit.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the safeMetadata property value. The safe metadata key-value data carried with this ion entry audit; values must be safe to expose in API responses.
     * @param value Value to set for the safeMetadata property.
     */
    public void setSafeMetadata(@jakarta.annotation.Nullable final SuppressionEntryAuditSafeMetadata value) {
        this.safeMetadata = value;
    }
    /**
     * Sets the source property value. The source value for this ion entry audit.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.source = value;
    }
    /**
     * Sets the status property value. The current status for this ion entry audit.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the timestamp property value. The date and time for the timestamp value on this ion entry audit.
     * @param value Value to set for the timestamp property.
     */
    public void setTimestamp(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.timestamp = value;
    }
}
