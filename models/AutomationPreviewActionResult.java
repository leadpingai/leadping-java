package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Result schema for the Leadping API automation preview action result returned by lookup and validation endpoints.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationPreviewActionResult implements AdditionalDataHolder, Parsable {
    /**
     * Automation action ID executed or evaluated by this automation preview action result.
     */
    private String actionId;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Rendered preview output produced by this automation preview action result.
     */
    private String renderedOutput;
    /**
     * Short human-readable summary of this automation preview action result for lists, timelines, and notifications.
     */
    private String summary;
    /**
     * Warnings returned for this automation preview action result that do not necessarily block processing.
     */
    private java.util.List<String> warnings;
    /**
     * Indicates whether the automation preview would perform an external action if executed live.
     */
    private Boolean wouldHaveSideEffect;
    /**
     * Instantiates a new {@link AutomationPreviewActionResult} and sets the default values.
     */
    public AutomationPreviewActionResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationPreviewActionResult}
     */
    @jakarta.annotation.Nonnull
    public static AutomationPreviewActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationPreviewActionResult();
    }
    /**
     * Gets the actionId property value. Automation action ID executed or evaluated by this automation preview action result.
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("actionId", (n) -> { this.setActionId(n.getStringValue()); });
        deserializerMap.put("renderedOutput", (n) -> { this.setRenderedOutput(n.getStringValue()); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getStringValue()); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("wouldHaveSideEffect", (n) -> { this.setWouldHaveSideEffect(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the renderedOutput property value. Rendered preview output produced by this automation preview action result.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRenderedOutput() {
        return this.renderedOutput;
    }
    /**
     * Gets the summary property value. Short human-readable summary of this automation preview action result for lists, timelines, and notifications.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSummary() {
        return this.summary;
    }
    /**
     * Gets the warnings property value. Warnings returned for this automation preview action result that do not necessarily block processing.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getWarnings() {
        return this.warnings;
    }
    /**
     * Gets the wouldHaveSideEffect property value. Indicates whether the automation preview would perform an external action if executed live.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWouldHaveSideEffect() {
        return this.wouldHaveSideEffect;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actionId", this.getActionId());
        writer.writeStringValue("renderedOutput", this.getRenderedOutput());
        writer.writeStringValue("summary", this.getSummary());
        writer.writeCollectionOfPrimitiveValues("warnings", this.getWarnings());
        writer.writeBooleanValue("wouldHaveSideEffect", this.getWouldHaveSideEffect());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionId property value. Automation action ID executed or evaluated by this automation preview action result.
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
     * Sets the renderedOutput property value. Rendered preview output produced by this automation preview action result.
     * @param value Value to set for the renderedOutput property.
     */
    public void setRenderedOutput(@jakarta.annotation.Nullable final String value) {
        this.renderedOutput = value;
    }
    /**
     * Sets the summary property value. Short human-readable summary of this automation preview action result for lists, timelines, and notifications.
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final String value) {
        this.summary = value;
    }
    /**
     * Sets the warnings property value. Warnings returned for this automation preview action result that do not necessarily block processing.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.warnings = value;
    }
    /**
     * Sets the wouldHaveSideEffect property value. Indicates whether the automation preview would perform an external action if executed live.
     * @param value Value to set for the wouldHaveSideEffect property.
     */
    public void setWouldHaveSideEffect(@jakarta.annotation.Nullable final Boolean value) {
        this.wouldHaveSideEffect = value;
    }
}
