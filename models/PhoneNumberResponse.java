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
 * Response schema for the Leadping API phone number returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Admin override that can enable or disable this record independently of normal status checks.
     */
    private PhoneNumberResponseAdminEnablementOverride adminEnablementOverride;
    /**
     * Billing attribution used to charge this phone number to the correct business and subscription item.
     */
    private PhoneNumberBillingAttribution billing;
    /**
     * Business summary connected to this phone number.
     */
    private PhoneNumberResponseBusiness business;
    /**
     * Indicates whether controlled voice call warmup is enabled for this phone number.
     */
    private Boolean callWarmupEnabled;
    /**
     * Human-readable reason explaining voice call warmup health.
     */
    private String callWarmupHealthReason;
    /**
     * UTC timestamp when the next voice call warmup action is due for this phone number.
     */
    private OffsetDateTime callWarmupNextActionAt;
    /**
     * Human-readable reason voice call warmup is paused.
     */
    private String callWarmupPauseReason;
    /**
     * Defines the supported voice call warmup stages for a Leadping-managed phone number.
     */
    private PhoneNumberResponseCallWarmupStage callWarmupStage;
    /**
     * Defines the supported health states for controlled internal voice call warmup.
     */
    private PhoneNumberResponseCallWarmupState callWarmupState;
    /**
     * Messaging campaign identifier associated with this phone number.
     */
    private String campaignId;
    /**
     * SMS and voice capabilities available on this phone number.
     */
    private PhoneNumberCapabilities capabilities;
    /**
     * The date and time when the entity was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Indicates whether this phone number is active and available in the Leadping API.
     */
    private Boolean enabled;
    /**
     * Timeline events and provider events associated with this phone number.
     */
    private java.util.List<PhoneNumberEventRecord> events;
    /**
     * Human-readable reason explaining the current health status.
     */
    private String healthReason;
    /**
     * Defines the supported SMS Warmup Health State values.
     */
    private PhoneNumberResponseHealthStatus healthStatus;
    /**
     * The unique identifier for the entity.
     */
    private String id;
    /**
     * Leadping inventory state for this phone number.
     */
    private PhoneNumberInventoryState inventoryState;
    /**
     * Indicates whether this phone number is approved for test messages or calls.
     */
    private Boolean isApprovedTestDestination;
    /**
     * Indicates whether this phone number is the default sender for the business.
     */
    private Boolean isDefault;
    /**
     * Indicates whether this phone number belongs to an internal Leadping number pool.
     */
    private Boolean isInternalPool;
    /**
     * Indicates whether this phone number is approved for the configured messaging program.
     */
    private Boolean isMessagingProgramApproved;
    /**
     * Indicates whether this phone number is preferred for outbound communication.
     */
    private Boolean isPreferred;
    /**
     * Indicates whether Leadping provisions and manages this phone number.
     */
    private Boolean leadpingOwned;
    /**
     * Geographic location metadata for the phone number, lead, or lookup result.
     */
    private PhoneNumberResponseLocation location;
    /**
     * The date and time when the entity was last modified, if applicable.
     */
    private OffsetDateTime modifiedAt;
    /**
     * The display name for the entity.
     */
    private String name;
    /**
     * E.164 phone number exposed by this phone number.
     */
    private String number;
    /**
     * Telephony or payment provider connected to this phone number.
     */
    private String provider;
    /**
     * Provider error message captured while syncing this phone number.
     */
    private String providerError;
    /**
     * Provider order identifier returned during phone number provisioning.
     */
    private String providerOrderId;
    /**
     * Provider order status returned during phone number provisioning.
     */
    private String providerOrderStatus;
    /**
     * Provider phone number identifier used to reconcile Leadping inventory with Telnyx.
     */
    private String providerPhoneNumberId;
    /**
     * UTC timestamp when the provider released this phone number.
     */
    private OffsetDateTime providerReleasedAt;
    /**
     * UTC timestamp when the provider release hold starts for this phone number.
     */
    private OffsetDateTime providerReleaseHoldStartsAt;
    /**
     * Reason supplied when requesting provider release of this phone number.
     */
    private String providerReleaseReason;
    /**
     * UTC timestamp when release was requested for this provider phone number.
     */
    private OffsetDateTime providerReleaseRequestedAt;
    /**
     * Display name of the person who requested provider release of this phone number.
     */
    private String providerReleaseRequestedByName;
    /**
     * User ID of the person who requested provider release of this phone number.
     */
    private String providerReleaseRequestedByUserId;
    /**
     * UTC timestamp when provider release is scheduled for this phone number.
     */
    private OffsetDateTime providerReleaseScheduledAt;
    /**
     * Indicates whether Leadping should unassign the phone number when the provider release hold starts.
     */
    private Boolean providerReleaseUnassignAtHoldStart;
    /**
     * Provider lifecycle or delivery status for this phone number.
     */
    private String providerStatus;
    /**
     * UTC timestamp when Leadping last synchronized this phone number with the provider.
     */
    private OffsetDateTime providerSyncedAt;
    /**
     * Routing metadata that connects this phone number to teams, campaigns, and sources.
     */
    private PhoneNumberRoutingMetadata routing;
    /**
     * Lead source ID assigned to this phone number for attribution and routing.
     */
    private String sourceId;
    /**
     * Current lifecycle status for this phone number in the Leadping API.
     */
    private InternalPhoneNumberStatus status;
    /**
     * Team ID used to route calls and messages for this phone number.
     */
    private String teamId;
    /**
     * 10DLC registration and campaign association for this phone number.
     */
    private PhoneNumberTenDlcAssociation tenDlc;
    /**
     * User summary connected to this phone number.
     */
    private PhoneNumberResponseUser user;
    /**
     * Indicates whether SMS sender warmup is enabled for this phone number.
     */
    private Boolean warmupEnabled;
    /**
     * Numeric sender warmup health score used by Leadping to assess deliverability readiness.
     */
    private Integer warmupHealthScore;
    /**
     * UTC timestamp when the next SMS warmup action is due for this phone number.
     */
    private OffsetDateTime warmupNextActionAt;
    /**
     * Human-readable reason SMS sender warmup is paused.
     */
    private String warmupPauseReason;
    /**
     * Percent complete for the SMS sender warmup plan.
     */
    private Integer warmupProgressPercent;
    /**
     * Defines the supported SMS Warmup Health State values.
     */
    private PhoneNumberResponseWarmupState warmupState;
    /**
     * Instantiates a new {@link PhoneNumberResponse} and sets the default values.
     */
    public PhoneNumberResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberResponse}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberResponse();
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
     * @return a {@link PhoneNumberResponseAdminEnablementOverride}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberResponseAdminEnablementOverride getAdminEnablementOverride() {
        return this.adminEnablementOverride;
    }
    /**
     * Gets the billing property value. Billing attribution used to charge this phone number to the correct business and subscription item.
     * @return a {@link PhoneNumberBillingAttribution}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberBillingAttribution getBilling() {
        return this.billing;
    }
    /**
     * Gets the business property value. Business summary connected to this phone number.
     * @return a {@link PhoneNumberResponseBusiness}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberResponseBusiness getBusiness() {
        return this.business;
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
     * Gets the callWarmupHealthReason property value. Human-readable reason explaining voice call warmup health.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallWarmupHealthReason() {
        return this.callWarmupHealthReason;
    }
    /**
     * Gets the callWarmupNextActionAt property value. UTC timestamp when the next voice call warmup action is due for this phone number.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCallWarmupNextActionAt() {
        return this.callWarmupNextActionAt;
    }
    /**
     * Gets the callWarmupPauseReason property value. Human-readable reason voice call warmup is paused.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallWarmupPauseReason() {
        return this.callWarmupPauseReason;
    }
    /**
     * Gets the callWarmupStage property value. Defines the supported voice call warmup stages for a Leadping-managed phone number.
     * @return a {@link PhoneNumberResponseCallWarmupStage}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberResponseCallWarmupStage getCallWarmupStage() {
        return this.callWarmupStage;
    }
    /**
     * Gets the callWarmupState property value. Defines the supported health states for controlled internal voice call warmup.
     * @return a {@link PhoneNumberResponseCallWarmupState}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberResponseCallWarmupState getCallWarmupState() {
        return this.callWarmupState;
    }
    /**
     * Gets the campaignId property value. Messaging campaign identifier associated with this phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCampaignId() {
        return this.campaignId;
    }
    /**
     * Gets the capabilities property value. SMS and voice capabilities available on this phone number.
     * @return a {@link PhoneNumberCapabilities}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberCapabilities getCapabilities() {
        return this.capabilities;
    }
    /**
     * Gets the createdAt property value. The date and time when the entity was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the enabled property value. Indicates whether this phone number is active and available in the Leadping API.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * Gets the events property value. Timeline events and provider events associated with this phone number.
     * @return a {@link java.util.List<PhoneNumberEventRecord>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PhoneNumberEventRecord> getEvents() {
        return this.events;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(55);
        deserializerMap.put("adminEnablementOverride", (n) -> { this.setAdminEnablementOverride(n.getObjectValue(PhoneNumberResponseAdminEnablementOverride::createFromDiscriminatorValue)); });
        deserializerMap.put("billing", (n) -> { this.setBilling(n.getObjectValue(PhoneNumberBillingAttribution::createFromDiscriminatorValue)); });
        deserializerMap.put("business", (n) -> { this.setBusiness(n.getObjectValue(PhoneNumberResponseBusiness::createFromDiscriminatorValue)); });
        deserializerMap.put("callWarmupEnabled", (n) -> { this.setCallWarmupEnabled(n.getBooleanValue()); });
        deserializerMap.put("callWarmupHealthReason", (n) -> { this.setCallWarmupHealthReason(n.getStringValue()); });
        deserializerMap.put("callWarmupNextActionAt", (n) -> { this.setCallWarmupNextActionAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("callWarmupPauseReason", (n) -> { this.setCallWarmupPauseReason(n.getStringValue()); });
        deserializerMap.put("callWarmupStage", (n) -> { this.setCallWarmupStage(n.getEnumValue(PhoneNumberResponseCallWarmupStage::forValue)); });
        deserializerMap.put("callWarmupState", (n) -> { this.setCallWarmupState(n.getEnumValue(PhoneNumberResponseCallWarmupState::forValue)); });
        deserializerMap.put("campaignId", (n) -> { this.setCampaignId(n.getStringValue()); });
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getObjectValue(PhoneNumberCapabilities::createFromDiscriminatorValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("events", (n) -> { this.setEvents(n.getCollectionOfObjectValues(PhoneNumberEventRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("healthReason", (n) -> { this.setHealthReason(n.getStringValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(PhoneNumberResponseHealthStatus::forValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("inventoryState", (n) -> { this.setInventoryState(n.getEnumValue(PhoneNumberInventoryState::forValue)); });
        deserializerMap.put("isApprovedTestDestination", (n) -> { this.setIsApprovedTestDestination(n.getBooleanValue()); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("isInternalPool", (n) -> { this.setIsInternalPool(n.getBooleanValue()); });
        deserializerMap.put("isMessagingProgramApproved", (n) -> { this.setIsMessagingProgramApproved(n.getBooleanValue()); });
        deserializerMap.put("isPreferred", (n) -> { this.setIsPreferred(n.getBooleanValue()); });
        deserializerMap.put("leadpingOwned", (n) -> { this.setLeadpingOwned(n.getBooleanValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(PhoneNumberResponseLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getStringValue()); });
        deserializerMap.put("providerError", (n) -> { this.setProviderError(n.getStringValue()); });
        deserializerMap.put("providerOrderId", (n) -> { this.setProviderOrderId(n.getStringValue()); });
        deserializerMap.put("providerOrderStatus", (n) -> { this.setProviderOrderStatus(n.getStringValue()); });
        deserializerMap.put("providerPhoneNumberId", (n) -> { this.setProviderPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("providerReleasedAt", (n) -> { this.setProviderReleasedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("providerReleaseHoldStartsAt", (n) -> { this.setProviderReleaseHoldStartsAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("providerReleaseReason", (n) -> { this.setProviderReleaseReason(n.getStringValue()); });
        deserializerMap.put("providerReleaseRequestedAt", (n) -> { this.setProviderReleaseRequestedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("providerReleaseRequestedByName", (n) -> { this.setProviderReleaseRequestedByName(n.getStringValue()); });
        deserializerMap.put("providerReleaseRequestedByUserId", (n) -> { this.setProviderReleaseRequestedByUserId(n.getStringValue()); });
        deserializerMap.put("providerReleaseScheduledAt", (n) -> { this.setProviderReleaseScheduledAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("providerReleaseUnassignAtHoldStart", (n) -> { this.setProviderReleaseUnassignAtHoldStart(n.getBooleanValue()); });
        deserializerMap.put("providerStatus", (n) -> { this.setProviderStatus(n.getStringValue()); });
        deserializerMap.put("providerSyncedAt", (n) -> { this.setProviderSyncedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("routing", (n) -> { this.setRouting(n.getObjectValue(PhoneNumberRoutingMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(InternalPhoneNumberStatus::forValue)); });
        deserializerMap.put("teamId", (n) -> { this.setTeamId(n.getStringValue()); });
        deserializerMap.put("tenDlc", (n) -> { this.setTenDlc(n.getObjectValue(PhoneNumberTenDlcAssociation::createFromDiscriminatorValue)); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(PhoneNumberResponseUser::createFromDiscriminatorValue)); });
        deserializerMap.put("warmupEnabled", (n) -> { this.setWarmupEnabled(n.getBooleanValue()); });
        deserializerMap.put("warmupHealthScore", (n) -> { this.setWarmupHealthScore(n.getIntegerValue()); });
        deserializerMap.put("warmupNextActionAt", (n) -> { this.setWarmupNextActionAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("warmupPauseReason", (n) -> { this.setWarmupPauseReason(n.getStringValue()); });
        deserializerMap.put("warmupProgressPercent", (n) -> { this.setWarmupProgressPercent(n.getIntegerValue()); });
        deserializerMap.put("warmupState", (n) -> { this.setWarmupState(n.getEnumValue(PhoneNumberResponseWarmupState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the healthReason property value. Human-readable reason explaining the current health status.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHealthReason() {
        return this.healthReason;
    }
    /**
     * Gets the healthStatus property value. Defines the supported SMS Warmup Health State values.
     * @return a {@link PhoneNumberResponseHealthStatus}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberResponseHealthStatus getHealthStatus() {
        return this.healthStatus;
    }
    /**
     * Gets the id property value. The unique identifier for the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
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
     * Gets the isApprovedTestDestination property value. Indicates whether this phone number is approved for test messages or calls.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApprovedTestDestination() {
        return this.isApprovedTestDestination;
    }
    /**
     * Gets the isDefault property value. Indicates whether this phone number is the default sender for the business.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    /**
     * Gets the isInternalPool property value. Indicates whether this phone number belongs to an internal Leadping number pool.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInternalPool() {
        return this.isInternalPool;
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
     * Gets the isPreferred property value. Indicates whether this phone number is preferred for outbound communication.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPreferred() {
        return this.isPreferred;
    }
    /**
     * Gets the leadpingOwned property value. Indicates whether Leadping provisions and manages this phone number.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLeadpingOwned() {
        return this.leadpingOwned;
    }
    /**
     * Gets the location property value. Geographic location metadata for the phone number, lead, or lookup result.
     * @return a {@link PhoneNumberResponseLocation}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberResponseLocation getLocation() {
        return this.location;
    }
    /**
     * Gets the modifiedAt property value. The date and time when the entity was last modified, if applicable.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the name property value. The display name for the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the number property value. E.164 phone number exposed by this phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.number;
    }
    /**
     * Gets the provider property value. Telephony or payment provider connected to this phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvider() {
        return this.provider;
    }
    /**
     * Gets the providerError property value. Provider error message captured while syncing this phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderError() {
        return this.providerError;
    }
    /**
     * Gets the providerOrderId property value. Provider order identifier returned during phone number provisioning.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderOrderId() {
        return this.providerOrderId;
    }
    /**
     * Gets the providerOrderStatus property value. Provider order status returned during phone number provisioning.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderOrderStatus() {
        return this.providerOrderStatus;
    }
    /**
     * Gets the providerPhoneNumberId property value. Provider phone number identifier used to reconcile Leadping inventory with Telnyx.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderPhoneNumberId() {
        return this.providerPhoneNumberId;
    }
    /**
     * Gets the providerReleasedAt property value. UTC timestamp when the provider released this phone number.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getProviderReleasedAt() {
        return this.providerReleasedAt;
    }
    /**
     * Gets the providerReleaseHoldStartsAt property value. UTC timestamp when the provider release hold starts for this phone number.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getProviderReleaseHoldStartsAt() {
        return this.providerReleaseHoldStartsAt;
    }
    /**
     * Gets the providerReleaseReason property value. Reason supplied when requesting provider release of this phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderReleaseReason() {
        return this.providerReleaseReason;
    }
    /**
     * Gets the providerReleaseRequestedAt property value. UTC timestamp when release was requested for this provider phone number.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getProviderReleaseRequestedAt() {
        return this.providerReleaseRequestedAt;
    }
    /**
     * Gets the providerReleaseRequestedByName property value. Display name of the person who requested provider release of this phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderReleaseRequestedByName() {
        return this.providerReleaseRequestedByName;
    }
    /**
     * Gets the providerReleaseRequestedByUserId property value. User ID of the person who requested provider release of this phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderReleaseRequestedByUserId() {
        return this.providerReleaseRequestedByUserId;
    }
    /**
     * Gets the providerReleaseScheduledAt property value. UTC timestamp when provider release is scheduled for this phone number.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getProviderReleaseScheduledAt() {
        return this.providerReleaseScheduledAt;
    }
    /**
     * Gets the providerReleaseUnassignAtHoldStart property value. Indicates whether Leadping should unassign the phone number when the provider release hold starts.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getProviderReleaseUnassignAtHoldStart() {
        return this.providerReleaseUnassignAtHoldStart;
    }
    /**
     * Gets the providerStatus property value. Provider lifecycle or delivery status for this phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProviderStatus() {
        return this.providerStatus;
    }
    /**
     * Gets the providerSyncedAt property value. UTC timestamp when Leadping last synchronized this phone number with the provider.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getProviderSyncedAt() {
        return this.providerSyncedAt;
    }
    /**
     * Gets the routing property value. Routing metadata that connects this phone number to teams, campaigns, and sources.
     * @return a {@link PhoneNumberRoutingMetadata}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberRoutingMetadata getRouting() {
        return this.routing;
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
     * Gets the status property value. Current lifecycle status for this phone number in the Leadping API.
     * @return a {@link InternalPhoneNumberStatus}
     */
    @jakarta.annotation.Nullable
    public InternalPhoneNumberStatus getStatus() {
        return this.status;
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
     * Gets the tenDlc property value. 10DLC registration and campaign association for this phone number.
     * @return a {@link PhoneNumberTenDlcAssociation}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberTenDlcAssociation getTenDlc() {
        return this.tenDlc;
    }
    /**
     * Gets the user property value. User summary connected to this phone number.
     * @return a {@link PhoneNumberResponseUser}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberResponseUser getUser() {
        return this.user;
    }
    /**
     * Gets the warmupEnabled property value. Indicates whether SMS sender warmup is enabled for this phone number.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWarmupEnabled() {
        return this.warmupEnabled;
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
     * Gets the warmupNextActionAt property value. UTC timestamp when the next SMS warmup action is due for this phone number.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getWarmupNextActionAt() {
        return this.warmupNextActionAt;
    }
    /**
     * Gets the warmupPauseReason property value. Human-readable reason SMS sender warmup is paused.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWarmupPauseReason() {
        return this.warmupPauseReason;
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
     * @return a {@link PhoneNumberResponseWarmupState}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberResponseWarmupState getWarmupState() {
        return this.warmupState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("adminEnablementOverride", this.getAdminEnablementOverride());
        writer.writeObjectValue("billing", this.getBilling());
        writer.writeObjectValue("business", this.getBusiness());
        writer.writeBooleanValue("callWarmupEnabled", this.getCallWarmupEnabled());
        writer.writeStringValue("callWarmupHealthReason", this.getCallWarmupHealthReason());
        writer.writeOffsetDateTimeValue("callWarmupNextActionAt", this.getCallWarmupNextActionAt());
        writer.writeStringValue("callWarmupPauseReason", this.getCallWarmupPauseReason());
        writer.writeEnumValue("callWarmupStage", this.getCallWarmupStage());
        writer.writeEnumValue("callWarmupState", this.getCallWarmupState());
        writer.writeStringValue("campaignId", this.getCampaignId());
        writer.writeObjectValue("capabilities", this.getCapabilities());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeCollectionOfObjectValues("events", this.getEvents());
        writer.writeStringValue("healthReason", this.getHealthReason());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeStringValue("id", this.getId());
        writer.writeEnumValue("inventoryState", this.getInventoryState());
        writer.writeBooleanValue("isApprovedTestDestination", this.getIsApprovedTestDestination());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeBooleanValue("isInternalPool", this.getIsInternalPool());
        writer.writeBooleanValue("isMessagingProgramApproved", this.getIsMessagingProgramApproved());
        writer.writeBooleanValue("isPreferred", this.getIsPreferred());
        writer.writeBooleanValue("leadpingOwned", this.getLeadpingOwned());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("provider", this.getProvider());
        writer.writeStringValue("providerError", this.getProviderError());
        writer.writeStringValue("providerOrderId", this.getProviderOrderId());
        writer.writeStringValue("providerOrderStatus", this.getProviderOrderStatus());
        writer.writeStringValue("providerPhoneNumberId", this.getProviderPhoneNumberId());
        writer.writeOffsetDateTimeValue("providerReleasedAt", this.getProviderReleasedAt());
        writer.writeOffsetDateTimeValue("providerReleaseHoldStartsAt", this.getProviderReleaseHoldStartsAt());
        writer.writeStringValue("providerReleaseReason", this.getProviderReleaseReason());
        writer.writeOffsetDateTimeValue("providerReleaseRequestedAt", this.getProviderReleaseRequestedAt());
        writer.writeStringValue("providerReleaseRequestedByName", this.getProviderReleaseRequestedByName());
        writer.writeStringValue("providerReleaseRequestedByUserId", this.getProviderReleaseRequestedByUserId());
        writer.writeOffsetDateTimeValue("providerReleaseScheduledAt", this.getProviderReleaseScheduledAt());
        writer.writeBooleanValue("providerReleaseUnassignAtHoldStart", this.getProviderReleaseUnassignAtHoldStart());
        writer.writeStringValue("providerStatus", this.getProviderStatus());
        writer.writeOffsetDateTimeValue("providerSyncedAt", this.getProviderSyncedAt());
        writer.writeObjectValue("routing", this.getRouting());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("teamId", this.getTeamId());
        writer.writeObjectValue("tenDlc", this.getTenDlc());
        writer.writeObjectValue("user", this.getUser());
        writer.writeBooleanValue("warmupEnabled", this.getWarmupEnabled());
        writer.writeIntegerValue("warmupHealthScore", this.getWarmupHealthScore());
        writer.writeOffsetDateTimeValue("warmupNextActionAt", this.getWarmupNextActionAt());
        writer.writeStringValue("warmupPauseReason", this.getWarmupPauseReason());
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
    public void setAdminEnablementOverride(@jakarta.annotation.Nullable final PhoneNumberResponseAdminEnablementOverride value) {
        this.adminEnablementOverride = value;
    }
    /**
     * Sets the billing property value. Billing attribution used to charge this phone number to the correct business and subscription item.
     * @param value Value to set for the billing property.
     */
    public void setBilling(@jakarta.annotation.Nullable final PhoneNumberBillingAttribution value) {
        this.billing = value;
    }
    /**
     * Sets the business property value. Business summary connected to this phone number.
     * @param value Value to set for the business property.
     */
    public void setBusiness(@jakarta.annotation.Nullable final PhoneNumberResponseBusiness value) {
        this.business = value;
    }
    /**
     * Sets the callWarmupEnabled property value. Indicates whether controlled voice call warmup is enabled for this phone number.
     * @param value Value to set for the callWarmupEnabled property.
     */
    public void setCallWarmupEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.callWarmupEnabled = value;
    }
    /**
     * Sets the callWarmupHealthReason property value. Human-readable reason explaining voice call warmup health.
     * @param value Value to set for the callWarmupHealthReason property.
     */
    public void setCallWarmupHealthReason(@jakarta.annotation.Nullable final String value) {
        this.callWarmupHealthReason = value;
    }
    /**
     * Sets the callWarmupNextActionAt property value. UTC timestamp when the next voice call warmup action is due for this phone number.
     * @param value Value to set for the callWarmupNextActionAt property.
     */
    public void setCallWarmupNextActionAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.callWarmupNextActionAt = value;
    }
    /**
     * Sets the callWarmupPauseReason property value. Human-readable reason voice call warmup is paused.
     * @param value Value to set for the callWarmupPauseReason property.
     */
    public void setCallWarmupPauseReason(@jakarta.annotation.Nullable final String value) {
        this.callWarmupPauseReason = value;
    }
    /**
     * Sets the callWarmupStage property value. Defines the supported voice call warmup stages for a Leadping-managed phone number.
     * @param value Value to set for the callWarmupStage property.
     */
    public void setCallWarmupStage(@jakarta.annotation.Nullable final PhoneNumberResponseCallWarmupStage value) {
        this.callWarmupStage = value;
    }
    /**
     * Sets the callWarmupState property value. Defines the supported health states for controlled internal voice call warmup.
     * @param value Value to set for the callWarmupState property.
     */
    public void setCallWarmupState(@jakarta.annotation.Nullable final PhoneNumberResponseCallWarmupState value) {
        this.callWarmupState = value;
    }
    /**
     * Sets the campaignId property value. Messaging campaign identifier associated with this phone number.
     * @param value Value to set for the campaignId property.
     */
    public void setCampaignId(@jakarta.annotation.Nullable final String value) {
        this.campaignId = value;
    }
    /**
     * Sets the capabilities property value. SMS and voice capabilities available on this phone number.
     * @param value Value to set for the capabilities property.
     */
    public void setCapabilities(@jakarta.annotation.Nullable final PhoneNumberCapabilities value) {
        this.capabilities = value;
    }
    /**
     * Sets the createdAt property value. The date and time when the entity was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the enabled property value. Indicates whether this phone number is active and available in the Leadping API.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the events property value. Timeline events and provider events associated with this phone number.
     * @param value Value to set for the events property.
     */
    public void setEvents(@jakarta.annotation.Nullable final java.util.List<PhoneNumberEventRecord> value) {
        this.events = value;
    }
    /**
     * Sets the healthReason property value. Human-readable reason explaining the current health status.
     * @param value Value to set for the healthReason property.
     */
    public void setHealthReason(@jakarta.annotation.Nullable final String value) {
        this.healthReason = value;
    }
    /**
     * Sets the healthStatus property value. Defines the supported SMS Warmup Health State values.
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final PhoneNumberResponseHealthStatus value) {
        this.healthStatus = value;
    }
    /**
     * Sets the id property value. The unique identifier for the entity.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the inventoryState property value. Leadping inventory state for this phone number.
     * @param value Value to set for the inventoryState property.
     */
    public void setInventoryState(@jakarta.annotation.Nullable final PhoneNumberInventoryState value) {
        this.inventoryState = value;
    }
    /**
     * Sets the isApprovedTestDestination property value. Indicates whether this phone number is approved for test messages or calls.
     * @param value Value to set for the isApprovedTestDestination property.
     */
    public void setIsApprovedTestDestination(@jakarta.annotation.Nullable final Boolean value) {
        this.isApprovedTestDestination = value;
    }
    /**
     * Sets the isDefault property value. Indicates whether this phone number is the default sender for the business.
     * @param value Value to set for the isDefault property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.isDefault = value;
    }
    /**
     * Sets the isInternalPool property value. Indicates whether this phone number belongs to an internal Leadping number pool.
     * @param value Value to set for the isInternalPool property.
     */
    public void setIsInternalPool(@jakarta.annotation.Nullable final Boolean value) {
        this.isInternalPool = value;
    }
    /**
     * Sets the isMessagingProgramApproved property value. Indicates whether this phone number is approved for the configured messaging program.
     * @param value Value to set for the isMessagingProgramApproved property.
     */
    public void setIsMessagingProgramApproved(@jakarta.annotation.Nullable final Boolean value) {
        this.isMessagingProgramApproved = value;
    }
    /**
     * Sets the isPreferred property value. Indicates whether this phone number is preferred for outbound communication.
     * @param value Value to set for the isPreferred property.
     */
    public void setIsPreferred(@jakarta.annotation.Nullable final Boolean value) {
        this.isPreferred = value;
    }
    /**
     * Sets the leadpingOwned property value. Indicates whether Leadping provisions and manages this phone number.
     * @param value Value to set for the leadpingOwned property.
     */
    public void setLeadpingOwned(@jakarta.annotation.Nullable final Boolean value) {
        this.leadpingOwned = value;
    }
    /**
     * Sets the location property value. Geographic location metadata for the phone number, lead, or lookup result.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final PhoneNumberResponseLocation value) {
        this.location = value;
    }
    /**
     * Sets the modifiedAt property value. The date and time when the entity was last modified, if applicable.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the name property value. The display name for the entity.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the number property value. E.164 phone number exposed by this phone number.
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.number = value;
    }
    /**
     * Sets the provider property value. Telephony or payment provider connected to this phone number.
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final String value) {
        this.provider = value;
    }
    /**
     * Sets the providerError property value. Provider error message captured while syncing this phone number.
     * @param value Value to set for the providerError property.
     */
    public void setProviderError(@jakarta.annotation.Nullable final String value) {
        this.providerError = value;
    }
    /**
     * Sets the providerOrderId property value. Provider order identifier returned during phone number provisioning.
     * @param value Value to set for the providerOrderId property.
     */
    public void setProviderOrderId(@jakarta.annotation.Nullable final String value) {
        this.providerOrderId = value;
    }
    /**
     * Sets the providerOrderStatus property value. Provider order status returned during phone number provisioning.
     * @param value Value to set for the providerOrderStatus property.
     */
    public void setProviderOrderStatus(@jakarta.annotation.Nullable final String value) {
        this.providerOrderStatus = value;
    }
    /**
     * Sets the providerPhoneNumberId property value. Provider phone number identifier used to reconcile Leadping inventory with Telnyx.
     * @param value Value to set for the providerPhoneNumberId property.
     */
    public void setProviderPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.providerPhoneNumberId = value;
    }
    /**
     * Sets the providerReleasedAt property value. UTC timestamp when the provider released this phone number.
     * @param value Value to set for the providerReleasedAt property.
     */
    public void setProviderReleasedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.providerReleasedAt = value;
    }
    /**
     * Sets the providerReleaseHoldStartsAt property value. UTC timestamp when the provider release hold starts for this phone number.
     * @param value Value to set for the providerReleaseHoldStartsAt property.
     */
    public void setProviderReleaseHoldStartsAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.providerReleaseHoldStartsAt = value;
    }
    /**
     * Sets the providerReleaseReason property value. Reason supplied when requesting provider release of this phone number.
     * @param value Value to set for the providerReleaseReason property.
     */
    public void setProviderReleaseReason(@jakarta.annotation.Nullable final String value) {
        this.providerReleaseReason = value;
    }
    /**
     * Sets the providerReleaseRequestedAt property value. UTC timestamp when release was requested for this provider phone number.
     * @param value Value to set for the providerReleaseRequestedAt property.
     */
    public void setProviderReleaseRequestedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.providerReleaseRequestedAt = value;
    }
    /**
     * Sets the providerReleaseRequestedByName property value. Display name of the person who requested provider release of this phone number.
     * @param value Value to set for the providerReleaseRequestedByName property.
     */
    public void setProviderReleaseRequestedByName(@jakarta.annotation.Nullable final String value) {
        this.providerReleaseRequestedByName = value;
    }
    /**
     * Sets the providerReleaseRequestedByUserId property value. User ID of the person who requested provider release of this phone number.
     * @param value Value to set for the providerReleaseRequestedByUserId property.
     */
    public void setProviderReleaseRequestedByUserId(@jakarta.annotation.Nullable final String value) {
        this.providerReleaseRequestedByUserId = value;
    }
    /**
     * Sets the providerReleaseScheduledAt property value. UTC timestamp when provider release is scheduled for this phone number.
     * @param value Value to set for the providerReleaseScheduledAt property.
     */
    public void setProviderReleaseScheduledAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.providerReleaseScheduledAt = value;
    }
    /**
     * Sets the providerReleaseUnassignAtHoldStart property value. Indicates whether Leadping should unassign the phone number when the provider release hold starts.
     * @param value Value to set for the providerReleaseUnassignAtHoldStart property.
     */
    public void setProviderReleaseUnassignAtHoldStart(@jakarta.annotation.Nullable final Boolean value) {
        this.providerReleaseUnassignAtHoldStart = value;
    }
    /**
     * Sets the providerStatus property value. Provider lifecycle or delivery status for this phone number.
     * @param value Value to set for the providerStatus property.
     */
    public void setProviderStatus(@jakarta.annotation.Nullable final String value) {
        this.providerStatus = value;
    }
    /**
     * Sets the providerSyncedAt property value. UTC timestamp when Leadping last synchronized this phone number with the provider.
     * @param value Value to set for the providerSyncedAt property.
     */
    public void setProviderSyncedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.providerSyncedAt = value;
    }
    /**
     * Sets the routing property value. Routing metadata that connects this phone number to teams, campaigns, and sources.
     * @param value Value to set for the routing property.
     */
    public void setRouting(@jakarta.annotation.Nullable final PhoneNumberRoutingMetadata value) {
        this.routing = value;
    }
    /**
     * Sets the sourceId property value. Lead source ID assigned to this phone number for attribution and routing.
     * @param value Value to set for the sourceId property.
     */
    public void setSourceId(@jakarta.annotation.Nullable final String value) {
        this.sourceId = value;
    }
    /**
     * Sets the status property value. Current lifecycle status for this phone number in the Leadping API.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final InternalPhoneNumberStatus value) {
        this.status = value;
    }
    /**
     * Sets the teamId property value. Team ID used to route calls and messages for this phone number.
     * @param value Value to set for the teamId property.
     */
    public void setTeamId(@jakarta.annotation.Nullable final String value) {
        this.teamId = value;
    }
    /**
     * Sets the tenDlc property value. 10DLC registration and campaign association for this phone number.
     * @param value Value to set for the tenDlc property.
     */
    public void setTenDlc(@jakarta.annotation.Nullable final PhoneNumberTenDlcAssociation value) {
        this.tenDlc = value;
    }
    /**
     * Sets the user property value. User summary connected to this phone number.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final PhoneNumberResponseUser value) {
        this.user = value;
    }
    /**
     * Sets the warmupEnabled property value. Indicates whether SMS sender warmup is enabled for this phone number.
     * @param value Value to set for the warmupEnabled property.
     */
    public void setWarmupEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.warmupEnabled = value;
    }
    /**
     * Sets the warmupHealthScore property value. Numeric sender warmup health score used by Leadping to assess deliverability readiness.
     * @param value Value to set for the warmupHealthScore property.
     */
    public void setWarmupHealthScore(@jakarta.annotation.Nullable final Integer value) {
        this.warmupHealthScore = value;
    }
    /**
     * Sets the warmupNextActionAt property value. UTC timestamp when the next SMS warmup action is due for this phone number.
     * @param value Value to set for the warmupNextActionAt property.
     */
    public void setWarmupNextActionAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.warmupNextActionAt = value;
    }
    /**
     * Sets the warmupPauseReason property value. Human-readable reason SMS sender warmup is paused.
     * @param value Value to set for the warmupPauseReason property.
     */
    public void setWarmupPauseReason(@jakarta.annotation.Nullable final String value) {
        this.warmupPauseReason = value;
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
    public void setWarmupState(@jakarta.annotation.Nullable final PhoneNumberResponseWarmupState value) {
        this.warmupState = value;
    }
}
