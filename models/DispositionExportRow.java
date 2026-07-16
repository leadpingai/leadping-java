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
 * API response containing disposition export row data returned to callers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DispositionExportRow implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time for the appointment end at value on this disposition export row.
     */
    private OffsetDateTime appointmentEndAt;
    /**
     * The date and time for the appointment start at value on this disposition export row.
     */
    private OffsetDateTime appointmentStartAt;
    /**
     * The assigned to user ID associated with this disposition export row.
     */
    private String assignedToUserId;
    /**
     * The date and time for the callback at value on this disposition export row.
     */
    private OffsetDateTime callbackAt;
    /**
     * Controlled disposition categories used for reporting, automation, and analytics.
     */
    private DispositionExportRowCategory category;
    /**
     * Date and time when the disposition change occurred.
     */
    private OffsetDateTime changedAt;
    /**
     * Unique identifier of the automation that changed the disposition, when applicable.
     */
    private String changedByAutomationId;
    /**
     * Unique identifier of the Leadping user who made the change.
     */
    private String changedByUserId;
    /**
     * Known sources that can change a lead&apos;s current disposition.
     */
    private DispositionExportRowChangeSource changeSource;
    /**
     * The date and time for the created at value on this disposition export row.
     */
    private OffsetDateTime createdAt;
    /**
     * The disposition ID associated with this disposition export row.
     */
    private String dispositionId;
    /**
     * The current follow up status for this disposition export row.
     */
    private String followUpStatus;
    /**
     * Whether this disposition export row is missed call follow up.
     */
    private Boolean isMissedCallFollowUp;
    /**
     * The lead ID associated with this disposition export row.
     */
    private String leadId;
    /**
     * Unique identifier of the new disposition associated with this Leadping disposition export row.
     */
    private String newDispositionId;
    /**
     * The operator or customer notes recorded for this disposition export row.
     */
    private String notes;
    /**
     * Unique identifier of the old disposition associated with this Leadping disposition export row.
     */
    private String oldDispositionId;
    /**
     * Old disposition outcome associated with this Leadping disposition export row.
     */
    private String oldDispositionOutcome;
    /**
     * Old disposition type classification for this Leadping disposition export row.
     */
    private String oldDispositionType;
    /**
     * The outcome value for this disposition export row.
     */
    private String outcome;
    /**
     * Human-readable explanation for the current disposition export row outcome.
     */
    private String reason;
    /**
     * The related call event ID associated with this disposition export row.
     */
    private String relatedCallEventId;
    /**
     * The source ID associated with this disposition export row.
     */
    private String sourceId;
    /**
     * The date and time for the task due at value on this disposition export row.
     */
    private OffsetDateTime taskDueAt;
    /**
     * The type classification for this disposition export row.
     */
    private String type;
    /**
     * The date and time for the updated at value on this disposition export row.
     */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new {@link DispositionExportRow} and sets the default values.
     */
    public DispositionExportRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DispositionExportRow}
     */
    @jakarta.annotation.Nonnull
    public static DispositionExportRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DispositionExportRow();
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
     * Gets the appointmentEndAt property value. The date and time for the appointment end at value on this disposition export row.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAppointmentEndAt() {
        return this.appointmentEndAt;
    }
    /**
     * Gets the appointmentStartAt property value. The date and time for the appointment start at value on this disposition export row.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAppointmentStartAt() {
        return this.appointmentStartAt;
    }
    /**
     * Gets the assignedToUserId property value. The assigned to user ID associated with this disposition export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedToUserId() {
        return this.assignedToUserId;
    }
    /**
     * Gets the callbackAt property value. The date and time for the callback at value on this disposition export row.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCallbackAt() {
        return this.callbackAt;
    }
    /**
     * Gets the category property value. Controlled disposition categories used for reporting, automation, and analytics.
     * @return a {@link DispositionExportRowCategory}
     */
    @jakarta.annotation.Nullable
    public DispositionExportRowCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the changedAt property value. Date and time when the disposition change occurred.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getChangedAt() {
        return this.changedAt;
    }
    /**
     * Gets the changedByAutomationId property value. Unique identifier of the automation that changed the disposition, when applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChangedByAutomationId() {
        return this.changedByAutomationId;
    }
    /**
     * Gets the changedByUserId property value. Unique identifier of the Leadping user who made the change.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChangedByUserId() {
        return this.changedByUserId;
    }
    /**
     * Gets the changeSource property value. Known sources that can change a lead&apos;s current disposition.
     * @return a {@link DispositionExportRowChangeSource}
     */
    @jakarta.annotation.Nullable
    public DispositionExportRowChangeSource getChangeSource() {
        return this.changeSource;
    }
    /**
     * Gets the createdAt property value. The date and time for the created at value on this disposition export row.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the dispositionId property value. The disposition ID associated with this disposition export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDispositionId() {
        return this.dispositionId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(26);
        deserializerMap.put("appointmentEndAt", (n) -> { this.setAppointmentEndAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("appointmentStartAt", (n) -> { this.setAppointmentStartAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("assignedToUserId", (n) -> { this.setAssignedToUserId(n.getStringValue()); });
        deserializerMap.put("callbackAt", (n) -> { this.setCallbackAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(DispositionExportRowCategory::forValue)); });
        deserializerMap.put("changedAt", (n) -> { this.setChangedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("changedByAutomationId", (n) -> { this.setChangedByAutomationId(n.getStringValue()); });
        deserializerMap.put("changedByUserId", (n) -> { this.setChangedByUserId(n.getStringValue()); });
        deserializerMap.put("changeSource", (n) -> { this.setChangeSource(n.getEnumValue(DispositionExportRowChangeSource::forValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dispositionId", (n) -> { this.setDispositionId(n.getStringValue()); });
        deserializerMap.put("followUpStatus", (n) -> { this.setFollowUpStatus(n.getStringValue()); });
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
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("updatedAt", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the followUpStatus property value. The current follow up status for this disposition export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFollowUpStatus() {
        return this.followUpStatus;
    }
    /**
     * Gets the isMissedCallFollowUp property value. Whether this disposition export row is missed call follow up.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMissedCallFollowUp() {
        return this.isMissedCallFollowUp;
    }
    /**
     * Gets the leadId property value. The lead ID associated with this disposition export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the newDispositionId property value. Unique identifier of the new disposition associated with this Leadping disposition export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNewDispositionId() {
        return this.newDispositionId;
    }
    /**
     * Gets the notes property value. The operator or customer notes recorded for this disposition export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the oldDispositionId property value. Unique identifier of the old disposition associated with this Leadping disposition export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOldDispositionId() {
        return this.oldDispositionId;
    }
    /**
     * Gets the oldDispositionOutcome property value. Old disposition outcome associated with this Leadping disposition export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOldDispositionOutcome() {
        return this.oldDispositionOutcome;
    }
    /**
     * Gets the oldDispositionType property value. Old disposition type classification for this Leadping disposition export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOldDispositionType() {
        return this.oldDispositionType;
    }
    /**
     * Gets the outcome property value. The outcome value for this disposition export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOutcome() {
        return this.outcome;
    }
    /**
     * Gets the reason property value. Human-readable explanation for the current disposition export row outcome.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the relatedCallEventId property value. The related call event ID associated with this disposition export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRelatedCallEventId() {
        return this.relatedCallEventId;
    }
    /**
     * Gets the sourceId property value. The source ID associated with this disposition export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.sourceId;
    }
    /**
     * Gets the taskDueAt property value. The date and time for the task due at value on this disposition export row.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTaskDueAt() {
        return this.taskDueAt;
    }
    /**
     * Gets the type property value. The type classification for this disposition export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the updatedAt property value. The date and time for the updated at value on this disposition export row.
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
        writer.writeOffsetDateTimeValue("appointmentStartAt", this.getAppointmentStartAt());
        writer.writeStringValue("assignedToUserId", this.getAssignedToUserId());
        writer.writeOffsetDateTimeValue("callbackAt", this.getCallbackAt());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeOffsetDateTimeValue("changedAt", this.getChangedAt());
        writer.writeStringValue("changedByAutomationId", this.getChangedByAutomationId());
        writer.writeStringValue("changedByUserId", this.getChangedByUserId());
        writer.writeEnumValue("changeSource", this.getChangeSource());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("dispositionId", this.getDispositionId());
        writer.writeStringValue("followUpStatus", this.getFollowUpStatus());
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
     * Sets the appointmentEndAt property value. The date and time for the appointment end at value on this disposition export row.
     * @param value Value to set for the appointmentEndAt property.
     */
    public void setAppointmentEndAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.appointmentEndAt = value;
    }
    /**
     * Sets the appointmentStartAt property value. The date and time for the appointment start at value on this disposition export row.
     * @param value Value to set for the appointmentStartAt property.
     */
    public void setAppointmentStartAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.appointmentStartAt = value;
    }
    /**
     * Sets the assignedToUserId property value. The assigned to user ID associated with this disposition export row.
     * @param value Value to set for the assignedToUserId property.
     */
    public void setAssignedToUserId(@jakarta.annotation.Nullable final String value) {
        this.assignedToUserId = value;
    }
    /**
     * Sets the callbackAt property value. The date and time for the callback at value on this disposition export row.
     * @param value Value to set for the callbackAt property.
     */
    public void setCallbackAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.callbackAt = value;
    }
    /**
     * Sets the category property value. Controlled disposition categories used for reporting, automation, and analytics.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final DispositionExportRowCategory value) {
        this.category = value;
    }
    /**
     * Sets the changedAt property value. Date and time when the disposition change occurred.
     * @param value Value to set for the changedAt property.
     */
    public void setChangedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.changedAt = value;
    }
    /**
     * Sets the changedByAutomationId property value. Unique identifier of the automation that changed the disposition, when applicable.
     * @param value Value to set for the changedByAutomationId property.
     */
    public void setChangedByAutomationId(@jakarta.annotation.Nullable final String value) {
        this.changedByAutomationId = value;
    }
    /**
     * Sets the changedByUserId property value. Unique identifier of the Leadping user who made the change.
     * @param value Value to set for the changedByUserId property.
     */
    public void setChangedByUserId(@jakarta.annotation.Nullable final String value) {
        this.changedByUserId = value;
    }
    /**
     * Sets the changeSource property value. Known sources that can change a lead&apos;s current disposition.
     * @param value Value to set for the changeSource property.
     */
    public void setChangeSource(@jakarta.annotation.Nullable final DispositionExportRowChangeSource value) {
        this.changeSource = value;
    }
    /**
     * Sets the createdAt property value. The date and time for the created at value on this disposition export row.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the dispositionId property value. The disposition ID associated with this disposition export row.
     * @param value Value to set for the dispositionId property.
     */
    public void setDispositionId(@jakarta.annotation.Nullable final String value) {
        this.dispositionId = value;
    }
    /**
     * Sets the followUpStatus property value. The current follow up status for this disposition export row.
     * @param value Value to set for the followUpStatus property.
     */
    public void setFollowUpStatus(@jakarta.annotation.Nullable final String value) {
        this.followUpStatus = value;
    }
    /**
     * Sets the isMissedCallFollowUp property value. Whether this disposition export row is missed call follow up.
     * @param value Value to set for the isMissedCallFollowUp property.
     */
    public void setIsMissedCallFollowUp(@jakarta.annotation.Nullable final Boolean value) {
        this.isMissedCallFollowUp = value;
    }
    /**
     * Sets the leadId property value. The lead ID associated with this disposition export row.
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the newDispositionId property value. Unique identifier of the new disposition associated with this Leadping disposition export row.
     * @param value Value to set for the newDispositionId property.
     */
    public void setNewDispositionId(@jakarta.annotation.Nullable final String value) {
        this.newDispositionId = value;
    }
    /**
     * Sets the notes property value. The operator or customer notes recorded for this disposition export row.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the oldDispositionId property value. Unique identifier of the old disposition associated with this Leadping disposition export row.
     * @param value Value to set for the oldDispositionId property.
     */
    public void setOldDispositionId(@jakarta.annotation.Nullable final String value) {
        this.oldDispositionId = value;
    }
    /**
     * Sets the oldDispositionOutcome property value. Old disposition outcome associated with this Leadping disposition export row.
     * @param value Value to set for the oldDispositionOutcome property.
     */
    public void setOldDispositionOutcome(@jakarta.annotation.Nullable final String value) {
        this.oldDispositionOutcome = value;
    }
    /**
     * Sets the oldDispositionType property value. Old disposition type classification for this Leadping disposition export row.
     * @param value Value to set for the oldDispositionType property.
     */
    public void setOldDispositionType(@jakarta.annotation.Nullable final String value) {
        this.oldDispositionType = value;
    }
    /**
     * Sets the outcome property value. The outcome value for this disposition export row.
     * @param value Value to set for the outcome property.
     */
    public void setOutcome(@jakarta.annotation.Nullable final String value) {
        this.outcome = value;
    }
    /**
     * Sets the reason property value. Human-readable explanation for the current disposition export row outcome.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the relatedCallEventId property value. The related call event ID associated with this disposition export row.
     * @param value Value to set for the relatedCallEventId property.
     */
    public void setRelatedCallEventId(@jakarta.annotation.Nullable final String value) {
        this.relatedCallEventId = value;
    }
    /**
     * Sets the sourceId property value. The source ID associated with this disposition export row.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.sourceId = value;
    }
    /**
     * Sets the taskDueAt property value. The date and time for the task due at value on this disposition export row.
     * @param value Value to set for the taskDueAt property.
     */
    public void setTaskDueAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.taskDueAt = value;
    }
    /**
     * Sets the type property value. The type classification for this disposition export row.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the updatedAt property value. The date and time for the updated at value on this disposition export row.
     * @param value Value to set for the updatedAt property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
}
