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
 * API DTO containing business activation state data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessActivationState implements AdditionalDataHolder, Parsable {
    /**
     * The date and time for the activated at value on this business activation state.
     */
    private OffsetDateTime activatedAt;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The current billing subscription status for this business activation state.
     */
    private ActivationSubscriptionStatus billingSubscriptionStatus;
    /**
     * The business description value for this business activation state.
     */
    private String businessDescription;
    /**
     * The compliance notes value for this business activation state.
     */
    private String complianceNotes;
    /**
     * Whether controlled launch applies to this business activation state.
     */
    private Boolean controlledLaunch;
    /**
     * The date and time for the created at value on this business activation state.
     */
    private OffsetDateTime createdAt;
    /**
     * The current customer facing status for this business activation state.
     */
    private String customerFacingStatus;
    /**
     * The date and time for the domain approved at value on this business activation state.
     */
    private OffsetDateTime domainApprovedAt;
    /**
     * The domain options included with this business activation state.
     */
    private java.util.List<ActivationDomainOption> domainOptions;
    /**
     * The events included with this business activation state.
     */
    private java.util.List<ActivationTimelineEvent> events;
    /**
     * The date and time for the failed at value on this business activation state.
     */
    private OffsetDateTime failedAt;
    /**
     * The industry value for this business activation state.
     */
    private String industry;
    /**
     * The date and time for the launch approved at value on this business activation state.
     */
    private OffsetDateTime launchApprovedAt;
    /**
     * The date and time for the launch review requested at value on this business activation state.
     */
    private OffsetDateTime launchReviewRequestedAt;
    /**
     * The current launch review status for this business activation state.
     */
    private ActivationLaunchReviewStatus launchReviewStatus;
    /**
     * The offer value for this business activation state.
     */
    private String offer;
    /**
     * The current onboarding status for this business activation state.
     */
    private ActivationOnboardingStatus onboardingStatus;
    /**
     * The date and time for the payment method confirmed at value on this business activation state.
     */
    private OffsetDateTime paymentMethodConfirmedAt;
    /**
     * The current payment status for this business activation state.
     */
    private ActivationPaymentStatus paymentStatus;
    /**
     * The selected domain value for this business activation state.
     */
    private String selectedDomain;
    /**
     * The service area value for this business activation state.
     */
    private String serviceArea;
    /**
     * The current status for this business activation state.
     */
    private CustomerActivationStatus status;
    /**
     * The date and time for the subscription active at value on this business activation state.
     */
    private OffsetDateTime subscriptionActiveAt;
    /**
     * The date and time for the subscription pending at value on this business activation state.
     */
    private OffsetDateTime subscriptionPendingAt;
    /**
     * The target audience value for this business activation state.
     */
    private String targetAudience;
    /**
     * The date and time for the telephony partially provisioned at value on this business activation state.
     */
    private OffsetDateTime telephonyPartiallyProvisionedAt;
    /**
     * The date and time for the telephony provisioning started at value on this business activation state.
     */
    private OffsetDateTime telephonyProvisioningStartedAt;
    /**
     * The date and time for the telephony ready at value on this business activation state.
     */
    private OffsetDateTime telephonyReadyAt;
    /**
     * The current telephony status for this business activation state.
     */
    private ActivationTelephonyStatus telephonyStatus;
    /**
     * The 10DLC draft value for this business activation state.
     */
    private BusinessActivationStateTenDlcDraft tenDlcDraft;
    /**
     * The current 10DLC status for this business activation state.
     */
    private TenDlcApplicationStatus tenDlcStatus;
    /**
     * The date and time for the updated at value on this business activation state.
     */
    private OffsetDateTime updatedAt;
    /**
     * The website needs value for this business activation state.
     */
    private String websiteNeeds;
    /**
     * The current website status for this business activation state.
     */
    private WebsiteLifecycleStatus websiteStatus;
    /**
     * The URL associated with this business activation state.
     */
    private String websiteUrl;
    /**
     * Instantiates a new {@link BusinessActivationState} and sets the default values.
     */
    public BusinessActivationState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessActivationState}
     */
    @jakarta.annotation.Nonnull
    public static BusinessActivationState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessActivationState();
    }
    /**
     * Gets the activatedAt property value. The date and time for the activated at value on this business activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActivatedAt() {
        return this.activatedAt;
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
     * Gets the billingSubscriptionStatus property value. The current billing subscription status for this business activation state.
     * @return a {@link ActivationSubscriptionStatus}
     */
    @jakarta.annotation.Nullable
    public ActivationSubscriptionStatus getBillingSubscriptionStatus() {
        return this.billingSubscriptionStatus;
    }
    /**
     * Gets the businessDescription property value. The business description value for this business activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessDescription() {
        return this.businessDescription;
    }
    /**
     * Gets the complianceNotes property value. The compliance notes value for this business activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComplianceNotes() {
        return this.complianceNotes;
    }
    /**
     * Gets the controlledLaunch property value. Whether controlled launch applies to this business activation state.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getControlledLaunch() {
        return this.controlledLaunch;
    }
    /**
     * Gets the createdAt property value. The date and time for the created at value on this business activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the customerFacingStatus property value. The current customer facing status for this business activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomerFacingStatus() {
        return this.customerFacingStatus;
    }
    /**
     * Gets the domainApprovedAt property value. The date and time for the domain approved at value on this business activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDomainApprovedAt() {
        return this.domainApprovedAt;
    }
    /**
     * Gets the domainOptions property value. The domain options included with this business activation state.
     * @return a {@link java.util.List<ActivationDomainOption>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActivationDomainOption> getDomainOptions() {
        return this.domainOptions;
    }
    /**
     * Gets the events property value. The events included with this business activation state.
     * @return a {@link java.util.List<ActivationTimelineEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActivationTimelineEvent> getEvents() {
        return this.events;
    }
    /**
     * Gets the failedAt property value. The date and time for the failed at value on this business activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFailedAt() {
        return this.failedAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(35);
        deserializerMap.put("activatedAt", (n) -> { this.setActivatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("billingSubscriptionStatus", (n) -> { this.setBillingSubscriptionStatus(n.getEnumValue(ActivationSubscriptionStatus::forValue)); });
        deserializerMap.put("businessDescription", (n) -> { this.setBusinessDescription(n.getStringValue()); });
        deserializerMap.put("complianceNotes", (n) -> { this.setComplianceNotes(n.getStringValue()); });
        deserializerMap.put("controlledLaunch", (n) -> { this.setControlledLaunch(n.getBooleanValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customerFacingStatus", (n) -> { this.setCustomerFacingStatus(n.getStringValue()); });
        deserializerMap.put("domainApprovedAt", (n) -> { this.setDomainApprovedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("domainOptions", (n) -> { this.setDomainOptions(n.getCollectionOfObjectValues(ActivationDomainOption::createFromDiscriminatorValue)); });
        deserializerMap.put("events", (n) -> { this.setEvents(n.getCollectionOfObjectValues(ActivationTimelineEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("failedAt", (n) -> { this.setFailedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("industry", (n) -> { this.setIndustry(n.getStringValue()); });
        deserializerMap.put("launchApprovedAt", (n) -> { this.setLaunchApprovedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("launchReviewRequestedAt", (n) -> { this.setLaunchReviewRequestedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("launchReviewStatus", (n) -> { this.setLaunchReviewStatus(n.getEnumValue(ActivationLaunchReviewStatus::forValue)); });
        deserializerMap.put("offer", (n) -> { this.setOffer(n.getStringValue()); });
        deserializerMap.put("onboardingStatus", (n) -> { this.setOnboardingStatus(n.getEnumValue(ActivationOnboardingStatus::forValue)); });
        deserializerMap.put("paymentMethodConfirmedAt", (n) -> { this.setPaymentMethodConfirmedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("paymentStatus", (n) -> { this.setPaymentStatus(n.getEnumValue(ActivationPaymentStatus::forValue)); });
        deserializerMap.put("selectedDomain", (n) -> { this.setSelectedDomain(n.getStringValue()); });
        deserializerMap.put("serviceArea", (n) -> { this.setServiceArea(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CustomerActivationStatus::forValue)); });
        deserializerMap.put("subscriptionActiveAt", (n) -> { this.setSubscriptionActiveAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("subscriptionPendingAt", (n) -> { this.setSubscriptionPendingAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("targetAudience", (n) -> { this.setTargetAudience(n.getStringValue()); });
        deserializerMap.put("telephonyPartiallyProvisionedAt", (n) -> { this.setTelephonyPartiallyProvisionedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("telephonyProvisioningStartedAt", (n) -> { this.setTelephonyProvisioningStartedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("telephonyReadyAt", (n) -> { this.setTelephonyReadyAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("telephonyStatus", (n) -> { this.setTelephonyStatus(n.getEnumValue(ActivationTelephonyStatus::forValue)); });
        deserializerMap.put("tenDlcDraft", (n) -> { this.setTenDlcDraft(n.getObjectValue(BusinessActivationStateTenDlcDraft::createFromDiscriminatorValue)); });
        deserializerMap.put("tenDlcStatus", (n) -> { this.setTenDlcStatus(n.getEnumValue(TenDlcApplicationStatus::forValue)); });
        deserializerMap.put("updatedAt", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("websiteNeeds", (n) -> { this.setWebsiteNeeds(n.getStringValue()); });
        deserializerMap.put("websiteStatus", (n) -> { this.setWebsiteStatus(n.getEnumValue(WebsiteLifecycleStatus::forValue)); });
        deserializerMap.put("websiteUrl", (n) -> { this.setWebsiteUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the industry property value. The industry value for this business activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIndustry() {
        return this.industry;
    }
    /**
     * Gets the launchApprovedAt property value. The date and time for the launch approved at value on this business activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLaunchApprovedAt() {
        return this.launchApprovedAt;
    }
    /**
     * Gets the launchReviewRequestedAt property value. The date and time for the launch review requested at value on this business activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLaunchReviewRequestedAt() {
        return this.launchReviewRequestedAt;
    }
    /**
     * Gets the launchReviewStatus property value. The current launch review status for this business activation state.
     * @return a {@link ActivationLaunchReviewStatus}
     */
    @jakarta.annotation.Nullable
    public ActivationLaunchReviewStatus getLaunchReviewStatus() {
        return this.launchReviewStatus;
    }
    /**
     * Gets the offer property value. The offer value for this business activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOffer() {
        return this.offer;
    }
    /**
     * Gets the onboardingStatus property value. The current onboarding status for this business activation state.
     * @return a {@link ActivationOnboardingStatus}
     */
    @jakarta.annotation.Nullable
    public ActivationOnboardingStatus getOnboardingStatus() {
        return this.onboardingStatus;
    }
    /**
     * Gets the paymentMethodConfirmedAt property value. The date and time for the payment method confirmed at value on this business activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPaymentMethodConfirmedAt() {
        return this.paymentMethodConfirmedAt;
    }
    /**
     * Gets the paymentStatus property value. The current payment status for this business activation state.
     * @return a {@link ActivationPaymentStatus}
     */
    @jakarta.annotation.Nullable
    public ActivationPaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }
    /**
     * Gets the selectedDomain property value. The selected domain value for this business activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSelectedDomain() {
        return this.selectedDomain;
    }
    /**
     * Gets the serviceArea property value. The service area value for this business activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceArea() {
        return this.serviceArea;
    }
    /**
     * Gets the status property value. The current status for this business activation state.
     * @return a {@link CustomerActivationStatus}
     */
    @jakarta.annotation.Nullable
    public CustomerActivationStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the subscriptionActiveAt property value. The date and time for the subscription active at value on this business activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSubscriptionActiveAt() {
        return this.subscriptionActiveAt;
    }
    /**
     * Gets the subscriptionPendingAt property value. The date and time for the subscription pending at value on this business activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSubscriptionPendingAt() {
        return this.subscriptionPendingAt;
    }
    /**
     * Gets the targetAudience property value. The target audience value for this business activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetAudience() {
        return this.targetAudience;
    }
    /**
     * Gets the telephonyPartiallyProvisionedAt property value. The date and time for the telephony partially provisioned at value on this business activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTelephonyPartiallyProvisionedAt() {
        return this.telephonyPartiallyProvisionedAt;
    }
    /**
     * Gets the telephonyProvisioningStartedAt property value. The date and time for the telephony provisioning started at value on this business activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTelephonyProvisioningStartedAt() {
        return this.telephonyProvisioningStartedAt;
    }
    /**
     * Gets the telephonyReadyAt property value. The date and time for the telephony ready at value on this business activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTelephonyReadyAt() {
        return this.telephonyReadyAt;
    }
    /**
     * Gets the telephonyStatus property value. The current telephony status for this business activation state.
     * @return a {@link ActivationTelephonyStatus}
     */
    @jakarta.annotation.Nullable
    public ActivationTelephonyStatus getTelephonyStatus() {
        return this.telephonyStatus;
    }
    /**
     * Gets the tenDlcDraft property value. The 10DLC draft value for this business activation state.
     * @return a {@link BusinessActivationStateTenDlcDraft}
     */
    @jakarta.annotation.Nullable
    public BusinessActivationStateTenDlcDraft getTenDlcDraft() {
        return this.tenDlcDraft;
    }
    /**
     * Gets the tenDlcStatus property value. The current 10DLC status for this business activation state.
     * @return a {@link TenDlcApplicationStatus}
     */
    @jakarta.annotation.Nullable
    public TenDlcApplicationStatus getTenDlcStatus() {
        return this.tenDlcStatus;
    }
    /**
     * Gets the updatedAt property value. The date and time for the updated at value on this business activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Gets the websiteNeeds property value. The website needs value for this business activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebsiteNeeds() {
        return this.websiteNeeds;
    }
    /**
     * Gets the websiteStatus property value. The current website status for this business activation state.
     * @return a {@link WebsiteLifecycleStatus}
     */
    @jakarta.annotation.Nullable
    public WebsiteLifecycleStatus getWebsiteStatus() {
        return this.websiteStatus;
    }
    /**
     * Gets the websiteUrl property value. The URL associated with this business activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebsiteUrl() {
        return this.websiteUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("activatedAt", this.getActivatedAt());
        writer.writeEnumValue("billingSubscriptionStatus", this.getBillingSubscriptionStatus());
        writer.writeStringValue("businessDescription", this.getBusinessDescription());
        writer.writeStringValue("complianceNotes", this.getComplianceNotes());
        writer.writeBooleanValue("controlledLaunch", this.getControlledLaunch());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("customerFacingStatus", this.getCustomerFacingStatus());
        writer.writeOffsetDateTimeValue("domainApprovedAt", this.getDomainApprovedAt());
        writer.writeCollectionOfObjectValues("domainOptions", this.getDomainOptions());
        writer.writeCollectionOfObjectValues("events", this.getEvents());
        writer.writeOffsetDateTimeValue("failedAt", this.getFailedAt());
        writer.writeStringValue("industry", this.getIndustry());
        writer.writeOffsetDateTimeValue("launchApprovedAt", this.getLaunchApprovedAt());
        writer.writeOffsetDateTimeValue("launchReviewRequestedAt", this.getLaunchReviewRequestedAt());
        writer.writeEnumValue("launchReviewStatus", this.getLaunchReviewStatus());
        writer.writeStringValue("offer", this.getOffer());
        writer.writeEnumValue("onboardingStatus", this.getOnboardingStatus());
        writer.writeOffsetDateTimeValue("paymentMethodConfirmedAt", this.getPaymentMethodConfirmedAt());
        writer.writeEnumValue("paymentStatus", this.getPaymentStatus());
        writer.writeStringValue("selectedDomain", this.getSelectedDomain());
        writer.writeStringValue("serviceArea", this.getServiceArea());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeOffsetDateTimeValue("subscriptionActiveAt", this.getSubscriptionActiveAt());
        writer.writeOffsetDateTimeValue("subscriptionPendingAt", this.getSubscriptionPendingAt());
        writer.writeStringValue("targetAudience", this.getTargetAudience());
        writer.writeOffsetDateTimeValue("telephonyPartiallyProvisionedAt", this.getTelephonyPartiallyProvisionedAt());
        writer.writeOffsetDateTimeValue("telephonyProvisioningStartedAt", this.getTelephonyProvisioningStartedAt());
        writer.writeOffsetDateTimeValue("telephonyReadyAt", this.getTelephonyReadyAt());
        writer.writeEnumValue("telephonyStatus", this.getTelephonyStatus());
        writer.writeObjectValue("tenDlcDraft", this.getTenDlcDraft());
        writer.writeEnumValue("tenDlcStatus", this.getTenDlcStatus());
        writer.writeOffsetDateTimeValue("updatedAt", this.getUpdatedAt());
        writer.writeStringValue("websiteNeeds", this.getWebsiteNeeds());
        writer.writeEnumValue("websiteStatus", this.getWebsiteStatus());
        writer.writeStringValue("websiteUrl", this.getWebsiteUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activatedAt property value. The date and time for the activated at value on this business activation state.
     * @param value Value to set for the activatedAt property.
     */
    public void setActivatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.activatedAt = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the billingSubscriptionStatus property value. The current billing subscription status for this business activation state.
     * @param value Value to set for the billingSubscriptionStatus property.
     */
    public void setBillingSubscriptionStatus(@jakarta.annotation.Nullable final ActivationSubscriptionStatus value) {
        this.billingSubscriptionStatus = value;
    }
    /**
     * Sets the businessDescription property value. The business description value for this business activation state.
     * @param value Value to set for the businessDescription property.
     */
    public void setBusinessDescription(@jakarta.annotation.Nullable final String value) {
        this.businessDescription = value;
    }
    /**
     * Sets the complianceNotes property value. The compliance notes value for this business activation state.
     * @param value Value to set for the complianceNotes property.
     */
    public void setComplianceNotes(@jakarta.annotation.Nullable final String value) {
        this.complianceNotes = value;
    }
    /**
     * Sets the controlledLaunch property value. Whether controlled launch applies to this business activation state.
     * @param value Value to set for the controlledLaunch property.
     */
    public void setControlledLaunch(@jakarta.annotation.Nullable final Boolean value) {
        this.controlledLaunch = value;
    }
    /**
     * Sets the createdAt property value. The date and time for the created at value on this business activation state.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the customerFacingStatus property value. The current customer facing status for this business activation state.
     * @param value Value to set for the customerFacingStatus property.
     */
    public void setCustomerFacingStatus(@jakarta.annotation.Nullable final String value) {
        this.customerFacingStatus = value;
    }
    /**
     * Sets the domainApprovedAt property value. The date and time for the domain approved at value on this business activation state.
     * @param value Value to set for the domainApprovedAt property.
     */
    public void setDomainApprovedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.domainApprovedAt = value;
    }
    /**
     * Sets the domainOptions property value. The domain options included with this business activation state.
     * @param value Value to set for the domainOptions property.
     */
    public void setDomainOptions(@jakarta.annotation.Nullable final java.util.List<ActivationDomainOption> value) {
        this.domainOptions = value;
    }
    /**
     * Sets the events property value. The events included with this business activation state.
     * @param value Value to set for the events property.
     */
    public void setEvents(@jakarta.annotation.Nullable final java.util.List<ActivationTimelineEvent> value) {
        this.events = value;
    }
    /**
     * Sets the failedAt property value. The date and time for the failed at value on this business activation state.
     * @param value Value to set for the failedAt property.
     */
    public void setFailedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.failedAt = value;
    }
    /**
     * Sets the industry property value. The industry value for this business activation state.
     * @param value Value to set for the industry property.
     */
    public void setIndustry(@jakarta.annotation.Nullable final String value) {
        this.industry = value;
    }
    /**
     * Sets the launchApprovedAt property value. The date and time for the launch approved at value on this business activation state.
     * @param value Value to set for the launchApprovedAt property.
     */
    public void setLaunchApprovedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.launchApprovedAt = value;
    }
    /**
     * Sets the launchReviewRequestedAt property value. The date and time for the launch review requested at value on this business activation state.
     * @param value Value to set for the launchReviewRequestedAt property.
     */
    public void setLaunchReviewRequestedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.launchReviewRequestedAt = value;
    }
    /**
     * Sets the launchReviewStatus property value. The current launch review status for this business activation state.
     * @param value Value to set for the launchReviewStatus property.
     */
    public void setLaunchReviewStatus(@jakarta.annotation.Nullable final ActivationLaunchReviewStatus value) {
        this.launchReviewStatus = value;
    }
    /**
     * Sets the offer property value. The offer value for this business activation state.
     * @param value Value to set for the offer property.
     */
    public void setOffer(@jakarta.annotation.Nullable final String value) {
        this.offer = value;
    }
    /**
     * Sets the onboardingStatus property value. The current onboarding status for this business activation state.
     * @param value Value to set for the onboardingStatus property.
     */
    public void setOnboardingStatus(@jakarta.annotation.Nullable final ActivationOnboardingStatus value) {
        this.onboardingStatus = value;
    }
    /**
     * Sets the paymentMethodConfirmedAt property value. The date and time for the payment method confirmed at value on this business activation state.
     * @param value Value to set for the paymentMethodConfirmedAt property.
     */
    public void setPaymentMethodConfirmedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.paymentMethodConfirmedAt = value;
    }
    /**
     * Sets the paymentStatus property value. The current payment status for this business activation state.
     * @param value Value to set for the paymentStatus property.
     */
    public void setPaymentStatus(@jakarta.annotation.Nullable final ActivationPaymentStatus value) {
        this.paymentStatus = value;
    }
    /**
     * Sets the selectedDomain property value. The selected domain value for this business activation state.
     * @param value Value to set for the selectedDomain property.
     */
    public void setSelectedDomain(@jakarta.annotation.Nullable final String value) {
        this.selectedDomain = value;
    }
    /**
     * Sets the serviceArea property value. The service area value for this business activation state.
     * @param value Value to set for the serviceArea property.
     */
    public void setServiceArea(@jakarta.annotation.Nullable final String value) {
        this.serviceArea = value;
    }
    /**
     * Sets the status property value. The current status for this business activation state.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CustomerActivationStatus value) {
        this.status = value;
    }
    /**
     * Sets the subscriptionActiveAt property value. The date and time for the subscription active at value on this business activation state.
     * @param value Value to set for the subscriptionActiveAt property.
     */
    public void setSubscriptionActiveAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.subscriptionActiveAt = value;
    }
    /**
     * Sets the subscriptionPendingAt property value. The date and time for the subscription pending at value on this business activation state.
     * @param value Value to set for the subscriptionPendingAt property.
     */
    public void setSubscriptionPendingAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.subscriptionPendingAt = value;
    }
    /**
     * Sets the targetAudience property value. The target audience value for this business activation state.
     * @param value Value to set for the targetAudience property.
     */
    public void setTargetAudience(@jakarta.annotation.Nullable final String value) {
        this.targetAudience = value;
    }
    /**
     * Sets the telephonyPartiallyProvisionedAt property value. The date and time for the telephony partially provisioned at value on this business activation state.
     * @param value Value to set for the telephonyPartiallyProvisionedAt property.
     */
    public void setTelephonyPartiallyProvisionedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.telephonyPartiallyProvisionedAt = value;
    }
    /**
     * Sets the telephonyProvisioningStartedAt property value. The date and time for the telephony provisioning started at value on this business activation state.
     * @param value Value to set for the telephonyProvisioningStartedAt property.
     */
    public void setTelephonyProvisioningStartedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.telephonyProvisioningStartedAt = value;
    }
    /**
     * Sets the telephonyReadyAt property value. The date and time for the telephony ready at value on this business activation state.
     * @param value Value to set for the telephonyReadyAt property.
     */
    public void setTelephonyReadyAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.telephonyReadyAt = value;
    }
    /**
     * Sets the telephonyStatus property value. The current telephony status for this business activation state.
     * @param value Value to set for the telephonyStatus property.
     */
    public void setTelephonyStatus(@jakarta.annotation.Nullable final ActivationTelephonyStatus value) {
        this.telephonyStatus = value;
    }
    /**
     * Sets the tenDlcDraft property value. The 10DLC draft value for this business activation state.
     * @param value Value to set for the tenDlcDraft property.
     */
    public void setTenDlcDraft(@jakarta.annotation.Nullable final BusinessActivationStateTenDlcDraft value) {
        this.tenDlcDraft = value;
    }
    /**
     * Sets the tenDlcStatus property value. The current 10DLC status for this business activation state.
     * @param value Value to set for the tenDlcStatus property.
     */
    public void setTenDlcStatus(@jakarta.annotation.Nullable final TenDlcApplicationStatus value) {
        this.tenDlcStatus = value;
    }
    /**
     * Sets the updatedAt property value. The date and time for the updated at value on this business activation state.
     * @param value Value to set for the updatedAt property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
    /**
     * Sets the websiteNeeds property value. The website needs value for this business activation state.
     * @param value Value to set for the websiteNeeds property.
     */
    public void setWebsiteNeeds(@jakarta.annotation.Nullable final String value) {
        this.websiteNeeds = value;
    }
    /**
     * Sets the websiteStatus property value. The current website status for this business activation state.
     * @param value Value to set for the websiteStatus property.
     */
    public void setWebsiteStatus(@jakarta.annotation.Nullable final WebsiteLifecycleStatus value) {
        this.websiteStatus = value;
    }
    /**
     * Sets the websiteUrl property value. The URL associated with this business activation state.
     * @param value Value to set for the websiteUrl property.
     */
    public void setWebsiteUrl(@jakarta.annotation.Nullable final String value) {
        this.websiteUrl = value;
    }
}
