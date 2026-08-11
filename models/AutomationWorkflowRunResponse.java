package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * User-safe automation workflow run status returned for a lead.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationWorkflowRunResponse implements AdditionalDataHolder, Parsable {
    /**
     * Collection of actions included with this Leadping automation workflow run.
     */
    private java.util.List<AutomationWorkflowActionResponse> actions;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Identifier and display name of the related automation.
     */
    private AutomationWorkflowRunResponseAutomation automation;
    /**
     * Date and time when the automation workflow run was cancelled.
     */
    private OffsetDateTime cancelledAt;
    /**
     * Date and time when the automation workflow run completed.
     */
    private OffsetDateTime completedAt;
    /**
     * Identifier and display name of the workflow step currently awaiting or performing work.
     */
    private AutomationWorkflowRunResponseCurrentStep currentStep;
    /**
     * Current step order associated with this Leadping automation workflow run.
     */
    private UntypedNode currentStepOrder;
    /**
     * Collection of events included with this Leadping automation workflow run.
     */
    private java.util.List<AutomationWorkflowEventResponse> events;
    /**
     * Date and time when the automation workflow run failed.
     */
    private OffsetDateTime failedAt;
    /**
     * Unique Leadping identifier for the automation workflow run.
     */
    private String id;
    /**
     * Human-readable last action summary for this Leadping automation workflow run.
     */
    private String lastActionSummary;
    /**
     * Machine-readable code for the most recent workflow execution error.
     */
    private String lastErrorCode;
    /**
     * Human-readable last error message for this Leadping automation workflow run.
     */
    private String lastErrorMessage;
    /**
     * Date and time of the most recent execution for this Leadping automation workflow run.
     */
    private OffsetDateTime lastExecutionAt;
    /**
     * Unique identifier of the lead associated with this Leadping automation workflow run.
     */
    private String leadId;
    /**
     * Total number of max retry records represented by this Leadping automation workflow run.
     */
    private UntypedNode maxRetryCount;
    /**
     * Date and time when the next execution is scheduled.
     */
    private OffsetDateTime nextExecutionAt;
    /**
     * Date and time when the next retry is scheduled.
     */
    private OffsetDateTime nextRetryAt;
    /**
     * Unique identifier of the organization associated with this Leadping automation workflow run.
     */
    private String organizationId;
    /**
     * Total number of retry records represented by this Leadping automation workflow run.
     */
    private UntypedNode retryCount;
    /**
     * Machine-readable code explaining why the workflow run or action was skipped.
     */
    private String skipReasonCode;
    /**
     * Human-readable skip reason display for this Leadping automation workflow run.
     */
    private String skipReasonDisplay;
    /**
     * Date and time when the automation workflow run started.
     */
    private OffsetDateTime startedAt;
    /**
     * Current status for this Leadping automation workflow run.
     */
    private String status;
    /**
     * Human-readable status display for this Leadping automation workflow run.
     */
    private String statusDisplay;
    /**
     * Human-readable trigger display for this Leadping automation workflow run.
     */
    private String triggerDisplay;
    /**
     * Trigger type classification for this Leadping automation workflow run.
     */
    private String triggerType;
    /**
     * Date and time when the automation workflow run was last updated.
     */
    private OffsetDateTime updatedAt;
    /**
     * Instantiates a new {@link AutomationWorkflowRunResponse} and sets the default values.
     */
    public AutomationWorkflowRunResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationWorkflowRunResponse}
     */
    @jakarta.annotation.Nonnull
    public static AutomationWorkflowRunResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationWorkflowRunResponse();
    }
    /**
     * Gets the actions property value. Collection of actions included with this Leadping automation workflow run.
     * @return a {@link java.util.List<AutomationWorkflowActionResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AutomationWorkflowActionResponse> getActions() {
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
     * Gets the automation property value. Identifier and display name of the related automation.
     * @return a {@link AutomationWorkflowRunResponseAutomation}
     */
    @jakarta.annotation.Nullable
    public AutomationWorkflowRunResponseAutomation getAutomation() {
        return this.automation;
    }
    /**
     * Gets the cancelledAt property value. Date and time when the automation workflow run was cancelled.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCancelledAt() {
        return this.cancelledAt;
    }
    /**
     * Gets the completedAt property value. Date and time when the automation workflow run completed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedAt() {
        return this.completedAt;
    }
    /**
     * Gets the currentStep property value. Identifier and display name of the workflow step currently awaiting or performing work.
     * @return a {@link AutomationWorkflowRunResponseCurrentStep}
     */
    @jakarta.annotation.Nullable
    public AutomationWorkflowRunResponseCurrentStep getCurrentStep() {
        return this.currentStep;
    }
    /**
     * Gets the currentStepOrder property value. Current step order associated with this Leadping automation workflow run.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCurrentStepOrder() {
        return this.currentStepOrder;
    }
    /**
     * Gets the events property value. Collection of events included with this Leadping automation workflow run.
     * @return a {@link java.util.List<AutomationWorkflowEventResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AutomationWorkflowEventResponse> getEvents() {
        return this.events;
    }
    /**
     * Gets the failedAt property value. Date and time when the automation workflow run failed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFailedAt() {
        return this.failedAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(27);
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfObjectValues(AutomationWorkflowActionResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("automation", (n) -> { this.setAutomation(n.getObjectValue(AutomationWorkflowRunResponseAutomation::createFromDiscriminatorValue)); });
        deserializerMap.put("cancelledAt", (n) -> { this.setCancelledAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("completedAt", (n) -> { this.setCompletedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("currentStep", (n) -> { this.setCurrentStep(n.getObjectValue(AutomationWorkflowRunResponseCurrentStep::createFromDiscriminatorValue)); });
        deserializerMap.put("currentStepOrder", (n) -> { this.setCurrentStepOrder(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("events", (n) -> { this.setEvents(n.getCollectionOfObjectValues(AutomationWorkflowEventResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("failedAt", (n) -> { this.setFailedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("lastActionSummary", (n) -> { this.setLastActionSummary(n.getStringValue()); });
        deserializerMap.put("lastErrorCode", (n) -> { this.setLastErrorCode(n.getStringValue()); });
        deserializerMap.put("lastErrorMessage", (n) -> { this.setLastErrorMessage(n.getStringValue()); });
        deserializerMap.put("lastExecutionAt", (n) -> { this.setLastExecutionAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("maxRetryCount", (n) -> { this.setMaxRetryCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("nextExecutionAt", (n) -> { this.setNextExecutionAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("nextRetryAt", (n) -> { this.setNextRetryAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("organizationId", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("retryCount", (n) -> { this.setRetryCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("skipReasonCode", (n) -> { this.setSkipReasonCode(n.getStringValue()); });
        deserializerMap.put("skipReasonDisplay", (n) -> { this.setSkipReasonDisplay(n.getStringValue()); });
        deserializerMap.put("startedAt", (n) -> { this.setStartedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("statusDisplay", (n) -> { this.setStatusDisplay(n.getStringValue()); });
        deserializerMap.put("triggerDisplay", (n) -> { this.setTriggerDisplay(n.getStringValue()); });
        deserializerMap.put("triggerType", (n) -> { this.setTriggerType(n.getStringValue()); });
        deserializerMap.put("updatedAt", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for the automation workflow run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the lastActionSummary property value. Human-readable last action summary for this Leadping automation workflow run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastActionSummary() {
        return this.lastActionSummary;
    }
    /**
     * Gets the lastErrorCode property value. Machine-readable code for the most recent workflow execution error.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastErrorCode() {
        return this.lastErrorCode;
    }
    /**
     * Gets the lastErrorMessage property value. Human-readable last error message for this Leadping automation workflow run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastErrorMessage() {
        return this.lastErrorMessage;
    }
    /**
     * Gets the lastExecutionAt property value. Date and time of the most recent execution for this Leadping automation workflow run.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastExecutionAt() {
        return this.lastExecutionAt;
    }
    /**
     * Gets the leadId property value. Unique identifier of the lead associated with this Leadping automation workflow run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the maxRetryCount property value. Total number of max retry records represented by this Leadping automation workflow run.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getMaxRetryCount() {
        return this.maxRetryCount;
    }
    /**
     * Gets the nextExecutionAt property value. Date and time when the next execution is scheduled.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextExecutionAt() {
        return this.nextExecutionAt;
    }
    /**
     * Gets the nextRetryAt property value. Date and time when the next retry is scheduled.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextRetryAt() {
        return this.nextRetryAt;
    }
    /**
     * Gets the organizationId property value. Unique identifier of the organization associated with this Leadping automation workflow run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationId() {
        return this.organizationId;
    }
    /**
     * Gets the retryCount property value. Total number of retry records represented by this Leadping automation workflow run.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getRetryCount() {
        return this.retryCount;
    }
    /**
     * Gets the skipReasonCode property value. Machine-readable code explaining why the workflow run or action was skipped.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSkipReasonCode() {
        return this.skipReasonCode;
    }
    /**
     * Gets the skipReasonDisplay property value. Human-readable skip reason display for this Leadping automation workflow run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSkipReasonDisplay() {
        return this.skipReasonDisplay;
    }
    /**
     * Gets the startedAt property value. Date and time when the automation workflow run started.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartedAt() {
        return this.startedAt;
    }
    /**
     * Gets the status property value. Current status for this Leadping automation workflow run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the statusDisplay property value. Human-readable status display for this Leadping automation workflow run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusDisplay() {
        return this.statusDisplay;
    }
    /**
     * Gets the triggerDisplay property value. Human-readable trigger display for this Leadping automation workflow run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTriggerDisplay() {
        return this.triggerDisplay;
    }
    /**
     * Gets the triggerType property value. Trigger type classification for this Leadping automation workflow run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTriggerType() {
        return this.triggerType;
    }
    /**
     * Gets the updatedAt property value. Date and time when the automation workflow run was last updated.
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
        writer.writeCollectionOfObjectValues("actions", this.getActions());
        writer.writeObjectValue("automation", this.getAutomation());
        writer.writeOffsetDateTimeValue("cancelledAt", this.getCancelledAt());
        writer.writeOffsetDateTimeValue("completedAt", this.getCompletedAt());
        writer.writeObjectValue("currentStep", this.getCurrentStep());
        writer.writeObjectValue("currentStepOrder", this.getCurrentStepOrder());
        writer.writeCollectionOfObjectValues("events", this.getEvents());
        writer.writeOffsetDateTimeValue("failedAt", this.getFailedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("lastActionSummary", this.getLastActionSummary());
        writer.writeStringValue("lastErrorCode", this.getLastErrorCode());
        writer.writeStringValue("lastErrorMessage", this.getLastErrorMessage());
        writer.writeOffsetDateTimeValue("lastExecutionAt", this.getLastExecutionAt());
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeObjectValue("maxRetryCount", this.getMaxRetryCount());
        writer.writeOffsetDateTimeValue("nextExecutionAt", this.getNextExecutionAt());
        writer.writeOffsetDateTimeValue("nextRetryAt", this.getNextRetryAt());
        writer.writeStringValue("organizationId", this.getOrganizationId());
        writer.writeObjectValue("retryCount", this.getRetryCount());
        writer.writeStringValue("skipReasonCode", this.getSkipReasonCode());
        writer.writeStringValue("skipReasonDisplay", this.getSkipReasonDisplay());
        writer.writeOffsetDateTimeValue("startedAt", this.getStartedAt());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("statusDisplay", this.getStatusDisplay());
        writer.writeStringValue("triggerDisplay", this.getTriggerDisplay());
        writer.writeStringValue("triggerType", this.getTriggerType());
        writer.writeOffsetDateTimeValue("updatedAt", this.getUpdatedAt());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actions property value. Collection of actions included with this Leadping automation workflow run.
     * @param value Value to set for the actions property.
     */
    public void setActions(@jakarta.annotation.Nullable final java.util.List<AutomationWorkflowActionResponse> value) {
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
     * Sets the automation property value. Identifier and display name of the related automation.
     * @param value Value to set for the automation property.
     */
    public void setAutomation(@jakarta.annotation.Nullable final AutomationWorkflowRunResponseAutomation value) {
        this.automation = value;
    }
    /**
     * Sets the cancelledAt property value. Date and time when the automation workflow run was cancelled.
     * @param value Value to set for the cancelledAt property.
     */
    public void setCancelledAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.cancelledAt = value;
    }
    /**
     * Sets the completedAt property value. Date and time when the automation workflow run completed.
     * @param value Value to set for the completedAt property.
     */
    public void setCompletedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completedAt = value;
    }
    /**
     * Sets the currentStep property value. Identifier and display name of the workflow step currently awaiting or performing work.
     * @param value Value to set for the currentStep property.
     */
    public void setCurrentStep(@jakarta.annotation.Nullable final AutomationWorkflowRunResponseCurrentStep value) {
        this.currentStep = value;
    }
    /**
     * Sets the currentStepOrder property value. Current step order associated with this Leadping automation workflow run.
     * @param value Value to set for the currentStepOrder property.
     */
    public void setCurrentStepOrder(@jakarta.annotation.Nullable final UntypedNode value) {
        this.currentStepOrder = value;
    }
    /**
     * Sets the events property value. Collection of events included with this Leadping automation workflow run.
     * @param value Value to set for the events property.
     */
    public void setEvents(@jakarta.annotation.Nullable final java.util.List<AutomationWorkflowEventResponse> value) {
        this.events = value;
    }
    /**
     * Sets the failedAt property value. Date and time when the automation workflow run failed.
     * @param value Value to set for the failedAt property.
     */
    public void setFailedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.failedAt = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for the automation workflow run.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the lastActionSummary property value. Human-readable last action summary for this Leadping automation workflow run.
     * @param value Value to set for the lastActionSummary property.
     */
    public void setLastActionSummary(@jakarta.annotation.Nullable final String value) {
        this.lastActionSummary = value;
    }
    /**
     * Sets the lastErrorCode property value. Machine-readable code for the most recent workflow execution error.
     * @param value Value to set for the lastErrorCode property.
     */
    public void setLastErrorCode(@jakarta.annotation.Nullable final String value) {
        this.lastErrorCode = value;
    }
    /**
     * Sets the lastErrorMessage property value. Human-readable last error message for this Leadping automation workflow run.
     * @param value Value to set for the lastErrorMessage property.
     */
    public void setLastErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.lastErrorMessage = value;
    }
    /**
     * Sets the lastExecutionAt property value. Date and time of the most recent execution for this Leadping automation workflow run.
     * @param value Value to set for the lastExecutionAt property.
     */
    public void setLastExecutionAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastExecutionAt = value;
    }
    /**
     * Sets the leadId property value. Unique identifier of the lead associated with this Leadping automation workflow run.
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the maxRetryCount property value. Total number of max retry records represented by this Leadping automation workflow run.
     * @param value Value to set for the maxRetryCount property.
     */
    public void setMaxRetryCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.maxRetryCount = value;
    }
    /**
     * Sets the nextExecutionAt property value. Date and time when the next execution is scheduled.
     * @param value Value to set for the nextExecutionAt property.
     */
    public void setNextExecutionAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.nextExecutionAt = value;
    }
    /**
     * Sets the nextRetryAt property value. Date and time when the next retry is scheduled.
     * @param value Value to set for the nextRetryAt property.
     */
    public void setNextRetryAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.nextRetryAt = value;
    }
    /**
     * Sets the organizationId property value. Unique identifier of the organization associated with this Leadping automation workflow run.
     * @param value Value to set for the organizationId property.
     */
    public void setOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.organizationId = value;
    }
    /**
     * Sets the retryCount property value. Total number of retry records represented by this Leadping automation workflow run.
     * @param value Value to set for the retryCount property.
     */
    public void setRetryCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.retryCount = value;
    }
    /**
     * Sets the skipReasonCode property value. Machine-readable code explaining why the workflow run or action was skipped.
     * @param value Value to set for the skipReasonCode property.
     */
    public void setSkipReasonCode(@jakarta.annotation.Nullable final String value) {
        this.skipReasonCode = value;
    }
    /**
     * Sets the skipReasonDisplay property value. Human-readable skip reason display for this Leadping automation workflow run.
     * @param value Value to set for the skipReasonDisplay property.
     */
    public void setSkipReasonDisplay(@jakarta.annotation.Nullable final String value) {
        this.skipReasonDisplay = value;
    }
    /**
     * Sets the startedAt property value. Date and time when the automation workflow run started.
     * @param value Value to set for the startedAt property.
     */
    public void setStartedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startedAt = value;
    }
    /**
     * Sets the status property value. Current status for this Leadping automation workflow run.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the statusDisplay property value. Human-readable status display for this Leadping automation workflow run.
     * @param value Value to set for the statusDisplay property.
     */
    public void setStatusDisplay(@jakarta.annotation.Nullable final String value) {
        this.statusDisplay = value;
    }
    /**
     * Sets the triggerDisplay property value. Human-readable trigger display for this Leadping automation workflow run.
     * @param value Value to set for the triggerDisplay property.
     */
    public void setTriggerDisplay(@jakarta.annotation.Nullable final String value) {
        this.triggerDisplay = value;
    }
    /**
     * Sets the triggerType property value. Trigger type classification for this Leadping automation workflow run.
     * @param value Value to set for the triggerType property.
     */
    public void setTriggerType(@jakarta.annotation.Nullable final String value) {
        this.triggerType = value;
    }
    /**
     * Sets the updatedAt property value. Date and time when the automation workflow run was last updated.
     * @param value Value to set for the updatedAt property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
}
