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
 * User-safe action status returned for lead automation workflow visibility.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationWorkflowActionResponse implements AdditionalDataHolder, Parsable {
    /**
     * The actionType property
     */
    private String actionType;
    /**
     * The actionTypeDisplay property
     */
    private String actionTypeDisplay;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The adminDiagnostics property
     */
    private String adminDiagnostics;
    /**
     * The completedAt property
     */
    private OffsetDateTime completedAt;
    /**
     * The failedAt property
     */
    private OffsetDateTime failedAt;
    /**
     * The failureCode property
     */
    private String failureCode;
    /**
     * The id property
     */
    private String id;
    /**
     * The nextRetryAt property
     */
    private OffsetDateTime nextRetryAt;
    /**
     * The retryCount property
     */
    private Integer retryCount;
    /**
     * The safeReason property
     */
    private String safeReason;
    /**
     * The scheduledAt property
     */
    private OffsetDateTime scheduledAt;
    /**
     * The skippedAt property
     */
    private OffsetDateTime skippedAt;
    /**
     * The startedAt property
     */
    private OffsetDateTime startedAt;
    /**
     * The status property
     */
    private String status;
    /**
     * The statusDisplay property
     */
    private String statusDisplay;
    /**
     * The stepDisplayName property
     */
    private String stepDisplayName;
    /**
     * The stepId property
     */
    private String stepId;
    /**
     * The stepOrder property
     */
    private Integer stepOrder;
    /**
     * The userSummary property
     */
    private String userSummary;
    /**
     * Instantiates a new {@link AutomationWorkflowActionResponse} and sets the default values.
     */
    public AutomationWorkflowActionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationWorkflowActionResponse}
     */
    @jakarta.annotation.Nonnull
    public static AutomationWorkflowActionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationWorkflowActionResponse();
    }
    /**
     * Gets the actionType property value. The actionType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionType() {
        return this.actionType;
    }
    /**
     * Gets the actionTypeDisplay property value. The actionTypeDisplay property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionTypeDisplay() {
        return this.actionTypeDisplay;
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
     * Gets the adminDiagnostics property value. The adminDiagnostics property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAdminDiagnostics() {
        return this.adminDiagnostics;
    }
    /**
     * Gets the completedAt property value. The completedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedAt() {
        return this.completedAt;
    }
    /**
     * Gets the failedAt property value. The failedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFailedAt() {
        return this.failedAt;
    }
    /**
     * Gets the failureCode property value. The failureCode property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(19);
        deserializerMap.put("actionType", (n) -> { this.setActionType(n.getStringValue()); });
        deserializerMap.put("actionTypeDisplay", (n) -> { this.setActionTypeDisplay(n.getStringValue()); });
        deserializerMap.put("adminDiagnostics", (n) -> { this.setAdminDiagnostics(n.getStringValue()); });
        deserializerMap.put("completedAt", (n) -> { this.setCompletedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failedAt", (n) -> { this.setFailedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failureCode", (n) -> { this.setFailureCode(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("nextRetryAt", (n) -> { this.setNextRetryAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("retryCount", (n) -> { this.setRetryCount(n.getIntegerValue()); });
        deserializerMap.put("safeReason", (n) -> { this.setSafeReason(n.getStringValue()); });
        deserializerMap.put("scheduledAt", (n) -> { this.setScheduledAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("skippedAt", (n) -> { this.setSkippedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("startedAt", (n) -> { this.setStartedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("statusDisplay", (n) -> { this.setStatusDisplay(n.getStringValue()); });
        deserializerMap.put("stepDisplayName", (n) -> { this.setStepDisplayName(n.getStringValue()); });
        deserializerMap.put("stepId", (n) -> { this.setStepId(n.getStringValue()); });
        deserializerMap.put("stepOrder", (n) -> { this.setStepOrder(n.getIntegerValue()); });
        deserializerMap.put("userSummary", (n) -> { this.setUserSummary(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the nextRetryAt property value. The nextRetryAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextRetryAt() {
        return this.nextRetryAt;
    }
    /**
     * Gets the retryCount property value. The retryCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRetryCount() {
        return this.retryCount;
    }
    /**
     * Gets the safeReason property value. The safeReason property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSafeReason() {
        return this.safeReason;
    }
    /**
     * Gets the scheduledAt property value. The scheduledAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getScheduledAt() {
        return this.scheduledAt;
    }
    /**
     * Gets the skippedAt property value. The skippedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSkippedAt() {
        return this.skippedAt;
    }
    /**
     * Gets the startedAt property value. The startedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartedAt() {
        return this.startedAt;
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the statusDisplay property value. The statusDisplay property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusDisplay() {
        return this.statusDisplay;
    }
    /**
     * Gets the stepDisplayName property value. The stepDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStepDisplayName() {
        return this.stepDisplayName;
    }
    /**
     * Gets the stepId property value. The stepId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStepId() {
        return this.stepId;
    }
    /**
     * Gets the stepOrder property value. The stepOrder property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getStepOrder() {
        return this.stepOrder;
    }
    /**
     * Gets the userSummary property value. The userSummary property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserSummary() {
        return this.userSummary;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionType", this.getActionType());
        writer.writeStringValue("actionTypeDisplay", this.getActionTypeDisplay());
        writer.writeStringValue("adminDiagnostics", this.getAdminDiagnostics());
        writer.writeOffsetDateTimeValue("completedAt", this.getCompletedAt());
        writer.writeOffsetDateTimeValue("failedAt", this.getFailedAt());
        writer.writeStringValue("failureCode", this.getFailureCode());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("nextRetryAt", this.getNextRetryAt());
        writer.writeIntegerValue("retryCount", this.getRetryCount());
        writer.writeStringValue("safeReason", this.getSafeReason());
        writer.writeOffsetDateTimeValue("scheduledAt", this.getScheduledAt());
        writer.writeOffsetDateTimeValue("skippedAt", this.getSkippedAt());
        writer.writeOffsetDateTimeValue("startedAt", this.getStartedAt());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("statusDisplay", this.getStatusDisplay());
        writer.writeStringValue("stepDisplayName", this.getStepDisplayName());
        writer.writeStringValue("stepId", this.getStepId());
        writer.writeIntegerValue("stepOrder", this.getStepOrder());
        writer.writeStringValue("userSummary", this.getUserSummary());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionType property value. The actionType property
     * @param value Value to set for the actionType property.
     */
    public void setActionType(@jakarta.annotation.Nullable final String value) {
        this.actionType = value;
    }
    /**
     * Sets the actionTypeDisplay property value. The actionTypeDisplay property
     * @param value Value to set for the actionTypeDisplay property.
     */
    public void setActionTypeDisplay(@jakarta.annotation.Nullable final String value) {
        this.actionTypeDisplay = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the adminDiagnostics property value. The adminDiagnostics property
     * @param value Value to set for the adminDiagnostics property.
     */
    public void setAdminDiagnostics(@jakarta.annotation.Nullable final String value) {
        this.adminDiagnostics = value;
    }
    /**
     * Sets the completedAt property value. The completedAt property
     * @param value Value to set for the completedAt property.
     */
    public void setCompletedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completedAt = value;
    }
    /**
     * Sets the failedAt property value. The failedAt property
     * @param value Value to set for the failedAt property.
     */
    public void setFailedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.failedAt = value;
    }
    /**
     * Sets the failureCode property value. The failureCode property
     * @param value Value to set for the failureCode property.
     */
    public void setFailureCode(@jakarta.annotation.Nullable final String value) {
        this.failureCode = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the nextRetryAt property value. The nextRetryAt property
     * @param value Value to set for the nextRetryAt property.
     */
    public void setNextRetryAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.nextRetryAt = value;
    }
    /**
     * Sets the retryCount property value. The retryCount property
     * @param value Value to set for the retryCount property.
     */
    public void setRetryCount(@jakarta.annotation.Nullable final Integer value) {
        this.retryCount = value;
    }
    /**
     * Sets the safeReason property value. The safeReason property
     * @param value Value to set for the safeReason property.
     */
    public void setSafeReason(@jakarta.annotation.Nullable final String value) {
        this.safeReason = value;
    }
    /**
     * Sets the scheduledAt property value. The scheduledAt property
     * @param value Value to set for the scheduledAt property.
     */
    public void setScheduledAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.scheduledAt = value;
    }
    /**
     * Sets the skippedAt property value. The skippedAt property
     * @param value Value to set for the skippedAt property.
     */
    public void setSkippedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.skippedAt = value;
    }
    /**
     * Sets the startedAt property value. The startedAt property
     * @param value Value to set for the startedAt property.
     */
    public void setStartedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startedAt = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the statusDisplay property value. The statusDisplay property
     * @param value Value to set for the statusDisplay property.
     */
    public void setStatusDisplay(@jakarta.annotation.Nullable final String value) {
        this.statusDisplay = value;
    }
    /**
     * Sets the stepDisplayName property value. The stepDisplayName property
     * @param value Value to set for the stepDisplayName property.
     */
    public void setStepDisplayName(@jakarta.annotation.Nullable final String value) {
        this.stepDisplayName = value;
    }
    /**
     * Sets the stepId property value. The stepId property
     * @param value Value to set for the stepId property.
     */
    public void setStepId(@jakarta.annotation.Nullable final String value) {
        this.stepId = value;
    }
    /**
     * Sets the stepOrder property value. The stepOrder property
     * @param value Value to set for the stepOrder property.
     */
    public void setStepOrder(@jakarta.annotation.Nullable final Integer value) {
        this.stepOrder = value;
    }
    /**
     * Sets the userSummary property value. The userSummary property
     * @param value Value to set for the userSummary property.
     */
    public void setUserSummary(@jakarta.annotation.Nullable final String value) {
        this.userSummary = value;
    }
}
