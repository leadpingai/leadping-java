package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Persisted origin of an automation run and the events produced by its actions.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationLineage implements AdditionalDataHolder, Parsable {
    /**
     * The actionId property
     */
    private String actionId;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Automation IDs in execution order, including the run that produced this event.
     */
    private java.util.List<String> automationIds;
    /**
     * The rootEventId property
     */
    private String rootEventId;
    /**
     * The runId property
     */
    private String runId;
    /**
     * The triggerEventId property
     */
    private String triggerEventId;
    /**
     * Instantiates a new {@link AutomationLineage} and sets the default values.
     */
    public AutomationLineage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationLineage}
     */
    @jakarta.annotation.Nonnull
    public static AutomationLineage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationLineage();
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
     * Gets the automationIds property value. Automation IDs in execution order, including the run that produced this event.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAutomationIds() {
        return this.automationIds;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("actionId", (n) -> { this.setActionId(n.getStringValue()); });
        deserializerMap.put("automationIds", (n) -> { this.setAutomationIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("rootEventId", (n) -> { this.setRootEventId(n.getStringValue()); });
        deserializerMap.put("runId", (n) -> { this.setRunId(n.getStringValue()); });
        deserializerMap.put("triggerEventId", (n) -> { this.setTriggerEventId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the rootEventId property value. The rootEventId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRootEventId() {
        return this.rootEventId;
    }
    /**
     * Gets the runId property value. The runId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRunId() {
        return this.runId;
    }
    /**
     * Gets the triggerEventId property value. The triggerEventId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTriggerEventId() {
        return this.triggerEventId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionId", this.getActionId());
        writer.writeCollectionOfPrimitiveValues("automationIds", this.getAutomationIds());
        writer.writeStringValue("rootEventId", this.getRootEventId());
        writer.writeStringValue("runId", this.getRunId());
        writer.writeStringValue("triggerEventId", this.getTriggerEventId());
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
     * Sets the automationIds property value. Automation IDs in execution order, including the run that produced this event.
     * @param value Value to set for the automationIds property.
     */
    public void setAutomationIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.automationIds = value;
    }
    /**
     * Sets the rootEventId property value. The rootEventId property
     * @param value Value to set for the rootEventId property.
     */
    public void setRootEventId(@jakarta.annotation.Nullable final String value) {
        this.rootEventId = value;
    }
    /**
     * Sets the runId property value. The runId property
     * @param value Value to set for the runId property.
     */
    public void setRunId(@jakarta.annotation.Nullable final String value) {
        this.runId = value;
    }
    /**
     * Sets the triggerEventId property value. The triggerEventId property
     * @param value Value to set for the triggerEventId property.
     */
    public void setTriggerEventId(@jakarta.annotation.Nullable final String value) {
        this.triggerEventId = value;
    }
}
