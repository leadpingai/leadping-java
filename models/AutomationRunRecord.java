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
 * History record schema for Leadping API automation run record data exposed in automation and audit views.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationRunRecord implements AdditionalDataHolder, Parsable {
    /**
     * Automation actions configured or returned for this workflow.
     */
    private java.util.List<AutomationActionRunRecord> actions;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Automation ID connected to this workflow, run, or event.
     */
    private String automationId;
    /**
     * Business ID that owns this automation run.
     */
    private String businessId;
    /**
     * UTC timestamp when processing completed for this automation run record.
     */
    private OffsetDateTime completedAt;
    /**
     * Snapshot of request context captured when this automation run record was created.
     */
    private AutomationRunRecordContextSnapshot contextSnapshot;
    /**
     * Error text returned while processing this automation run record.
     */
    private String error;
    /**
     * Idempotency key used to identify a unique automation workflow execution.
     */
    private String executionKey;
    /**
     * Execution mode used for automation preview or live workflow processing.
     */
    private String executionMode;
    /**
     * Machine-readable failure code for troubleshooting this automation run record.
     */
    private String failureCode;
    /**
     * Unique Leadping identifier for this automation run record.
     */
    private String id;
    /**
     * UTC timestamp when Leadping last attempted to process this automation run.
     */
    private OffsetDateTime lastAttemptAt;
    /**
     * Lead ID that triggered this automation run, when the run is lead-based.
     */
    private String leadId;
    /**
     * Number of processing attempts made for this workflow or delivery request.
     */
    private Integer processingAttempts;
    /**
     * Human-readable reason explaining why Leadping skipped this automation run.
     */
    private String skippedReason;
    /**
     * Source event ID that triggered this workflow or outbound delivery.
     */
    private String sourceEventId;
    /**
     * UTC timestamp when processing started for this automation run record.
     */
    private OffsetDateTime startedAt;
    /**
     * Current lifecycle status for this automation run record in the Leadping API.
     */
    private String status;
    /**
     * Automation trigger type that starts the workflow.
     */
    private String triggerType;
    /**
     * Instantiates a new {@link AutomationRunRecord} and sets the default values.
     */
    public AutomationRunRecord() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationRunRecord}
     */
    @jakarta.annotation.Nonnull
    public static AutomationRunRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationRunRecord();
    }
    /**
     * Gets the actions property value. Automation actions configured or returned for this workflow.
     * @return a {@link java.util.List<AutomationActionRunRecord>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AutomationActionRunRecord> getActions() {
        return this.actions;
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
     * Gets the automationId property value. Automation ID connected to this workflow, run, or event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAutomationId() {
        return this.automationId;
    }
    /**
     * Gets the businessId property value. Business ID that owns this automation run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the completedAt property value. UTC timestamp when processing completed for this automation run record.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedAt() {
        return this.completedAt;
    }
    /**
     * Gets the contextSnapshot property value. Snapshot of request context captured when this automation run record was created.
     * @return a {@link AutomationRunRecordContextSnapshot}
     */
    @jakarta.annotation.Nullable
    public AutomationRunRecordContextSnapshot getContextSnapshot() {
        return this.contextSnapshot;
    }
    /**
     * Gets the error property value. Error text returned while processing this automation run record.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getError() {
        return this.error;
    }
    /**
     * Gets the executionKey property value. Idempotency key used to identify a unique automation workflow execution.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExecutionKey() {
        return this.executionKey;
    }
    /**
     * Gets the executionMode property value. Execution mode used for automation preview or live workflow processing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExecutionMode() {
        return this.executionMode;
    }
    /**
     * Gets the failureCode property value. Machine-readable failure code for troubleshooting this automation run record.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFailureCode() {
        return this.failureCode;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfObjectValues(AutomationActionRunRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("automationId", (n) -> { this.setAutomationId(n.getStringValue()); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("completedAt", (n) -> { this.setCompletedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("contextSnapshot", (n) -> { this.setContextSnapshot(n.getObjectValue(AutomationRunRecordContextSnapshot::createFromDiscriminatorValue)); });
        deserializerMap.put("error", (n) -> { this.setError(n.getStringValue()); });
        deserializerMap.put("executionKey", (n) -> { this.setExecutionKey(n.getStringValue()); });
        deserializerMap.put("executionMode", (n) -> { this.setExecutionMode(n.getStringValue()); });
        deserializerMap.put("failureCode", (n) -> { this.setFailureCode(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("lastAttemptAt", (n) -> { this.setLastAttemptAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("processingAttempts", (n) -> { this.setProcessingAttempts(n.getIntegerValue()); });
        deserializerMap.put("skippedReason", (n) -> { this.setSkippedReason(n.getStringValue()); });
        deserializerMap.put("sourceEventId", (n) -> { this.setSourceEventId(n.getStringValue()); });
        deserializerMap.put("startedAt", (n) -> { this.setStartedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("triggerType", (n) -> { this.setTriggerType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this automation run record.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the lastAttemptAt property value. UTC timestamp when Leadping last attempted to process this automation run.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastAttemptAt() {
        return this.lastAttemptAt;
    }
    /**
     * Gets the leadId property value. Lead ID that triggered this automation run, when the run is lead-based.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the processingAttempts property value. Number of processing attempts made for this workflow or delivery request.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getProcessingAttempts() {
        return this.processingAttempts;
    }
    /**
     * Gets the skippedReason property value. Human-readable reason explaining why Leadping skipped this automation run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSkippedReason() {
        return this.skippedReason;
    }
    /**
     * Gets the sourceEventId property value. Source event ID that triggered this workflow or outbound delivery.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceEventId() {
        return this.sourceEventId;
    }
    /**
     * Gets the startedAt property value. UTC timestamp when processing started for this automation run record.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartedAt() {
        return this.startedAt;
    }
    /**
     * Gets the status property value. Current lifecycle status for this automation run record in the Leadping API.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the triggerType property value. Automation trigger type that starts the workflow.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTriggerType() {
        return this.triggerType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("actions", this.getActions());
        writer.writeStringValue("automationId", this.getAutomationId());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeOffsetDateTimeValue("completedAt", this.getCompletedAt());
        writer.writeObjectValue("contextSnapshot", this.getContextSnapshot());
        writer.writeStringValue("error", this.getError());
        writer.writeStringValue("executionKey", this.getExecutionKey());
        writer.writeStringValue("executionMode", this.getExecutionMode());
        writer.writeStringValue("failureCode", this.getFailureCode());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("lastAttemptAt", this.getLastAttemptAt());
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeIntegerValue("processingAttempts", this.getProcessingAttempts());
        writer.writeStringValue("skippedReason", this.getSkippedReason());
        writer.writeStringValue("sourceEventId", this.getSourceEventId());
        writer.writeOffsetDateTimeValue("startedAt", this.getStartedAt());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("triggerType", this.getTriggerType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actions property value. Automation actions configured or returned for this workflow.
     * @param value Value to set for the actions property.
     */
    public void setActions(@jakarta.annotation.Nullable final java.util.List<AutomationActionRunRecord> value) {
        this.actions = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the automationId property value. Automation ID connected to this workflow, run, or event.
     * @param value Value to set for the automationId property.
     */
    public void setAutomationId(@jakarta.annotation.Nullable final String value) {
        this.automationId = value;
    }
    /**
     * Sets the businessId property value. Business ID that owns this automation run.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the completedAt property value. UTC timestamp when processing completed for this automation run record.
     * @param value Value to set for the completedAt property.
     */
    public void setCompletedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completedAt = value;
    }
    /**
     * Sets the contextSnapshot property value. Snapshot of request context captured when this automation run record was created.
     * @param value Value to set for the contextSnapshot property.
     */
    public void setContextSnapshot(@jakarta.annotation.Nullable final AutomationRunRecordContextSnapshot value) {
        this.contextSnapshot = value;
    }
    /**
     * Sets the error property value. Error text returned while processing this automation run record.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final String value) {
        this.error = value;
    }
    /**
     * Sets the executionKey property value. Idempotency key used to identify a unique automation workflow execution.
     * @param value Value to set for the executionKey property.
     */
    public void setExecutionKey(@jakarta.annotation.Nullable final String value) {
        this.executionKey = value;
    }
    /**
     * Sets the executionMode property value. Execution mode used for automation preview or live workflow processing.
     * @param value Value to set for the executionMode property.
     */
    public void setExecutionMode(@jakarta.annotation.Nullable final String value) {
        this.executionMode = value;
    }
    /**
     * Sets the failureCode property value. Machine-readable failure code for troubleshooting this automation run record.
     * @param value Value to set for the failureCode property.
     */
    public void setFailureCode(@jakarta.annotation.Nullable final String value) {
        this.failureCode = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this automation run record.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the lastAttemptAt property value. UTC timestamp when Leadping last attempted to process this automation run.
     * @param value Value to set for the lastAttemptAt property.
     */
    public void setLastAttemptAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastAttemptAt = value;
    }
    /**
     * Sets the leadId property value. Lead ID that triggered this automation run, when the run is lead-based.
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the processingAttempts property value. Number of processing attempts made for this workflow or delivery request.
     * @param value Value to set for the processingAttempts property.
     */
    public void setProcessingAttempts(@jakarta.annotation.Nullable final Integer value) {
        this.processingAttempts = value;
    }
    /**
     * Sets the skippedReason property value. Human-readable reason explaining why Leadping skipped this automation run.
     * @param value Value to set for the skippedReason property.
     */
    public void setSkippedReason(@jakarta.annotation.Nullable final String value) {
        this.skippedReason = value;
    }
    /**
     * Sets the sourceEventId property value. Source event ID that triggered this workflow or outbound delivery.
     * @param value Value to set for the sourceEventId property.
     */
    public void setSourceEventId(@jakarta.annotation.Nullable final String value) {
        this.sourceEventId = value;
    }
    /**
     * Sets the startedAt property value. UTC timestamp when processing started for this automation run record.
     * @param value Value to set for the startedAt property.
     */
    public void setStartedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startedAt = value;
    }
    /**
     * Sets the status property value. Current lifecycle status for this automation run record in the Leadping API.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the triggerType property value. Automation trigger type that starts the workflow.
     * @param value Value to set for the triggerType property.
     */
    public void setTriggerType(@jakarta.annotation.Nullable final String value) {
        this.triggerType = value;
    }
}
