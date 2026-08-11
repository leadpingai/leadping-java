package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Describes organization data used in Leadping API requests and responses.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationTableRow implements AdditionalDataHolder, Parsable {
    /**
     * Account balance for this organization.
     */
    private UntypedNode accountBalance;
    /**
     * Defines the supported Customer Activation Status values.
     */
    private OrganizationTableRowActivationStatus activationStatus;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time this organization API key expires, or null when it has no expiration.
     */
    private OffsetDateTime apiKeyExpiresAt;
    /**
     * The date and time this organization API key was first used.
     */
    private OffsetDateTime apiKeyFirstUsedAt;
    /**
     * The date and time this organization API key was issued.
     */
    private OffsetDateTime apiKeyIssuedAt;
    /**
     * The date and time this organization API key was last used.
     */
    private OffsetDateTime apiKeyLastUsedAt;
    /**
     * WorkOS permission slugs granted to this organization API key.
     */
    private java.util.List<String> apiKeyPermissions;
    /**
     * The masked API key preview owned by this organization.
     */
    private String apiKeyPreview;
    /**
     * The total number of tracked uses for this organization API key.
     */
    private UntypedNode apiKeyTotalUses;
    /**
     * Defines the supported Billing Plan values.
     */
    private OrganizationTableRowBillingPlan billingPlan;
    /**
     * Whether this organization is enabled.
     */
    private Boolean enabled;
    /**
     * Unique Leadping identifier for this organization.
     */
    private String id;
    /**
     * Industry for this organization.
     */
    private String industry;
    /**
     * Date and time when this Leadping organization table row was last subscription event.
     */
    private OffsetDateTime lastSubscriptionEventAt;
    /**
     * UTC timestamp for modified at on this organization.
     */
    private OffsetDateTime modifiedAt;
    /**
     * The human-readable name shown for this organization.
     */
    private String name;
    /**
     * Whether needs admin review applies to this organization.
     */
    private Boolean needsAdminReview;
    /**
     * Identifier and display name of the related organization.
     */
    private OrganizationTableRowOrganization organization;
    /**
     * Date and time when this Leadping organization table row was payment failed.
     */
    private OffsetDateTime paymentFailedAt;
    /**
     * The phone number associated with this organization.
     */
    private String phone;
    /**
     * Defines the supported Organization Setup Step values.
     */
    private OrganizationTableRowSetupStep setupStep;
    /**
     * Defines the supported Organization Status values.
     */
    private OrganizationTableRowStatus status;
    /**
     * Date and time when this Leadping organization table row was subscription cancel.
     */
    private OffsetDateTime subscriptionCancelAt;
    /**
     * Defines the supported Subscription Status values.
     */
    private OrganizationTableRowSubscriptionStatus subscriptionStatus;
    /**
     * Defines the supported 10DLC Application Status values.
     */
    private OrganizationTableRowTenDlcStatus tenDlcStatus;
    /**
     * The user count for this organization.
     */
    private UntypedNode userCount;
    /**
     * The website URL associated with this organization.
     */
    private String website;
    /**
     * Defines the supported Website Lifecycle Status values.
     */
    private OrganizationTableRowWebsiteStatus websiteStatus;
    /**
     * Instantiates a new {@link OrganizationTableRow} and sets the default values.
     */
    public OrganizationTableRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationTableRow}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationTableRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationTableRow();
    }
    /**
     * Gets the accountBalance property value. Account balance for this organization.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAccountBalance() {
        return this.accountBalance;
    }
    /**
     * Gets the activationStatus property value. Defines the supported Customer Activation Status values.
     * @return a {@link OrganizationTableRowActivationStatus}
     */
    @jakarta.annotation.Nullable
    public OrganizationTableRowActivationStatus getActivationStatus() {
        return this.activationStatus;
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
     * Gets the apiKeyExpiresAt property value. The date and time this organization API key expires, or null when it has no expiration.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getApiKeyExpiresAt() {
        return this.apiKeyExpiresAt;
    }
    /**
     * Gets the apiKeyFirstUsedAt property value. The date and time this organization API key was first used.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getApiKeyFirstUsedAt() {
        return this.apiKeyFirstUsedAt;
    }
    /**
     * Gets the apiKeyIssuedAt property value. The date and time this organization API key was issued.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getApiKeyIssuedAt() {
        return this.apiKeyIssuedAt;
    }
    /**
     * Gets the apiKeyLastUsedAt property value. The date and time this organization API key was last used.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getApiKeyLastUsedAt() {
        return this.apiKeyLastUsedAt;
    }
    /**
     * Gets the apiKeyPermissions property value. WorkOS permission slugs granted to this organization API key.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getApiKeyPermissions() {
        return this.apiKeyPermissions;
    }
    /**
     * Gets the apiKeyPreview property value. The masked API key preview owned by this organization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApiKeyPreview() {
        return this.apiKeyPreview;
    }
    /**
     * Gets the apiKeyTotalUses property value. The total number of tracked uses for this organization API key.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getApiKeyTotalUses() {
        return this.apiKeyTotalUses;
    }
    /**
     * Gets the billingPlan property value. Defines the supported Billing Plan values.
     * @return a {@link OrganizationTableRowBillingPlan}
     */
    @jakarta.annotation.Nullable
    public OrganizationTableRowBillingPlan getBillingPlan() {
        return this.billingPlan;
    }
    /**
     * Gets the enabled property value. Whether this organization is enabled.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(28);
        deserializerMap.put("accountBalance", (n) -> { this.setAccountBalance(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("activationStatus", (n) -> { this.setActivationStatus(n.getEnumValue(OrganizationTableRowActivationStatus::forValue)); });
        deserializerMap.put("apiKeyExpiresAt", (n) -> { this.setApiKeyExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("apiKeyFirstUsedAt", (n) -> { this.setApiKeyFirstUsedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("apiKeyIssuedAt", (n) -> { this.setApiKeyIssuedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("apiKeyLastUsedAt", (n) -> { this.setApiKeyLastUsedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("apiKeyPermissions", (n) -> { this.setApiKeyPermissions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("apiKeyPreview", (n) -> { this.setApiKeyPreview(n.getStringValue()); });
        deserializerMap.put("apiKeyTotalUses", (n) -> { this.setApiKeyTotalUses(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("billingPlan", (n) -> { this.setBillingPlan(n.getEnumValue(OrganizationTableRowBillingPlan::forValue)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("industry", (n) -> { this.setIndustry(n.getStringValue()); });
        deserializerMap.put("lastSubscriptionEventAt", (n) -> { this.setLastSubscriptionEventAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("needsAdminReview", (n) -> { this.setNeedsAdminReview(n.getBooleanValue()); });
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getObjectValue(OrganizationTableRowOrganization::createFromDiscriminatorValue)); });
        deserializerMap.put("paymentFailedAt", (n) -> { this.setPaymentFailedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("setupStep", (n) -> { this.setSetupStep(n.getEnumValue(OrganizationTableRowSetupStep::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(OrganizationTableRowStatus::forValue)); });
        deserializerMap.put("subscriptionCancelAt", (n) -> { this.setSubscriptionCancelAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("subscriptionStatus", (n) -> { this.setSubscriptionStatus(n.getEnumValue(OrganizationTableRowSubscriptionStatus::forValue)); });
        deserializerMap.put("tenDlcStatus", (n) -> { this.setTenDlcStatus(n.getEnumValue(OrganizationTableRowTenDlcStatus::forValue)); });
        deserializerMap.put("userCount", (n) -> { this.setUserCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("website", (n) -> { this.setWebsite(n.getStringValue()); });
        deserializerMap.put("websiteStatus", (n) -> { this.setWebsiteStatus(n.getEnumValue(OrganizationTableRowWebsiteStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this organization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the industry property value. Industry for this organization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIndustry() {
        return this.industry;
    }
    /**
     * Gets the lastSubscriptionEventAt property value. Date and time when this Leadping organization table row was last subscription event.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSubscriptionEventAt() {
        return this.lastSubscriptionEventAt;
    }
    /**
     * Gets the modifiedAt property value. UTC timestamp for modified at on this organization.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the name property value. The human-readable name shown for this organization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the needsAdminReview property value. Whether needs admin review applies to this organization.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNeedsAdminReview() {
        return this.needsAdminReview;
    }
    /**
     * Gets the organization property value. Identifier and display name of the related organization.
     * @return a {@link OrganizationTableRowOrganization}
     */
    @jakarta.annotation.Nullable
    public OrganizationTableRowOrganization getOrganization() {
        return this.organization;
    }
    /**
     * Gets the paymentFailedAt property value. Date and time when this Leadping organization table row was payment failed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPaymentFailedAt() {
        return this.paymentFailedAt;
    }
    /**
     * Gets the phone property value. The phone number associated with this organization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the setupStep property value. Defines the supported Organization Setup Step values.
     * @return a {@link OrganizationTableRowSetupStep}
     */
    @jakarta.annotation.Nullable
    public OrganizationTableRowSetupStep getSetupStep() {
        return this.setupStep;
    }
    /**
     * Gets the status property value. Defines the supported Organization Status values.
     * @return a {@link OrganizationTableRowStatus}
     */
    @jakarta.annotation.Nullable
    public OrganizationTableRowStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the subscriptionCancelAt property value. Date and time when this Leadping organization table row was subscription cancel.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSubscriptionCancelAt() {
        return this.subscriptionCancelAt;
    }
    /**
     * Gets the subscriptionStatus property value. Defines the supported Subscription Status values.
     * @return a {@link OrganizationTableRowSubscriptionStatus}
     */
    @jakarta.annotation.Nullable
    public OrganizationTableRowSubscriptionStatus getSubscriptionStatus() {
        return this.subscriptionStatus;
    }
    /**
     * Gets the tenDlcStatus property value. Defines the supported 10DLC Application Status values.
     * @return a {@link OrganizationTableRowTenDlcStatus}
     */
    @jakarta.annotation.Nullable
    public OrganizationTableRowTenDlcStatus getTenDlcStatus() {
        return this.tenDlcStatus;
    }
    /**
     * Gets the userCount property value. The user count for this organization.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getUserCount() {
        return this.userCount;
    }
    /**
     * Gets the website property value. The website URL associated with this organization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebsite() {
        return this.website;
    }
    /**
     * Gets the websiteStatus property value. Defines the supported Website Lifecycle Status values.
     * @return a {@link OrganizationTableRowWebsiteStatus}
     */
    @jakarta.annotation.Nullable
    public OrganizationTableRowWebsiteStatus getWebsiteStatus() {
        return this.websiteStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("accountBalance", this.getAccountBalance());
        writer.writeEnumValue("activationStatus", this.getActivationStatus());
        writer.writeOffsetDateTimeValue("apiKeyExpiresAt", this.getApiKeyExpiresAt());
        writer.writeOffsetDateTimeValue("apiKeyFirstUsedAt", this.getApiKeyFirstUsedAt());
        writer.writeOffsetDateTimeValue("apiKeyIssuedAt", this.getApiKeyIssuedAt());
        writer.writeOffsetDateTimeValue("apiKeyLastUsedAt", this.getApiKeyLastUsedAt());
        writer.writeCollectionOfPrimitiveValues("apiKeyPermissions", this.getApiKeyPermissions());
        writer.writeStringValue("apiKeyPreview", this.getApiKeyPreview());
        writer.writeObjectValue("apiKeyTotalUses", this.getApiKeyTotalUses());
        writer.writeEnumValue("billingPlan", this.getBillingPlan());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("industry", this.getIndustry());
        writer.writeOffsetDateTimeValue("lastSubscriptionEventAt", this.getLastSubscriptionEventAt());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("needsAdminReview", this.getNeedsAdminReview());
        writer.writeObjectValue("organization", this.getOrganization());
        writer.writeOffsetDateTimeValue("paymentFailedAt", this.getPaymentFailedAt());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeEnumValue("setupStep", this.getSetupStep());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("subscriptionCancelAt", this.getSubscriptionCancelAt());
        writer.writeEnumValue("subscriptionStatus", this.getSubscriptionStatus());
        writer.writeEnumValue("tenDlcStatus", this.getTenDlcStatus());
        writer.writeObjectValue("userCount", this.getUserCount());
        writer.writeStringValue("website", this.getWebsite());
        writer.writeEnumValue("websiteStatus", this.getWebsiteStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountBalance property value. Account balance for this organization.
     * @param value Value to set for the accountBalance property.
     */
    public void setAccountBalance(@jakarta.annotation.Nullable final UntypedNode value) {
        this.accountBalance = value;
    }
    /**
     * Sets the activationStatus property value. Defines the supported Customer Activation Status values.
     * @param value Value to set for the activationStatus property.
     */
    public void setActivationStatus(@jakarta.annotation.Nullable final OrganizationTableRowActivationStatus value) {
        this.activationStatus = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the apiKeyExpiresAt property value. The date and time this organization API key expires, or null when it has no expiration.
     * @param value Value to set for the apiKeyExpiresAt property.
     */
    public void setApiKeyExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.apiKeyExpiresAt = value;
    }
    /**
     * Sets the apiKeyFirstUsedAt property value. The date and time this organization API key was first used.
     * @param value Value to set for the apiKeyFirstUsedAt property.
     */
    public void setApiKeyFirstUsedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.apiKeyFirstUsedAt = value;
    }
    /**
     * Sets the apiKeyIssuedAt property value. The date and time this organization API key was issued.
     * @param value Value to set for the apiKeyIssuedAt property.
     */
    public void setApiKeyIssuedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.apiKeyIssuedAt = value;
    }
    /**
     * Sets the apiKeyLastUsedAt property value. The date and time this organization API key was last used.
     * @param value Value to set for the apiKeyLastUsedAt property.
     */
    public void setApiKeyLastUsedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.apiKeyLastUsedAt = value;
    }
    /**
     * Sets the apiKeyPermissions property value. WorkOS permission slugs granted to this organization API key.
     * @param value Value to set for the apiKeyPermissions property.
     */
    public void setApiKeyPermissions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.apiKeyPermissions = value;
    }
    /**
     * Sets the apiKeyPreview property value. The masked API key preview owned by this organization.
     * @param value Value to set for the apiKeyPreview property.
     */
    public void setApiKeyPreview(@jakarta.annotation.Nullable final String value) {
        this.apiKeyPreview = value;
    }
    /**
     * Sets the apiKeyTotalUses property value. The total number of tracked uses for this organization API key.
     * @param value Value to set for the apiKeyTotalUses property.
     */
    public void setApiKeyTotalUses(@jakarta.annotation.Nullable final UntypedNode value) {
        this.apiKeyTotalUses = value;
    }
    /**
     * Sets the billingPlan property value. Defines the supported Billing Plan values.
     * @param value Value to set for the billingPlan property.
     */
    public void setBillingPlan(@jakarta.annotation.Nullable final OrganizationTableRowBillingPlan value) {
        this.billingPlan = value;
    }
    /**
     * Sets the enabled property value. Whether this organization is enabled.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this organization.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the industry property value. Industry for this organization.
     * @param value Value to set for the industry property.
     */
    public void setIndustry(@jakarta.annotation.Nullable final String value) {
        this.industry = value;
    }
    /**
     * Sets the lastSubscriptionEventAt property value. Date and time when this Leadping organization table row was last subscription event.
     * @param value Value to set for the lastSubscriptionEventAt property.
     */
    public void setLastSubscriptionEventAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSubscriptionEventAt = value;
    }
    /**
     * Sets the modifiedAt property value. UTC timestamp for modified at on this organization.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the name property value. The human-readable name shown for this organization.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the needsAdminReview property value. Whether needs admin review applies to this organization.
     * @param value Value to set for the needsAdminReview property.
     */
    public void setNeedsAdminReview(@jakarta.annotation.Nullable final Boolean value) {
        this.needsAdminReview = value;
    }
    /**
     * Sets the organization property value. Identifier and display name of the related organization.
     * @param value Value to set for the organization property.
     */
    public void setOrganization(@jakarta.annotation.Nullable final OrganizationTableRowOrganization value) {
        this.organization = value;
    }
    /**
     * Sets the paymentFailedAt property value. Date and time when this Leadping organization table row was payment failed.
     * @param value Value to set for the paymentFailedAt property.
     */
    public void setPaymentFailedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.paymentFailedAt = value;
    }
    /**
     * Sets the phone property value. The phone number associated with this organization.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the setupStep property value. Defines the supported Organization Setup Step values.
     * @param value Value to set for the setupStep property.
     */
    public void setSetupStep(@jakarta.annotation.Nullable final OrganizationTableRowSetupStep value) {
        this.setupStep = value;
    }
    /**
     * Sets the status property value. Defines the supported Organization Status values.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final OrganizationTableRowStatus value) {
        this.status = value;
    }
    /**
     * Sets the subscriptionCancelAt property value. Date and time when this Leadping organization table row was subscription cancel.
     * @param value Value to set for the subscriptionCancelAt property.
     */
    public void setSubscriptionCancelAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.subscriptionCancelAt = value;
    }
    /**
     * Sets the subscriptionStatus property value. Defines the supported Subscription Status values.
     * @param value Value to set for the subscriptionStatus property.
     */
    public void setSubscriptionStatus(@jakarta.annotation.Nullable final OrganizationTableRowSubscriptionStatus value) {
        this.subscriptionStatus = value;
    }
    /**
     * Sets the tenDlcStatus property value. Defines the supported 10DLC Application Status values.
     * @param value Value to set for the tenDlcStatus property.
     */
    public void setTenDlcStatus(@jakarta.annotation.Nullable final OrganizationTableRowTenDlcStatus value) {
        this.tenDlcStatus = value;
    }
    /**
     * Sets the userCount property value. The user count for this organization.
     * @param value Value to set for the userCount property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.userCount = value;
    }
    /**
     * Sets the website property value. The website URL associated with this organization.
     * @param value Value to set for the website property.
     */
    public void setWebsite(@jakarta.annotation.Nullable final String value) {
        this.website = value;
    }
    /**
     * Sets the websiteStatus property value. Defines the supported Website Lifecycle Status values.
     * @param value Value to set for the websiteStatus property.
     */
    public void setWebsiteStatus(@jakarta.annotation.Nullable final OrganizationTableRowWebsiteStatus value) {
        this.websiteStatus = value;
    }
}
