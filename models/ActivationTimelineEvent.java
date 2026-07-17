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
 * API DTO containing activation timeline event data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActivationTimelineEvent implements AdditionalDataHolder, Parsable {
    /**
     * The ID and name for this actor.
     */
    private ActivationTimelineEventActor actor;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time for the created at value on this activation timeline event.
     */
    private OffsetDateTime createdAt;
    /**
     * The details value for this activation timeline event.
     */
    private String details;
    /**
     * The human-readable failure reason explaining this activation timeline event.
     */
    private String failureReason;
    /**
     * The unique ID for this activation timeline event.
     */
    private String id;
    /**
     * The current status for this activation timeline event.
     */
    private String status;
    /**
     * The title value for this activation timeline event.
     */
    private String title;
    /**
     * The type classification for this activation timeline event.
     */
    private String type;
    /**
     * Instantiates a new {@link ActivationTimelineEvent} and sets the default values.
     */
    public ActivationTimelineEvent() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ActivationTimelineEvent}
     */
    @jakarta.annotation.Nonnull
    public static ActivationTimelineEvent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivationTimelineEvent();
    }
    /**
     * Gets the actor property value. The ID and name for this actor.
     * @return a {@link ActivationTimelineEventActor}
     */
    @jakarta.annotation.Nullable
    public ActivationTimelineEventActor getActor() {
        return this.actor;
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
     * Gets the createdAt property value. The date and time for the created at value on this activation timeline event.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the details property value. The details value for this activation timeline event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetails() {
        return this.details;
    }
    /**
     * Gets the failureReason property value. The human-readable failure reason explaining this activation timeline event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFailureReason() {
        return this.failureReason;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("actor", (n) -> { this.setActor(n.getObjectValue(ActivationTimelineEventActor::createFromDiscriminatorValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getStringValue()); });
        deserializerMap.put("failureReason", (n) -> { this.setFailureReason(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique ID for this activation timeline event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the status property value. The current status for this activation timeline event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the title property value. The title value for this activation timeline event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the type property value. The type classification for this activation timeline event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("actor", this.getActor());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("details", this.getDetails());
        writer.writeStringValue("failureReason", this.getFailureReason());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("title", this.getTitle());
        writer.writeStringValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actor property value. The ID and name for this actor.
     * @param value Value to set for the actor property.
     */
    public void setActor(@jakarta.annotation.Nullable final ActivationTimelineEventActor value) {
        this.actor = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the createdAt property value. The date and time for the created at value on this activation timeline event.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the details property value. The details value for this activation timeline event.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final String value) {
        this.details = value;
    }
    /**
     * Sets the failureReason property value. The human-readable failure reason explaining this activation timeline event.
     * @param value Value to set for the failureReason property.
     */
    public void setFailureReason(@jakarta.annotation.Nullable final String value) {
        this.failureReason = value;
    }
    /**
     * Sets the id property value. The unique ID for this activation timeline event.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the status property value. The current status for this activation timeline event.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the title property value. The title value for this activation timeline event.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the type property value. The type classification for this activation timeline event.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
