package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Response schema for the Leadping API phone call returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneCallResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * UTC timestamp when the call was answered.
     */
    private OffsetDateTime answeredAt;
    /**
     * Monetary amount billed for this Leadping communication or transaction.
     */
    private UntypedNode billableAmount;
    /**
     * Billing state for this communication, charge, or transaction.
     */
    private String billingStatus;
    /**
     * Caller ID phone number presented during the outbound call.
     */
    private String callerId;
    /**
     * Messaging campaign identifier associated with this phone call.
     */
    private String campaignId;
    /**
     * Conversation ID that links this phone call to the Leadping inbox thread.
     */
    private String conversationId;
    /**
     * The date and time when the entity was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Communication direction for this phone call, such as inbound or outbound.
     */
    private String direction;
    /**
     * Call duration in seconds.
     */
    private UntypedNode durationSeconds;
    /**
     * UTC timestamp when the call ended.
     */
    private OffsetDateTime endedAt;
    /**
     * Sender phone number used for this communication.
     */
    private String fromPhoneNumber;
    /**
     * Sender phone number ID used for this outbound SMS or call.
     */
    private String fromPhoneNumberId;
    /**
     * The unique identifier for the entity.
     */
    private String id;
    /**
     * Lead ID associated with the call conversation or outreach attempt.
     */
    private String leadId;
    /**
     * The date and time when the entity was last modified, if applicable.
     */
    private OffsetDateTime modifiedAt;
    /**
     * Phone number used by this phone call for calls, SMS, lookup, or routing.
     */
    private String phoneNumber;
    /**
     * UTC timestamp when Leadping queued this phone call for processing.
     */
    private OffsetDateTime queuedAt;
    /**
     * URL for the call recording, when the provider makes one available.
     */
    private String recordingUrl;
    /**
     * UTC timestamp when the call started ringing.
     */
    private OffsetDateTime ringingAt;
    /**
     * Defines the supported Outgoing Number Selection Reason values.
     */
    private PhoneCallResponseSelectionReason selectionReason;
    /**
     * Lead source ID used for attribution and routing on this call.
     */
    private String sourceId;
    /**
     * Current lifecycle status for this phone call in the Leadping API.
     */
    private PhoneCallStatus status;
    /**
     * Human-readable reason explaining the current status of this phone call.
     */
    private String statusReason;
    /**
     * Recipient phone number used for this communication.
     */
    private String toPhoneNumber;
    /**
     * Indicates whether a user manually overrode Leadping&apos;s automatic number selection for this phone call.
     */
    private Boolean wasManuallyOverridden;
    /**
     * Instantiates a new {@link PhoneCallResponse} and sets the default values.
     */
    public PhoneCallResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneCallResponse}
     */
    @jakarta.annotation.Nonnull
    public static PhoneCallResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneCallResponse();
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
     * Gets the answeredAt property value. UTC timestamp when the call was answered.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAnsweredAt() {
        return this.answeredAt;
    }
    /**
     * Gets the billableAmount property value. Monetary amount billed for this Leadping communication or transaction.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getBillableAmount() {
        return this.billableAmount;
    }
    /**
     * Gets the billingStatus property value. Billing state for this communication, charge, or transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBillingStatus() {
        return this.billingStatus;
    }
    /**
     * Gets the callerId property value. Caller ID phone number presented during the outbound call.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallerId() {
        return this.callerId;
    }
    /**
     * Gets the campaignId property value. Messaging campaign identifier associated with this phone call.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignId() {
        return this.campaignId;
    }
    /**
     * Gets the conversationId property value. Conversation ID that links this phone call to the Leadping inbox thread.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationId() {
        return this.conversationId;
    }
    /**
     * Gets the createdAt property value. The date and time when the entity was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the direction property value. Communication direction for this phone call, such as inbound or outbound.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDirection() {
        return this.direction;
    }
    /**
     * Gets the durationSeconds property value. Call duration in seconds.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getDurationSeconds() {
        return this.durationSeconds;
    }
    /**
     * Gets the endedAt property value. UTC timestamp when the call ended.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndedAt() {
        return this.endedAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(25);
        deserializerMap.put("answeredAt", (n) -> { this.setAnsweredAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("billableAmount", (n) -> { this.setBillableAmount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("billingStatus", (n) -> { this.setBillingStatus(n.getStringValue()); });
        deserializerMap.put("callerId", (n) -> { this.setCallerId(n.getStringValue()); });
        deserializerMap.put("campaignId", (n) -> { this.setCampaignId(n.getStringValue()); });
        deserializerMap.put("conversationId", (n) -> { this.setConversationId(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("direction", (n) -> { this.setDirection(n.getStringValue()); });
        deserializerMap.put("durationSeconds", (n) -> { this.setDurationSeconds(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("endedAt", (n) -> { this.setEndedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fromPhoneNumber", (n) -> { this.setFromPhoneNumber(n.getStringValue()); });
        deserializerMap.put("fromPhoneNumberId", (n) -> { this.setFromPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("queuedAt", (n) -> { this.setQueuedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("recordingUrl", (n) -> { this.setRecordingUrl(n.getStringValue()); });
        deserializerMap.put("ringingAt", (n) -> { this.setRingingAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("selectionReason", (n) -> { this.setSelectionReason(n.getEnumValue(PhoneCallResponseSelectionReason::forValue)); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(PhoneCallStatus::forValue)); });
        deserializerMap.put("statusReason", (n) -> { this.setStatusReason(n.getStringValue()); });
        deserializerMap.put("toPhoneNumber", (n) -> { this.setToPhoneNumber(n.getStringValue()); });
        deserializerMap.put("wasManuallyOverridden", (n) -> { this.setWasManuallyOverridden(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fromPhoneNumber property value. Sender phone number used for this communication.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFromPhoneNumber() {
        return this.fromPhoneNumber;
    }
    /**
     * Gets the fromPhoneNumberId property value. Sender phone number ID used for this outbound SMS or call.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFromPhoneNumberId() {
        return this.fromPhoneNumberId;
    }
    /**
     * Gets the id property value. The unique identifier for the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the leadId property value. Lead ID associated with the call conversation or outreach attempt.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the modifiedAt property value. The date and time when the entity was last modified, if applicable.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the phoneNumber property value. Phone number used by this phone call for calls, SMS, lookup, or routing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the queuedAt property value. UTC timestamp when Leadping queued this phone call for processing.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getQueuedAt() {
        return this.queuedAt;
    }
    /**
     * Gets the recordingUrl property value. URL for the call recording, when the provider makes one available.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecordingUrl() {
        return this.recordingUrl;
    }
    /**
     * Gets the ringingAt property value. UTC timestamp when the call started ringing.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRingingAt() {
        return this.ringingAt;
    }
    /**
     * Gets the selectionReason property value. Defines the supported Outgoing Number Selection Reason values.
     * @return a {@link PhoneCallResponseSelectionReason}
     */
    @jakarta.annotation.Nullable
    public PhoneCallResponseSelectionReason getSelectionReason() {
        return this.selectionReason;
    }
    /**
     * Gets the sourceId property value. Lead source ID used for attribution and routing on this call.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.sourceId;
    }
    /**
     * Gets the status property value. Current lifecycle status for this phone call in the Leadping API.
     * @return a {@link PhoneCallStatus}
     */
    @jakarta.annotation.Nullable
    public PhoneCallStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the statusReason property value. Human-readable reason explaining the current status of this phone call.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusReason() {
        return this.statusReason;
    }
    /**
     * Gets the toPhoneNumber property value. Recipient phone number used for this communication.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getToPhoneNumber() {
        return this.toPhoneNumber;
    }
    /**
     * Gets the wasManuallyOverridden property value. Indicates whether a user manually overrode Leadping&apos;s automatic number selection for this phone call.
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
        writer.writeOffsetDateTimeValue("answeredAt", this.getAnsweredAt());
        writer.writeObjectValue("billableAmount", this.getBillableAmount());
        writer.writeStringValue("billingStatus", this.getBillingStatus());
        writer.writeStringValue("callerId", this.getCallerId());
        writer.writeStringValue("campaignId", this.getCampaignId());
        writer.writeStringValue("conversationId", this.getConversationId());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("direction", this.getDirection());
        writer.writeObjectValue("durationSeconds", this.getDurationSeconds());
        writer.writeOffsetDateTimeValue("endedAt", this.getEndedAt());
        writer.writeStringValue("fromPhoneNumber", this.getFromPhoneNumber());
        writer.writeStringValue("fromPhoneNumberId", this.getFromPhoneNumberId());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeOffsetDateTimeValue("queuedAt", this.getQueuedAt());
        writer.writeStringValue("recordingUrl", this.getRecordingUrl());
        writer.writeOffsetDateTimeValue("ringingAt", this.getRingingAt());
        writer.writeEnumValue("selectionReason", this.getSelectionReason());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("statusReason", this.getStatusReason());
        writer.writeStringValue("toPhoneNumber", this.getToPhoneNumber());
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
     * Sets the answeredAt property value. UTC timestamp when the call was answered.
     * @param value Value to set for the answeredAt property.
     */
    public void setAnsweredAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.answeredAt = value;
    }
    /**
     * Sets the billableAmount property value. Monetary amount billed for this Leadping communication or transaction.
     * @param value Value to set for the billableAmount property.
     */
    public void setBillableAmount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.billableAmount = value;
    }
    /**
     * Sets the billingStatus property value. Billing state for this communication, charge, or transaction.
     * @param value Value to set for the billingStatus property.
     */
    public void setBillingStatus(@jakarta.annotation.Nullable final String value) {
        this.billingStatus = value;
    }
    /**
     * Sets the callerId property value. Caller ID phone number presented during the outbound call.
     * @param value Value to set for the callerId property.
     */
    public void setCallerId(@jakarta.annotation.Nullable final String value) {
        this.callerId = value;
    }
    /**
     * Sets the campaignId property value. Messaging campaign identifier associated with this phone call.
     * @param value Value to set for the campaignId property.
     */
    public void setCampaignId(@jakarta.annotation.Nullable final String value) {
        this.campaignId = value;
    }
    /**
     * Sets the conversationId property value. Conversation ID that links this phone call to the Leadping inbox thread.
     * @param value Value to set for the conversationId property.
     */
    public void setConversationId(@jakarta.annotation.Nullable final String value) {
        this.conversationId = value;
    }
    /**
     * Sets the createdAt property value. The date and time when the entity was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the direction property value. Communication direction for this phone call, such as inbound or outbound.
     * @param value Value to set for the direction property.
     */
    public void setDirection(@jakarta.annotation.Nullable final String value) {
        this.direction = value;
    }
    /**
     * Sets the durationSeconds property value. Call duration in seconds.
     * @param value Value to set for the durationSeconds property.
     */
    public void setDurationSeconds(@jakarta.annotation.Nullable final UntypedNode value) {
        this.durationSeconds = value;
    }
    /**
     * Sets the endedAt property value. UTC timestamp when the call ended.
     * @param value Value to set for the endedAt property.
     */
    public void setEndedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endedAt = value;
    }
    /**
     * Sets the fromPhoneNumber property value. Sender phone number used for this communication.
     * @param value Value to set for the fromPhoneNumber property.
     */
    public void setFromPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.fromPhoneNumber = value;
    }
    /**
     * Sets the fromPhoneNumberId property value. Sender phone number ID used for this outbound SMS or call.
     * @param value Value to set for the fromPhoneNumberId property.
     */
    public void setFromPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.fromPhoneNumberId = value;
    }
    /**
     * Sets the id property value. The unique identifier for the entity.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the leadId property value. Lead ID associated with the call conversation or outreach attempt.
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the modifiedAt property value. The date and time when the entity was last modified, if applicable.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the phoneNumber property value. Phone number used by this phone call for calls, SMS, lookup, or routing.
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the queuedAt property value. UTC timestamp when Leadping queued this phone call for processing.
     * @param value Value to set for the queuedAt property.
     */
    public void setQueuedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.queuedAt = value;
    }
    /**
     * Sets the recordingUrl property value. URL for the call recording, when the provider makes one available.
     * @param value Value to set for the recordingUrl property.
     */
    public void setRecordingUrl(@jakarta.annotation.Nullable final String value) {
        this.recordingUrl = value;
    }
    /**
     * Sets the ringingAt property value. UTC timestamp when the call started ringing.
     * @param value Value to set for the ringingAt property.
     */
    public void setRingingAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.ringingAt = value;
    }
    /**
     * Sets the selectionReason property value. Defines the supported Outgoing Number Selection Reason values.
     * @param value Value to set for the selectionReason property.
     */
    public void setSelectionReason(@jakarta.annotation.Nullable final PhoneCallResponseSelectionReason value) {
        this.selectionReason = value;
    }
    /**
     * Sets the sourceId property value. Lead source ID used for attribution and routing on this call.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.sourceId = value;
    }
    /**
     * Sets the status property value. Current lifecycle status for this phone call in the Leadping API.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final PhoneCallStatus value) {
        this.status = value;
    }
    /**
     * Sets the statusReason property value. Human-readable reason explaining the current status of this phone call.
     * @param value Value to set for the statusReason property.
     */
    public void setStatusReason(@jakarta.annotation.Nullable final String value) {
        this.statusReason = value;
    }
    /**
     * Sets the toPhoneNumber property value. Recipient phone number used for this communication.
     * @param value Value to set for the toPhoneNumber property.
     */
    public void setToPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.toPhoneNumber = value;
    }
    /**
     * Sets the wasManuallyOverridden property value. Indicates whether a user manually overrode Leadping&apos;s automatic number selection for this phone call.
     * @param value Value to set for the wasManuallyOverridden property.
     */
    public void setWasManuallyOverridden(@jakarta.annotation.Nullable final Boolean value) {
        this.wasManuallyOverridden = value;
    }
}
