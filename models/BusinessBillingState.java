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
 * Customer-safe billing state for a Leadping business.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessBillingState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Date and time when the scheduled billing plan change takes effect.
     */
    private OffsetDateTime billingPlanChangeEffectiveAt;
    /**
     * Gets or sets the number of user licenses currently assigned by the business.
     */
    private UntypedNode businessUserAssignedQuantity;
    /**
     * Gets or sets the number of user licenses included in the business subscription.
     */
    private UntypedNode businessUserQuantity;
    /**
     * Gets or sets when the active subscription is scheduled to cancel.
     */
    private OffsetDateTime cancelAt;
    /**
     * Gets or sets the customer-safe payment recovery state for the business.
     */
    private BusinessBillingStateDunning dunning;
    /**
     * Indicates whether the business has a saved default payment method.
     */
    private Boolean hasPaymentMethod;
    /**
     * Indicates whether the business has a Stripe customer account.
     */
    private Boolean hasStripeCustomer;
    /**
     * Gets or sets when Leadping last processed a payment-method event for the business.
     */
    private OffsetDateTime lastPaymentMethodEventAt;
    /**
     * Gets or sets when Leadping last processed a subscription event for the business.
     */
    private OffsetDateTime lastSubscriptionEventAt;
    /**
     * Defines the supported Billing Plan values.
     */
    private BusinessBillingStatePendingBillingPlan pendingBillingPlan;
    /**
     * Gets or sets the number of phone numbers included in the business subscription.
     */
    private UntypedNode phoneNumberQuantity;
    /**
     * Current plan renewal date.
     */
    private OffsetDateTime planRenewalAt;
    /**
     * Instantiates a new {@link BusinessBillingState} and sets the default values.
     */
    public BusinessBillingState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessBillingState}
     */
    @jakarta.annotation.Nonnull
    public static BusinessBillingState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessBillingState();
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
     * Gets the businessUserAssignedQuantity property value. Gets or sets the number of user licenses currently assigned by the business.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getBusinessUserAssignedQuantity() {
        return this.businessUserAssignedQuantity;
    }
    /**
     * Gets the businessUserQuantity property value. Gets or sets the number of user licenses included in the business subscription.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getBusinessUserQuantity() {
        return this.businessUserQuantity;
    }
    /**
     * Gets the cancelAt property value. Gets or sets when the active subscription is scheduled to cancel.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCancelAt() {
        return this.cancelAt;
    }
    /**
     * Gets the dunning property value. Gets or sets the customer-safe payment recovery state for the business.
     * @return a {@link BusinessBillingStateDunning}
     */
    @jakarta.annotation.Nullable
    public BusinessBillingStateDunning getDunning() {
        return this.dunning;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("billingPlanChangeEffectiveAt", (n) -> { this.setBillingPlanChangeEffectiveAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("businessUserAssignedQuantity", (n) -> { this.setBusinessUserAssignedQuantity(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("businessUserQuantity", (n) -> { this.setBusinessUserQuantity(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("cancelAt", (n) -> { this.setCancelAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dunning", (n) -> { this.setDunning(n.getObjectValue(BusinessBillingStateDunning::createFromDiscriminatorValue)); });
        deserializerMap.put("hasPaymentMethod", (n) -> { this.setHasPaymentMethod(n.getBooleanValue()); });
        deserializerMap.put("hasStripeCustomer", (n) -> { this.setHasStripeCustomer(n.getBooleanValue()); });
        deserializerMap.put("lastPaymentMethodEventAt", (n) -> { this.setLastPaymentMethodEventAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSubscriptionEventAt", (n) -> { this.setLastSubscriptionEventAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("pendingBillingPlan", (n) -> { this.setPendingBillingPlan(n.getEnumValue(BusinessBillingStatePendingBillingPlan::forValue)); });
        deserializerMap.put("phoneNumberQuantity", (n) -> { this.setPhoneNumberQuantity(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("planRenewalAt", (n) -> { this.setPlanRenewalAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasPaymentMethod property value. Indicates whether the business has a saved default payment method.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasPaymentMethod() {
        return this.hasPaymentMethod;
    }
    /**
     * Gets the hasStripeCustomer property value. Indicates whether the business has a Stripe customer account.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasStripeCustomer() {
        return this.hasStripeCustomer;
    }
    /**
     * Gets the lastPaymentMethodEventAt property value. Gets or sets when Leadping last processed a payment-method event for the business.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastPaymentMethodEventAt() {
        return this.lastPaymentMethodEventAt;
    }
    /**
     * Gets the lastSubscriptionEventAt property value. Gets or sets when Leadping last processed a subscription event for the business.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSubscriptionEventAt() {
        return this.lastSubscriptionEventAt;
    }
    /**
     * Gets the pendingBillingPlan property value. Defines the supported Billing Plan values.
     * @return a {@link BusinessBillingStatePendingBillingPlan}
     */
    @jakarta.annotation.Nullable
    public BusinessBillingStatePendingBillingPlan getPendingBillingPlan() {
        return this.pendingBillingPlan;
    }
    /**
     * Gets the phoneNumberQuantity property value. Gets or sets the number of phone numbers included in the business subscription.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getPhoneNumberQuantity() {
        return this.phoneNumberQuantity;
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
        writer.writeObjectValue("businessUserAssignedQuantity", this.getBusinessUserAssignedQuantity());
        writer.writeObjectValue("businessUserQuantity", this.getBusinessUserQuantity());
        writer.writeOffsetDateTimeValue("cancelAt", this.getCancelAt());
        writer.writeObjectValue("dunning", this.getDunning());
        writer.writeBooleanValue("hasPaymentMethod", this.getHasPaymentMethod());
        writer.writeBooleanValue("hasStripeCustomer", this.getHasStripeCustomer());
        writer.writeOffsetDateTimeValue("lastPaymentMethodEventAt", this.getLastPaymentMethodEventAt());
        writer.writeOffsetDateTimeValue("lastSubscriptionEventAt", this.getLastSubscriptionEventAt());
        writer.writeEnumValue("pendingBillingPlan", this.getPendingBillingPlan());
        writer.writeObjectValue("phoneNumberQuantity", this.getPhoneNumberQuantity());
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
     * Sets the businessUserAssignedQuantity property value. Gets or sets the number of user licenses currently assigned by the business.
     * @param value Value to set for the businessUserAssignedQuantity property.
     */
    public void setBusinessUserAssignedQuantity(@jakarta.annotation.Nullable final UntypedNode value) {
        this.businessUserAssignedQuantity = value;
    }
    /**
     * Sets the businessUserQuantity property value. Gets or sets the number of user licenses included in the business subscription.
     * @param value Value to set for the businessUserQuantity property.
     */
    public void setBusinessUserQuantity(@jakarta.annotation.Nullable final UntypedNode value) {
        this.businessUserQuantity = value;
    }
    /**
     * Sets the cancelAt property value. Gets or sets when the active subscription is scheduled to cancel.
     * @param value Value to set for the cancelAt property.
     */
    public void setCancelAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.cancelAt = value;
    }
    /**
     * Sets the dunning property value. Gets or sets the customer-safe payment recovery state for the business.
     * @param value Value to set for the dunning property.
     */
    public void setDunning(@jakarta.annotation.Nullable final BusinessBillingStateDunning value) {
        this.dunning = value;
    }
    /**
     * Sets the hasPaymentMethod property value. Indicates whether the business has a saved default payment method.
     * @param value Value to set for the hasPaymentMethod property.
     */
    public void setHasPaymentMethod(@jakarta.annotation.Nullable final Boolean value) {
        this.hasPaymentMethod = value;
    }
    /**
     * Sets the hasStripeCustomer property value. Indicates whether the business has a Stripe customer account.
     * @param value Value to set for the hasStripeCustomer property.
     */
    public void setHasStripeCustomer(@jakarta.annotation.Nullable final Boolean value) {
        this.hasStripeCustomer = value;
    }
    /**
     * Sets the lastPaymentMethodEventAt property value. Gets or sets when Leadping last processed a payment-method event for the business.
     * @param value Value to set for the lastPaymentMethodEventAt property.
     */
    public void setLastPaymentMethodEventAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastPaymentMethodEventAt = value;
    }
    /**
     * Sets the lastSubscriptionEventAt property value. Gets or sets when Leadping last processed a subscription event for the business.
     * @param value Value to set for the lastSubscriptionEventAt property.
     */
    public void setLastSubscriptionEventAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSubscriptionEventAt = value;
    }
    /**
     * Sets the pendingBillingPlan property value. Defines the supported Billing Plan values.
     * @param value Value to set for the pendingBillingPlan property.
     */
    public void setPendingBillingPlan(@jakarta.annotation.Nullable final BusinessBillingStatePendingBillingPlan value) {
        this.pendingBillingPlan = value;
    }
    /**
     * Sets the phoneNumberQuantity property value. Gets or sets the number of phone numbers included in the business subscription.
     * @param value Value to set for the phoneNumberQuantity property.
     */
    public void setPhoneNumberQuantity(@jakarta.annotation.Nullable final UntypedNode value) {
        this.phoneNumberQuantity = value;
    }
    /**
     * Sets the planRenewalAt property value. Current plan renewal date.
     * @param value Value to set for the planRenewalAt property.
     */
    public void setPlanRenewalAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.planRenewalAt = value;
    }
}
