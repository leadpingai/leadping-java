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
 * Safe identifying and usage metadata for an organization API key. This model never contains the secret credential.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationApiKeyPreviewResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Date and time when Leadping began tracking the API key.
     */
    private OffsetDateTime createdAt;
    /**
     * Whether the API key can currently authenticate requests.
     */
    private Boolean enabled;
    /**
     * Date and time when the API key expires, or null when it does not expire.
     */
    private OffsetDateTime expiresAt;
    /**
     * Date and time when the API key was first used.
     */
    private OffsetDateTime firstUsedAt;
    /**
     * Unique identifier of the API key.
     */
    private String id;
    /**
     * Date and time when the API key was issued.
     */
    private OffsetDateTime issuedAt;
    /**
     * Date and time when the API key was last used.
     */
    private OffsetDateTime lastUsedAt;
    /**
     * Date and time when the tracked API-key metadata was last modified.
     */
    private OffsetDateTime modifiedAt;
    /**
     * Human-readable name of the API key.
     */
    private String name;
    /**
     * Organization that owns the API key.
     */
    private IdNamePair organization;
    /**
     * Permission slugs granted to the API key.
     */
    private java.util.List<String> permissions;
    /**
     * Masked value that can be used to identify the key without revealing its secret.
     */
    private String preview;
    /**
     * Total number of tracked uses.
     */
    private Long totalUses;
    /**
     * Instantiates a new {@link OrganizationApiKeyPreviewResponse} and sets the default values.
     */
    public OrganizationApiKeyPreviewResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationApiKeyPreviewResponse}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationApiKeyPreviewResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationApiKeyPreviewResponse();
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
     * Gets the createdAt property value. Date and time when Leadping began tracking the API key.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the enabled property value. Whether the API key can currently authenticate requests.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * Gets the expiresAt property value. Date and time when the API key expires, or null when it does not expire.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("expiresAt", (n) -> { this.setExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("firstUsedAt", (n) -> { this.setFirstUsedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("issuedAt", (n) -> { this.setIssuedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastUsedAt", (n) -> { this.setLastUsedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getObjectValue(IdNamePair::createFromDiscriminatorValue)); });
        deserializerMap.put("permissions", (n) -> { this.setPermissions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("preview", (n) -> { this.setPreview(n.getStringValue()); });
        deserializerMap.put("totalUses", (n) -> { this.setTotalUses(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstUsedAt property value. Date and time when the API key was first used.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstUsedAt() {
        return this.firstUsedAt;
    }
    /**
     * Gets the id property value. Unique identifier of the API key.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the issuedAt property value. Date and time when the API key was issued.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getIssuedAt() {
        return this.issuedAt;
    }
    /**
     * Gets the lastUsedAt property value. Date and time when the API key was last used.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUsedAt() {
        return this.lastUsedAt;
    }
    /**
     * Gets the modifiedAt property value. Date and time when the tracked API-key metadata was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the name property value. Human-readable name of the API key.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the organization property value. Organization that owns the API key.
     * @return a {@link IdNamePair}
     */
    @jakarta.annotation.Nullable
    public IdNamePair getOrganization() {
        return this.organization;
    }
    /**
     * Gets the permissions property value. Permission slugs granted to the API key.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }
    /**
     * Gets the preview property value. Masked value that can be used to identify the key without revealing its secret.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPreview() {
        return this.preview;
    }
    /**
     * Gets the totalUses property value. Total number of tracked uses.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTotalUses() {
        return this.totalUses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeOffsetDateTimeValue("expiresAt", this.getExpiresAt());
        writer.writeOffsetDateTimeValue("firstUsedAt", this.getFirstUsedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("issuedAt", this.getIssuedAt());
        writer.writeOffsetDateTimeValue("lastUsedAt", this.getLastUsedAt());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("organization", this.getOrganization());
        writer.writeCollectionOfPrimitiveValues("permissions", this.getPermissions());
        writer.writeStringValue("preview", this.getPreview());
        writer.writeLongValue("totalUses", this.getTotalUses());
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
     * Sets the createdAt property value. Date and time when Leadping began tracking the API key.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the enabled property value. Whether the API key can currently authenticate requests.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the expiresAt property value. Date and time when the API key expires, or null when it does not expire.
     * @param value Value to set for the expiresAt property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expiresAt = value;
    }
    /**
     * Sets the firstUsedAt property value. Date and time when the API key was first used.
     * @param value Value to set for the firstUsedAt property.
     */
    public void setFirstUsedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.firstUsedAt = value;
    }
    /**
     * Sets the id property value. Unique identifier of the API key.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the issuedAt property value. Date and time when the API key was issued.
     * @param value Value to set for the issuedAt property.
     */
    public void setIssuedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.issuedAt = value;
    }
    /**
     * Sets the lastUsedAt property value. Date and time when the API key was last used.
     * @param value Value to set for the lastUsedAt property.
     */
    public void setLastUsedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUsedAt = value;
    }
    /**
     * Sets the modifiedAt property value. Date and time when the tracked API-key metadata was last modified.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the name property value. Human-readable name of the API key.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the organization property value. Organization that owns the API key.
     * @param value Value to set for the organization property.
     */
    public void setOrganization(@jakarta.annotation.Nullable final IdNamePair value) {
        this.organization = value;
    }
    /**
     * Sets the permissions property value. Permission slugs granted to the API key.
     * @param value Value to set for the permissions property.
     */
    public void setPermissions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.permissions = value;
    }
    /**
     * Sets the preview property value. Masked value that can be used to identify the key without revealing its secret.
     * @param value Value to set for the preview property.
     */
    public void setPreview(@jakarta.annotation.Nullable final String value) {
        this.preview = value;
    }
    /**
     * Sets the totalUses property value. Total number of tracked uses.
     * @param value Value to set for the totalUses property.
     */
    public void setTotalUses(@jakarta.annotation.Nullable final Long value) {
        this.totalUses = value;
    }
}
