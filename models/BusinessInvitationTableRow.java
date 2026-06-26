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
 * API DTO containing business invitation data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessInvitationTableRow implements AdditionalDataHolder, Parsable {
    /**
     * The date and time for the accepted at value on this business invitation.
     */
    private OffsetDateTime acceptedAt;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The business ID associated with this business invitation.
     */
    private String businessId;
    /**
     * The business name value for this business invitation.
     */
    private String businessName;
    /**
     * The date and time for the created at value on this business invitation.
     */
    private OffsetDateTime createdAt;
    /**
     * The email address associated with this business invitation.
     */
    private String email;
    /**
     * The date and time for the expires at value on this business invitation.
     */
    private OffsetDateTime expiresAt;
    /**
     * The unique ID for this business invitation.
     */
    private String id;
    /**
     * The date and time this invitation&apos;s paid license was created.
     */
    private OffsetDateTime licenseActivatedAt;
    /**
     * The billing status for the paid license created by this invitation.
     */
    private String licenseBillingStatus;
    /**
     * The quantity on the shared business user license subscription item after this change.
     */
    private UntypedNode licenseQuantity;
    /**
     * The date and time this invitation&apos;s paid license was released.
     */
    private OffsetDateTime licenseReleasedAt;
    /**
     * The renewal date used for proration of this license.
     */
    private OffsetDateTime licenseRenewalDate;
    /**
     * The date and time for the resent at value on this business invitation.
     */
    private OffsetDateTime resentAt;
    /**
     * The date and time for the revoked at value on this business invitation.
     */
    private OffsetDateTime revokedAt;
    /**
     * The role value for this business invitation.
     */
    private BusinessUserRole role;
    /**
     * The human-readable send failure reason explaining this business invitation.
     */
    private String sendFailureReason;
    /**
     * The date and time for the sent at value on this business invitation.
     */
    private OffsetDateTime sentAt;
    /**
     * The current status for this business invitation.
     */
    private BusinessInvitationStatus status;
    /**
     * Instantiates a new {@link BusinessInvitationTableRow} and sets the default values.
     */
    public BusinessInvitationTableRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessInvitationTableRow}
     */
    @jakarta.annotation.Nonnull
    public static BusinessInvitationTableRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessInvitationTableRow();
    }
    /**
     * Gets the acceptedAt property value. The date and time for the accepted at value on this business invitation.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAcceptedAt() {
        return this.acceptedAt;
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
     * Gets the businessId property value. The business ID associated with this business invitation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the businessName property value. The business name value for this business invitation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessName() {
        return this.businessName;
    }
    /**
     * Gets the createdAt property value. The date and time for the created at value on this business invitation.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the email property value. The email address associated with this business invitation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * Gets the expiresAt property value. The date and time for the expires at value on this business invitation.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("acceptedAt", (n) -> { this.setAcceptedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("businessName", (n) -> { this.setBusinessName(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("expiresAt", (n) -> { this.setExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("licenseActivatedAt", (n) -> { this.setLicenseActivatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("licenseBillingStatus", (n) -> { this.setLicenseBillingStatus(n.getStringValue()); });
        deserializerMap.put("licenseQuantity", (n) -> { this.setLicenseQuantity(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("licenseReleasedAt", (n) -> { this.setLicenseReleasedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("licenseRenewalDate", (n) -> { this.setLicenseRenewalDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resentAt", (n) -> { this.setResentAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("revokedAt", (n) -> { this.setRevokedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(BusinessUserRole::forValue)); });
        deserializerMap.put("sendFailureReason", (n) -> { this.setSendFailureReason(n.getStringValue()); });
        deserializerMap.put("sentAt", (n) -> { this.setSentAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(BusinessInvitationStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique ID for this business invitation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the licenseActivatedAt property value. The date and time this invitation&apos;s paid license was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLicenseActivatedAt() {
        return this.licenseActivatedAt;
    }
    /**
     * Gets the licenseBillingStatus property value. The billing status for the paid license created by this invitation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLicenseBillingStatus() {
        return this.licenseBillingStatus;
    }
    /**
     * Gets the licenseQuantity property value. The quantity on the shared business user license subscription item after this change.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getLicenseQuantity() {
        return this.licenseQuantity;
    }
    /**
     * Gets the licenseReleasedAt property value. The date and time this invitation&apos;s paid license was released.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLicenseReleasedAt() {
        return this.licenseReleasedAt;
    }
    /**
     * Gets the licenseRenewalDate property value. The renewal date used for proration of this license.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLicenseRenewalDate() {
        return this.licenseRenewalDate;
    }
    /**
     * Gets the resentAt property value. The date and time for the resent at value on this business invitation.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getResentAt() {
        return this.resentAt;
    }
    /**
     * Gets the revokedAt property value. The date and time for the revoked at value on this business invitation.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRevokedAt() {
        return this.revokedAt;
    }
    /**
     * Gets the role property value. The role value for this business invitation.
     * @return a {@link BusinessUserRole}
     */
    @jakarta.annotation.Nullable
    public BusinessUserRole getRole() {
        return this.role;
    }
    /**
     * Gets the sendFailureReason property value. The human-readable send failure reason explaining this business invitation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSendFailureReason() {
        return this.sendFailureReason;
    }
    /**
     * Gets the sentAt property value. The date and time for the sent at value on this business invitation.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSentAt() {
        return this.sentAt;
    }
    /**
     * Gets the status property value. The current status for this business invitation.
     * @return a {@link BusinessInvitationStatus}
     */
    @jakarta.annotation.Nullable
    public BusinessInvitationStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("acceptedAt", this.getAcceptedAt());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeStringValue("businessName", this.getBusinessName());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("email", this.getEmail());
        writer.writeOffsetDateTimeValue("expiresAt", this.getExpiresAt());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("licenseActivatedAt", this.getLicenseActivatedAt());
        writer.writeStringValue("licenseBillingStatus", this.getLicenseBillingStatus());
        writer.writeObjectValue("licenseQuantity", this.getLicenseQuantity());
        writer.writeOffsetDateTimeValue("licenseReleasedAt", this.getLicenseReleasedAt());
        writer.writeOffsetDateTimeValue("licenseRenewalDate", this.getLicenseRenewalDate());
        writer.writeOffsetDateTimeValue("resentAt", this.getResentAt());
        writer.writeOffsetDateTimeValue("revokedAt", this.getRevokedAt());
        writer.writeEnumValue("role", this.getRole());
        writer.writeStringValue("sendFailureReason", this.getSendFailureReason());
        writer.writeOffsetDateTimeValue("sentAt", this.getSentAt());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acceptedAt property value. The date and time for the accepted at value on this business invitation.
     * @param value Value to set for the acceptedAt property.
     */
    public void setAcceptedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.acceptedAt = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the businessId property value. The business ID associated with this business invitation.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the businessName property value. The business name value for this business invitation.
     * @param value Value to set for the businessName property.
     */
    public void setBusinessName(@jakarta.annotation.Nullable final String value) {
        this.businessName = value;
    }
    /**
     * Sets the createdAt property value. The date and time for the created at value on this business invitation.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the email property value. The email address associated with this business invitation.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the expiresAt property value. The date and time for the expires at value on this business invitation.
     * @param value Value to set for the expiresAt property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expiresAt = value;
    }
    /**
     * Sets the id property value. The unique ID for this business invitation.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the licenseActivatedAt property value. The date and time this invitation&apos;s paid license was created.
     * @param value Value to set for the licenseActivatedAt property.
     */
    public void setLicenseActivatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.licenseActivatedAt = value;
    }
    /**
     * Sets the licenseBillingStatus property value. The billing status for the paid license created by this invitation.
     * @param value Value to set for the licenseBillingStatus property.
     */
    public void setLicenseBillingStatus(@jakarta.annotation.Nullable final String value) {
        this.licenseBillingStatus = value;
    }
    /**
     * Sets the licenseQuantity property value. The quantity on the shared business user license subscription item after this change.
     * @param value Value to set for the licenseQuantity property.
     */
    public void setLicenseQuantity(@jakarta.annotation.Nullable final UntypedNode value) {
        this.licenseQuantity = value;
    }
    /**
     * Sets the licenseReleasedAt property value. The date and time this invitation&apos;s paid license was released.
     * @param value Value to set for the licenseReleasedAt property.
     */
    public void setLicenseReleasedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.licenseReleasedAt = value;
    }
    /**
     * Sets the licenseRenewalDate property value. The renewal date used for proration of this license.
     * @param value Value to set for the licenseRenewalDate property.
     */
    public void setLicenseRenewalDate(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.licenseRenewalDate = value;
    }
    /**
     * Sets the resentAt property value. The date and time for the resent at value on this business invitation.
     * @param value Value to set for the resentAt property.
     */
    public void setResentAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.resentAt = value;
    }
    /**
     * Sets the revokedAt property value. The date and time for the revoked at value on this business invitation.
     * @param value Value to set for the revokedAt property.
     */
    public void setRevokedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.revokedAt = value;
    }
    /**
     * Sets the role property value. The role value for this business invitation.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final BusinessUserRole value) {
        this.role = value;
    }
    /**
     * Sets the sendFailureReason property value. The human-readable send failure reason explaining this business invitation.
     * @param value Value to set for the sendFailureReason property.
     */
    public void setSendFailureReason(@jakarta.annotation.Nullable final String value) {
        this.sendFailureReason = value;
    }
    /**
     * Sets the sentAt property value. The date and time for the sent at value on this business invitation.
     * @param value Value to set for the sentAt property.
     */
    public void setSentAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.sentAt = value;
    }
    /**
     * Sets the status property value. The current status for this business invitation.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final BusinessInvitationStatus value) {
        this.status = value;
    }
}
