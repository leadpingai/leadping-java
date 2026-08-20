package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Defines the fields clients can send when working with user profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * First name of the lead, user, or contact represented by this user profile request.
     */
    private String firstName;
    /**
     * Last name of the lead, user, or contact represented by this user profile request.
     */
    private String lastName;
    /**
     * Display name for the user.
     */
    private String name;
    /**
     * Notification preferences configured for the user.
     */
    private UserRequestNotificationPreferences notificationPreferences;
    /**
     * Phone details for the lead, user, or organization represented by this user profile request.
     */
    private String phone;
    /**
     * IANA time zone identifier used when displaying dates and times for this user.
     */
    private String timeZoneId;
    /**
     * Instantiates a new {@link UserRequest} and sets the default values.
     */
    public UserRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserRequest}
     */
    @jakarta.annotation.Nonnull
    public static UserRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserRequest();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("notificationPreferences", (n) -> { this.setNotificationPreferences(n.getObjectValue(UserRequestNotificationPreferences::createFromDiscriminatorValue)); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("timeZoneId", (n) -> { this.setTimeZoneId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstName property value. First name of the lead, user, or contact represented by this user profile request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the lastName property value. Last name of the lead, user, or contact represented by this user profile request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the name property value. Display name for the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the notificationPreferences property value. Notification preferences configured for the user.
     * @return a {@link UserRequestNotificationPreferences}
     */
    @jakarta.annotation.Nullable
    public UserRequestNotificationPreferences getNotificationPreferences() {
        return this.notificationPreferences;
    }
    /**
     * Gets the phone property value. Phone details for the lead, user, or organization represented by this user profile request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the timeZoneId property value. IANA time zone identifier used when displaying dates and times for this user.
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
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("notificationPreferences", this.getNotificationPreferences());
        writer.writeStringValue("phone", this.getPhone());
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
     * Sets the firstName property value. First name of the lead, user, or contact represented by this user profile request.
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the lastName property value. Last name of the lead, user, or contact represented by this user profile request.
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the name property value. Display name for the user.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the notificationPreferences property value. Notification preferences configured for the user.
     * @param value Value to set for the notificationPreferences property.
     */
    public void setNotificationPreferences(@jakarta.annotation.Nullable final UserRequestNotificationPreferences value) {
        this.notificationPreferences = value;
    }
    /**
     * Sets the phone property value. Phone details for the lead, user, or organization represented by this user profile request.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the timeZoneId property value. IANA time zone identifier used when displaying dates and times for this user.
     * @param value Value to set for the timeZoneId property.
     */
    public void setTimeZoneId(@jakarta.annotation.Nullable final String value) {
        this.timeZoneId = value;
    }
}
