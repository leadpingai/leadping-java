package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Current, visible follow-up work for a lead, independent of stale historical dates.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadFollowUpResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Identifier of the lead requiring follow-up.
     */
    private String leadId;
    /**
     * Display name of the lead requiring follow-up.
     */
    private String leadName;
    /**
     * Summary schema for Leadping API current lead status change summary data used in dashboards and reports.
     */
    private CurrentLeadStatusSummary status;
    /**
     * Instantiates a new {@link LeadFollowUpResponse} and sets the default values.
     */
    public LeadFollowUpResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadFollowUpResponse}
     */
    @jakarta.annotation.Nonnull
    public static LeadFollowUpResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadFollowUpResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("leadName", (n) -> { this.setLeadName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getObjectValue(CurrentLeadStatusSummary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the leadId property value. Identifier of the lead requiring follow-up.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the leadName property value. Display name of the lead requiring follow-up.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadName() {
        return this.leadName;
    }
    /**
     * Gets the status property value. Summary schema for Leadping API current lead status change summary data used in dashboards and reports.
     * @return a {@link CurrentLeadStatusSummary}
     */
    @jakarta.annotation.Nullable
    public CurrentLeadStatusSummary getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeStringValue("leadName", this.getLeadName());
        writer.writeObjectValue("status", this.getStatus());
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
     * Sets the leadId property value. Identifier of the lead requiring follow-up.
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the leadName property value. Display name of the lead requiring follow-up.
     * @param value Value to set for the leadName property.
     */
    public void setLeadName(@jakarta.annotation.Nullable final String value) {
        this.leadName = value;
    }
    /**
     * Sets the status property value. Summary schema for Leadping API current lead status change summary data used in dashboards and reports.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CurrentLeadStatusSummary value) {
        this.status = value;
    }
}
