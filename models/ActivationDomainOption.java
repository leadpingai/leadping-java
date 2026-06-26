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
 * API DTO containing activation domain option data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActivationDomainOption implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The current availability status for this activation domain option.
     */
    private String availabilityStatus;
    /**
     * The domain name associated with this activation domain option.
     */
    private String domainName;
    /**
     * The estimated annual cost value for this activation domain option.
     */
    private UntypedNode estimatedAnnualCost;
    /**
     * The industry relevance value for this activation domain option.
     */
    private String industryRelevance;
    /**
     * Whether this activation domain option is recommended.
     */
    private Boolean recommended;
    /**
     * The trust concerns value for this activation domain option.
     */
    private String trustConcerns;
    /**
     * The why it fits value for this activation domain option.
     */
    private String whyItFits;
    /**
     * Instantiates a new {@link ActivationDomainOption} and sets the default values.
     */
    public ActivationDomainOption() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ActivationDomainOption}
     */
    @jakarta.annotation.Nonnull
    public static ActivationDomainOption createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActivationDomainOption();
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
     * Gets the availabilityStatus property value. The current availability status for this activation domain option.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAvailabilityStatus() {
        return this.availabilityStatus;
    }
    /**
     * Gets the domainName property value. The domain name associated with this activation domain option.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * Gets the estimatedAnnualCost property value. The estimated annual cost value for this activation domain option.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getEstimatedAnnualCost() {
        return this.estimatedAnnualCost;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("availabilityStatus", (n) -> { this.setAvailabilityStatus(n.getStringValue()); });
        deserializerMap.put("domainName", (n) -> { this.setDomainName(n.getStringValue()); });
        deserializerMap.put("estimatedAnnualCost", (n) -> { this.setEstimatedAnnualCost(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("industryRelevance", (n) -> { this.setIndustryRelevance(n.getStringValue()); });
        deserializerMap.put("recommended", (n) -> { this.setRecommended(n.getBooleanValue()); });
        deserializerMap.put("trustConcerns", (n) -> { this.setTrustConcerns(n.getStringValue()); });
        deserializerMap.put("whyItFits", (n) -> { this.setWhyItFits(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the industryRelevance property value. The industry relevance value for this activation domain option.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIndustryRelevance() {
        return this.industryRelevance;
    }
    /**
     * Gets the recommended property value. Whether this activation domain option is recommended.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRecommended() {
        return this.recommended;
    }
    /**
     * Gets the trustConcerns property value. The trust concerns value for this activation domain option.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTrustConcerns() {
        return this.trustConcerns;
    }
    /**
     * Gets the whyItFits property value. The why it fits value for this activation domain option.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWhyItFits() {
        return this.whyItFits;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("availabilityStatus", this.getAvailabilityStatus());
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeObjectValue("estimatedAnnualCost", this.getEstimatedAnnualCost());
        writer.writeStringValue("industryRelevance", this.getIndustryRelevance());
        writer.writeBooleanValue("recommended", this.getRecommended());
        writer.writeStringValue("trustConcerns", this.getTrustConcerns());
        writer.writeStringValue("whyItFits", this.getWhyItFits());
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
     * Sets the availabilityStatus property value. The current availability status for this activation domain option.
     * @param value Value to set for the availabilityStatus property.
     */
    public void setAvailabilityStatus(@jakarta.annotation.Nullable final String value) {
        this.availabilityStatus = value;
    }
    /**
     * Sets the domainName property value. The domain name associated with this activation domain option.
     * @param value Value to set for the domainName property.
     */
    public void setDomainName(@jakarta.annotation.Nullable final String value) {
        this.domainName = value;
    }
    /**
     * Sets the estimatedAnnualCost property value. The estimated annual cost value for this activation domain option.
     * @param value Value to set for the estimatedAnnualCost property.
     */
    public void setEstimatedAnnualCost(@jakarta.annotation.Nullable final UntypedNode value) {
        this.estimatedAnnualCost = value;
    }
    /**
     * Sets the industryRelevance property value. The industry relevance value for this activation domain option.
     * @param value Value to set for the industryRelevance property.
     */
    public void setIndustryRelevance(@jakarta.annotation.Nullable final String value) {
        this.industryRelevance = value;
    }
    /**
     * Sets the recommended property value. Whether this activation domain option is recommended.
     * @param value Value to set for the recommended property.
     */
    public void setRecommended(@jakarta.annotation.Nullable final Boolean value) {
        this.recommended = value;
    }
    /**
     * Sets the trustConcerns property value. The trust concerns value for this activation domain option.
     * @param value Value to set for the trustConcerns property.
     */
    public void setTrustConcerns(@jakarta.annotation.Nullable final String value) {
        this.trustConcerns = value;
    }
    /**
     * Sets the whyItFits property value. The why it fits value for this activation domain option.
     * @param value Value to set for the whyItFits property.
     */
    public void setWhyItFits(@jakarta.annotation.Nullable final String value) {
        this.whyItFits = value;
    }
}
