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
 * Response schema for a canonical phone identity returned by the Leadping API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneIdentityResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time when the entity was created.
     */
    private OffsetDateTime createdAt;
    /**
     * The unique identifier for the entity.
     */
    private String id;
    /**
     * The most recent time lookup data was enriched.
     */
    private OffsetDateTime lastEnrichedAt;
    /**
     * Provider lookup and enrichment data for the number.
     */
    private PhoneIdentityResponseLookup lookup;
    /**
     * The date and time when the entity was last modified, if applicable.
     */
    private OffsetDateTime modifiedAt;
    /**
     * The display name for the entity.
     */
    private String name;
    /**
     * The canonical E.164 phone number.
     */
    private String number;
    /**
     * Lossless provider response retained for administrative diagnostics.
     */
    private PhoneIdentityResponseProviderEnrichment providerEnrichment;
    /**
     * Instantiates a new {@link PhoneIdentityResponse} and sets the default values.
     */
    public PhoneIdentityResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneIdentityResponse}
     */
    @jakarta.annotation.Nonnull
    public static PhoneIdentityResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneIdentityResponse();
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
     * Gets the createdAt property value. The date and time when the entity was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("lastEnrichedAt", (n) -> { this.setLastEnrichedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lookup", (n) -> { this.setLookup(n.getObjectValue(PhoneIdentityResponseLookup::createFromDiscriminatorValue)); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("providerEnrichment", (n) -> { this.setProviderEnrichment(n.getObjectValue(PhoneIdentityResponseProviderEnrichment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique identifier for the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the lastEnrichedAt property value. The most recent time lookup data was enriched.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastEnrichedAt() {
        return this.lastEnrichedAt;
    }
    /**
     * Gets the lookup property value. Provider lookup and enrichment data for the number.
     * @return a {@link PhoneIdentityResponseLookup}
     */
    @jakarta.annotation.Nullable
    public PhoneIdentityResponseLookup getLookup() {
        return this.lookup;
    }
    /**
     * Gets the modifiedAt property value. The date and time when the entity was last modified, if applicable.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the name property value. The display name for the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the number property value. The canonical E.164 phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.number;
    }
    /**
     * Gets the providerEnrichment property value. Lossless provider response retained for administrative diagnostics.
     * @return a {@link PhoneIdentityResponseProviderEnrichment}
     */
    @jakarta.annotation.Nullable
    public PhoneIdentityResponseProviderEnrichment getProviderEnrichment() {
        return this.providerEnrichment;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("lastEnrichedAt", this.getLastEnrichedAt());
        writer.writeObjectValue("lookup", this.getLookup());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("number", this.getNumber());
        writer.writeObjectValue("providerEnrichment", this.getProviderEnrichment());
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
     * Sets the createdAt property value. The date and time when the entity was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the id property value. The unique identifier for the entity.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the lastEnrichedAt property value. The most recent time lookup data was enriched.
     * @param value Value to set for the lastEnrichedAt property.
     */
    public void setLastEnrichedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastEnrichedAt = value;
    }
    /**
     * Sets the lookup property value. Provider lookup and enrichment data for the number.
     * @param value Value to set for the lookup property.
     */
    public void setLookup(@jakarta.annotation.Nullable final PhoneIdentityResponseLookup value) {
        this.lookup = value;
    }
    /**
     * Sets the modifiedAt property value. The date and time when the entity was last modified, if applicable.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the name property value. The display name for the entity.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the number property value. The canonical E.164 phone number.
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.number = value;
    }
    /**
     * Sets the providerEnrichment property value. Lossless provider response retained for administrative diagnostics.
     * @param value Value to set for the providerEnrichment property.
     */
    public void setProviderEnrichment(@jakarta.annotation.Nullable final PhoneIdentityResponseProviderEnrichment value) {
        this.providerEnrichment = value;
    }
}
