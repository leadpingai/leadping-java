package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Public Leadping API schema for phone number routing metadata data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberRoutingMetadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Messaging campaign identifier associated with this phone number routing metadata.
     */
    private String campaignId;
    /**
     * Indicates whether this record is restricted to internal Leadping testing.
     */
    private Boolean internalTestOnly;
    /**
     * Messaging profile identifier used for SMS routing with the provider.
     */
    private String messagingProfileId;
    /**
     * Indicates whether the phone number can be used for SMS messaging.
     */
    private Boolean smsEnabled;
    /**
     * Lead source ID assigned to this phone number for attribution and routing.
     */
    private String sourceId;
    /**
     * Team ID used to route calls and messages for this phone number.
     */
    private String teamId;
    /**
     * Leadping v oi ce co nn ec ti o n ID that links this phone number routing metadata to the related record.
     */
    private String voiceConnectionId;
    /**
     * Indicates whether the phone number can be used for voice calls.
     */
    private Boolean voiceEnabled;
    /**
     * Indicates whether this phone number should only be used for warmup traffic.
     */
    private Boolean warmupOnly;
    /**
     * Instantiates a new {@link PhoneNumberRoutingMetadata} and sets the default values.
     */
    public PhoneNumberRoutingMetadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberRoutingMetadata}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberRoutingMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberRoutingMetadata();
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
     * Gets the campaignId property value. Messaging campaign identifier associated with this phone number routing metadata.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignId() {
        return this.campaignId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("campaignId", (n) -> { this.setCampaignId(n.getStringValue()); });
        deserializerMap.put("internalTestOnly", (n) -> { this.setInternalTestOnly(n.getBooleanValue()); });
        deserializerMap.put("messagingProfileId", (n) -> { this.setMessagingProfileId(n.getStringValue()); });
        deserializerMap.put("smsEnabled", (n) -> { this.setSmsEnabled(n.getBooleanValue()); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("teamId", (n) -> { this.setTeamId(n.getStringValue()); });
        deserializerMap.put("voiceConnectionId", (n) -> { this.setVoiceConnectionId(n.getStringValue()); });
        deserializerMap.put("voiceEnabled", (n) -> { this.setVoiceEnabled(n.getBooleanValue()); });
        deserializerMap.put("warmupOnly", (n) -> { this.setWarmupOnly(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internalTestOnly property value. Indicates whether this record is restricted to internal Leadping testing.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getInternalTestOnly() {
        return this.internalTestOnly;
    }
    /**
     * Gets the messagingProfileId property value. Messaging profile identifier used for SMS routing with the provider.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessagingProfileId() {
        return this.messagingProfileId;
    }
    /**
     * Gets the smsEnabled property value. Indicates whether the phone number can be used for SMS messaging.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSmsEnabled() {
        return this.smsEnabled;
    }
    /**
     * Gets the sourceId property value. Lead source ID assigned to this phone number for attribution and routing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceId() {
        return this.sourceId;
    }
    /**
     * Gets the teamId property value. Team ID used to route calls and messages for this phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTeamId() {
        return this.teamId;
    }
    /**
     * Gets the voiceConnectionId property value. Leadping v oi ce co nn ec ti o n ID that links this phone number routing metadata to the related record.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVoiceConnectionId() {
        return this.voiceConnectionId;
    }
    /**
     * Gets the voiceEnabled property value. Indicates whether the phone number can be used for voice calls.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVoiceEnabled() {
        return this.voiceEnabled;
    }
    /**
     * Gets the warmupOnly property value. Indicates whether this phone number should only be used for warmup traffic.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWarmupOnly() {
        return this.warmupOnly;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("campaignId", this.getCampaignId());
        writer.writeBooleanValue("internalTestOnly", this.getInternalTestOnly());
        writer.writeStringValue("messagingProfileId", this.getMessagingProfileId());
        writer.writeBooleanValue("smsEnabled", this.getSmsEnabled());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeStringValue("teamId", this.getTeamId());
        writer.writeStringValue("voiceConnectionId", this.getVoiceConnectionId());
        writer.writeBooleanValue("voiceEnabled", this.getVoiceEnabled());
        writer.writeBooleanValue("warmupOnly", this.getWarmupOnly());
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
     * Sets the campaignId property value. Messaging campaign identifier associated with this phone number routing metadata.
     * @param value Value to set for the campaignId property.
     */
    public void setCampaignId(@jakarta.annotation.Nullable final String value) {
        this.campaignId = value;
    }
    /**
     * Sets the internalTestOnly property value. Indicates whether this record is restricted to internal Leadping testing.
     * @param value Value to set for the internalTestOnly property.
     */
    public void setInternalTestOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.internalTestOnly = value;
    }
    /**
     * Sets the messagingProfileId property value. Messaging profile identifier used for SMS routing with the provider.
     * @param value Value to set for the messagingProfileId property.
     */
    public void setMessagingProfileId(@jakarta.annotation.Nullable final String value) {
        this.messagingProfileId = value;
    }
    /**
     * Sets the smsEnabled property value. Indicates whether the phone number can be used for SMS messaging.
     * @param value Value to set for the smsEnabled property.
     */
    public void setSmsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.smsEnabled = value;
    }
    /**
     * Sets the sourceId property value. Lead source ID assigned to this phone number for attribution and routing.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.sourceId = value;
    }
    /**
     * Sets the teamId property value. Team ID used to route calls and messages for this phone number.
     * @param value Value to set for the teamId property.
     */
    public void setTeamId(@jakarta.annotation.Nullable final String value) {
        this.teamId = value;
    }
    /**
     * Sets the voiceConnectionId property value. Leadping v oi ce co nn ec ti o n ID that links this phone number routing metadata to the related record.
     * @param value Value to set for the voiceConnectionId property.
     */
    public void setVoiceConnectionId(@jakarta.annotation.Nullable final String value) {
        this.voiceConnectionId = value;
    }
    /**
     * Sets the voiceEnabled property value. Indicates whether the phone number can be used for voice calls.
     * @param value Value to set for the voiceEnabled property.
     */
    public void setVoiceEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.voiceEnabled = value;
    }
    /**
     * Sets the warmupOnly property value. Indicates whether this phone number should only be used for warmup traffic.
     * @param value Value to set for the warmupOnly property.
     */
    public void setWarmupOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.warmupOnly = value;
    }
}
