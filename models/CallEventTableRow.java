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
 * List item schema for Leadping API call event table row results shown in searchable tables.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CallEventTableRow implements AdditionalDataHolder, Parsable {
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
    private Double billableAmount;
    /**
     * Billable call duration in seconds.
     */
    private Integer billableSeconds;
    /**
     * Billing state for this communication, charge, or transaction.
     */
    private String billingStatus;
    /**
     * Caller ID phone number presented during the outbound call.
     */
    private String callerId;
    /**
     * Conversation ID that links this call event table row to the Leadping inbox thread.
     */
    private String conversationId;
    /**
     * UTC timestamp when this call event table row was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Communication direction for this call event table row, such as inbound or outbound.
     */
    private String direction;
    /**
     * Call duration or processing duration represented by this call event table row.
     */
    private Integer duration;
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
     * Unique Leadping identifier for this call event table row.
     */
    private String id;
    /**
     * Lead ID associated with this call event.
     */
    private String leadId;
    /**
     * Display name for the lead associated with this call event.
     */
    private String leadName;
    /**
     * Organization summary connected to this call event table row.
     */
    private String organization;
    /**
     * Organization ID associated with this call event.
     */
    private String organizationId;
    /**
     * Display name for the organization associated with this call event.
     */
    private String organizationName;
    /**
     * URL for the call recording, when the provider makes one available.
     */
    private String recordingUrl;
    /**
     * Defines the supported Phone Call Status values.
     */
    private CallEventTableRowStatus status;
    /**
     * Human-readable reason explaining the current status of this call event table row.
     */
    private String statusReason;
    /**
     * Recipient phone number used for this communication.
     */
    private String toPhoneNumber;
    /**
     * User summary connected to this call event table row.
     */
    private String user;
    /**
     * User ID associated with the person or agent who initiated this call event.
     */
    private String userId;
    /**
     * Instantiates a new {@link CallEventTableRow} and sets the default values.
     */
    public CallEventTableRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CallEventTableRow}
     */
    @jakarta.annotation.Nonnull
    public static CallEventTableRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallEventTableRow();
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
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getBillableAmount() {
        return this.billableAmount;
    }
    /**
     * Gets the billableSeconds property value. Billable call duration in seconds.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBillableSeconds() {
        return this.billableSeconds;
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
     * Gets the conversationId property value. Conversation ID that links this call event table row to the Leadping inbox thread.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationId() {
        return this.conversationId;
    }
    /**
     * Gets the createdAt property value. UTC timestamp when this call event table row was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the direction property value. Communication direction for this call event table row, such as inbound or outbound.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDirection() {
        return this.direction;
    }
    /**
     * Gets the duration property value. Call duration or processing duration represented by this call event table row.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDuration() {
        return this.duration;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(24);
        deserializerMap.put("answeredAt", (n) -> { this.setAnsweredAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("billableAmount", (n) -> { this.setBillableAmount(n.getDoubleValue()); });
        deserializerMap.put("billableSeconds", (n) -> { this.setBillableSeconds(n.getIntegerValue()); });
        deserializerMap.put("billingStatus", (n) -> { this.setBillingStatus(n.getStringValue()); });
        deserializerMap.put("callerId", (n) -> { this.setCallerId(n.getStringValue()); });
        deserializerMap.put("conversationId", (n) -> { this.setConversationId(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("direction", (n) -> { this.setDirection(n.getStringValue()); });
        deserializerMap.put("duration", (n) -> { this.setDuration(n.getIntegerValue()); });
        deserializerMap.put("endedAt", (n) -> { this.setEndedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("fromPhoneNumber", (n) -> { this.setFromPhoneNumber(n.getStringValue()); });
        deserializerMap.put("fromPhoneNumberId", (n) -> { this.setFromPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("leadName", (n) -> { this.setLeadName(n.getStringValue()); });
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getStringValue()); });
        deserializerMap.put("organizationId", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("organizationName", (n) -> { this.setOrganizationName(n.getStringValue()); });
        deserializerMap.put("recordingUrl", (n) -> { this.setRecordingUrl(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CallEventTableRowStatus::forValue)); });
        deserializerMap.put("statusReason", (n) -> { this.setStatusReason(n.getStringValue()); });
        deserializerMap.put("toPhoneNumber", (n) -> { this.setToPhoneNumber(n.getStringValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getStringValue()); });
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
     * Gets the id property value. Unique Leadping identifier for this call event table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the leadId property value. Lead ID associated with this call event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the leadName property value. Display name for the lead associated with this call event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadName() {
        return this.leadName;
    }
    /**
     * Gets the organization property value. Organization summary connected to this call event table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganization() {
        return this.organization;
    }
    /**
     * Gets the organizationId property value. Organization ID associated with this call event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationId() {
        return this.organizationId;
    }
    /**
     * Gets the organizationName property value. Display name for the organization associated with this call event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationName() {
        return this.organizationName;
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
     * Gets the status property value. Defines the supported Phone Call Status values.
     * @return a {@link CallEventTableRowStatus}
     */
    @jakarta.annotation.Nullable
    public CallEventTableRowStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the statusReason property value. Human-readable reason explaining the current status of this call event table row.
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
     * Gets the user property value. User summary connected to this call event table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUser() {
        return this.user;
    }
    /**
     * Gets the userId property value. User ID associated with the person or agent who initiated this call event.
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
        writer.writeOffsetDateTimeValue("answeredAt", this.getAnsweredAt());
        writer.writeDoubleValue("billableAmount", this.getBillableAmount());
        writer.writeIntegerValue("billableSeconds", this.getBillableSeconds());
        writer.writeStringValue("billingStatus", this.getBillingStatus());
        writer.writeStringValue("callerId", this.getCallerId());
        writer.writeStringValue("conversationId", this.getConversationId());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("direction", this.getDirection());
        writer.writeIntegerValue("duration", this.getDuration());
        writer.writeOffsetDateTimeValue("endedAt", this.getEndedAt());
        writer.writeStringValue("fromPhoneNumber", this.getFromPhoneNumber());
        writer.writeStringValue("fromPhoneNumberId", this.getFromPhoneNumberId());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeStringValue("leadName", this.getLeadName());
        writer.writeStringValue("organization", this.getOrganization());
        writer.writeStringValue("organizationId", this.getOrganizationId());
        writer.writeStringValue("organizationName", this.getOrganizationName());
        writer.writeStringValue("recordingUrl", this.getRecordingUrl());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("statusReason", this.getStatusReason());
        writer.writeStringValue("toPhoneNumber", this.getToPhoneNumber());
        writer.writeStringValue("user", this.getUser());
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
    public void setBillableAmount(@jakarta.annotation.Nullable final Double value) {
        this.billableAmount = value;
    }
    /**
     * Sets the billableSeconds property value. Billable call duration in seconds.
     * @param value Value to set for the billableSeconds property.
     */
    public void setBillableSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.billableSeconds = value;
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
     * Sets the conversationId property value. Conversation ID that links this call event table row to the Leadping inbox thread.
     * @param value Value to set for the conversationId property.
     */
    public void setConversationId(@jakarta.annotation.Nullable final String value) {
        this.conversationId = value;
    }
    /**
     * Sets the createdAt property value. UTC timestamp when this call event table row was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the direction property value. Communication direction for this call event table row, such as inbound or outbound.
     * @param value Value to set for the direction property.
     */
    public void setDirection(@jakarta.annotation.Nullable final String value) {
        this.direction = value;
    }
    /**
     * Sets the duration property value. Call duration or processing duration represented by this call event table row.
     * @param value Value to set for the duration property.
     */
    public void setDuration(@jakarta.annotation.Nullable final Integer value) {
        this.duration = value;
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
     * Sets the id property value. Unique Leadping identifier for this call event table row.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the leadId property value. Lead ID associated with this call event.
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the leadName property value. Display name for the lead associated with this call event.
     * @param value Value to set for the leadName property.
     */
    public void setLeadName(@jakarta.annotation.Nullable final String value) {
        this.leadName = value;
    }
    /**
     * Sets the organization property value. Organization summary connected to this call event table row.
     * @param value Value to set for the organization property.
     */
    public void setOrganization(@jakarta.annotation.Nullable final String value) {
        this.organization = value;
    }
    /**
     * Sets the organizationId property value. Organization ID associated with this call event.
     * @param value Value to set for the organizationId property.
     */
    public void setOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.organizationId = value;
    }
    /**
     * Sets the organizationName property value. Display name for the organization associated with this call event.
     * @param value Value to set for the organizationName property.
     */
    public void setOrganizationName(@jakarta.annotation.Nullable final String value) {
        this.organizationName = value;
    }
    /**
     * Sets the recordingUrl property value. URL for the call recording, when the provider makes one available.
     * @param value Value to set for the recordingUrl property.
     */
    public void setRecordingUrl(@jakarta.annotation.Nullable final String value) {
        this.recordingUrl = value;
    }
    /**
     * Sets the status property value. Defines the supported Phone Call Status values.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CallEventTableRowStatus value) {
        this.status = value;
    }
    /**
     * Sets the statusReason property value. Human-readable reason explaining the current status of this call event table row.
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
     * Sets the user property value. User summary connected to this call event table row.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final String value) {
        this.user = value;
    }
    /**
     * Sets the userId property value. User ID associated with the person or agent who initiated this call event.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
