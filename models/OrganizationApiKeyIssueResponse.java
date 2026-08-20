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
 * Returns a newly issued organization API key and its identifying metadata; the secret credential is shown only in this response.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationApiKeyIssueResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * API key associated with this Leadping organization API key issue.
     */
    private OrganizationApiKeyPreviewResponse apiKey;
    /**
     * Date and time when the organization API key issue expires.
     */
    private OffsetDateTime expiresAt;
    /**
     * Secret token returned once when the Leadping API key is issued.
     */
    private String secret;
    /**
     * Instantiates a new {@link OrganizationApiKeyIssueResponse} and sets the default values.
     */
    public OrganizationApiKeyIssueResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationApiKeyIssueResponse}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationApiKeyIssueResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationApiKeyIssueResponse();
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
     * Gets the apiKey property value. API key associated with this Leadping organization API key issue.
     * @return a {@link OrganizationApiKeyPreviewResponse}
     */
    @jakarta.annotation.Nullable
    public OrganizationApiKeyPreviewResponse getApiKey() {
        return this.apiKey;
    }
    /**
     * Gets the expiresAt property value. Date and time when the organization API key issue expires.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("apiKey", (n) -> { this.setApiKey(n.getObjectValue(OrganizationApiKeyPreviewResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("expiresAt", (n) -> { this.setExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("secret", (n) -> { this.setSecret(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the secret property value. Secret token returned once when the Leadping API key is issued.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecret() {
        return this.secret;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("apiKey", this.getApiKey());
        writer.writeOffsetDateTimeValue("expiresAt", this.getExpiresAt());
        writer.writeStringValue("secret", this.getSecret());
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
     * Sets the apiKey property value. API key associated with this Leadping organization API key issue.
     * @param value Value to set for the apiKey property.
     */
    public void setApiKey(@jakarta.annotation.Nullable final OrganizationApiKeyPreviewResponse value) {
        this.apiKey = value;
    }
    /**
     * Sets the expiresAt property value. Date and time when the organization API key issue expires.
     * @param value Value to set for the expiresAt property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expiresAt = value;
    }
    /**
     * Sets the secret property value. Secret token returned once when the Leadping API key is issued.
     * @param value Value to set for the secret property.
     */
    public void setSecret(@jakarta.annotation.Nullable final String value) {
        this.secret = value;
    }
}
