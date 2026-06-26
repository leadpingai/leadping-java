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
 * API DTO containing ten dlc application draft data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TenDlcApplicationDraft implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The company name value for this 10DLC application draft.
     */
    private String companyName;
    /**
     * The compliance warnings included with this 10DLC application draft.
     */
    private java.util.List<String> complianceWarnings;
    /**
     * The contact email value for this 10DLC application draft.
     */
    private String contactEmail;
    /**
     * The contact name value for this 10DLC application draft.
     */
    private String contactName;
    /**
     * The contact phone value for this 10DLC application draft.
     */
    private String contactPhone;
    /**
     * The EIN value for this 10DLC application draft.
     */
    private String ein;
    /**
     * The expected monthly volume value for this 10DLC application draft.
     */
    private UntypedNode expectedMonthlyVolume;
    /**
     * The industry value for this 10DLC application draft.
     */
    private String industry;
    /**
     * The date and time for the last submitted at value on this 10DLC application draft.
     */
    private OffsetDateTime lastSubmittedAt;
    /**
     * The lead source value for this 10DLC application draft.
     */
    private String leadSource;
    /**
     * The message examples included with this 10DLC application draft.
     */
    private java.util.List<String> messageExamples;
    /**
     * The missing fields included with this 10DLC application draft.
     */
    private java.util.List<String> missingFields;
    /**
     * The opt in language value for this 10DLC application draft.
     */
    private String optInLanguage;
    /**
     * The URL associated with this 10DLC application draft.
     */
    private String privacyPolicyUrl;
    /**
     * The human-readable rejection reason explaining this 10DLC application draft.
     */
    private String rejectionReason;
    /**
     * The URL associated with this 10DLC application draft.
     */
    private String termsUrl;
    /**
     * Whether TrustedForm required applies to this 10DLC application draft.
     */
    private Boolean trustedFormRequired;
    /**
     * The date and time for the updated at value on this 10DLC application draft.
     */
    private OffsetDateTime updatedAt;
    /**
     * The use case value for this 10DLC application draft.
     */
    private String useCase;
    /**
     * The use case description value for this 10DLC application draft.
     */
    private String useCaseDescription;
    /**
     * The version value for this 10DLC application draft.
     */
    private Integer version;
    /**
     * The URL associated with this 10DLC application draft.
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
     * Gets the companyName property value. The company name value for this 10DLC application draft.
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
     * Gets the contactEmail property value. The contact email value for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContactEmail() {
        return this.contactEmail;
    }
    /**
     * Gets the contactName property value. The contact name value for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContactName() {
        return this.contactName;
    }
    /**
     * Gets the contactPhone property value. The contact phone value for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContactPhone() {
        return this.contactPhone;
    }
    /**
     * Gets the ein property value. The EIN value for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEin() {
        return this.ein;
    }
    /**
     * Gets the expectedMonthlyVolume property value. The expected monthly volume value for this 10DLC application draft.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(22);
        deserializerMap.put("companyName", (n) -> { this.setCompanyName(n.getStringValue()); });
        deserializerMap.put("complianceWarnings", (n) -> { this.setComplianceWarnings(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("contactEmail", (n) -> { this.setContactEmail(n.getStringValue()); });
        deserializerMap.put("contactName", (n) -> { this.setContactName(n.getStringValue()); });
        deserializerMap.put("contactPhone", (n) -> { this.setContactPhone(n.getStringValue()); });
        deserializerMap.put("ein", (n) -> { this.setEin(n.getStringValue()); });
        deserializerMap.put("expectedMonthlyVolume", (n) -> { this.setExpectedMonthlyVolume(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("industry", (n) -> { this.setIndustry(n.getStringValue()); });
        deserializerMap.put("lastSubmittedAt", (n) -> { this.setLastSubmittedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("leadSource", (n) -> { this.setLeadSource(n.getStringValue()); });
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
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        deserializerMap.put("websiteUrl", (n) -> { this.setWebsiteUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the industry property value. The industry value for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIndustry() {
        return this.industry;
    }
    /**
     * Gets the lastSubmittedAt property value. The date and time for the last submitted at value on this 10DLC application draft.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSubmittedAt() {
        return this.lastSubmittedAt;
    }
    /**
     * Gets the leadSource property value. The lead source value for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLeadSource() {
        return this.leadSource;
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
     * Gets the optInLanguage property value. The opt in language value for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOptInLanguage() {
        return this.optInLanguage;
    }
    /**
     * Gets the privacyPolicyUrl property value. The URL associated with this 10DLC application draft.
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
     * Gets the termsUrl property value. The URL associated with this 10DLC application draft.
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
     * Gets the updatedAt property value. The date and time for the updated at value on this 10DLC application draft.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Gets the useCase property value. The use case value for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUseCase() {
        return this.useCase;
    }
    /**
     * Gets the useCaseDescription property value. The use case description value for this 10DLC application draft.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUseCaseDescription() {
        return this.useCaseDescription;
    }
    /**
     * Gets the version property value. The version value for this 10DLC application draft.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.version;
    }
    /**
     * Gets the websiteUrl property value. The URL associated with this 10DLC application draft.
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
        writer.writeStringValue("companyName", this.getCompanyName());
        writer.writeCollectionOfPrimitiveValues("complianceWarnings", this.getComplianceWarnings());
        writer.writeStringValue("contactEmail", this.getContactEmail());
        writer.writeStringValue("contactName", this.getContactName());
        writer.writeStringValue("contactPhone", this.getContactPhone());
        writer.writeStringValue("ein", this.getEin());
        writer.writeObjectValue("expectedMonthlyVolume", this.getExpectedMonthlyVolume());
        writer.writeStringValue("industry", this.getIndustry());
        writer.writeOffsetDateTimeValue("lastSubmittedAt", this.getLastSubmittedAt());
        writer.writeStringValue("leadSource", this.getLeadSource());
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
     * Sets the companyName property value. The company name value for this 10DLC application draft.
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
     * Sets the contactEmail property value. The contact email value for this 10DLC application draft.
     * @param value Value to set for the contactEmail property.
     */
    public void setContactEmail(@jakarta.annotation.Nullable final String value) {
        this.contactEmail = value;
    }
    /**
     * Sets the contactName property value. The contact name value for this 10DLC application draft.
     * @param value Value to set for the contactName property.
     */
    public void setContactName(@jakarta.annotation.Nullable final String value) {
        this.contactName = value;
    }
    /**
     * Sets the contactPhone property value. The contact phone value for this 10DLC application draft.
     * @param value Value to set for the contactPhone property.
     */
    public void setContactPhone(@jakarta.annotation.Nullable final String value) {
        this.contactPhone = value;
    }
    /**
     * Sets the ein property value. The EIN value for this 10DLC application draft.
     * @param value Value to set for the ein property.
     */
    public void setEin(@jakarta.annotation.Nullable final String value) {
        this.ein = value;
    }
    /**
     * Sets the expectedMonthlyVolume property value. The expected monthly volume value for this 10DLC application draft.
     * @param value Value to set for the expectedMonthlyVolume property.
     */
    public void setExpectedMonthlyVolume(@jakarta.annotation.Nullable final UntypedNode value) {
        this.expectedMonthlyVolume = value;
    }
    /**
     * Sets the industry property value. The industry value for this 10DLC application draft.
     * @param value Value to set for the industry property.
     */
    public void setIndustry(@jakarta.annotation.Nullable final String value) {
        this.industry = value;
    }
    /**
     * Sets the lastSubmittedAt property value. The date and time for the last submitted at value on this 10DLC application draft.
     * @param value Value to set for the lastSubmittedAt property.
     */
    public void setLastSubmittedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSubmittedAt = value;
    }
    /**
     * Sets the leadSource property value. The lead source value for this 10DLC application draft.
     * @param value Value to set for the leadSource property.
     */
    public void setLeadSource(@jakarta.annotation.Nullable final String value) {
        this.leadSource = value;
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
     * Sets the optInLanguage property value. The opt in language value for this 10DLC application draft.
     * @param value Value to set for the optInLanguage property.
     */
    public void setOptInLanguage(@jakarta.annotation.Nullable final String value) {
        this.optInLanguage = value;
    }
    /**
     * Sets the privacyPolicyUrl property value. The URL associated with this 10DLC application draft.
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
     * Sets the termsUrl property value. The URL associated with this 10DLC application draft.
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
     * Sets the updatedAt property value. The date and time for the updated at value on this 10DLC application draft.
     * @param value Value to set for the updatedAt property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
    /**
     * Sets the useCase property value. The use case value for this 10DLC application draft.
     * @param value Value to set for the useCase property.
     */
    public void setUseCase(@jakarta.annotation.Nullable final String value) {
        this.useCase = value;
    }
    /**
     * Sets the useCaseDescription property value. The use case description value for this 10DLC application draft.
     * @param value Value to set for the useCaseDescription property.
     */
    public void setUseCaseDescription(@jakarta.annotation.Nullable final String value) {
        this.useCaseDescription = value;
    }
    /**
     * Sets the version property value. The version value for this 10DLC application draft.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.version = value;
    }
    /**
     * Sets the websiteUrl property value. The URL associated with this 10DLC application draft.
     * @param value Value to set for the websiteUrl property.
     */
    public void setWebsiteUrl(@jakarta.annotation.Nullable final String value) {
        this.websiteUrl = value;
    }
}
