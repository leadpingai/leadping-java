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
 * History record schema for Leadping API phone number event record data exposed in automation and audit views.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberEventRecord implements AdditionalDataHolder, Parsable {
    /**
     * Actor ID for the user, system, or integration that performed the action.
     */
    private String actorId;
    /**
     * Display name for the actor that performed the action.
     */
    private String actorName;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * UTC timestamp when this phone number event record was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Additional human-readable details that explain this phone number event record.
     */
    private String details;
    /**
     * Unique Leadping identifier for this phone number event record.
     */
    private String id;
    /**
     * Leadping-owned inventory state for phone-number assignment and routing.
     */
    private PhoneNumberEventRecordState state;
    /**
     * Short title displayed for this phone number event record.
     */
    private String title;
    /**
     * Type classification used to route and interpret this phone number event record in the Leadping API.
     */
    private String type;
    /**
     * Instantiates a new {@link PhoneNumberEventRecord} and sets the default values.
     */
    public PhoneNumberEventRecord() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberEventRecord}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberEventRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberEventRecord();
    }
    /**
     * Gets the actorId property value. Actor ID for the user, system, or integration that performed the action.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActorId() {
        return this.actorId;
    }
    /**
     * Gets the actorName property value. Display name for the actor that performed the action.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActorName() {
        return this.actorName;
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
     * Gets the createdAt property value. UTC timestamp when this phone number event record was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the details property value. Additional human-readable details that explain this phone number event record.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetails() {
        return this.details;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("actorId", (n) -> { this.setActorId(n.getStringValue()); });
        deserializerMap.put("actorName", (n) -> { this.setActorName(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(PhoneNumberEventRecordState::forValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this phone number event record.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the state property value. Leadping-owned inventory state for phone-number assignment and routing.
     * @return a {@link PhoneNumberEventRecordState}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberEventRecordState getState() {
        return this.state;
    }
    /**
     * Gets the title property value. Short title displayed for this phone number event record.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the type property value. Type classification used to route and interpret this phone number event record in the Leadping API.
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
        writer.writeStringValue("actorId", this.getActorId());
        writer.writeStringValue("actorName", this.getActorName());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("details", this.getDetails());
        writer.writeStringValue("id", this.getId());
        writer.writeEnumValue("state", this.getState());
        writer.writeStringValue("title", this.getTitle());
        writer.writeStringValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actorId property value. Actor ID for the user, system, or integration that performed the action.
     * @param value Value to set for the actorId property.
     */
    public void setActorId(@jakarta.annotation.Nullable final String value) {
        this.actorId = value;
    }
    /**
     * Sets the actorName property value. Display name for the actor that performed the action.
     * @param value Value to set for the actorName property.
     */
    public void setActorName(@jakarta.annotation.Nullable final String value) {
        this.actorName = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the createdAt property value. UTC timestamp when this phone number event record was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the details property value. Additional human-readable details that explain this phone number event record.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final String value) {
        this.details = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this phone number event record.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the state property value. Leadping-owned inventory state for phone-number assignment and routing.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final PhoneNumberEventRecordState value) {
        this.state = value;
    }
    /**
     * Sets the title property value. Short title displayed for this phone number event record.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the type property value. Type classification used to route and interpret this phone number event record in the Leadping API.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
