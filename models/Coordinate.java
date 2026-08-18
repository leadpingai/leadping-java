package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Latitude and longitude coordinate for this lead contact profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Coordinate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Latitude of the geographic coordinate in decimal degrees, from -90 through 90.
     */
    private Double latitude;
    /**
     * Longitude of the geographic coordinate in decimal degrees, from -180 through 180.
     */
    private Double longitude;
    /**
     * Instantiates a new {@link Coordinate} and sets the default values.
     */
    public Coordinate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Coordinate}
     */
    @jakarta.annotation.Nonnull
    public static Coordinate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Coordinate();
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
        deserializerMap.put("latitude", (n) -> { this.setLatitude(n.getDoubleValue()); });
        deserializerMap.put("longitude", (n) -> { this.setLongitude(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the latitude property value. Latitude of the geographic coordinate in decimal degrees, from -90 through 90.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLatitude() {
        return this.latitude;
    }
    /**
     * Gets the longitude property value. Longitude of the geographic coordinate in decimal degrees, from -180 through 180.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLongitude() {
        return this.longitude;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("latitude", this.getLatitude());
        writer.writeDoubleValue("longitude", this.getLongitude());
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
     * Sets the latitude property value. Latitude of the geographic coordinate in decimal degrees, from -90 through 90.
     * @param value Value to set for the latitude property.
     */
    public void setLatitude(@jakarta.annotation.Nullable final Double value) {
        this.latitude = value;
    }
    /**
     * Sets the longitude property value. Longitude of the geographic coordinate in decimal degrees, from -180 through 180.
     * @param value Value to set for the longitude property.
     */
    public void setLongitude(@jakarta.annotation.Nullable final Double value) {
        this.longitude = value;
    }
}
