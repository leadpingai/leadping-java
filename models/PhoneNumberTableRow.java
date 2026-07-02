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
     * Admin override that can enable or disable this record independently of normal status checks.
     */
    private PhoneNumberTableRowAdminEnablementOverride adminEnablementOverride;
    /**
     * Billing attribution used to reconcile this phone number with subscription billing.
     */
    private String billingAttribution;
    /**
     * Business summary connected to this phone number table row.
     */
    private String business;
    /**
     * Unique Leadping business identifier connected to this phone number table row.
     */
    private String businessId;
    /**
     * Indicates whether controlled voice call warmup is enabled for this phone number.
     */
    private Boolean callWarmupEnabled;
    /**
     * Defines the supported voice call warmup stages for a Leadping-managed phone number.
     */
    private PhoneNumberTableRowCallWarmupStage callWarmupStage;
    /**
     * Defines the supported health states for controlled internal voice call warmup.
     */
    private PhoneNumberTableRowCallWarmupState callWarmupState;
    /**
     * SMS and voice capabilities available on this phone number.
     */
    private String capabilities;
    /**
     * Indicates whether this phone number table row is active and available in the Leadping API.
     */
    private Boolean enabled;
    /**
     * Defines the supported SMS Warmup Health State values.
     */
    private PhoneNumberTableRowHealthStatus healthStatus;
    /**
     * Unique Leadping identifier for this phone number table row.
     */
    private String id;
    /**
     * Indicates whether this record is restricted to internal Leadping testing.
     */
    private Boolean internalTestOnly;
    /**
     * Leadping inventory state for this phone number.
     */
    private PhoneNumberInventoryState inventoryState;
    /**
     * Indicates whether this phone number is approved for the configured messaging program.
     */
    private Boolean isMessagingProgramApproved;
    /**
     * Geographic location metadata for the phone number, lead, or lookup result.
     */
    private String location;
    /**
     * Display name for this phone number table row in the Leadping API.
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
     * Provider lifecycle state used to determine phone number readiness.
     */
    private PhoneNumberProviderLifecycleState providerLifecycleState;
    /**
     * Reconciliation status comparing Leadping data with provider data.
     */
    private String providerReconciliationStatus;
    /**
     * Provider lifecycle or delivery status for this phone number table row.
     */
    private String providerStatus;
    /**
     * Human-readable routing summary for this phone number.
     */
    private String routingSummary;
    /**
     * Indicates whether SMS messaging is ready for this business or phone number.
     */
    private Boolean smsReady;
    /**
     * Current lifecycle status for this phone number table row in the Leadping API.
     */
    private InternalPhoneNumberStatus status;
    /**
     * 10DLC campaign identifier associated with this sender or SMS event.
     */
    private String tenDlcCampaignId;
    /**
     * 10DLC campaign status associated with this sender or SMS event.
     */
    private String tenDlcCampaignStatus;
    /**
     * Type classification used to route and interpret this phone number table row in the Leadping API.
     */
    private String type;
    /**
     * User summary connected to this phone number table row.
     */
    private String user;
    /**
     * Indicates whether voice calling is ready for this business or phone number.
     */
    private Boolean voiceReady;
    /**
     * Numeric sender warmup health score used by Leadping to assess deliverability readiness.
     */
    private Integer warmupHealthScore;
    /**
     * Indicates whether this phone number should only be used for warmup traffic.
     */
    private Boolean warmupOnly;
    /**
     * Percent complete for the SMS sender warmup plan.
     */
    private Integer warmupProgressPercent;
    /**
     * Defines the supported SMS Warmup Health State values.
     */
    private PhoneNumberTableRowWarmupState warmupState;
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
     * Gets the adminEnablementOverride property value. Admin override that can enable or disable this record independently of normal status checks.
     * @return a {@link PhoneNumberTableRowAdminEnablementOverride}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberTableRowAdminEnablementOverride getAdminEnablementOverride() {
        return this.adminEnablementOverride;
    }
    /**
     * Gets the billingAttribution property value. Billing attribution used to reconcile this phone number with subscription billing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBillingAttribution() {
        return this.billingAttribution;
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
     * Gets the callWarmupEnabled property value. Indicates whether controlled voice call warmup is enabled for this phone number.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCallWarmupEnabled() {
        return this.callWarmupEnabled;
    }
    /**
     * Gets the callWarmupStage property value. Defines the supported voice call warmup stages for a Leadping-managed phone number.
     * @return a {@link PhoneNumberTableRowCallWarmupStage}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberTableRowCallWarmupStage getCallWarmupStage() {
        return this.callWarmupStage;
    }
    /**
     * Gets the callWarmupState property value. Defines the supported health states for controlled internal voice call warmup.
     * @return a {@link PhoneNumberTableRowCallWarmupState}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberTableRowCallWarmupState getCallWarmupState() {
        return this.callWarmupState;
    }
    /**
     * Gets the capabilities property value. SMS and voice capabilities available on this phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCapabilities() {
        return this.capabilities;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(33);
        deserializerMap.put("adminEnablementOverride", (n) -> { this.setAdminEnablementOverride(n.getObjectValue(PhoneNumberTableRowAdminEnablementOverride::createFromDiscriminatorValue)); });
        deserializerMap.put("billingAttribution", (n) -> { this.setBillingAttribution(n.getStringValue()); });
        deserializerMap.put("business", (n) -> { this.setBusiness(n.getStringValue()); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("callWarmupEnabled", (n) -> { this.setCallWarmupEnabled(n.getBooleanValue()); });
        deserializerMap.put("callWarmupStage", (n) -> { this.setCallWarmupStage(n.getEnumValue(PhoneNumberTableRowCallWarmupStage::forValue)); });
        deserializerMap.put("callWarmupState", (n) -> { this.setCallWarmupState(n.getEnumValue(PhoneNumberTableRowCallWarmupState::forValue)); });
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getStringValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(PhoneNumberTableRowHealthStatus::forValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("internalTestOnly", (n) -> { this.setInternalTestOnly(n.getBooleanValue()); });
        deserializerMap.put("inventoryState", (n) -> { this.setInventoryState(n.getEnumValue(PhoneNumberInventoryState::forValue)); });
        deserializerMap.put("isMessagingProgramApproved", (n) -> { this.setIsMessagingProgramApproved(n.getBooleanValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("ownership", (n) -> { this.setOwnership(n.getStringValue()); });
        deserializerMap.put("providerLifecycleState", (n) -> { this.setProviderLifecycleState(n.getEnumValue(PhoneNumberProviderLifecycleState::forValue)); });
        deserializerMap.put("providerReconciliationStatus", (n) -> { this.setProviderReconciliationStatus(n.getStringValue()); });
        deserializerMap.put("providerStatus", (n) -> { this.setProviderStatus(n.getStringValue()); });
        deserializerMap.put("routingSummary", (n) -> { this.setRoutingSummary(n.getStringValue()); });
        deserializerMap.put("smsReady", (n) -> { this.setSmsReady(n.getBooleanValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(InternalPhoneNumberStatus::forValue)); });
        deserializerMap.put("tenDlcCampaignId", (n) -> { this.setTenDlcCampaignId(n.getStringValue()); });
        deserializerMap.put("tenDlcCampaignStatus", (n) -> { this.setTenDlcCampaignStatus(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getStringValue()); });
        deserializerMap.put("voiceReady", (n) -> { this.setVoiceReady(n.getBooleanValue()); });
        deserializerMap.put("warmupHealthScore", (n) -> { this.setWarmupHealthScore(n.getIntegerValue()); });
        deserializerMap.put("warmupOnly", (n) -> { this.setWarmupOnly(n.getBooleanValue()); });
        deserializerMap.put("warmupProgressPercent", (n) -> { this.setWarmupProgressPercent(n.getIntegerValue()); });
        deserializerMap.put("warmupState", (n) -> { this.setWarmupState(n.getEnumValue(PhoneNumberTableRowWarmupState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the healthStatus property value. Defines the supported SMS Warmup Health State values.
     * @return a {@link PhoneNumberTableRowHealthStatus}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberTableRowHealthStatus getHealthStatus() {
        return this.healthStatus;
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
     * Gets the internalTestOnly property value. Indicates whether this record is restricted to internal Leadping testing.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getInternalTestOnly() {
        return this.internalTestOnly;
    }
    /**
     * Gets the inventoryState property value. Leadping inventory state for this phone number.
     * @return a {@link PhoneNumberInventoryState}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberInventoryState getInventoryState() {
        return this.inventoryState;
    }
    /**
     * Gets the isMessagingProgramApproved property value. Indicates whether this phone number is approved for the configured messaging program.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMessagingProgramApproved() {
        return this.isMessagingProgramApproved;
    }
    /**
     * Gets the location property value. Geographic location metadata for the phone number, lead, or lookup result.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocation() {
        return this.location;
    }
    /**
     * Gets the name property value. Display name for this phone number table row in the Leadping API.
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
     * Gets the providerLifecycleState property value. Provider lifecycle state used to determine phone number readiness.
     * @return a {@link PhoneNumberProviderLifecycleState}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberProviderLifecycleState getProviderLifecycleState() {
        return this.providerLifecycleState;
    }
    /**
     * Gets the providerReconciliationStatus property value. Reconciliation status comparing Leadping data with provider data.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderReconciliationStatus() {
        return this.providerReconciliationStatus;
    }
    /**
     * Gets the providerStatus property value. Provider lifecycle or delivery status for this phone number table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderStatus() {
        return this.providerStatus;
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
     * Gets the status property value. Current lifecycle status for this phone number table row in the Leadping API.
     * @return a {@link InternalPhoneNumberStatus}
     */
    @jakarta.annotation.Nullable
    public InternalPhoneNumberStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the tenDlcCampaignId property value. 10DLC campaign identifier associated with this sender or SMS event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenDlcCampaignId() {
        return this.tenDlcCampaignId;
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
     * Gets the user property value. User summary connected to this phone number table row.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUser() {
        return this.user;
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
     * Gets the warmupHealthScore property value. Numeric sender warmup health score used by Leadping to assess deliverability readiness.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWarmupHealthScore() {
        return this.warmupHealthScore;
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
     * Gets the warmupProgressPercent property value. Percent complete for the SMS sender warmup plan.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWarmupProgressPercent() {
        return this.warmupProgressPercent;
    }
    /**
     * Gets the warmupState property value. Defines the supported SMS Warmup Health State values.
     * @return a {@link PhoneNumberTableRowWarmupState}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberTableRowWarmupState getWarmupState() {
        return this.warmupState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("adminEnablementOverride", this.getAdminEnablementOverride());
        writer.writeStringValue("billingAttribution", this.getBillingAttribution());
        writer.writeStringValue("business", this.getBusiness());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeBooleanValue("callWarmupEnabled", this.getCallWarmupEnabled());
        writer.writeEnumValue("callWarmupStage", this.getCallWarmupStage());
        writer.writeEnumValue("callWarmupState", this.getCallWarmupState());
        writer.writeStringValue("capabilities", this.getCapabilities());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("internalTestOnly", this.getInternalTestOnly());
        writer.writeEnumValue("inventoryState", this.getInventoryState());
        writer.writeBooleanValue("isMessagingProgramApproved", this.getIsMessagingProgramApproved());
        writer.writeStringValue("location", this.getLocation());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("ownership", this.getOwnership());
        writer.writeEnumValue("providerLifecycleState", this.getProviderLifecycleState());
        writer.writeStringValue("providerReconciliationStatus", this.getProviderReconciliationStatus());
        writer.writeStringValue("providerStatus", this.getProviderStatus());
        writer.writeStringValue("routingSummary", this.getRoutingSummary());
        writer.writeBooleanValue("smsReady", this.getSmsReady());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("tenDlcCampaignId", this.getTenDlcCampaignId());
        writer.writeStringValue("tenDlcCampaignStatus", this.getTenDlcCampaignStatus());
        writer.writeStringValue("type", this.getType());
        writer.writeStringValue("user", this.getUser());
        writer.writeBooleanValue("voiceReady", this.getVoiceReady());
        writer.writeIntegerValue("warmupHealthScore", this.getWarmupHealthScore());
        writer.writeBooleanValue("warmupOnly", this.getWarmupOnly());
        writer.writeIntegerValue("warmupProgressPercent", this.getWarmupProgressPercent());
        writer.writeEnumValue("warmupState", this.getWarmupState());
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
     * Sets the adminEnablementOverride property value. Admin override that can enable or disable this record independently of normal status checks.
     * @param value Value to set for the adminEnablementOverride property.
     */
    public void setAdminEnablementOverride(@jakarta.annotation.Nullable final PhoneNumberTableRowAdminEnablementOverride value) {
        this.adminEnablementOverride = value;
    }
    /**
     * Sets the billingAttribution property value. Billing attribution used to reconcile this phone number with subscription billing.
     * @param value Value to set for the billingAttribution property.
     */
    public void setBillingAttribution(@jakarta.annotation.Nullable final String value) {
        this.billingAttribution = value;
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
     * Sets the callWarmupEnabled property value. Indicates whether controlled voice call warmup is enabled for this phone number.
     * @param value Value to set for the callWarmupEnabled property.
     */
    public void setCallWarmupEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.callWarmupEnabled = value;
    }
    /**
     * Sets the callWarmupStage property value. Defines the supported voice call warmup stages for a Leadping-managed phone number.
     * @param value Value to set for the callWarmupStage property.
     */
    public void setCallWarmupStage(@jakarta.annotation.Nullable final PhoneNumberTableRowCallWarmupStage value) {
        this.callWarmupStage = value;
    }
    /**
     * Sets the callWarmupState property value. Defines the supported health states for controlled internal voice call warmup.
     * @param value Value to set for the callWarmupState property.
     */
    public void setCallWarmupState(@jakarta.annotation.Nullable final PhoneNumberTableRowCallWarmupState value) {
        this.callWarmupState = value;
    }
    /**
     * Sets the capabilities property value. SMS and voice capabilities available on this phone number.
     * @param value Value to set for the capabilities property.
     */
    public void setCapabilities(@jakarta.annotation.Nullable final String value) {
        this.capabilities = value;
    }
    /**
     * Sets the enabled property value. Indicates whether this phone number table row is active and available in the Leadping API.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the healthStatus property value. Defines the supported SMS Warmup Health State values.
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final PhoneNumberTableRowHealthStatus value) {
        this.healthStatus = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this phone number table row.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the internalTestOnly property value. Indicates whether this record is restricted to internal Leadping testing.
     * @param value Value to set for the internalTestOnly property.
     */
    public void setInternalTestOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.internalTestOnly = value;
    }
    /**
     * Sets the inventoryState property value. Leadping inventory state for this phone number.
     * @param value Value to set for the inventoryState property.
     */
    public void setInventoryState(@jakarta.annotation.Nullable final PhoneNumberInventoryState value) {
        this.inventoryState = value;
    }
    /**
     * Sets the isMessagingProgramApproved property value. Indicates whether this phone number is approved for the configured messaging program.
     * @param value Value to set for the isMessagingProgramApproved property.
     */
    public void setIsMessagingProgramApproved(@jakarta.annotation.Nullable final Boolean value) {
        this.isMessagingProgramApproved = value;
    }
    /**
     * Sets the location property value. Geographic location metadata for the phone number, lead, or lookup result.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final String value) {
        this.location = value;
    }
    /**
     * Sets the name property value. Display name for this phone number table row in the Leadping API.
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
     * Sets the providerLifecycleState property value. Provider lifecycle state used to determine phone number readiness.
     * @param value Value to set for the providerLifecycleState property.
     */
    public void setProviderLifecycleState(@jakarta.annotation.Nullable final PhoneNumberProviderLifecycleState value) {
        this.providerLifecycleState = value;
    }
    /**
     * Sets the providerReconciliationStatus property value. Reconciliation status comparing Leadping data with provider data.
     * @param value Value to set for the providerReconciliationStatus property.
     */
    public void setProviderReconciliationStatus(@jakarta.annotation.Nullable final String value) {
        this.providerReconciliationStatus = value;
    }
    /**
     * Sets the providerStatus property value. Provider lifecycle or delivery status for this phone number table row.
     * @param value Value to set for the providerStatus property.
     */
    public void setProviderStatus(@jakarta.annotation.Nullable final String value) {
        this.providerStatus = value;
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
     * Sets the status property value. Current lifecycle status for this phone number table row in the Leadping API.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final InternalPhoneNumberStatus value) {
        this.status = value;
    }
    /**
     * Sets the tenDlcCampaignId property value. 10DLC campaign identifier associated with this sender or SMS event.
     * @param value Value to set for the tenDlcCampaignId property.
     */
    public void setTenDlcCampaignId(@jakarta.annotation.Nullable final String value) {
        this.tenDlcCampaignId = value;
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
     * Sets the user property value. User summary connected to this phone number table row.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final String value) {
        this.user = value;
    }
    /**
     * Sets the voiceReady property value. Indicates whether voice calling is ready for this business or phone number.
     * @param value Value to set for the voiceReady property.
     */
    public void setVoiceReady(@jakarta.annotation.Nullable final Boolean value) {
        this.voiceReady = value;
    }
    /**
     * Sets the warmupHealthScore property value. Numeric sender warmup health score used by Leadping to assess deliverability readiness.
     * @param value Value to set for the warmupHealthScore property.
     */
    public void setWarmupHealthScore(@jakarta.annotation.Nullable final Integer value) {
        this.warmupHealthScore = value;
    }
    /**
     * Sets the warmupOnly property value. Indicates whether this phone number should only be used for warmup traffic.
     * @param value Value to set for the warmupOnly property.
     */
    public void setWarmupOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.warmupOnly = value;
    }
    /**
     * Sets the warmupProgressPercent property value. Percent complete for the SMS sender warmup plan.
     * @param value Value to set for the warmupProgressPercent property.
     */
    public void setWarmupProgressPercent(@jakarta.annotation.Nullable final Integer value) {
        this.warmupProgressPercent = value;
    }
    /**
     * Sets the warmupState property value. Defines the supported SMS Warmup Health State values.
     * @param value Value to set for the warmupState property.
     */
    public void setWarmupState(@jakarta.annotation.Nullable final PhoneNumberTableRowWarmupState value) {
        this.warmupState = value;
    }
}
