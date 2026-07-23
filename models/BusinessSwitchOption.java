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
 * API DTO containing business switch option data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessSwitchOption implements AdditionalDataHolder, Parsable {
    /**
     * Defines the supported Customer Activation Status values.
     */
    private BusinessSwitchOptionActivationStatus activationStatus;
    /**
     * The activation summary value for this business switch option.
     */
    private String activationSummary;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Defines the supported Business Status values.
     */
    private BusinessSwitchOptionBusinessStatus businessStatus;
    /**
     * Whether the business has a default billing payment method.
     */
    private Boolean hasPaymentMethod;
    /**
     * The unique ID for this business switch option.
     */
    private String id;
    /**
     * Whether this business switch option is current.
     */
    private Boolean isCurrent;
    /**
     * The date and time for the last used at value on this business switch option.
     */
    private OffsetDateTime lastUsedAt;
    /**
     * The human-readable name shown for this business switch option.
     */
    private String name;
    /**
     * Whether needs admin review applies to this business switch option.
     */
    private Boolean needsAdminReview;
    /**
     * Whether ready for customer traffic applies to this business switch option.
     */
    private Boolean readyForCustomerTraffic;
    /**
     * The role value for this business switch option.
     */
    private BusinessUserRole role;
    /**
     * Defines the supported 10DLC Application Status values.
     */
    private BusinessSwitchOptionTenDlcStatus tenDlcStatus;
    /**
     * Instantiates a new {@link BusinessSwitchOption} and sets the default values.
     */
    public BusinessSwitchOption() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessSwitchOption}
     */
    @jakarta.annotation.Nonnull
    public static BusinessSwitchOption createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessSwitchOption();
    }
    /**
     * Gets the activationStatus property value. Defines the supported Customer Activation Status values.
     * @return a {@link BusinessSwitchOptionActivationStatus}
     */
    @jakarta.annotation.Nullable
    public BusinessSwitchOptionActivationStatus getActivationStatus() {
        return this.activationStatus;
    }
    /**
     * Gets the activationSummary property value. The activation summary value for this business switch option.
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
     * Gets the businessStatus property value. Defines the supported Business Status values.
     * @return a {@link BusinessSwitchOptionBusinessStatus}
     */
    @jakarta.annotation.Nullable
    public BusinessSwitchOptionBusinessStatus getBusinessStatus() {
        return this.businessStatus;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("activationStatus", (n) -> { this.setActivationStatus(n.getEnumValue(BusinessSwitchOptionActivationStatus::forValue)); });
        deserializerMap.put("activationSummary", (n) -> { this.setActivationSummary(n.getStringValue()); });
        deserializerMap.put("businessStatus", (n) -> { this.setBusinessStatus(n.getEnumValue(BusinessSwitchOptionBusinessStatus::forValue)); });
        deserializerMap.put("hasPaymentMethod", (n) -> { this.setHasPaymentMethod(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isCurrent", (n) -> { this.setIsCurrent(n.getBooleanValue()); });
        deserializerMap.put("lastUsedAt", (n) -> { this.setLastUsedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("needsAdminReview", (n) -> { this.setNeedsAdminReview(n.getBooleanValue()); });
        deserializerMap.put("readyForCustomerTraffic", (n) -> { this.setReadyForCustomerTraffic(n.getBooleanValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(BusinessUserRole::forValue)); });
        deserializerMap.put("tenDlcStatus", (n) -> { this.setTenDlcStatus(n.getEnumValue(BusinessSwitchOptionTenDlcStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hasPaymentMethod property value. Whether the business has a default billing payment method.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasPaymentMethod() {
        return this.hasPaymentMethod;
    }
    /**
     * Gets the id property value. The unique ID for this business switch option.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isCurrent property value. Whether this business switch option is current.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCurrent() {
        return this.isCurrent;
    }
    /**
     * Gets the lastUsedAt property value. The date and time for the last used at value on this business switch option.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastUsedAt() {
        return this.lastUsedAt;
    }
    /**
     * Gets the name property value. The human-readable name shown for this business switch option.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the needsAdminReview property value. Whether needs admin review applies to this business switch option.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNeedsAdminReview() {
        return this.needsAdminReview;
    }
    /**
     * Gets the readyForCustomerTraffic property value. Whether ready for customer traffic applies to this business switch option.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReadyForCustomerTraffic() {
        return this.readyForCustomerTraffic;
    }
    /**
     * Gets the role property value. The role value for this business switch option.
     * @return a {@link BusinessUserRole}
     */
    @jakarta.annotation.Nullable
    public BusinessUserRole getRole() {
        return this.role;
    }
    /**
     * Gets the tenDlcStatus property value. Defines the supported 10DLC Application Status values.
     * @return a {@link BusinessSwitchOptionTenDlcStatus}
     */
    @jakarta.annotation.Nullable
    public BusinessSwitchOptionTenDlcStatus getTenDlcStatus() {
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
        writer.writeEnumValue("businessStatus", this.getBusinessStatus());
        writer.writeBooleanValue("hasPaymentMethod", this.getHasPaymentMethod());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isCurrent", this.getIsCurrent());
        writer.writeOffsetDateTimeValue("lastUsedAt", this.getLastUsedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("needsAdminReview", this.getNeedsAdminReview());
        writer.writeBooleanValue("readyForCustomerTraffic", this.getReadyForCustomerTraffic());
        writer.writeEnumValue("role", this.getRole());
        writer.writeEnumValue("tenDlcStatus", this.getTenDlcStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activationStatus property value. Defines the supported Customer Activation Status values.
     * @param value Value to set for the activationStatus property.
     */
    public void setActivationStatus(@jakarta.annotation.Nullable final BusinessSwitchOptionActivationStatus value) {
        this.activationStatus = value;
    }
    /**
     * Sets the activationSummary property value. The activation summary value for this business switch option.
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
     * Sets the businessStatus property value. Defines the supported Business Status values.
     * @param value Value to set for the businessStatus property.
     */
    public void setBusinessStatus(@jakarta.annotation.Nullable final BusinessSwitchOptionBusinessStatus value) {
        this.businessStatus = value;
    }
    /**
     * Sets the hasPaymentMethod property value. Whether the business has a default billing payment method.
     * @param value Value to set for the hasPaymentMethod property.
     */
    public void setHasPaymentMethod(@jakarta.annotation.Nullable final Boolean value) {
        this.hasPaymentMethod = value;
    }
    /**
     * Sets the id property value. The unique ID for this business switch option.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isCurrent property value. Whether this business switch option is current.
     * @param value Value to set for the isCurrent property.
     */
    public void setIsCurrent(@jakarta.annotation.Nullable final Boolean value) {
        this.isCurrent = value;
    }
    /**
     * Sets the lastUsedAt property value. The date and time for the last used at value on this business switch option.
     * @param value Value to set for the lastUsedAt property.
     */
    public void setLastUsedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastUsedAt = value;
    }
    /**
     * Sets the name property value. The human-readable name shown for this business switch option.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the needsAdminReview property value. Whether needs admin review applies to this business switch option.
     * @param value Value to set for the needsAdminReview property.
     */
    public void setNeedsAdminReview(@jakarta.annotation.Nullable final Boolean value) {
        this.needsAdminReview = value;
    }
    /**
     * Sets the readyForCustomerTraffic property value. Whether ready for customer traffic applies to this business switch option.
     * @param value Value to set for the readyForCustomerTraffic property.
     */
    public void setReadyForCustomerTraffic(@jakarta.annotation.Nullable final Boolean value) {
        this.readyForCustomerTraffic = value;
    }
    /**
     * Sets the role property value. The role value for this business switch option.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final BusinessUserRole value) {
        this.role = value;
    }
    /**
     * Sets the tenDlcStatus property value. Defines the supported 10DLC Application Status values.
     * @param value Value to set for the tenDlcStatus property.
     */
    public void setTenDlcStatus(@jakarta.annotation.Nullable final BusinessSwitchOptionTenDlcStatus value) {
        this.tenDlcStatus = value;
    }
}
