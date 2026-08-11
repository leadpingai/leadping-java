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
 * Describes ten dlc application draft data used in Leadping API requests and responses.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenDlcApplicationDraft implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The current provider review status for the submitted brand.
     */
    private TenDlcRegistrationStatus brandStatus;
    /**
     * The current provider review status for the submitted campaign.
     */
    private TenDlcRegistrationStatus campaignStatus;
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
     * EIN for this 10DLC application draft.
     */
    private String ein;
    /**
     * Expected monthly volume for this 10DLC application draft.
     */
    private UntypedNode expectedMonthlyVolume;
    /**
     * The Telnyx brand vertical for this 10DLC application draft. The JSON name is retained for backward compatibility.
     */
    private String industry;
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
     * Opt in language for this 10DLC application draft.
     */
    private String optInLanguage;
    /**
     * Public privacy-policy URL that explains how messaging recipient data is handled.
     */
    private String privacyPolicyUrl;
    /**
     * The human-readable rejection reason explaining this 10DLC application draft.
     */
    private String rejectionReason;
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
    private UntypedNode version;
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
     * Gets the brandStatus property value. The current provider review status for the submitted brand.
     * @return a {@link TenDlcRegistrationStatus}
     */
    @jakarta.annotation.Nullable
    public TenDlcRegistrationStatus getBrandStatus() {
        return this.brandStatus;
    }
    /**
     * Gets the campaignStatus property value. The current provider review status for the submitted campaign.
     * @return a {@link TenDlcRegistrationStatus}
     */
    @jakarta.annotation.Nullable
    public TenDlcRegistrationStatus getCampaignStatus() {
        return this.campaignStatus;
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
     * Gets the ein property value. EIN for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEin() {
        return this.ein;
    }
    /**
     * Gets the expectedMonthlyVolume property value. Expected monthly volume for this 10DLC application draft.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getExpectedMonthlyVolume() {
        return this.expectedMonthlyVolume;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(23);
        deserializerMap.put("brandStatus", (n) -> { this.setBrandStatus(n.getEnumValue(TenDlcRegistrationStatus::forValue)); });
        deserializerMap.put("campaignStatus", (n) -> { this.setCampaignStatus(n.getEnumValue(TenDlcRegistrationStatus::forValue)); });
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("complianceWarnings", (n) -> { this.setComplianceWarnings(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("contactEmail", (n) -> { this.setContactEmail(n.getStringValue()); });
        deserializerMap.put("contactName", (n) -> { this.setContactName(n.getStringValue()); });
        deserializerMap.put("contactPhone", (n) -> { this.setContactPhone(n.getStringValue()); });
        deserializerMap.put("ein", (n) -> { this.setEin(n.getStringValue()); });
        deserializerMap.put("expectedMonthlyVolume", (n) -> { this.setExpectedMonthlyVolume(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("industry", (n) -> { this.setIndustry(n.getStringValue()); });
        deserializerMap.put("lastSubmittedAt", (n) -> { this.setLastSubmittedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("messageExamples", (n) -> { this.setMessageExamples(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("missingFields", (n) -> { this.setMissingFields(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("optInLanguage", (n) -> { this.setOptInLanguage(n.getStringValue()); });
        deserializerMap.put("privacyPolicyUrl", (n) -> { this.setPrivacyPolicyUrl(n.getStringValue()); });
        deserializerMap.put("rejectionReason", (n) -> { this.setRejectionReason(n.getStringValue()); });
        deserializerMap.put("termsUrl", (n) -> { this.setTermsUrl(n.getStringValue()); });
        deserializerMap.put("trustedFormRequired", (n) -> { this.setTrustedFormRequired(n.getBooleanValue()); });
        deserializerMap.put("updatedAt", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("useCase", (n) -> { this.setUseCase(n.getStringValue()); });
        deserializerMap.put("useCaseDescription", (n) -> { this.setUseCaseDescription(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("websiteUrl", (n) -> { this.setWebsiteUrl(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the optInLanguage property value. Opt in language for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOptInLanguage() {
        return this.optInLanguage;
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
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getVersion() {
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
        writer.writeEnumValue("brandStatus", this.getBrandStatus());
        writer.writeEnumValue("campaignStatus", this.getCampaignStatus());
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeCollectionOfPrimitiveValues("complianceWarnings", this.getComplianceWarnings());
        writer.writeStringValue("contactEmail", this.getContactEmail());
        writer.writeStringValue("contactName", this.getContactName());
        writer.writeStringValue("contactPhone", this.getContactPhone());
        writer.writeStringValue("ein", this.getEin());
        writer.writeObjectValue("expectedMonthlyVolume", this.getExpectedMonthlyVolume());
        writer.writeStringValue("industry", this.getIndustry());
        writer.writeOffsetDateTimeValue("lastSubmittedAt", this.getLastSubmittedAt());
        writer.writeCollectionOfPrimitiveValues("messageExamples", this.getMessageExamples());
        writer.writeCollectionOfPrimitiveValues("missingFields", this.getMissingFields());
        writer.writeStringValue("optInLanguage", this.getOptInLanguage());
        writer.writeStringValue("privacyPolicyUrl", this.getPrivacyPolicyUrl());
        writer.writeStringValue("rejectionReason", this.getRejectionReason());
        writer.writeStringValue("termsUrl", this.getTermsUrl());
        writer.writeBooleanValue("trustedFormRequired", this.getTrustedFormRequired());
        writer.writeOffsetDateTimeValue("updatedAt", this.getUpdatedAt());
        writer.writeStringValue("useCase", this.getUseCase());
        writer.writeStringValue("useCaseDescription", this.getUseCaseDescription());
        writer.writeObjectValue("version", this.getVersion());
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
     * Sets the brandStatus property value. The current provider review status for the submitted brand.
     * @param value Value to set for the brandStatus property.
     */
    public void setBrandStatus(@jakarta.annotation.Nullable final TenDlcRegistrationStatus value) {
        this.brandStatus = value;
    }
    /**
     * Sets the campaignStatus property value. The current provider review status for the submitted campaign.
     * @param value Value to set for the campaignStatus property.
     */
    public void setCampaignStatus(@jakarta.annotation.Nullable final TenDlcRegistrationStatus value) {
        this.campaignStatus = value;
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
     * Sets the ein property value. EIN for this 10DLC application draft.
     * @param value Value to set for the ein property.
     */
    public void setEin(@jakarta.annotation.Nullable final String value) {
        this.ein = value;
    }
    /**
     * Sets the expectedMonthlyVolume property value. Expected monthly volume for this 10DLC application draft.
     * @param value Value to set for the expectedMonthlyVolume property.
     */
    public void setExpectedMonthlyVolume(@jakarta.annotation.Nullable final UntypedNode value) {
        this.expectedMonthlyVolume = value;
    }
    /**
     * Sets the industry property value. The Telnyx brand vertical for this 10DLC application draft. The JSON name is retained for backward compatibility.
     * @param value Value to set for the industry property.
     */
    public void setIndustry(@jakarta.annotation.Nullable final String value) {
        this.industry = value;
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
     * Sets the optInLanguage property value. Opt in language for this 10DLC application draft.
     * @param value Value to set for the optInLanguage property.
     */
    public void setOptInLanguage(@jakarta.annotation.Nullable final String value) {
        this.optInLanguage = value;
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
    public void setVersion(@jakarta.annotation.Nullable final UntypedNode value) {
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
