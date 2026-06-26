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
 * API DTO containing user stripe info data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserStripeInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The business user license quantity value for this user Stripe info.
     */
    private UntypedNode businessUserQuantity;
    /**
     * The business user subscription item ID associated with this user Stripe info.
     */
    private String businessUserSubscriptionItemId;
    /**
     * The date and time for the cancel at value on this user Stripe info.
     */
    private OffsetDateTime cancelAt;
    /**
     * The captured subscription cancellation feedback for retention and churn analysis.
     */
    private UserStripeInfoCancellation cancellation;
    /**
     * The customer ID associated with this user Stripe info.
     */
    private String customerId;
    /**
     * The default payment method ID associated with this user Stripe info.
     */
    private String defaultPaymentMethodId;
    /**
     * The active dunning state after a failed recurring payment.
     */
    private UserStripeInfoDunning dunning;
    /**
     * The date and time for the last payment method event at value on this user Stripe info.
     */
    private OffsetDateTime lastPaymentMethodEventAt;
    /**
     * The date and time for the last subscription event at value on this user Stripe info.
     */
    private OffsetDateTime lastSubscriptionEventAt;
    /**
     * The phone number quantity value for this user Stripe info.
     */
    private UntypedNode phoneNumberQuantity;
    /**
     * The phone subscription ID associated with this user Stripe info.
     */
    private String phoneSubscriptionId;
    /**
     * The phone subscription item ID associated with this user Stripe info.
     */
    private String phoneSubscriptionItemId;
    /**
     * The plan subscription ID associated with this user Stripe info.
     */
    private String planSubscriptionId;
    /**
     * The plan subscription item ID associated with this user Stripe info.
     */
    private String planSubscriptionItemId;
    /**
     * The subscription ids included with this user Stripe info.
     */
    private java.util.List<String> subscriptionIds;
    /**
     * Instantiates a new {@link UserStripeInfo} and sets the default values.
     */
    public UserStripeInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserStripeInfo}
     */
    @jakarta.annotation.Nonnull
    public static UserStripeInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserStripeInfo();
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
     * Gets the businessUserQuantity property value. The business user license quantity value for this user Stripe info.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getBusinessUserQuantity() {
        return this.businessUserQuantity;
    }
    /**
     * Gets the businessUserSubscriptionItemId property value. The business user subscription item ID associated with this user Stripe info.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessUserSubscriptionItemId() {
        return this.businessUserSubscriptionItemId;
    }
    /**
     * Gets the cancelAt property value. The date and time for the cancel at value on this user Stripe info.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCancelAt() {
        return this.cancelAt;
    }
    /**
     * Gets the cancellation property value. The captured subscription cancellation feedback for retention and churn analysis.
     * @return a {@link UserStripeInfoCancellation}
     */
    @jakarta.annotation.Nullable
    public UserStripeInfoCancellation getCancellation() {
        return this.cancellation;
    }
    /**
     * Gets the customerId property value. The customer ID associated with this user Stripe info.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomerId() {
        return this.customerId;
    }
    /**
     * Gets the defaultPaymentMethodId property value. The default payment method ID associated with this user Stripe info.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultPaymentMethodId() {
        return this.defaultPaymentMethodId;
    }
    /**
     * Gets the dunning property value. The active dunning state after a failed recurring payment.
     * @return a {@link UserStripeInfoDunning}
     */
    @jakarta.annotation.Nullable
    public UserStripeInfoDunning getDunning() {
        return this.dunning;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("businessUserQuantity", (n) -> { this.setBusinessUserQuantity(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("businessUserSubscriptionItemId", (n) -> { this.setBusinessUserSubscriptionItemId(n.getStringValue()); });
        deserializerMap.put("cancelAt", (n) -> { this.setCancelAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("cancellation", (n) -> { this.setCancellation(n.getObjectValue(UserStripeInfoCancellation::createFromDiscriminatorValue)); });
        deserializerMap.put("customerId", (n) -> { this.setCustomerId(n.getStringValue()); });
        deserializerMap.put("defaultPaymentMethodId", (n) -> { this.setDefaultPaymentMethodId(n.getStringValue()); });
        deserializerMap.put("dunning", (n) -> { this.setDunning(n.getObjectValue(UserStripeInfoDunning::createFromDiscriminatorValue)); });
        deserializerMap.put("lastPaymentMethodEventAt", (n) -> { this.setLastPaymentMethodEventAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSubscriptionEventAt", (n) -> { this.setLastSubscriptionEventAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("phoneNumberQuantity", (n) -> { this.setPhoneNumberQuantity(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("phoneSubscriptionId", (n) -> { this.setPhoneSubscriptionId(n.getStringValue()); });
        deserializerMap.put("phoneSubscriptionItemId", (n) -> { this.setPhoneSubscriptionItemId(n.getStringValue()); });
        deserializerMap.put("planSubscriptionId", (n) -> { this.setPlanSubscriptionId(n.getStringValue()); });
        deserializerMap.put("planSubscriptionItemId", (n) -> { this.setPlanSubscriptionItemId(n.getStringValue()); });
        deserializerMap.put("subscriptionIds", (n) -> { this.setSubscriptionIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the lastPaymentMethodEventAt property value. The date and time for the last payment method event at value on this user Stripe info.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastPaymentMethodEventAt() {
        return this.lastPaymentMethodEventAt;
    }
    /**
     * Gets the lastSubscriptionEventAt property value. The date and time for the last subscription event at value on this user Stripe info.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSubscriptionEventAt() {
        return this.lastSubscriptionEventAt;
    }
    /**
     * Gets the phoneNumberQuantity property value. The phone number quantity value for this user Stripe info.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getPhoneNumberQuantity() {
        return this.phoneNumberQuantity;
    }
    /**
     * Gets the phoneSubscriptionId property value. The phone subscription ID associated with this user Stripe info.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneSubscriptionId() {
        return this.phoneSubscriptionId;
    }
    /**
     * Gets the phoneSubscriptionItemId property value. The phone subscription item ID associated with this user Stripe info.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneSubscriptionItemId() {
        return this.phoneSubscriptionItemId;
    }
    /**
     * Gets the planSubscriptionId property value. The plan subscription ID associated with this user Stripe info.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanSubscriptionId() {
        return this.planSubscriptionId;
    }
    /**
     * Gets the planSubscriptionItemId property value. The plan subscription item ID associated with this user Stripe info.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanSubscriptionItemId() {
        return this.planSubscriptionItemId;
    }
    /**
     * Gets the subscriptionIds property value. The subscription ids included with this user Stripe info.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSubscriptionIds() {
        return this.subscriptionIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("businessUserQuantity", this.getBusinessUserQuantity());
        writer.writeStringValue("businessUserSubscriptionItemId", this.getBusinessUserSubscriptionItemId());
        writer.writeOffsetDateTimeValue("cancelAt", this.getCancelAt());
        writer.writeObjectValue("cancellation", this.getCancellation());
        writer.writeStringValue("customerId", this.getCustomerId());
        writer.writeStringValue("defaultPaymentMethodId", this.getDefaultPaymentMethodId());
        writer.writeObjectValue("dunning", this.getDunning());
        writer.writeOffsetDateTimeValue("lastPaymentMethodEventAt", this.getLastPaymentMethodEventAt());
        writer.writeOffsetDateTimeValue("lastSubscriptionEventAt", this.getLastSubscriptionEventAt());
        writer.writeObjectValue("phoneNumberQuantity", this.getPhoneNumberQuantity());
        writer.writeStringValue("phoneSubscriptionId", this.getPhoneSubscriptionId());
        writer.writeStringValue("phoneSubscriptionItemId", this.getPhoneSubscriptionItemId());
        writer.writeStringValue("planSubscriptionId", this.getPlanSubscriptionId());
        writer.writeStringValue("planSubscriptionItemId", this.getPlanSubscriptionItemId());
        writer.writeCollectionOfPrimitiveValues("subscriptionIds", this.getSubscriptionIds());
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
     * Sets the businessUserQuantity property value. The business user license quantity value for this user Stripe info.
     * @param value Value to set for the businessUserQuantity property.
     */
    public void setBusinessUserQuantity(@jakarta.annotation.Nullable final UntypedNode value) {
        this.businessUserQuantity = value;
    }
    /**
     * Sets the businessUserSubscriptionItemId property value. The business user subscription item ID associated with this user Stripe info.
     * @param value Value to set for the businessUserSubscriptionItemId property.
     */
    public void setBusinessUserSubscriptionItemId(@jakarta.annotation.Nullable final String value) {
        this.businessUserSubscriptionItemId = value;
    }
    /**
     * Sets the cancelAt property value. The date and time for the cancel at value on this user Stripe info.
     * @param value Value to set for the cancelAt property.
     */
    public void setCancelAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.cancelAt = value;
    }
    /**
     * Sets the cancellation property value. The captured subscription cancellation feedback for retention and churn analysis.
     * @param value Value to set for the cancellation property.
     */
    public void setCancellation(@jakarta.annotation.Nullable final UserStripeInfoCancellation value) {
        this.cancellation = value;
    }
    /**
     * Sets the customerId property value. The customer ID associated with this user Stripe info.
     * @param value Value to set for the customerId property.
     */
    public void setCustomerId(@jakarta.annotation.Nullable final String value) {
        this.customerId = value;
    }
    /**
     * Sets the defaultPaymentMethodId property value. The default payment method ID associated with this user Stripe info.
     * @param value Value to set for the defaultPaymentMethodId property.
     */
    public void setDefaultPaymentMethodId(@jakarta.annotation.Nullable final String value) {
        this.defaultPaymentMethodId = value;
    }
    /**
     * Sets the dunning property value. The active dunning state after a failed recurring payment.
     * @param value Value to set for the dunning property.
     */
    public void setDunning(@jakarta.annotation.Nullable final UserStripeInfoDunning value) {
        this.dunning = value;
    }
    /**
     * Sets the lastPaymentMethodEventAt property value. The date and time for the last payment method event at value on this user Stripe info.
     * @param value Value to set for the lastPaymentMethodEventAt property.
     */
    public void setLastPaymentMethodEventAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastPaymentMethodEventAt = value;
    }
    /**
     * Sets the lastSubscriptionEventAt property value. The date and time for the last subscription event at value on this user Stripe info.
     * @param value Value to set for the lastSubscriptionEventAt property.
     */
    public void setLastSubscriptionEventAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSubscriptionEventAt = value;
    }
    /**
     * Sets the phoneNumberQuantity property value. The phone number quantity value for this user Stripe info.
     * @param value Value to set for the phoneNumberQuantity property.
     */
    public void setPhoneNumberQuantity(@jakarta.annotation.Nullable final UntypedNode value) {
        this.phoneNumberQuantity = value;
    }
    /**
     * Sets the phoneSubscriptionId property value. The phone subscription ID associated with this user Stripe info.
     * @param value Value to set for the phoneSubscriptionId property.
     */
    public void setPhoneSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.phoneSubscriptionId = value;
    }
    /**
     * Sets the phoneSubscriptionItemId property value. The phone subscription item ID associated with this user Stripe info.
     * @param value Value to set for the phoneSubscriptionItemId property.
     */
    public void setPhoneSubscriptionItemId(@jakarta.annotation.Nullable final String value) {
        this.phoneSubscriptionItemId = value;
    }
    /**
     * Sets the planSubscriptionId property value. The plan subscription ID associated with this user Stripe info.
     * @param value Value to set for the planSubscriptionId property.
     */
    public void setPlanSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.planSubscriptionId = value;
    }
    /**
     * Sets the planSubscriptionItemId property value. The plan subscription item ID associated with this user Stripe info.
     * @param value Value to set for the planSubscriptionItemId property.
     */
    public void setPlanSubscriptionItemId(@jakarta.annotation.Nullable final String value) {
        this.planSubscriptionItemId = value;
    }
    /**
     * Sets the subscriptionIds property value. The subscription ids included with this user Stripe info.
     * @param value Value to set for the subscriptionIds property.
     */
    public void setSubscriptionIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.subscriptionIds = value;
    }
}
