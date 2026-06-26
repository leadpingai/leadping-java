package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Response schema for the Leadping API outgoing number selection response returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutgoingNumberSelectionResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Messaging campaign identifier associated with this outgoing number selection response.
     */
    private String campaignId;
    /**
     * Indicates whether Leadping can send outbound messages using this outgoing number selection response.
     */
    private Boolean canSend;
    /**
     * Human-readable phone number shown in Leadping UI and API responses.
     */
    private String displayNumber;
    /**
     * Phone numbers that are eligible to send the requested outbound message or call.
     */
    private java.util.List<EligibleOutgoingNumberResponse> eligibleNumbers;
    /**
     * Short label describing the health state for display in dashboards.
     */
    private String healthLabel;
    /**
     * Defines the supported SMS Warmup Health State values.
     */
    private OutgoingNumberSelectionResponseHealthStatus healthStatus;
    /**
     * Warning text that explains a potential health or readiness issue.
     */
    private String healthWarning;
    /**
     * E.164 phone number exposed by this outgoing number selection response.
     */
    private String number;
    /**
     * Leadping phone number ID connected to this outgoing number selection response.
     */
    private String phoneNumberId;
    /**
     * Human-readable label for the reason code on this outgoing number selection response.
     */
    private String reasonLabel;
    /**
     * Defines the supported Outgoing Number Selection Reason values.
     */
    private OutgoingNumberSelectionResponseSelectionReason selectionReason;
    /**
     * Human-readable setup guidance shown for this outgoing number selection response.
     */
    private String setupMessage;
    /**
     * Lead source ID considered when Leadping selected the outgoing phone number.
     */
    private String sourceId;
    /**
     * Indicates whether a user manually overrode Leadping&apos;s automatic number selection for this outgoing number selection response.
     */
    private Boolean wasManuallyOverridden;
    /**
     * Instantiates a new {@link OutgoingNumberSelectionResponse} and sets the default values.
     */
    public OutgoingNumberSelectionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OutgoingNumberSelectionResponse}
     */
    @jakarta.annotation.Nonnull
    public static OutgoingNumberSelectionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutgoingNumberSelectionResponse();
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
     * Gets the campaignId property value. Messaging campaign identifier associated with this outgoing number selection response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignId() {
        return this.campaignId;
    }
    /**
     * Gets the canSend property value. Indicates whether Leadping can send outbound messages using this outgoing number selection response.
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
     * Gets the eligibleNumbers property value. Phone numbers that are eligible to send the requested outbound message or call.
     * @return a {@link java.util.List<EligibleOutgoingNumberResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EligibleOutgoingNumberResponse> getEligibleNumbers() {
        return this.eligibleNumbers;
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
        deserializerMap.put("eligibleNumbers", (n) -> { this.setEligibleNumbers(n.getCollectionOfObjectValues(EligibleOutgoingNumberResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("healthLabel", (n) -> { this.setHealthLabel(n.getStringValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(OutgoingNumberSelectionResponseHealthStatus::forValue)); });
        deserializerMap.put("healthWarning", (n) -> { this.setHealthWarning(n.getStringValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("phoneNumberId", (n) -> { this.setPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("reasonLabel", (n) -> { this.setReasonLabel(n.getStringValue()); });
        deserializerMap.put("selectionReason", (n) -> { this.setSelectionReason(n.getEnumValue(OutgoingNumberSelectionResponseSelectionReason::forValue)); });
        deserializerMap.put("setupMessage", (n) -> { this.setSetupMessage(n.getStringValue()); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("wasManuallyOverridden", (n) -> { this.setWasManuallyOverridden(n.getBooleanValue()); });
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
     * @return a {@link OutgoingNumberSelectionResponseHealthStatus}
     */
    @jakarta.annotation.Nullable
    public OutgoingNumberSelectionResponseHealthStatus getHealthStatus() {
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
     * Gets the number property value. E.164 phone number exposed by this outgoing number selection response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.number;
    }
    /**
     * Gets the phoneNumberId property value. Leadping phone number ID connected to this outgoing number selection response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }
    /**
     * Gets the reasonLabel property value. Human-readable label for the reason code on this outgoing number selection response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReasonLabel() {
        return this.reasonLabel;
    }
    /**
     * Gets the selectionReason property value. Defines the supported Outgoing Number Selection Reason values.
     * @return a {@link OutgoingNumberSelectionResponseSelectionReason}
     */
    @jakarta.annotation.Nullable
    public OutgoingNumberSelectionResponseSelectionReason getSelectionReason() {
        return this.selectionReason;
    }
    /**
     * Gets the setupMessage property value. Human-readable setup guidance shown for this outgoing number selection response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSetupMessage() {
        return this.setupMessage;
    }
    /**
     * Gets the sourceId property value. Lead source ID considered when Leadping selected the outgoing phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.sourceId;
    }
    /**
     * Gets the wasManuallyOverridden property value. Indicates whether a user manually overrode Leadping&apos;s automatic number selection for this outgoing number selection response.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWasManuallyOverridden() {
        return this.wasManuallyOverridden;
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
        writer.writeCollectionOfObjectValues("eligibleNumbers", this.getEligibleNumbers());
        writer.writeStringValue("healthLabel", this.getHealthLabel());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeStringValue("healthWarning", this.getHealthWarning());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("phoneNumberId", this.getPhoneNumberId());
        writer.writeStringValue("reasonLabel", this.getReasonLabel());
        writer.writeEnumValue("selectionReason", this.getSelectionReason());
        writer.writeStringValue("setupMessage", this.getSetupMessage());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeBooleanValue("wasManuallyOverridden", this.getWasManuallyOverridden());
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
     * Sets the campaignId property value. Messaging campaign identifier associated with this outgoing number selection response.
     * @param value Value to set for the campaignId property.
     */
    public void setCampaignId(@jakarta.annotation.Nullable final String value) {
        this.campaignId = value;
    }
    /**
     * Sets the canSend property value. Indicates whether Leadping can send outbound messages using this outgoing number selection response.
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
     * Sets the eligibleNumbers property value. Phone numbers that are eligible to send the requested outbound message or call.
     * @param value Value to set for the eligibleNumbers property.
     */
    public void setEligibleNumbers(@jakarta.annotation.Nullable final java.util.List<EligibleOutgoingNumberResponse> value) {
        this.eligibleNumbers = value;
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
    public void setHealthStatus(@jakarta.annotation.Nullable final OutgoingNumberSelectionResponseHealthStatus value) {
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
     * Sets the number property value. E.164 phone number exposed by this outgoing number selection response.
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.number = value;
    }
    /**
     * Sets the phoneNumberId property value. Leadping phone number ID connected to this outgoing number selection response.
     * @param value Value to set for the phoneNumberId property.
     */
    public void setPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.phoneNumberId = value;
    }
    /**
     * Sets the reasonLabel property value. Human-readable label for the reason code on this outgoing number selection response.
     * @param value Value to set for the reasonLabel property.
     */
    public void setReasonLabel(@jakarta.annotation.Nullable final String value) {
        this.reasonLabel = value;
    }
    /**
     * Sets the selectionReason property value. Defines the supported Outgoing Number Selection Reason values.
     * @param value Value to set for the selectionReason property.
     */
    public void setSelectionReason(@jakarta.annotation.Nullable final OutgoingNumberSelectionResponseSelectionReason value) {
        this.selectionReason = value;
    }
    /**
     * Sets the setupMessage property value. Human-readable setup guidance shown for this outgoing number selection response.
     * @param value Value to set for the setupMessage property.
     */
    public void setSetupMessage(@jakarta.annotation.Nullable final String value) {
        this.setupMessage = value;
    }
    /**
     * Sets the sourceId property value. Lead source ID considered when Leadping selected the outgoing phone number.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.sourceId = value;
    }
    /**
     * Sets the wasManuallyOverridden property value. Indicates whether a user manually overrode Leadping&apos;s automatic number selection for this outgoing number selection response.
     * @param value Value to set for the wasManuallyOverridden property.
     */
    public void setWasManuallyOverridden(@jakarta.annotation.Nullable final Boolean value) {
        this.wasManuallyOverridden = value;
    }
}
