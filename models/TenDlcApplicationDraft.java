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
 * Describes 10DLC application draft data used in Leadping API requests and responses.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenDlcApplicationDraft implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Whether campaign content is age gated.
     */
    private Boolean ageGated;
    /**
     * Whether the campaign subscription renews automatically.
     */
    private Boolean autoRenewal;
    /**
     * Legal entity type registered with Telnyx.
     */
    private String brandEntityType;
    /**
     * Defines the provider lifecycle for an individual 10DLC brand or campaign.
     */
    private TenDlcRegistrationStatus brandStatus;
    /**
     * Individual representative email required for public-company verification.
     */
    private String businessContactEmail;
    /**
     * Defines the provider lifecycle for an individual 10DLC brand or campaign.
     */
    private TenDlcRegistrationStatus campaignStatus;
    /**
     * Legal business city.
     */
    private String city;
    /**
     * Company name for this 10DLC application draft.
     */
    private String companyName;
    /**
     * The compliance warnings included with this 10DLC application draft.
     */
    private java.util.List<String> complianceWarnings;
    /**
     * Contact email for this 10DLC application draft.
     */
    private String contactEmail;
    /**
     * Contact name for this 10DLC application draft.
     */
    private String contactName;
    /**
     * Contact phone for this 10DLC application draft.
     */
    private String contactPhone;
    /**
     * ISO two-letter country of registration.
     */
    private String country;
    /**
     * Whether messages concern direct lending or loan arrangements.
     */
    private Boolean directLending;
    /**
     * Customer-facing brand or DBA name.
     */
    private String displayName;
    /**
     * EIN for this 10DLC application draft.
     */
    private String ein;
    /**
     * Whether campaign messages contain links.
     */
    private Boolean embeddedLink;
    /**
     * Representative embedded link submitted for review.
     */
    private String embeddedLinkSample;
    /**
     * Whether campaign messages contain phone numbers.
     */
    private Boolean embeddedPhone;
    /**
     * Expected monthly volume for this 10DLC application draft.
     */
    private Integer expectedMonthlyVolume;
    /**
     * Comma-separated help keywords.
     */
    private String helpKeywords;
    /**
     * Help response with customer-care information.
     */
    private String helpMessage;
    /**
     * The Telnyx brand vertical for this 10DLC application draft. The JSON name is retained for backward compatibility.
     */
    private String industry;
    /**
     * Whether the brand resells services to other businesses.
     */
    private Boolean isReseller;
    /**
     * UTC timestamp for last submitted at on this 10DLC application draft.
     */
    private OffsetDateTime lastSubmittedAt;
    /**
     * The message examples included with this 10DLC application draft.
     */
    private java.util.List<String> messageExamples;
    /**
     * The missing fields included with this 10DLC application draft.
     */
    private java.util.List<String> missingFields;
    /**
     * Whether the campaign uses a number pool.
     */
    private Boolean numberPool;
    /**
     * Comma-separated opt-in keywords.
     */
    private String optinKeywords;
    /**
     * Opt in language for this 10DLC application draft.
     */
    private String optInLanguage;
    /**
     * Opt-in confirmation response.
     */
    private String optinMessage;
    /**
     * Comma-separated opt-out keywords.
     */
    private String optoutKeywords;
    /**
     * Opt-out confirmation response.
     */
    private String optoutMessage;
    /**
     * Legal business postal code.
     */
    private String postalCode;
    /**
     * Public privacy-policy URL that explains how messaging recipient data is handled.
     */
    private String privacyPolicyUrl;
    /**
     * The human-readable rejection reason explaining this 10DLC application draft.
     */
    private String rejectionReason;
    /**
     * Legal business state or region.
     */
    private String state;
    /**
     * Public-company stock exchange.
     */
    private String stockExchange;
    /**
     * Public-company stock ticker.
     */
    private String stockSymbol;
    /**
     * Legal business street address.
     */
    private String street;
    /**
     * Whether the program responds to help keywords.
     */
    private Boolean subscriberHelp;
    /**
     * Whether subscribers opt in before messaging.
     */
    private Boolean subscriberOptin;
    /**
     * Whether the program supports opt-out keywords.
     */
    private Boolean subscriberOptout;
    /**
     * Selected sub-use cases for a mixed campaign.
     */
    private java.util.List<String> subUseCases;
    /**
     * Acceptance of the carrier campaign terms.
     */
    private Boolean termsAndConditions;
    /**
     * Public terms-of-service URL governing the messaging program.
     */
    private String termsUrl;
    /**
     * Whether TrustedForm required applies to this 10DLC application draft.
     */
    private Boolean trustedFormRequired;
    /**
     * UTC timestamp for updated at on this 10DLC application draft.
     */
    private OffsetDateTime updatedAt;
    /**
     * Use case for this 10DLC application draft.
     */
    private String useCase;
    /**
     * Use case description for this 10DLC application draft.
     */
    private String useCaseDescription;
    /**
     * Version for this 10DLC application draft.
     */
    private Integer version;
    /**
     * Public business website URL submitted to carriers during brand review.
     */
    private String websiteUrl;
    /**
     * Instantiates a new {@link TenDlcApplicationDraft} and sets the default values.
     */
    public TenDlcApplicationDraft() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TenDlcApplicationDraft}
     */
    @jakarta.annotation.Nonnull
    public static TenDlcApplicationDraft createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TenDlcApplicationDraft();
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
     * Gets the ageGated property value. Whether campaign content is age gated.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAgeGated() {
        return this.ageGated;
    }
    /**
     * Gets the autoRenewal property value. Whether the campaign subscription renews automatically.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }
    /**
     * Gets the brandEntityType property value. Legal entity type registered with Telnyx.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrandEntityType() {
        return this.brandEntityType;
    }
    /**
     * Gets the brandStatus property value. Defines the provider lifecycle for an individual 10DLC brand or campaign.
     * @return a {@link TenDlcRegistrationStatus}
     */
    @jakarta.annotation.Nullable
    public TenDlcRegistrationStatus getBrandStatus() {
        return this.brandStatus;
    }
    /**
     * Gets the businessContactEmail property value. Individual representative email required for public-company verification.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessContactEmail() {
        return this.businessContactEmail;
    }
    /**
     * Gets the campaignStatus property value. Defines the provider lifecycle for an individual 10DLC brand or campaign.
     * @return a {@link TenDlcRegistrationStatus}
     */
    @jakarta.annotation.Nullable
    public TenDlcRegistrationStatus getCampaignStatus() {
        return this.campaignStatus;
    }
    /**
     * Gets the city property value. Legal business city.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCity() {
        return this.city;
    }
    /**
     * Gets the companyName property value. Company name for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompanyName() {
        return this.companyName;
    }
    /**
     * Gets the complianceWarnings property value. The compliance warnings included with this 10DLC application draft.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getComplianceWarnings() {
        return this.complianceWarnings;
    }
    /**
     * Gets the contactEmail property value. Contact email for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContactEmail() {
        return this.contactEmail;
    }
    /**
     * Gets the contactName property value. Contact name for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContactName() {
        return this.contactName;
    }
    /**
     * Gets the contactPhone property value. Contact phone for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContactPhone() {
        return this.contactPhone;
    }
    /**
     * Gets the country property value. ISO two-letter country of registration.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.country;
    }
    /**
     * Gets the directLending property value. Whether messages concern direct lending or loan arrangements.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDirectLending() {
        return this.directLending;
    }
    /**
     * Gets the displayName property value. Customer-facing brand or DBA name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the ein property value. EIN for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEin() {
        return this.ein;
    }
    /**
     * Gets the embeddedLink property value. Whether campaign messages contain links.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEmbeddedLink() {
        return this.embeddedLink;
    }
    /**
     * Gets the embeddedLinkSample property value. Representative embedded link submitted for review.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmbeddedLinkSample() {
        return this.embeddedLinkSample;
    }
    /**
     * Gets the embeddedPhone property value. Whether campaign messages contain phone numbers.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEmbeddedPhone() {
        return this.embeddedPhone;
    }
    /**
     * Gets the expectedMonthlyVolume property value. Expected monthly volume for this 10DLC application draft.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getExpectedMonthlyVolume() {
        return this.expectedMonthlyVolume;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(52);
        deserializerMap.put("ageGated", (n) -> { this.setAgeGated(n.getBooleanValue()); });
        deserializerMap.put("autoRenewal", (n) -> { this.setAutoRenewal(n.getBooleanValue()); });
        deserializerMap.put("brandEntityType", (n) -> { this.setBrandEntityType(n.getStringValue()); });
        deserializerMap.put("brandStatus", (n) -> { this.setBrandStatus(n.getEnumValue(TenDlcRegistrationStatus::forValue)); });
        deserializerMap.put("businessContactEmail", (n) -> { this.setBusinessContactEmail(n.getStringValue()); });
        deserializerMap.put("campaignStatus", (n) -> { this.setCampaignStatus(n.getEnumValue(TenDlcRegistrationStatus::forValue)); });
        deserializerMap.put("city", (n) -> { this.setCity(n.getStringValue()); });
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("complianceWarnings", (n) -> { this.setComplianceWarnings(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("contactEmail", (n) -> { this.setContactEmail(n.getStringValue()); });
        deserializerMap.put("contactName", (n) -> { this.setContactName(n.getStringValue()); });
        deserializerMap.put("contactPhone", (n) -> { this.setContactPhone(n.getStringValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("directLending", (n) -> { this.setDirectLending(n.getBooleanValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("ein", (n) -> { this.setEin(n.getStringValue()); });
        deserializerMap.put("embeddedLink", (n) -> { this.setEmbeddedLink(n.getBooleanValue()); });
        deserializerMap.put("embeddedLinkSample", (n) -> { this.setEmbeddedLinkSample(n.getStringValue()); });
        deserializerMap.put("embeddedPhone", (n) -> { this.setEmbeddedPhone(n.getBooleanValue()); });
        deserializerMap.put("expectedMonthlyVolume", (n) -> { this.setExpectedMonthlyVolume(n.getIntegerValue()); });
        deserializerMap.put("helpKeywords", (n) -> { this.setHelpKeywords(n.getStringValue()); });
        deserializerMap.put("helpMessage", (n) -> { this.setHelpMessage(n.getStringValue()); });
        deserializerMap.put("industry", (n) -> { this.setIndustry(n.getStringValue()); });
        deserializerMap.put("isReseller", (n) -> { this.setIsReseller(n.getBooleanValue()); });
        deserializerMap.put("lastSubmittedAt", (n) -> { this.setLastSubmittedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("messageExamples", (n) -> { this.setMessageExamples(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("missingFields", (n) -> { this.setMissingFields(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("numberPool", (n) -> { this.setNumberPool(n.getBooleanValue()); });
        deserializerMap.put("optinKeywords", (n) -> { this.setOptinKeywords(n.getStringValue()); });
        deserializerMap.put("optInLanguage", (n) -> { this.setOptInLanguage(n.getStringValue()); });
        deserializerMap.put("optinMessage", (n) -> { this.setOptinMessage(n.getStringValue()); });
        deserializerMap.put("optoutKeywords", (n) -> { this.setOptoutKeywords(n.getStringValue()); });
        deserializerMap.put("optoutMessage", (n) -> { this.setOptoutMessage(n.getStringValue()); });
        deserializerMap.put("postalCode", (n) -> { this.setPostalCode(n.getStringValue()); });
        deserializerMap.put("privacyPolicyUrl", (n) -> { this.setPrivacyPolicyUrl(n.getStringValue()); });
        deserializerMap.put("rejectionReason", (n) -> { this.setRejectionReason(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("stockExchange", (n) -> { this.setStockExchange(n.getStringValue()); });
        deserializerMap.put("stockSymbol", (n) -> { this.setStockSymbol(n.getStringValue()); });
        deserializerMap.put("street", (n) -> { this.setStreet(n.getStringValue()); });
        deserializerMap.put("subscriberHelp", (n) -> { this.setSubscriberHelp(n.getBooleanValue()); });
        deserializerMap.put("subscriberOptin", (n) -> { this.setSubscriberOptin(n.getBooleanValue()); });
        deserializerMap.put("subscriberOptout", (n) -> { this.setSubscriberOptout(n.getBooleanValue()); });
        deserializerMap.put("subUseCases", (n) -> { this.setSubUseCases(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("termsAndConditions", (n) -> { this.setTermsAndConditions(n.getBooleanValue()); });
        deserializerMap.put("termsUrl", (n) -> { this.setTermsUrl(n.getStringValue()); });
        deserializerMap.put("trustedFormRequired", (n) -> { this.setTrustedFormRequired(n.getBooleanValue()); });
        deserializerMap.put("updatedAt", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("useCase", (n) -> { this.setUseCase(n.getStringValue()); });
        deserializerMap.put("useCaseDescription", (n) -> { this.setUseCaseDescription(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        deserializerMap.put("websiteUrl", (n) -> { this.setWebsiteUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the helpKeywords property value. Comma-separated help keywords.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHelpKeywords() {
        return this.helpKeywords;
    }
    /**
     * Gets the helpMessage property value. Help response with customer-care information.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHelpMessage() {
        return this.helpMessage;
    }
    /**
     * Gets the industry property value. The Telnyx brand vertical for this 10DLC application draft. The JSON name is retained for backward compatibility.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIndustry() {
        return this.industry;
    }
    /**
     * Gets the isReseller property value. Whether the brand resells services to other businesses.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsReseller() {
        return this.isReseller;
    }
    /**
     * Gets the lastSubmittedAt property value. UTC timestamp for last submitted at on this 10DLC application draft.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSubmittedAt() {
        return this.lastSubmittedAt;
    }
    /**
     * Gets the messageExamples property value. The message examples included with this 10DLC application draft.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMessageExamples() {
        return this.messageExamples;
    }
    /**
     * Gets the missingFields property value. The missing fields included with this 10DLC application draft.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMissingFields() {
        return this.missingFields;
    }
    /**
     * Gets the numberPool property value. Whether the campaign uses a number pool.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNumberPool() {
        return this.numberPool;
    }
    /**
     * Gets the optinKeywords property value. Comma-separated opt-in keywords.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOptinKeywords() {
        return this.optinKeywords;
    }
    /**
     * Gets the optInLanguage property value. Opt in language for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOptInLanguage() {
        return this.optInLanguage;
    }
    /**
     * Gets the optinMessage property value. Opt-in confirmation response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOptinMessage() {
        return this.optinMessage;
    }
    /**
     * Gets the optoutKeywords property value. Comma-separated opt-out keywords.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOptoutKeywords() {
        return this.optoutKeywords;
    }
    /**
     * Gets the optoutMessage property value. Opt-out confirmation response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOptoutMessage() {
        return this.optoutMessage;
    }
    /**
     * Gets the postalCode property value. Legal business postal code.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPostalCode() {
        return this.postalCode;
    }
    /**
     * Gets the privacyPolicyUrl property value. Public privacy-policy URL that explains how messaging recipient data is handled.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }
    /**
     * Gets the rejectionReason property value. The human-readable rejection reason explaining this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRejectionReason() {
        return this.rejectionReason;
    }
    /**
     * Gets the state property value. Legal business state or region.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the stockExchange property value. Public-company stock exchange.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStockExchange() {
        return this.stockExchange;
    }
    /**
     * Gets the stockSymbol property value. Public-company stock ticker.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStockSymbol() {
        return this.stockSymbol;
    }
    /**
     * Gets the street property value. Legal business street address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStreet() {
        return this.street;
    }
    /**
     * Gets the subscriberHelp property value. Whether the program responds to help keywords.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSubscriberHelp() {
        return this.subscriberHelp;
    }
    /**
     * Gets the subscriberOptin property value. Whether subscribers opt in before messaging.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSubscriberOptin() {
        return this.subscriberOptin;
    }
    /**
     * Gets the subscriberOptout property value. Whether the program supports opt-out keywords.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSubscriberOptout() {
        return this.subscriberOptout;
    }
    /**
     * Gets the subUseCases property value. Selected sub-use cases for a mixed campaign.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSubUseCases() {
        return this.subUseCases;
    }
    /**
     * Gets the termsAndConditions property value. Acceptance of the carrier campaign terms.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTermsAndConditions() {
        return this.termsAndConditions;
    }
    /**
     * Gets the termsUrl property value. Public terms-of-service URL governing the messaging program.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTermsUrl() {
        return this.termsUrl;
    }
    /**
     * Gets the trustedFormRequired property value. Whether TrustedForm required applies to this 10DLC application draft.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTrustedFormRequired() {
        return this.trustedFormRequired;
    }
    /**
     * Gets the updatedAt property value. UTC timestamp for updated at on this 10DLC application draft.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Gets the useCase property value. Use case for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUseCase() {
        return this.useCase;
    }
    /**
     * Gets the useCaseDescription property value. Use case description for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUseCaseDescription() {
        return this.useCaseDescription;
    }
    /**
     * Gets the version property value. Version for this 10DLC application draft.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.version;
    }
    /**
     * Gets the websiteUrl property value. Public business website URL submitted to carriers during brand review.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebsiteUrl() {
        return this.websiteUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("ageGated", this.getAgeGated());
        writer.writeBooleanValue("autoRenewal", this.getAutoRenewal());
        writer.writeStringValue("brandEntityType", this.getBrandEntityType());
        writer.writeEnumValue("brandStatus", this.getBrandStatus());
        writer.writeStringValue("businessContactEmail", this.getBusinessContactEmail());
        writer.writeEnumValue("campaignStatus", this.getCampaignStatus());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeCollectionOfPrimitiveValues("complianceWarnings", this.getComplianceWarnings());
        writer.writeStringValue("contactEmail", this.getContactEmail());
        writer.writeStringValue("contactName", this.getContactName());
        writer.writeStringValue("contactPhone", this.getContactPhone());
        writer.writeStringValue("country", this.getCountry());
        writer.writeBooleanValue("directLending", this.getDirectLending());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("ein", this.getEin());
        writer.writeBooleanValue("embeddedLink", this.getEmbeddedLink());
        writer.writeStringValue("embeddedLinkSample", this.getEmbeddedLinkSample());
        writer.writeBooleanValue("embeddedPhone", this.getEmbeddedPhone());
        writer.writeIntegerValue("expectedMonthlyVolume", this.getExpectedMonthlyVolume());
        writer.writeStringValue("helpKeywords", this.getHelpKeywords());
        writer.writeStringValue("helpMessage", this.getHelpMessage());
        writer.writeStringValue("industry", this.getIndustry());
        writer.writeBooleanValue("isReseller", this.getIsReseller());
        writer.writeOffsetDateTimeValue("lastSubmittedAt", this.getLastSubmittedAt());
        writer.writeCollectionOfPrimitiveValues("messageExamples", this.getMessageExamples());
        writer.writeCollectionOfPrimitiveValues("missingFields", this.getMissingFields());
        writer.writeBooleanValue("numberPool", this.getNumberPool());
        writer.writeStringValue("optinKeywords", this.getOptinKeywords());
        writer.writeStringValue("optInLanguage", this.getOptInLanguage());
        writer.writeStringValue("optinMessage", this.getOptinMessage());
        writer.writeStringValue("optoutKeywords", this.getOptoutKeywords());
        writer.writeStringValue("optoutMessage", this.getOptoutMessage());
        writer.writeStringValue("postalCode", this.getPostalCode());
        writer.writeStringValue("privacyPolicyUrl", this.getPrivacyPolicyUrl());
        writer.writeStringValue("rejectionReason", this.getRejectionReason());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("stockExchange", this.getStockExchange());
        writer.writeStringValue("stockSymbol", this.getStockSymbol());
        writer.writeStringValue("street", this.getStreet());
        writer.writeBooleanValue("subscriberHelp", this.getSubscriberHelp());
        writer.writeBooleanValue("subscriberOptin", this.getSubscriberOptin());
        writer.writeBooleanValue("subscriberOptout", this.getSubscriberOptout());
        writer.writeCollectionOfPrimitiveValues("subUseCases", this.getSubUseCases());
        writer.writeBooleanValue("termsAndConditions", this.getTermsAndConditions());
        writer.writeStringValue("termsUrl", this.getTermsUrl());
        writer.writeBooleanValue("trustedFormRequired", this.getTrustedFormRequired());
        writer.writeOffsetDateTimeValue("updatedAt", this.getUpdatedAt());
        writer.writeStringValue("useCase", this.getUseCase());
        writer.writeStringValue("useCaseDescription", this.getUseCaseDescription());
        writer.writeIntegerValue("version", this.getVersion());
        writer.writeStringValue("websiteUrl", this.getWebsiteUrl());
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
     * Sets the ageGated property value. Whether campaign content is age gated.
     * @param value Value to set for the ageGated property.
     */
    public void setAgeGated(@jakarta.annotation.Nullable final Boolean value) {
        this.ageGated = value;
    }
    /**
     * Sets the autoRenewal property value. Whether the campaign subscription renews automatically.
     * @param value Value to set for the autoRenewal property.
     */
    public void setAutoRenewal(@jakarta.annotation.Nullable final Boolean value) {
        this.autoRenewal = value;
    }
    /**
     * Sets the brandEntityType property value. Legal entity type registered with Telnyx.
     * @param value Value to set for the brandEntityType property.
     */
    public void setBrandEntityType(@jakarta.annotation.Nullable final String value) {
        this.brandEntityType = value;
    }
    /**
     * Sets the brandStatus property value. Defines the provider lifecycle for an individual 10DLC brand or campaign.
     * @param value Value to set for the brandStatus property.
     */
    public void setBrandStatus(@jakarta.annotation.Nullable final TenDlcRegistrationStatus value) {
        this.brandStatus = value;
    }
    /**
     * Sets the businessContactEmail property value. Individual representative email required for public-company verification.
     * @param value Value to set for the businessContactEmail property.
     */
    public void setBusinessContactEmail(@jakarta.annotation.Nullable final String value) {
        this.businessContactEmail = value;
    }
    /**
     * Sets the campaignStatus property value. Defines the provider lifecycle for an individual 10DLC brand or campaign.
     * @param value Value to set for the campaignStatus property.
     */
    public void setCampaignStatus(@jakarta.annotation.Nullable final TenDlcRegistrationStatus value) {
        this.campaignStatus = value;
    }
    /**
     * Sets the city property value. Legal business city.
     * @param value Value to set for the city property.
     */
    public void setCity(@jakarta.annotation.Nullable final String value) {
        this.city = value;
    }
    /**
     * Sets the companyName property value. Company name for this 10DLC application draft.
     * @param value Value to set for the companyName property.
     */
    public void setCompanyName(@jakarta.annotation.Nullable final String value) {
        this.companyName = value;
    }
    /**
     * Sets the complianceWarnings property value. The compliance warnings included with this 10DLC application draft.
     * @param value Value to set for the complianceWarnings property.
     */
    public void setComplianceWarnings(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.complianceWarnings = value;
    }
    /**
     * Sets the contactEmail property value. Contact email for this 10DLC application draft.
     * @param value Value to set for the contactEmail property.
     */
    public void setContactEmail(@jakarta.annotation.Nullable final String value) {
        this.contactEmail = value;
    }
    /**
     * Sets the contactName property value. Contact name for this 10DLC application draft.
     * @param value Value to set for the contactName property.
     */
    public void setContactName(@jakarta.annotation.Nullable final String value) {
        this.contactName = value;
    }
    /**
     * Sets the contactPhone property value. Contact phone for this 10DLC application draft.
     * @param value Value to set for the contactPhone property.
     */
    public void setContactPhone(@jakarta.annotation.Nullable final String value) {
        this.contactPhone = value;
    }
    /**
     * Sets the country property value. ISO two-letter country of registration.
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.country = value;
    }
    /**
     * Sets the directLending property value. Whether messages concern direct lending or loan arrangements.
     * @param value Value to set for the directLending property.
     */
    public void setDirectLending(@jakarta.annotation.Nullable final Boolean value) {
        this.directLending = value;
    }
    /**
     * Sets the displayName property value. Customer-facing brand or DBA name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the ein property value. EIN for this 10DLC application draft.
     * @param value Value to set for the ein property.
     */
    public void setEin(@jakarta.annotation.Nullable final String value) {
        this.ein = value;
    }
    /**
     * Sets the embeddedLink property value. Whether campaign messages contain links.
     * @param value Value to set for the embeddedLink property.
     */
    public void setEmbeddedLink(@jakarta.annotation.Nullable final Boolean value) {
        this.embeddedLink = value;
    }
    /**
     * Sets the embeddedLinkSample property value. Representative embedded link submitted for review.
     * @param value Value to set for the embeddedLinkSample property.
     */
    public void setEmbeddedLinkSample(@jakarta.annotation.Nullable final String value) {
        this.embeddedLinkSample = value;
    }
    /**
     * Sets the embeddedPhone property value. Whether campaign messages contain phone numbers.
     * @param value Value to set for the embeddedPhone property.
     */
    public void setEmbeddedPhone(@jakarta.annotation.Nullable final Boolean value) {
        this.embeddedPhone = value;
    }
    /**
     * Sets the expectedMonthlyVolume property value. Expected monthly volume for this 10DLC application draft.
     * @param value Value to set for the expectedMonthlyVolume property.
     */
    public void setExpectedMonthlyVolume(@jakarta.annotation.Nullable final Integer value) {
        this.expectedMonthlyVolume = value;
    }
    /**
     * Sets the helpKeywords property value. Comma-separated help keywords.
     * @param value Value to set for the helpKeywords property.
     */
    public void setHelpKeywords(@jakarta.annotation.Nullable final String value) {
        this.helpKeywords = value;
    }
    /**
     * Sets the helpMessage property value. Help response with customer-care information.
     * @param value Value to set for the helpMessage property.
     */
    public void setHelpMessage(@jakarta.annotation.Nullable final String value) {
        this.helpMessage = value;
    }
    /**
     * Sets the industry property value. The Telnyx brand vertical for this 10DLC application draft. The JSON name is retained for backward compatibility.
     * @param value Value to set for the industry property.
     */
    public void setIndustry(@jakarta.annotation.Nullable final String value) {
        this.industry = value;
    }
    /**
     * Sets the isReseller property value. Whether the brand resells services to other businesses.
     * @param value Value to set for the isReseller property.
     */
    public void setIsReseller(@jakarta.annotation.Nullable final Boolean value) {
        this.isReseller = value;
    }
    /**
     * Sets the lastSubmittedAt property value. UTC timestamp for last submitted at on this 10DLC application draft.
     * @param value Value to set for the lastSubmittedAt property.
     */
    public void setLastSubmittedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSubmittedAt = value;
    }
    /**
     * Sets the messageExamples property value. The message examples included with this 10DLC application draft.
     * @param value Value to set for the messageExamples property.
     */
    public void setMessageExamples(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.messageExamples = value;
    }
    /**
     * Sets the missingFields property value. The missing fields included with this 10DLC application draft.
     * @param value Value to set for the missingFields property.
     */
    public void setMissingFields(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.missingFields = value;
    }
    /**
     * Sets the numberPool property value. Whether the campaign uses a number pool.
     * @param value Value to set for the numberPool property.
     */
    public void setNumberPool(@jakarta.annotation.Nullable final Boolean value) {
        this.numberPool = value;
    }
    /**
     * Sets the optinKeywords property value. Comma-separated opt-in keywords.
     * @param value Value to set for the optinKeywords property.
     */
    public void setOptinKeywords(@jakarta.annotation.Nullable final String value) {
        this.optinKeywords = value;
    }
    /**
     * Sets the optInLanguage property value. Opt in language for this 10DLC application draft.
     * @param value Value to set for the optInLanguage property.
     */
    public void setOptInLanguage(@jakarta.annotation.Nullable final String value) {
        this.optInLanguage = value;
    }
    /**
     * Sets the optinMessage property value. Opt-in confirmation response.
     * @param value Value to set for the optinMessage property.
     */
    public void setOptinMessage(@jakarta.annotation.Nullable final String value) {
        this.optinMessage = value;
    }
    /**
     * Sets the optoutKeywords property value. Comma-separated opt-out keywords.
     * @param value Value to set for the optoutKeywords property.
     */
    public void setOptoutKeywords(@jakarta.annotation.Nullable final String value) {
        this.optoutKeywords = value;
    }
    /**
     * Sets the optoutMessage property value. Opt-out confirmation response.
     * @param value Value to set for the optoutMessage property.
     */
    public void setOptoutMessage(@jakarta.annotation.Nullable final String value) {
        this.optoutMessage = value;
    }
    /**
     * Sets the postalCode property value. Legal business postal code.
     * @param value Value to set for the postalCode property.
     */
    public void setPostalCode(@jakarta.annotation.Nullable final String value) {
        this.postalCode = value;
    }
    /**
     * Sets the privacyPolicyUrl property value. Public privacy-policy URL that explains how messaging recipient data is handled.
     * @param value Value to set for the privacyPolicyUrl property.
     */
    public void setPrivacyPolicyUrl(@jakarta.annotation.Nullable final String value) {
        this.privacyPolicyUrl = value;
    }
    /**
     * Sets the rejectionReason property value. The human-readable rejection reason explaining this 10DLC application draft.
     * @param value Value to set for the rejectionReason property.
     */
    public void setRejectionReason(@jakarta.annotation.Nullable final String value) {
        this.rejectionReason = value;
    }
    /**
     * Sets the state property value. Legal business state or region.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the stockExchange property value. Public-company stock exchange.
     * @param value Value to set for the stockExchange property.
     */
    public void setStockExchange(@jakarta.annotation.Nullable final String value) {
        this.stockExchange = value;
    }
    /**
     * Sets the stockSymbol property value. Public-company stock ticker.
     * @param value Value to set for the stockSymbol property.
     */
    public void setStockSymbol(@jakarta.annotation.Nullable final String value) {
        this.stockSymbol = value;
    }
    /**
     * Sets the street property value. Legal business street address.
     * @param value Value to set for the street property.
     */
    public void setStreet(@jakarta.annotation.Nullable final String value) {
        this.street = value;
    }
    /**
     * Sets the subscriberHelp property value. Whether the program responds to help keywords.
     * @param value Value to set for the subscriberHelp property.
     */
    public void setSubscriberHelp(@jakarta.annotation.Nullable final Boolean value) {
        this.subscriberHelp = value;
    }
    /**
     * Sets the subscriberOptin property value. Whether subscribers opt in before messaging.
     * @param value Value to set for the subscriberOptin property.
     */
    public void setSubscriberOptin(@jakarta.annotation.Nullable final Boolean value) {
        this.subscriberOptin = value;
    }
    /**
     * Sets the subscriberOptout property value. Whether the program supports opt-out keywords.
     * @param value Value to set for the subscriberOptout property.
     */
    public void setSubscriberOptout(@jakarta.annotation.Nullable final Boolean value) {
        this.subscriberOptout = value;
    }
    /**
     * Sets the subUseCases property value. Selected sub-use cases for a mixed campaign.
     * @param value Value to set for the subUseCases property.
     */
    public void setSubUseCases(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.subUseCases = value;
    }
    /**
     * Sets the termsAndConditions property value. Acceptance of the carrier campaign terms.
     * @param value Value to set for the termsAndConditions property.
     */
    public void setTermsAndConditions(@jakarta.annotation.Nullable final Boolean value) {
        this.termsAndConditions = value;
    }
    /**
     * Sets the termsUrl property value. Public terms-of-service URL governing the messaging program.
     * @param value Value to set for the termsUrl property.
     */
    public void setTermsUrl(@jakarta.annotation.Nullable final String value) {
        this.termsUrl = value;
    }
    /**
     * Sets the trustedFormRequired property value. Whether TrustedForm required applies to this 10DLC application draft.
     * @param value Value to set for the trustedFormRequired property.
     */
    public void setTrustedFormRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.trustedFormRequired = value;
    }
    /**
     * Sets the updatedAt property value. UTC timestamp for updated at on this 10DLC application draft.
     * @param value Value to set for the updatedAt property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
    /**
     * Sets the useCase property value. Use case for this 10DLC application draft.
     * @param value Value to set for the useCase property.
     */
    public void setUseCase(@jakarta.annotation.Nullable final String value) {
        this.useCase = value;
    }
    /**
     * Sets the useCaseDescription property value. Use case description for this 10DLC application draft.
     * @param value Value to set for the useCaseDescription property.
     */
    public void setUseCaseDescription(@jakarta.annotation.Nullable final String value) {
        this.useCaseDescription = value;
    }
    /**
     * Sets the version property value. Version for this 10DLC application draft.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.version = value;
    }
    /**
     * Sets the websiteUrl property value. Public business website URL submitted to carriers during brand review.
     * @param value Value to set for the websiteUrl property.
     */
    public void setWebsiteUrl(@jakarta.annotation.Nullable final String value) {
        this.websiteUrl = value;
    }
}
