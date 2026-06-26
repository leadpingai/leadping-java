package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Public Leadping API schema for phone number location data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberLocation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Latitude and longitude coordinate for this phone number location.
     */
    private PhoneNumberLocationCoordinate coordinate;
    /**
     * Country code for the phone number or location represented by this phone number location.
     */
    private String countryCode;
    /**
     * Geographic location metadata for the phone number, lead, or lookup result.
     */
    private String location;
    /**
     * State, province, or region for the lead or business postal address.
     */
    private String state;
    /**
     * IANA or Windows time zone identifier used for local scheduling and reporting.
     */
    private String timeZoneId;
    /**
     * Instantiates a new {@link PhoneNumberLocation} and sets the default values.
     */
    public PhoneNumberLocation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberLocation}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberLocation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberLocation();
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
     * Gets the coordinate property value. Latitude and longitude coordinate for this phone number location.
     * @return a {@link PhoneNumberLocationCoordinate}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberLocationCoordinate getCoordinate() {
        return this.coordinate;
    }
    /**
     * Gets the countryCode property value. Country code for the phone number or location represented by this phone number location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountryCode() {
        return this.countryCode;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("coordinate", (n) -> { this.setCoordinate(n.getObjectValue(PhoneNumberLocationCoordinate::createFromDiscriminatorValue)); });
        deserializerMap.put("countryCode", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("timeZoneId", (n) -> { this.setTimeZoneId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the location property value. Geographic location metadata for the phone number, lead, or lookup result.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocation() {
        return this.location;
    }
    /**
     * Gets the state property value. State, province, or region for the lead or business postal address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.state;
    }
    /**
     * Gets the timeZoneId property value. IANA or Windows time zone identifier used for local scheduling and reporting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimeZoneId() {
        return this.timeZoneId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("coordinate", this.getCoordinate());
        writer.writeStringValue("countryCode", this.getCountryCode());
        writer.writeStringValue("location", this.getLocation());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("timeZoneId", this.getTimeZoneId());
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
     * Sets the coordinate property value. Latitude and longitude coordinate for this phone number location.
     * @param value Value to set for the coordinate property.
     */
    public void setCoordinate(@jakarta.annotation.Nullable final PhoneNumberLocationCoordinate value) {
        this.coordinate = value;
    }
    /**
     * Sets the countryCode property value. Country code for the phone number or location represented by this phone number location.
     * @param value Value to set for the countryCode property.
     */
    public void setCountryCode(@jakarta.annotation.Nullable final String value) {
        this.countryCode = value;
    }
    /**
     * Sets the location property value. Geographic location metadata for the phone number, lead, or lookup result.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final String value) {
        this.location = value;
    }
    /**
     * Sets the state property value. State, province, or region for the lead or business postal address.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.state = value;
    }
    /**
     * Sets the timeZoneId property value. IANA or Windows time zone identifier used for local scheduling and reporting.
     * @param value Value to set for the timeZoneId property.
     */
    public void setTimeZoneId(@jakarta.annotation.Nullable final String value) {
        this.timeZoneId = value;
    }
}
