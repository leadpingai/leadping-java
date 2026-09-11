package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Returns a newly issued source credential exactly once.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SourceCredentialIssueResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Newly issued source credential. Leadping does not retain this plaintext value.
     */
    private String secret;
    /**
     * Describes lead source data returned by Leadping.
     */
    private SourceResponse source;
    /**
     * Instantiates a new {@link SourceCredentialIssueResponse} and sets the default values.
     */
    public SourceCredentialIssueResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SourceCredentialIssueResponse}
     */
    @jakarta.annotation.Nonnull
    public static SourceCredentialIssueResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SourceCredentialIssueResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("secret", (n) -> { this.setSecret(n.getStringValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getObjectValue(SourceResponse::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the secret property value. Newly issued source credential. Leadping does not retain this plaintext value.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecret() {
        return this.secret;
    }
    /**
     * Gets the source property value. Describes lead source data returned by Leadping.
     * @return a {@link SourceResponse}
     */
    @jakarta.annotation.Nullable
    public SourceResponse getSource() {
        return this.source;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("secret", this.getSecret());
        writer.writeObjectValue("source", this.getSource());
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
     * Sets the secret property value. Newly issued source credential. Leadping does not retain this plaintext value.
     * @param value Value to set for the secret property.
     */
    public void setSecret(@jakarta.annotation.Nullable final String value) {
        this.secret = value;
    }
    /**
     * Sets the source property value. Describes lead source data returned by Leadping.
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final SourceResponse value) {
        this.source = value;
    }
}
