package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * API DTO containing user compliance data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserCompliance implements AdditionalDataHolder, Parsable {
    /**
     * Whether the user accepted BAA for this user compliance.
     */
    private Boolean acceptedBaa;
    /**
     * Whether the user accepted email for this user compliance.
     */
    private Boolean acceptedEmail;
    /**
     * Whether the user accepted SMS for this user compliance.
     */
    private Boolean acceptedSms;
    /**
     * Whether the user accepted terms for this user compliance.
     */
    private Boolean acceptedTerms;
    /**
     * Whether the user accepted subscription for this user compliance.
     */
    private Boolean acceptedToSubscription;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The TrustedForm certificates included with this user compliance.
     */
    private java.util.List<TrustedFormCertificate> trustedFormCertificates;
    /**
     * Instantiates a new {@link UserCompliance} and sets the default values.
     */
    public UserCompliance() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserCompliance}
     */
    @jakarta.annotation.Nonnull
    public static UserCompliance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserCompliance();
    }
    /**
     * Gets the acceptedBaa property value. Whether the user accepted BAA for this user compliance.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAcceptedBaa() {
        return this.acceptedBaa;
    }
    /**
     * Gets the acceptedEmail property value. Whether the user accepted email for this user compliance.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAcceptedEmail() {
        return this.acceptedEmail;
    }
    /**
     * Gets the acceptedSms property value. Whether the user accepted SMS for this user compliance.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAcceptedSms() {
        return this.acceptedSms;
    }
    /**
     * Gets the acceptedTerms property value. Whether the user accepted terms for this user compliance.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAcceptedTerms() {
        return this.acceptedTerms;
    }
    /**
     * Gets the acceptedToSubscription property value. Whether the user accepted subscription for this user compliance.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAcceptedToSubscription() {
        return this.acceptedToSubscription;
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("acceptedBaa", (n) -> { this.setAcceptedBaa(n.getBooleanValue()); });
        deserializerMap.put("acceptedEmail", (n) -> { this.setAcceptedEmail(n.getBooleanValue()); });
        deserializerMap.put("acceptedSms", (n) -> { this.setAcceptedSms(n.getBooleanValue()); });
        deserializerMap.put("acceptedTerms", (n) -> { this.setAcceptedTerms(n.getBooleanValue()); });
        deserializerMap.put("acceptedToSubscription", (n) -> { this.setAcceptedToSubscription(n.getBooleanValue()); });
        deserializerMap.put("trustedFormCertificates", (n) -> { this.setTrustedFormCertificates(n.getCollectionOfObjectValues(TrustedFormCertificate::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the trustedFormCertificates property value. The TrustedForm certificates included with this user compliance.
     * @return a {@link java.util.List<TrustedFormCertificate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TrustedFormCertificate> getTrustedFormCertificates() {
        return this.trustedFormCertificates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("acceptedBaa", this.getAcceptedBaa());
        writer.writeBooleanValue("acceptedEmail", this.getAcceptedEmail());
        writer.writeBooleanValue("acceptedSms", this.getAcceptedSms());
        writer.writeBooleanValue("acceptedTerms", this.getAcceptedTerms());
        writer.writeBooleanValue("acceptedToSubscription", this.getAcceptedToSubscription());
        writer.writeCollectionOfObjectValues("trustedFormCertificates", this.getTrustedFormCertificates());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acceptedBaa property value. Whether the user accepted BAA for this user compliance.
     * @param value Value to set for the acceptedBaa property.
     */
    public void setAcceptedBaa(@jakarta.annotation.Nullable final Boolean value) {
        this.acceptedBaa = value;
    }
    /**
     * Sets the acceptedEmail property value. Whether the user accepted email for this user compliance.
     * @param value Value to set for the acceptedEmail property.
     */
    public void setAcceptedEmail(@jakarta.annotation.Nullable final Boolean value) {
        this.acceptedEmail = value;
    }
    /**
     * Sets the acceptedSms property value. Whether the user accepted SMS for this user compliance.
     * @param value Value to set for the acceptedSms property.
     */
    public void setAcceptedSms(@jakarta.annotation.Nullable final Boolean value) {
        this.acceptedSms = value;
    }
    /**
     * Sets the acceptedTerms property value. Whether the user accepted terms for this user compliance.
     * @param value Value to set for the acceptedTerms property.
     */
    public void setAcceptedTerms(@jakarta.annotation.Nullable final Boolean value) {
        this.acceptedTerms = value;
    }
    /**
     * Sets the acceptedToSubscription property value. Whether the user accepted subscription for this user compliance.
     * @param value Value to set for the acceptedToSubscription property.
     */
    public void setAcceptedToSubscription(@jakarta.annotation.Nullable final Boolean value) {
        this.acceptedToSubscription = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the trustedFormCertificates property value. The TrustedForm certificates included with this user compliance.
     * @param value Value to set for the trustedFormCertificates property.
     */
    public void setTrustedFormCertificates(@jakarta.annotation.Nullable final java.util.List<TrustedFormCertificate> value) {
        this.trustedFormCertificates = value;
    }
}
