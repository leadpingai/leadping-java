package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Request schema for the Leadping API outgoing number selection request, including the fields clients can send.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutgoingNumberSelectionRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Messaging campaign identifier associated with this outgoing number selection request.
     */
    private String campaignId;
    /**
     * Defines the supported Outgoing Number Channel values.
     */
    private OutgoingNumberSelectionRequestChannel channel;
    /**
     * Conversation ID that links this outgoing number selection request to the Leadping inbox thread.
     */
    private String conversationId;
    /**
     * Lead ID used to choose the best outgoing sender number.
     */
    private String leadId;
    /**
     * Recipient phone number that receives the outbound message or call.
     */
    private String recipientPhoneNumber;
    /**
     * Lead source ID used to choose the best outgoing sender number.
     */
    private String sourceId;
    /**
     * Team ID used to choose the best outgoing sender number.
     */
    private String teamId;
    /**
     * Instantiates a new {@link OutgoingNumberSelectionRequest} and sets the default values.
     */
    public OutgoingNumberSelectionRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OutgoingNumberSelectionRequest}
     */
    @jakarta.annotation.Nonnull
    public static OutgoingNumberSelectionRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutgoingNumberSelectionRequest();
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
     * Gets the campaignId property value. Messaging campaign identifier associated with this outgoing number selection request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignId() {
        return this.campaignId;
    }
    /**
     * Gets the channel property value. Defines the supported Outgoing Number Channel values.
     * @return a {@link OutgoingNumberSelectionRequestChannel}
     */
    @jakarta.annotation.Nullable
    public OutgoingNumberSelectionRequestChannel getChannel() {
        return this.channel;
    }
    /**
     * Gets the conversationId property value. Conversation ID that links this outgoing number selection request to the Leadping inbox thread.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("campaignId", (n) -> { this.setCampaignId(n.getStringValue()); });
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getEnumValue(OutgoingNumberSelectionRequestChannel::forValue)); });
        deserializerMap.put("conversationId", (n) -> { this.setConversationId(n.getStringValue()); });
        deserializerMap.put("leadId", (n) -> { this.setLeadId(n.getStringValue()); });
        deserializerMap.put("recipientPhoneNumber", (n) -> { this.setRecipientPhoneNumber(n.getStringValue()); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("teamId", (n) -> { this.setTeamId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the leadId property value. Lead ID used to choose the best outgoing sender number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadId() {
        return this.leadId;
    }
    /**
     * Gets the recipientPhoneNumber property value. Recipient phone number that receives the outbound message or call.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecipientPhoneNumber() {
        return this.recipientPhoneNumber;
    }
    /**
     * Gets the sourceId property value. Lead source ID used to choose the best outgoing sender number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.sourceId;
    }
    /**
     * Gets the teamId property value. Team ID used to choose the best outgoing sender number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTeamId() {
        return this.teamId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("campaignId", this.getCampaignId());
        writer.writeEnumValue("channel", this.getChannel());
        writer.writeStringValue("conversationId", this.getConversationId());
        writer.writeStringValue("leadId", this.getLeadId());
        writer.writeStringValue("recipientPhoneNumber", this.getRecipientPhoneNumber());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeStringValue("teamId", this.getTeamId());
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
     * Sets the campaignId property value. Messaging campaign identifier associated with this outgoing number selection request.
     * @param value Value to set for the campaignId property.
     */
    public void setCampaignId(@jakarta.annotation.Nullable final String value) {
        this.campaignId = value;
    }
    /**
     * Sets the channel property value. Defines the supported Outgoing Number Channel values.
     * @param value Value to set for the channel property.
     */
    public void setChannel(@jakarta.annotation.Nullable final OutgoingNumberSelectionRequestChannel value) {
        this.channel = value;
    }
    /**
     * Sets the conversationId property value. Conversation ID that links this outgoing number selection request to the Leadping inbox thread.
     * @param value Value to set for the conversationId property.
     */
    public void setConversationId(@jakarta.annotation.Nullable final String value) {
        this.conversationId = value;
    }
    /**
     * Sets the leadId property value. Lead ID used to choose the best outgoing sender number.
     * @param value Value to set for the leadId property.
     */
    public void setLeadId(@jakarta.annotation.Nullable final String value) {
        this.leadId = value;
    }
    /**
     * Sets the recipientPhoneNumber property value. Recipient phone number that receives the outbound message or call.
     * @param value Value to set for the recipientPhoneNumber property.
     */
    public void setRecipientPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.recipientPhoneNumber = value;
    }
    /**
     * Sets the sourceId property value. Lead source ID used to choose the best outgoing sender number.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.sourceId = value;
    }
    /**
     * Sets the teamId property value. Team ID used to choose the best outgoing sender number.
     * @param value Value to set for the teamId property.
     */
    public void setTeamId(@jakarta.annotation.Nullable final String value) {
        this.teamId = value;
    }
}
