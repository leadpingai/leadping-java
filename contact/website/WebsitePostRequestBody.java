package ai.leadping.openapi.contact.website;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WebsitePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The CompanyWebsite property
     */
    private String companyWebsite;
    /**
     * The Email property
     */
    private String email;
    /**
     * The Message property
     */
    private String message;
    /**
     * The Name property
     */
    private String name;
    /**
     * The Phone property
     */
    private String phone;
    /**
     * The ReturnUrl property
     */
    private String returnUrl;
    /**
     * The SmsConsent property
     */
    private Boolean smsConsent;
    /**
     * Instantiates a new {@link WebsitePostRequestBody} and sets the default values.
     */
    public WebsitePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WebsitePostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static WebsitePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WebsitePostRequestBody();
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
     * Gets the CompanyWebsite property value. The CompanyWebsite property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompanyWebsite() {
        return this.companyWebsite;
    }
    /**
     * Gets the Email property value. The Email property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("CompanyWebsite", (n) -> { this.setCompanyWebsite(n.getStringValue()); });
        deserializerMap.put("Email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("Message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("Name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("Phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("ReturnUrl", (n) -> { this.setReturnUrl(n.getStringValue()); });
        deserializerMap.put("SmsConsent", (n) -> { this.setSmsConsent(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the Message property value. The Message property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the Name property value. The Name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the Phone property value. The Phone property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the ReturnUrl property value. The ReturnUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReturnUrl() {
        return this.returnUrl;
    }
    /**
     * Gets the SmsConsent property value. The SmsConsent property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSmsConsent() {
        return this.smsConsent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("CompanyWebsite", this.getCompanyWebsite());
        writer.writeStringValue("Email", this.getEmail());
        writer.writeStringValue("Message", this.getMessage());
        writer.writeStringValue("Name", this.getName());
        writer.writeStringValue("Phone", this.getPhone());
        writer.writeStringValue("ReturnUrl", this.getReturnUrl());
        writer.writeBooleanValue("SmsConsent", this.getSmsConsent());
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
     * Sets the CompanyWebsite property value. The CompanyWebsite property
     * @param value Value to set for the CompanyWebsite property.
     */
    public void setCompanyWebsite(@jakarta.annotation.Nullable final String value) {
        this.companyWebsite = value;
    }
    /**
     * Sets the Email property value. The Email property
     * @param value Value to set for the Email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the Message property value. The Message property
     * @param value Value to set for the Message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the Name property value. The Name property
     * @param value Value to set for the Name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the Phone property value. The Phone property
     * @param value Value to set for the Phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the ReturnUrl property value. The ReturnUrl property
     * @param value Value to set for the ReturnUrl property.
     */
    public void setReturnUrl(@jakarta.annotation.Nullable final String value) {
        this.returnUrl = value;
    }
    /**
     * Sets the SmsConsent property value. The SmsConsent property
     * @param value Value to set for the SmsConsent property.
     */
    public void setSmsConsent(@jakarta.annotation.Nullable final Boolean value) {
        this.smsConsent = value;
    }
}
