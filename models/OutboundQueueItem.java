package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutboundQueueItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Channel classification for this Leadping outbound queue item.
     */
    private OutboundDeliveryChannel channel;
    /**
     * Unique Leadping identifier for the outbound queue item.
     */
    private String id;
    /**
     * Phone number associated with this Leadping outbound queue item.
     */
    private String phoneNumber;
    /**
     * Human-readable explanation for the current outbound queue item outcome.
     */
    private String reason;
    /**
     * Structured reason codes for outbound pacing and blocking decisions.
     */
    private OutboundQueueItemReasonCode reasonCode;
    /**
     * Date and time when this Leadping outbound queue item was scheduled send.
     */
    private OffsetDateTime scheduledSendAt;
    /**
     * Source classification for this Leadping outbound queue item.
     */
    private OutboundDeliverySource source;
    /**
     * Current status for this Leadping outbound queue item.
     */
    private OutboundDeliveryStatus status;
    /**
     * Instantiates a new {@link OutboundQueueItem} and sets the default values.
     */
    public OutboundQueueItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OutboundQueueItem}
     */
    @jakarta.annotation.Nonnull
    public static OutboundQueueItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutboundQueueItem();
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
     * Gets the channel property value. Channel classification for this Leadping outbound queue item.
     * @return a {@link OutboundDeliveryChannel}
     */
    @jakarta.annotation.Nullable
    public OutboundDeliveryChannel getChannel() {
        return this.channel;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getEnumValue(OutboundDeliveryChannel::forValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("reasonCode", (n) -> { this.setReasonCode(n.getEnumValue(OutboundQueueItemReasonCode::forValue)); });
        deserializerMap.put("scheduledSendAt", (n) -> { this.setScheduledSendAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(OutboundDeliverySource::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(OutboundDeliveryStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for the outbound queue item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the phoneNumber property value. Phone number associated with this Leadping outbound queue item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the reason property value. Human-readable explanation for the current outbound queue item outcome.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the reasonCode property value. Structured reason codes for outbound pacing and blocking decisions.
     * @return a {@link OutboundQueueItemReasonCode}
     */
    @jakarta.annotation.Nullable
    public OutboundQueueItemReasonCode getReasonCode() {
        return this.reasonCode;
    }
    /**
     * Gets the scheduledSendAt property value. Date and time when this Leadping outbound queue item was scheduled send.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getScheduledSendAt() {
        return this.scheduledSendAt;
    }
    /**
     * Gets the source property value. Source classification for this Leadping outbound queue item.
     * @return a {@link OutboundDeliverySource}
     */
    @jakarta.annotation.Nullable
    public OutboundDeliverySource getSource() {
        return this.source;
    }
    /**
     * Gets the status property value. Current status for this Leadping outbound queue item.
     * @return a {@link OutboundDeliveryStatus}
     */
    @jakarta.annotation.Nullable
    public OutboundDeliveryStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("channel", this.getChannel());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeStringValue("reason", this.getReason());
        writer.writeEnumValue("reasonCode", this.getReasonCode());
        writer.writeOffsetDateTimeValue("scheduledSendAt", this.getScheduledSendAt());
        writer.writeEnumValue("source", this.getSource());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the channel property value. Channel classification for this Leadping outbound queue item.
     * @param value Value to set for the channel property.
     */
    public void setChannel(@jakarta.annotation.Nullable final OutboundDeliveryChannel value) {
        this.channel = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for the outbound queue item.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the phoneNumber property value. Phone number associated with this Leadping outbound queue item.
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the reason property value. Human-readable explanation for the current outbound queue item outcome.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the reasonCode property value. Structured reason codes for outbound pacing and blocking decisions.
     * @param value Value to set for the reasonCode property.
     */
    public void setReasonCode(@jakarta.annotation.Nullable final OutboundQueueItemReasonCode value) {
        this.reasonCode = value;
    }
    /**
     * Sets the scheduledSendAt property value. Date and time when this Leadping outbound queue item was scheduled send.
     * @param value Value to set for the scheduledSendAt property.
     */
    public void setScheduledSendAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.scheduledSendAt = value;
    }
    /**
     * Sets the source property value. Source classification for this Leadping outbound queue item.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final OutboundDeliverySource value) {
        this.source = value;
    }
    /**
     * Sets the status property value. Current status for this Leadping outbound queue item.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final OutboundDeliveryStatus value) {
        this.status = value;
    }
}
