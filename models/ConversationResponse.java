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
 * Response schema for the Leadping API conversation response returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConversationResponse implements AdditionalDataHolder, Parsable {
    /**
     * Phone number ID currently active for outbound delivery.
     */
    private String activeOutboundPhoneNumberId;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * UTC timestamp when this record was archived.
     */
    private OffsetDateTime archivedAt;
    /**
     * Defines why a lead was removed from the active working pipeline.
     */
    private Integer archiveReason;
    /**
     * Current disposition summary that describes the lead outcome.
     */
    private ConversationResponseCurrentDisposition currentDisposition;
    /**
     * First name of the lead, user, or contact represented by this conversation response.
     */
    private String firstName;
    /**
     * Unique Leadping identifier for this conversation response.
     */
    private String id;
    /**
     * Indicates whether the Leadping conversation has been archived.
     */
    private Boolean isArchived;
    /**
     * Indicates whether the current user has unread activity in the conversation.
     */
    private Boolean isUnread;
    /**
     * UTC timestamp when the most recent conversation event occurred.
     */
    private OffsetDateTime lastEventAt;
    /**
     * Last name of the lead, user, or contact represented by this conversation response.
     */
    private String lastName;
    /**
     * Most recent message preview shown for the conversation.
     */
    private String lastSnippet;
    /**
     * Lead ID associated with this inbox conversation.
     */
    private String leadId;
    /**
     * Lead&apos;s phone number used for conversation matching and outreach.
     */
    private String leadPhoneNumber;
    /**
     * Recommended next step to move this conversation response forward.
     */
    private String nextStep;
    /**
     * Phone number ID manually chosen to override automatic outbound selection.
     */
    private String outboundPhoneNumberOverrideId;
    /**
     * Phone number used by this conversation response for calls, SMS, lookup, or routing.
     */
    private ConversationResponsePhoneNumber phoneNumber;
    /**
     * Defines the customer-facing operational status for an inbox conversation.
     */
    private ConversationResponseStatus status;
    /**
     * Human-readable reason explaining the current status of this conversation response.
     */
    private String statusReason;
    /**
     * Instantiates a new {@link ConversationResponse} and sets the default values.
     */
    public ConversationResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConversationResponse}
     */
    @jakarta.annotation.Nonnull
    public static ConversationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConversationResponse();
    }
    /**
     * Gets the activeOutboundPhoneNumberId property value. Phone number ID currently active for outbound delivery.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActiveOutboundPhoneNumberId() {
        return this.activeOutboundPhoneNumberId;
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
     * Gets the archivedAt property value. UTC timestamp when this record was archived.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getArchivedAt() {
        return this.archivedAt;
    }
    /**
     * Gets the archiveReason property value. Defines why a lead was removed from the active working pipeline.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getArchiveReason() {
        return this.archiveReason;
    }
    /**
     * Gets the currentDisposition property value. Current disposition summary that describes the lead outcome.
     * @return a {@link ConversationResponseCurrentDisposition}
     */
    @jakarta.annotation.Nullable
    public ConversationResponseCurrentDisposition getCurrentDisposition() {
        return this.currentDisposition;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("activeOutboundPhoneNumberId", (n) -> { this.setActiveOutboundPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("archivedAt", (n) -> { this.setArchivedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("archiveReason", (n) -> { this.setArchiveReason(n.getIntegerValue()); });
        deserializerMap.put("currentDisposition", (n) -> { this.setCurrentDisposition(n.getObjectValue(ConversationResponseCurrentDisposition::createFromDiscriminatorValue)); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isArchived", (n) -> { this.setIsArchived(n.getBooleanValue()); });
        deserializerMap.put("isUnread", (n) -> { this.setIsUnread(n.getBooleanValue()); });
        deserializerMap.put("lastEventAt", (n) -> { this.setLastEventAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("lastSnippet", (n) -> { this.setLastSnippet(n.getStringValue()); });
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("leadPhoneNumber", (n) -> { this.setLeadPhoneNumber(n.getStringValue()); });
        deserializerMap.put("nextStep", (n) -> { this.setNextStep(n.getStringValue()); });
        deserializerMap.put("outboundPhoneNumberOverrideId", (n) -> { this.setOutboundPhoneNumberOverrideId(n.getStringValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getObjectValue(ConversationResponsePhoneNumber::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ConversationResponseStatus::forValue)); });
        deserializerMap.put("statusReason", (n) -> { this.setStatusReason(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstName property value. First name of the lead, user, or contact represented by this conversation response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this conversation response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isArchived property value. Indicates whether the Leadping conversation has been archived.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsArchived() {
        return this.isArchived;
    }
    /**
     * Gets the isUnread property value. Indicates whether the current user has unread activity in the conversation.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsUnread() {
        return this.isUnread;
    }
    /**
     * Gets the lastEventAt property value. UTC timestamp when the most recent conversation event occurred.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastEventAt() {
        return this.lastEventAt;
    }
    /**
     * Gets the lastName property value. Last name of the lead, user, or contact represented by this conversation response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the lastSnippet property value. Most recent message preview shown for the conversation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastSnippet() {
        return this.lastSnippet;
    }
    /**
     * Gets the leadId property value. Lead ID associated with this inbox conversation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the leadPhoneNumber property value. Lead&apos;s phone number used for conversation matching and outreach.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadPhoneNumber() {
        return this.leadPhoneNumber;
    }
    /**
     * Gets the nextStep property value. Recommended next step to move this conversation response forward.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNextStep() {
        return this.nextStep;
    }
    /**
     * Gets the outboundPhoneNumberOverrideId property value. Phone number ID manually chosen to override automatic outbound selection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOutboundPhoneNumberOverrideId() {
        return this.outboundPhoneNumberOverrideId;
    }
    /**
     * Gets the phoneNumber property value. Phone number used by this conversation response for calls, SMS, lookup, or routing.
     * @return a {@link ConversationResponsePhoneNumber}
     */
    @jakarta.annotation.Nullable
    public ConversationResponsePhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the status property value. Defines the customer-facing operational status for an inbox conversation.
     * @return a {@link ConversationResponseStatus}
     */
    @jakarta.annotation.Nullable
    public ConversationResponseStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the statusReason property value. Human-readable reason explaining the current status of this conversation response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatusReason() {
        return this.statusReason;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("activeOutboundPhoneNumberId", this.getActiveOutboundPhoneNumberId());
        writer.writeOffsetDateTimeValue("archivedAt", this.getArchivedAt());
        writer.writeIntegerValue("archiveReason", this.getArchiveReason());
        writer.writeObjectValue("currentDisposition", this.getCurrentDisposition());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isArchived", this.getIsArchived());
        writer.writeBooleanValue("isUnread", this.getIsUnread());
        writer.writeOffsetDateTimeValue("lastEventAt", this.getLastEventAt());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeStringValue("lastSnippet", this.getLastSnippet());
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeStringValue("leadPhoneNumber", this.getLeadPhoneNumber());
        writer.writeStringValue("nextStep", this.getNextStep());
        writer.writeStringValue("outboundPhoneNumberOverrideId", this.getOutboundPhoneNumberOverrideId());
        writer.writeObjectValue("phoneNumber", this.getPhoneNumber());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("statusReason", this.getStatusReason());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activeOutboundPhoneNumberId property value. Phone number ID currently active for outbound delivery.
     * @param value Value to set for the activeOutboundPhoneNumberId property.
     */
    public void setActiveOutboundPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.activeOutboundPhoneNumberId = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the archivedAt property value. UTC timestamp when this record was archived.
     * @param value Value to set for the archivedAt property.
     */
    public void setArchivedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.archivedAt = value;
    }
    /**
     * Sets the archiveReason property value. Defines why a lead was removed from the active working pipeline.
     * @param value Value to set for the archiveReason property.
     */
    public void setArchiveReason(@jakarta.annotation.Nullable final Integer value) {
        this.archiveReason = value;
    }
    /**
     * Sets the currentDisposition property value. Current disposition summary that describes the lead outcome.
     * @param value Value to set for the currentDisposition property.
     */
    public void setCurrentDisposition(@jakarta.annotation.Nullable final ConversationResponseCurrentDisposition value) {
        this.currentDisposition = value;
    }
    /**
     * Sets the firstName property value. First name of the lead, user, or contact represented by this conversation response.
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this conversation response.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isArchived property value. Indicates whether the Leadping conversation has been archived.
     * @param value Value to set for the isArchived property.
     */
    public void setIsArchived(@jakarta.annotation.Nullable final Boolean value) {
        this.isArchived = value;
    }
    /**
     * Sets the isUnread property value. Indicates whether the current user has unread activity in the conversation.
     * @param value Value to set for the isUnread property.
     */
    public void setIsUnread(@jakarta.annotation.Nullable final Boolean value) {
        this.isUnread = value;
    }
    /**
     * Sets the lastEventAt property value. UTC timestamp when the most recent conversation event occurred.
     * @param value Value to set for the lastEventAt property.
     */
    public void setLastEventAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastEventAt = value;
    }
    /**
     * Sets the lastName property value. Last name of the lead, user, or contact represented by this conversation response.
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the lastSnippet property value. Most recent message preview shown for the conversation.
     * @param value Value to set for the lastSnippet property.
     */
    public void setLastSnippet(@jakarta.annotation.Nullable final String value) {
        this.lastSnippet = value;
    }
    /**
     * Sets the leadId property value. Lead ID associated with this inbox conversation.
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the leadPhoneNumber property value. Lead&apos;s phone number used for conversation matching and outreach.
     * @param value Value to set for the leadPhoneNumber property.
     */
    public void setLeadPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.leadPhoneNumber = value;
    }
    /**
     * Sets the nextStep property value. Recommended next step to move this conversation response forward.
     * @param value Value to set for the nextStep property.
     */
    public void setNextStep(@jakarta.annotation.Nullable final String value) {
        this.nextStep = value;
    }
    /**
     * Sets the outboundPhoneNumberOverrideId property value. Phone number ID manually chosen to override automatic outbound selection.
     * @param value Value to set for the outboundPhoneNumberOverrideId property.
     */
    public void setOutboundPhoneNumberOverrideId(@jakarta.annotation.Nullable final String value) {
        this.outboundPhoneNumberOverrideId = value;
    }
    /**
     * Sets the phoneNumber property value. Phone number used by this conversation response for calls, SMS, lookup, or routing.
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final ConversationResponsePhoneNumber value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the status property value. Defines the customer-facing operational status for an inbox conversation.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ConversationResponseStatus value) {
        this.status = value;
    }
    /**
     * Sets the statusReason property value. Human-readable reason explaining the current status of this conversation response.
     * @param value Value to set for the statusReason property.
     */
    public void setStatusReason(@jakarta.annotation.Nullable final String value) {
        this.statusReason = value;
    }
}
