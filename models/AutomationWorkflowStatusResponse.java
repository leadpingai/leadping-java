package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Automation workflow status collection for a lead.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationWorkflowStatusResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The leadId property
     */
    private String leadId;
    /**
     * The runs property
     */
    private java.util.List<AutomationWorkflowRunResponse> runs;
    /**
     * Instantiates a new {@link AutomationWorkflowStatusResponse} and sets the default values.
     */
    public AutomationWorkflowStatusResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationWorkflowStatusResponse}
     */
    @jakarta.annotation.Nonnull
    public static AutomationWorkflowStatusResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationWorkflowStatusResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("runs", (n) -> { this.setRuns(n.getCollectionOfObjectValues(AutomationWorkflowRunResponse::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the leadId property value. The leadId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the runs property value. The runs property
     * @return a {@link java.util.List<AutomationWorkflowRunResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AutomationWorkflowRunResponse> getRuns() {
        return this.runs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeCollectionOfObjectValues("runs", this.getRuns());
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
     * Sets the leadId property value. The leadId property
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the runs property value. The runs property
     * @param value Value to set for the runs property.
     */
    public void setRuns(@jakarta.annotation.Nullable final java.util.List<AutomationWorkflowRunResponse> value) {
        this.runs = value;
    }
}
