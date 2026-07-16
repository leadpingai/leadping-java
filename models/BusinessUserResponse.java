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
 * API response containing business user data returned to callers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessUserResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The business value for this business user.
     */
    private IdNamePair business;
    /**
     * The date and time when the entity was created.
     */
    private OffsetDateTime createdAt;
    /**
     * The created by user ID associated with this business user.
     */
    private String createdByUserId;
    /**
     * The unique identifier for the entity.
     */
    private String id;
    /**
     * The date and time for the last used at value on this business user.
     */
    private OffsetDateTime lastUsedAt;
    /**
     * The billing status for this user&apos;s business license.
     */
    private String licenseBillingStatus;
    /**
     * The quantity on the shared business user license item after this change.
     */
    private UntypedNode licenseQuantity;
    /**
     * The renewal date used for this user&apos;s license proration.
     */
    private OffsetDateTime licenseRenewalDate;
    /**
     * The date and time when the entity was last modified, if applicable.
     */
    private OffsetDateTime modifiedAt;
    /**
     * The display name for the entity.
     */
    private String name;
    /**
     * The date and time for the removed at value on this business user.
     */
    private OffsetDateTime removedAt;
    /**
     * The removed by user ID associated with this business user.
     */
    private String removedByUserId;
    /**
     * The role value for this business user.
     */
    private BusinessUserRole role;
    /**
     * The user value for this business user.
     */
    private IdNamePair user;
    /**
     * The user email value for this business user.
     */
    private String userEmail;
    /**
     * Instantiates a new {@link BusinessUserResponse} and sets the default values.
     */
    public BusinessUserResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessUserResponse}
     */
    @jakarta.annotation.Nonnull
    public static BusinessUserResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessUserResponse();
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
     * Gets the business property value. The business value for this business user.
     * @return a {@link IdNamePair}
     */
    @jakarta.annotation.Nullable
    public IdNamePair getBusiness() {
        return this.business;
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
     * Gets the createdByUserId property value. The created by user ID associated with this business user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedByUserId() {
        return this.createdByUserId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("business", (n) -> { this.setBusiness(n.getObjectValue(IdNamePair::createFromDiscriminatorValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdByUserId", (n) -> { this.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("lastUsedAt", (n) -> { this.setLastUsedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("licenseBillingStatus", (n) -> { this.setLicenseBillingStatus(n.getStringValue()); });
        deserializerMap.put("licenseQuantity", (n) -> { this.setLicenseQuantity(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("licenseRenewalDate", (n) -> { this.setLicenseRenewalDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("removedAt", (n) -> { this.setRemovedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("removedByUserId", (n) -> { this.setRemovedByUserId(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(BusinessUserRole::forValue)); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(IdNamePair::createFromDiscriminatorValue)); });
        deserializerMap.put("userEmail", (n) -> { this.setUserEmail(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the lastUsedAt property value. The date and time for the last used at value on this business user.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUsedAt() {
        return this.lastUsedAt;
    }
    /**
     * Gets the licenseBillingStatus property value. The billing status for this user&apos;s business license.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLicenseBillingStatus() {
        return this.licenseBillingStatus;
    }
    /**
     * Gets the licenseQuantity property value. The quantity on the shared business user license item after this change.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getLicenseQuantity() {
        return this.licenseQuantity;
    }
    /**
     * Gets the licenseRenewalDate property value. The renewal date used for this user&apos;s license proration.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLicenseRenewalDate() {
        return this.licenseRenewalDate;
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
     * Gets the removedAt property value. The date and time for the removed at value on this business user.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRemovedAt() {
        return this.removedAt;
    }
    /**
     * Gets the removedByUserId property value. The removed by user ID associated with this business user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRemovedByUserId() {
        return this.removedByUserId;
    }
    /**
     * Gets the role property value. The role value for this business user.
     * @return a {@link BusinessUserRole}
     */
    @jakarta.annotation.Nullable
    public BusinessUserRole getRole() {
        return this.role;
    }
    /**
     * Gets the user property value. The user value for this business user.
     * @return a {@link IdNamePair}
     */
    @jakarta.annotation.Nullable
    public IdNamePair getUser() {
        return this.user;
    }
    /**
     * Gets the userEmail property value. The user email value for this business user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserEmail() {
        return this.userEmail;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("business", this.getBusiness());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("lastUsedAt", this.getLastUsedAt());
        writer.writeStringValue("licenseBillingStatus", this.getLicenseBillingStatus());
        writer.writeObjectValue("licenseQuantity", this.getLicenseQuantity());
        writer.writeOffsetDateTimeValue("licenseRenewalDate", this.getLicenseRenewalDate());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeOffsetDateTimeValue("removedAt", this.getRemovedAt());
        writer.writeStringValue("removedByUserId", this.getRemovedByUserId());
        writer.writeEnumValue("role", this.getRole());
        writer.writeObjectValue("user", this.getUser());
        writer.writeStringValue("userEmail", this.getUserEmail());
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
     * Sets the business property value. The business value for this business user.
     * @param value Value to set for the business property.
     */
    public void setBusiness(@jakarta.annotation.Nullable final IdNamePair value) {
        this.business = value;
    }
    /**
     * Sets the createdAt property value. The date and time when the entity was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the createdByUserId property value. The created by user ID associated with this business user.
     * @param value Value to set for the createdByUserId property.
     */
    public void setCreatedByUserId(@jakarta.annotation.Nullable final String value) {
        this.createdByUserId = value;
    }
    /**
     * Sets the id property value. The unique identifier for the entity.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the lastUsedAt property value. The date and time for the last used at value on this business user.
     * @param value Value to set for the lastUsedAt property.
     */
    public void setLastUsedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUsedAt = value;
    }
    /**
     * Sets the licenseBillingStatus property value. The billing status for this user&apos;s business license.
     * @param value Value to set for the licenseBillingStatus property.
     */
    public void setLicenseBillingStatus(@jakarta.annotation.Nullable final String value) {
        this.licenseBillingStatus = value;
    }
    /**
     * Sets the licenseQuantity property value. The quantity on the shared business user license item after this change.
     * @param value Value to set for the licenseQuantity property.
     */
    public void setLicenseQuantity(@jakarta.annotation.Nullable final UntypedNode value) {
        this.licenseQuantity = value;
    }
    /**
     * Sets the licenseRenewalDate property value. The renewal date used for this user&apos;s license proration.
     * @param value Value to set for the licenseRenewalDate property.
     */
    public void setLicenseRenewalDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.licenseRenewalDate = value;
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
     * Sets the removedAt property value. The date and time for the removed at value on this business user.
     * @param value Value to set for the removedAt property.
     */
    public void setRemovedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.removedAt = value;
    }
    /**
     * Sets the removedByUserId property value. The removed by user ID associated with this business user.
     * @param value Value to set for the removedByUserId property.
     */
    public void setRemovedByUserId(@jakarta.annotation.Nullable final String value) {
        this.removedByUserId = value;
    }
    /**
     * Sets the role property value. The role value for this business user.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final BusinessUserRole value) {
        this.role = value;
    }
    /**
     * Sets the user property value. The user value for this business user.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final IdNamePair value) {
        this.user = value;
    }
    /**
     * Sets the userEmail property value. The user email value for this business user.
     * @param value Value to set for the userEmail property.
     */
    public void setUserEmail(@jakarta.annotation.Nullable final String value) {
        this.userEmail = value;
    }
}
