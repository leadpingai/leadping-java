package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Request schema for the Leadping API automation preview request, including the fields clients can send.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationPreviewRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Automation configuration to evaluate without executing live actions.
     */
    private AutomationRequestSnapshot automation;
    /**
     * Automation trigger type that starts the workflow.
     */
    private String triggerType;
    /**
     * Instantiates a new {@link AutomationPreviewRequest} and sets the default values.
     */
    public AutomationPreviewRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationPreviewRequest}
     */
    @jakarta.annotation.Nonnull
    public static AutomationPreviewRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationPreviewRequest();
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
     * Gets the automation property value. Automation configuration to evaluate without executing live actions.
     * @return a {@link AutomationRequestSnapshot}
     */
    @jakarta.annotation.Nullable
    public AutomationRequestSnapshot getAutomation() {
        return this.automation;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("automation", (n) -> { this.setAutomation(n.getObjectValue(AutomationRequestSnapshot::createFromDiscriminatorValue)); });
        deserializerMap.put("triggerType", (n) -> { this.setTriggerType(n.getStringValue()); });
        return deserializerMap;
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
        writer.writeObjectValue("automation", this.getAutomation());
        writer.writeStringValue("triggerType", this.getTriggerType());
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
     * Sets the automation property value. Automation configuration to evaluate without executing live actions.
     * @param value Value to set for the automation property.
     */
    public void setAutomation(@jakarta.annotation.Nullable final AutomationRequestSnapshot value) {
        this.automation = value;
    }
    /**
     * Sets the triggerType property value. Automation trigger type that starts the workflow.
     * @param value Value to set for the triggerType property.
     */
    public void setTriggerType(@jakarta.annotation.Nullable final String value) {
        this.triggerType = value;
    }
}
