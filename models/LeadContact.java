package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Public Leadping API schema for lead contact profile data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadContact implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Latitude and longitude coordinate for this lead contact profile.
     */
    private LeadContactCoordinate coordinate;
    /**
     * Email address for the person represented by this lead contact profile.
     */
    private String email;
    /**
     * First name of the lead, user, or contact represented by this lead contact profile.
     */
    private String firstName;
    /**
     * Last name of the lead, user, or contact represented by this lead contact profile.
     */
    private String lastName;
    /**
     * Phone details for the lead, user, or business represented by this lead contact profile.
     */
    private LeadContactPhone phone;
    /**
     * Postal street address for the lead contact profile.
     */
    private LeadContactStreetAddress streetAddress;
    /**
     * IANA or Windows time zone identifier used for local scheduling and reporting.
     */
    private String timeZoneId;
    /**
     * Instantiates a new {@link LeadContact} and sets the default values.
     */
    public LeadContact() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadContact}
     */
    @jakarta.annotation.Nonnull
    public static LeadContact createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadContact();
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
     * Gets the coordinate property value. Latitude and longitude coordinate for this lead contact profile.
     * @return a {@link LeadContactCoordinate}
     */
    @jakarta.annotation.Nullable
    public LeadContactCoordinate getCoordinate() {
        return this.coordinate;
    }
    /**
     * Gets the email property value. Email address for the person represented by this lead contact profile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("coordinate", (n) -> { this.setCoordinate(n.getObjectValue(LeadContactCoordinate::createFromDiscriminatorValue)); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getObjectValue(LeadContactPhone::createFromDiscriminatorValue)); });
        deserializerMap.put("streetAddress", (n) -> { this.setStreetAddress(n.getObjectValue(LeadContactStreetAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("timeZoneId", (n) -> { this.setTimeZoneId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstName property value. First name of the lead, user, or contact represented by this lead contact profile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the lastName property value. Last name of the lead, user, or contact represented by this lead contact profile.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the phone property value. Phone details for the lead, user, or business represented by this lead contact profile.
     * @return a {@link LeadContactPhone}
     */
    @jakarta.annotation.Nullable
    public LeadContactPhone getPhone() {
        return this.phone;
    }
    /**
     * Gets the streetAddress property value. Postal street address for the lead contact profile.
     * @return a {@link LeadContactStreetAddress}
     */
    @jakarta.annotation.Nullable
    public LeadContactStreetAddress getStreetAddress() {
        return this.streetAddress;
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
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeObjectValue("phone", this.getPhone());
        writer.writeObjectValue("streetAddress", this.getStreetAddress());
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
     * Sets the coordinate property value. Latitude and longitude coordinate for this lead contact profile.
     * @param value Value to set for the coordinate property.
     */
    public void setCoordinate(@jakarta.annotation.Nullable final LeadContactCoordinate value) {
        this.coordinate = value;
    }
    /**
     * Sets the email property value. Email address for the person represented by this lead contact profile.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the firstName property value. First name of the lead, user, or contact represented by this lead contact profile.
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the lastName property value. Last name of the lead, user, or contact represented by this lead contact profile.
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the phone property value. Phone details for the lead, user, or business represented by this lead contact profile.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final LeadContactPhone value) {
        this.phone = value;
    }
    /**
     * Sets the streetAddress property value. Postal street address for the lead contact profile.
     * @param value Value to set for the streetAddress property.
     */
    public void setStreetAddress(@jakarta.annotation.Nullable final LeadContactStreetAddress value) {
        this.streetAddress = value;
    }
    /**
     * Sets the timeZoneId property value. IANA or Windows time zone identifier used for local scheduling and reporting.
     * @param value Value to set for the timeZoneId property.
     */
    public void setTimeZoneId(@jakarta.annotation.Nullable final String value) {
        this.timeZoneId = value;
    }
}
