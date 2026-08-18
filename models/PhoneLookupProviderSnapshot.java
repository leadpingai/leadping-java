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
 * Lossless provider snapshot retained with a phone identity for replay, audits, and fields added by providers later.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneLookupProviderSnapshot implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The provider lookup product or operation that produced this snapshot.
     */
    private String lookupType;
    /**
     * The provider that supplied the phone lookup record.
     */
    private String provider;
    /**
     * The complete provider response serialized as JSON for lossless audit and replay.
     */
    private String rawRecordJson;
    /**
     * The UTC timestamp when Leadping retrieved the provider record.
     */
    private OffsetDateTime retrievedAt;
    /**
     * The Leadping schema version used to interpret the stored provider record.
     */
    private Integer schemaVersion;
    /**
     * Instantiates a new {@link PhoneLookupProviderSnapshot} and sets the default values.
     */
    public PhoneLookupProviderSnapshot() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneLookupProviderSnapshot}
     */
    @jakarta.annotation.Nonnull
    public static PhoneLookupProviderSnapshot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneLookupProviderSnapshot();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("lookupType", (n) -> { this.setLookupType(n.getStringValue()); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getStringValue()); });
        deserializerMap.put("rawRecordJson", (n) -> { this.setRawRecordJson(n.getStringValue()); });
        deserializerMap.put("retrievedAt", (n) -> { this.setRetrievedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("schemaVersion", (n) -> { this.setSchemaVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lookupType property value. The provider lookup product or operation that produced this snapshot.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLookupType() {
        return this.lookupType;
    }
    /**
     * Gets the provider property value. The provider that supplied the phone lookup record.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProvider() {
        return this.provider;
    }
    /**
     * Gets the rawRecordJson property value. The complete provider response serialized as JSON for lossless audit and replay.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRawRecordJson() {
        return this.rawRecordJson;
    }
    /**
     * Gets the retrievedAt property value. The UTC timestamp when Leadping retrieved the provider record.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRetrievedAt() {
        return this.retrievedAt;
    }
    /**
     * Gets the schemaVersion property value. The Leadping schema version used to interpret the stored provider record.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSchemaVersion() {
        return this.schemaVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("lookupType", this.getLookupType());
        writer.writeStringValue("provider", this.getProvider());
        writer.writeStringValue("rawRecordJson", this.getRawRecordJson());
        writer.writeOffsetDateTimeValue("retrievedAt", this.getRetrievedAt());
        writer.writeIntegerValue("schemaVersion", this.getSchemaVersion());
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
     * Sets the lookupType property value. The provider lookup product or operation that produced this snapshot.
     * @param value Value to set for the lookupType property.
     */
    public void setLookupType(@jakarta.annotation.Nullable final String value) {
        this.lookupType = value;
    }
    /**
     * Sets the provider property value. The provider that supplied the phone lookup record.
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final String value) {
        this.provider = value;
    }
    /**
     * Sets the rawRecordJson property value. The complete provider response serialized as JSON for lossless audit and replay.
     * @param value Value to set for the rawRecordJson property.
     */
    public void setRawRecordJson(@jakarta.annotation.Nullable final String value) {
        this.rawRecordJson = value;
    }
    /**
     * Sets the retrievedAt property value. The UTC timestamp when Leadping retrieved the provider record.
     * @param value Value to set for the retrievedAt property.
     */
    public void setRetrievedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.retrievedAt = value;
    }
    /**
     * Sets the schemaVersion property value. The Leadping schema version used to interpret the stored provider record.
     * @param value Value to set for the schemaVersion property.
     */
    public void setSchemaVersion(@jakarta.annotation.Nullable final Integer value) {
        this.schemaVersion = value;
    }
}
