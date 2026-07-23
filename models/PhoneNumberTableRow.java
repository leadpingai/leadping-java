package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * List item schema for Leadping API phone number table row results shown in searchable tables.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberTableRow implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Business summary connected to this phone number table row.
     */
    private String business;
    /**
     * Unique Leadping business identifier connected to this phone number table row.
     */
    private String businessId;
    /**
     * Indicates whether this phone number table row is active and available in the Leadping API.
     */
    private Boolean enabled;
    /**
     * Unique Leadping identifier for this phone number table row.
     */
    private String id;
    /**
     * Optional display label for this phone number table row in the Leadping API.
     */
    private String name;
    /**
     * E.164 phone number exposed by this phone number table row.
     */
    private String number;
    /**
     * Ownership classification for this phone number, such as Leadping-owned or customer-owned.
     */
    private String ownership;
    /**
     * Human-readable routing summary for this phone number.
     */
    private String routingSummary;
    /**
     * Indicates whether SMS messaging is ready for this business or phone number.
     */
    private Boolean smsReady;
    /**
     * 10DLC campaign status associated with this sender or SMS event.
     */
    private String tenDlcCampaignStatus;
    /**
     * Type classification used to route and interpret this phone number table row in the Leadping API.
     */
    private String type;
    /**
     * Indicates whether voice calling is ready for this business or phone number.
     */
    private Boolean voiceReady;
    /**
     * Warmup state for this phone number.
     */
    private PhoneNumberReadiness warmup;
    /**
     * Instantiates a new {@link PhoneNumberTableRow} and sets the default values.
     */
    public PhoneNumberTableRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberTableRow}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberTableRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberTableRow();
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
     * Gets the business property value. Business summary connected to this phone number table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusiness() {
        return this.business;
    }
    /**
     * Gets the businessId property value. Unique Leadping business identifier connected to this phone number table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the enabled property value. Indicates whether this phone number table row is active and available in the Leadping API.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("business", (n) -> { this.setBusiness(n.getStringValue()); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("ownership", (n) -> { this.setOwnership(n.getStringValue()); });
        deserializerMap.put("routingSummary", (n) -> { this.setRoutingSummary(n.getStringValue()); });
        deserializerMap.put("smsReady", (n) -> { this.setSmsReady(n.getBooleanValue()); });
        deserializerMap.put("tenDlcCampaignStatus", (n) -> { this.setTenDlcCampaignStatus(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("voiceReady", (n) -> { this.setVoiceReady(n.getBooleanValue()); });
        deserializerMap.put("warmup", (n) -> { this.setWarmup(n.getObjectValue(PhoneNumberReadiness::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this phone number table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the name property value. Optional display label for this phone number table row in the Leadping API.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the number property value. E.164 phone number exposed by this phone number table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.number;
    }
    /**
     * Gets the ownership property value. Ownership classification for this phone number, such as Leadping-owned or customer-owned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOwnership() {
        return this.ownership;
    }
    /**
     * Gets the routingSummary property value. Human-readable routing summary for this phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoutingSummary() {
        return this.routingSummary;
    }
    /**
     * Gets the smsReady property value. Indicates whether SMS messaging is ready for this business or phone number.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSmsReady() {
        return this.smsReady;
    }
    /**
     * Gets the tenDlcCampaignStatus property value. 10DLC campaign status associated with this sender or SMS event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenDlcCampaignStatus() {
        return this.tenDlcCampaignStatus;
    }
    /**
     * Gets the type property value. Type classification used to route and interpret this phone number table row in the Leadping API.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the voiceReady property value. Indicates whether voice calling is ready for this business or phone number.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVoiceReady() {
        return this.voiceReady;
    }
    /**
     * Gets the warmup property value. Warmup state for this phone number.
     * @return a {@link PhoneNumberReadiness}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberReadiness getWarmup() {
        return this.warmup;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("business", this.getBusiness());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("ownership", this.getOwnership());
        writer.writeStringValue("routingSummary", this.getRoutingSummary());
        writer.writeBooleanValue("smsReady", this.getSmsReady());
        writer.writeStringValue("tenDlcCampaignStatus", this.getTenDlcCampaignStatus());
        writer.writeStringValue("type", this.getType());
        writer.writeBooleanValue("voiceReady", this.getVoiceReady());
        writer.writeObjectValue("warmup", this.getWarmup());
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
     * Sets the business property value. Business summary connected to this phone number table row.
     * @param value Value to set for the business property.
     */
    public void setBusiness(@jakarta.annotation.Nullable final String value) {
        this.business = value;
    }
    /**
     * Sets the businessId property value. Unique Leadping business identifier connected to this phone number table row.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the enabled property value. Indicates whether this phone number table row is active and available in the Leadping API.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this phone number table row.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the name property value. Optional display label for this phone number table row in the Leadping API.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the number property value. E.164 phone number exposed by this phone number table row.
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.number = value;
    }
    /**
     * Sets the ownership property value. Ownership classification for this phone number, such as Leadping-owned or customer-owned.
     * @param value Value to set for the ownership property.
     */
    public void setOwnership(@jakarta.annotation.Nullable final String value) {
        this.ownership = value;
    }
    /**
     * Sets the routingSummary property value. Human-readable routing summary for this phone number.
     * @param value Value to set for the routingSummary property.
     */
    public void setRoutingSummary(@jakarta.annotation.Nullable final String value) {
        this.routingSummary = value;
    }
    /**
     * Sets the smsReady property value. Indicates whether SMS messaging is ready for this business or phone number.
     * @param value Value to set for the smsReady property.
     */
    public void setSmsReady(@jakarta.annotation.Nullable final Boolean value) {
        this.smsReady = value;
    }
    /**
     * Sets the tenDlcCampaignStatus property value. 10DLC campaign status associated with this sender or SMS event.
     * @param value Value to set for the tenDlcCampaignStatus property.
     */
    public void setTenDlcCampaignStatus(@jakarta.annotation.Nullable final String value) {
        this.tenDlcCampaignStatus = value;
    }
    /**
     * Sets the type property value. Type classification used to route and interpret this phone number table row in the Leadping API.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the voiceReady property value. Indicates whether voice calling is ready for this business or phone number.
     * @param value Value to set for the voiceReady property.
     */
    public void setVoiceReady(@jakarta.annotation.Nullable final Boolean value) {
        this.voiceReady = value;
    }
    /**
     * Sets the warmup property value. Warmup state for this phone number.
     * @param value Value to set for the warmup property.
     */
    public void setWarmup(@jakarta.annotation.Nullable final PhoneNumberReadiness value) {
        this.warmup = value;
    }
}
