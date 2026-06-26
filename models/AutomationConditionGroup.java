package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Public Leadping API schema for automation condition group data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationConditionGroup implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Automation conditions evaluated before an action or workflow runs.
     */
    private java.util.List<AutomationCondition> conditions;
    /**
     * Unique Leadping identifier for this automation condition group.
     */
    private String id;
    /**
     * Execution mode that controls how this automation condition group is evaluated.
     */
    private String mode;
    /**
     * Instantiates a new {@link AutomationConditionGroup} and sets the default values.
     */
    public AutomationConditionGroup() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationConditionGroup}
     */
    @jakarta.annotation.Nonnull
    public static AutomationConditionGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationConditionGroup();
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
     * Gets the conditions property value. Automation conditions evaluated before an action or workflow runs.
     * @return a {@link java.util.List<AutomationCondition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AutomationCondition> getConditions() {
        return this.conditions;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("conditions", (n) -> { this.setConditions(n.getCollectionOfObjectValues(AutomationCondition::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("mode", (n) -> { this.setMode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this automation condition group.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the mode property value. Execution mode that controls how this automation condition group is evaluated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMode() {
        return this.mode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("conditions", this.getConditions());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("mode", this.getMode());
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
     * Sets the conditions property value. Automation conditions evaluated before an action or workflow runs.
     * @param value Value to set for the conditions property.
     */
    public void setConditions(@jakarta.annotation.Nullable final java.util.List<AutomationCondition> value) {
        this.conditions = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this automation condition group.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the mode property value. Execution mode that controls how this automation condition group is evaluated.
     * @param value Value to set for the mode property.
     */
    public void setMode(@jakarta.annotation.Nullable final String value) {
        this.mode = value;
    }
}
