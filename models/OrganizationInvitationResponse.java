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
 * Describes organization invitation data returned by Leadping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationInvitationResponse implements AdditionalDataHolder, Parsable {
    /**
     * UTC timestamp for accepted at on this organization invitation.
     */
    private OffsetDateTime acceptedAt;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * UTC timestamp for created at on this organization invitation.
     */
    private OffsetDateTime createdAt;
    /**
     * The email address associated with this organization invitation.
     */
    private String email;
    /**
     * UTC timestamp for expires at on this organization invitation.
     */
    private OffsetDateTime expiresAt;
    /**
     * Unique Leadping identifier for this organization invitation.
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
     * The quantity on the shared organization user license subscription item after this change.
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
     * Identifier and display name of the related organization.
     */
    private IdNamePair organization;
    /**
     * UTC timestamp for resent at on this organization invitation.
     */
    private OffsetDateTime resentAt;
    /**
     * UTC timestamp for revoked at on this organization invitation.
     */
    private OffsetDateTime revokedAt;
    /**
     * Role for this organization invitation.
     */
    private OrganizationMemberRole role;
    /**
     * Safe message for this organization invitation.
     */
    private String safeMessage;
    /**
     * The human-readable send failure reason explaining this organization invitation.
     */
    private String sendFailureReason;
    /**
     * UTC timestamp for sent at on this organization invitation.
     */
    private OffsetDateTime sentAt;
    /**
     * The current status for this organization invitation.
     */
    private OrganizationInvitationStatus status;
    /**
     * Instantiates a new {@link OrganizationInvitationResponse} and sets the default values.
     */
    public OrganizationInvitationResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationInvitationResponse}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationInvitationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationInvitationResponse();
    }
    /**
     * Gets the acceptedAt property value. UTC timestamp for accepted at on this organization invitation.
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
     * Gets the createdAt property value. UTC timestamp for created at on this organization invitation.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the email property value. The email address associated with this organization invitation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * Gets the expiresAt property value. UTC timestamp for expires at on this organization invitation.
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
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("expiresAt", (n) -> { this.setExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("licenseActivatedAt", (n) -> { this.setLicenseActivatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("licenseBillingStatus", (n) -> { this.setLicenseBillingStatus(n.getStringValue()); });
        deserializerMap.put("licenseQuantity", (n) -> { this.setLicenseQuantity(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("licenseReleasedAt", (n) -> { this.setLicenseReleasedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("licenseRenewalDate", (n) -> { this.setLicenseRenewalDate(n.getOffsetDateTimeValue()); });
        deserializerMap.put("organization", (n) -> { this.setOrganization(n.getObjectValue(IdNamePair::createFromDiscriminatorValue)); });
        deserializerMap.put("resentAt", (n) -> { this.setResentAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("revokedAt", (n) -> { this.setRevokedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(OrganizationMemberRole::forValue)); });
        deserializerMap.put("safeMessage", (n) -> { this.setSafeMessage(n.getStringValue()); });
        deserializerMap.put("sendFailureReason", (n) -> { this.setSendFailureReason(n.getStringValue()); });
        deserializerMap.put("sentAt", (n) -> { this.setSentAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(OrganizationInvitationStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique Leadping identifier for this organization invitation.
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
     * Gets the licenseQuantity property value. The quantity on the shared organization user license subscription item after this change.
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
     * Gets the organization property value. Identifier and display name of the related organization.
     * @return a {@link IdNamePair}
     */
    @jakarta.annotation.Nullable
    public IdNamePair getOrganization() {
        return this.organization;
    }
    /**
     * Gets the resentAt property value. UTC timestamp for resent at on this organization invitation.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getResentAt() {
        return this.resentAt;
    }
    /**
     * Gets the revokedAt property value. UTC timestamp for revoked at on this organization invitation.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRevokedAt() {
        return this.revokedAt;
    }
    /**
     * Gets the role property value. Role for this organization invitation.
     * @return a {@link OrganizationMemberRole}
     */
    @jakarta.annotation.Nullable
    public OrganizationMemberRole getRole() {
        return this.role;
    }
    /**
     * Gets the safeMessage property value. Safe message for this organization invitation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSafeMessage() {
        return this.safeMessage;
    }
    /**
     * Gets the sendFailureReason property value. The human-readable send failure reason explaining this organization invitation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSendFailureReason() {
        return this.sendFailureReason;
    }
    /**
     * Gets the sentAt property value. UTC timestamp for sent at on this organization invitation.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSentAt() {
        return this.sentAt;
    }
    /**
     * Gets the status property value. The current status for this organization invitation.
     * @return a {@link OrganizationInvitationStatus}
     */
    @jakarta.annotation.Nullable
    public OrganizationInvitationStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("acceptedAt", this.getAcceptedAt());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("email", this.getEmail());
        writer.writeOffsetDateTimeValue("expiresAt", this.getExpiresAt());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("licenseActivatedAt", this.getLicenseActivatedAt());
        writer.writeStringValue("licenseBillingStatus", this.getLicenseBillingStatus());
        writer.writeObjectValue("licenseQuantity", this.getLicenseQuantity());
        writer.writeOffsetDateTimeValue("licenseReleasedAt", this.getLicenseReleasedAt());
        writer.writeOffsetDateTimeValue("licenseRenewalDate", this.getLicenseRenewalDate());
        writer.writeObjectValue("organization", this.getOrganization());
        writer.writeOffsetDateTimeValue("resentAt", this.getResentAt());
        writer.writeOffsetDateTimeValue("revokedAt", this.getRevokedAt());
        writer.writeEnumValue("role", this.getRole());
        writer.writeStringValue("safeMessage", this.getSafeMessage());
        writer.writeStringValue("sendFailureReason", this.getSendFailureReason());
        writer.writeOffsetDateTimeValue("sentAt", this.getSentAt());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the acceptedAt property value. UTC timestamp for accepted at on this organization invitation.
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
     * Sets the createdAt property value. UTC timestamp for created at on this organization invitation.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the email property value. The email address associated with this organization invitation.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the expiresAt property value. UTC timestamp for expires at on this organization invitation.
     * @param value Value to set for the expiresAt property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expiresAt = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier for this organization invitation.
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
     * Sets the licenseQuantity property value. The quantity on the shared organization user license subscription item after this change.
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
     * Sets the organization property value. Identifier and display name of the related organization.
     * @param value Value to set for the organization property.
     */
    public void setOrganization(@jakarta.annotation.Nullable final IdNamePair value) {
        this.organization = value;
    }
    /**
     * Sets the resentAt property value. UTC timestamp for resent at on this organization invitation.
     * @param value Value to set for the resentAt property.
     */
    public void setResentAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.resentAt = value;
    }
    /**
     * Sets the revokedAt property value. UTC timestamp for revoked at on this organization invitation.
     * @param value Value to set for the revokedAt property.
     */
    public void setRevokedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.revokedAt = value;
    }
    /**
     * Sets the role property value. Role for this organization invitation.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final OrganizationMemberRole value) {
        this.role = value;
    }
    /**
     * Sets the safeMessage property value. Safe message for this organization invitation.
     * @param value Value to set for the safeMessage property.
     */
    public void setSafeMessage(@jakarta.annotation.Nullable final String value) {
        this.safeMessage = value;
    }
    /**
     * Sets the sendFailureReason property value. The human-readable send failure reason explaining this organization invitation.
     * @param value Value to set for the sendFailureReason property.
     */
    public void setSendFailureReason(@jakarta.annotation.Nullable final String value) {
        this.sendFailureReason = value;
    }
    /**
     * Sets the sentAt property value. UTC timestamp for sent at on this organization invitation.
     * @param value Value to set for the sentAt property.
     */
    public void setSentAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.sentAt = value;
    }
    /**
     * Sets the status property value. The current status for this organization invitation.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final OrganizationInvitationStatus value) {
        this.status = value;
    }
}
