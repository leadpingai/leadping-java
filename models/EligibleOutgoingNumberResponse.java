package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Response schema for the Leadping API eligible outgoing phone number returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EligibleOutgoingNumberResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Messaging campaign identifier associated with this eligible outgoing phone number.
     */
    private String campaignId;
    /**
     * Indicates whether Leadping can send outbound messages using this eligible outgoing phone number.
     */
    private Boolean canSend;
    /**
     * Human-readable phone number shown in Leadping UI and API responses.
     */
    private String displayNumber;
    /**
     * Short label describing the health state for display in dashboards.
     */
    private String healthLabel;
    /**
     * Defines the supported SMS Warmup Health State values.
     */
    private EligibleOutgoingNumberResponseHealthStatus healthStatus;
    /**
     * Warning text that explains a potential health or readiness issue.
     */
    private String healthWarning;
    /**
     * Indicates whether this eligible outgoing phone number was selected for the requested operation.
     */
    private Boolean isSelected;
    /**
     * Short display label for this eligible outgoing phone number, formatted for charts, filters, or list views.
     */
    private String label;
    /**
     * E.164 phone number exposed by this eligible outgoing phone number.
     */
    private String number;
    /**
     * Leadping phone number ID connected to this eligible outgoing phone number.
     */
    private String phoneNumberId;
    /**
     * Human-readable label for the reason code on this eligible outgoing phone number.
     */
    private String reasonLabel;
    /**
     * Reason Leadping selected this outbound sender number.
     */
    private OutgoingNumberSelectionReason selectionReason;
    /**
     * Lead source ID used to determine this phone number&apos;s outbound eligibility.
     */
    private String sourceId;
    /**
     * Team ID used to determine this phone number&apos;s outbound eligibility.
     */
    private String teamId;
    /**
     * Instantiates a new {@link EligibleOutgoingNumberResponse} and sets the default values.
     */
    public EligibleOutgoingNumberResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EligibleOutgoingNumberResponse}
     */
    @jakarta.annotation.Nonnull
    public static EligibleOutgoingNumberResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EligibleOutgoingNumberResponse();
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
     * Gets the campaignId property value. Messaging campaign identifier associated with this eligible outgoing phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignId() {
        return this.campaignId;
    }
    /**
     * Gets the canSend property value. Indicates whether Leadping can send outbound messages using this eligible outgoing phone number.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCanSend() {
        return this.canSend;
    }
    /**
     * Gets the displayNumber property value. Human-readable phone number shown in Leadping UI and API responses.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayNumber() {
        return this.displayNumber;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("campaignId", (n) -> { this.setCampaignId(n.getStringValue()); });
        deserializerMap.put("canSend", (n) -> { this.setCanSend(n.getBooleanValue()); });
        deserializerMap.put("displayNumber", (n) -> { this.setDisplayNumber(n.getStringValue()); });
        deserializerMap.put("healthLabel", (n) -> { this.setHealthLabel(n.getStringValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(EligibleOutgoingNumberResponseHealthStatus::forValue)); });
        deserializerMap.put("healthWarning", (n) -> { this.setHealthWarning(n.getStringValue()); });
        deserializerMap.put("isSelected", (n) -> { this.setIsSelected(n.getBooleanValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("phoneNumberId", (n) -> { this.setPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("reasonLabel", (n) -> { this.setReasonLabel(n.getStringValue()); });
        deserializerMap.put("selectionReason", (n) -> { this.setSelectionReason(n.getEnumValue(OutgoingNumberSelectionReason::forValue)); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("teamId", (n) -> { this.setTeamId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthLabel property value. Short label describing the health state for display in dashboards.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHealthLabel() {
        return this.healthLabel;
    }
    /**
     * Gets the healthStatus property value. Defines the supported SMS Warmup Health State values.
     * @return a {@link EligibleOutgoingNumberResponseHealthStatus}
     */
    @jakarta.annotation.Nullable
    public EligibleOutgoingNumberResponseHealthStatus getHealthStatus() {
        return this.healthStatus;
    }
    /**
     * Gets the healthWarning property value. Warning text that explains a potential health or readiness issue.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHealthWarning() {
        return this.healthWarning;
    }
    /**
     * Gets the isSelected property value. Indicates whether this eligible outgoing phone number was selected for the requested operation.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSelected() {
        return this.isSelected;
    }
    /**
     * Gets the label property value. Short display label for this eligible outgoing phone number, formatted for charts, filters, or list views.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the number property value. E.164 phone number exposed by this eligible outgoing phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.number;
    }
    /**
     * Gets the phoneNumberId property value. Leadping phone number ID connected to this eligible outgoing phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }
    /**
     * Gets the reasonLabel property value. Human-readable label for the reason code on this eligible outgoing phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReasonLabel() {
        return this.reasonLabel;
    }
    /**
     * Gets the selectionReason property value. Reason Leadping selected this outbound sender number.
     * @return a {@link OutgoingNumberSelectionReason}
     */
    @jakarta.annotation.Nullable
    public OutgoingNumberSelectionReason getSelectionReason() {
        return this.selectionReason;
    }
    /**
     * Gets the sourceId property value. Lead source ID used to determine this phone number&apos;s outbound eligibility.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.sourceId;
    }
    /**
     * Gets the teamId property value. Team ID used to determine this phone number&apos;s outbound eligibility.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTeamId() {
        return this.teamId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("campaignId", this.getCampaignId());
        writer.writeBooleanValue("canSend", this.getCanSend());
        writer.writeStringValue("displayNumber", this.getDisplayNumber());
        writer.writeStringValue("healthLabel", this.getHealthLabel());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeStringValue("healthWarning", this.getHealthWarning());
        writer.writeBooleanValue("isSelected", this.getIsSelected());
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("phoneNumberId", this.getPhoneNumberId());
        writer.writeStringValue("reasonLabel", this.getReasonLabel());
        writer.writeEnumValue("selectionReason", this.getSelectionReason());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeStringValue("teamId", this.getTeamId());
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
     * Sets the campaignId property value. Messaging campaign identifier associated with this eligible outgoing phone number.
     * @param value Value to set for the campaignId property.
     */
    public void setCampaignId(@jakarta.annotation.Nullable final String value) {
        this.campaignId = value;
    }
    /**
     * Sets the canSend property value. Indicates whether Leadping can send outbound messages using this eligible outgoing phone number.
     * @param value Value to set for the canSend property.
     */
    public void setCanSend(@jakarta.annotation.Nullable final Boolean value) {
        this.canSend = value;
    }
    /**
     * Sets the displayNumber property value. Human-readable phone number shown in Leadping UI and API responses.
     * @param value Value to set for the displayNumber property.
     */
    public void setDisplayNumber(@jakarta.annotation.Nullable final String value) {
        this.displayNumber = value;
    }
    /**
     * Sets the healthLabel property value. Short label describing the health state for display in dashboards.
     * @param value Value to set for the healthLabel property.
     */
    public void setHealthLabel(@jakarta.annotation.Nullable final String value) {
        this.healthLabel = value;
    }
    /**
     * Sets the healthStatus property value. Defines the supported SMS Warmup Health State values.
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final EligibleOutgoingNumberResponseHealthStatus value) {
        this.healthStatus = value;
    }
    /**
     * Sets the healthWarning property value. Warning text that explains a potential health or readiness issue.
     * @param value Value to set for the healthWarning property.
     */
    public void setHealthWarning(@jakarta.annotation.Nullable final String value) {
        this.healthWarning = value;
    }
    /**
     * Sets the isSelected property value. Indicates whether this eligible outgoing phone number was selected for the requested operation.
     * @param value Value to set for the isSelected property.
     */
    public void setIsSelected(@jakarta.annotation.Nullable final Boolean value) {
        this.isSelected = value;
    }
    /**
     * Sets the label property value. Short display label for this eligible outgoing phone number, formatted for charts, filters, or list views.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the number property value. E.164 phone number exposed by this eligible outgoing phone number.
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.number = value;
    }
    /**
     * Sets the phoneNumberId property value. Leadping phone number ID connected to this eligible outgoing phone number.
     * @param value Value to set for the phoneNumberId property.
     */
    public void setPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.phoneNumberId = value;
    }
    /**
     * Sets the reasonLabel property value. Human-readable label for the reason code on this eligible outgoing phone number.
     * @param value Value to set for the reasonLabel property.
     */
    public void setReasonLabel(@jakarta.annotation.Nullable final String value) {
        this.reasonLabel = value;
    }
    /**
     * Sets the selectionReason property value. Reason Leadping selected this outbound sender number.
     * @param value Value to set for the selectionReason property.
     */
    public void setSelectionReason(@jakarta.annotation.Nullable final OutgoingNumberSelectionReason value) {
        this.selectionReason = value;
    }
    /**
     * Sets the sourceId property value. Lead source ID used to determine this phone number&apos;s outbound eligibility.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.sourceId = value;
    }
    /**
     * Sets the teamId property value. Team ID used to determine this phone number&apos;s outbound eligibility.
     * @param value Value to set for the teamId property.
     */
    public void setTeamId(@jakarta.annotation.Nullable final String value) {
        this.teamId = value;
    }
}
