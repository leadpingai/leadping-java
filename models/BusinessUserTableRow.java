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
 * API DTO containing business user data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessUserTableRow implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time for the created at value on this business user.
     */
    private OffsetDateTime createdAt;
    /**
     * The unique ID for this business user.
     */
    private String id;
    /**
     * The billing status for this user&apos;s business license.
     */
    private String licenseBillingStatus;
    /**
     * The renewal date used for this user&apos;s license proration.
     */
    private OffsetDateTime licenseRenewalDate;
    /**
     * The role value for this business user.
     */
    private BusinessUserRole role;
    /**
     * The ID and name for this user.
     */
    private IdNamePair user;
    /**
     * The user email value for this business user.
     */
    private String userEmail;
    /**
     * Instantiates a new {@link BusinessUserTableRow} and sets the default values.
     */
    public BusinessUserTableRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessUserTableRow}
     */
    @jakarta.annotation.Nonnull
    public static BusinessUserTableRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessUserTableRow();
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
     * Gets the createdAt property value. The date and time for the created at value on this business user.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("licenseBillingStatus", (n) -> { this.setLicenseBillingStatus(n.getStringValue()); });
        deserializerMap.put("licenseRenewalDate", (n) -> { this.setLicenseRenewalDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(BusinessUserRole::forValue)); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getObjectValue(IdNamePair::createFromDiscriminatorValue)); });
        deserializerMap.put("userEmail", (n) -> { this.setUserEmail(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique ID for this business user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
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
     * Gets the licenseRenewalDate property value. The renewal date used for this user&apos;s license proration.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLicenseRenewalDate() {
        return this.licenseRenewalDate;
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
     * Gets the user property value. The ID and name for this user.
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
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("licenseBillingStatus", this.getLicenseBillingStatus());
        writer.writeOffsetDateTimeValue("licenseRenewalDate", this.getLicenseRenewalDate());
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
     * Sets the createdAt property value. The date and time for the created at value on this business user.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the id property value. The unique ID for this business user.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the licenseBillingStatus property value. The billing status for this user&apos;s business license.
     * @param value Value to set for the licenseBillingStatus property.
     */
    public void setLicenseBillingStatus(@jakarta.annotation.Nullable final String value) {
        this.licenseBillingStatus = value;
    }
    /**
     * Sets the licenseRenewalDate property value. The renewal date used for this user&apos;s license proration.
     * @param value Value to set for the licenseRenewalDate property.
     */
    public void setLicenseRenewalDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.licenseRenewalDate = value;
    }
    /**
     * Sets the role property value. The role value for this business user.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final BusinessUserRole value) {
        this.role = value;
    }
    /**
     * Sets the user property value. The ID and name for this user.
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
