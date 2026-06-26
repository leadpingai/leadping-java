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
 * User-safe workflow history event returned for lead automation status.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationWorkflowEventResponse implements AdditionalDataHolder, Parsable {
    /**
     * The actionId property
     */
    private String actionId;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The adminDiagnostics property
     */
    private String adminDiagnostics;
    /**
     * The eventType property
     */
    private String eventType;
    /**
     * The id property
     */
    private String id;
    /**
     * The occurredAt property
     */
    private OffsetDateTime occurredAt;
    /**
     * The reasonCode property
     */
    private String reasonCode;
    /**
     * The status property
     */
    private String status;
    /**
     * The statusDisplay property
     */
    private String statusDisplay;
    /**
     * The stepId property
     */
    private String stepId;
    /**
     * The summary property
     */
    private String summary;
    /**
     * Instantiates a new {@link AutomationWorkflowEventResponse} and sets the default values.
     */
    public AutomationWorkflowEventResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationWorkflowEventResponse}
     */
    @jakarta.annotation.Nonnull
    public static AutomationWorkflowEventResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationWorkflowEventResponse();
    }
    /**
     * Gets the actionId property value. The actionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActionId() {
        return this.actionId;
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
     * Gets the eventType property value. The eventType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventType() {
        return this.eventType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("actionId", (n) -> { this.setActionId(n.getStringValue()); });
        deserializerMap.put("adminDiagnostics", (n) -> { this.setAdminDiagnostics(n.getStringValue()); });
        deserializerMap.put("eventType", (n) -> { this.setEventType(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("occurredAt", (n) -> { this.setOccurredAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reasonCode", (n) -> { this.setReasonCode(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("statusDisplay", (n) -> { this.setStatusDisplay(n.getStringValue()); });
        deserializerMap.put("stepId", (n) -> { this.setStepId(n.getStringValue()); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getStringValue()); });
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
     * Gets the occurredAt property value. The occurredAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOccurredAt() {
        return this.occurredAt;
    }
    /**
     * Gets the reasonCode property value. The reasonCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReasonCode() {
        return this.reasonCode;
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
     * Gets the stepId property value. The stepId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStepId() {
        return this.stepId;
    }
    /**
     * Gets the summary property value. The summary property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSummary() {
        return this.summary;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionId", this.getActionId());
        writer.writeStringValue("adminDiagnostics", this.getAdminDiagnostics());
        writer.writeStringValue("eventType", this.getEventType());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("occurredAt", this.getOccurredAt());
        writer.writeStringValue("reasonCode", this.getReasonCode());
        writer.writeStringValue("status", this.getStatus());
        writer.writeStringValue("statusDisplay", this.getStatusDisplay());
        writer.writeStringValue("stepId", this.getStepId());
        writer.writeStringValue("summary", this.getSummary());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionId property value. The actionId property
     * @param value Value to set for the actionId property.
     */
    public void setActionId(@jakarta.annotation.Nullable final String value) {
        this.actionId = value;
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
     * Sets the eventType property value. The eventType property
     * @param value Value to set for the eventType property.
     */
    public void setEventType(@jakarta.annotation.Nullable final String value) {
        this.eventType = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the occurredAt property value. The occurredAt property
     * @param value Value to set for the occurredAt property.
     */
    public void setOccurredAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.occurredAt = value;
    }
    /**
     * Sets the reasonCode property value. The reasonCode property
     * @param value Value to set for the reasonCode property.
     */
    public void setReasonCode(@jakarta.annotation.Nullable final String value) {
        this.reasonCode = value;
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
     * Sets the stepId property value. The stepId property
     * @param value Value to set for the stepId property.
     */
    public void setStepId(@jakarta.annotation.Nullable final String value) {
        this.stepId = value;
    }
    /**
     * Sets the summary property value. The summary property
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final String value) {
        this.summary = value;
    }
}
