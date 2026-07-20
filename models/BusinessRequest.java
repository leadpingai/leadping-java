package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Request schema for the Leadping API business profile request, including the fields clients can send.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Postal address for the business, lead, or contact represented by this business profile request.
     */
    private BusinessRequestAddress address;
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
    private BusinessRequestBillingAddress billingAddress;
    /**
     * Name used for invoices, receipts, and payment processor billing records.
     */
    private String billingName;
    /**
     * Tax identifier printed on billing documents. This may differ from the business verification EIN.
     */
    private String billingTaxId;
    /**
     * Compliance policy configuration for the business.
     */
    private BusinessRequestCompliancePolicy compliancePolicy;
    /**
     * Human-readable description that explains this business profile request to API users.
     */
    private String description;
    /**
     * Employer Identification Number used for business and 10DLC verification.
     */
    private String ein;
    /**
     * Uploaded EIN document reference used for business verification.
     */
    private BusinessRequestEinDocument einDocument;
    /**
     * Indicates whether this business profile request is active and available in the Leadping API.
     */
    private Boolean enabled;
    /**
     * The unique identifier for the entity, when updating an existing entity.
     */
    private String id;
    /**
     * Indicates whether the business serves customers younger than 90, for compliance and underwriting context.
     */
    private Boolean isYoungerThan90;
    /**
     * The display name for the entity.
     */
    private String name;
    /**
     * Phone details for the lead, user, or business represented by this business profile request.
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
     * Defines the supported Business Status values.
     */
    private BusinessRequestStatus status;
    /**
     * Industry vertical used for lead routing, compliance review, and reporting.
     */
    private String vertical;
    /**
     * Business website URL used for compliance, brand review, and lead attribution.
     */
    private String website;
    /**
     * Instantiates a new {@link BusinessRequest} and sets the default values.
     */
    public BusinessRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessRequest}
     */
    @jakarta.annotation.Nonnull
    public static BusinessRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessRequest();
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
     * Gets the address property value. Postal address for the business, lead, or contact represented by this business profile request.
     * @return a {@link BusinessRequestAddress}
     */
    @jakarta.annotation.Nullable
    public BusinessRequestAddress getAddress() {
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
     * @return a {@link BusinessRequestBillingAddress}
     */
    @jakarta.annotation.Nullable
    public BusinessRequestBillingAddress getBillingAddress() {
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
     * Gets the billingTaxId property value. Tax identifier printed on billing documents. This may differ from the business verification EIN.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBillingTaxId() {
        return this.billingTaxId;
    }
    /**
     * Gets the compliancePolicy property value. Compliance policy configuration for the business.
     * @return a {@link BusinessRequestCompliancePolicy}
     */
    @jakarta.annotation.Nullable
    public BusinessRequestCompliancePolicy getCompliancePolicy() {
        return this.compliancePolicy;
    }
    /**
     * Gets the description property value. Human-readable description that explains this business profile request to API users.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
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
     * @return a {@link BusinessRequestEinDocument}
     */
    @jakarta.annotation.Nullable
    public BusinessRequestEinDocument getEinDocument() {
        return this.einDocument;
    }
    /**
     * Gets the enabled property value. Indicates whether this business profile request is active and available in the Leadping API.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(21);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(BusinessRequestAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("autoRefillAmount", (n) -> { this.setAutoRefillAmount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("autoRefillEnabled", (n) -> { this.setAutoRefillEnabled(n.getBooleanValue()); });
        deserializerMap.put("autoRefillTrigger", (n) -> { this.setAutoRefillTrigger(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("billingAddress", (n) -> { this.setBillingAddress(n.getObjectValue(BusinessRequestBillingAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("billingName", (n) -> { this.setBillingName(n.getStringValue()); });
        deserializerMap.put("billingTaxId", (n) -> { this.setBillingTaxId(n.getStringValue()); });
        deserializerMap.put("compliancePolicy", (n) -> { this.setCompliancePolicy(n.getObjectValue(BusinessRequestCompliancePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("ein", (n) -> { this.setEin(n.getStringValue()); });
        deserializerMap.put("einDocument", (n) -> { this.setEinDocument(n.getObjectValue(BusinessRequestEinDocument::createFromDiscriminatorValue)); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isYoungerThan90", (n) -> { this.setIsYoungerThan90(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("phones", (n) -> { this.setPhones(n.getCollectionOfObjectValues(IdNameValue::createFromDiscriminatorValue)); });
        deserializerMap.put("secondaryName", (n) -> { this.setSecondaryName(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(BusinessRequestStatus::forValue)); });
        deserializerMap.put("vertical", (n) -> { this.setVertical(n.getStringValue()); });
        deserializerMap.put("website", (n) -> { this.setWebsite(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique identifier for the entity, when updating an existing entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isYoungerThan90 property value. Indicates whether the business serves customers younger than 90, for compliance and underwriting context.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsYoungerThan90() {
        return this.isYoungerThan90;
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
     * Gets the phone property value. Phone details for the lead, user, or business represented by this business profile request.
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
     * Gets the status property value. Defines the supported Business Status values.
     * @return a {@link BusinessRequestStatus}
     */
    @jakarta.annotation.Nullable
    public BusinessRequestStatus getStatus() {
        return this.status;
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
        writer.writeObjectValue("address", this.getAddress());
        writer.writeObjectValue("autoRefillAmount", this.getAutoRefillAmount());
        writer.writeBooleanValue("autoRefillEnabled", this.getAutoRefillEnabled());
        writer.writeObjectValue("autoRefillTrigger", this.getAutoRefillTrigger());
        writer.writeObjectValue("billingAddress", this.getBillingAddress());
        writer.writeStringValue("billingName", this.getBillingName());
        writer.writeStringValue("billingTaxId", this.getBillingTaxId());
        writer.writeObjectValue("compliancePolicy", this.getCompliancePolicy());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("ein", this.getEin());
        writer.writeObjectValue("einDocument", this.getEinDocument());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isYoungerThan90", this.getIsYoungerThan90());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeCollectionOfObjectValues("phones", this.getPhones());
        writer.writeStringValue("secondaryName", this.getSecondaryName());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("vertical", this.getVertical());
        writer.writeStringValue("website", this.getWebsite());
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
     * Sets the address property value. Postal address for the business, lead, or contact represented by this business profile request.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final BusinessRequestAddress value) {
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
    public void setBillingAddress(@jakarta.annotation.Nullable final BusinessRequestBillingAddress value) {
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
     * Sets the billingTaxId property value. Tax identifier printed on billing documents. This may differ from the business verification EIN.
     * @param value Value to set for the billingTaxId property.
     */
    public void setBillingTaxId(@jakarta.annotation.Nullable final String value) {
        this.billingTaxId = value;
    }
    /**
     * Sets the compliancePolicy property value. Compliance policy configuration for the business.
     * @param value Value to set for the compliancePolicy property.
     */
    public void setCompliancePolicy(@jakarta.annotation.Nullable final BusinessRequestCompliancePolicy value) {
        this.compliancePolicy = value;
    }
    /**
     * Sets the description property value. Human-readable description that explains this business profile request to API users.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
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
    public void setEinDocument(@jakarta.annotation.Nullable final BusinessRequestEinDocument value) {
        this.einDocument = value;
    }
    /**
     * Sets the enabled property value. Indicates whether this business profile request is active and available in the Leadping API.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the id property value. The unique identifier for the entity, when updating an existing entity.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isYoungerThan90 property value. Indicates whether the business serves customers younger than 90, for compliance and underwriting context.
     * @param value Value to set for the isYoungerThan90 property.
     */
    public void setIsYoungerThan90(@jakarta.annotation.Nullable final Boolean value) {
        this.isYoungerThan90 = value;
    }
    /**
     * Sets the name property value. The display name for the entity.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the phone property value. Phone details for the lead, user, or business represented by this business profile request.
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
     * Sets the status property value. Defines the supported Business Status values.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final BusinessRequestStatus value) {
        this.status = value;
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
