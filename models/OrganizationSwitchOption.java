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
 * Describes organization switch option data used in Leadping API requests and responses.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationSwitchOption implements AdditionalDataHolder, Parsable {
    /**
     * Summarizes an organization&apos;s overall progress from initial Leadping onboarding through launch readiness.
     */
    private OrganizationSwitchOptionActivationStatus activationStatus;
    /**
     * Activation summary for this organization switch option.
     */
    private String activationSummary;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Whether the organization has a default billing payment method.
     */
    private Boolean hasPaymentMethod;
    /**
     * Unique Leadping identifier for this organization switch option.
     */
    private String id;
    /**
     * Whether this organization switch option is current.
     */
    private Boolean isCurrent;
    /**
     * UTC timestamp for last used at on this organization switch option.
     */
    private OffsetDateTime lastUsedAt;
    /**
     * The human-readable name shown for this organization switch option.
     */
    private String name;
    /**
     * Whether needs admin review applies to this organization switch option.
     */
    private Boolean needsAdminReview;
    /**
     * Describes an organization&apos;s account lifecycle and whether it can actively use Leadping services.
     */
    private OrganizationSwitchOptionOrganizationStatus organizationStatus;
    /**
     * Whether ready for customer traffic applies to this organization switch option.
     */
    private Boolean readyForCustomerTraffic;
    /**
     * Role for this organization switch option.
     */
    private OrganizationMemberRole role;
    /**
     * Describes an organization&apos;s overall 10DLC registration lifecycle across brand and messaging campaign submission.
     */
    private OrganizationSwitchOptionTenDlcStatus tenDlcStatus;
    /**
     * Instantiates a new {@link OrganizationSwitchOption} and sets the default values.
     */
    public OrganizationSwitchOption() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationSwitchOption}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationSwitchOption createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationSwitchOption();
    }
    /**
     * Gets the activationStatus property value. Summarizes an organization&apos;s overall progress from initial Leadping onboarding through launch readiness.
     * @return a {@link OrganizationSwitchOptionActivationStatus}
     */
    @jakarta.annotation.Nullable
    public OrganizationSwitchOptionActivationStatus getActivationStatus() {
        return this.activationStatus;
    }
    /**
     * Gets the activationSummary property value. Activation summary for this organization switch option.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActivationSummary() {
        return this.activationSummary;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("activationStatus", (n) -> { this.setActivationStatus(n.getEnumValue(OrganizationSwitchOptionActivationStatus::forValue)); });
        deserializerMap.put("activationSummary", (n) -> { this.setActivationSummary(n.getStringValue()); });
        deserializerMap.put("hasPaymentMethod", (n) -> { this.setHasPaymentMethod(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isCurrent", (n) -> { this.setIsCurrent(n.getBooleanValue()); });
        deserializerMap.put("lastUsedAt", (n) -> { this.setLastUsedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("needsAdminReview", (n) -> { this.setNeedsAdminReview(n.getBooleanValue()); });
        deserializerMap.put("organizationStatus", (n) -> { this.setOrganizationStatus(n.getEnumValue(OrganizationSwitchOptionOrganizationStatus::forValue)); });
        deserializerMap.put("readyForCustomerTraffic", (n) -> { this.setReadyForCustomerTraffic(n.getBooleanValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(OrganizationMemberRole::forValue)); });
        deserializerMap.put("tenDlcStatus", (n) -> { this.setTenDlcStatus(n.getEnumValue(OrganizationSwitchOptionTenDlcStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hasPaymentMethod property value. Whether the organization has a default billing payment method.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasPaymentMethod() {
        return this.hasPaymentMethod;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this organization switch option.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isCurrent property value. Whether this organization switch option is current.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCurrent() {
        return this.isCurrent;
    }
    /**
     * Gets the lastUsedAt property value. UTC timestamp for last used at on this organization switch option.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUsedAt() {
        return this.lastUsedAt;
    }
    /**
     * Gets the name property value. The human-readable name shown for this organization switch option.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the needsAdminReview property value. Whether needs admin review applies to this organization switch option.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNeedsAdminReview() {
        return this.needsAdminReview;
    }
    /**
     * Gets the organizationStatus property value. Describes an organization&apos;s account lifecycle and whether it can actively use Leadping services.
     * @return a {@link OrganizationSwitchOptionOrganizationStatus}
     */
    @jakarta.annotation.Nullable
    public OrganizationSwitchOptionOrganizationStatus getOrganizationStatus() {
        return this.organizationStatus;
    }
    /**
     * Gets the readyForCustomerTraffic property value. Whether ready for customer traffic applies to this organization switch option.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReadyForCustomerTraffic() {
        return this.readyForCustomerTraffic;
    }
    /**
     * Gets the role property value. Role for this organization switch option.
     * @return a {@link OrganizationMemberRole}
     */
    @jakarta.annotation.Nullable
    public OrganizationMemberRole getRole() {
        return this.role;
    }
    /**
     * Gets the tenDlcStatus property value. Describes an organization&apos;s overall 10DLC registration lifecycle across brand and messaging campaign submission.
     * @return a {@link OrganizationSwitchOptionTenDlcStatus}
     */
    @jakarta.annotation.Nullable
    public OrganizationSwitchOptionTenDlcStatus getTenDlcStatus() {
        return this.tenDlcStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("activationStatus", this.getActivationStatus());
        writer.writeStringValue("activationSummary", this.getActivationSummary());
        writer.writeBooleanValue("hasPaymentMethod", this.getHasPaymentMethod());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isCurrent", this.getIsCurrent());
        writer.writeOffsetDateTimeValue("lastUsedAt", this.getLastUsedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("needsAdminReview", this.getNeedsAdminReview());
        writer.writeEnumValue("organizationStatus", this.getOrganizationStatus());
        writer.writeBooleanValue("readyForCustomerTraffic", this.getReadyForCustomerTraffic());
        writer.writeEnumValue("role", this.getRole());
        writer.writeEnumValue("tenDlcStatus", this.getTenDlcStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activationStatus property value. Summarizes an organization&apos;s overall progress from initial Leadping onboarding through launch readiness.
     * @param value Value to set for the activationStatus property.
     */
    public void setActivationStatus(@jakarta.annotation.Nullable final OrganizationSwitchOptionActivationStatus value) {
        this.activationStatus = value;
    }
    /**
     * Sets the activationSummary property value. Activation summary for this organization switch option.
     * @param value Value to set for the activationSummary property.
     */
    public void setActivationSummary(@jakarta.annotation.Nullable final String value) {
        this.activationSummary = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the hasPaymentMethod property value. Whether the organization has a default billing payment method.
     * @param value Value to set for the hasPaymentMethod property.
     */
    public void setHasPaymentMethod(@jakarta.annotation.Nullable final Boolean value) {
        this.hasPaymentMethod = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this organization switch option.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isCurrent property value. Whether this organization switch option is current.
     * @param value Value to set for the isCurrent property.
     */
    public void setIsCurrent(@jakarta.annotation.Nullable final Boolean value) {
        this.isCurrent = value;
    }
    /**
     * Sets the lastUsedAt property value. UTC timestamp for last used at on this organization switch option.
     * @param value Value to set for the lastUsedAt property.
     */
    public void setLastUsedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUsedAt = value;
    }
    /**
     * Sets the name property value. The human-readable name shown for this organization switch option.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the needsAdminReview property value. Whether needs admin review applies to this organization switch option.
     * @param value Value to set for the needsAdminReview property.
     */
    public void setNeedsAdminReview(@jakarta.annotation.Nullable final Boolean value) {
        this.needsAdminReview = value;
    }
    /**
     * Sets the organizationStatus property value. Describes an organization&apos;s account lifecycle and whether it can actively use Leadping services.
     * @param value Value to set for the organizationStatus property.
     */
    public void setOrganizationStatus(@jakarta.annotation.Nullable final OrganizationSwitchOptionOrganizationStatus value) {
        this.organizationStatus = value;
    }
    /**
     * Sets the readyForCustomerTraffic property value. Whether ready for customer traffic applies to this organization switch option.
     * @param value Value to set for the readyForCustomerTraffic property.
     */
    public void setReadyForCustomerTraffic(@jakarta.annotation.Nullable final Boolean value) {
        this.readyForCustomerTraffic = value;
    }
    /**
     * Sets the role property value. Role for this organization switch option.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final OrganizationMemberRole value) {
        this.role = value;
    }
    /**
     * Sets the tenDlcStatus property value. Describes an organization&apos;s overall 10DLC registration lifecycle across brand and messaging campaign submission.
     * @param value Value to set for the tenDlcStatus property.
     */
    public void setTenDlcStatus(@jakarta.annotation.Nullable final OrganizationSwitchOptionTenDlcStatus value) {
        this.tenDlcStatus = value;
    }
}
