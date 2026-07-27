package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Complete carrier metadata returned by a phone number lookup provider.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneLookupCarrier implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Reason or diagnostic code that explains the current outcome for this Leadping phone lookup carrier.
     */
    private String errorCode;
    /**
     * Mobile country code (MCC) reported by the carrier lookup.
     */
    private String mobileCountryCode;
    /**
     * Mobile network code (MNC) reported by the carrier lookup.
     */
    private String mobileNetworkCode;
    /**
     * Human-readable name of the phone lookup carrier.
     */
    private String name;
    /**
     * Normalized carrier name used for consistent matching and reporting.
     */
    private String normalizedCarrier;
    /**
     * An enumerator describing carrier types
     */
    private PhoneLookupCarrierType type;
    /**
     * Instantiates a new {@link PhoneLookupCarrier} and sets the default values.
     */
    public PhoneLookupCarrier() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneLookupCarrier}
     */
    @jakarta.annotation.Nonnull
    public static PhoneLookupCarrier createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneLookupCarrier();
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
     * Gets the errorCode property value. Reason or diagnostic code that explains the current outcome for this Leadping phone lookup carrier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getStringValue()); });
        deserializerMap.put("mobileCountryCode", (n) -> { this.setMobileCountryCode(n.getStringValue()); });
        deserializerMap.put("mobileNetworkCode", (n) -> { this.setMobileNetworkCode(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("normalizedCarrier", (n) -> { this.setNormalizedCarrier(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(PhoneLookupCarrierType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mobileCountryCode property value. Mobile country code (MCC) reported by the carrier lookup.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMobileCountryCode() {
        return this.mobileCountryCode;
    }
    /**
     * Gets the mobileNetworkCode property value. Mobile network code (MNC) reported by the carrier lookup.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMobileNetworkCode() {
        return this.mobileNetworkCode;
    }
    /**
     * Gets the name property value. Human-readable name of the phone lookup carrier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the normalizedCarrier property value. Normalized carrier name used for consistent matching and reporting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNormalizedCarrier() {
        return this.normalizedCarrier;
    }
    /**
     * Gets the type property value. An enumerator describing carrier types
     * @return a {@link PhoneLookupCarrierType}
     */
    @jakarta.annotation.Nullable
    public PhoneLookupCarrierType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeStringValue("mobileCountryCode", this.getMobileCountryCode());
        writer.writeStringValue("mobileNetworkCode", this.getMobileNetworkCode());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("normalizedCarrier", this.getNormalizedCarrier());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the errorCode property value. Reason or diagnostic code that explains the current outcome for this Leadping phone lookup carrier.
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final String value) {
        this.errorCode = value;
    }
    /**
     * Sets the mobileCountryCode property value. Mobile country code (MCC) reported by the carrier lookup.
     * @param value Value to set for the mobileCountryCode property.
     */
    public void setMobileCountryCode(@jakarta.annotation.Nullable final String value) {
        this.mobileCountryCode = value;
    }
    /**
     * Sets the mobileNetworkCode property value. Mobile network code (MNC) reported by the carrier lookup.
     * @param value Value to set for the mobileNetworkCode property.
     */
    public void setMobileNetworkCode(@jakarta.annotation.Nullable final String value) {
        this.mobileNetworkCode = value;
    }
    /**
     * Sets the name property value. Human-readable name of the phone lookup carrier.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the normalizedCarrier property value. Normalized carrier name used for consistent matching and reporting.
     * @param value Value to set for the normalizedCarrier property.
     */
    public void setNormalizedCarrier(@jakarta.annotation.Nullable final String value) {
        this.normalizedCarrier = value;
    }
    /**
     * Sets the type property value. An enumerator describing carrier types
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final PhoneLookupCarrierType value) {
        this.type = value;
    }
}
