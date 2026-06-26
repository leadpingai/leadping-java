package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Response schema for the Leadping API automation preview response returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationPreviewResponse implements AdditionalDataHolder, Parsable {
    /**
     * Action preview results showing what the automation would do.
     */
    private java.util.List<AutomationPreviewActionResult> actionResults;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Condition evaluation results returned by the automation preview.
     */
    private java.util.List<AutomationPreviewConditionResult> conditionResults;
    /**
     * Example payload clients can use to understand this automation preview response format.
     */
    private AutomationPreviewResponseSamplePayload samplePayload;
    /**
     * Automation trigger type that starts the workflow.
     */
    private String triggerType;
    /**
     * Validation result returned for the automation configuration.
     */
    private AutomationValidationResult validation;
    /**
     * Warnings returned for this automation preview response that do not necessarily block processing.
     */
    private java.util.List<String> warnings;
    /**
     * Instantiates a new {@link AutomationPreviewResponse} and sets the default values.
     */
    public AutomationPreviewResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationPreviewResponse}
     */
    @jakarta.annotation.Nonnull
    public static AutomationPreviewResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationPreviewResponse();
    }
    /**
     * Gets the actionResults property value. Action preview results showing what the automation would do.
     * @return a {@link java.util.List<AutomationPreviewActionResult>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AutomationPreviewActionResult> getActionResults() {
        return this.actionResults;
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
     * Gets the conditionResults property value. Condition evaluation results returned by the automation preview.
     * @return a {@link java.util.List<AutomationPreviewConditionResult>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AutomationPreviewConditionResult> getConditionResults() {
        return this.conditionResults;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("actionResults", (n) -> { this.setActionResults(n.getCollectionOfObjectValues(AutomationPreviewActionResult::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionResults", (n) -> { this.setConditionResults(n.getCollectionOfObjectValues(AutomationPreviewConditionResult::createFromDiscriminatorValue)); });
        deserializerMap.put("samplePayload", (n) -> { this.setSamplePayload(n.getObjectValue(AutomationPreviewResponseSamplePayload::createFromDiscriminatorValue)); });
        deserializerMap.put("triggerType", (n) -> { this.setTriggerType(n.getStringValue()); });
        deserializerMap.put("validation", (n) -> { this.setValidation(n.getObjectValue(AutomationValidationResult::createFromDiscriminatorValue)); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the samplePayload property value. Example payload clients can use to understand this automation preview response format.
     * @return a {@link AutomationPreviewResponseSamplePayload}
     */
    @jakarta.annotation.Nullable
    public AutomationPreviewResponseSamplePayload getSamplePayload() {
        return this.samplePayload;
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
     * Gets the validation property value. Validation result returned for the automation configuration.
     * @return a {@link AutomationValidationResult}
     */
    @jakarta.annotation.Nullable
    public AutomationValidationResult getValidation() {
        return this.validation;
    }
    /**
     * Gets the warnings property value. Warnings returned for this automation preview response that do not necessarily block processing.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getWarnings() {
        return this.warnings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("actionResults", this.getActionResults());
        writer.writeCollectionOfObjectValues("conditionResults", this.getConditionResults());
        writer.writeObjectValue("samplePayload", this.getSamplePayload());
        writer.writeStringValue("triggerType", this.getTriggerType());
        writer.writeObjectValue("validation", this.getValidation());
        writer.writeCollectionOfPrimitiveValues("warnings", this.getWarnings());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionResults property value. Action preview results showing what the automation would do.
     * @param value Value to set for the actionResults property.
     */
    public void setActionResults(@jakarta.annotation.Nullable final java.util.List<AutomationPreviewActionResult> value) {
        this.actionResults = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the conditionResults property value. Condition evaluation results returned by the automation preview.
     * @param value Value to set for the conditionResults property.
     */
    public void setConditionResults(@jakarta.annotation.Nullable final java.util.List<AutomationPreviewConditionResult> value) {
        this.conditionResults = value;
    }
    /**
     * Sets the samplePayload property value. Example payload clients can use to understand this automation preview response format.
     * @param value Value to set for the samplePayload property.
     */
    public void setSamplePayload(@jakarta.annotation.Nullable final AutomationPreviewResponseSamplePayload value) {
        this.samplePayload = value;
    }
    /**
     * Sets the triggerType property value. Automation trigger type that starts the workflow.
     * @param value Value to set for the triggerType property.
     */
    public void setTriggerType(@jakarta.annotation.Nullable final String value) {
        this.triggerType = value;
    }
    /**
     * Sets the validation property value. Validation result returned for the automation configuration.
     * @param value Value to set for the validation property.
     */
    public void setValidation(@jakarta.annotation.Nullable final AutomationValidationResult value) {
        this.validation = value;
    }
    /**
     * Sets the warnings property value. Warnings returned for this automation preview response that do not necessarily block processing.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.warnings = value;
    }
}
