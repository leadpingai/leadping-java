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
 * Response schema for the Leadping API SMS message returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SmsResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Monetary amount billed for this Leadping communication or transaction.
     */
    private UntypedNode billableAmount;
    /**
     * Billing state for this communication, charge, or transaction.
     */
    private String billingStatus;
    /**
     * UTC timestamp when Leadping blocked this communication.
     */
    private OffsetDateTime blockedAt;
    /**
     * Messaging campaign identifier associated with this SMS message.
     */
    private String campaignId;
    /**
     * UTC timestamp when this delivery or workflow was canceled.
     */
    private OffsetDateTime canceledAt;
    /**
     * Reason this delivery, run, or request was canceled.
     */
    private String cancelReason;
    /**
     * Compliance action applied to this message, lead, or sender.
     */
    private String complianceAction;
    /**
     * Conversation ID that links this SMS message to the Leadping inbox thread.
     */
    private String conversationId;
    /**
     * The date and time when the entity was created.
     */
    private OffsetDateTime createdAt;
    /**
     * UTC timestamp when the provider confirmed delivery.
     */
    private OffsetDateTime deliveredAt;
    /**
     * Machine-readable error code returned while processing this SMS message.
     */
    private String errorCode;
    /**
     * Human-readable error message returned while processing this SMS message.
     */
    private String errorMessage;
    /**
     * UTC timestamp when processing failed for this SMS message.
     */
    private OffsetDateTime failedAt;
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
     * Indicates whether this SMS message is part of Leadping sender warmup traffic.
     */
    private Boolean isWarmup;
    /**
     * Lead ID associated with the SMS conversation or outreach attempt.
     */
    private String leadId;
    /**
     * The date and time when the entity was last modified, if applicable.
     */
    private OffsetDateTime modifiedAt;
    /**
     * UTC timestamp when Leadping will retry this SMS message.
     */
    private OffsetDateTime nextRetryAt;
    /**
     * Phone number ID selected for outbound delivery.
     */
    private String outboundPhoneNumberId;
    /**
     * Provider message identifier for SMS delivery tracking and reconciliation.
     */
    private String providerMessageId;
    /**
     * UTC timestamp when Leadping queued this SMS message for processing.
     */
    private OffsetDateTime queuedAt;
    /**
     * UTC timestamp when Leadping received this inbound event or message.
     */
    private OffsetDateTime receivedAt;
    /**
     * Number of retry attempts already made for this SMS message.
     */
    private Integer retryCount;
    /**
     * UTC timestamp when Leadping is scheduled to send this SMS message.
     */
    private OffsetDateTime scheduledFor;
    /**
     * Reason Leadping scheduled this delivery for a later time.
     */
    private String scheduledReason;
    /**
     * Defines the supported Outgoing Number Selection Reason values.
     */
    private SmsResponseSelectionReason selectionReason;
    /**
     * UTC timestamp when Leadping began sending this message.
     */
    private OffsetDateTime sendingStartedAt;
    /**
     * UTC timestamp when Leadping sent this message to the provider.
     */
    private OffsetDateTime sentAt;
    /**
     * Lead source ID used for attribution and sender selection on this SMS message.
     */
    private String sourceId;
    /**
     * Defines the supported SMS Message Status values.
     */
    private SmsResponseStatus status;
    /**
     * Human-readable reason explaining the current status of this SMS message.
     */
    private String statusReason;
    /**
     * Telnyx identifier connected to this phone number, call, or SMS event.
     */
    private String telnyxId;
    /**
     * 10DLC campaign identifier associated with this sender or SMS event.
     */
    private String tenDlcCampaignId;
    /**
     * Body text for the SMS message or communication represented by this SMS message.
     */
    private String text;
    /**
     * Defines the supported SMS Traffic Type values.
     */
    private SmsResponseTrafficType trafficType;
    /**
     * UTC timestamp when the provider marked the message undeliverable.
     */
    private OffsetDateTime undeliverableAt;
    /**
     * Indicates whether a user manually overrode Leadping&apos;s automatic number selection for this SMS message.
     */
    private Boolean wasManuallyOverridden;
    /**
     * Instantiates a new {@link SmsResponse} and sets the default values.
     */
    public SmsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SmsResponse}
     */
    @jakarta.annotation.Nonnull
    public static SmsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SmsResponse();
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
     * Gets the blockedAt property value. UTC timestamp when Leadping blocked this communication.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getBlockedAt() {
        return this.blockedAt;
    }
    /**
     * Gets the campaignId property value. Messaging campaign identifier associated with this SMS message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignId() {
        return this.campaignId;
    }
    /**
     * Gets the canceledAt property value. UTC timestamp when this delivery or workflow was canceled.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCanceledAt() {
        return this.canceledAt;
    }
    /**
     * Gets the cancelReason property value. Reason this delivery, run, or request was canceled.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCancelReason() {
        return this.cancelReason;
    }
    /**
     * Gets the complianceAction property value. Compliance action applied to this message, lead, or sender.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComplianceAction() {
        return this.complianceAction;
    }
    /**
     * Gets the conversationId property value. Conversation ID that links this SMS message to the Leadping inbox thread.
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
     * Gets the deliveredAt property value. UTC timestamp when the provider confirmed delivery.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeliveredAt() {
        return this.deliveredAt;
    }
    /**
     * Gets the errorCode property value. Machine-readable error code returned while processing this SMS message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * Gets the errorMessage property value. Human-readable error message returned while processing this SMS message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * Gets the failedAt property value. UTC timestamp when processing failed for this SMS message.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFailedAt() {
        return this.failedAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(39);
        deserializerMap.put("billableAmount", (n) -> { this.setBillableAmount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("billingStatus", (n) -> { this.setBillingStatus(n.getStringValue()); });
        deserializerMap.put("blockedAt", (n) -> { this.setBlockedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("campaignId", (n) -> { this.setCampaignId(n.getStringValue()); });
        deserializerMap.put("canceledAt", (n) -> { this.setCanceledAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("cancelReason", (n) -> { this.setCancelReason(n.getStringValue()); });
        deserializerMap.put("complianceAction", (n) -> { this.setComplianceAction(n.getStringValue()); });
        deserializerMap.put("conversationId", (n) -> { this.setConversationId(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deliveredAt", (n) -> { this.setDeliveredAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getStringValue()); });
        deserializerMap.put("errorMessage", (n) -> { this.setErrorMessage(n.getStringValue()); });
        deserializerMap.put("failedAt", (n) -> { this.setFailedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fromPhoneNumber", (n) -> { this.setFromPhoneNumber(n.getStringValue()); });
        deserializerMap.put("fromPhoneNumberId", (n) -> { this.setFromPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isWarmup", (n) -> { this.setIsWarmup(n.getBooleanValue()); });
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("nextRetryAt", (n) -> { this.setNextRetryAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("outboundPhoneNumberId", (n) -> { this.setOutboundPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("providerMessageId", (n) -> { this.setProviderMessageId(n.getStringValue()); });
        deserializerMap.put("queuedAt", (n) -> { this.setQueuedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("receivedAt", (n) -> { this.setReceivedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("retryCount", (n) -> { this.setRetryCount(n.getIntegerValue()); });
        deserializerMap.put("scheduledFor", (n) -> { this.setScheduledFor(n.getOffsetDateTimeValue()); });
        deserializerMap.put("scheduledReason", (n) -> { this.setScheduledReason(n.getStringValue()); });
        deserializerMap.put("selectionReason", (n) -> { this.setSelectionReason(n.getEnumValue(SmsResponseSelectionReason::forValue)); });
        deserializerMap.put("sendingStartedAt", (n) -> { this.setSendingStartedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sentAt", (n) -> { this.setSentAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SmsResponseStatus::forValue)); });
        deserializerMap.put("statusReason", (n) -> { this.setStatusReason(n.getStringValue()); });
        deserializerMap.put("telnyxId", (n) -> { this.setTelnyxId(n.getStringValue()); });
        deserializerMap.put("tenDlcCampaignId", (n) -> { this.setTenDlcCampaignId(n.getStringValue()); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        deserializerMap.put("trafficType", (n) -> { this.setTrafficType(n.getEnumValue(SmsResponseTrafficType::forValue)); });
        deserializerMap.put("undeliverableAt", (n) -> { this.setUndeliverableAt(n.getOffsetDateTimeValue()); });
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
     * Gets the isWarmup property value. Indicates whether this SMS message is part of Leadping sender warmup traffic.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsWarmup() {
        return this.isWarmup;
    }
    /**
     * Gets the leadId property value. Lead ID associated with the SMS conversation or outreach attempt.
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
     * Gets the nextRetryAt property value. UTC timestamp when Leadping will retry this SMS message.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextRetryAt() {
        return this.nextRetryAt;
    }
    /**
     * Gets the outboundPhoneNumberId property value. Phone number ID selected for outbound delivery.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOutboundPhoneNumberId() {
        return this.outboundPhoneNumberId;
    }
    /**
     * Gets the providerMessageId property value. Provider message identifier for SMS delivery tracking and reconciliation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderMessageId() {
        return this.providerMessageId;
    }
    /**
     * Gets the queuedAt property value. UTC timestamp when Leadping queued this SMS message for processing.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getQueuedAt() {
        return this.queuedAt;
    }
    /**
     * Gets the receivedAt property value. UTC timestamp when Leadping received this inbound event or message.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReceivedAt() {
        return this.receivedAt;
    }
    /**
     * Gets the retryCount property value. Number of retry attempts already made for this SMS message.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRetryCount() {
        return this.retryCount;
    }
    /**
     * Gets the scheduledFor property value. UTC timestamp when Leadping is scheduled to send this SMS message.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getScheduledFor() {
        return this.scheduledFor;
    }
    /**
     * Gets the scheduledReason property value. Reason Leadping scheduled this delivery for a later time.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScheduledReason() {
        return this.scheduledReason;
    }
    /**
     * Gets the selectionReason property value. Defines the supported Outgoing Number Selection Reason values.
     * @return a {@link SmsResponseSelectionReason}
     */
    @jakarta.annotation.Nullable
    public SmsResponseSelectionReason getSelectionReason() {
        return this.selectionReason;
    }
    /**
     * Gets the sendingStartedAt property value. UTC timestamp when Leadping began sending this message.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSendingStartedAt() {
        return this.sendingStartedAt;
    }
    /**
     * Gets the sentAt property value. UTC timestamp when Leadping sent this message to the provider.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSentAt() {
        return this.sentAt;
    }
    /**
     * Gets the sourceId property value. Lead source ID used for attribution and sender selection on this SMS message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.sourceId;
    }
    /**
     * Gets the status property value. Defines the supported SMS Message Status values.
     * @return a {@link SmsResponseStatus}
     */
    @jakarta.annotation.Nullable
    public SmsResponseStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the statusReason property value. Human-readable reason explaining the current status of this SMS message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusReason() {
        return this.statusReason;
    }
    /**
     * Gets the telnyxId property value. Telnyx identifier connected to this phone number, call, or SMS event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTelnyxId() {
        return this.telnyxId;
    }
    /**
     * Gets the tenDlcCampaignId property value. 10DLC campaign identifier associated with this sender or SMS event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenDlcCampaignId() {
        return this.tenDlcCampaignId;
    }
    /**
     * Gets the text property value. Body text for the SMS message or communication represented by this SMS message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.text;
    }
    /**
     * Gets the trafficType property value. Defines the supported SMS Traffic Type values.
     * @return a {@link SmsResponseTrafficType}
     */
    @jakarta.annotation.Nullable
    public SmsResponseTrafficType getTrafficType() {
        return this.trafficType;
    }
    /**
     * Gets the undeliverableAt property value. UTC timestamp when the provider marked the message undeliverable.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUndeliverableAt() {
        return this.undeliverableAt;
    }
    /**
     * Gets the wasManuallyOverridden property value. Indicates whether a user manually overrode Leadping&apos;s automatic number selection for this SMS message.
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
        writer.writeObjectValue("billableAmount", this.getBillableAmount());
        writer.writeStringValue("billingStatus", this.getBillingStatus());
        writer.writeOffsetDateTimeValue("blockedAt", this.getBlockedAt());
        writer.writeStringValue("campaignId", this.getCampaignId());
        writer.writeOffsetDateTimeValue("canceledAt", this.getCanceledAt());
        writer.writeStringValue("cancelReason", this.getCancelReason());
        writer.writeStringValue("complianceAction", this.getComplianceAction());
        writer.writeStringValue("conversationId", this.getConversationId());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeOffsetDateTimeValue("deliveredAt", this.getDeliveredAt());
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeStringValue("errorMessage", this.getErrorMessage());
        writer.writeOffsetDateTimeValue("failedAt", this.getFailedAt());
        writer.writeStringValue("fromPhoneNumber", this.getFromPhoneNumber());
        writer.writeStringValue("fromPhoneNumberId", this.getFromPhoneNumberId());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isWarmup", this.getIsWarmup());
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeOffsetDateTimeValue("nextRetryAt", this.getNextRetryAt());
        writer.writeStringValue("outboundPhoneNumberId", this.getOutboundPhoneNumberId());
        writer.writeStringValue("providerMessageId", this.getProviderMessageId());
        writer.writeOffsetDateTimeValue("queuedAt", this.getQueuedAt());
        writer.writeOffsetDateTimeValue("receivedAt", this.getReceivedAt());
        writer.writeIntegerValue("retryCount", this.getRetryCount());
        writer.writeOffsetDateTimeValue("scheduledFor", this.getScheduledFor());
        writer.writeStringValue("scheduledReason", this.getScheduledReason());
        writer.writeEnumValue("selectionReason", this.getSelectionReason());
        writer.writeOffsetDateTimeValue("sendingStartedAt", this.getSendingStartedAt());
        writer.writeOffsetDateTimeValue("sentAt", this.getSentAt());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("statusReason", this.getStatusReason());
        writer.writeStringValue("telnyxId", this.getTelnyxId());
        writer.writeStringValue("tenDlcCampaignId", this.getTenDlcCampaignId());
        writer.writeStringValue("text", this.getText());
        writer.writeEnumValue("trafficType", this.getTrafficType());
        writer.writeOffsetDateTimeValue("undeliverableAt", this.getUndeliverableAt());
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
     * Sets the blockedAt property value. UTC timestamp when Leadping blocked this communication.
     * @param value Value to set for the blockedAt property.
     */
    public void setBlockedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.blockedAt = value;
    }
    /**
     * Sets the campaignId property value. Messaging campaign identifier associated with this SMS message.
     * @param value Value to set for the campaignId property.
     */
    public void setCampaignId(@jakarta.annotation.Nullable final String value) {
        this.campaignId = value;
    }
    /**
     * Sets the canceledAt property value. UTC timestamp when this delivery or workflow was canceled.
     * @param value Value to set for the canceledAt property.
     */
    public void setCanceledAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.canceledAt = value;
    }
    /**
     * Sets the cancelReason property value. Reason this delivery, run, or request was canceled.
     * @param value Value to set for the cancelReason property.
     */
    public void setCancelReason(@jakarta.annotation.Nullable final String value) {
        this.cancelReason = value;
    }
    /**
     * Sets the complianceAction property value. Compliance action applied to this message, lead, or sender.
     * @param value Value to set for the complianceAction property.
     */
    public void setComplianceAction(@jakarta.annotation.Nullable final String value) {
        this.complianceAction = value;
    }
    /**
     * Sets the conversationId property value. Conversation ID that links this SMS message to the Leadping inbox thread.
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
     * Sets the deliveredAt property value. UTC timestamp when the provider confirmed delivery.
     * @param value Value to set for the deliveredAt property.
     */
    public void setDeliveredAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.deliveredAt = value;
    }
    /**
     * Sets the errorCode property value. Machine-readable error code returned while processing this SMS message.
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final String value) {
        this.errorCode = value;
    }
    /**
     * Sets the errorMessage property value. Human-readable error message returned while processing this SMS message.
     * @param value Value to set for the errorMessage property.
     */
    public void setErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.errorMessage = value;
    }
    /**
     * Sets the failedAt property value. UTC timestamp when processing failed for this SMS message.
     * @param value Value to set for the failedAt property.
     */
    public void setFailedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.failedAt = value;
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
     * Sets the isWarmup property value. Indicates whether this SMS message is part of Leadping sender warmup traffic.
     * @param value Value to set for the isWarmup property.
     */
    public void setIsWarmup(@jakarta.annotation.Nullable final Boolean value) {
        this.isWarmup = value;
    }
    /**
     * Sets the leadId property value. Lead ID associated with the SMS conversation or outreach attempt.
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
     * Sets the nextRetryAt property value. UTC timestamp when Leadping will retry this SMS message.
     * @param value Value to set for the nextRetryAt property.
     */
    public void setNextRetryAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.nextRetryAt = value;
    }
    /**
     * Sets the outboundPhoneNumberId property value. Phone number ID selected for outbound delivery.
     * @param value Value to set for the outboundPhoneNumberId property.
     */
    public void setOutboundPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.outboundPhoneNumberId = value;
    }
    /**
     * Sets the providerMessageId property value. Provider message identifier for SMS delivery tracking and reconciliation.
     * @param value Value to set for the providerMessageId property.
     */
    public void setProviderMessageId(@jakarta.annotation.Nullable final String value) {
        this.providerMessageId = value;
    }
    /**
     * Sets the queuedAt property value. UTC timestamp when Leadping queued this SMS message for processing.
     * @param value Value to set for the queuedAt property.
     */
    public void setQueuedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.queuedAt = value;
    }
    /**
     * Sets the receivedAt property value. UTC timestamp when Leadping received this inbound event or message.
     * @param value Value to set for the receivedAt property.
     */
    public void setReceivedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.receivedAt = value;
    }
    /**
     * Sets the retryCount property value. Number of retry attempts already made for this SMS message.
     * @param value Value to set for the retryCount property.
     */
    public void setRetryCount(@jakarta.annotation.Nullable final Integer value) {
        this.retryCount = value;
    }
    /**
     * Sets the scheduledFor property value. UTC timestamp when Leadping is scheduled to send this SMS message.
     * @param value Value to set for the scheduledFor property.
     */
    public void setScheduledFor(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.scheduledFor = value;
    }
    /**
     * Sets the scheduledReason property value. Reason Leadping scheduled this delivery for a later time.
     * @param value Value to set for the scheduledReason property.
     */
    public void setScheduledReason(@jakarta.annotation.Nullable final String value) {
        this.scheduledReason = value;
    }
    /**
     * Sets the selectionReason property value. Defines the supported Outgoing Number Selection Reason values.
     * @param value Value to set for the selectionReason property.
     */
    public void setSelectionReason(@jakarta.annotation.Nullable final SmsResponseSelectionReason value) {
        this.selectionReason = value;
    }
    /**
     * Sets the sendingStartedAt property value. UTC timestamp when Leadping began sending this message.
     * @param value Value to set for the sendingStartedAt property.
     */
    public void setSendingStartedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.sendingStartedAt = value;
    }
    /**
     * Sets the sentAt property value. UTC timestamp when Leadping sent this message to the provider.
     * @param value Value to set for the sentAt property.
     */
    public void setSentAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.sentAt = value;
    }
    /**
     * Sets the sourceId property value. Lead source ID used for attribution and sender selection on this SMS message.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.sourceId = value;
    }
    /**
     * Sets the status property value. Defines the supported SMS Message Status values.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SmsResponseStatus value) {
        this.status = value;
    }
    /**
     * Sets the statusReason property value. Human-readable reason explaining the current status of this SMS message.
     * @param value Value to set for the statusReason property.
     */
    public void setStatusReason(@jakarta.annotation.Nullable final String value) {
        this.statusReason = value;
    }
    /**
     * Sets the telnyxId property value. Telnyx identifier connected to this phone number, call, or SMS event.
     * @param value Value to set for the telnyxId property.
     */
    public void setTelnyxId(@jakarta.annotation.Nullable final String value) {
        this.telnyxId = value;
    }
    /**
     * Sets the tenDlcCampaignId property value. 10DLC campaign identifier associated with this sender or SMS event.
     * @param value Value to set for the tenDlcCampaignId property.
     */
    public void setTenDlcCampaignId(@jakarta.annotation.Nullable final String value) {
        this.tenDlcCampaignId = value;
    }
    /**
     * Sets the text property value. Body text for the SMS message or communication represented by this SMS message.
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.text = value;
    }
    /**
     * Sets the trafficType property value. Defines the supported SMS Traffic Type values.
     * @param value Value to set for the trafficType property.
     */
    public void setTrafficType(@jakarta.annotation.Nullable final SmsResponseTrafficType value) {
        this.trafficType = value;
    }
    /**
     * Sets the undeliverableAt property value. UTC timestamp when the provider marked the message undeliverable.
     * @param value Value to set for the undeliverableAt property.
     */
    public void setUndeliverableAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.undeliverableAt = value;
    }
    /**
     * Sets the wasManuallyOverridden property value. Indicates whether a user manually overrode Leadping&apos;s automatic number selection for this SMS message.
     * @param value Value to set for the wasManuallyOverridden property.
     */
    public void setWasManuallyOverridden(@jakarta.annotation.Nullable final Boolean value) {
        this.wasManuallyOverridden = value;
    }
}
