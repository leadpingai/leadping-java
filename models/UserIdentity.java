package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a user&apos;s sign-in identity, including information about the identity provider and method of authentication.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserIdentity implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Identity provider or tenant that issued the user&apos;s sign-in identity.
     */
    private String issuer;
    /**
     * Unique user identifier assigned by the identity provider.
     */
    private String issuerAssignedId;
    /**
     * Sign-in method represented by the identity, such as email address, username, or federated login.
     */
    private String signInType;
    /**
     * Instantiates a new {@link UserIdentity} and sets the default values.
     */
    public UserIdentity() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserIdentity}
     */
    @jakarta.annotation.Nonnull
    public static UserIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserIdentity();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("issuer", (n) -> { this.setIssuer(n.getStringValue()); });
        deserializerMap.put("issuerAssignedId", (n) -> { this.setIssuerAssignedId(n.getStringValue()); });
        deserializerMap.put("signInType", (n) -> { this.setSignInType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issuer property value. Identity provider or tenant that issued the user&apos;s sign-in identity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssuer() {
        return this.issuer;
    }
    /**
     * Gets the issuerAssignedId property value. Unique user identifier assigned by the identity provider.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssuerAssignedId() {
        return this.issuerAssignedId;
    }
    /**
     * Gets the signInType property value. Sign-in method represented by the identity, such as email address, username, or federated login.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignInType() {
        return this.signInType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("issuer", this.getIssuer());
        writer.writeStringValue("issuerAssignedId", this.getIssuerAssignedId());
        writer.writeStringValue("signInType", this.getSignInType());
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
     * Sets the issuer property value. Identity provider or tenant that issued the user&apos;s sign-in identity.
     * @param value Value to set for the issuer property.
     */
    public void setIssuer(@jakarta.annotation.Nullable final String value) {
        this.issuer = value;
    }
    /**
     * Sets the issuerAssignedId property value. Unique user identifier assigned by the identity provider.
     * @param value Value to set for the issuerAssignedId property.
     */
    public void setIssuerAssignedId(@jakarta.annotation.Nullable final String value) {
        this.issuerAssignedId = value;
    }
    /**
     * Sets the signInType property value. Sign-in method represented by the identity, such as email address, username, or federated login.
     * @param value Value to set for the signInType property.
     */
    public void setSignInType(@jakarta.annotation.Nullable final String value) {
        this.signInType = value;
    }
}
