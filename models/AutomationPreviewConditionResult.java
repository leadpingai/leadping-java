package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Result schema for the Leadping API automation preview condition result returned by lookup and validation endpoints.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationPreviewConditionResult implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Automation condition ID evaluated by this preview result.
     */
    private String conditionId;
    /**
     * Indicates whether this automation preview condition result passed the preview or validation check.
     */
    private Boolean passed;
    /**
     * Short human-readable summary of this automation preview condition result for lists, timelines, and notifications.
     */
    private String summary;
    /**
     * Instantiates a new {@link AutomationPreviewConditionResult} and sets the default values.
     */
    public AutomationPreviewConditionResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationPreviewConditionResult}
     */
    @jakarta.annotation.Nonnull
    public static AutomationPreviewConditionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationPreviewConditionResult();
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
     * Gets the conditionId property value. Automation condition ID evaluated by this preview result.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionId() {
        return this.conditionId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("conditionId", (n) -> { this.setConditionId(n.getStringValue()); });
        deserializerMap.put("passed", (n) -> { this.setPassed(n.getBooleanValue()); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passed property value. Indicates whether this automation preview condition result passed the preview or validation check.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPassed() {
        return this.passed;
    }
    /**
     * Gets the summary property value. Short human-readable summary of this automation preview condition result for lists, timelines, and notifications.
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
        writer.writeStringValue("conditionId", this.getConditionId());
        writer.writeBooleanValue("passed", this.getPassed());
        writer.writeStringValue("summary", this.getSummary());
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
     * Sets the conditionId property value. Automation condition ID evaluated by this preview result.
     * @param value Value to set for the conditionId property.
     */
    public void setConditionId(@jakarta.annotation.Nullable final String value) {
        this.conditionId = value;
    }
    /**
     * Sets the passed property value. Indicates whether this automation preview condition result passed the preview or validation check.
     * @param value Value to set for the passed property.
     */
    public void setPassed(@jakarta.annotation.Nullable final Boolean value) {
        this.passed = value;
    }
    /**
     * Sets the summary property value. Short human-readable summary of this automation preview condition result for lists, timelines, and notifications.
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final String value) {
        this.summary = value;
    }
}
