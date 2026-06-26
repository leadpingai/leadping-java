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
 * List item schema for Leadping API SMS event table row results shown in searchable tables.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SmsEventTableRow implements AdditionalDataHolder, Parsable {
    /**
     * Display name for the actor that performed the action.
     */
    private String actorDisplayName;
    /**
     * User ID for the actor that performed the action.
     */
    private String actorUserId;
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
     * Business summary connected to this SMS event table row.
     */
    private String business;
    /**
     * Business display name shown for this SMS event.
     */
    private String businessName;
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
     * Conversation ID that links this SMS event table row to the Leadping inbox thread.
     */
    private String conversationId;
    /**
     * UTC timestamp when this SMS event table row was created.
     */
    private OffsetDateTime createdAt;
    /**
     * UTC timestamp when the provider confirmed delivery.
     */
    private OffsetDateTime deliveredAt;
    /**
     * Communication direction for this SMS event table row, such as inbound or outbound.
     */
    private String direction;
    /**
     * Machine-readable error code returned while processing this SMS event table row.
     */
    private String errorCode;
    /**
     * Human-readable error message returned while processing this SMS event table row.
     */
    private String errorMessage;
    /**
     * UTC timestamp when processing failed for this SMS event table row.
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
     * Unique Leadping identifier for this SMS event table row.
     */
    private String id;
    /**
     * Indicates whether automation created or triggered this SMS event table row.
     */
    private Boolean isAutomated;
    /**
     * Indicates whether this SMS event table row is part of Leadping sender warmup traffic.
     */
    private Boolean isWarmup;
    /**
     * Lead ID associated with this SMS event.
     */
    private String leadId;
    /**
     * Lead display name shown for this SMS event.
     */
    private String leadName;
    /**
     * Phone number ID selected for outbound delivery.
     */
    private String outboundPhoneNumberId;
    /**
     * Defines the source that requested outbound delivery.
     */
    private SmsEventTableRowOutboundSource outboundSource;
    /**
     * Provider message identifier for SMS delivery tracking and reconciliation.
     */
    private String providerMessageId;
    /**
     * UTC timestamp when Leadping queued this SMS event table row for processing.
     */
    private OffsetDateTime queuedAt;
    /**
     * UTC timestamp when Leadping received this inbound event or message.
     */
    private OffsetDateTime receivedAt;
    /**
     * UTC timestamp when this SMS event is scheduled to send.
     */
    private OffsetDateTime scheduledFor;
    /**
     * Reason Leadping scheduled this delivery for a later time.
     */
    private String scheduledReason;
    /**
     * Display name for the sender of this message.
     */
    private String senderName;
    /**
     * UTC timestamp when Leadping began sending this message.
     */
    private OffsetDateTime sendingStartedAt;
    /**
     * UTC timestamp when Leadping sent this message to the provider.
     */
    private OffsetDateTime sentAt;
    /**
     * Defines the supported SMS Message Status values.
     */
    private SmsEventTableRowStatus status;
    /**
     * Human-readable reason explaining the current status of this SMS event table row.
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
     * Body text for the SMS message or communication represented by this SMS event table row.
     */
    private String text;
    /**
     * Recipient phone number used for this communication.
     */
    private String toPhoneNumber;
    /**
     * Defines the supported SMS Traffic Type values.
     */
    private SmsEventTableRowTrafficType trafficType;
    /**
     * UTC timestamp when the provider marked the message undeliverable.
     */
    private OffsetDateTime undeliverableAt;
    /**
     * User summary connected to this SMS event table row.
     */
    private String user;
    /**
     * Display name for the user connected to this SMS event table row.
     */
    private String userName;
    /**
     * Instantiates a new {@link SmsEventTableRow} and sets the default values.
     */
    public SmsEventTableRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SmsEventTableRow}
     */
    @jakarta.annotation.Nonnull
    public static SmsEventTableRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SmsEventTableRow();
    }
    /**
     * Gets the actorDisplayName property value. Display name for the actor that performed the action.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActorDisplayName() {
        return this.actorDisplayName;
    }
    /**
     * Gets the actorUserId property value. User ID for the actor that performed the action.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActorUserId() {
        return this.actorUserId;
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
     * Gets the business property value. Business summary connected to this SMS event table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusiness() {
        return this.business;
    }
    /**
     * Gets the businessName property value. Business display name shown for this SMS event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessName() {
        return this.businessName;
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
     * Gets the conversationId property value. Conversation ID that links this SMS event table row to the Leadping inbox thread.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationId() {
        return this.conversationId;
    }
    /**
     * Gets the createdAt property value. UTC timestamp when this SMS event table row was created.
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
     * Gets the direction property value. Communication direction for this SMS event table row, such as inbound or outbound.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDirection() {
        return this.direction;
    }
    /**
     * Gets the errorCode property value. Machine-readable error code returned while processing this SMS event table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * Gets the errorMessage property value. Human-readable error message returned while processing this SMS event table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * Gets the failedAt property value. UTC timestamp when processing failed for this SMS event table row.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(44);
        deserializerMap.put("actorDisplayName", (n) -> { this.setActorDisplayName(n.getStringValue()); });
        deserializerMap.put("actorUserId", (n) -> { this.setActorUserId(n.getStringValue()); });
        deserializerMap.put("billableAmount", (n) -> { this.setBillableAmount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("billingStatus", (n) -> { this.setBillingStatus(n.getStringValue()); });
        deserializerMap.put("blockedAt", (n) -> { this.setBlockedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("business", (n) -> { this.setBusiness(n.getStringValue()); });
        deserializerMap.put("businessName", (n) -> { this.setBusinessName(n.getStringValue()); });
        deserializerMap.put("canceledAt", (n) -> { this.setCanceledAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("cancelReason", (n) -> { this.setCancelReason(n.getStringValue()); });
        deserializerMap.put("complianceAction", (n) -> { this.setComplianceAction(n.getStringValue()); });
        deserializerMap.put("conversationId", (n) -> { this.setConversationId(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deliveredAt", (n) -> { this.setDeliveredAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("direction", (n) -> { this.setDirection(n.getStringValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getStringValue()); });
        deserializerMap.put("errorMessage", (n) -> { this.setErrorMessage(n.getStringValue()); });
        deserializerMap.put("failedAt", (n) -> { this.setFailedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fromPhoneNumber", (n) -> { this.setFromPhoneNumber(n.getStringValue()); });
        deserializerMap.put("fromPhoneNumberId", (n) -> { this.setFromPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isAutomated", (n) -> { this.setIsAutomated(n.getBooleanValue()); });
        deserializerMap.put("isWarmup", (n) -> { this.setIsWarmup(n.getBooleanValue()); });
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("leadName", (n) -> { this.setLeadName(n.getStringValue()); });
        deserializerMap.put("outboundPhoneNumberId", (n) -> { this.setOutboundPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("outboundSource", (n) -> { this.setOutboundSource(n.getEnumValue(SmsEventTableRowOutboundSource::forValue)); });
        deserializerMap.put("providerMessageId", (n) -> { this.setProviderMessageId(n.getStringValue()); });
        deserializerMap.put("queuedAt", (n) -> { this.setQueuedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("receivedAt", (n) -> { this.setReceivedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("scheduledFor", (n) -> { this.setScheduledFor(n.getOffsetDateTimeValue()); });
        deserializerMap.put("scheduledReason", (n) -> { this.setScheduledReason(n.getStringValue()); });
        deserializerMap.put("senderName", (n) -> { this.setSenderName(n.getStringValue()); });
        deserializerMap.put("sendingStartedAt", (n) -> { this.setSendingStartedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sentAt", (n) -> { this.setSentAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SmsEventTableRowStatus::forValue)); });
        deserializerMap.put("statusReason", (n) -> { this.setStatusReason(n.getStringValue()); });
        deserializerMap.put("telnyxId", (n) -> { this.setTelnyxId(n.getStringValue()); });
        deserializerMap.put("tenDlcCampaignId", (n) -> { this.setTenDlcCampaignId(n.getStringValue()); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        deserializerMap.put("toPhoneNumber", (n) -> { this.setToPhoneNumber(n.getStringValue()); });
        deserializerMap.put("trafficType", (n) -> { this.setTrafficType(n.getEnumValue(SmsEventTableRowTrafficType::forValue)); });
        deserializerMap.put("undeliverableAt", (n) -> { this.setUndeliverableAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
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
     * Gets the id property value. Unique Leadping identifier for this SMS event table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isAutomated property value. Indicates whether automation created or triggered this SMS event table row.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAutomated() {
        return this.isAutomated;
    }
    /**
     * Gets the isWarmup property value. Indicates whether this SMS event table row is part of Leadping sender warmup traffic.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsWarmup() {
        return this.isWarmup;
    }
    /**
     * Gets the leadId property value. Lead ID associated with this SMS event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the leadName property value. Lead display name shown for this SMS event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadName() {
        return this.leadName;
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
     * Gets the outboundSource property value. Defines the source that requested outbound delivery.
     * @return a {@link SmsEventTableRowOutboundSource}
     */
    @jakarta.annotation.Nullable
    public SmsEventTableRowOutboundSource getOutboundSource() {
        return this.outboundSource;
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
     * Gets the queuedAt property value. UTC timestamp when Leadping queued this SMS event table row for processing.
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
     * Gets the scheduledFor property value. UTC timestamp when this SMS event is scheduled to send.
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
     * Gets the senderName property value. Display name for the sender of this message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSenderName() {
        return this.senderName;
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
     * Gets the status property value. Defines the supported SMS Message Status values.
     * @return a {@link SmsEventTableRowStatus}
     */
    @jakarta.annotation.Nullable
    public SmsEventTableRowStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the statusReason property value. Human-readable reason explaining the current status of this SMS event table row.
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
     * Gets the text property value. Body text for the SMS message or communication represented by this SMS event table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.text;
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
     * Gets the trafficType property value. Defines the supported SMS Traffic Type values.
     * @return a {@link SmsEventTableRowTrafficType}
     */
    @jakarta.annotation.Nullable
    public SmsEventTableRowTrafficType getTrafficType() {
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
     * Gets the user property value. User summary connected to this SMS event table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUser() {
        return this.user;
    }
    /**
     * Gets the userName property value. Display name for the user connected to this SMS event table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("actorDisplayName", this.getActorDisplayName());
        writer.writeStringValue("actorUserId", this.getActorUserId());
        writer.writeObjectValue("billableAmount", this.getBillableAmount());
        writer.writeStringValue("billingStatus", this.getBillingStatus());
        writer.writeOffsetDateTimeValue("blockedAt", this.getBlockedAt());
        writer.writeStringValue("business", this.getBusiness());
        writer.writeStringValue("businessName", this.getBusinessName());
        writer.writeOffsetDateTimeValue("canceledAt", this.getCanceledAt());
        writer.writeStringValue("cancelReason", this.getCancelReason());
        writer.writeStringValue("complianceAction", this.getComplianceAction());
        writer.writeStringValue("conversationId", this.getConversationId());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeOffsetDateTimeValue("deliveredAt", this.getDeliveredAt());
        writer.writeStringValue("direction", this.getDirection());
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeStringValue("errorMessage", this.getErrorMessage());
        writer.writeOffsetDateTimeValue("failedAt", this.getFailedAt());
        writer.writeStringValue("fromPhoneNumber", this.getFromPhoneNumber());
        writer.writeStringValue("fromPhoneNumberId", this.getFromPhoneNumberId());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isAutomated", this.getIsAutomated());
        writer.writeBooleanValue("isWarmup", this.getIsWarmup());
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeStringValue("leadName", this.getLeadName());
        writer.writeStringValue("outboundPhoneNumberId", this.getOutboundPhoneNumberId());
        writer.writeEnumValue("outboundSource", this.getOutboundSource());
        writer.writeStringValue("providerMessageId", this.getProviderMessageId());
        writer.writeOffsetDateTimeValue("queuedAt", this.getQueuedAt());
        writer.writeOffsetDateTimeValue("receivedAt", this.getReceivedAt());
        writer.writeOffsetDateTimeValue("scheduledFor", this.getScheduledFor());
        writer.writeStringValue("scheduledReason", this.getScheduledReason());
        writer.writeStringValue("senderName", this.getSenderName());
        writer.writeOffsetDateTimeValue("sendingStartedAt", this.getSendingStartedAt());
        writer.writeOffsetDateTimeValue("sentAt", this.getSentAt());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("statusReason", this.getStatusReason());
        writer.writeStringValue("telnyxId", this.getTelnyxId());
        writer.writeStringValue("tenDlcCampaignId", this.getTenDlcCampaignId());
        writer.writeStringValue("text", this.getText());
        writer.writeStringValue("toPhoneNumber", this.getToPhoneNumber());
        writer.writeEnumValue("trafficType", this.getTrafficType());
        writer.writeOffsetDateTimeValue("undeliverableAt", this.getUndeliverableAt());
        writer.writeStringValue("user", this.getUser());
        writer.writeStringValue("userName", this.getUserName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actorDisplayName property value. Display name for the actor that performed the action.
     * @param value Value to set for the actorDisplayName property.
     */
    public void setActorDisplayName(@jakarta.annotation.Nullable final String value) {
        this.actorDisplayName = value;
    }
    /**
     * Sets the actorUserId property value. User ID for the actor that performed the action.
     * @param value Value to set for the actorUserId property.
     */
    public void setActorUserId(@jakarta.annotation.Nullable final String value) {
        this.actorUserId = value;
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
     * Sets the business property value. Business summary connected to this SMS event table row.
     * @param value Value to set for the business property.
     */
    public void setBusiness(@jakarta.annotation.Nullable final String value) {
        this.business = value;
    }
    /**
     * Sets the businessName property value. Business display name shown for this SMS event.
     * @param value Value to set for the businessName property.
     */
    public void setBusinessName(@jakarta.annotation.Nullable final String value) {
        this.businessName = value;
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
     * Sets the conversationId property value. Conversation ID that links this SMS event table row to the Leadping inbox thread.
     * @param value Value to set for the conversationId property.
     */
    public void setConversationId(@jakarta.annotation.Nullable final String value) {
        this.conversationId = value;
    }
    /**
     * Sets the createdAt property value. UTC timestamp when this SMS event table row was created.
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
     * Sets the direction property value. Communication direction for this SMS event table row, such as inbound or outbound.
     * @param value Value to set for the direction property.
     */
    public void setDirection(@jakarta.annotation.Nullable final String value) {
        this.direction = value;
    }
    /**
     * Sets the errorCode property value. Machine-readable error code returned while processing this SMS event table row.
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final String value) {
        this.errorCode = value;
    }
    /**
     * Sets the errorMessage property value. Human-readable error message returned while processing this SMS event table row.
     * @param value Value to set for the errorMessage property.
     */
    public void setErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.errorMessage = value;
    }
    /**
     * Sets the failedAt property value. UTC timestamp when processing failed for this SMS event table row.
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
     * Sets the id property value. Unique Leadping identifier for this SMS event table row.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isAutomated property value. Indicates whether automation created or triggered this SMS event table row.
     * @param value Value to set for the isAutomated property.
     */
    public void setIsAutomated(@jakarta.annotation.Nullable final Boolean value) {
        this.isAutomated = value;
    }
    /**
     * Sets the isWarmup property value. Indicates whether this SMS event table row is part of Leadping sender warmup traffic.
     * @param value Value to set for the isWarmup property.
     */
    public void setIsWarmup(@jakarta.annotation.Nullable final Boolean value) {
        this.isWarmup = value;
    }
    /**
     * Sets the leadId property value. Lead ID associated with this SMS event.
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the leadName property value. Lead display name shown for this SMS event.
     * @param value Value to set for the leadName property.
     */
    public void setLeadName(@jakarta.annotation.Nullable final String value) {
        this.leadName = value;
    }
    /**
     * Sets the outboundPhoneNumberId property value. Phone number ID selected for outbound delivery.
     * @param value Value to set for the outboundPhoneNumberId property.
     */
    public void setOutboundPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.outboundPhoneNumberId = value;
    }
    /**
     * Sets the outboundSource property value. Defines the source that requested outbound delivery.
     * @param value Value to set for the outboundSource property.
     */
    public void setOutboundSource(@jakarta.annotation.Nullable final SmsEventTableRowOutboundSource value) {
        this.outboundSource = value;
    }
    /**
     * Sets the providerMessageId property value. Provider message identifier for SMS delivery tracking and reconciliation.
     * @param value Value to set for the providerMessageId property.
     */
    public void setProviderMessageId(@jakarta.annotation.Nullable final String value) {
        this.providerMessageId = value;
    }
    /**
     * Sets the queuedAt property value. UTC timestamp when Leadping queued this SMS event table row for processing.
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
     * Sets the scheduledFor property value. UTC timestamp when this SMS event is scheduled to send.
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
     * Sets the senderName property value. Display name for the sender of this message.
     * @param value Value to set for the senderName property.
     */
    public void setSenderName(@jakarta.annotation.Nullable final String value) {
        this.senderName = value;
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
     * Sets the status property value. Defines the supported SMS Message Status values.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SmsEventTableRowStatus value) {
        this.status = value;
    }
    /**
     * Sets the statusReason property value. Human-readable reason explaining the current status of this SMS event table row.
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
     * Sets the text property value. Body text for the SMS message or communication represented by this SMS event table row.
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.text = value;
    }
    /**
     * Sets the toPhoneNumber property value. Recipient phone number used for this communication.
     * @param value Value to set for the toPhoneNumber property.
     */
    public void setToPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.toPhoneNumber = value;
    }
    /**
     * Sets the trafficType property value. Defines the supported SMS Traffic Type values.
     * @param value Value to set for the trafficType property.
     */
    public void setTrafficType(@jakarta.annotation.Nullable final SmsEventTableRowTrafficType value) {
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
     * Sets the user property value. User summary connected to this SMS event table row.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final String value) {
        this.user = value;
    }
    /**
     * Sets the userName property value. Display name for the user connected to this SMS event table row.
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.userName = value;
    }
}
