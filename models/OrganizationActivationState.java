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
 * Describes organization activation state data used in Leadping API requests and responses.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationActivationState implements AdditionalDataHolder, Parsable {
    /**
     * UTC timestamp for activated at on this organization activation state.
     */
    private OffsetDateTime activatedAt;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number of registrar-verified domains found by the current search.
     */
    private UntypedNode availableDomainCount;
    /**
     * The current billing subscription status for this organization activation state.
     */
    private ActivationSubscriptionStatus billingSubscriptionStatus;
    /**
     * Compliance notes for this organization activation state.
     */
    private String complianceNotes;
    /**
     * Whether controlled launch applies to this organization activation state.
     */
    private Boolean controlledLaunch;
    /**
     * UTC timestamp for created at on this organization activation state.
     */
    private OffsetDateTime createdAt;
    /**
     * The current customer facing status for this organization activation state.
     */
    private String customerFacingStatus;
    /**
     * UTC timestamp for domain approved at on this organization activation state.
     */
    private OffsetDateTime domainApprovedAt;
    /**
     * The domain options included with this organization activation state.
     */
    private java.util.List<ActivationDomainOption> domainOptions;
    /**
     * The date and time the selected domain was purchased.
     */
    private OffsetDateTime domainPurchasedAt;
    /**
     * The current domain generation attempt.
     */
    private UntypedNode domainSearchAttempt;
    /**
     * Identifies the active domain search run.
     */
    private String domainSearchId;
    /**
     * Defines the stages of a domain search.
     */
    private OrganizationActivationStateDomainSearchStage domainSearchStage;
    /**
     * The last time domain search progress changed.
     */
    private OffsetDateTime domainSearchUpdatedAt;
    /**
     * The events included with this organization activation state.
     */
    private java.util.List<ActivationTimelineEvent> events;
    /**
     * UTC timestamp for failed at on this organization activation state.
     */
    private OffsetDateTime failedAt;
    /**
     * Industry for this organization activation state.
     */
    private String industry;
    /**
     * UTC timestamp for launch approved at on this organization activation state.
     */
    private OffsetDateTime launchApprovedAt;
    /**
     * UTC timestamp for launch review requested at on this organization activation state.
     */
    private OffsetDateTime launchReviewRequestedAt;
    /**
     * The current launch review status for this organization activation state.
     */
    private ActivationLaunchReviewStatus launchReviewStatus;
    /**
     * Offer for this organization activation state.
     */
    private String offer;
    /**
     * The current onboarding status for this organization activation state.
     */
    private ActivationOnboardingStatus onboardingStatus;
    /**
     * Organization description for this organization activation state.
     */
    private String organizationDescription;
    /**
     * UTC timestamp for payment method confirmed at on this organization activation state.
     */
    private OffsetDateTime paymentMethodConfirmedAt;
    /**
     * The current payment status for this organization activation state.
     */
    private ActivationPaymentStatus paymentStatus;
    /**
     * Selected domain for this organization activation state.
     */
    private String selectedDomain;
    /**
     * Service area for this organization activation state.
     */
    private String serviceArea;
    /**
     * The current status for this organization activation state.
     */
    private CustomerActivationStatus status;
    /**
     * UTC timestamp for subscription active at on this organization activation state.
     */
    private OffsetDateTime subscriptionActiveAt;
    /**
     * UTC timestamp for subscription pending at on this organization activation state.
     */
    private OffsetDateTime subscriptionPendingAt;
    /**
     * Target audience for this organization activation state.
     */
    private String targetAudience;
    /**
     * UTC timestamp for telephony partially provisioned at on this organization activation state.
     */
    private OffsetDateTime telephonyPartiallyProvisionedAt;
    /**
     * UTC timestamp for telephony provisioning started at on this organization activation state.
     */
    private OffsetDateTime telephonyProvisioningStartedAt;
    /**
     * UTC timestamp for telephony ready at on this organization activation state.
     */
    private OffsetDateTime telephonyReadyAt;
    /**
     * The current telephony status for this organization activation state.
     */
    private ActivationTelephonyStatus telephonyStatus;
    /**
     * Identifier of the first-class 10DLC application entity for this organization.
     */
    private String tenDlcApplicationId;
    /**
     * 10DLC draft for this organization activation state.
     */
    private OrganizationActivationStateTenDlcDraft tenDlcDraft;
    /**
     * The current 10DLC status for this organization activation state.
     */
    private TenDlcApplicationStatus tenDlcStatus;
    /**
     * UTC timestamp for updated at on this organization activation state.
     */
    private OffsetDateTime updatedAt;
    /**
     * The latest persisted website generation progress message.
     */
    private String websiteGenerationResult;
    /**
     * Website needs for this organization activation state.
     */
    private String websiteNeeds;
    /**
     * The current website status for this organization activation state.
     */
    private WebsiteLifecycleStatus websiteStatus;
    /**
     * The URL associated with this organization activation state.
     */
    private String websiteUrl;
    /**
     * Instantiates a new {@link OrganizationActivationState} and sets the default values.
     */
    public OrganizationActivationState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationActivationState}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationActivationState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationActivationState();
    }
    /**
     * Gets the activatedAt property value. UTC timestamp for activated at on this organization activation state.
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
     * Gets the availableDomainCount property value. The number of registrar-verified domains found by the current search.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAvailableDomainCount() {
        return this.availableDomainCount;
    }
    /**
     * Gets the billingSubscriptionStatus property value. The current billing subscription status for this organization activation state.
     * @return a {@link ActivationSubscriptionStatus}
     */
    @jakarta.annotation.Nullable
    public ActivationSubscriptionStatus getBillingSubscriptionStatus() {
        return this.billingSubscriptionStatus;
    }
    /**
     * Gets the complianceNotes property value. Compliance notes for this organization activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComplianceNotes() {
        return this.complianceNotes;
    }
    /**
     * Gets the controlledLaunch property value. Whether controlled launch applies to this organization activation state.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getControlledLaunch() {
        return this.controlledLaunch;
    }
    /**
     * Gets the createdAt property value. UTC timestamp for created at on this organization activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the customerFacingStatus property value. The current customer facing status for this organization activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomerFacingStatus() {
        return this.customerFacingStatus;
    }
    /**
     * Gets the domainApprovedAt property value. UTC timestamp for domain approved at on this organization activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDomainApprovedAt() {
        return this.domainApprovedAt;
    }
    /**
     * Gets the domainOptions property value. The domain options included with this organization activation state.
     * @return a {@link java.util.List<ActivationDomainOption>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActivationDomainOption> getDomainOptions() {
        return this.domainOptions;
    }
    /**
     * Gets the domainPurchasedAt property value. The date and time the selected domain was purchased.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDomainPurchasedAt() {
        return this.domainPurchasedAt;
    }
    /**
     * Gets the domainSearchAttempt property value. The current domain generation attempt.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getDomainSearchAttempt() {
        return this.domainSearchAttempt;
    }
    /**
     * Gets the domainSearchId property value. Identifies the active domain search run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomainSearchId() {
        return this.domainSearchId;
    }
    /**
     * Gets the domainSearchStage property value. Defines the stages of a domain search.
     * @return a {@link OrganizationActivationStateDomainSearchStage}
     */
    @jakarta.annotation.Nullable
    public OrganizationActivationStateDomainSearchStage getDomainSearchStage() {
        return this.domainSearchStage;
    }
    /**
     * Gets the domainSearchUpdatedAt property value. The last time domain search progress changed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDomainSearchUpdatedAt() {
        return this.domainSearchUpdatedAt;
    }
    /**
     * Gets the events property value. The events included with this organization activation state.
     * @return a {@link java.util.List<ActivationTimelineEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActivationTimelineEvent> getEvents() {
        return this.events;
    }
    /**
     * Gets the failedAt property value. UTC timestamp for failed at on this organization activation state.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(43);
        deserializerMap.put("activatedAt", (n) -> { this.setActivatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("availableDomainCount", (n) -> { this.setAvailableDomainCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("billingSubscriptionStatus", (n) -> { this.setBillingSubscriptionStatus(n.getEnumValue(ActivationSubscriptionStatus::forValue)); });
        deserializerMap.put("complianceNotes", (n) -> { this.setComplianceNotes(n.getStringValue()); });
        deserializerMap.put("controlledLaunch", (n) -> { this.setControlledLaunch(n.getBooleanValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customerFacingStatus", (n) -> { this.setCustomerFacingStatus(n.getStringValue()); });
        deserializerMap.put("domainApprovedAt", (n) -> { this.setDomainApprovedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("domainOptions", (n) -> { this.setDomainOptions(n.getCollectionOfObjectValues(ActivationDomainOption::createFromDiscriminatorValue)); });
        deserializerMap.put("domainPurchasedAt", (n) -> { this.setDomainPurchasedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("domainSearchAttempt", (n) -> { this.setDomainSearchAttempt(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("domainSearchId", (n) -> { this.setDomainSearchId(n.getStringValue()); });
        deserializerMap.put("domainSearchStage", (n) -> { this.setDomainSearchStage(n.getEnumValue(OrganizationActivationStateDomainSearchStage::forValue)); });
        deserializerMap.put("domainSearchUpdatedAt", (n) -> { this.setDomainSearchUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("events", (n) -> { this.setEvents(n.getCollectionOfObjectValues(ActivationTimelineEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("failedAt", (n) -> { this.setFailedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("industry", (n) -> { this.setIndustry(n.getStringValue()); });
        deserializerMap.put("launchApprovedAt", (n) -> { this.setLaunchApprovedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("launchReviewRequestedAt", (n) -> { this.setLaunchReviewRequestedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("launchReviewStatus", (n) -> { this.setLaunchReviewStatus(n.getEnumValue(ActivationLaunchReviewStatus::forValue)); });
        deserializerMap.put("offer", (n) -> { this.setOffer(n.getStringValue()); });
        deserializerMap.put("onboardingStatus", (n) -> { this.setOnboardingStatus(n.getEnumValue(ActivationOnboardingStatus::forValue)); });
        deserializerMap.put("organizationDescription", (n) -> { this.setOrganizationDescription(n.getStringValue()); });
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
        deserializerMap.put("tenDlcApplicationId", (n) -> { this.setTenDlcApplicationId(n.getStringValue()); });
        deserializerMap.put("tenDlcDraft", (n) -> { this.setTenDlcDraft(n.getObjectValue(OrganizationActivationStateTenDlcDraft::createFromDiscriminatorValue)); });
        deserializerMap.put("tenDlcStatus", (n) -> { this.setTenDlcStatus(n.getEnumValue(TenDlcApplicationStatus::forValue)); });
        deserializerMap.put("updatedAt", (n) -> { this.setUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("websiteGenerationResult", (n) -> { this.setWebsiteGenerationResult(n.getStringValue()); });
        deserializerMap.put("websiteNeeds", (n) -> { this.setWebsiteNeeds(n.getStringValue()); });
        deserializerMap.put("websiteStatus", (n) -> { this.setWebsiteStatus(n.getEnumValue(WebsiteLifecycleStatus::forValue)); });
        deserializerMap.put("websiteUrl", (n) -> { this.setWebsiteUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the industry property value. Industry for this organization activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIndustry() {
        return this.industry;
    }
    /**
     * Gets the launchApprovedAt property value. UTC timestamp for launch approved at on this organization activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLaunchApprovedAt() {
        return this.launchApprovedAt;
    }
    /**
     * Gets the launchReviewRequestedAt property value. UTC timestamp for launch review requested at on this organization activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLaunchReviewRequestedAt() {
        return this.launchReviewRequestedAt;
    }
    /**
     * Gets the launchReviewStatus property value. The current launch review status for this organization activation state.
     * @return a {@link ActivationLaunchReviewStatus}
     */
    @jakarta.annotation.Nullable
    public ActivationLaunchReviewStatus getLaunchReviewStatus() {
        return this.launchReviewStatus;
    }
    /**
     * Gets the offer property value. Offer for this organization activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOffer() {
        return this.offer;
    }
    /**
     * Gets the onboardingStatus property value. The current onboarding status for this organization activation state.
     * @return a {@link ActivationOnboardingStatus}
     */
    @jakarta.annotation.Nullable
    public ActivationOnboardingStatus getOnboardingStatus() {
        return this.onboardingStatus;
    }
    /**
     * Gets the organizationDescription property value. Organization description for this organization activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrganizationDescription() {
        return this.organizationDescription;
    }
    /**
     * Gets the paymentMethodConfirmedAt property value. UTC timestamp for payment method confirmed at on this organization activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPaymentMethodConfirmedAt() {
        return this.paymentMethodConfirmedAt;
    }
    /**
     * Gets the paymentStatus property value. The current payment status for this organization activation state.
     * @return a {@link ActivationPaymentStatus}
     */
    @jakarta.annotation.Nullable
    public ActivationPaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }
    /**
     * Gets the selectedDomain property value. Selected domain for this organization activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSelectedDomain() {
        return this.selectedDomain;
    }
    /**
     * Gets the serviceArea property value. Service area for this organization activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceArea() {
        return this.serviceArea;
    }
    /**
     * Gets the status property value. The current status for this organization activation state.
     * @return a {@link CustomerActivationStatus}
     */
    @jakarta.annotation.Nullable
    public CustomerActivationStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the subscriptionActiveAt property value. UTC timestamp for subscription active at on this organization activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSubscriptionActiveAt() {
        return this.subscriptionActiveAt;
    }
    /**
     * Gets the subscriptionPendingAt property value. UTC timestamp for subscription pending at on this organization activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSubscriptionPendingAt() {
        return this.subscriptionPendingAt;
    }
    /**
     * Gets the targetAudience property value. Target audience for this organization activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetAudience() {
        return this.targetAudience;
    }
    /**
     * Gets the telephonyPartiallyProvisionedAt property value. UTC timestamp for telephony partially provisioned at on this organization activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTelephonyPartiallyProvisionedAt() {
        return this.telephonyPartiallyProvisionedAt;
    }
    /**
     * Gets the telephonyProvisioningStartedAt property value. UTC timestamp for telephony provisioning started at on this organization activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTelephonyProvisioningStartedAt() {
        return this.telephonyProvisioningStartedAt;
    }
    /**
     * Gets the telephonyReadyAt property value. UTC timestamp for telephony ready at on this organization activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getTelephonyReadyAt() {
        return this.telephonyReadyAt;
    }
    /**
     * Gets the telephonyStatus property value. The current telephony status for this organization activation state.
     * @return a {@link ActivationTelephonyStatus}
     */
    @jakarta.annotation.Nullable
    public ActivationTelephonyStatus getTelephonyStatus() {
        return this.telephonyStatus;
    }
    /**
     * Gets the tenDlcApplicationId property value. Identifier of the first-class 10DLC application entity for this organization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTenDlcApplicationId() {
        return this.tenDlcApplicationId;
    }
    /**
     * Gets the tenDlcDraft property value. 10DLC draft for this organization activation state.
     * @return a {@link OrganizationActivationStateTenDlcDraft}
     */
    @jakarta.annotation.Nullable
    public OrganizationActivationStateTenDlcDraft getTenDlcDraft() {
        return this.tenDlcDraft;
    }
    /**
     * Gets the tenDlcStatus property value. The current 10DLC status for this organization activation state.
     * @return a {@link TenDlcApplicationStatus}
     */
    @jakarta.annotation.Nullable
    public TenDlcApplicationStatus getTenDlcStatus() {
        return this.tenDlcStatus;
    }
    /**
     * Gets the updatedAt property value. UTC timestamp for updated at on this organization activation state.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }
    /**
     * Gets the websiteGenerationResult property value. The latest persisted website generation progress message.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebsiteGenerationResult() {
        return this.websiteGenerationResult;
    }
    /**
     * Gets the websiteNeeds property value. Website needs for this organization activation state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebsiteNeeds() {
        return this.websiteNeeds;
    }
    /**
     * Gets the websiteStatus property value. The current website status for this organization activation state.
     * @return a {@link WebsiteLifecycleStatus}
     */
    @jakarta.annotation.Nullable
    public WebsiteLifecycleStatus getWebsiteStatus() {
        return this.websiteStatus;
    }
    /**
     * Gets the websiteUrl property value. The URL associated with this organization activation state.
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
        writer.writeObjectValue("availableDomainCount", this.getAvailableDomainCount());
        writer.writeEnumValue("billingSubscriptionStatus", this.getBillingSubscriptionStatus());
        writer.writeStringValue("complianceNotes", this.getComplianceNotes());
        writer.writeBooleanValue("controlledLaunch", this.getControlledLaunch());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("customerFacingStatus", this.getCustomerFacingStatus());
        writer.writeOffsetDateTimeValue("domainApprovedAt", this.getDomainApprovedAt());
        writer.writeCollectionOfObjectValues("domainOptions", this.getDomainOptions());
        writer.writeOffsetDateTimeValue("domainPurchasedAt", this.getDomainPurchasedAt());
        writer.writeObjectValue("domainSearchAttempt", this.getDomainSearchAttempt());
        writer.writeStringValue("domainSearchId", this.getDomainSearchId());
        writer.writeEnumValue("domainSearchStage", this.getDomainSearchStage());
        writer.writeOffsetDateTimeValue("domainSearchUpdatedAt", this.getDomainSearchUpdatedAt());
        writer.writeCollectionOfObjectValues("events", this.getEvents());
        writer.writeOffsetDateTimeValue("failedAt", this.getFailedAt());
        writer.writeStringValue("industry", this.getIndustry());
        writer.writeOffsetDateTimeValue("launchApprovedAt", this.getLaunchApprovedAt());
        writer.writeOffsetDateTimeValue("launchReviewRequestedAt", this.getLaunchReviewRequestedAt());
        writer.writeEnumValue("launchReviewStatus", this.getLaunchReviewStatus());
        writer.writeStringValue("offer", this.getOffer());
        writer.writeEnumValue("onboardingStatus", this.getOnboardingStatus());
        writer.writeStringValue("organizationDescription", this.getOrganizationDescription());
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
        writer.writeStringValue("tenDlcApplicationId", this.getTenDlcApplicationId());
        writer.writeObjectValue("tenDlcDraft", this.getTenDlcDraft());
        writer.writeEnumValue("tenDlcStatus", this.getTenDlcStatus());
        writer.writeOffsetDateTimeValue("updatedAt", this.getUpdatedAt());
        writer.writeStringValue("websiteGenerationResult", this.getWebsiteGenerationResult());
        writer.writeStringValue("websiteNeeds", this.getWebsiteNeeds());
        writer.writeEnumValue("websiteStatus", this.getWebsiteStatus());
        writer.writeStringValue("websiteUrl", this.getWebsiteUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activatedAt property value. UTC timestamp for activated at on this organization activation state.
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
     * Sets the availableDomainCount property value. The number of registrar-verified domains found by the current search.
     * @param value Value to set for the availableDomainCount property.
     */
    public void setAvailableDomainCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.availableDomainCount = value;
    }
    /**
     * Sets the billingSubscriptionStatus property value. The current billing subscription status for this organization activation state.
     * @param value Value to set for the billingSubscriptionStatus property.
     */
    public void setBillingSubscriptionStatus(@jakarta.annotation.Nullable final ActivationSubscriptionStatus value) {
        this.billingSubscriptionStatus = value;
    }
    /**
     * Sets the complianceNotes property value. Compliance notes for this organization activation state.
     * @param value Value to set for the complianceNotes property.
     */
    public void setComplianceNotes(@jakarta.annotation.Nullable final String value) {
        this.complianceNotes = value;
    }
    /**
     * Sets the controlledLaunch property value. Whether controlled launch applies to this organization activation state.
     * @param value Value to set for the controlledLaunch property.
     */
    public void setControlledLaunch(@jakarta.annotation.Nullable final Boolean value) {
        this.controlledLaunch = value;
    }
    /**
     * Sets the createdAt property value. UTC timestamp for created at on this organization activation state.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the customerFacingStatus property value. The current customer facing status for this organization activation state.
     * @param value Value to set for the customerFacingStatus property.
     */
    public void setCustomerFacingStatus(@jakarta.annotation.Nullable final String value) {
        this.customerFacingStatus = value;
    }
    /**
     * Sets the domainApprovedAt property value. UTC timestamp for domain approved at on this organization activation state.
     * @param value Value to set for the domainApprovedAt property.
     */
    public void setDomainApprovedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.domainApprovedAt = value;
    }
    /**
     * Sets the domainOptions property value. The domain options included with this organization activation state.
     * @param value Value to set for the domainOptions property.
     */
    public void setDomainOptions(@jakarta.annotation.Nullable final java.util.List<ActivationDomainOption> value) {
        this.domainOptions = value;
    }
    /**
     * Sets the domainPurchasedAt property value. The date and time the selected domain was purchased.
     * @param value Value to set for the domainPurchasedAt property.
     */
    public void setDomainPurchasedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.domainPurchasedAt = value;
    }
    /**
     * Sets the domainSearchAttempt property value. The current domain generation attempt.
     * @param value Value to set for the domainSearchAttempt property.
     */
    public void setDomainSearchAttempt(@jakarta.annotation.Nullable final UntypedNode value) {
        this.domainSearchAttempt = value;
    }
    /**
     * Sets the domainSearchId property value. Identifies the active domain search run.
     * @param value Value to set for the domainSearchId property.
     */
    public void setDomainSearchId(@jakarta.annotation.Nullable final String value) {
        this.domainSearchId = value;
    }
    /**
     * Sets the domainSearchStage property value. Defines the stages of a domain search.
     * @param value Value to set for the domainSearchStage property.
     */
    public void setDomainSearchStage(@jakarta.annotation.Nullable final OrganizationActivationStateDomainSearchStage value) {
        this.domainSearchStage = value;
    }
    /**
     * Sets the domainSearchUpdatedAt property value. The last time domain search progress changed.
     * @param value Value to set for the domainSearchUpdatedAt property.
     */
    public void setDomainSearchUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.domainSearchUpdatedAt = value;
    }
    /**
     * Sets the events property value. The events included with this organization activation state.
     * @param value Value to set for the events property.
     */
    public void setEvents(@jakarta.annotation.Nullable final java.util.List<ActivationTimelineEvent> value) {
        this.events = value;
    }
    /**
     * Sets the failedAt property value. UTC timestamp for failed at on this organization activation state.
     * @param value Value to set for the failedAt property.
     */
    public void setFailedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.failedAt = value;
    }
    /**
     * Sets the industry property value. Industry for this organization activation state.
     * @param value Value to set for the industry property.
     */
    public void setIndustry(@jakarta.annotation.Nullable final String value) {
        this.industry = value;
    }
    /**
     * Sets the launchApprovedAt property value. UTC timestamp for launch approved at on this organization activation state.
     * @param value Value to set for the launchApprovedAt property.
     */
    public void setLaunchApprovedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.launchApprovedAt = value;
    }
    /**
     * Sets the launchReviewRequestedAt property value. UTC timestamp for launch review requested at on this organization activation state.
     * @param value Value to set for the launchReviewRequestedAt property.
     */
    public void setLaunchReviewRequestedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.launchReviewRequestedAt = value;
    }
    /**
     * Sets the launchReviewStatus property value. The current launch review status for this organization activation state.
     * @param value Value to set for the launchReviewStatus property.
     */
    public void setLaunchReviewStatus(@jakarta.annotation.Nullable final ActivationLaunchReviewStatus value) {
        this.launchReviewStatus = value;
    }
    /**
     * Sets the offer property value. Offer for this organization activation state.
     * @param value Value to set for the offer property.
     */
    public void setOffer(@jakarta.annotation.Nullable final String value) {
        this.offer = value;
    }
    /**
     * Sets the onboardingStatus property value. The current onboarding status for this organization activation state.
     * @param value Value to set for the onboardingStatus property.
     */
    public void setOnboardingStatus(@jakarta.annotation.Nullable final ActivationOnboardingStatus value) {
        this.onboardingStatus = value;
    }
    /**
     * Sets the organizationDescription property value. Organization description for this organization activation state.
     * @param value Value to set for the organizationDescription property.
     */
    public void setOrganizationDescription(@jakarta.annotation.Nullable final String value) {
        this.organizationDescription = value;
    }
    /**
     * Sets the paymentMethodConfirmedAt property value. UTC timestamp for payment method confirmed at on this organization activation state.
     * @param value Value to set for the paymentMethodConfirmedAt property.
     */
    public void setPaymentMethodConfirmedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.paymentMethodConfirmedAt = value;
    }
    /**
     * Sets the paymentStatus property value. The current payment status for this organization activation state.
     * @param value Value to set for the paymentStatus property.
     */
    public void setPaymentStatus(@jakarta.annotation.Nullable final ActivationPaymentStatus value) {
        this.paymentStatus = value;
    }
    /**
     * Sets the selectedDomain property value. Selected domain for this organization activation state.
     * @param value Value to set for the selectedDomain property.
     */
    public void setSelectedDomain(@jakarta.annotation.Nullable final String value) {
        this.selectedDomain = value;
    }
    /**
     * Sets the serviceArea property value. Service area for this organization activation state.
     * @param value Value to set for the serviceArea property.
     */
    public void setServiceArea(@jakarta.annotation.Nullable final String value) {
        this.serviceArea = value;
    }
    /**
     * Sets the status property value. The current status for this organization activation state.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CustomerActivationStatus value) {
        this.status = value;
    }
    /**
     * Sets the subscriptionActiveAt property value. UTC timestamp for subscription active at on this organization activation state.
     * @param value Value to set for the subscriptionActiveAt property.
     */
    public void setSubscriptionActiveAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.subscriptionActiveAt = value;
    }
    /**
     * Sets the subscriptionPendingAt property value. UTC timestamp for subscription pending at on this organization activation state.
     * @param value Value to set for the subscriptionPendingAt property.
     */
    public void setSubscriptionPendingAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.subscriptionPendingAt = value;
    }
    /**
     * Sets the targetAudience property value. Target audience for this organization activation state.
     * @param value Value to set for the targetAudience property.
     */
    public void setTargetAudience(@jakarta.annotation.Nullable final String value) {
        this.targetAudience = value;
    }
    /**
     * Sets the telephonyPartiallyProvisionedAt property value. UTC timestamp for telephony partially provisioned at on this organization activation state.
     * @param value Value to set for the telephonyPartiallyProvisionedAt property.
     */
    public void setTelephonyPartiallyProvisionedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.telephonyPartiallyProvisionedAt = value;
    }
    /**
     * Sets the telephonyProvisioningStartedAt property value. UTC timestamp for telephony provisioning started at on this organization activation state.
     * @param value Value to set for the telephonyProvisioningStartedAt property.
     */
    public void setTelephonyProvisioningStartedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.telephonyProvisioningStartedAt = value;
    }
    /**
     * Sets the telephonyReadyAt property value. UTC timestamp for telephony ready at on this organization activation state.
     * @param value Value to set for the telephonyReadyAt property.
     */
    public void setTelephonyReadyAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.telephonyReadyAt = value;
    }
    /**
     * Sets the telephonyStatus property value. The current telephony status for this organization activation state.
     * @param value Value to set for the telephonyStatus property.
     */
    public void setTelephonyStatus(@jakarta.annotation.Nullable final ActivationTelephonyStatus value) {
        this.telephonyStatus = value;
    }
    /**
     * Sets the tenDlcApplicationId property value. Identifier of the first-class 10DLC application entity for this organization.
     * @param value Value to set for the tenDlcApplicationId property.
     */
    public void setTenDlcApplicationId(@jakarta.annotation.Nullable final String value) {
        this.tenDlcApplicationId = value;
    }
    /**
     * Sets the tenDlcDraft property value. 10DLC draft for this organization activation state.
     * @param value Value to set for the tenDlcDraft property.
     */
    public void setTenDlcDraft(@jakarta.annotation.Nullable final OrganizationActivationStateTenDlcDraft value) {
        this.tenDlcDraft = value;
    }
    /**
     * Sets the tenDlcStatus property value. The current 10DLC status for this organization activation state.
     * @param value Value to set for the tenDlcStatus property.
     */
    public void setTenDlcStatus(@jakarta.annotation.Nullable final TenDlcApplicationStatus value) {
        this.tenDlcStatus = value;
    }
    /**
     * Sets the updatedAt property value. UTC timestamp for updated at on this organization activation state.
     * @param value Value to set for the updatedAt property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.updatedAt = value;
    }
    /**
     * Sets the websiteGenerationResult property value. The latest persisted website generation progress message.
     * @param value Value to set for the websiteGenerationResult property.
     */
    public void setWebsiteGenerationResult(@jakarta.annotation.Nullable final String value) {
        this.websiteGenerationResult = value;
    }
    /**
     * Sets the websiteNeeds property value. Website needs for this organization activation state.
     * @param value Value to set for the websiteNeeds property.
     */
    public void setWebsiteNeeds(@jakarta.annotation.Nullable final String value) {
        this.websiteNeeds = value;
    }
    /**
     * Sets the websiteStatus property value. The current website status for this organization activation state.
     * @param value Value to set for the websiteStatus property.
     */
    public void setWebsiteStatus(@jakarta.annotation.Nullable final WebsiteLifecycleStatus value) {
        this.websiteStatus = value;
    }
    /**
     * Sets the websiteUrl property value. The URL associated with this organization activation state.
     * @param value Value to set for the websiteUrl property.
     */
    public void setWebsiteUrl(@jakarta.annotation.Nullable final String value) {
        this.websiteUrl = value;
    }
}
