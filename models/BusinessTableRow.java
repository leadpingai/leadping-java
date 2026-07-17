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
 * API DTO containing business data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessTableRow implements AdditionalDataHolder, Parsable {
    /**
     * The account balance value for this business.
     */
    private UntypedNode accountBalance;
    /**
     * Defines the supported Customer Activation Status values.
     */
    private BusinessTableRowActivationStatus activationStatus;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time this business API key expires, or null when it has no expiration.
     */
    private OffsetDateTime apiKeyExpiresAt;
    /**
     * The date and time this business API key was first used.
     */
    private OffsetDateTime apiKeyFirstUsedAt;
    /**
     * The date and time this business API key was issued.
     */
    private OffsetDateTime apiKeyIssuedAt;
    /**
     * The date and time this business API key was last used.
     */
    private OffsetDateTime apiKeyLastUsedAt;
    /**
     * The masked API key preview owned by this business.
     */
    private String apiKeyPreview;
    /**
     * The total number of tracked uses for this business API key.
     */
    private Long apiKeyTotalUses;
    /**
     * Defines the supported Billing Plan values.
     */
    private BusinessTableRowBillingPlan billingPlan;
    /**
     * The ID and name for this business.
     */
    private BusinessTableRowBusiness business;
    /**
     * Whether this business is enabled.
     */
    private Boolean enabled;
    /**
     * The unique ID for this business.
     */
    private String id;
    /**
     * The industry value for this business.
     */
    private String industry;
    /**
     * Date and time when this Leadping business table row was last subscription event.
     */
    private OffsetDateTime lastSubscriptionEventAt;
    /**
     * The date and time for the modified at value on this business.
     */
    private OffsetDateTime modifiedAt;
    /**
     * The human-readable name shown for this business.
     */
    private String name;
    /**
     * Whether needs admin review applies to this business.
     */
    private Boolean needsAdminReview;
    /**
     * Date and time when this Leadping business table row was payment failed.
     */
    private OffsetDateTime paymentFailedAt;
    /**
     * The phone number associated with this business.
     */
    private String phone;
    /**
     * Defines the supported Business Setup Step values.
     */
    private BusinessTableRowSetupStep setupStep;
    /**
     * Defines the supported Business Status values.
     */
    private BusinessTableRowStatus status;
    /**
     * Date and time when this Leadping business table row was subscription cancel.
     */
    private OffsetDateTime subscriptionCancelAt;
    /**
     * Defines the supported Subscription Status values.
     */
    private BusinessTableRowSubscriptionStatus subscriptionStatus;
    /**
     * Defines the supported 10DLC Application Status values.
     */
    private BusinessTableRowTenDlcStatus tenDlcStatus;
    /**
     * The user count for this business.
     */
    private Integer userCount;
    /**
     * The website URL associated with this business.
     */
    private String website;
    /**
     * Defines the supported Website Lifecycle Status values.
     */
    private BusinessTableRowWebsiteStatus websiteStatus;
    /**
     * Instantiates a new {@link BusinessTableRow} and sets the default values.
     */
    public BusinessTableRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessTableRow}
     */
    @jakarta.annotation.Nonnull
    public static BusinessTableRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessTableRow();
    }
    /**
     * Gets the accountBalance property value. The account balance value for this business.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAccountBalance() {
        return this.accountBalance;
    }
    /**
     * Gets the activationStatus property value. Defines the supported Customer Activation Status values.
     * @return a {@link BusinessTableRowActivationStatus}
     */
    @jakarta.annotation.Nullable
    public BusinessTableRowActivationStatus getActivationStatus() {
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
     * Gets the apiKeyExpiresAt property value. The date and time this business API key expires, or null when it has no expiration.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getApiKeyExpiresAt() {
        return this.apiKeyExpiresAt;
    }
    /**
     * Gets the apiKeyFirstUsedAt property value. The date and time this business API key was first used.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getApiKeyFirstUsedAt() {
        return this.apiKeyFirstUsedAt;
    }
    /**
     * Gets the apiKeyIssuedAt property value. The date and time this business API key was issued.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getApiKeyIssuedAt() {
        return this.apiKeyIssuedAt;
    }
    /**
     * Gets the apiKeyLastUsedAt property value. The date and time this business API key was last used.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getApiKeyLastUsedAt() {
        return this.apiKeyLastUsedAt;
    }
    /**
     * Gets the apiKeyPreview property value. The masked API key preview owned by this business.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApiKeyPreview() {
        return this.apiKeyPreview;
    }
    /**
     * Gets the apiKeyTotalUses property value. The total number of tracked uses for this business API key.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getApiKeyTotalUses() {
        return this.apiKeyTotalUses;
    }
    /**
     * Gets the billingPlan property value. Defines the supported Billing Plan values.
     * @return a {@link BusinessTableRowBillingPlan}
     */
    @jakarta.annotation.Nullable
    public BusinessTableRowBillingPlan getBillingPlan() {
        return this.billingPlan;
    }
    /**
     * Gets the business property value. The ID and name for this business.
     * @return a {@link BusinessTableRowBusiness}
     */
    @jakarta.annotation.Nullable
    public BusinessTableRowBusiness getBusiness() {
        return this.business;
    }
    /**
     * Gets the enabled property value. Whether this business is enabled.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(27);
        deserializerMap.put("accountBalance", (n) -> { this.setAccountBalance(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("activationStatus", (n) -> { this.setActivationStatus(n.getEnumValue(BusinessTableRowActivationStatus::forValue)); });
        deserializerMap.put("apiKeyExpiresAt", (n) -> { this.setApiKeyExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("apiKeyFirstUsedAt", (n) -> { this.setApiKeyFirstUsedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("apiKeyIssuedAt", (n) -> { this.setApiKeyIssuedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("apiKeyLastUsedAt", (n) -> { this.setApiKeyLastUsedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("apiKeyPreview", (n) -> { this.setApiKeyPreview(n.getStringValue()); });
        deserializerMap.put("apiKeyTotalUses", (n) -> { this.setApiKeyTotalUses(n.getLongValue()); });
        deserializerMap.put("billingPlan", (n) -> { this.setBillingPlan(n.getEnumValue(BusinessTableRowBillingPlan::forValue)); });
        deserializerMap.put("business", (n) -> { this.setBusiness(n.getObjectValue(BusinessTableRowBusiness::createFromDiscriminatorValue)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("industry", (n) -> { this.setIndustry(n.getStringValue()); });
        deserializerMap.put("lastSubscriptionEventAt", (n) -> { this.setLastSubscriptionEventAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("needsAdminReview", (n) -> { this.setNeedsAdminReview(n.getBooleanValue()); });
        deserializerMap.put("paymentFailedAt", (n) -> { this.setPaymentFailedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("setupStep", (n) -> { this.setSetupStep(n.getEnumValue(BusinessTableRowSetupStep::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(BusinessTableRowStatus::forValue)); });
        deserializerMap.put("subscriptionCancelAt", (n) -> { this.setSubscriptionCancelAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("subscriptionStatus", (n) -> { this.setSubscriptionStatus(n.getEnumValue(BusinessTableRowSubscriptionStatus::forValue)); });
        deserializerMap.put("tenDlcStatus", (n) -> { this.setTenDlcStatus(n.getEnumValue(BusinessTableRowTenDlcStatus::forValue)); });
        deserializerMap.put("userCount", (n) -> { this.setUserCount(n.getIntegerValue()); });
        deserializerMap.put("website", (n) -> { this.setWebsite(n.getStringValue()); });
        deserializerMap.put("websiteStatus", (n) -> { this.setWebsiteStatus(n.getEnumValue(BusinessTableRowWebsiteStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique ID for this business.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the industry property value. The industry value for this business.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIndustry() {
        return this.industry;
    }
    /**
     * Gets the lastSubscriptionEventAt property value. Date and time when this Leadping business table row was last subscription event.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSubscriptionEventAt() {
        return this.lastSubscriptionEventAt;
    }
    /**
     * Gets the modifiedAt property value. The date and time for the modified at value on this business.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the name property value. The human-readable name shown for this business.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the needsAdminReview property value. Whether needs admin review applies to this business.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNeedsAdminReview() {
        return this.needsAdminReview;
    }
    /**
     * Gets the paymentFailedAt property value. Date and time when this Leadping business table row was payment failed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPaymentFailedAt() {
        return this.paymentFailedAt;
    }
    /**
     * Gets the phone property value. The phone number associated with this business.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the setupStep property value. Defines the supported Business Setup Step values.
     * @return a {@link BusinessTableRowSetupStep}
     */
    @jakarta.annotation.Nullable
    public BusinessTableRowSetupStep getSetupStep() {
        return this.setupStep;
    }
    /**
     * Gets the status property value. Defines the supported Business Status values.
     * @return a {@link BusinessTableRowStatus}
     */
    @jakarta.annotation.Nullable
    public BusinessTableRowStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the subscriptionCancelAt property value. Date and time when this Leadping business table row was subscription cancel.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSubscriptionCancelAt() {
        return this.subscriptionCancelAt;
    }
    /**
     * Gets the subscriptionStatus property value. Defines the supported Subscription Status values.
     * @return a {@link BusinessTableRowSubscriptionStatus}
     */
    @jakarta.annotation.Nullable
    public BusinessTableRowSubscriptionStatus getSubscriptionStatus() {
        return this.subscriptionStatus;
    }
    /**
     * Gets the tenDlcStatus property value. Defines the supported 10DLC Application Status values.
     * @return a {@link BusinessTableRowTenDlcStatus}
     */
    @jakarta.annotation.Nullable
    public BusinessTableRowTenDlcStatus getTenDlcStatus() {
        return this.tenDlcStatus;
    }
    /**
     * Gets the userCount property value. The user count for this business.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUserCount() {
        return this.userCount;
    }
    /**
     * Gets the website property value. The website URL associated with this business.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebsite() {
        return this.website;
    }
    /**
     * Gets the websiteStatus property value. Defines the supported Website Lifecycle Status values.
     * @return a {@link BusinessTableRowWebsiteStatus}
     */
    @jakarta.annotation.Nullable
    public BusinessTableRowWebsiteStatus getWebsiteStatus() {
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
        writer.writeStringValue("apiKeyPreview", this.getApiKeyPreview());
        writer.writeLongValue("apiKeyTotalUses", this.getApiKeyTotalUses());
        writer.writeEnumValue("billingPlan", this.getBillingPlan());
        writer.writeObjectValue("business", this.getBusiness());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("industry", this.getIndustry());
        writer.writeOffsetDateTimeValue("lastSubscriptionEventAt", this.getLastSubscriptionEventAt());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("needsAdminReview", this.getNeedsAdminReview());
        writer.writeOffsetDateTimeValue("paymentFailedAt", this.getPaymentFailedAt());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeEnumValue("setupStep", this.getSetupStep());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("subscriptionCancelAt", this.getSubscriptionCancelAt());
        writer.writeEnumValue("subscriptionStatus", this.getSubscriptionStatus());
        writer.writeEnumValue("tenDlcStatus", this.getTenDlcStatus());
        writer.writeIntegerValue("userCount", this.getUserCount());
        writer.writeStringValue("website", this.getWebsite());
        writer.writeEnumValue("websiteStatus", this.getWebsiteStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountBalance property value. The account balance value for this business.
     * @param value Value to set for the accountBalance property.
     */
    public void setAccountBalance(@jakarta.annotation.Nullable final UntypedNode value) {
        this.accountBalance = value;
    }
    /**
     * Sets the activationStatus property value. Defines the supported Customer Activation Status values.
     * @param value Value to set for the activationStatus property.
     */
    public void setActivationStatus(@jakarta.annotation.Nullable final BusinessTableRowActivationStatus value) {
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
     * Sets the apiKeyExpiresAt property value. The date and time this business API key expires, or null when it has no expiration.
     * @param value Value to set for the apiKeyExpiresAt property.
     */
    public void setApiKeyExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.apiKeyExpiresAt = value;
    }
    /**
     * Sets the apiKeyFirstUsedAt property value. The date and time this business API key was first used.
     * @param value Value to set for the apiKeyFirstUsedAt property.
     */
    public void setApiKeyFirstUsedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.apiKeyFirstUsedAt = value;
    }
    /**
     * Sets the apiKeyIssuedAt property value. The date and time this business API key was issued.
     * @param value Value to set for the apiKeyIssuedAt property.
     */
    public void setApiKeyIssuedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.apiKeyIssuedAt = value;
    }
    /**
     * Sets the apiKeyLastUsedAt property value. The date and time this business API key was last used.
     * @param value Value to set for the apiKeyLastUsedAt property.
     */
    public void setApiKeyLastUsedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.apiKeyLastUsedAt = value;
    }
    /**
     * Sets the apiKeyPreview property value. The masked API key preview owned by this business.
     * @param value Value to set for the apiKeyPreview property.
     */
    public void setApiKeyPreview(@jakarta.annotation.Nullable final String value) {
        this.apiKeyPreview = value;
    }
    /**
     * Sets the apiKeyTotalUses property value. The total number of tracked uses for this business API key.
     * @param value Value to set for the apiKeyTotalUses property.
     */
    public void setApiKeyTotalUses(@jakarta.annotation.Nullable final Long value) {
        this.apiKeyTotalUses = value;
    }
    /**
     * Sets the billingPlan property value. Defines the supported Billing Plan values.
     * @param value Value to set for the billingPlan property.
     */
    public void setBillingPlan(@jakarta.annotation.Nullable final BusinessTableRowBillingPlan value) {
        this.billingPlan = value;
    }
    /**
     * Sets the business property value. The ID and name for this business.
     * @param value Value to set for the business property.
     */
    public void setBusiness(@jakarta.annotation.Nullable final BusinessTableRowBusiness value) {
        this.business = value;
    }
    /**
     * Sets the enabled property value. Whether this business is enabled.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the id property value. The unique ID for this business.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the industry property value. The industry value for this business.
     * @param value Value to set for the industry property.
     */
    public void setIndustry(@jakarta.annotation.Nullable final String value) {
        this.industry = value;
    }
    /**
     * Sets the lastSubscriptionEventAt property value. Date and time when this Leadping business table row was last subscription event.
     * @param value Value to set for the lastSubscriptionEventAt property.
     */
    public void setLastSubscriptionEventAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSubscriptionEventAt = value;
    }
    /**
     * Sets the modifiedAt property value. The date and time for the modified at value on this business.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the name property value. The human-readable name shown for this business.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the needsAdminReview property value. Whether needs admin review applies to this business.
     * @param value Value to set for the needsAdminReview property.
     */
    public void setNeedsAdminReview(@jakarta.annotation.Nullable final Boolean value) {
        this.needsAdminReview = value;
    }
    /**
     * Sets the paymentFailedAt property value. Date and time when this Leadping business table row was payment failed.
     * @param value Value to set for the paymentFailedAt property.
     */
    public void setPaymentFailedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.paymentFailedAt = value;
    }
    /**
     * Sets the phone property value. The phone number associated with this business.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the setupStep property value. Defines the supported Business Setup Step values.
     * @param value Value to set for the setupStep property.
     */
    public void setSetupStep(@jakarta.annotation.Nullable final BusinessTableRowSetupStep value) {
        this.setupStep = value;
    }
    /**
     * Sets the status property value. Defines the supported Business Status values.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final BusinessTableRowStatus value) {
        this.status = value;
    }
    /**
     * Sets the subscriptionCancelAt property value. Date and time when this Leadping business table row was subscription cancel.
     * @param value Value to set for the subscriptionCancelAt property.
     */
    public void setSubscriptionCancelAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.subscriptionCancelAt = value;
    }
    /**
     * Sets the subscriptionStatus property value. Defines the supported Subscription Status values.
     * @param value Value to set for the subscriptionStatus property.
     */
    public void setSubscriptionStatus(@jakarta.annotation.Nullable final BusinessTableRowSubscriptionStatus value) {
        this.subscriptionStatus = value;
    }
    /**
     * Sets the tenDlcStatus property value. Defines the supported 10DLC Application Status values.
     * @param value Value to set for the tenDlcStatus property.
     */
    public void setTenDlcStatus(@jakarta.annotation.Nullable final BusinessTableRowTenDlcStatus value) {
        this.tenDlcStatus = value;
    }
    /**
     * Sets the userCount property value. The user count for this business.
     * @param value Value to set for the userCount property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.userCount = value;
    }
    /**
     * Sets the website property value. The website URL associated with this business.
     * @param value Value to set for the website property.
     */
    public void setWebsite(@jakarta.annotation.Nullable final String value) {
        this.website = value;
    }
    /**
     * Sets the websiteStatus property value. Defines the supported Website Lifecycle Status values.
     * @param value Value to set for the websiteStatus property.
     */
    public void setWebsiteStatus(@jakarta.annotation.Nullable final BusinessTableRowWebsiteStatus value) {
        this.websiteStatus = value;
    }
}
