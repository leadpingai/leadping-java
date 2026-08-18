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
 * Customer-safe billing state for a Leadping organization.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationBillingState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Date and time when the scheduled billing plan change takes effect.
     */
    private OffsetDateTime billingPlanChangeEffectiveAt;
    /**
     * UTC timestamp when the active subscription is scheduled to cancel.
     */
    private OffsetDateTime cancelAt;
    /**
     * Customer-safe payment recovery state for the organization.
     */
    private OrganizationBillingStateDunning dunning;
    /**
     * Indicates whether the organization has a saved default payment method.
     */
    private Boolean hasPaymentMethod;
    /**
     * Indicates whether the organization has a Stripe customer account.
     */
    private Boolean hasStripeCustomer;
    /**
     * UTC timestamp when Leadping last processed a payment-method event for the organization.
     */
    private OffsetDateTime lastPaymentMethodEventAt;
    /**
     * UTC timestamp when Leadping last processed a subscription event for the organization.
     */
    private OffsetDateTime lastSubscriptionEventAt;
    /**
     * Number of user licenses currently assigned to organization members.
     */
    private Long organizationMemberAssignedQuantity;
    /**
     * Number of user licenses included in the organization&apos;s subscription plan.
     */
    private Long organizationMemberQuantity;
    /**
     * Identifies the Leadping subscription plan that determines organization features, allowances, and billing behavior.
     */
    private OrganizationBillingStatePendingBillingPlan pendingBillingPlan;
    /**
     * Number of phone numbers included in the organization&apos;s subscription plan.
     */
    private Long phoneNumberQuantity;
    /**
     * Start of the current plan billing period.
     */
    private OffsetDateTime planPeriodStartAt;
    /**
     * Current plan renewal date.
     */
    private OffsetDateTime planRenewalAt;
    /**
     * Instantiates a new {@link OrganizationBillingState} and sets the default values.
     */
    public OrganizationBillingState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrganizationBillingState}
     */
    @jakarta.annotation.Nonnull
    public static OrganizationBillingState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationBillingState();
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
     * Gets the billingPlanChangeEffectiveAt property value. Date and time when the scheduled billing plan change takes effect.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getBillingPlanChangeEffectiveAt() {
        return this.billingPlanChangeEffectiveAt;
    }
    /**
     * Gets the cancelAt property value. UTC timestamp when the active subscription is scheduled to cancel.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCancelAt() {
        return this.cancelAt;
    }
    /**
     * Gets the dunning property value. Customer-safe payment recovery state for the organization.
     * @return a {@link OrganizationBillingStateDunning}
     */
    @jakarta.annotation.Nullable
    public OrganizationBillingStateDunning getDunning() {
        return this.dunning;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("billingPlanChangeEffectiveAt", (n) -> { this.setBillingPlanChangeEffectiveAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("cancelAt", (n) -> { this.setCancelAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dunning", (n) -> { this.setDunning(n.getObjectValue(OrganizationBillingStateDunning::createFromDiscriminatorValue)); });
        deserializerMap.put("hasPaymentMethod", (n) -> { this.setHasPaymentMethod(n.getBooleanValue()); });
        deserializerMap.put("hasStripeCustomer", (n) -> { this.setHasStripeCustomer(n.getBooleanValue()); });
        deserializerMap.put("lastPaymentMethodEventAt", (n) -> { this.setLastPaymentMethodEventAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSubscriptionEventAt", (n) -> { this.setLastSubscriptionEventAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("organizationMemberAssignedQuantity", (n) -> { this.setOrganizationMemberAssignedQuantity(n.getLongValue()); });
        deserializerMap.put("organizationMemberQuantity", (n) -> { this.setOrganizationMemberQuantity(n.getLongValue()); });
        deserializerMap.put("pendingBillingPlan", (n) -> { this.setPendingBillingPlan(n.getEnumValue(OrganizationBillingStatePendingBillingPlan::forValue)); });
        deserializerMap.put("phoneNumberQuantity", (n) -> { this.setPhoneNumberQuantity(n.getLongValue()); });
        deserializerMap.put("planPeriodStartAt", (n) -> { this.setPlanPeriodStartAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("planRenewalAt", (n) -> { this.setPlanRenewalAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasPaymentMethod property value. Indicates whether the organization has a saved default payment method.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasPaymentMethod() {
        return this.hasPaymentMethod;
    }
    /**
     * Gets the hasStripeCustomer property value. Indicates whether the organization has a Stripe customer account.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasStripeCustomer() {
        return this.hasStripeCustomer;
    }
    /**
     * Gets the lastPaymentMethodEventAt property value. UTC timestamp when Leadping last processed a payment-method event for the organization.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastPaymentMethodEventAt() {
        return this.lastPaymentMethodEventAt;
    }
    /**
     * Gets the lastSubscriptionEventAt property value. UTC timestamp when Leadping last processed a subscription event for the organization.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSubscriptionEventAt() {
        return this.lastSubscriptionEventAt;
    }
    /**
     * Gets the organizationMemberAssignedQuantity property value. Number of user licenses currently assigned to organization members.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getOrganizationMemberAssignedQuantity() {
        return this.organizationMemberAssignedQuantity;
    }
    /**
     * Gets the organizationMemberQuantity property value. Number of user licenses included in the organization&apos;s subscription plan.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getOrganizationMemberQuantity() {
        return this.organizationMemberQuantity;
    }
    /**
     * Gets the pendingBillingPlan property value. Identifies the Leadping subscription plan that determines organization features, allowances, and billing behavior.
     * @return a {@link OrganizationBillingStatePendingBillingPlan}
     */
    @jakarta.annotation.Nullable
    public OrganizationBillingStatePendingBillingPlan getPendingBillingPlan() {
        return this.pendingBillingPlan;
    }
    /**
     * Gets the phoneNumberQuantity property value. Number of phone numbers included in the organization&apos;s subscription plan.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getPhoneNumberQuantity() {
        return this.phoneNumberQuantity;
    }
    /**
     * Gets the planPeriodStartAt property value. Start of the current plan billing period.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPlanPeriodStartAt() {
        return this.planPeriodStartAt;
    }
    /**
     * Gets the planRenewalAt property value. Current plan renewal date.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPlanRenewalAt() {
        return this.planRenewalAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("billingPlanChangeEffectiveAt", this.getBillingPlanChangeEffectiveAt());
        writer.writeOffsetDateTimeValue("cancelAt", this.getCancelAt());
        writer.writeObjectValue("dunning", this.getDunning());
        writer.writeBooleanValue("hasPaymentMethod", this.getHasPaymentMethod());
        writer.writeBooleanValue("hasStripeCustomer", this.getHasStripeCustomer());
        writer.writeOffsetDateTimeValue("lastPaymentMethodEventAt", this.getLastPaymentMethodEventAt());
        writer.writeOffsetDateTimeValue("lastSubscriptionEventAt", this.getLastSubscriptionEventAt());
        writer.writeLongValue("organizationMemberAssignedQuantity", this.getOrganizationMemberAssignedQuantity());
        writer.writeLongValue("organizationMemberQuantity", this.getOrganizationMemberQuantity());
        writer.writeEnumValue("pendingBillingPlan", this.getPendingBillingPlan());
        writer.writeLongValue("phoneNumberQuantity", this.getPhoneNumberQuantity());
        writer.writeOffsetDateTimeValue("planPeriodStartAt", this.getPlanPeriodStartAt());
        writer.writeOffsetDateTimeValue("planRenewalAt", this.getPlanRenewalAt());
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
     * Sets the billingPlanChangeEffectiveAt property value. Date and time when the scheduled billing plan change takes effect.
     * @param value Value to set for the billingPlanChangeEffectiveAt property.
     */
    public void setBillingPlanChangeEffectiveAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.billingPlanChangeEffectiveAt = value;
    }
    /**
     * Sets the cancelAt property value. UTC timestamp when the active subscription is scheduled to cancel.
     * @param value Value to set for the cancelAt property.
     */
    public void setCancelAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.cancelAt = value;
    }
    /**
     * Sets the dunning property value. Customer-safe payment recovery state for the organization.
     * @param value Value to set for the dunning property.
     */
    public void setDunning(@jakarta.annotation.Nullable final OrganizationBillingStateDunning value) {
        this.dunning = value;
    }
    /**
     * Sets the hasPaymentMethod property value. Indicates whether the organization has a saved default payment method.
     * @param value Value to set for the hasPaymentMethod property.
     */
    public void setHasPaymentMethod(@jakarta.annotation.Nullable final Boolean value) {
        this.hasPaymentMethod = value;
    }
    /**
     * Sets the hasStripeCustomer property value. Indicates whether the organization has a Stripe customer account.
     * @param value Value to set for the hasStripeCustomer property.
     */
    public void setHasStripeCustomer(@jakarta.annotation.Nullable final Boolean value) {
        this.hasStripeCustomer = value;
    }
    /**
     * Sets the lastPaymentMethodEventAt property value. UTC timestamp when Leadping last processed a payment-method event for the organization.
     * @param value Value to set for the lastPaymentMethodEventAt property.
     */
    public void setLastPaymentMethodEventAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastPaymentMethodEventAt = value;
    }
    /**
     * Sets the lastSubscriptionEventAt property value. UTC timestamp when Leadping last processed a subscription event for the organization.
     * @param value Value to set for the lastSubscriptionEventAt property.
     */
    public void setLastSubscriptionEventAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSubscriptionEventAt = value;
    }
    /**
     * Sets the organizationMemberAssignedQuantity property value. Number of user licenses currently assigned to organization members.
     * @param value Value to set for the organizationMemberAssignedQuantity property.
     */
    public void setOrganizationMemberAssignedQuantity(@jakarta.annotation.Nullable final Long value) {
        this.organizationMemberAssignedQuantity = value;
    }
    /**
     * Sets the organizationMemberQuantity property value. Number of user licenses included in the organization&apos;s subscription plan.
     * @param value Value to set for the organizationMemberQuantity property.
     */
    public void setOrganizationMemberQuantity(@jakarta.annotation.Nullable final Long value) {
        this.organizationMemberQuantity = value;
    }
    /**
     * Sets the pendingBillingPlan property value. Identifies the Leadping subscription plan that determines organization features, allowances, and billing behavior.
     * @param value Value to set for the pendingBillingPlan property.
     */
    public void setPendingBillingPlan(@jakarta.annotation.Nullable final OrganizationBillingStatePendingBillingPlan value) {
        this.pendingBillingPlan = value;
    }
    /**
     * Sets the phoneNumberQuantity property value. Number of phone numbers included in the organization&apos;s subscription plan.
     * @param value Value to set for the phoneNumberQuantity property.
     */
    public void setPhoneNumberQuantity(@jakarta.annotation.Nullable final Long value) {
        this.phoneNumberQuantity = value;
    }
    /**
     * Sets the planPeriodStartAt property value. Start of the current plan billing period.
     * @param value Value to set for the planPeriodStartAt property.
     */
    public void setPlanPeriodStartAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.planPeriodStartAt = value;
    }
    /**
     * Sets the planRenewalAt property value. Current plan renewal date.
     * @param value Value to set for the planRenewalAt property.
     */
    public void setPlanRenewalAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.planRenewalAt = value;
    }
}
