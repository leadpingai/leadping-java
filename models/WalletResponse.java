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
 * Response schema for the Leadping API billing wallet response returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WalletResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Amount of wallet credit purchased in this deposit.
     */
    private UntypedNode amountPurchased;
    /**
     * Amount of wallet credit still available for future usage.
     */
    private UntypedNode amountRemaining;
    /**
     * Wallet or account balance after this transaction is applied.
     */
    private UntypedNode balance;
    /**
     * UTC timestamp when Leadping last calculated the wallet balance.
     */
    private OffsetDateTime balanceCalculatedAt;
    /**
     * Business ID that owns this wallet balance or credit.
     */
    private String businessId;
    /**
     * The date and time when the entity was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Defines the lifecycle state for a wallet credit lot.
     */
    private WalletResponseCreditStatus creditStatus;
    /**
     * ISO currency code used for the monetary amounts in this billing wallet response.
     */
    private String currency;
    /**
     * Amount of wallet credit that has expired.
     */
    private UntypedNode expiredCreditAmount;
    /**
     * UTC timestamp when the wallet credit expires.
     */
    private OffsetDateTime expiresAt;
    /**
     * The unique identifier for the entity.
     */
    private String id;
    /**
     * The date and time when the entity was last modified, if applicable.
     */
    private OffsetDateTime modifiedAt;
    /**
     * The display name for the entity.
     */
    private String name;
    /**
     * UTC timestamp when the next wallet credit amount expires.
     */
    private OffsetDateTime nextCreditExpirationAt;
    /**
     * Amount of wallet credit scheduled to expire next.
     */
    private UntypedNode nextExpiringCreditAmount;
    /**
     * Original wallet transaction ID referenced by a reversal, refund, or adjustment.
     */
    private String originalTransactionId;
    /**
     * UTC timestamp when the wallet credit was purchased.
     */
    private OffsetDateTime purchasedAt;
    /**
     * Defines the source that created a wallet credit lot.
     */
    private WalletResponseSourceType sourceType;
    /**
     * Stripe charge identifier linked to this billing transaction.
     */
    private String stripeChargeId;
    /**
     * Stripe invoice identifier linked to this billing transaction.
     */
    private String stripeInvoiceId;
    /**
     * Stripe payment intent identifier linked to this billing transaction.
     */
    private String stripePaymentIntentId;
    /**
     * Instantiates a new {@link WalletResponse} and sets the default values.
     */
    public WalletResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WalletResponse}
     */
    @jakarta.annotation.Nonnull
    public static WalletResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WalletResponse();
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
     * Gets the amountPurchased property value. Amount of wallet credit purchased in this deposit.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAmountPurchased() {
        return this.amountPurchased;
    }
    /**
     * Gets the amountRemaining property value. Amount of wallet credit still available for future usage.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAmountRemaining() {
        return this.amountRemaining;
    }
    /**
     * Gets the balance property value. Wallet or account balance after this transaction is applied.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getBalance() {
        return this.balance;
    }
    /**
     * Gets the balanceCalculatedAt property value. UTC timestamp when Leadping last calculated the wallet balance.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getBalanceCalculatedAt() {
        return this.balanceCalculatedAt;
    }
    /**
     * Gets the businessId property value. Business ID that owns this wallet balance or credit.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the createdAt property value. The date and time when the entity was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the creditStatus property value. Defines the lifecycle state for a wallet credit lot.
     * @return a {@link WalletResponseCreditStatus}
     */
    @jakarta.annotation.Nullable
    public WalletResponseCreditStatus getCreditStatus() {
        return this.creditStatus;
    }
    /**
     * Gets the currency property value. ISO currency code used for the monetary amounts in this billing wallet response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * Gets the expiredCreditAmount property value. Amount of wallet credit that has expired.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getExpiredCreditAmount() {
        return this.expiredCreditAmount;
    }
    /**
     * Gets the expiresAt property value. UTC timestamp when the wallet credit expires.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(21);
        deserializerMap.put("amountPurchased", (n) -> { this.setAmountPurchased(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("amountRemaining", (n) -> { this.setAmountRemaining(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("balance", (n) -> { this.setBalance(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("balanceCalculatedAt", (n) -> { this.setBalanceCalculatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("creditStatus", (n) -> { this.setCreditStatus(n.getEnumValue(WalletResponseCreditStatus::forValue)); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("expiredCreditAmount", (n) -> { this.setExpiredCreditAmount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("expiresAt", (n) -> { this.setExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("nextCreditExpirationAt", (n) -> { this.setNextCreditExpirationAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("nextExpiringCreditAmount", (n) -> { this.setNextExpiringCreditAmount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("originalTransactionId", (n) -> { this.setOriginalTransactionId(n.getStringValue()); });
        deserializerMap.put("purchasedAt", (n) -> { this.setPurchasedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sourceType", (n) -> { this.setSourceType(n.getEnumValue(WalletResponseSourceType::forValue)); });
        deserializerMap.put("stripeChargeId", (n) -> { this.setStripeChargeId(n.getStringValue()); });
        deserializerMap.put("stripeInvoiceId", (n) -> { this.setStripeInvoiceId(n.getStringValue()); });
        deserializerMap.put("stripePaymentIntentId", (n) -> { this.setStripePaymentIntentId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique identifier for the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the modifiedAt property value. The date and time when the entity was last modified, if applicable.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the name property value. The display name for the entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the nextCreditExpirationAt property value. UTC timestamp when the next wallet credit amount expires.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextCreditExpirationAt() {
        return this.nextCreditExpirationAt;
    }
    /**
     * Gets the nextExpiringCreditAmount property value. Amount of wallet credit scheduled to expire next.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getNextExpiringCreditAmount() {
        return this.nextExpiringCreditAmount;
    }
    /**
     * Gets the originalTransactionId property value. Original wallet transaction ID referenced by a reversal, refund, or adjustment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginalTransactionId() {
        return this.originalTransactionId;
    }
    /**
     * Gets the purchasedAt property value. UTC timestamp when the wallet credit was purchased.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPurchasedAt() {
        return this.purchasedAt;
    }
    /**
     * Gets the sourceType property value. Defines the source that created a wallet credit lot.
     * @return a {@link WalletResponseSourceType}
     */
    @jakarta.annotation.Nullable
    public WalletResponseSourceType getSourceType() {
        return this.sourceType;
    }
    /**
     * Gets the stripeChargeId property value. Stripe charge identifier linked to this billing transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStripeChargeId() {
        return this.stripeChargeId;
    }
    /**
     * Gets the stripeInvoiceId property value. Stripe invoice identifier linked to this billing transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStripeInvoiceId() {
        return this.stripeInvoiceId;
    }
    /**
     * Gets the stripePaymentIntentId property value. Stripe payment intent identifier linked to this billing transaction.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStripePaymentIntentId() {
        return this.stripePaymentIntentId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amountPurchased", this.getAmountPurchased());
        writer.writeObjectValue("amountRemaining", this.getAmountRemaining());
        writer.writeObjectValue("balance", this.getBalance());
        writer.writeOffsetDateTimeValue("balanceCalculatedAt", this.getBalanceCalculatedAt());
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeEnumValue("creditStatus", this.getCreditStatus());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeObjectValue("expiredCreditAmount", this.getExpiredCreditAmount());
        writer.writeOffsetDateTimeValue("expiresAt", this.getExpiresAt());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeStringValue("name", this.getName());
        writer.writeOffsetDateTimeValue("nextCreditExpirationAt", this.getNextCreditExpirationAt());
        writer.writeObjectValue("nextExpiringCreditAmount", this.getNextExpiringCreditAmount());
        writer.writeStringValue("originalTransactionId", this.getOriginalTransactionId());
        writer.writeOffsetDateTimeValue("purchasedAt", this.getPurchasedAt());
        writer.writeEnumValue("sourceType", this.getSourceType());
        writer.writeStringValue("stripeChargeId", this.getStripeChargeId());
        writer.writeStringValue("stripeInvoiceId", this.getStripeInvoiceId());
        writer.writeStringValue("stripePaymentIntentId", this.getStripePaymentIntentId());
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
     * Sets the amountPurchased property value. Amount of wallet credit purchased in this deposit.
     * @param value Value to set for the amountPurchased property.
     */
    public void setAmountPurchased(@jakarta.annotation.Nullable final UntypedNode value) {
        this.amountPurchased = value;
    }
    /**
     * Sets the amountRemaining property value. Amount of wallet credit still available for future usage.
     * @param value Value to set for the amountRemaining property.
     */
    public void setAmountRemaining(@jakarta.annotation.Nullable final UntypedNode value) {
        this.amountRemaining = value;
    }
    /**
     * Sets the balance property value. Wallet or account balance after this transaction is applied.
     * @param value Value to set for the balance property.
     */
    public void setBalance(@jakarta.annotation.Nullable final UntypedNode value) {
        this.balance = value;
    }
    /**
     * Sets the balanceCalculatedAt property value. UTC timestamp when Leadping last calculated the wallet balance.
     * @param value Value to set for the balanceCalculatedAt property.
     */
    public void setBalanceCalculatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.balanceCalculatedAt = value;
    }
    /**
     * Sets the businessId property value. Business ID that owns this wallet balance or credit.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the createdAt property value. The date and time when the entity was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the creditStatus property value. Defines the lifecycle state for a wallet credit lot.
     * @param value Value to set for the creditStatus property.
     */
    public void setCreditStatus(@jakarta.annotation.Nullable final WalletResponseCreditStatus value) {
        this.creditStatus = value;
    }
    /**
     * Sets the currency property value. ISO currency code used for the monetary amounts in this billing wallet response.
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the expiredCreditAmount property value. Amount of wallet credit that has expired.
     * @param value Value to set for the expiredCreditAmount property.
     */
    public void setExpiredCreditAmount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.expiredCreditAmount = value;
    }
    /**
     * Sets the expiresAt property value. UTC timestamp when the wallet credit expires.
     * @param value Value to set for the expiresAt property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expiresAt = value;
    }
    /**
     * Sets the id property value. The unique identifier for the entity.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the modifiedAt property value. The date and time when the entity was last modified, if applicable.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the name property value. The display name for the entity.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the nextCreditExpirationAt property value. UTC timestamp when the next wallet credit amount expires.
     * @param value Value to set for the nextCreditExpirationAt property.
     */
    public void setNextCreditExpirationAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.nextCreditExpirationAt = value;
    }
    /**
     * Sets the nextExpiringCreditAmount property value. Amount of wallet credit scheduled to expire next.
     * @param value Value to set for the nextExpiringCreditAmount property.
     */
    public void setNextExpiringCreditAmount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.nextExpiringCreditAmount = value;
    }
    /**
     * Sets the originalTransactionId property value. Original wallet transaction ID referenced by a reversal, refund, or adjustment.
     * @param value Value to set for the originalTransactionId property.
     */
    public void setOriginalTransactionId(@jakarta.annotation.Nullable final String value) {
        this.originalTransactionId = value;
    }
    /**
     * Sets the purchasedAt property value. UTC timestamp when the wallet credit was purchased.
     * @param value Value to set for the purchasedAt property.
     */
    public void setPurchasedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.purchasedAt = value;
    }
    /**
     * Sets the sourceType property value. Defines the source that created a wallet credit lot.
     * @param value Value to set for the sourceType property.
     */
    public void setSourceType(@jakarta.annotation.Nullable final WalletResponseSourceType value) {
        this.sourceType = value;
    }
    /**
     * Sets the stripeChargeId property value. Stripe charge identifier linked to this billing transaction.
     * @param value Value to set for the stripeChargeId property.
     */
    public void setStripeChargeId(@jakarta.annotation.Nullable final String value) {
        this.stripeChargeId = value;
    }
    /**
     * Sets the stripeInvoiceId property value. Stripe invoice identifier linked to this billing transaction.
     * @param value Value to set for the stripeInvoiceId property.
     */
    public void setStripeInvoiceId(@jakarta.annotation.Nullable final String value) {
        this.stripeInvoiceId = value;
    }
    /**
     * Sets the stripePaymentIntentId property value. Stripe payment intent identifier linked to this billing transaction.
     * @param value Value to set for the stripePaymentIntentId property.
     */
    public void setStripePaymentIntentId(@jakarta.annotation.Nullable final String value) {
        this.stripePaymentIntentId = value;
    }
}
