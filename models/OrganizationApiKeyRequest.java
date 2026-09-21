package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Defines the display name and access configuration for a new Leadping organization API key.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationApiKeyRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of days before the key expires. Null means no expiration.
     */
    private Integer expiresInDays;
    /**
     * Human-readable name used to identify the key.
     */
    private String name;
    /**
     * WorkOS permission slugs granted to the API key.
     */
    private java.util.List<String> permissions;
    /**
     * Instantiates a new {@link OrganizationApiKeyRequest} and sets the default values.
     */
    public OrganizationApiKeyRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationApiKeyRequest}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationApiKeyRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationApiKeyRequest();
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
     * Gets the expiresInDays property value. Number of days before the key expires. Null means no expiration.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getExpiresInDays() {
        return this.expiresInDays;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("expiresInDays", (n) -> { this.setExpiresInDays(n.getIntegerValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Human-readable name used to identify the key.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the permissions property value. WorkOS permission slugs granted to the API key.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("expiresInDays", this.getExpiresInDays());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfPrimitiveValues("permissions", this.getPermissions());
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
     * Sets the expiresInDays property value. Number of days before the key expires. Null means no expiration.
     * @param value Value to set for the expiresInDays property.
     */
    public void setExpiresInDays(@jakarta.annotation.Nullable final Integer value) {
        this.expiresInDays = value;
    }
    /**
     * Sets the name property value. Human-readable name used to identify the key.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the permissions property value. WorkOS permission slugs granted to the API key.
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.permissions = value;
    }
}
