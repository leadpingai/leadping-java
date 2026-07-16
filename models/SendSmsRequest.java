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
 * Request schema for the Leadping API SMS send request, including the fields clients can send.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendSmsRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Messaging campaign identifier associated with this SMS send request.
     */
    private String campaignId;
    /**
     * Conversation ID that links this SMS send request to the Leadping inbox thread.
     */
    private String conversationId;
    /**
     * Sender phone number ID used for this outbound SMS or call.
     */
    private String fromPhoneNumberId;
    /**
     * Idempotency key used to prevent duplicate outbound delivery.
     */
    private String outboundIdempotencyKey;
    /**
     * UTC timestamp when Leadping should send the SMS message.
     */
    private OffsetDateTime scheduledFor;
    /**
     * Existing SMS event ID to reuse or update when retrying a send request.
     */
    private String smsEventId;
    /**
     * Lead source ID used for attribution and sender selection.
     */
    private String sourceId;
    /**
     * Body text for the SMS message or communication represented by this SMS send request.
     */
    private String text;
    /**
     * Indicates whether a user manually overrode Leadping&apos;s automatic number selection for this SMS send request.
     */
    private Boolean wasManuallyOverridden;
    /**
     * Instantiates a new {@link SendSmsRequest} and sets the default values.
     */
    public SendSmsRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SendSmsRequest}
     */
    @jakarta.annotation.Nonnull
    public static SendSmsRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SendSmsRequest();
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
     * Gets the campaignId property value. Messaging campaign identifier associated with this SMS send request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignId() {
        return this.campaignId;
    }
    /**
     * Gets the conversationId property value. Conversation ID that links this SMS send request to the Leadping inbox thread.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationId() {
        return this.conversationId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("campaignId", (n) -> { this.setCampaignId(n.getStringValue()); });
        deserializerMap.put("conversationId", (n) -> { this.setConversationId(n.getStringValue()); });
        deserializerMap.put("fromPhoneNumberId", (n) -> { this.setFromPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("outboundIdempotencyKey", (n) -> { this.setOutboundIdempotencyKey(n.getStringValue()); });
        deserializerMap.put("scheduledFor", (n) -> { this.setScheduledFor(n.getOffsetDateTimeValue()); });
        deserializerMap.put("smsEventId", (n) -> { this.setSmsEventId(n.getStringValue()); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        deserializerMap.put("wasManuallyOverridden", (n) -> { this.setWasManuallyOverridden(n.getBooleanValue()); });
        return deserializerMap;
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
     * Gets the outboundIdempotencyKey property value. Idempotency key used to prevent duplicate outbound delivery.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOutboundIdempotencyKey() {
        return this.outboundIdempotencyKey;
    }
    /**
     * Gets the scheduledFor property value. UTC timestamp when Leadping should send the SMS message.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getScheduledFor() {
        return this.scheduledFor;
    }
    /**
     * Gets the smsEventId property value. Existing SMS event ID to reuse or update when retrying a send request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSmsEventId() {
        return this.smsEventId;
    }
    /**
     * Gets the sourceId property value. Lead source ID used for attribution and sender selection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.sourceId;
    }
    /**
     * Gets the text property value. Body text for the SMS message or communication represented by this SMS send request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.text;
    }
    /**
     * Gets the wasManuallyOverridden property value. Indicates whether a user manually overrode Leadping&apos;s automatic number selection for this SMS send request.
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
        writer.writeStringValue("conversationId", this.getConversationId());
        writer.writeStringValue("fromPhoneNumberId", this.getFromPhoneNumberId());
        writer.writeStringValue("outboundIdempotencyKey", this.getOutboundIdempotencyKey());
        writer.writeOffsetDateTimeValue("scheduledFor", this.getScheduledFor());
        writer.writeStringValue("smsEventId", this.getSmsEventId());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeStringValue("text", this.getText());
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
     * Sets the campaignId property value. Messaging campaign identifier associated with this SMS send request.
     * @param value Value to set for the campaignId property.
     */
    public void setCampaignId(@jakarta.annotation.Nullable final String value) {
        this.campaignId = value;
    }
    /**
     * Sets the conversationId property value. Conversation ID that links this SMS send request to the Leadping inbox thread.
     * @param value Value to set for the conversationId property.
     */
    public void setConversationId(@jakarta.annotation.Nullable final String value) {
        this.conversationId = value;
    }
    /**
     * Sets the fromPhoneNumberId property value. Sender phone number ID used for this outbound SMS or call.
     * @param value Value to set for the fromPhoneNumberId property.
     */
    public void setFromPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.fromPhoneNumberId = value;
    }
    /**
     * Sets the outboundIdempotencyKey property value. Idempotency key used to prevent duplicate outbound delivery.
     * @param value Value to set for the outboundIdempotencyKey property.
     */
    public void setOutboundIdempotencyKey(@jakarta.annotation.Nullable final String value) {
        this.outboundIdempotencyKey = value;
    }
    /**
     * Sets the scheduledFor property value. UTC timestamp when Leadping should send the SMS message.
     * @param value Value to set for the scheduledFor property.
     */
    public void setScheduledFor(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.scheduledFor = value;
    }
    /**
     * Sets the smsEventId property value. Existing SMS event ID to reuse or update when retrying a send request.
     * @param value Value to set for the smsEventId property.
     */
    public void setSmsEventId(@jakarta.annotation.Nullable final String value) {
        this.smsEventId = value;
    }
    /**
     * Sets the sourceId property value. Lead source ID used for attribution and sender selection.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.sourceId = value;
    }
    /**
     * Sets the text property value. Body text for the SMS message or communication represented by this SMS send request.
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.text = value;
    }
    /**
     * Sets the wasManuallyOverridden property value. Indicates whether a user manually overrode Leadping&apos;s automatic number selection for this SMS send request.
     * @param value Value to set for the wasManuallyOverridden property.
     */
    public void setWasManuallyOverridden(@jakarta.annotation.Nullable final Boolean value) {
        this.wasManuallyOverridden = value;
    }
}
