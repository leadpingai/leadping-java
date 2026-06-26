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
 * Request model for creating or updating a disposition.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DispositionRequest implements AdditionalDataHolder, Parsable {
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
    private DispositionRequestCategory category;
    /**
     * The automation that changed this disposition, when applicable.
     */
    private String changedByAutomationId;
    /**
     * Known sources that can change a lead&apos;s current disposition.
     */
    private DispositionRequestChangeSource changeSource;
    /**
     * The current follow up status for this disposition.
     */
    private String followUpStatus;
    /**
     * Whether this disposition is missed call follow up.
     */
    private Boolean isMissedCallFollowUp;
    /**
     * The lead ID associated with this disposition.
     */
    private String leadId;
    /**
     * The operator or customer notes recorded for this disposition.
     */
    private String notes;
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
     * Instantiates a new {@link DispositionRequest} and sets the default values.
     */
    public DispositionRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DispositionRequest}
     */
    @jakarta.annotation.Nonnull
    public static DispositionRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DispositionRequest();
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
     * @return a {@link DispositionRequestCategory}
     */
    @jakarta.annotation.Nullable
    public DispositionRequestCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the changedByAutomationId property value. The automation that changed this disposition, when applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChangedByAutomationId() {
        return this.changedByAutomationId;
    }
    /**
     * Gets the changeSource property value. Known sources that can change a lead&apos;s current disposition.
     * @return a {@link DispositionRequestChangeSource}
     */
    @jakarta.annotation.Nullable
    public DispositionRequestChangeSource getChangeSource() {
        return this.changeSource;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(19);
        deserializerMap.put("appointmentEndAt", (n) -> { this.setAppointmentEndAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("appointmentNotes", (n) -> { this.setAppointmentNotes(n.getStringValue()); });
        deserializerMap.put("appointmentStartAt", (n) -> { this.setAppointmentStartAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("assignedToUserId", (n) -> { this.setAssignedToUserId(n.getStringValue()); });
        deserializerMap.put("callbackAt", (n) -> { this.setCallbackAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(DispositionRequestCategory::forValue)); });
        deserializerMap.put("changedByAutomationId", (n) -> { this.setChangedByAutomationId(n.getStringValue()); });
        deserializerMap.put("changeSource", (n) -> { this.setChangeSource(n.getEnumValue(DispositionRequestChangeSource::forValue)); });
        deserializerMap.put("followUpStatus", (n) -> { this.setFollowUpStatus(n.getStringValue()); });
        deserializerMap.put("isMissedCallFollowUp", (n) -> { this.setIsMissedCallFollowUp(n.getBooleanValue()); });
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("outcome", (n) -> { this.setOutcome(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("relatedCallEventId", (n) -> { this.setRelatedCallEventId(n.getStringValue()); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("taskDueAt", (n) -> { this.setTaskDueAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("timestamp", (n) -> { this.setTimestamp(n.getOffsetDateTimeValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
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
     * Gets the notes property value. The operator or customer notes recorded for this disposition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.notes;
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
        writer.writeStringValue("changedByAutomationId", this.getChangedByAutomationId());
        writer.writeEnumValue("changeSource", this.getChangeSource());
        writer.writeStringValue("followUpStatus", this.getFollowUpStatus());
        writer.writeBooleanValue("isMissedCallFollowUp", this.getIsMissedCallFollowUp());
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeStringValue("outcome", this.getOutcome());
        writer.writeStringValue("reason", this.getReason());
        writer.writeStringValue("relatedCallEventId", this.getRelatedCallEventId());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeOffsetDateTimeValue("taskDueAt", this.getTaskDueAt());
        writer.writeOffsetDateTimeValue("timestamp", this.getTimestamp());
        writer.writeStringValue("type", this.getType());
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
    public void setCategory(@jakarta.annotation.Nullable final DispositionRequestCategory value) {
        this.category = value;
    }
    /**
     * Sets the changedByAutomationId property value. The automation that changed this disposition, when applicable.
     * @param value Value to set for the changedByAutomationId property.
     */
    public void setChangedByAutomationId(@jakarta.annotation.Nullable final String value) {
        this.changedByAutomationId = value;
    }
    /**
     * Sets the changeSource property value. Known sources that can change a lead&apos;s current disposition.
     * @param value Value to set for the changeSource property.
     */
    public void setChangeSource(@jakarta.annotation.Nullable final DispositionRequestChangeSource value) {
        this.changeSource = value;
    }
    /**
     * Sets the followUpStatus property value. The current follow up status for this disposition.
     * @param value Value to set for the followUpStatus property.
     */
    public void setFollowUpStatus(@jakarta.annotation.Nullable final String value) {
        this.followUpStatus = value;
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
     * Sets the notes property value. The operator or customer notes recorded for this disposition.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.notes = value;
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
}
