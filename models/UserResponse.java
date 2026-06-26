package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * API response containing user data returned to callers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Defines the supported Billing Plan values.
     */
    private UserResponseBillingPlan billingPlan;
    /**
     * The business value for this user.
     */
    private UserResponseBusiness business;
    /**
     * The compliance value for this user.
     */
    private UserResponseCompliance compliance;
    /**
     * The date and time when the entity was created.
     */
    private OffsetDateTime createdAt;
    /**
     * The current business value for this user.
     */
    private UserResponseCurrentBusiness currentBusiness;
    /**
     * The email address associated with this user.
     */
    private String email;
    /**
     * The first name value for this user.
     */
    private String firstName;
    /**
     * The unique identifier for the entity.
     */
    private String id;
    /**
     * The identities included with this user.
     */
    private java.util.List<UserIdentity> identities;
    /**
     * The date and time when this user last completed the Leadping sign-in flow.
     */
    private OffsetDateTime lastLoggedInAt;
    /**
     * The date and time for the last name value on this user.
     */
    private String lastName;
    /**
     * The Leadping mobile device preferences for this user.
     */
    private java.util.List<MobileDevicePreferences> mobileDevicePreferences;
    /**
     * The date and time when the entity was last modified, if applicable.
     */
    private OffsetDateTime modifiedAt;
    /**
     * The display name for the entity.
     */
    private String name;
    /**
     * The notification preferences value for this user.
     */
    private UserResponseNotificationPreferences notificationPreferences;
    /**
     * The date and time for the personal data deleted at value on this user.
     */
    private OffsetDateTime personalDataDeletedAt;
    /**
     * The human-readable personal data deletion reason explaining this user.
     */
    private String personalDataDeletionReason;
    /**
     * The date and time for the personal data deletion requested at value on this user.
     */
    private OffsetDateTime personalDataDeletionRequestedAt;
    /**
     * The current personal data deletion status for this user.
     */
    private String personalDataDeletionStatus;
    /**
     * The phone number associated with this user.
     */
    private String phone;
    /**
     * The roles included with this user.
     */
    private UntypedNode roles;
    /**
     * The Stripe info value for this user.
     */
    private UserResponseStripeInfo stripeInfo;
    /**
     * Defines the supported Subscription Status values.
     */
    private UserResponseSubscriptionStatus subscriptionStatus;
    /**
     * Instantiates a new {@link UserResponse} and sets the default values.
     */
    public UserResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserResponse}
     */
    @jakarta.annotation.Nonnull
    public static UserResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserResponse();
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
     * @return a {@link UserResponseBillingPlan}
     */
    @jakarta.annotation.Nullable
    public UserResponseBillingPlan getBillingPlan() {
        return this.billingPlan;
    }
    /**
     * Gets the business property value. The business value for this user.
     * @return a {@link UserResponseBusiness}
     */
    @jakarta.annotation.Nullable
    public UserResponseBusiness getBusiness() {
        return this.business;
    }
    /**
     * Gets the compliance property value. The compliance value for this user.
     * @return a {@link UserResponseCompliance}
     */
    @jakarta.annotation.Nullable
    public UserResponseCompliance getCompliance() {
        return this.compliance;
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
     * Gets the currentBusiness property value. The current business value for this user.
     * @return a {@link UserResponseCurrentBusiness}
     */
    @jakarta.annotation.Nullable
    public UserResponseCurrentBusiness getCurrentBusiness() {
        return this.currentBusiness;
    }
    /**
     * Gets the email property value. The email address associated with this user.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(23);
        deserializerMap.put("billingPlan", (n) -> { this.setBillingPlan(n.getEnumValue(UserResponseBillingPlan::forValue)); });
        deserializerMap.put("business", (n) -> { this.setBusiness(n.getObjectValue(UserResponseBusiness::createFromDiscriminatorValue)); });
        deserializerMap.put("compliance", (n) -> { this.setCompliance(n.getObjectValue(UserResponseCompliance::createFromDiscriminatorValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("currentBusiness", (n) -> { this.setCurrentBusiness(n.getObjectValue(UserResponseCurrentBusiness::createFromDiscriminatorValue)); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("firstName", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("identities", (n) -> { this.setIdentities(n.getCollectionOfObjectValues(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("lastLoggedInAt", (n) -> { this.setLastLoggedInAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastName", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("mobileDevicePreferences", (n) -> { this.setMobileDevicePreferences(n.getCollectionOfObjectValues(MobileDevicePreferences::createFromDiscriminatorValue)); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("notificationPreferences", (n) -> { this.setNotificationPreferences(n.getObjectValue(UserResponseNotificationPreferences::createFromDiscriminatorValue)); });
        deserializerMap.put("personalDataDeletedAt", (n) -> { this.setPersonalDataDeletedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("personalDataDeletionReason", (n) -> { this.setPersonalDataDeletionReason(n.getStringValue()); });
        deserializerMap.put("personalDataDeletionRequestedAt", (n) -> { this.setPersonalDataDeletionRequestedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("personalDataDeletionStatus", (n) -> { this.setPersonalDataDeletionStatus(n.getStringValue()); });
        deserializerMap.put("phone", (n) -> { this.setPhone(n.getStringValue()); });
        deserializerMap.put("roles", (n) -> { this.setRoles(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("stripeInfo", (n) -> { this.setStripeInfo(n.getObjectValue(UserResponseStripeInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("subscriptionStatus", (n) -> { this.setSubscriptionStatus(n.getEnumValue(UserResponseSubscriptionStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstName property value. The first name value for this user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
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
     * Gets the identities property value. The identities included with this user.
     * @return a {@link java.util.List<UserIdentity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserIdentity> getIdentities() {
        return this.identities;
    }
    /**
     * Gets the lastLoggedInAt property value. The date and time when this user last completed the Leadping sign-in flow.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastLoggedInAt() {
        return this.lastLoggedInAt;
    }
    /**
     * Gets the lastName property value. The date and time for the last name value on this user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the mobileDevicePreferences property value. The Leadping mobile device preferences for this user.
     * @return a {@link java.util.List<MobileDevicePreferences>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MobileDevicePreferences> getMobileDevicePreferences() {
        return this.mobileDevicePreferences;
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
     * Gets the notificationPreferences property value. The notification preferences value for this user.
     * @return a {@link UserResponseNotificationPreferences}
     */
    @jakarta.annotation.Nullable
    public UserResponseNotificationPreferences getNotificationPreferences() {
        return this.notificationPreferences;
    }
    /**
     * Gets the personalDataDeletedAt property value. The date and time for the personal data deleted at value on this user.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPersonalDataDeletedAt() {
        return this.personalDataDeletedAt;
    }
    /**
     * Gets the personalDataDeletionReason property value. The human-readable personal data deletion reason explaining this user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPersonalDataDeletionReason() {
        return this.personalDataDeletionReason;
    }
    /**
     * Gets the personalDataDeletionRequestedAt property value. The date and time for the personal data deletion requested at value on this user.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPersonalDataDeletionRequestedAt() {
        return this.personalDataDeletionRequestedAt;
    }
    /**
     * Gets the personalDataDeletionStatus property value. The current personal data deletion status for this user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPersonalDataDeletionStatus() {
        return this.personalDataDeletionStatus;
    }
    /**
     * Gets the phone property value. The phone number associated with this user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhone() {
        return this.phone;
    }
    /**
     * Gets the roles property value. The roles included with this user.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getRoles() {
        return this.roles;
    }
    /**
     * Gets the stripeInfo property value. The Stripe info value for this user.
     * @return a {@link UserResponseStripeInfo}
     */
    @jakarta.annotation.Nullable
    public UserResponseStripeInfo getStripeInfo() {
        return this.stripeInfo;
    }
    /**
     * Gets the subscriptionStatus property value. Defines the supported Subscription Status values.
     * @return a {@link UserResponseSubscriptionStatus}
     */
    @jakarta.annotation.Nullable
    public UserResponseSubscriptionStatus getSubscriptionStatus() {
        return this.subscriptionStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("billingPlan", this.getBillingPlan());
        writer.writeObjectValue("business", this.getBusiness());
        writer.writeObjectValue("compliance", this.getCompliance());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeObjectValue("currentBusiness", this.getCurrentBusiness());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("firstName", this.getFirstName());
        writer.writeStringValue("id", this.getId());
        writer.writeCollectionOfObjectValues("identities", this.getIdentities());
        writer.writeOffsetDateTimeValue("lastLoggedInAt", this.getLastLoggedInAt());
        writer.writeStringValue("lastName", this.getLastName());
        writer.writeCollectionOfObjectValues("mobileDevicePreferences", this.getMobileDevicePreferences());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("notificationPreferences", this.getNotificationPreferences());
        writer.writeOffsetDateTimeValue("personalDataDeletedAt", this.getPersonalDataDeletedAt());
        writer.writeStringValue("personalDataDeletionReason", this.getPersonalDataDeletionReason());
        writer.writeOffsetDateTimeValue("personalDataDeletionRequestedAt", this.getPersonalDataDeletionRequestedAt());
        writer.writeStringValue("personalDataDeletionStatus", this.getPersonalDataDeletionStatus());
        writer.writeStringValue("phone", this.getPhone());
        writer.writeObjectValue("roles", this.getRoles());
        writer.writeObjectValue("stripeInfo", this.getStripeInfo());
        writer.writeEnumValue("subscriptionStatus", this.getSubscriptionStatus());
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
    public void setBillingPlan(@jakarta.annotation.Nullable final UserResponseBillingPlan value) {
        this.billingPlan = value;
    }
    /**
     * Sets the business property value. The business value for this user.
     * @param value Value to set for the business property.
     */
    public void setBusiness(@jakarta.annotation.Nullable final UserResponseBusiness value) {
        this.business = value;
    }
    /**
     * Sets the compliance property value. The compliance value for this user.
     * @param value Value to set for the compliance property.
     */
    public void setCompliance(@jakarta.annotation.Nullable final UserResponseCompliance value) {
        this.compliance = value;
    }
    /**
     * Sets the createdAt property value. The date and time when the entity was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the currentBusiness property value. The current business value for this user.
     * @param value Value to set for the currentBusiness property.
     */
    public void setCurrentBusiness(@jakarta.annotation.Nullable final UserResponseCurrentBusiness value) {
        this.currentBusiness = value;
    }
    /**
     * Sets the email property value. The email address associated with this user.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the firstName property value. The first name value for this user.
     * @param value Value to set for the firstName property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the id property value. The unique identifier for the entity.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the identities property value. The identities included with this user.
     * @param value Value to set for the identities property.
     */
    public void setIdentities(@jakarta.annotation.Nullable final java.util.List<UserIdentity> value) {
        this.identities = value;
    }
    /**
     * Sets the lastLoggedInAt property value. The date and time when this user last completed the Leadping sign-in flow.
     * @param value Value to set for the lastLoggedInAt property.
     */
    public void setLastLoggedInAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastLoggedInAt = value;
    }
    /**
     * Sets the lastName property value. The date and time for the last name value on this user.
     * @param value Value to set for the lastName property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the mobileDevicePreferences property value. The Leadping mobile device preferences for this user.
     * @param value Value to set for the mobileDevicePreferences property.
     */
    public void setMobileDevicePreferences(@jakarta.annotation.Nullable final java.util.List<MobileDevicePreferences> value) {
        this.mobileDevicePreferences = value;
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
     * Sets the notificationPreferences property value. The notification preferences value for this user.
     * @param value Value to set for the notificationPreferences property.
     */
    public void setNotificationPreferences(@jakarta.annotation.Nullable final UserResponseNotificationPreferences value) {
        this.notificationPreferences = value;
    }
    /**
     * Sets the personalDataDeletedAt property value. The date and time for the personal data deleted at value on this user.
     * @param value Value to set for the personalDataDeletedAt property.
     */
    public void setPersonalDataDeletedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.personalDataDeletedAt = value;
    }
    /**
     * Sets the personalDataDeletionReason property value. The human-readable personal data deletion reason explaining this user.
     * @param value Value to set for the personalDataDeletionReason property.
     */
    public void setPersonalDataDeletionReason(@jakarta.annotation.Nullable final String value) {
        this.personalDataDeletionReason = value;
    }
    /**
     * Sets the personalDataDeletionRequestedAt property value. The date and time for the personal data deletion requested at value on this user.
     * @param value Value to set for the personalDataDeletionRequestedAt property.
     */
    public void setPersonalDataDeletionRequestedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.personalDataDeletionRequestedAt = value;
    }
    /**
     * Sets the personalDataDeletionStatus property value. The current personal data deletion status for this user.
     * @param value Value to set for the personalDataDeletionStatus property.
     */
    public void setPersonalDataDeletionStatus(@jakarta.annotation.Nullable final String value) {
        this.personalDataDeletionStatus = value;
    }
    /**
     * Sets the phone property value. The phone number associated with this user.
     * @param value Value to set for the phone property.
     */
    public void setPhone(@jakarta.annotation.Nullable final String value) {
        this.phone = value;
    }
    /**
     * Sets the roles property value. The roles included with this user.
     * @param value Value to set for the roles property.
     */
    public void setRoles(@jakarta.annotation.Nullable final UntypedNode value) {
        this.roles = value;
    }
    /**
     * Sets the stripeInfo property value. The Stripe info value for this user.
     * @param value Value to set for the stripeInfo property.
     */
    public void setStripeInfo(@jakarta.annotation.Nullable final UserResponseStripeInfo value) {
        this.stripeInfo = value;
    }
    /**
     * Sets the subscriptionStatus property value. Defines the supported Subscription Status values.
     * @param value Value to set for the subscriptionStatus property.
     */
    public void setSubscriptionStatus(@jakarta.annotation.Nullable final UserResponseSubscriptionStatus value) {
        this.subscriptionStatus = value;
    }
}
