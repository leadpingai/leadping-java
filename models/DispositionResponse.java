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
 * Response model for disposition data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DispositionResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time for the appointment end at value on this disposition.
     */
    private OffsetDateTime appointmentEndAt;
    /**
     * The appointment notes value for this disposition.
     */
    private String appointmentNotes;
    /**
     * The date and time for the appointment start at value on this disposition.
     */
    private OffsetDateTime appointmentStartAt;
    /**
     * The assigned to user ID associated with this disposition.
     */
    private String assignedToUserId;
    /**
     * The date and time for the callback at value on this disposition.
     */
    private OffsetDateTime callbackAt;
    /**
     * Controlled disposition categories used for reporting, automation, and analytics.
     */
    private DispositionResponseCategory category;
    /**
     * The changedAt property
     */
    private OffsetDateTime changedAt;
    /**
     * The changedByAutomationId property
     */
    private String changedByAutomationId;
    /**
     * The changedByUserId property
     */
    private String changedByUserId;
    /**
     * Known sources that can change a lead&apos;s current disposition.
     */
    private DispositionResponseChangeSource changeSource;
    /**
     * The date and time for the created at value on this disposition.
     */
    private OffsetDateTime createdAt;
    /**
     * The current follow up status for this disposition.
     */
    private String followUpStatus;
    /**
     * The unique ID for this disposition.
     */
    private String id;
    /**
     * Whether this disposition is missed call follow up.
     */
    private Boolean isMissedCallFollowUp;
    /**
     * The lead ID associated with this disposition.
     */
    private String leadId;
    /**
     * The newDispositionId property
     */
    private String newDispositionId;
    /**
     * The operator or customer notes recorded for this disposition.
     */
    private String notes;
    /**
     * The oldDispositionId property
     */
    private String oldDispositionId;
    /**
     * The oldDispositionOutcome property
     */
    private String oldDispositionOutcome;
    /**
     * The oldDispositionType property
     */
    private String oldDispositionType;
    /**
     * The outcome value for this disposition.
     */
    private String outcome;
    /**
     * The reason this disposition was changed.
     */
    private String reason;
    /**
     * The related call event ID associated with this disposition.
     */
    private String relatedCallEventId;
    /**
     * The source ID associated with this disposition.
     */
    private String sourceId;
    /**
     * The date and time for the task due at value on this disposition.
     */
    private OffsetDateTime taskDueAt;
    /**
     * The date and time for the timestamp value on this disposition.
     */
    private OffsetDateTime timestamp;
    /**
     * The type classification for this disposition.
     */
    private String type;
    /**
     * The date and time for the updated at value on this disposition.
     */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new {@link DispositionResponse} and sets the default values.
     */
    public DispositionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DispositionResponse}
     */
    @jakarta.annotation.Nonnull
    public static DispositionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DispositionResponse();
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
     * Gets the appointmentEndAt property value. The date and time for the appointment end at value on this disposition.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAppointmentEndAt() {
        return this.appointmentEndAt;
    }
    /**
     * Gets the appointmentNotes property value. The appointment notes value for this disposition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppointmentNotes() {
        return this.appointmentNotes;
    }
    /**
     * Gets the appointmentStartAt property value. The date and time for the appointment start at value on this disposition.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAppointmentStartAt() {
        return this.appointmentStartAt;
    }
    /**
     * Gets the assignedToUserId property value. The assigned to user ID associated with this disposition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedToUserId() {
        return this.assignedToUserId;
    }
    /**
     * Gets the callbackAt property value. The date and time for the callback at value on this disposition.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCallbackAt() {
        return this.callbackAt;
    }
    /**
     * Gets the category property value. Controlled disposition categories used for reporting, automation, and analytics.
     * @return a {@link DispositionResponseCategory}
     */
    @jakarta.annotation.Nullable
    public DispositionResponseCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the changedAt property value. The changedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getChangedAt() {
        return this.changedAt;
    }
    /**
     * Gets the changedByAutomationId property value. The changedByAutomationId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChangedByAutomationId() {
        return this.changedByAutomationId;
    }
    /**
     * Gets the changedByUserId property value. The changedByUserId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChangedByUserId() {
        return this.changedByUserId;
    }
    /**
     * Gets the changeSource property value. Known sources that can change a lead&apos;s current disposition.
     * @return a {@link DispositionResponseChangeSource}
     */
    @jakarta.annotation.Nullable
    public DispositionResponseChangeSource getChangeSource() {
        return this.changeSource;
    }
    /**
     * Gets the createdAt property value. The date and time for the created at value on this disposition.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(28);
        deserializerMap.put("appointmentEndAt", (n) -> { this.setAppointmentEndAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("appointmentNotes", (n) -> { this.setAppointmentNotes(n.getStringValue()); });
        deserializerMap.put("appointmentStartAt", (n) -> { this.setAppointmentStartAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("assignedToUserId", (n) -> { this.setAssignedToUserId(n.getStringValue()); });
        deserializerMap.put("callbackAt", (n) -> { this.setCallbackAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(DispositionResponseCategory::forValue)); });
        deserializerMap.put("changedAt", (n) -> { this.setChangedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("changedByAutomationId", (n) -> { this.setChangedByAutomationId(n.getStringValue()); });
        deserializerMap.put("changedByUserId", (n) -> { this.setChangedByUserId(n.getStringValue()); });
        deserializerMap.put("changeSource", (n) -> { this.setChangeSource(n.getEnumValue(DispositionResponseChangeSource::forValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("followUpStatus", (n) -> { this.setFollowUpStatus(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isMissedCallFollowUp", (n) -> { this.setIsMissedCallFollowUp(n.getBooleanValue()); });
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("newDispositionId", (n) -> { this.setNewDispositionId(n.getStringValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("oldDispositionId", (n) -> { this.setOldDispositionId(n.getStringValue()); });
        deserializerMap.put("oldDispositionOutcome", (n) -> { this.setOldDispositionOutcome(n.getStringValue()); });
        deserializerMap.put("oldDispositionType", (n) -> { this.setOldDispositionType(n.getStringValue()); });
        deserializerMap.put("outcome", (n) -> { this.setOutcome(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("relatedCallEventId", (n) -> { this.setRelatedCallEventId(n.getStringValue()); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("taskDueAt", (n) -> { this.setTaskDueAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getOffsetDateTimeValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("updatedAt", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the followUpStatus property value. The current follow up status for this disposition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFollowUpStatus() {
        return this.followUpStatus;
    }
    /**
     * Gets the id property value. The unique ID for this disposition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isMissedCallFollowUp property value. Whether this disposition is missed call follow up.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMissedCallFollowUp() {
        return this.isMissedCallFollowUp;
    }
    /**
     * Gets the leadId property value. The lead ID associated with this disposition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the newDispositionId property value. The newDispositionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNewDispositionId() {
        return this.newDispositionId;
    }
    /**
     * Gets the notes property value. The operator or customer notes recorded for this disposition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the oldDispositionId property value. The oldDispositionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOldDispositionId() {
        return this.oldDispositionId;
    }
    /**
     * Gets the oldDispositionOutcome property value. The oldDispositionOutcome property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOldDispositionOutcome() {
        return this.oldDispositionOutcome;
    }
    /**
     * Gets the oldDispositionType property value. The oldDispositionType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOldDispositionType() {
        return this.oldDispositionType;
    }
    /**
     * Gets the outcome property value. The outcome value for this disposition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOutcome() {
        return this.outcome;
    }
    /**
     * Gets the reason property value. The reason this disposition was changed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the relatedCallEventId property value. The related call event ID associated with this disposition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRelatedCallEventId() {
        return this.relatedCallEventId;
    }
    /**
     * Gets the sourceId property value. The source ID associated with this disposition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.sourceId;
    }
    /**
     * Gets the taskDueAt property value. The date and time for the task due at value on this disposition.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTaskDueAt() {
        return this.taskDueAt;
    }
    /**
     * Gets the timestamp property value. The date and time for the timestamp value on this disposition.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }
    /**
     * Gets the type property value. The type classification for this disposition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the updatedAt property value. The date and time for the updated at value on this disposition.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("appointmentEndAt", this.getAppointmentEndAt());
        writer.writeStringValue("appointmentNotes", this.getAppointmentNotes());
        writer.writeOffsetDateTimeValue("appointmentStartAt", this.getAppointmentStartAt());
        writer.writeStringValue("assignedToUserId", this.getAssignedToUserId());
        writer.writeOffsetDateTimeValue("callbackAt", this.getCallbackAt());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeOffsetDateTimeValue("changedAt", this.getChangedAt());
        writer.writeStringValue("changedByAutomationId", this.getChangedByAutomationId());
        writer.writeStringValue("changedByUserId", this.getChangedByUserId());
        writer.writeEnumValue("changeSource", this.getChangeSource());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("followUpStatus", this.getFollowUpStatus());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isMissedCallFollowUp", this.getIsMissedCallFollowUp());
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeStringValue("newDispositionId", this.getNewDispositionId());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeStringValue("oldDispositionId", this.getOldDispositionId());
        writer.writeStringValue("oldDispositionOutcome", this.getOldDispositionOutcome());
        writer.writeStringValue("oldDispositionType", this.getOldDispositionType());
        writer.writeStringValue("outcome", this.getOutcome());
        writer.writeStringValue("reason", this.getReason());
        writer.writeStringValue("relatedCallEventId", this.getRelatedCallEventId());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeOffsetDateTimeValue("taskDueAt", this.getTaskDueAt());
        writer.writeOffsetDateTimeValue("timestamp", this.getTimestamp());
        writer.writeStringValue("type", this.getType());
        writer.writeOffsetDateTimeValue("updatedAt", this.getUpdatedAt());
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
     * Sets the appointmentEndAt property value. The date and time for the appointment end at value on this disposition.
     * @param value Value to set for the appointmentEndAt property.
     */
    public void setAppointmentEndAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.appointmentEndAt = value;
    }
    /**
     * Sets the appointmentNotes property value. The appointment notes value for this disposition.
     * @param value Value to set for the appointmentNotes property.
     */
    public void setAppointmentNotes(@jakarta.annotation.Nullable final String value) {
        this.appointmentNotes = value;
    }
    /**
     * Sets the appointmentStartAt property value. The date and time for the appointment start at value on this disposition.
     * @param value Value to set for the appointmentStartAt property.
     */
    public void setAppointmentStartAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.appointmentStartAt = value;
    }
    /**
     * Sets the assignedToUserId property value. The assigned to user ID associated with this disposition.
     * @param value Value to set for the assignedToUserId property.
     */
    public void setAssignedToUserId(@jakarta.annotation.Nullable final String value) {
        this.assignedToUserId = value;
    }
    /**
     * Sets the callbackAt property value. The date and time for the callback at value on this disposition.
     * @param value Value to set for the callbackAt property.
     */
    public void setCallbackAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.callbackAt = value;
    }
    /**
     * Sets the category property value. Controlled disposition categories used for reporting, automation, and analytics.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final DispositionResponseCategory value) {
        this.category = value;
    }
    /**
     * Sets the changedAt property value. The changedAt property
     * @param value Value to set for the changedAt property.
     */
    public void setChangedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.changedAt = value;
    }
    /**
     * Sets the changedByAutomationId property value. The changedByAutomationId property
     * @param value Value to set for the changedByAutomationId property.
     */
    public void setChangedByAutomationId(@jakarta.annotation.Nullable final String value) {
        this.changedByAutomationId = value;
    }
    /**
     * Sets the changedByUserId property value. The changedByUserId property
     * @param value Value to set for the changedByUserId property.
     */
    public void setChangedByUserId(@jakarta.annotation.Nullable final String value) {
        this.changedByUserId = value;
    }
    /**
     * Sets the changeSource property value. Known sources that can change a lead&apos;s current disposition.
     * @param value Value to set for the changeSource property.
     */
    public void setChangeSource(@jakarta.annotation.Nullable final DispositionResponseChangeSource value) {
        this.changeSource = value;
    }
    /**
     * Sets the createdAt property value. The date and time for the created at value on this disposition.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the followUpStatus property value. The current follow up status for this disposition.
     * @param value Value to set for the followUpStatus property.
     */
    public void setFollowUpStatus(@jakarta.annotation.Nullable final String value) {
        this.followUpStatus = value;
    }
    /**
     * Sets the id property value. The unique ID for this disposition.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isMissedCallFollowUp property value. Whether this disposition is missed call follow up.
     * @param value Value to set for the isMissedCallFollowUp property.
     */
    public void setIsMissedCallFollowUp(@jakarta.annotation.Nullable final Boolean value) {
        this.isMissedCallFollowUp = value;
    }
    /**
     * Sets the leadId property value. The lead ID associated with this disposition.
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the newDispositionId property value. The newDispositionId property
     * @param value Value to set for the newDispositionId property.
     */
    public void setNewDispositionId(@jakarta.annotation.Nullable final String value) {
        this.newDispositionId = value;
    }
    /**
     * Sets the notes property value. The operator or customer notes recorded for this disposition.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the oldDispositionId property value. The oldDispositionId property
     * @param value Value to set for the oldDispositionId property.
     */
    public void setOldDispositionId(@jakarta.annotation.Nullable final String value) {
        this.oldDispositionId = value;
    }
    /**
     * Sets the oldDispositionOutcome property value. The oldDispositionOutcome property
     * @param value Value to set for the oldDispositionOutcome property.
     */
    public void setOldDispositionOutcome(@jakarta.annotation.Nullable final String value) {
        this.oldDispositionOutcome = value;
    }
    /**
     * Sets the oldDispositionType property value. The oldDispositionType property
     * @param value Value to set for the oldDispositionType property.
     */
    public void setOldDispositionType(@jakarta.annotation.Nullable final String value) {
        this.oldDispositionType = value;
    }
    /**
     * Sets the outcome property value. The outcome value for this disposition.
     * @param value Value to set for the outcome property.
     */
    public void setOutcome(@jakarta.annotation.Nullable final String value) {
        this.outcome = value;
    }
    /**
     * Sets the reason property value. The reason this disposition was changed.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the relatedCallEventId property value. The related call event ID associated with this disposition.
     * @param value Value to set for the relatedCallEventId property.
     */
    public void setRelatedCallEventId(@jakarta.annotation.Nullable final String value) {
        this.relatedCallEventId = value;
    }
    /**
     * Sets the sourceId property value. The source ID associated with this disposition.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.sourceId = value;
    }
    /**
     * Sets the taskDueAt property value. The date and time for the task due at value on this disposition.
     * @param value Value to set for the taskDueAt property.
     */
    public void setTaskDueAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.taskDueAt = value;
    }
    /**
     * Sets the timestamp property value. The date and time for the timestamp value on this disposition.
     * @param value Value to set for the timestamp property.
     */
    public void setTimestamp(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.timestamp = value;
    }
    /**
     * Sets the type property value. The type classification for this disposition.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the updatedAt property value. The date and time for the updated at value on this disposition.
     * @param value Value to set for the updatedAt property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
}
