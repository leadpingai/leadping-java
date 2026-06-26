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
 * Public Leadping API schema for phone number 10DLC association data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberTenDlcAssociation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Provider assignment status for linking the phone number to a 10DLC campaign.
     */
    private String assignmentStatus;
    /**
     * 10DLC brand identifier associated with this phone number or campaign.
     */
    private String brandId;
    /**
     * Messaging campaign identifier associated with this phone number 10DLC association.
     */
    private String campaignId;
    /**
     * 10DLC campaign status reported by the messaging provider.
     */
    private String campaignStatus;
    /**
     * Human-readable reason explaining why this phone number 10DLC association failed.
     */
    private String failureReason;
    /**
     * Most recent provider event identifier processed for this phone number 10DLC association.
     */
    private String lastProviderEventId;
    /**
     * Messaging profile identifier used for SMS routing with the provider.
     */
    private String messagingProfileId;
    /**
     * UTC timestamp when s ta tu su pd at e d occurred for this phone number 10DLC association.
     */
    private OffsetDateTime statusUpdatedAt;
    /**
     * Instantiates a new {@link PhoneNumberTenDlcAssociation} and sets the default values.
     */
    public PhoneNumberTenDlcAssociation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberTenDlcAssociation}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberTenDlcAssociation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberTenDlcAssociation();
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
     * Gets the assignmentStatus property value. Provider assignment status for linking the phone number to a 10DLC campaign.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignmentStatus() {
        return this.assignmentStatus;
    }
    /**
     * Gets the brandId property value. 10DLC brand identifier associated with this phone number or campaign.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrandId() {
        return this.brandId;
    }
    /**
     * Gets the campaignId property value. Messaging campaign identifier associated with this phone number 10DLC association.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignId() {
        return this.campaignId;
    }
    /**
     * Gets the campaignStatus property value. 10DLC campaign status reported by the messaging provider.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignStatus() {
        return this.campaignStatus;
    }
    /**
     * Gets the failureReason property value. Human-readable reason explaining why this phone number 10DLC association failed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFailureReason() {
        return this.failureReason;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("assignmentStatus", (n) -> { this.setAssignmentStatus(n.getStringValue()); });
        deserializerMap.put("brandId", (n) -> { this.setBrandId(n.getStringValue()); });
        deserializerMap.put("campaignId", (n) -> { this.setCampaignId(n.getStringValue()); });
        deserializerMap.put("campaignStatus", (n) -> { this.setCampaignStatus(n.getStringValue()); });
        deserializerMap.put("failureReason", (n) -> { this.setFailureReason(n.getStringValue()); });
        deserializerMap.put("lastProviderEventId", (n) -> { this.setLastProviderEventId(n.getStringValue()); });
        deserializerMap.put("messagingProfileId", (n) -> { this.setMessagingProfileId(n.getStringValue()); });
        deserializerMap.put("statusUpdatedAt", (n) -> { this.setStatusUpdatedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastProviderEventId property value. Most recent provider event identifier processed for this phone number 10DLC association.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastProviderEventId() {
        return this.lastProviderEventId;
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
     * Gets the statusUpdatedAt property value. UTC timestamp when s ta tu su pd at e d occurred for this phone number 10DLC association.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStatusUpdatedAt() {
        return this.statusUpdatedAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("assignmentStatus", this.getAssignmentStatus());
        writer.writeStringValue("brandId", this.getBrandId());
        writer.writeStringValue("campaignId", this.getCampaignId());
        writer.writeStringValue("campaignStatus", this.getCampaignStatus());
        writer.writeStringValue("failureReason", this.getFailureReason());
        writer.writeStringValue("lastProviderEventId", this.getLastProviderEventId());
        writer.writeStringValue("messagingProfileId", this.getMessagingProfileId());
        writer.writeOffsetDateTimeValue("statusUpdatedAt", this.getStatusUpdatedAt());
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
     * Sets the assignmentStatus property value. Provider assignment status for linking the phone number to a 10DLC campaign.
     * @param value Value to set for the assignmentStatus property.
     */
    public void setAssignmentStatus(@jakarta.annotation.Nullable final String value) {
        this.assignmentStatus = value;
    }
    /**
     * Sets the brandId property value. 10DLC brand identifier associated with this phone number or campaign.
     * @param value Value to set for the brandId property.
     */
    public void setBrandId(@jakarta.annotation.Nullable final String value) {
        this.brandId = value;
    }
    /**
     * Sets the campaignId property value. Messaging campaign identifier associated with this phone number 10DLC association.
     * @param value Value to set for the campaignId property.
     */
    public void setCampaignId(@jakarta.annotation.Nullable final String value) {
        this.campaignId = value;
    }
    /**
     * Sets the campaignStatus property value. 10DLC campaign status reported by the messaging provider.
     * @param value Value to set for the campaignStatus property.
     */
    public void setCampaignStatus(@jakarta.annotation.Nullable final String value) {
        this.campaignStatus = value;
    }
    /**
     * Sets the failureReason property value. Human-readable reason explaining why this phone number 10DLC association failed.
     * @param value Value to set for the failureReason property.
     */
    public void setFailureReason(@jakarta.annotation.Nullable final String value) {
        this.failureReason = value;
    }
    /**
     * Sets the lastProviderEventId property value. Most recent provider event identifier processed for this phone number 10DLC association.
     * @param value Value to set for the lastProviderEventId property.
     */
    public void setLastProviderEventId(@jakarta.annotation.Nullable final String value) {
        this.lastProviderEventId = value;
    }
    /**
     * Sets the messagingProfileId property value. Messaging profile identifier used for SMS routing with the provider.
     * @param value Value to set for the messagingProfileId property.
     */
    public void setMessagingProfileId(@jakarta.annotation.Nullable final String value) {
        this.messagingProfileId = value;
    }
    /**
     * Sets the statusUpdatedAt property value. UTC timestamp when s ta tu su pd at e d occurred for this phone number 10DLC association.
     * @param value Value to set for the statusUpdatedAt property.
     */
    public void setStatusUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.statusUpdatedAt = value;
    }
}
