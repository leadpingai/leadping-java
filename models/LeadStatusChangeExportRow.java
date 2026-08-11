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
 * Describes lead status change export row data returned by Leadping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadStatusChangeExportRow implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * UTC timestamp for appointment end at on this lead status change export row.
     */
    private OffsetDateTime appointmentEndAt;
    /**
     * UTC timestamp for appointment start at on this lead status change export row.
     */
    private OffsetDateTime appointmentStartAt;
    /**
     * The assigned to user ID associated with this lead status change export row.
     */
    private String assignedToUserId;
    /**
     * UTC timestamp for callback at on this lead status change export row.
     */
    private OffsetDateTime callbackAt;
    /**
     * Controlled lead status change categories used for reporting, automation, and analytics.
     */
    private LeadStatusChangeExportRowCategory category;
    /**
     * Date and time when the lead status change change occurred.
     */
    private OffsetDateTime changedAt;
    /**
     * Unique identifier of the automation that changed the lead status change, when applicable.
     */
    private String changedByAutomationId;
    /**
     * Unique identifier of the Leadping user who made the change.
     */
    private String changedByUserId;
    /**
     * Known sources that can change a lead&apos;s current lead status change.
     */
    private LeadStatusChangeExportRowChangeSource changeSource;
    /**
     * UTC timestamp for created at on this lead status change export row.
     */
    private OffsetDateTime createdAt;
    /**
     * The current follow up status for this lead status change export row.
     */
    private String followUpStatus;
    /**
     * Whether this lead status change export row is missed call follow up.
     */
    private Boolean isMissedCallFollowUp;
    /**
     * The lead ID associated with this lead status change export row.
     */
    private String leadId;
    /**
     * The lead status change ID associated with this lead status change export row.
     */
    private String leadStatusChangeId;
    /**
     * Unique identifier of the new lead status change associated with this Leadping lead status change export row.
     */
    private String newLeadStatusChangeId;
    /**
     * The operator or customer notes recorded for this lead status change export row.
     */
    private String notes;
    /**
     * Unique identifier of the old lead status change associated with this Leadping lead status change export row.
     */
    private String oldLeadStatusChangeId;
    /**
     * Old lead status change outcome associated with this Leadping lead status change export row.
     */
    private String oldLeadStatusChangeOutcome;
    /**
     * Old lead status change type classification for this Leadping lead status change export row.
     */
    private String oldLeadStatusChangeType;
    /**
     * Result of the interaction or workflow step represented by this exported row.
     */
    private String outcome;
    /**
     * Human-readable explanation for the current lead status change export row outcome.
     */
    private String reason;
    /**
     * The related call event ID associated with this lead status change export row.
     */
    private String relatedCallEventId;
    /**
     * The source ID associated with this lead status change export row.
     */
    private String sourceId;
    /**
     * UTC timestamp for task due at on this lead status change export row.
     */
    private OffsetDateTime taskDueAt;
    /**
     * Category of status change represented by this exported row.
     */
    private String type;
    /**
     * UTC timestamp for updated at on this lead status change export row.
     */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new {@link LeadStatusChangeExportRow} and sets the default values.
     */
    public LeadStatusChangeExportRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadStatusChangeExportRow}
     */
    @jakarta.annotation.Nonnull
    public static LeadStatusChangeExportRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadStatusChangeExportRow();
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
     * Gets the appointmentEndAt property value. UTC timestamp for appointment end at on this lead status change export row.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAppointmentEndAt() {
        return this.appointmentEndAt;
    }
    /**
     * Gets the appointmentStartAt property value. UTC timestamp for appointment start at on this lead status change export row.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAppointmentStartAt() {
        return this.appointmentStartAt;
    }
    /**
     * Gets the assignedToUserId property value. The assigned to user ID associated with this lead status change export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedToUserId() {
        return this.assignedToUserId;
    }
    /**
     * Gets the callbackAt property value. UTC timestamp for callback at on this lead status change export row.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCallbackAt() {
        return this.callbackAt;
    }
    /**
     * Gets the category property value. Controlled lead status change categories used for reporting, automation, and analytics.
     * @return a {@link LeadStatusChangeExportRowCategory}
     */
    @jakarta.annotation.Nullable
    public LeadStatusChangeExportRowCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the changedAt property value. Date and time when the lead status change change occurred.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getChangedAt() {
        return this.changedAt;
    }
    /**
     * Gets the changedByAutomationId property value. Unique identifier of the automation that changed the lead status change, when applicable.
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
     * Gets the changeSource property value. Known sources that can change a lead&apos;s current lead status change.
     * @return a {@link LeadStatusChangeExportRowChangeSource}
     */
    @jakarta.annotation.Nullable
    public LeadStatusChangeExportRowChangeSource getChangeSource() {
        return this.changeSource;
    }
    /**
     * Gets the createdAt property value. UTC timestamp for created at on this lead status change export row.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(26);
        deserializerMap.put("appointmentEndAt", (n) -> { this.setAppointmentEndAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("appointmentStartAt", (n) -> { this.setAppointmentStartAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("assignedToUserId", (n) -> { this.setAssignedToUserId(n.getStringValue()); });
        deserializerMap.put("callbackAt", (n) -> { this.setCallbackAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(LeadStatusChangeExportRowCategory::forValue)); });
        deserializerMap.put("changedAt", (n) -> { this.setChangedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("changedByAutomationId", (n) -> { this.setChangedByAutomationId(n.getStringValue()); });
        deserializerMap.put("changedByUserId", (n) -> { this.setChangedByUserId(n.getStringValue()); });
        deserializerMap.put("changeSource", (n) -> { this.setChangeSource(n.getEnumValue(LeadStatusChangeExportRowChangeSource::forValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("followUpStatus", (n) -> { this.setFollowUpStatus(n.getStringValue()); });
        deserializerMap.put("isMissedCallFollowUp", (n) -> { this.setIsMissedCallFollowUp(n.getBooleanValue()); });
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("leadStatusChangeId", (n) -> { this.setLeadStatusChangeId(n.getStringValue()); });
        deserializerMap.put("newLeadStatusChangeId", (n) -> { this.setNewLeadStatusChangeId(n.getStringValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getStringValue()); });
        deserializerMap.put("oldLeadStatusChangeId", (n) -> { this.setOldLeadStatusChangeId(n.getStringValue()); });
        deserializerMap.put("oldLeadStatusChangeOutcome", (n) -> { this.setOldLeadStatusChangeOutcome(n.getStringValue()); });
        deserializerMap.put("oldLeadStatusChangeType", (n) -> { this.setOldLeadStatusChangeType(n.getStringValue()); });
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
     * Gets the followUpStatus property value. The current follow up status for this lead status change export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFollowUpStatus() {
        return this.followUpStatus;
    }
    /**
     * Gets the isMissedCallFollowUp property value. Whether this lead status change export row is missed call follow up.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMissedCallFollowUp() {
        return this.isMissedCallFollowUp;
    }
    /**
     * Gets the leadId property value. The lead ID associated with this lead status change export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the leadStatusChangeId property value. The lead status change ID associated with this lead status change export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadStatusChangeId() {
        return this.leadStatusChangeId;
    }
    /**
     * Gets the newLeadStatusChangeId property value. Unique identifier of the new lead status change associated with this Leadping lead status change export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNewLeadStatusChangeId() {
        return this.newLeadStatusChangeId;
    }
    /**
     * Gets the notes property value. The operator or customer notes recorded for this lead status change export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNotes() {
        return this.notes;
    }
    /**
     * Gets the oldLeadStatusChangeId property value. Unique identifier of the old lead status change associated with this Leadping lead status change export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOldLeadStatusChangeId() {
        return this.oldLeadStatusChangeId;
    }
    /**
     * Gets the oldLeadStatusChangeOutcome property value. Old lead status change outcome associated with this Leadping lead status change export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOldLeadStatusChangeOutcome() {
        return this.oldLeadStatusChangeOutcome;
    }
    /**
     * Gets the oldLeadStatusChangeType property value. Old lead status change type classification for this Leadping lead status change export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOldLeadStatusChangeType() {
        return this.oldLeadStatusChangeType;
    }
    /**
     * Gets the outcome property value. Result of the interaction or workflow step represented by this exported row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOutcome() {
        return this.outcome;
    }
    /**
     * Gets the reason property value. Human-readable explanation for the current lead status change export row outcome.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the relatedCallEventId property value. The related call event ID associated with this lead status change export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRelatedCallEventId() {
        return this.relatedCallEventId;
    }
    /**
     * Gets the sourceId property value. The source ID associated with this lead status change export row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.sourceId;
    }
    /**
     * Gets the taskDueAt property value. UTC timestamp for task due at on this lead status change export row.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTaskDueAt() {
        return this.taskDueAt;
    }
    /**
     * Gets the type property value. Category of status change represented by this exported row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the updatedAt property value. UTC timestamp for updated at on this lead status change export row.
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
        writer.writeStringValue("followUpStatus", this.getFollowUpStatus());
        writer.writeBooleanValue("isMissedCallFollowUp", this.getIsMissedCallFollowUp());
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeStringValue("leadStatusChangeId", this.getLeadStatusChangeId());
        writer.writeStringValue("newLeadStatusChangeId", this.getNewLeadStatusChangeId());
        writer.writeStringValue("notes", this.getNotes());
        writer.writeStringValue("oldLeadStatusChangeId", this.getOldLeadStatusChangeId());
        writer.writeStringValue("oldLeadStatusChangeOutcome", this.getOldLeadStatusChangeOutcome());
        writer.writeStringValue("oldLeadStatusChangeType", this.getOldLeadStatusChangeType());
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
     * Sets the appointmentEndAt property value. UTC timestamp for appointment end at on this lead status change export row.
     * @param value Value to set for the appointmentEndAt property.
     */
    public void setAppointmentEndAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.appointmentEndAt = value;
    }
    /**
     * Sets the appointmentStartAt property value. UTC timestamp for appointment start at on this lead status change export row.
     * @param value Value to set for the appointmentStartAt property.
     */
    public void setAppointmentStartAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.appointmentStartAt = value;
    }
    /**
     * Sets the assignedToUserId property value. The assigned to user ID associated with this lead status change export row.
     * @param value Value to set for the assignedToUserId property.
     */
    public void setAssignedToUserId(@jakarta.annotation.Nullable final String value) {
        this.assignedToUserId = value;
    }
    /**
     * Sets the callbackAt property value. UTC timestamp for callback at on this lead status change export row.
     * @param value Value to set for the callbackAt property.
     */
    public void setCallbackAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.callbackAt = value;
    }
    /**
     * Sets the category property value. Controlled lead status change categories used for reporting, automation, and analytics.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final LeadStatusChangeExportRowCategory value) {
        this.category = value;
    }
    /**
     * Sets the changedAt property value. Date and time when the lead status change change occurred.
     * @param value Value to set for the changedAt property.
     */
    public void setChangedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.changedAt = value;
    }
    /**
     * Sets the changedByAutomationId property value. Unique identifier of the automation that changed the lead status change, when applicable.
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
     * Sets the changeSource property value. Known sources that can change a lead&apos;s current lead status change.
     * @param value Value to set for the changeSource property.
     */
    public void setChangeSource(@jakarta.annotation.Nullable final LeadStatusChangeExportRowChangeSource value) {
        this.changeSource = value;
    }
    /**
     * Sets the createdAt property value. UTC timestamp for created at on this lead status change export row.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the followUpStatus property value. The current follow up status for this lead status change export row.
     * @param value Value to set for the followUpStatus property.
     */
    public void setFollowUpStatus(@jakarta.annotation.Nullable final String value) {
        this.followUpStatus = value;
    }
    /**
     * Sets the isMissedCallFollowUp property value. Whether this lead status change export row is missed call follow up.
     * @param value Value to set for the isMissedCallFollowUp property.
     */
    public void setIsMissedCallFollowUp(@jakarta.annotation.Nullable final Boolean value) {
        this.isMissedCallFollowUp = value;
    }
    /**
     * Sets the leadId property value. The lead ID associated with this lead status change export row.
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the leadStatusChangeId property value. The lead status change ID associated with this lead status change export row.
     * @param value Value to set for the leadStatusChangeId property.
     */
    public void setLeadStatusChangeId(@jakarta.annotation.Nullable final String value) {
        this.leadStatusChangeId = value;
    }
    /**
     * Sets the newLeadStatusChangeId property value. Unique identifier of the new lead status change associated with this Leadping lead status change export row.
     * @param value Value to set for the newLeadStatusChangeId property.
     */
    public void setNewLeadStatusChangeId(@jakarta.annotation.Nullable final String value) {
        this.newLeadStatusChangeId = value;
    }
    /**
     * Sets the notes property value. The operator or customer notes recorded for this lead status change export row.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final String value) {
        this.notes = value;
    }
    /**
     * Sets the oldLeadStatusChangeId property value. Unique identifier of the old lead status change associated with this Leadping lead status change export row.
     * @param value Value to set for the oldLeadStatusChangeId property.
     */
    public void setOldLeadStatusChangeId(@jakarta.annotation.Nullable final String value) {
        this.oldLeadStatusChangeId = value;
    }
    /**
     * Sets the oldLeadStatusChangeOutcome property value. Old lead status change outcome associated with this Leadping lead status change export row.
     * @param value Value to set for the oldLeadStatusChangeOutcome property.
     */
    public void setOldLeadStatusChangeOutcome(@jakarta.annotation.Nullable final String value) {
        this.oldLeadStatusChangeOutcome = value;
    }
    /**
     * Sets the oldLeadStatusChangeType property value. Old lead status change type classification for this Leadping lead status change export row.
     * @param value Value to set for the oldLeadStatusChangeType property.
     */
    public void setOldLeadStatusChangeType(@jakarta.annotation.Nullable final String value) {
        this.oldLeadStatusChangeType = value;
    }
    /**
     * Sets the outcome property value. Result of the interaction or workflow step represented by this exported row.
     * @param value Value to set for the outcome property.
     */
    public void setOutcome(@jakarta.annotation.Nullable final String value) {
        this.outcome = value;
    }
    /**
     * Sets the reason property value. Human-readable explanation for the current lead status change export row outcome.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the relatedCallEventId property value. The related call event ID associated with this lead status change export row.
     * @param value Value to set for the relatedCallEventId property.
     */
    public void setRelatedCallEventId(@jakarta.annotation.Nullable final String value) {
        this.relatedCallEventId = value;
    }
    /**
     * Sets the sourceId property value. The source ID associated with this lead status change export row.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.sourceId = value;
    }
    /**
     * Sets the taskDueAt property value. UTC timestamp for task due at on this lead status change export row.
     * @param value Value to set for the taskDueAt property.
     */
    public void setTaskDueAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.taskDueAt = value;
    }
    /**
     * Sets the type property value. Category of status change represented by this exported row.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the updatedAt property value. UTC timestamp for updated at on this lead status change export row.
     * @param value Value to set for the updatedAt property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
}
