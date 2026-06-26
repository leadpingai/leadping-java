package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Response schema for the Leadping API event detail response returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EventDetailResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * UTC timestamp when Leadping blocked this communication.
     */
    private OffsetDateTime blockedAt;
    /**
     * UTC timestamp when this delivery or workflow was canceled.
     */
    private OffsetDateTime canceledAt;
    /**
     * Conversation ID that links this event detail response to the Leadping inbox thread.
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
     * Human-readable description that explains this event detail response to API users.
     */
    private String description;
    /**
     * Communication direction for this event detail response, such as inbound or outbound.
     */
    private String direction;
    /**
     * High-level category used to group this Leadping event.
     */
    private String eventCategory;
    /**
     * Event type used to classify this timeline, SMS, call, or automation event.
     */
    private String eventType;
    /**
     * UTC timestamp when processing failed for this event detail response.
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
     * Lead ID associated with this event detail record.
     */
    private String leadId;
    /**
     * The date and time when the entity was last modified, if applicable.
     */
    private OffsetDateTime modifiedAt;
    /**
     * Phone number ID selected for outbound delivery.
     */
    private String outboundPhoneNumberId;
    /**
     * Provider message identifier for SMS delivery tracking and reconciliation.
     */
    private String providerMessageId;
    /**
     * UTC timestamp when Leadping queued this event detail response for processing.
     */
    private OffsetDateTime queuedAt;
    /**
     * UTC timestamp when Leadping received this inbound event or message.
     */
    private OffsetDateTime receivedAt;
    /**
     * UTC timestamp when the related delivery or workflow action is scheduled to run.
     */
    private OffsetDateTime scheduledFor;
    /**
     * Secondary event type used for additional event classification.
     */
    private String secondaryEventType;
    /**
     * UTC timestamp when Leadping began sending this message.
     */
    private OffsetDateTime sendingStartedAt;
    /**
     * UTC timestamp when Leadping sent this message to the provider.
     */
    private OffsetDateTime sentAt;
    /**
     * Defines the supported Event status values.
     */
    private EventDetailResponseStatus status;
    /**
     * Human-readable reason explaining the current status of this event detail response.
     */
    private String statusReason;
    /**
     * Short human-readable summary of this event detail response for lists, timelines, and notifications.
     */
    private String summary;
    /**
     * Timeline category used to group events for display and filtering.
     */
    private String timelineCategory;
    /**
     * Defines the supported Event timeline type values.
     */
    private EventDetailResponseTimelineType timelineType;
    /**
     * Recipient phone number used for this communication.
     */
    private String toPhoneNumber;
    /**
     * UTC timestamp when the provider marked the message undeliverable.
     */
    private OffsetDateTime undeliverableAt;
    /**
     * User summary connected to this event detail response.
     */
    private EventDetailResponseUser user;
    /**
     * User ID associated with the activity that created this event.
     */
    private String userId;
    /**
     * Instantiates a new {@link EventDetailResponse} and sets the default values.
     */
    public EventDetailResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EventDetailResponse}
     */
    @jakarta.annotation.Nonnull
    public static EventDetailResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EventDetailResponse();
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
     * Gets the blockedAt property value. UTC timestamp when Leadping blocked this communication.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getBlockedAt() {
        return this.blockedAt;
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
     * Gets the conversationId property value. Conversation ID that links this event detail response to the Leadping inbox thread.
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
     * Gets the description property value. Human-readable description that explains this event detail response to API users.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the direction property value. Communication direction for this event detail response, such as inbound or outbound.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDirection() {
        return this.direction;
    }
    /**
     * Gets the eventCategory property value. High-level category used to group this Leadping event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventCategory() {
        return this.eventCategory;
    }
    /**
     * Gets the eventType property value. Event type used to classify this timeline, SMS, call, or automation event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEventType() {
        return this.eventType;
    }
    /**
     * Gets the failedAt property value. UTC timestamp when processing failed for this event detail response.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(32);
        deserializerMap.put("blockedAt", (n) -> { this.setBlockedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("canceledAt", (n) -> { this.setCanceledAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("conversationId", (n) -> { this.setConversationId(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deliveredAt", (n) -> { this.setDeliveredAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("direction", (n) -> { this.setDirection(n.getStringValue()); });
        deserializerMap.put("eventCategory", (n) -> { this.setEventCategory(n.getStringValue()); });
        deserializerMap.put("eventType", (n) -> { this.setEventType(n.getStringValue()); });
        deserializerMap.put("failedAt", (n) -> { this.setFailedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fromPhoneNumber", (n) -> { this.setFromPhoneNumber(n.getStringValue()); });
        deserializerMap.put("fromPhoneNumberId", (n) -> { this.setFromPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("outboundPhoneNumberId", (n) -> { this.setOutboundPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("providerMessageId", (n) -> { this.setProviderMessageId(n.getStringValue()); });
        deserializerMap.put("queuedAt", (n) -> { this.setQueuedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("receivedAt", (n) -> { this.setReceivedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("scheduledFor", (n) -> { this.setScheduledFor(n.getOffsetDateTimeValue()); });
        deserializerMap.put("secondaryEventType", (n) -> { this.setSecondaryEventType(n.getStringValue()); });
        deserializerMap.put("sendingStartedAt", (n) -> { this.setSendingStartedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sentAt", (n) -> { this.setSentAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(EventDetailResponseStatus::forValue)); });
        deserializerMap.put("statusReason", (n) -> { this.setStatusReason(n.getStringValue()); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getStringValue()); });
        deserializerMap.put("timelineCategory", (n) -> { this.setTimelineCategory(n.getStringValue()); });
        deserializerMap.put("timelineType", (n) -> { this.setTimelineType(n.getEnumValue(EventDetailResponseTimelineType::forValue)); });
        deserializerMap.put("toPhoneNumber", (n) -> { this.setToPhoneNumber(n.getStringValue()); });
        deserializerMap.put("undeliverableAt", (n) -> { this.setUndeliverableAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(EventDetailResponseUser::createFromDiscriminatorValue)); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
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
     * Gets the leadId property value. Lead ID associated with this event detail record.
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
     * Gets the queuedAt property value. UTC timestamp when Leadping queued this event detail response for processing.
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
     * Gets the scheduledFor property value. UTC timestamp when the related delivery or workflow action is scheduled to run.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getScheduledFor() {
        return this.scheduledFor;
    }
    /**
     * Gets the secondaryEventType property value. Secondary event type used for additional event classification.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecondaryEventType() {
        return this.secondaryEventType;
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
     * Gets the status property value. Defines the supported Event status values.
     * @return a {@link EventDetailResponseStatus}
     */
    @jakarta.annotation.Nullable
    public EventDetailResponseStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the statusReason property value. Human-readable reason explaining the current status of this event detail response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusReason() {
        return this.statusReason;
    }
    /**
     * Gets the summary property value. Short human-readable summary of this event detail response for lists, timelines, and notifications.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSummary() {
        return this.summary;
    }
    /**
     * Gets the timelineCategory property value. Timeline category used to group events for display and filtering.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimelineCategory() {
        return this.timelineCategory;
    }
    /**
     * Gets the timelineType property value. Defines the supported Event timeline type values.
     * @return a {@link EventDetailResponseTimelineType}
     */
    @jakarta.annotation.Nullable
    public EventDetailResponseTimelineType getTimelineType() {
        return this.timelineType;
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
     * Gets the undeliverableAt property value. UTC timestamp when the provider marked the message undeliverable.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUndeliverableAt() {
        return this.undeliverableAt;
    }
    /**
     * Gets the user property value. User summary connected to this event detail response.
     * @return a {@link EventDetailResponseUser}
     */
    @jakarta.annotation.Nullable
    public EventDetailResponseUser getUser() {
        return this.user;
    }
    /**
     * Gets the userId property value. User ID associated with the activity that created this event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("blockedAt", this.getBlockedAt());
        writer.writeOffsetDateTimeValue("canceledAt", this.getCanceledAt());
        writer.writeStringValue("conversationId", this.getConversationId());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeOffsetDateTimeValue("deliveredAt", this.getDeliveredAt());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("direction", this.getDirection());
        writer.writeStringValue("eventCategory", this.getEventCategory());
        writer.writeStringValue("eventType", this.getEventType());
        writer.writeOffsetDateTimeValue("failedAt", this.getFailedAt());
        writer.writeStringValue("fromPhoneNumber", this.getFromPhoneNumber());
        writer.writeStringValue("fromPhoneNumberId", this.getFromPhoneNumberId());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("outboundPhoneNumberId", this.getOutboundPhoneNumberId());
        writer.writeStringValue("providerMessageId", this.getProviderMessageId());
        writer.writeOffsetDateTimeValue("queuedAt", this.getQueuedAt());
        writer.writeOffsetDateTimeValue("receivedAt", this.getReceivedAt());
        writer.writeOffsetDateTimeValue("scheduledFor", this.getScheduledFor());
        writer.writeStringValue("secondaryEventType", this.getSecondaryEventType());
        writer.writeOffsetDateTimeValue("sendingStartedAt", this.getSendingStartedAt());
        writer.writeOffsetDateTimeValue("sentAt", this.getSentAt());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("statusReason", this.getStatusReason());
        writer.writeStringValue("summary", this.getSummary());
        writer.writeStringValue("timelineCategory", this.getTimelineCategory());
        writer.writeEnumValue("timelineType", this.getTimelineType());
        writer.writeStringValue("toPhoneNumber", this.getToPhoneNumber());
        writer.writeOffsetDateTimeValue("undeliverableAt", this.getUndeliverableAt());
        writer.writeObjectValue("user", this.getUser());
        writer.writeStringValue("userId", this.getUserId());
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
     * Sets the blockedAt property value. UTC timestamp when Leadping blocked this communication.
     * @param value Value to set for the blockedAt property.
     */
    public void setBlockedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.blockedAt = value;
    }
    /**
     * Sets the canceledAt property value. UTC timestamp when this delivery or workflow was canceled.
     * @param value Value to set for the canceledAt property.
     */
    public void setCanceledAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.canceledAt = value;
    }
    /**
     * Sets the conversationId property value. Conversation ID that links this event detail response to the Leadping inbox thread.
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
     * Sets the description property value. Human-readable description that explains this event detail response to API users.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the direction property value. Communication direction for this event detail response, such as inbound or outbound.
     * @param value Value to set for the direction property.
     */
    public void setDirection(@jakarta.annotation.Nullable final String value) {
        this.direction = value;
    }
    /**
     * Sets the eventCategory property value. High-level category used to group this Leadping event.
     * @param value Value to set for the eventCategory property.
     */
    public void setEventCategory(@jakarta.annotation.Nullable final String value) {
        this.eventCategory = value;
    }
    /**
     * Sets the eventType property value. Event type used to classify this timeline, SMS, call, or automation event.
     * @param value Value to set for the eventType property.
     */
    public void setEventType(@jakarta.annotation.Nullable final String value) {
        this.eventType = value;
    }
    /**
     * Sets the failedAt property value. UTC timestamp when processing failed for this event detail response.
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
     * Sets the leadId property value. Lead ID associated with this event detail record.
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
     * Sets the queuedAt property value. UTC timestamp when Leadping queued this event detail response for processing.
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
     * Sets the scheduledFor property value. UTC timestamp when the related delivery or workflow action is scheduled to run.
     * @param value Value to set for the scheduledFor property.
     */
    public void setScheduledFor(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.scheduledFor = value;
    }
    /**
     * Sets the secondaryEventType property value. Secondary event type used for additional event classification.
     * @param value Value to set for the secondaryEventType property.
     */
    public void setSecondaryEventType(@jakarta.annotation.Nullable final String value) {
        this.secondaryEventType = value;
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
     * Sets the status property value. Defines the supported Event status values.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final EventDetailResponseStatus value) {
        this.status = value;
    }
    /**
     * Sets the statusReason property value. Human-readable reason explaining the current status of this event detail response.
     * @param value Value to set for the statusReason property.
     */
    public void setStatusReason(@jakarta.annotation.Nullable final String value) {
        this.statusReason = value;
    }
    /**
     * Sets the summary property value. Short human-readable summary of this event detail response for lists, timelines, and notifications.
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final String value) {
        this.summary = value;
    }
    /**
     * Sets the timelineCategory property value. Timeline category used to group events for display and filtering.
     * @param value Value to set for the timelineCategory property.
     */
    public void setTimelineCategory(@jakarta.annotation.Nullable final String value) {
        this.timelineCategory = value;
    }
    /**
     * Sets the timelineType property value. Defines the supported Event timeline type values.
     * @param value Value to set for the timelineType property.
     */
    public void setTimelineType(@jakarta.annotation.Nullable final EventDetailResponseTimelineType value) {
        this.timelineType = value;
    }
    /**
     * Sets the toPhoneNumber property value. Recipient phone number used for this communication.
     * @param value Value to set for the toPhoneNumber property.
     */
    public void setToPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.toPhoneNumber = value;
    }
    /**
     * Sets the undeliverableAt property value. UTC timestamp when the provider marked the message undeliverable.
     * @param value Value to set for the undeliverableAt property.
     */
    public void setUndeliverableAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.undeliverableAt = value;
    }
    /**
     * Sets the user property value. User summary connected to this event detail response.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final EventDetailResponseUser value) {
        this.user = value;
    }
    /**
     * Sets the userId property value. User ID associated with the activity that created this event.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
