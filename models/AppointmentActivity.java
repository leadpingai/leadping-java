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
 * An immutable snapshot of an appointment change and its actor.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppointmentActivity implements AdditionalDataHolder, Parsable {
    /**
     * The actorId property
     */
    private String actorId;
    /**
     * The actorName property
     */
    private String actorName;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The assignedToName property
     */
    private String assignedToName;
    /**
     * The at property
     */
    private OffsetDateTime at;
    /**
     * The notes property
     */
    private String notes;
    /**
     * The reminderAt property
     */
    private OffsetDateTime reminderAt;
    /**
     * The revision property
     */
    private Long revision;
    /**
     * The startAt property
     */
    private OffsetDateTime startAt;
    /**
     * The title property
     */
    private String title;
    /**
     * The type property
     */
    private String type;
    /**
     * Instantiates a new {@link AppointmentActivity} and sets the default values.
     */
    public AppointmentActivity() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppointmentActivity}
     */
    @jakarta.annotation.Nonnull
    public static AppointmentActivity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppointmentActivity();
    }
    /**
     * Gets the actorId property value. The actorId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActorId() {
        return this.actorId;
    }
    /**
     * Gets the actorName property value. The actorName property
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
     * Gets the assignedToName property value. The assignedToName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedToName() {
        return this.assignedToName;
    }
    /**
     * Gets the at property value. The at property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAt() {
        return this.at;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("actorId", (n) -> { this.setActorId(n.getStringValue()); });
        deserializerMap.put("actorName", (n) -> { this.setActorName(n.getStringValue()); });
        deserializerMap.put("assignedToName", (n) -> { this.setAssignedToName(n.getStringValue()); });
        deserializerMap.put("at", (n) -> { this.setAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("reminderAt", (n) -> { this.setReminderAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("revision", (n) -> { this.setRevision(n.getLongValue()); });
        deserializerMap.put("startAt", (n) -> { this.setStartAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notes property value. The notes property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the reminderAt property value. The reminderAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReminderAt() {
        return this.reminderAt;
    }
    /**
     * Gets the revision property value. The revision property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getRevision() {
        return this.revision;
    }
    /**
     * Gets the startAt property value. The startAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartAt() {
        return this.startAt;
    }
    /**
     * Gets the title property value. The title property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the type property value. The type property
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
        writer.writeStringValue("assignedToName", this.getAssignedToName());
        writer.writeOffsetDateTimeValue("at", this.getAt());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeOffsetDateTimeValue("reminderAt", this.getReminderAt());
        writer.writeLongValue("revision", this.getRevision());
        writer.writeOffsetDateTimeValue("startAt", this.getStartAt());
        writer.writeStringValue("title", this.getTitle());
        writer.writeStringValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actorId property value. The actorId property
     * @param value Value to set for the actorId property.
     */
    public void setActorId(@jakarta.annotation.Nullable final String value) {
        this.actorId = value;
    }
    /**
     * Sets the actorName property value. The actorName property
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
     * Sets the assignedToName property value. The assignedToName property
     * @param value Value to set for the assignedToName property.
     */
    public void setAssignedToName(@jakarta.annotation.Nullable final String value) {
        this.assignedToName = value;
    }
    /**
     * Sets the at property value. The at property
     * @param value Value to set for the at property.
     */
    public void setAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.at = value;
    }
    /**
     * Sets the notes property value. The notes property
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the reminderAt property value. The reminderAt property
     * @param value Value to set for the reminderAt property.
     */
    public void setReminderAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.reminderAt = value;
    }
    /**
     * Sets the revision property value. The revision property
     * @param value Value to set for the revision property.
     */
    public void setRevision(@jakarta.annotation.Nullable final Long value) {
        this.revision = value;
    }
    /**
     * Sets the startAt property value. The startAt property
     * @param value Value to set for the startAt property.
     */
    public void setStartAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startAt = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
