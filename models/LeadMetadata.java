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
 * Public Leadping API schema for lead attribution metadata data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadMetadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Phone number ID assigned to the lead, business, or source.
     */
    private String assignedPhoneNumberId;
    /**
     * Business ID that owns this lead&apos;s attribution metadata.
     */
    private String businessId;
    /**
     * Reason Leadping blocked this operation for compliance.
     */
    private String complianceBlockedReason;
    /**
     * Compliance status used to decide whether Leadping can send messages.
     */
    private String complianceStatus;
    /**
     * UTC timestamp when this lead attribution metadata was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Direct-post price supplied by the lead source during intake.
     */
    private UntypedNode directPostPrice;
    /**
     * External system identifier used to reconcile this lead attribution metadata across integrations.
     */
    private String externalId;
    /**
     * Bulk import batch ID that created or updated this lead.
     */
    private String importBatchId;
    /**
     * IP address captured with the request for audit and compliance review.
     */
    private String ipAddress;
    /**
     * Indicates whether this lead was imported rather than captured through a live source.
     */
    private Boolean isImported;
    /**
     * Landing page URL where the lead submitted their information.
     */
    private String landingPage;
    /**
     * System or workflow that created this event.
     */
    private String origin;
    /**
     * Lead price or transaction price supplied to the Leadping API.
     */
    private UntypedNode price;
    /**
     * Product or offer associated with the lead or source.
     */
    private String product;
    /**
     * Publisher ID supplied by the lead source for attribution.
     */
    private String pubId;
    /**
     * Referring page or traffic source that sent the lead into Leadping.
     */
    private String referrer;
    /**
     * Seller-provided lead identifier used to deduplicate and reconcile lead delivery.
     */
    private String sellerLeadId;
    /**
     * Phone number where SMS consent was captured or evaluated.
     */
    private String smsConsentPhoneNumber;
    /**
     * Current SMS consent status recorded for this lead.
     */
    private String smsConsentStatus;
    /**
     * UTC timestamp when the lead requested SMS help instructions.
     */
    private OffsetDateTime smsHelpRequestedAt;
    /**
     * Indicates whether the lead has opted out of SMS communication.
     */
    private Boolean smsOptedOut;
    /**
     * UTC timestamp when the lead opted in to SMS communication.
     */
    private OffsetDateTime smsOptInAt;
    /**
     * UTC timestamp when the lead opted out of SMS communication.
     */
    private OffsetDateTime smsOptOutAt;
    /**
     * Source-provided key-value metadata retained for lead attribution and integration troubleshooting.
     */
    private LeadMetadataSourceMetadata sourceMetadata;
    /**
     * Affiliate or publisher sub ID captured for lead attribution.
     */
    private String subId;
    /**
     * TrustedForm certificate URL used as proof of consumer consent.
     */
    private String trustedFormUrl;
    /**
     * Browser or client user agent captured when this lead attribution metadata was submitted.
     */
    private String userAgent;
    /**
     * User ID associated with this lead&apos;s attribution metadata.
     */
    private String userId;
    /**
     * UTM campaign parameter captured for lead attribution reporting.
     */
    private String utmCampaign;
    /**
     * UTM content parameter captured for lead attribution reporting.
     */
    private String utmContent;
    /**
     * UTM medium parameter captured for lead attribution reporting.
     */
    private String utmMedium;
    /**
     * UTM source parameter captured for lead attribution reporting.
     */
    private String utmSource;
    /**
     * UTM term parameter captured for lead attribution reporting.
     */
    private String utmTerm;
    /**
     * Industry vertical used for lead routing, compliance review, and reporting.
     */
    private String vertical;
    /**
     * Instantiates a new {@link LeadMetadata} and sets the default values.
     */
    public LeadMetadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadMetadata}
     */
    @jakarta.annotation.Nonnull
    public static LeadMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadMetadata();
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
     * Gets the assignedPhoneNumberId property value. Phone number ID assigned to the lead, business, or source.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAssignedPhoneNumberId() {
        return this.assignedPhoneNumberId;
    }
    /**
     * Gets the businessId property value. Business ID that owns this lead&apos;s attribution metadata.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the complianceBlockedReason property value. Reason Leadping blocked this operation for compliance.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComplianceBlockedReason() {
        return this.complianceBlockedReason;
    }
    /**
     * Gets the complianceStatus property value. Compliance status used to decide whether Leadping can send messages.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComplianceStatus() {
        return this.complianceStatus;
    }
    /**
     * Gets the createdAt property value. UTC timestamp when this lead attribution metadata was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the directPostPrice property value. Direct-post price supplied by the lead source during intake.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getDirectPostPrice() {
        return this.directPostPrice;
    }
    /**
     * Gets the externalId property value. External system identifier used to reconcile this lead attribution metadata across integrations.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(34);
        deserializerMap.put("assignedPhoneNumberId", (n) -> { this.setAssignedPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("complianceBlockedReason", (n) -> { this.setComplianceBlockedReason(n.getStringValue()); });
        deserializerMap.put("complianceStatus", (n) -> { this.setComplianceStatus(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("directPostPrice", (n) -> { this.setDirectPostPrice(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("externalId", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("importBatchId", (n) -> { this.setImportBatchId(n.getStringValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("isImported", (n) -> { this.setIsImported(n.getBooleanValue()); });
        deserializerMap.put("landingPage", (n) -> { this.setLandingPage(n.getStringValue()); });
        deserializerMap.put("origin", (n) -> { this.setOrigin(n.getStringValue()); });
        deserializerMap.put("price", (n) -> { this.setPrice(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("product", (n) -> { this.setProduct(n.getStringValue()); });
        deserializerMap.put("pubId", (n) -> { this.setPubId(n.getStringValue()); });
        deserializerMap.put("referrer", (n) -> { this.setReferrer(n.getStringValue()); });
        deserializerMap.put("sellerLeadId", (n) -> { this.setSellerLeadId(n.getStringValue()); });
        deserializerMap.put("smsConsentPhoneNumber", (n) -> { this.setSmsConsentPhoneNumber(n.getStringValue()); });
        deserializerMap.put("smsConsentStatus", (n) -> { this.setSmsConsentStatus(n.getStringValue()); });
        deserializerMap.put("smsHelpRequestedAt", (n) -> { this.setSmsHelpRequestedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("smsOptedOut", (n) -> { this.setSmsOptedOut(n.getBooleanValue()); });
        deserializerMap.put("smsOptInAt", (n) -> { this.setSmsOptInAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("smsOptOutAt", (n) -> { this.setSmsOptOutAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sourceMetadata", (n) -> { this.setSourceMetadata(n.getObjectValue(LeadMetadataSourceMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("subId", (n) -> { this.setSubId(n.getStringValue()); });
        deserializerMap.put("trustedFormUrl", (n) -> { this.setTrustedFormUrl(n.getStringValue()); });
        deserializerMap.put("userAgent", (n) -> { this.setUserAgent(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("utmCampaign", (n) -> { this.setUtmCampaign(n.getStringValue()); });
        deserializerMap.put("utmContent", (n) -> { this.setUtmContent(n.getStringValue()); });
        deserializerMap.put("utmMedium", (n) -> { this.setUtmMedium(n.getStringValue()); });
        deserializerMap.put("utmSource", (n) -> { this.setUtmSource(n.getStringValue()); });
        deserializerMap.put("utmTerm", (n) -> { this.setUtmTerm(n.getStringValue()); });
        deserializerMap.put("vertical", (n) -> { this.setVertical(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the importBatchId property value. Bulk import batch ID that created or updated this lead.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImportBatchId() {
        return this.importBatchId;
    }
    /**
     * Gets the ipAddress property value. IP address captured with the request for audit and compliance review.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Gets the isImported property value. Indicates whether this lead was imported rather than captured through a live source.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsImported() {
        return this.isImported;
    }
    /**
     * Gets the landingPage property value. Landing page URL where the lead submitted their information.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLandingPage() {
        return this.landingPage;
    }
    /**
     * Gets the origin property value. System or workflow that created this event.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrigin() {
        return this.origin;
    }
    /**
     * Gets the price property value. Lead price or transaction price supplied to the Leadping API.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getPrice() {
        return this.price;
    }
    /**
     * Gets the product property value. Product or offer associated with the lead or source.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProduct() {
        return this.product;
    }
    /**
     * Gets the pubId property value. Publisher ID supplied by the lead source for attribution.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPubId() {
        return this.pubId;
    }
    /**
     * Gets the referrer property value. Referring page or traffic source that sent the lead into Leadping.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReferrer() {
        return this.referrer;
    }
    /**
     * Gets the sellerLeadId property value. Seller-provided lead identifier used to deduplicate and reconcile lead delivery.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSellerLeadId() {
        return this.sellerLeadId;
    }
    /**
     * Gets the smsConsentPhoneNumber property value. Phone number where SMS consent was captured or evaluated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSmsConsentPhoneNumber() {
        return this.smsConsentPhoneNumber;
    }
    /**
     * Gets the smsConsentStatus property value. Current SMS consent status recorded for this lead.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSmsConsentStatus() {
        return this.smsConsentStatus;
    }
    /**
     * Gets the smsHelpRequestedAt property value. UTC timestamp when the lead requested SMS help instructions.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSmsHelpRequestedAt() {
        return this.smsHelpRequestedAt;
    }
    /**
     * Gets the smsOptedOut property value. Indicates whether the lead has opted out of SMS communication.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSmsOptedOut() {
        return this.smsOptedOut;
    }
    /**
     * Gets the smsOptInAt property value. UTC timestamp when the lead opted in to SMS communication.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSmsOptInAt() {
        return this.smsOptInAt;
    }
    /**
     * Gets the smsOptOutAt property value. UTC timestamp when the lead opted out of SMS communication.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSmsOptOutAt() {
        return this.smsOptOutAt;
    }
    /**
     * Gets the sourceMetadata property value. Source-provided key-value metadata retained for lead attribution and integration troubleshooting.
     * @return a {@link LeadMetadataSourceMetadata}
     */
    @jakarta.annotation.Nullable
    public LeadMetadataSourceMetadata getSourceMetadata() {
        return this.sourceMetadata;
    }
    /**
     * Gets the subId property value. Affiliate or publisher sub ID captured for lead attribution.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubId() {
        return this.subId;
    }
    /**
     * Gets the trustedFormUrl property value. TrustedForm certificate URL used as proof of consumer consent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTrustedFormUrl() {
        return this.trustedFormUrl;
    }
    /**
     * Gets the userAgent property value. Browser or client user agent captured when this lead attribution metadata was submitted.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserAgent() {
        return this.userAgent;
    }
    /**
     * Gets the userId property value. User ID associated with this lead&apos;s attribution metadata.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the utmCampaign property value. UTM campaign parameter captured for lead attribution reporting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUtmCampaign() {
        return this.utmCampaign;
    }
    /**
     * Gets the utmContent property value. UTM content parameter captured for lead attribution reporting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUtmContent() {
        return this.utmContent;
    }
    /**
     * Gets the utmMedium property value. UTM medium parameter captured for lead attribution reporting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUtmMedium() {
        return this.utmMedium;
    }
    /**
     * Gets the utmSource property value. UTM source parameter captured for lead attribution reporting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUtmSource() {
        return this.utmSource;
    }
    /**
     * Gets the utmTerm property value. UTM term parameter captured for lead attribution reporting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUtmTerm() {
        return this.utmTerm;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("assignedPhoneNumberId", this.getAssignedPhoneNumberId());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeStringValue("complianceBlockedReason", this.getComplianceBlockedReason());
        writer.writeStringValue("complianceStatus", this.getComplianceStatus());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeObjectValue("directPostPrice", this.getDirectPostPrice());
        writer.writeStringValue("externalId", this.getExternalId());
        writer.writeStringValue("importBatchId", this.getImportBatchId());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeBooleanValue("isImported", this.getIsImported());
        writer.writeStringValue("landingPage", this.getLandingPage());
        writer.writeStringValue("origin", this.getOrigin());
        writer.writeObjectValue("price", this.getPrice());
        writer.writeStringValue("product", this.getProduct());
        writer.writeStringValue("pubId", this.getPubId());
        writer.writeStringValue("referrer", this.getReferrer());
        writer.writeStringValue("sellerLeadId", this.getSellerLeadId());
        writer.writeStringValue("smsConsentPhoneNumber", this.getSmsConsentPhoneNumber());
        writer.writeStringValue("smsConsentStatus", this.getSmsConsentStatus());
        writer.writeOffsetDateTimeValue("smsHelpRequestedAt", this.getSmsHelpRequestedAt());
        writer.writeBooleanValue("smsOptedOut", this.getSmsOptedOut());
        writer.writeOffsetDateTimeValue("smsOptInAt", this.getSmsOptInAt());
        writer.writeOffsetDateTimeValue("smsOptOutAt", this.getSmsOptOutAt());
        writer.writeObjectValue("sourceMetadata", this.getSourceMetadata());
        writer.writeStringValue("subId", this.getSubId());
        writer.writeStringValue("trustedFormUrl", this.getTrustedFormUrl());
        writer.writeStringValue("userAgent", this.getUserAgent());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("utmCampaign", this.getUtmCampaign());
        writer.writeStringValue("utmContent", this.getUtmContent());
        writer.writeStringValue("utmMedium", this.getUtmMedium());
        writer.writeStringValue("utmSource", this.getUtmSource());
        writer.writeStringValue("utmTerm", this.getUtmTerm());
        writer.writeStringValue("vertical", this.getVertical());
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
     * Sets the assignedPhoneNumberId property value. Phone number ID assigned to the lead, business, or source.
     * @param value Value to set for the assignedPhoneNumberId property.
     */
    public void setAssignedPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.assignedPhoneNumberId = value;
    }
    /**
     * Sets the businessId property value. Business ID that owns this lead&apos;s attribution metadata.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the complianceBlockedReason property value. Reason Leadping blocked this operation for compliance.
     * @param value Value to set for the complianceBlockedReason property.
     */
    public void setComplianceBlockedReason(@jakarta.annotation.Nullable final String value) {
        this.complianceBlockedReason = value;
    }
    /**
     * Sets the complianceStatus property value. Compliance status used to decide whether Leadping can send messages.
     * @param value Value to set for the complianceStatus property.
     */
    public void setComplianceStatus(@jakarta.annotation.Nullable final String value) {
        this.complianceStatus = value;
    }
    /**
     * Sets the createdAt property value. UTC timestamp when this lead attribution metadata was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the directPostPrice property value. Direct-post price supplied by the lead source during intake.
     * @param value Value to set for the directPostPrice property.
     */
    public void setDirectPostPrice(@jakarta.annotation.Nullable final UntypedNode value) {
        this.directPostPrice = value;
    }
    /**
     * Sets the externalId property value. External system identifier used to reconcile this lead attribution metadata across integrations.
     * @param value Value to set for the externalId property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the importBatchId property value. Bulk import batch ID that created or updated this lead.
     * @param value Value to set for the importBatchId property.
     */
    public void setImportBatchId(@jakarta.annotation.Nullable final String value) {
        this.importBatchId = value;
    }
    /**
     * Sets the ipAddress property value. IP address captured with the request for audit and compliance review.
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the isImported property value. Indicates whether this lead was imported rather than captured through a live source.
     * @param value Value to set for the isImported property.
     */
    public void setIsImported(@jakarta.annotation.Nullable final Boolean value) {
        this.isImported = value;
    }
    /**
     * Sets the landingPage property value. Landing page URL where the lead submitted their information.
     * @param value Value to set for the landingPage property.
     */
    public void setLandingPage(@jakarta.annotation.Nullable final String value) {
        this.landingPage = value;
    }
    /**
     * Sets the origin property value. System or workflow that created this event.
     * @param value Value to set for the origin property.
     */
    public void setOrigin(@jakarta.annotation.Nullable final String value) {
        this.origin = value;
    }
    /**
     * Sets the price property value. Lead price or transaction price supplied to the Leadping API.
     * @param value Value to set for the price property.
     */
    public void setPrice(@jakarta.annotation.Nullable final UntypedNode value) {
        this.price = value;
    }
    /**
     * Sets the product property value. Product or offer associated with the lead or source.
     * @param value Value to set for the product property.
     */
    public void setProduct(@jakarta.annotation.Nullable final String value) {
        this.product = value;
    }
    /**
     * Sets the pubId property value. Publisher ID supplied by the lead source for attribution.
     * @param value Value to set for the pubId property.
     */
    public void setPubId(@jakarta.annotation.Nullable final String value) {
        this.pubId = value;
    }
    /**
     * Sets the referrer property value. Referring page or traffic source that sent the lead into Leadping.
     * @param value Value to set for the referrer property.
     */
    public void setReferrer(@jakarta.annotation.Nullable final String value) {
        this.referrer = value;
    }
    /**
     * Sets the sellerLeadId property value. Seller-provided lead identifier used to deduplicate and reconcile lead delivery.
     * @param value Value to set for the sellerLeadId property.
     */
    public void setSellerLeadId(@jakarta.annotation.Nullable final String value) {
        this.sellerLeadId = value;
    }
    /**
     * Sets the smsConsentPhoneNumber property value. Phone number where SMS consent was captured or evaluated.
     * @param value Value to set for the smsConsentPhoneNumber property.
     */
    public void setSmsConsentPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.smsConsentPhoneNumber = value;
    }
    /**
     * Sets the smsConsentStatus property value. Current SMS consent status recorded for this lead.
     * @param value Value to set for the smsConsentStatus property.
     */
    public void setSmsConsentStatus(@jakarta.annotation.Nullable final String value) {
        this.smsConsentStatus = value;
    }
    /**
     * Sets the smsHelpRequestedAt property value. UTC timestamp when the lead requested SMS help instructions.
     * @param value Value to set for the smsHelpRequestedAt property.
     */
    public void setSmsHelpRequestedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.smsHelpRequestedAt = value;
    }
    /**
     * Sets the smsOptedOut property value. Indicates whether the lead has opted out of SMS communication.
     * @param value Value to set for the smsOptedOut property.
     */
    public void setSmsOptedOut(@jakarta.annotation.Nullable final Boolean value) {
        this.smsOptedOut = value;
    }
    /**
     * Sets the smsOptInAt property value. UTC timestamp when the lead opted in to SMS communication.
     * @param value Value to set for the smsOptInAt property.
     */
    public void setSmsOptInAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.smsOptInAt = value;
    }
    /**
     * Sets the smsOptOutAt property value. UTC timestamp when the lead opted out of SMS communication.
     * @param value Value to set for the smsOptOutAt property.
     */
    public void setSmsOptOutAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.smsOptOutAt = value;
    }
    /**
     * Sets the sourceMetadata property value. Source-provided key-value metadata retained for lead attribution and integration troubleshooting.
     * @param value Value to set for the sourceMetadata property.
     */
    public void setSourceMetadata(@jakarta.annotation.Nullable final LeadMetadataSourceMetadata value) {
        this.sourceMetadata = value;
    }
    /**
     * Sets the subId property value. Affiliate or publisher sub ID captured for lead attribution.
     * @param value Value to set for the subId property.
     */
    public void setSubId(@jakarta.annotation.Nullable final String value) {
        this.subId = value;
    }
    /**
     * Sets the trustedFormUrl property value. TrustedForm certificate URL used as proof of consumer consent.
     * @param value Value to set for the trustedFormUrl property.
     */
    public void setTrustedFormUrl(@jakarta.annotation.Nullable final String value) {
        this.trustedFormUrl = value;
    }
    /**
     * Sets the userAgent property value. Browser or client user agent captured when this lead attribution metadata was submitted.
     * @param value Value to set for the userAgent property.
     */
    public void setUserAgent(@jakarta.annotation.Nullable final String value) {
        this.userAgent = value;
    }
    /**
     * Sets the userId property value. User ID associated with this lead&apos;s attribution metadata.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the utmCampaign property value. UTM campaign parameter captured for lead attribution reporting.
     * @param value Value to set for the utmCampaign property.
     */
    public void setUtmCampaign(@jakarta.annotation.Nullable final String value) {
        this.utmCampaign = value;
    }
    /**
     * Sets the utmContent property value. UTM content parameter captured for lead attribution reporting.
     * @param value Value to set for the utmContent property.
     */
    public void setUtmContent(@jakarta.annotation.Nullable final String value) {
        this.utmContent = value;
    }
    /**
     * Sets the utmMedium property value. UTM medium parameter captured for lead attribution reporting.
     * @param value Value to set for the utmMedium property.
     */
    public void setUtmMedium(@jakarta.annotation.Nullable final String value) {
        this.utmMedium = value;
    }
    /**
     * Sets the utmSource property value. UTM source parameter captured for lead attribution reporting.
     * @param value Value to set for the utmSource property.
     */
    public void setUtmSource(@jakarta.annotation.Nullable final String value) {
        this.utmSource = value;
    }
    /**
     * Sets the utmTerm property value. UTM term parameter captured for lead attribution reporting.
     * @param value Value to set for the utmTerm property.
     */
    public void setUtmTerm(@jakarta.annotation.Nullable final String value) {
        this.utmTerm = value;
    }
    /**
     * Sets the vertical property value. Industry vertical used for lead routing, compliance review, and reporting.
     * @param value Value to set for the vertical property.
     */
    public void setVertical(@jakarta.annotation.Nullable final String value) {
        this.vertical = value;
    }
}
