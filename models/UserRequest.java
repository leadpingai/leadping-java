package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Request schema for the Leadping API user profile request, including the fields clients can send.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Defines the supported Billing Plan values.
     */
    private UserRequestBillingPlan billingPlan;
    /**
     * User compliance settings and attestations captured for Leadping account review.
     */
    private UserRequestCompliance compliance;
    /**
     * Business currently selected for the user session or profile.
     */
    private UserRequestCurrentBusiness currentBusiness;
    /**
     * Email address for the person represented by this user profile request.
     */
    private String email;
    /**
     * First name of the lead, user, or contact represented by this user profile request.
     */
    private String firstName;
    /**
     * The unique identifier for the entity, when updating an existing entity.
     */
    private String id;
    /**
     * Last name of the lead, user, or contact represented by this user profile request.
     */
    private String lastName;
    /**
     * Mobile notification preferences configured for the user.
     */
    private java.util.List<MobileDevicePreferences> mobileDevicePreferences;
    /**
     * The display name for the entity.
     */
    private String name;
    /**
     * Notification preferences configured for the user.
     */
    private UserRequestNotificationPreferences notificationPreferences;
    /**
     * Phone details for the lead, user, or business represented by this user profile request.
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
     * Gets the billingPlan property value. Defines the supported Billing Plan values.
     * @return a {@link UserRequestBillingPlan}
     */
    @jakarta.annotation.Nullable
    public UserRequestBillingPlan getBillingPlan() {
        return this.billingPlan;
    }
    /**
     * Gets the compliance property value. User compliance settings and attestations captured for Leadping account review.
     * @return a {@link UserRequestCompliance}
     */
    @jakarta.annotation.Nullable
    public UserRequestCompliance getCompliance() {
        return this.compliance;
    }
    /**
     * Gets the currentBusiness property value. Business currently selected for the user session or profile.
     * @return a {@link UserRequestCurrentBusiness}
     */
    @jakarta.annotation.Nullable
    public UserRequestCurrentBusiness getCurrentBusiness() {
        return this.currentBusiness;
    }
    /**
     * Gets the email property value. Email address for the person represented by this user profile request.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("billingPlan", (n) -> { this.setBillingPlan(n.getEnumValue(UserRequestBillingPlan::forValue)); });
        deserializerMap.put("compliance", (n) -> { this.setCompliance(n.getObjectValue(UserRequestCompliance::createFromDiscriminatorValue)); });
        deserializerMap.put("currentBusiness", (n) -> { this.setCurrentBusiness(n.getObjectValue(UserRequestCurrentBusiness::createFromDiscriminatorValue)); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("mobileDevicePreferences", (n) -> { this.setMobileDevicePreferences(n.getCollectionOfObjectValues(MobileDevicePreferences::createFromDiscriminatorValue)); });
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
     * Gets the id property value. The unique identifier for the entity, when updating an existing entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
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
     * Gets the mobileDevicePreferences property value. Mobile notification preferences configured for the user.
     * @return a {@link java.util.List<MobileDevicePreferences>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileDevicePreferences> getMobileDevicePreferences() {
        return this.mobileDevicePreferences;
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
     * Gets the notificationPreferences property value. Notification preferences configured for the user.
     * @return a {@link UserRequestNotificationPreferences}
     */
    @jakarta.annotation.Nullable
    public UserRequestNotificationPreferences getNotificationPreferences() {
        return this.notificationPreferences;
    }
    /**
     * Gets the phone property value. Phone details for the lead, user, or business represented by this user profile request.
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
        writer.writeEnumValue("billingPlan", this.getBillingPlan());
        writer.writeObjectValue("compliance", this.getCompliance());
        writer.writeObjectValue("currentBusiness", this.getCurrentBusiness());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeCollectionOfObjectValues("mobileDevicePreferences", this.getMobileDevicePreferences());
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
     * Sets the billingPlan property value. Defines the supported Billing Plan values.
     * @param value Value to set for the billingPlan property.
     */
    public void setBillingPlan(@jakarta.annotation.Nullable final UserRequestBillingPlan value) {
        this.billingPlan = value;
    }
    /**
     * Sets the compliance property value. User compliance settings and attestations captured for Leadping account review.
     * @param value Value to set for the compliance property.
     */
    public void setCompliance(@jakarta.annotation.Nullable final UserRequestCompliance value) {
        this.compliance = value;
    }
    /**
     * Sets the currentBusiness property value. Business currently selected for the user session or profile.
     * @param value Value to set for the currentBusiness property.
     */
    public void setCurrentBusiness(@jakarta.annotation.Nullable final UserRequestCurrentBusiness value) {
        this.currentBusiness = value;
    }
    /**
     * Sets the email property value. Email address for the person represented by this user profile request.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the firstName property value. First name of the lead, user, or contact represented by this user profile request.
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the id property value. The unique identifier for the entity, when updating an existing entity.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the lastName property value. Last name of the lead, user, or contact represented by this user profile request.
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the mobileDevicePreferences property value. Mobile notification preferences configured for the user.
     * @param value Value to set for the mobileDevicePreferences property.
     */
    public void setMobileDevicePreferences(@jakarta.annotation.Nullable final java.util.List<MobileDevicePreferences> value) {
        this.mobileDevicePreferences = value;
    }
    /**
     * Sets the name property value. The display name for the entity.
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
     * Sets the phone property value. Phone details for the lead, user, or business represented by this user profile request.
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
