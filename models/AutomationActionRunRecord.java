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
 * History record schema for Leadping API automation action run record data exposed in automation and audit views.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationActionRunRecord implements AdditionalDataHolder, Parsable {
    /**
     * Automation action ID executed or evaluated by this automation action run record.
     */
    private String actionId;
    /**
     * Automation action type, such as send SMS or create task.
     */
    private String actionType;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Automation run ID connected to this action or event record.
     */
    private String automationRunId;
    /**
     * UTC timestamp when processing completed for this automation action run record.
     */
    private OffsetDateTime completedAt;
    /**
     * UTC timestamp when processing failed for this automation action run record.
     */
    private OffsetDateTime failedAt;
    /**
     * Machine-readable failure code for troubleshooting this automation action run record.
     */
    private String failureCode;
    /**
     * Unique Leadping identifier for this automation action run record.
     */
    private String id;
    /**
     * UTC timestamp when Leadping will retry this automation action run record.
     */
    private OffsetDateTime nextRetryAt;
    /**
     * Sort order used to evaluate or display this automation action run record.
     */
    private Integer order;
    /**
     * Number of processing attempts made for this workflow or delivery request.
     */
    private Integer processingAttempts;
    /**
     * UTC timestamp when this automation action run record was scheduled.
     */
    private OffsetDateTime scheduledAt;
    /**
     * UTC timestamp when processing started for this automation action run record.
     */
    private OffsetDateTime startedAt;
    /**
     * Current lifecycle status for this automation action run record in the Leadping API.
     */
    private String status;
    /**
     * Instantiates a new {@link AutomationActionRunRecord} and sets the default values.
     */
    public AutomationActionRunRecord() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationActionRunRecord}
     */
    @jakarta.annotation.Nonnull
    public static AutomationActionRunRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationActionRunRecord();
    }
    /**
     * Gets the actionId property value. Automation action ID executed or evaluated by this automation action run record.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionId() {
        return this.actionId;
    }
    /**
     * Gets the actionType property value. Automation action type, such as send SMS or create task.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionType() {
        return this.actionType;
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
     * Gets the automationRunId property value. Automation run ID connected to this action or event record.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAutomationRunId() {
        return this.automationRunId;
    }
    /**
     * Gets the completedAt property value. UTC timestamp when processing completed for this automation action run record.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedAt() {
        return this.completedAt;
    }
    /**
     * Gets the failedAt property value. UTC timestamp when processing failed for this automation action run record.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFailedAt() {
        return this.failedAt;
    }
    /**
     * Gets the failureCode property value. Machine-readable failure code for troubleshooting this automation action run record.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("actionId", (n) -> { this.setActionId(n.getStringValue()); });
        deserializerMap.put("actionType", (n) -> { this.setActionType(n.getStringValue()); });
        deserializerMap.put("automationRunId", (n) -> { this.setAutomationRunId(n.getStringValue()); });
        deserializerMap.put("completedAt", (n) -> { this.setCompletedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failedAt", (n) -> { this.setFailedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failureCode", (n) -> { this.setFailureCode(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("nextRetryAt", (n) -> { this.setNextRetryAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("order", (n) -> { this.setOrder(n.getIntegerValue()); });
        deserializerMap.put("processingAttempts", (n) -> { this.setProcessingAttempts(n.getIntegerValue()); });
        deserializerMap.put("scheduledAt", (n) -> { this.setScheduledAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("startedAt", (n) -> { this.setStartedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this automation action run record.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the nextRetryAt property value. UTC timestamp when Leadping will retry this automation action run record.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextRetryAt() {
        return this.nextRetryAt;
    }
    /**
     * Gets the order property value. Sort order used to evaluate or display this automation action run record.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOrder() {
        return this.order;
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
     * Gets the scheduledAt property value. UTC timestamp when this automation action run record was scheduled.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getScheduledAt() {
        return this.scheduledAt;
    }
    /**
     * Gets the startedAt property value. UTC timestamp when processing started for this automation action run record.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartedAt() {
        return this.startedAt;
    }
    /**
     * Gets the status property value. Current lifecycle status for this automation action run record in the Leadping API.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionId", this.getActionId());
        writer.writeStringValue("actionType", this.getActionType());
        writer.writeStringValue("automationRunId", this.getAutomationRunId());
        writer.writeOffsetDateTimeValue("completedAt", this.getCompletedAt());
        writer.writeOffsetDateTimeValue("failedAt", this.getFailedAt());
        writer.writeStringValue("failureCode", this.getFailureCode());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("nextRetryAt", this.getNextRetryAt());
        writer.writeIntegerValue("order", this.getOrder());
        writer.writeIntegerValue("processingAttempts", this.getProcessingAttempts());
        writer.writeOffsetDateTimeValue("scheduledAt", this.getScheduledAt());
        writer.writeOffsetDateTimeValue("startedAt", this.getStartedAt());
        writer.writeStringValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionId property value. Automation action ID executed or evaluated by this automation action run record.
     * @param value Value to set for the actionId property.
     */
    public void setActionId(@jakarta.annotation.Nullable final String value) {
        this.actionId = value;
    }
    /**
     * Sets the actionType property value. Automation action type, such as send SMS or create task.
     * @param value Value to set for the actionType property.
     */
    public void setActionType(@jakarta.annotation.Nullable final String value) {
        this.actionType = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the automationRunId property value. Automation run ID connected to this action or event record.
     * @param value Value to set for the automationRunId property.
     */
    public void setAutomationRunId(@jakarta.annotation.Nullable final String value) {
        this.automationRunId = value;
    }
    /**
     * Sets the completedAt property value. UTC timestamp when processing completed for this automation action run record.
     * @param value Value to set for the completedAt property.
     */
    public void setCompletedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completedAt = value;
    }
    /**
     * Sets the failedAt property value. UTC timestamp when processing failed for this automation action run record.
     * @param value Value to set for the failedAt property.
     */
    public void setFailedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.failedAt = value;
    }
    /**
     * Sets the failureCode property value. Machine-readable failure code for troubleshooting this automation action run record.
     * @param value Value to set for the failureCode property.
     */
    public void setFailureCode(@jakarta.annotation.Nullable final String value) {
        this.failureCode = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this automation action run record.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the nextRetryAt property value. UTC timestamp when Leadping will retry this automation action run record.
     * @param value Value to set for the nextRetryAt property.
     */
    public void setNextRetryAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.nextRetryAt = value;
    }
    /**
     * Sets the order property value. Sort order used to evaluate or display this automation action run record.
     * @param value Value to set for the order property.
     */
    public void setOrder(@jakarta.annotation.Nullable final Integer value) {
        this.order = value;
    }
    /**
     * Sets the processingAttempts property value. Number of processing attempts made for this workflow or delivery request.
     * @param value Value to set for the processingAttempts property.
     */
    public void setProcessingAttempts(@jakarta.annotation.Nullable final Integer value) {
        this.processingAttempts = value;
    }
    /**
     * Sets the scheduledAt property value. UTC timestamp when this automation action run record was scheduled.
     * @param value Value to set for the scheduledAt property.
     */
    public void setScheduledAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.scheduledAt = value;
    }
    /**
     * Sets the startedAt property value. UTC timestamp when processing started for this automation action run record.
     * @param value Value to set for the startedAt property.
     */
    public void setStartedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startedAt = value;
    }
    /**
     * Sets the status property value. Current lifecycle status for this automation action run record in the Leadping API.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
}
