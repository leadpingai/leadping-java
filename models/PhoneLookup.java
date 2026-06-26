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
 * Public Leadping API schema for phone lookup result data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneLookup implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An enumerator describing carrier types
     */
    private PhoneLookupCarrierType carrierType;
    /**
     * Gets or sets created at.
     */
    private OffsetDateTime createdAt;
    /**
     * Gets or sets id.
     */
    private String id;
    /**
     * Indicates whether this phone lookup result passed validation.
     */
    private Boolean isValid;
    /**
     * An enumerator describing phone line types
     */
    private PhoneLookupLineType lineType;
    /**
     * Geographic location metadata for the phone number, lead, or lookup result.
     */
    private PhoneLookupLocation location;
    /**
     * Gets or sets modified at.
     */
    private OffsetDateTime modifiedAt;
    /**
     * E.164 phone number exposed by this phone lookup result.
     */
    private String number;
    /**
     * Instantiates a new {@link PhoneLookup} and sets the default values.
     */
    public PhoneLookup() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneLookup}
     */
    @jakarta.annotation.Nonnull
    public static PhoneLookup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneLookup();
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
     * Gets the carrierType property value. An enumerator describing carrier types
     * @return a {@link PhoneLookupCarrierType}
     */
    @jakarta.annotation.Nullable
    public PhoneLookupCarrierType getCarrierType() {
        return this.carrierType;
    }
    /**
     * Gets the createdAt property value. Gets or sets created at.
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
        deserializerMap.put("carrierType", (n) -> { this.setCarrierType(n.getEnumValue(PhoneLookupCarrierType::forValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isValid", (n) -> { this.setIsValid(n.getBooleanValue()); });
        deserializerMap.put("lineType", (n) -> { this.setLineType(n.getEnumValue(PhoneLookupLineType::forValue)); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(PhoneLookupLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Gets or sets id.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isValid property value. Indicates whether this phone lookup result passed validation.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsValid() {
        return this.isValid;
    }
    /**
     * Gets the lineType property value. An enumerator describing phone line types
     * @return a {@link PhoneLookupLineType}
     */
    @jakarta.annotation.Nullable
    public PhoneLookupLineType getLineType() {
        return this.lineType;
    }
    /**
     * Gets the location property value. Geographic location metadata for the phone number, lead, or lookup result.
     * @return a {@link PhoneLookupLocation}
     */
    @jakarta.annotation.Nullable
    public PhoneLookupLocation getLocation() {
        return this.location;
    }
    /**
     * Gets the modifiedAt property value. Gets or sets modified at.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the number property value. E.164 phone number exposed by this phone lookup result.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.number;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("carrierType", this.getCarrierType());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isValid", this.getIsValid());
        writer.writeEnumValue("lineType", this.getLineType());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("number", this.getNumber());
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
     * Sets the carrierType property value. An enumerator describing carrier types
     * @param value Value to set for the carrierType property.
     */
    public void setCarrierType(@jakarta.annotation.Nullable final PhoneLookupCarrierType value) {
        this.carrierType = value;
    }
    /**
     * Sets the createdAt property value. Gets or sets created at.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the id property value. Gets or sets id.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isValid property value. Indicates whether this phone lookup result passed validation.
     * @param value Value to set for the isValid property.
     */
    public void setIsValid(@jakarta.annotation.Nullable final Boolean value) {
        this.isValid = value;
    }
    /**
     * Sets the lineType property value. An enumerator describing phone line types
     * @param value Value to set for the lineType property.
     */
    public void setLineType(@jakarta.annotation.Nullable final PhoneLookupLineType value) {
        this.lineType = value;
    }
    /**
     * Sets the location property value. Geographic location metadata for the phone number, lead, or lookup result.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final PhoneLookupLocation value) {
        this.location = value;
    }
    /**
     * Sets the modifiedAt property value. Gets or sets modified at.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the number property value. E.164 phone number exposed by this phone lookup result.
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.number = value;
    }
}
