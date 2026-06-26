package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Public Leadping API schema for automation condition data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationCondition implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Unique Leadping identifier for this automation condition.
     */
    private String id;
    /**
     * Indicates whether this automation condition is active and allowed to run.
     */
    private Boolean isEnabled;
    /**
     * Automation comparison operator used by this condition.
     */
    private String operator;
    /**
     * Key-value settings that configure how this automation condition behaves.
     */
    private AutomationConditionSettings settings;
    /**
     * Type classification used to route and interpret this automation condition in the Leadping API.
     */
    private String type;
    /**
     * Instantiates a new {@link AutomationCondition} and sets the default values.
     */
    public AutomationCondition() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationCondition}
     */
    @jakarta.annotation.Nonnull
    public static AutomationCondition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationCondition();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("operator", (n) -> { this.setOperator(n.getStringValue()); });
        deserializerMap.put("settings", (n) -> { this.setSettings(n.getObjectValue(AutomationConditionSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this automation condition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isEnabled property value. Indicates whether this automation condition is active and allowed to run.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the operator property value. Automation comparison operator used by this condition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOperator() {
        return this.operator;
    }
    /**
     * Gets the settings property value. Key-value settings that configure how this automation condition behaves.
     * @return a {@link AutomationConditionSettings}
     */
    @jakarta.annotation.Nullable
    public AutomationConditionSettings getSettings() {
        return this.settings;
    }
    /**
     * Gets the type property value. Type classification used to route and interpret this automation condition in the Leadping API.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("operator", this.getOperator());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeStringValue("type", this.getType());
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
     * Sets the id property value. Unique Leadping identifier for this automation condition.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isEnabled property value. Indicates whether this automation condition is active and allowed to run.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the operator property value. Automation comparison operator used by this condition.
     * @param value Value to set for the operator property.
     */
    public void setOperator(@jakarta.annotation.Nullable final String value) {
        this.operator = value;
    }
    /**
     * Sets the settings property value. Key-value settings that configure how this automation condition behaves.
     * @param value Value to set for the settings property.
     */
    public void setSettings(@jakarta.annotation.Nullable final AutomationConditionSettings value) {
        this.settings = value;
    }
    /**
     * Sets the type property value. Type classification used to route and interpret this automation condition in the Leadping API.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
