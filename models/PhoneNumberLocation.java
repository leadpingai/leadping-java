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
     * Canonical city resolved by Leadping from its ZIP-code geography data.
     */
    private String canonicalCity;
    /**
     * Canonical state or territory abbreviation resolved by Leadping.
     */
    private String canonicalState;
    /**
     * Latitude and longitude coordinate for this phone number location.
     */
    private PhoneNumberLocationCoordinate coordinate;
    /**
     * Describes how the coordinate was resolved.
     */
    private PhoneNumberLocationCoordinateSource coordinateSource;
    /**
     * Country code for the phone number or location represented by this phone number location.
     */
    private String countryCode;
    /**
     * Geographic location metadata for the phone number, lead, or lookup result.
     */
    private String location;
    /**
     * State, province, or region for the lead or organization postal address.
     */
    private String state;
    /**
     * IANA or Windows time zone identifier used for local scheduling and reporting.
     */
    private String timeZoneId;
    /**
     * Describes how the time zone was resolved.
     */
    private PhoneNumberLocationTimeZoneSource timeZoneSource;
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
     * Gets the canonicalCity property value. Canonical city resolved by Leadping from its ZIP-code geography data.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCanonicalCity() {
        return this.canonicalCity;
    }
    /**
     * Gets the canonicalState property value. Canonical state or territory abbreviation resolved by Leadping.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCanonicalState() {
        return this.canonicalState;
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
     * Gets the coordinateSource property value. Describes how the coordinate was resolved.
     * @return a {@link PhoneNumberLocationCoordinateSource}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberLocationCoordinateSource getCoordinateSource() {
        return this.coordinateSource;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("canonicalCity", (n) -> { this.setCanonicalCity(n.getStringValue()); });
        deserializerMap.put("canonicalState", (n) -> { this.setCanonicalState(n.getStringValue()); });
        deserializerMap.put("coordinate", (n) -> { this.setCoordinate(n.getObjectValue(PhoneNumberLocationCoordinate::createFromDiscriminatorValue)); });
        deserializerMap.put("coordinateSource", (n) -> { this.setCoordinateSource(n.getObjectValue(PhoneNumberLocationCoordinateSource::createFromDiscriminatorValue)); });
        deserializerMap.put("countryCode", (n) -> { this.setCountryCode(n.getStringValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        deserializerMap.put("timeZoneId", (n) -> { this.setTimeZoneId(n.getStringValue()); });
        deserializerMap.put("timeZoneSource", (n) -> { this.setTimeZoneSource(n.getObjectValue(PhoneNumberLocationTimeZoneSource::createFromDiscriminatorValue)); });
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
     * Gets the state property value. State, province, or region for the lead or organization postal address.
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
     * Gets the timeZoneSource property value. Describes how the time zone was resolved.
     * @return a {@link PhoneNumberLocationTimeZoneSource}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberLocationTimeZoneSource getTimeZoneSource() {
        return this.timeZoneSource;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("canonicalCity", this.getCanonicalCity());
        writer.writeStringValue("canonicalState", this.getCanonicalState());
        writer.writeObjectValue("coordinate", this.getCoordinate());
        writer.writeObjectValue("coordinateSource", this.getCoordinateSource());
        writer.writeStringValue("countryCode", this.getCountryCode());
        writer.writeStringValue("location", this.getLocation());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("timeZoneId", this.getTimeZoneId());
        writer.writeObjectValue("timeZoneSource", this.getTimeZoneSource());
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
     * Sets the canonicalCity property value. Canonical city resolved by Leadping from its ZIP-code geography data.
     * @param value Value to set for the canonicalCity property.
     */
    public void setCanonicalCity(@jakarta.annotation.Nullable final String value) {
        this.canonicalCity = value;
    }
    /**
     * Sets the canonicalState property value. Canonical state or territory abbreviation resolved by Leadping.
     * @param value Value to set for the canonicalState property.
     */
    public void setCanonicalState(@jakarta.annotation.Nullable final String value) {
        this.canonicalState = value;
    }
    /**
     * Sets the coordinate property value. Latitude and longitude coordinate for this phone number location.
     * @param value Value to set for the coordinate property.
     */
    public void setCoordinate(@jakarta.annotation.Nullable final PhoneNumberLocationCoordinate value) {
        this.coordinate = value;
    }
    /**
     * Sets the coordinateSource property value. Describes how the coordinate was resolved.
     * @param value Value to set for the coordinateSource property.
     */
    public void setCoordinateSource(@jakarta.annotation.Nullable final PhoneNumberLocationCoordinateSource value) {
        this.coordinateSource = value;
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
     * Sets the state property value. State, province, or region for the lead or organization postal address.
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
    /**
     * Sets the timeZoneSource property value. Describes how the time zone was resolved.
     * @param value Value to set for the timeZoneSource property.
     */
    public void setTimeZoneSource(@jakarta.annotation.Nullable final PhoneNumberLocationTimeZoneSource value) {
        this.timeZoneSource = value;
    }
}
