package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Public Leadping API schema for phone number billing attribution data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberBillingAttribution implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Business ID responsible for billing this phone number.
     */
    private String businessId;
    /**
     * Business display name used in phone number billing records.
     */
    private String businessName;
    /**
     * Communication channel used for this phone number billing attribution, such as SMS or voice.
     */
    private String channel;
    /**
     * Monthly subscription amount for the business billing plan.
     */
    private UntypedNode monthlyAmount;
    /**
     * Stripe subscription item identifier used for phone number billing.
     */
    private String subscriptionItemId;
    /**
     * User ID associated with phone number billing responsibility, when applicable.
     */
    private String userId;
    /**
     * Display name for the user connected to this phone number billing attribution.
     */
    private String userName;
    /**
     * Instantiates a new {@link PhoneNumberBillingAttribution} and sets the default values.
     */
    public PhoneNumberBillingAttribution() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberBillingAttribution}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberBillingAttribution createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberBillingAttribution();
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
     * Gets the businessId property value. Business ID responsible for billing this phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the businessName property value. Business display name used in phone number billing records.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessName() {
        return this.businessName;
    }
    /**
     * Gets the channel property value. Communication channel used for this phone number billing attribution, such as SMS or voice.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChannel() {
        return this.channel;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("businessName", (n) -> { this.setBusinessName(n.getStringValue()); });
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getStringValue()); });
        deserializerMap.put("monthlyAmount", (n) -> { this.setMonthlyAmount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("subscriptionItemId", (n) -> { this.setSubscriptionItemId(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the monthlyAmount property value. Monthly subscription amount for the business billing plan.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getMonthlyAmount() {
        return this.monthlyAmount;
    }
    /**
     * Gets the subscriptionItemId property value. Stripe subscription item identifier used for phone number billing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionItemId() {
        return this.subscriptionItemId;
    }
    /**
     * Gets the userId property value. User ID associated with phone number billing responsibility, when applicable.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the userName property value. Display name for the user connected to this phone number billing attribution.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeStringValue("businessName", this.getBusinessName());
        writer.writeStringValue("channel", this.getChannel());
        writer.writeObjectValue("monthlyAmount", this.getMonthlyAmount());
        writer.writeStringValue("subscriptionItemId", this.getSubscriptionItemId());
        writer.writeStringValue("userId", this.getUserId());
        writer.writeStringValue("userName", this.getUserName());
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
     * Sets the businessId property value. Business ID responsible for billing this phone number.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the businessName property value. Business display name used in phone number billing records.
     * @param value Value to set for the businessName property.
     */
    public void setBusinessName(@jakarta.annotation.Nullable final String value) {
        this.businessName = value;
    }
    /**
     * Sets the channel property value. Communication channel used for this phone number billing attribution, such as SMS or voice.
     * @param value Value to set for the channel property.
     */
    public void setChannel(@jakarta.annotation.Nullable final String value) {
        this.channel = value;
    }
    /**
     * Sets the monthlyAmount property value. Monthly subscription amount for the business billing plan.
     * @param value Value to set for the monthlyAmount property.
     */
    public void setMonthlyAmount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.monthlyAmount = value;
    }
    /**
     * Sets the subscriptionItemId property value. Stripe subscription item identifier used for phone number billing.
     * @param value Value to set for the subscriptionItemId property.
     */
    public void setSubscriptionItemId(@jakarta.annotation.Nullable final String value) {
        this.subscriptionItemId = value;
    }
    /**
     * Sets the userId property value. User ID associated with phone number billing responsibility, when applicable.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the userName property value. Display name for the user connected to this phone number billing attribution.
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.userName = value;
    }
}
