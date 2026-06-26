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
     * Automation ID connected to this workflow, run, or event.
     */
    private String automationId;
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
     * Indicates whether the lead has the consent required for compliant outreach.
     */
    private Boolean hasRequiredConsent;
    /**
     * Bulk import batch ID that created or updated this lead.
     */
    private String importBatchId;
    /**
     * Indicates whether automation created or triggered this SMS send request.
     */
    private Boolean isAutomated;
    /**
     * Indicates whether this record originated from a bulk import rather than a real-time lead source.
     */
    private Boolean isImportedLead;
    /**
     * Outbound delivery request ID connected to this decision or attempt.
     */
    private String outboundDeliveryRequestId;
    /**
     * Idempotency key used to prevent duplicate outbound delivery.
     */
    private String outboundIdempotencyKey;
    /**
     * Defines priority classes used when pacing outbound delivery.
     */
    private SendSmsRequestOutboundPriority outboundPriority;
    /**
     * Outbound reservation ID used to throttle and track delivery capacity.
     */
    private String outboundReservationId;
    /**
     * Defines the source that requested outbound delivery.
     */
    private SendSmsRequestOutboundSource outboundSource;
    /**
     * UTC timestamp when Leadping should send the SMS message.
     */
    private OffsetDateTime scheduledFor;
    /**
     * Defines the supported Outgoing Number Selection Reason values.
     */
    private SendSmsRequestSelectionReason selectionReason;
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
     * Gets the automationId property value. Automation ID connected to this workflow, run, or event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAutomationId() {
        return this.automationId;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(19);
        deserializerMap.put("automationId", (n) -> { this.setAutomationId(n.getStringValue()); });
        deserializerMap.put("campaignId", (n) -> { this.setCampaignId(n.getStringValue()); });
        deserializerMap.put("conversationId", (n) -> { this.setConversationId(n.getStringValue()); });
        deserializerMap.put("fromPhoneNumberId", (n) -> { this.setFromPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("hasRequiredConsent", (n) -> { this.setHasRequiredConsent(n.getBooleanValue()); });
        deserializerMap.put("importBatchId", (n) -> { this.setImportBatchId(n.getStringValue()); });
        deserializerMap.put("isAutomated", (n) -> { this.setIsAutomated(n.getBooleanValue()); });
        deserializerMap.put("isImportedLead", (n) -> { this.setIsImportedLead(n.getBooleanValue()); });
        deserializerMap.put("outboundDeliveryRequestId", (n) -> { this.setOutboundDeliveryRequestId(n.getStringValue()); });
        deserializerMap.put("outboundIdempotencyKey", (n) -> { this.setOutboundIdempotencyKey(n.getStringValue()); });
        deserializerMap.put("outboundPriority", (n) -> { this.setOutboundPriority(n.getEnumValue(SendSmsRequestOutboundPriority::forValue)); });
        deserializerMap.put("outboundReservationId", (n) -> { this.setOutboundReservationId(n.getStringValue()); });
        deserializerMap.put("outboundSource", (n) -> { this.setOutboundSource(n.getEnumValue(SendSmsRequestOutboundSource::forValue)); });
        deserializerMap.put("scheduledFor", (n) -> { this.setScheduledFor(n.getOffsetDateTimeValue()); });
        deserializerMap.put("selectionReason", (n) -> { this.setSelectionReason(n.getEnumValue(SendSmsRequestSelectionReason::forValue)); });
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
     * Gets the hasRequiredConsent property value. Indicates whether the lead has the consent required for compliant outreach.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasRequiredConsent() {
        return this.hasRequiredConsent;
    }
    /**
     * Gets the importBatchId property value. Bulk import batch ID that created or updated this lead.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImportBatchId() {
        return this.importBatchId;
    }
    /**
     * Gets the isAutomated property value. Indicates whether automation created or triggered this SMS send request.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAutomated() {
        return this.isAutomated;
    }
    /**
     * Gets the isImportedLead property value. Indicates whether this record originated from a bulk import rather than a real-time lead source.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsImportedLead() {
        return this.isImportedLead;
    }
    /**
     * Gets the outboundDeliveryRequestId property value. Outbound delivery request ID connected to this decision or attempt.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOutboundDeliveryRequestId() {
        return this.outboundDeliveryRequestId;
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
     * Gets the outboundPriority property value. Defines priority classes used when pacing outbound delivery.
     * @return a {@link SendSmsRequestOutboundPriority}
     */
    @jakarta.annotation.Nullable
    public SendSmsRequestOutboundPriority getOutboundPriority() {
        return this.outboundPriority;
    }
    /**
     * Gets the outboundReservationId property value. Outbound reservation ID used to throttle and track delivery capacity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOutboundReservationId() {
        return this.outboundReservationId;
    }
    /**
     * Gets the outboundSource property value. Defines the source that requested outbound delivery.
     * @return a {@link SendSmsRequestOutboundSource}
     */
    @jakarta.annotation.Nullable
    public SendSmsRequestOutboundSource getOutboundSource() {
        return this.outboundSource;
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
     * Gets the selectionReason property value. Defines the supported Outgoing Number Selection Reason values.
     * @return a {@link SendSmsRequestSelectionReason}
     */
    @jakarta.annotation.Nullable
    public SendSmsRequestSelectionReason getSelectionReason() {
        return this.selectionReason;
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
        writer.writeStringValue("automationId", this.getAutomationId());
        writer.writeStringValue("campaignId", this.getCampaignId());
        writer.writeStringValue("conversationId", this.getConversationId());
        writer.writeStringValue("fromPhoneNumberId", this.getFromPhoneNumberId());
        writer.writeBooleanValue("hasRequiredConsent", this.getHasRequiredConsent());
        writer.writeStringValue("importBatchId", this.getImportBatchId());
        writer.writeBooleanValue("isAutomated", this.getIsAutomated());
        writer.writeBooleanValue("isImportedLead", this.getIsImportedLead());
        writer.writeStringValue("outboundDeliveryRequestId", this.getOutboundDeliveryRequestId());
        writer.writeStringValue("outboundIdempotencyKey", this.getOutboundIdempotencyKey());
        writer.writeEnumValue("outboundPriority", this.getOutboundPriority());
        writer.writeStringValue("outboundReservationId", this.getOutboundReservationId());
        writer.writeEnumValue("outboundSource", this.getOutboundSource());
        writer.writeOffsetDateTimeValue("scheduledFor", this.getScheduledFor());
        writer.writeEnumValue("selectionReason", this.getSelectionReason());
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
     * Sets the automationId property value. Automation ID connected to this workflow, run, or event.
     * @param value Value to set for the automationId property.
     */
    public void setAutomationId(@jakarta.annotation.Nullable final String value) {
        this.automationId = value;
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
     * Sets the hasRequiredConsent property value. Indicates whether the lead has the consent required for compliant outreach.
     * @param value Value to set for the hasRequiredConsent property.
     */
    public void setHasRequiredConsent(@jakarta.annotation.Nullable final Boolean value) {
        this.hasRequiredConsent = value;
    }
    /**
     * Sets the importBatchId property value. Bulk import batch ID that created or updated this lead.
     * @param value Value to set for the importBatchId property.
     */
    public void setImportBatchId(@jakarta.annotation.Nullable final String value) {
        this.importBatchId = value;
    }
    /**
     * Sets the isAutomated property value. Indicates whether automation created or triggered this SMS send request.
     * @param value Value to set for the isAutomated property.
     */
    public void setIsAutomated(@jakarta.annotation.Nullable final Boolean value) {
        this.isAutomated = value;
    }
    /**
     * Sets the isImportedLead property value. Indicates whether this record originated from a bulk import rather than a real-time lead source.
     * @param value Value to set for the isImportedLead property.
     */
    public void setIsImportedLead(@jakarta.annotation.Nullable final Boolean value) {
        this.isImportedLead = value;
    }
    /**
     * Sets the outboundDeliveryRequestId property value. Outbound delivery request ID connected to this decision or attempt.
     * @param value Value to set for the outboundDeliveryRequestId property.
     */
    public void setOutboundDeliveryRequestId(@jakarta.annotation.Nullable final String value) {
        this.outboundDeliveryRequestId = value;
    }
    /**
     * Sets the outboundIdempotencyKey property value. Idempotency key used to prevent duplicate outbound delivery.
     * @param value Value to set for the outboundIdempotencyKey property.
     */
    public void setOutboundIdempotencyKey(@jakarta.annotation.Nullable final String value) {
        this.outboundIdempotencyKey = value;
    }
    /**
     * Sets the outboundPriority property value. Defines priority classes used when pacing outbound delivery.
     * @param value Value to set for the outboundPriority property.
     */
    public void setOutboundPriority(@jakarta.annotation.Nullable final SendSmsRequestOutboundPriority value) {
        this.outboundPriority = value;
    }
    /**
     * Sets the outboundReservationId property value. Outbound reservation ID used to throttle and track delivery capacity.
     * @param value Value to set for the outboundReservationId property.
     */
    public void setOutboundReservationId(@jakarta.annotation.Nullable final String value) {
        this.outboundReservationId = value;
    }
    /**
     * Sets the outboundSource property value. Defines the source that requested outbound delivery.
     * @param value Value to set for the outboundSource property.
     */
    public void setOutboundSource(@jakarta.annotation.Nullable final SendSmsRequestOutboundSource value) {
        this.outboundSource = value;
    }
    /**
     * Sets the scheduledFor property value. UTC timestamp when Leadping should send the SMS message.
     * @param value Value to set for the scheduledFor property.
     */
    public void setScheduledFor(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.scheduledFor = value;
    }
    /**
     * Sets the selectionReason property value. Defines the supported Outgoing Number Selection Reason values.
     * @param value Value to set for the selectionReason property.
     */
    public void setSelectionReason(@jakarta.annotation.Nullable final SendSmsRequestSelectionReason value) {
        this.selectionReason = value;
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
