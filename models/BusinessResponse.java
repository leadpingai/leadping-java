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
 * Response schema for the Leadping API business profile response returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessResponse implements AdditionalDataHolder, Parsable {
    /**
     * Current wallet balance available to the business.
     */
    private Double accountBalance;
    /**
     * Business activation state covering site, billing, compliance, and telephony readiness.
     */
    private BusinessResponseActivation activation;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Postal address for the business, lead, or contact represented by this business profile response.
     */
    private BusinessResponseAddress address;
    /**
     * Wallet refill amount charged when automatic refill is triggered.
     */
    private UntypedNode autoRefillAmount;
    /**
     * Indicates whether automatic wallet refill is enabled for the business.
     */
    private Boolean autoRefillEnabled;
    /**
     * Wallet balance threshold that triggers automatic refill.
     */
    private UntypedNode autoRefillTrigger;
    /**
     * Postal address used for invoices, receipts, and payment processor billing records.
     */
    private BusinessResponseBillingAddress billingAddress;
    /**
     * Name used for invoices, receipts, and payment processor billing records.
     */
    private String billingName;
    /**
     * Defines the supported Billing Plan values.
     */
    private BusinessResponseBillingPlan billingPlan;
    /**
     * Customer-safe billing state for this business.
     */
    private BusinessResponseBillingState billingState;
    /**
     * Compliance policy configuration for the business.
     */
    private BusinessResponseCompliancePolicy compliancePolicy;
    /**
     * The date and time when the entity was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Human-readable description that explains this business profile response to API users.
     */
    private String description;
    /**
     * Domain name connected to the business website or activation workflow.
     */
    private String domain;
    /**
     * Employer Identification Number used for business and 10DLC verification.
     */
    private String ein;
    /**
     * Uploaded EIN document reference used for business verification.
     */
    private BusinessResponseEinDocument einDocument;
    /**
     * Indicates whether this business profile response is active and available in the Leadping API.
     */
    private Boolean enabled;
    /**
     * The unique identifier for the entity.
     */
    private String id;
    /**
     * The date and time when the entity was last modified, if applicable.
     */
    private OffsetDateTime modifiedAt;
    /**
     * The display name for the entity.
     */
    private String name;
    /**
     * Phone details for the lead, user, or business represented by this business profile response.
     */
    private String phone;
    /**
     * Phone numbers assigned to this business.
     */
    private java.util.List<IdNameValue> phones;
    /**
     * Alternate business name or DBA shown in Leadping.
     */
    private String secondaryName;
    /**
     * Defines the supported User Setup Status values.
     */
    private BusinessResponseSetupStatus setupStatus;
    /**
     * Defines the supported Business Setup Step values.
     */
    private BusinessResponseSetupStep setupStep;
    /**
     * Leadping website record connected to this business.
     */
    private BusinessResponseSite site;
    /**
     * Defines the supported Business Status values.
     */
    private BusinessResponseStatus status;
    /**
     * Defines the supported Subscription Status values.
     */
    private BusinessResponseSubscriptionStatus subscriptionStatus;
    /**
     * User summary connected to this business profile response.
     */
    private BusinessResponseUser user;
    /**
     * Industry vertical used for lead routing, compliance review, and reporting.
     */
    private String vertical;
    /**
     * Business website URL used for compliance, brand review, and lead attribution.
     */
    private String website;
    /**
     * Instantiates a new {@link BusinessResponse} and sets the default values.
     */
    public BusinessResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessResponse}
     */
    @jakarta.annotation.Nonnull
    public static BusinessResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessResponse();
    }
    /**
     * Gets the accountBalance property value. Current wallet balance available to the business.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAccountBalance() {
        return this.accountBalance;
    }
    /**
     * Gets the activation property value. Business activation state covering site, billing, compliance, and telephony readiness.
     * @return a {@link BusinessResponseActivation}
     */
    @jakarta.annotation.Nullable
    public BusinessResponseActivation getActivation() {
        return this.activation;
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
     * Gets the address property value. Postal address for the business, lead, or contact represented by this business profile response.
     * @return a {@link BusinessResponseAddress}
     */
    @jakarta.annotation.Nullable
    public BusinessResponseAddress getAddress() {
        return this.address;
    }
    /**
     * Gets the autoRefillAmount property value. Wallet refill amount charged when automatic refill is triggered.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAutoRefillAmount() {
        return this.autoRefillAmount;
    }
    /**
     * Gets the autoRefillEnabled property value. Indicates whether automatic wallet refill is enabled for the business.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoRefillEnabled() {
        return this.autoRefillEnabled;
    }
    /**
     * Gets the autoRefillTrigger property value. Wallet balance threshold that triggers automatic refill.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAutoRefillTrigger() {
        return this.autoRefillTrigger;
    }
    /**
     * Gets the billingAddress property value. Postal address used for invoices, receipts, and payment processor billing records.
     * @return a {@link BusinessResponseBillingAddress}
     */
    @jakarta.annotation.Nullable
    public BusinessResponseBillingAddress getBillingAddress() {
        return this.billingAddress;
    }
    /**
     * Gets the billingName property value. Name used for invoices, receipts, and payment processor billing records.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBillingName() {
        return this.billingName;
    }
    /**
     * Gets the billingPlan property value. Defines the supported Billing Plan values.
     * @return a {@link BusinessResponseBillingPlan}
     */
    @jakarta.annotation.Nullable
    public BusinessResponseBillingPlan getBillingPlan() {
        return this.billingPlan;
    }
    /**
     * Gets the billingState property value. Customer-safe billing state for this business.
     * @return a {@link BusinessResponseBillingState}
     */
    @jakarta.annotation.Nullable
    public BusinessResponseBillingState getBillingState() {
        return this.billingState;
    }
    /**
     * Gets the compliancePolicy property value. Compliance policy configuration for the business.
     * @return a {@link BusinessResponseCompliancePolicy}
     */
    @jakarta.annotation.Nullable
    public BusinessResponseCompliancePolicy getCompliancePolicy() {
        return this.compliancePolicy;
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
     * Gets the description property value. Human-readable description that explains this business profile response to API users.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the domain property value. Domain name connected to the business website or activation workflow.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomain() {
        return this.domain;
    }
    /**
     * Gets the ein property value. Employer Identification Number used for business and 10DLC verification.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEin() {
        return this.ein;
    }
    /**
     * Gets the einDocument property value. Uploaded EIN document reference used for business verification.
     * @return a {@link BusinessResponseEinDocument}
     */
    @jakarta.annotation.Nullable
    public BusinessResponseEinDocument getEinDocument() {
        return this.einDocument;
    }
    /**
     * Gets the enabled property value. Indicates whether this business profile response is active and available in the Leadping API.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(31);
        deserializerMap.put("accountBalance", (n) -> { this.setAccountBalance(n.getDoubleValue()); });
        deserializerMap.put("activation", (n) -> { this.setActivation(n.getObjectValue(BusinessResponseActivation::createFromDiscriminatorValue)); });
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(BusinessResponseAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("autoRefillAmount", (n) -> { this.setAutoRefillAmount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("autoRefillEnabled", (n) -> { this.setAutoRefillEnabled(n.getBooleanValue()); });
        deserializerMap.put("autoRefillTrigger", (n) -> { this.setAutoRefillTrigger(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("billingAddress", (n) -> { this.setBillingAddress(n.getObjectValue(BusinessResponseBillingAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("billingName", (n) -> { this.setBillingName(n.getStringValue()); });
        deserializerMap.put("billingPlan", (n) -> { this.setBillingPlan(n.getEnumValue(BusinessResponseBillingPlan::forValue)); });
        deserializerMap.put("billingState", (n) -> { this.setBillingState(n.getObjectValue(BusinessResponseBillingState::createFromDiscriminatorValue)); });
        deserializerMap.put("compliancePolicy", (n) -> { this.setCompliancePolicy(n.getObjectValue(BusinessResponseCompliancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("domain", (n) -> { this.setDomain(n.getStringValue()); });
        deserializerMap.put("ein", (n) -> { this.setEin(n.getStringValue()); });
        deserializerMap.put("einDocument", (n) -> { this.setEinDocument(n.getObjectValue(BusinessResponseEinDocument::createFromDiscriminatorValue)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("phones", (n) -> { this.setPhones(n.getCollectionOfObjectValues(IdNameValue::createFromDiscriminatorValue)); });
        deserializerMap.put("secondaryName", (n) -> { this.setSecondaryName(n.getStringValue()); });
        deserializerMap.put("setupStatus", (n) -> { this.setSetupStatus(n.getEnumValue(BusinessResponseSetupStatus::forValue)); });
        deserializerMap.put("setupStep", (n) -> { this.setSetupStep(n.getEnumValue(BusinessResponseSetupStep::forValue)); });
        deserializerMap.put("site", (n) -> { this.setSite(n.getObjectValue(BusinessResponseSite::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(BusinessResponseStatus::forValue)); });
        deserializerMap.put("subscriptionStatus", (n) -> { this.setSubscriptionStatus(n.getEnumValue(BusinessResponseSubscriptionStatus::forValue)); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(BusinessResponseUser::createFromDiscriminatorValue)); });
        deserializerMap.put("vertical", (n) -> { this.setVertical(n.getStringValue()); });
        deserializerMap.put("website", (n) -> { this.setWebsite(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the phone property value. Phone details for the lead, user, or business represented by this business profile response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the phones property value. Phone numbers assigned to this business.
     * @return a {@link java.util.List<IdNameValue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdNameValue> getPhones() {
        return this.phones;
    }
    /**
     * Gets the secondaryName property value. Alternate business name or DBA shown in Leadping.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecondaryName() {
        return this.secondaryName;
    }
    /**
     * Gets the setupStatus property value. Defines the supported User Setup Status values.
     * @return a {@link BusinessResponseSetupStatus}
     */
    @jakarta.annotation.Nullable
    public BusinessResponseSetupStatus getSetupStatus() {
        return this.setupStatus;
    }
    /**
     * Gets the setupStep property value. Defines the supported Business Setup Step values.
     * @return a {@link BusinessResponseSetupStep}
     */
    @jakarta.annotation.Nullable
    public BusinessResponseSetupStep getSetupStep() {
        return this.setupStep;
    }
    /**
     * Gets the site property value. Leadping website record connected to this business.
     * @return a {@link BusinessResponseSite}
     */
    @jakarta.annotation.Nullable
    public BusinessResponseSite getSite() {
        return this.site;
    }
    /**
     * Gets the status property value. Defines the supported Business Status values.
     * @return a {@link BusinessResponseStatus}
     */
    @jakarta.annotation.Nullable
    public BusinessResponseStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the subscriptionStatus property value. Defines the supported Subscription Status values.
     * @return a {@link BusinessResponseSubscriptionStatus}
     */
    @jakarta.annotation.Nullable
    public BusinessResponseSubscriptionStatus getSubscriptionStatus() {
        return this.subscriptionStatus;
    }
    /**
     * Gets the user property value. User summary connected to this business profile response.
     * @return a {@link BusinessResponseUser}
     */
    @jakarta.annotation.Nullable
    public BusinessResponseUser getUser() {
        return this.user;
    }
    /**
     * Gets the vertical property value. Industry vertical used for lead routing, compliance review, and reporting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVertical() {
        return this.vertical;
    }
    /**
     * Gets the website property value. Business website URL used for compliance, brand review, and lead attribution.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebsite() {
        return this.website;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("accountBalance", this.getAccountBalance());
        writer.writeObjectValue("activation", this.getActivation());
        writer.writeObjectValue("address", this.getAddress());
        writer.writeObjectValue("autoRefillAmount", this.getAutoRefillAmount());
        writer.writeBooleanValue("autoRefillEnabled", this.getAutoRefillEnabled());
        writer.writeObjectValue("autoRefillTrigger", this.getAutoRefillTrigger());
        writer.writeObjectValue("billingAddress", this.getBillingAddress());
        writer.writeStringValue("billingName", this.getBillingName());
        writer.writeEnumValue("billingPlan", this.getBillingPlan());
        writer.writeObjectValue("billingState", this.getBillingState());
        writer.writeObjectValue("compliancePolicy", this.getCompliancePolicy());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("domain", this.getDomain());
        writer.writeStringValue("ein", this.getEin());
        writer.writeObjectValue("einDocument", this.getEinDocument());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeCollectionOfObjectValues("phones", this.getPhones());
        writer.writeStringValue("secondaryName", this.getSecondaryName());
        writer.writeEnumValue("setupStatus", this.getSetupStatus());
        writer.writeEnumValue("setupStep", this.getSetupStep());
        writer.writeObjectValue("site", this.getSite());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeEnumValue("subscriptionStatus", this.getSubscriptionStatus());
        writer.writeObjectValue("user", this.getUser());
        writer.writeStringValue("vertical", this.getVertical());
        writer.writeStringValue("website", this.getWebsite());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accountBalance property value. Current wallet balance available to the business.
     * @param value Value to set for the accountBalance property.
     */
    public void setAccountBalance(@jakarta.annotation.Nullable final Double value) {
        this.accountBalance = value;
    }
    /**
     * Sets the activation property value. Business activation state covering site, billing, compliance, and telephony readiness.
     * @param value Value to set for the activation property.
     */
    public void setActivation(@jakarta.annotation.Nullable final BusinessResponseActivation value) {
        this.activation = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the address property value. Postal address for the business, lead, or contact represented by this business profile response.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final BusinessResponseAddress value) {
        this.address = value;
    }
    /**
     * Sets the autoRefillAmount property value. Wallet refill amount charged when automatic refill is triggered.
     * @param value Value to set for the autoRefillAmount property.
     */
    public void setAutoRefillAmount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.autoRefillAmount = value;
    }
    /**
     * Sets the autoRefillEnabled property value. Indicates whether automatic wallet refill is enabled for the business.
     * @param value Value to set for the autoRefillEnabled property.
     */
    public void setAutoRefillEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.autoRefillEnabled = value;
    }
    /**
     * Sets the autoRefillTrigger property value. Wallet balance threshold that triggers automatic refill.
     * @param value Value to set for the autoRefillTrigger property.
     */
    public void setAutoRefillTrigger(@jakarta.annotation.Nullable final UntypedNode value) {
        this.autoRefillTrigger = value;
    }
    /**
     * Sets the billingAddress property value. Postal address used for invoices, receipts, and payment processor billing records.
     * @param value Value to set for the billingAddress property.
     */
    public void setBillingAddress(@jakarta.annotation.Nullable final BusinessResponseBillingAddress value) {
        this.billingAddress = value;
    }
    /**
     * Sets the billingName property value. Name used for invoices, receipts, and payment processor billing records.
     * @param value Value to set for the billingName property.
     */
    public void setBillingName(@jakarta.annotation.Nullable final String value) {
        this.billingName = value;
    }
    /**
     * Sets the billingPlan property value. Defines the supported Billing Plan values.
     * @param value Value to set for the billingPlan property.
     */
    public void setBillingPlan(@jakarta.annotation.Nullable final BusinessResponseBillingPlan value) {
        this.billingPlan = value;
    }
    /**
     * Sets the billingState property value. Customer-safe billing state for this business.
     * @param value Value to set for the billingState property.
     */
    public void setBillingState(@jakarta.annotation.Nullable final BusinessResponseBillingState value) {
        this.billingState = value;
    }
    /**
     * Sets the compliancePolicy property value. Compliance policy configuration for the business.
     * @param value Value to set for the compliancePolicy property.
     */
    public void setCompliancePolicy(@jakarta.annotation.Nullable final BusinessResponseCompliancePolicy value) {
        this.compliancePolicy = value;
    }
    /**
     * Sets the createdAt property value. The date and time when the entity was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the description property value. Human-readable description that explains this business profile response to API users.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the domain property value. Domain name connected to the business website or activation workflow.
     * @param value Value to set for the domain property.
     */
    public void setDomain(@jakarta.annotation.Nullable final String value) {
        this.domain = value;
    }
    /**
     * Sets the ein property value. Employer Identification Number used for business and 10DLC verification.
     * @param value Value to set for the ein property.
     */
    public void setEin(@jakarta.annotation.Nullable final String value) {
        this.ein = value;
    }
    /**
     * Sets the einDocument property value. Uploaded EIN document reference used for business verification.
     * @param value Value to set for the einDocument property.
     */
    public void setEinDocument(@jakarta.annotation.Nullable final BusinessResponseEinDocument value) {
        this.einDocument = value;
    }
    /**
     * Sets the enabled property value. Indicates whether this business profile response is active and available in the Leadping API.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the id property value. The unique identifier for the entity.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
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
     * Sets the phone property value. Phone details for the lead, user, or business represented by this business profile response.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the phones property value. Phone numbers assigned to this business.
     * @param value Value to set for the phones property.
     */
    public void setPhones(@jakarta.annotation.Nullable final java.util.List<IdNameValue> value) {
        this.phones = value;
    }
    /**
     * Sets the secondaryName property value. Alternate business name or DBA shown in Leadping.
     * @param value Value to set for the secondaryName property.
     */
    public void setSecondaryName(@jakarta.annotation.Nullable final String value) {
        this.secondaryName = value;
    }
    /**
     * Sets the setupStatus property value. Defines the supported User Setup Status values.
     * @param value Value to set for the setupStatus property.
     */
    public void setSetupStatus(@jakarta.annotation.Nullable final BusinessResponseSetupStatus value) {
        this.setupStatus = value;
    }
    /**
     * Sets the setupStep property value. Defines the supported Business Setup Step values.
     * @param value Value to set for the setupStep property.
     */
    public void setSetupStep(@jakarta.annotation.Nullable final BusinessResponseSetupStep value) {
        this.setupStep = value;
    }
    /**
     * Sets the site property value. Leadping website record connected to this business.
     * @param value Value to set for the site property.
     */
    public void setSite(@jakarta.annotation.Nullable final BusinessResponseSite value) {
        this.site = value;
    }
    /**
     * Sets the status property value. Defines the supported Business Status values.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final BusinessResponseStatus value) {
        this.status = value;
    }
    /**
     * Sets the subscriptionStatus property value. Defines the supported Subscription Status values.
     * @param value Value to set for the subscriptionStatus property.
     */
    public void setSubscriptionStatus(@jakarta.annotation.Nullable final BusinessResponseSubscriptionStatus value) {
        this.subscriptionStatus = value;
    }
    /**
     * Sets the user property value. User summary connected to this business profile response.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final BusinessResponseUser value) {
        this.user = value;
    }
    /**
     * Sets the vertical property value. Industry vertical used for lead routing, compliance review, and reporting.
     * @param value Value to set for the vertical property.
     */
    public void setVertical(@jakarta.annotation.Nullable final String value) {
        this.vertical = value;
    }
    /**
     * Sets the website property value. Business website URL used for compliance, brand review, and lead attribution.
     * @param value Value to set for the website property.
     */
    public void setWebsite(@jakarta.annotation.Nullable final String value) {
        this.website = value;
    }
}
