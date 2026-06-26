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
 * Stripe billing state owned by a business account.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessStripeInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The businessUserQuantity property
     */
    private UntypedNode businessUserQuantity;
    /**
     * The businessUserSubscriptionItemId property
     */
    private String businessUserSubscriptionItemId;
    /**
     * The cancelAt property
     */
    private OffsetDateTime cancelAt;
    /**
     * Captured subscription cancellation feedback for retention and churn analysis.
     */
    private BusinessStripeInfoCancellation cancellation;
    /**
     * The customerId property
     */
    private String customerId;
    /**
     * The defaultPaymentMethodId property
     */
    private String defaultPaymentMethodId;
    /**
     * Dunning state recorded after a failed recurring payment.
     */
    private BusinessStripeInfoDunning dunning;
    /**
     * The lastPaymentMethodEventAt property
     */
    private OffsetDateTime lastPaymentMethodEventAt;
    /**
     * The lastSubscriptionEventAt property
     */
    private OffsetDateTime lastSubscriptionEventAt;
    /**
     * The phoneNumberQuantity property
     */
    private UntypedNode phoneNumberQuantity;
    /**
     * The phoneSubscriptionId property
     */
    private String phoneSubscriptionId;
    /**
     * The phoneSubscriptionItemId property
     */
    private String phoneSubscriptionItemId;
    /**
     * The planSubscriptionId property
     */
    private String planSubscriptionId;
    /**
     * The planSubscriptionItemId property
     */
    private String planSubscriptionItemId;
    /**
     * The subscriptionIds property
     */
    private java.util.List<String> subscriptionIds;
    /**
     * Instantiates a new {@link BusinessStripeInfo} and sets the default values.
     */
    public BusinessStripeInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BusinessStripeInfo}
     */
    @jakarta.annotation.Nonnull
    public static BusinessStripeInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessStripeInfo();
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
     * Gets the businessUserQuantity property value. The businessUserQuantity property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getBusinessUserQuantity() {
        return this.businessUserQuantity;
    }
    /**
     * Gets the businessUserSubscriptionItemId property value. The businessUserSubscriptionItemId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessUserSubscriptionItemId() {
        return this.businessUserSubscriptionItemId;
    }
    /**
     * Gets the cancelAt property value. The cancelAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCancelAt() {
        return this.cancelAt;
    }
    /**
     * Gets the cancellation property value. Captured subscription cancellation feedback for retention and churn analysis.
     * @return a {@link BusinessStripeInfoCancellation}
     */
    @jakarta.annotation.Nullable
    public BusinessStripeInfoCancellation getCancellation() {
        return this.cancellation;
    }
    /**
     * Gets the customerId property value. The customerId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomerId() {
        return this.customerId;
    }
    /**
     * Gets the defaultPaymentMethodId property value. The defaultPaymentMethodId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultPaymentMethodId() {
        return this.defaultPaymentMethodId;
    }
    /**
     * Gets the dunning property value. Dunning state recorded after a failed recurring payment.
     * @return a {@link BusinessStripeInfoDunning}
     */
    @jakarta.annotation.Nullable
    public BusinessStripeInfoDunning getDunning() {
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
        deserializerMap.put("cancellation", (n) -> { this.setCancellation(n.getObjectValue(BusinessStripeInfoCancellation::createFromDiscriminatorValue)); });
        deserializerMap.put("customerId", (n) -> { this.setCustomerId(n.getStringValue()); });
        deserializerMap.put("defaultPaymentMethodId", (n) -> { this.setDefaultPaymentMethodId(n.getStringValue()); });
        deserializerMap.put("dunning", (n) -> { this.setDunning(n.getObjectValue(BusinessStripeInfoDunning::createFromDiscriminatorValue)); });
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
     * Gets the lastPaymentMethodEventAt property value. The lastPaymentMethodEventAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastPaymentMethodEventAt() {
        return this.lastPaymentMethodEventAt;
    }
    /**
     * Gets the lastSubscriptionEventAt property value. The lastSubscriptionEventAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSubscriptionEventAt() {
        return this.lastSubscriptionEventAt;
    }
    /**
     * Gets the phoneNumberQuantity property value. The phoneNumberQuantity property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getPhoneNumberQuantity() {
        return this.phoneNumberQuantity;
    }
    /**
     * Gets the phoneSubscriptionId property value. The phoneSubscriptionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneSubscriptionId() {
        return this.phoneSubscriptionId;
    }
    /**
     * Gets the phoneSubscriptionItemId property value. The phoneSubscriptionItemId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneSubscriptionItemId() {
        return this.phoneSubscriptionItemId;
    }
    /**
     * Gets the planSubscriptionId property value. The planSubscriptionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanSubscriptionId() {
        return this.planSubscriptionId;
    }
    /**
     * Gets the planSubscriptionItemId property value. The planSubscriptionItemId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanSubscriptionItemId() {
        return this.planSubscriptionItemId;
    }
    /**
     * Gets the subscriptionIds property value. The subscriptionIds property
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
     * Sets the businessUserQuantity property value. The businessUserQuantity property
     * @param value Value to set for the businessUserQuantity property.
     */
    public void setBusinessUserQuantity(@jakarta.annotation.Nullable final UntypedNode value) {
        this.businessUserQuantity = value;
    }
    /**
     * Sets the businessUserSubscriptionItemId property value. The businessUserSubscriptionItemId property
     * @param value Value to set for the businessUserSubscriptionItemId property.
     */
    public void setBusinessUserSubscriptionItemId(@jakarta.annotation.Nullable final String value) {
        this.businessUserSubscriptionItemId = value;
    }
    /**
     * Sets the cancelAt property value. The cancelAt property
     * @param value Value to set for the cancelAt property.
     */
    public void setCancelAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.cancelAt = value;
    }
    /**
     * Sets the cancellation property value. Captured subscription cancellation feedback for retention and churn analysis.
     * @param value Value to set for the cancellation property.
     */
    public void setCancellation(@jakarta.annotation.Nullable final BusinessStripeInfoCancellation value) {
        this.cancellation = value;
    }
    /**
     * Sets the customerId property value. The customerId property
     * @param value Value to set for the customerId property.
     */
    public void setCustomerId(@jakarta.annotation.Nullable final String value) {
        this.customerId = value;
    }
    /**
     * Sets the defaultPaymentMethodId property value. The defaultPaymentMethodId property
     * @param value Value to set for the defaultPaymentMethodId property.
     */
    public void setDefaultPaymentMethodId(@jakarta.annotation.Nullable final String value) {
        this.defaultPaymentMethodId = value;
    }
    /**
     * Sets the dunning property value. Dunning state recorded after a failed recurring payment.
     * @param value Value to set for the dunning property.
     */
    public void setDunning(@jakarta.annotation.Nullable final BusinessStripeInfoDunning value) {
        this.dunning = value;
    }
    /**
     * Sets the lastPaymentMethodEventAt property value. The lastPaymentMethodEventAt property
     * @param value Value to set for the lastPaymentMethodEventAt property.
     */
    public void setLastPaymentMethodEventAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastPaymentMethodEventAt = value;
    }
    /**
     * Sets the lastSubscriptionEventAt property value. The lastSubscriptionEventAt property
     * @param value Value to set for the lastSubscriptionEventAt property.
     */
    public void setLastSubscriptionEventAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSubscriptionEventAt = value;
    }
    /**
     * Sets the phoneNumberQuantity property value. The phoneNumberQuantity property
     * @param value Value to set for the phoneNumberQuantity property.
     */
    public void setPhoneNumberQuantity(@jakarta.annotation.Nullable final UntypedNode value) {
        this.phoneNumberQuantity = value;
    }
    /**
     * Sets the phoneSubscriptionId property value. The phoneSubscriptionId property
     * @param value Value to set for the phoneSubscriptionId property.
     */
    public void setPhoneSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.phoneSubscriptionId = value;
    }
    /**
     * Sets the phoneSubscriptionItemId property value. The phoneSubscriptionItemId property
     * @param value Value to set for the phoneSubscriptionItemId property.
     */
    public void setPhoneSubscriptionItemId(@jakarta.annotation.Nullable final String value) {
        this.phoneSubscriptionItemId = value;
    }
    /**
     * Sets the planSubscriptionId property value. The planSubscriptionId property
     * @param value Value to set for the planSubscriptionId property.
     */
    public void setPlanSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.planSubscriptionId = value;
    }
    /**
     * Sets the planSubscriptionItemId property value. The planSubscriptionItemId property
     * @param value Value to set for the planSubscriptionItemId property.
     */
    public void setPlanSubscriptionItemId(@jakarta.annotation.Nullable final String value) {
        this.planSubscriptionItemId = value;
    }
    /**
     * Sets the subscriptionIds property value. The subscriptionIds property
     * @param value Value to set for the subscriptionIds property.
     */
    public void setSubscriptionIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.subscriptionIds = value;
    }
}
