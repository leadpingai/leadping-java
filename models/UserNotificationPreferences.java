package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * API DTO containing user notification preferences data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserNotificationPreferences implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The automationFailedEmailEnabled property
     */
    private Boolean automationFailedEmailEnabled;
    /**
     * Whether automation failed notifications are enabled for this user notification preferences.
     */
    private Boolean automationFailedEnabled;
    /**
     * The automationFailedSmsEnabled property
     */
    private Boolean automationFailedSmsEnabled;
    /**
     * Whether billing email is enabled for this user notification preferences.
     */
    private Boolean billingEmailEnabled;
    /**
     * Whether billing SMS is enabled for this user notification preferences.
     */
    private Boolean billingSmsEnabled;
    /**
     * The lowWalletBalanceEmailEnabled property
     */
    private Boolean lowWalletBalanceEmailEnabled;
    /**
     * Whether low wallet balance notifications are enabled for this user notification preferences.
     */
    private Boolean lowWalletBalanceEnabled;
    /**
     * The lowWalletBalanceSmsEnabled property
     */
    private Boolean lowWalletBalanceSmsEnabled;
    /**
     * The missedCallEmailEnabled property
     */
    private Boolean missedCallEmailEnabled;
    /**
     * Whether missed call notifications are enabled for this user notification preferences.
     */
    private Boolean missedCallEnabled;
    /**
     * The missedCallSmsEnabled property
     */
    private Boolean missedCallSmsEnabled;
    /**
     * Whether new lead email is enabled for this user notification preferences.
     */
    private Boolean newLeadEmailEnabled;
    /**
     * Whether new lead notifications are enabled for this user notification preferences.
     */
    private Boolean newLeadEnabled;
    /**
     * Whether new lead SMS is enabled for this user notification preferences.
     */
    private Boolean newLeadSmsEnabled;
    /**
     * Whether payment failed notifications are enabled for this user notification preferences.
     */
    private Boolean paymentFailedEnabled;
    /**
     * The paymentFailedSmsEnabled property
     */
    private Boolean paymentFailedSmsEnabled;
    /**
     * The subscriptionRenewingEmailEnabled property
     */
    private Boolean subscriptionRenewingEmailEnabled;
    /**
     * Whether subscription renewing notifications are enabled for this user notification preferences.
     */
    private Boolean subscriptionRenewingEnabled;
    /**
     * The subscriptionRenewingSmsEnabled property
     */
    private Boolean subscriptionRenewingSmsEnabled;
    /**
     * Whether 10DLC status notifications are enabled for this user notification preferences.
     */
    private Boolean tenDlcStatusEnabled;
    /**
     * The unreadSmsEmailEnabled property
     */
    private Boolean unreadSmsEmailEnabled;
    /**
     * Whether unread SMS notifications are enabled for this user notification preferences.
     */
    private Boolean unreadSmsEnabled;
    /**
     * The unreadSmsSmsEnabled property
     */
    private Boolean unreadSmsSmsEnabled;
    /**
     * Whether usage limit hit notifications are enabled for this user notification preferences.
     */
    private Boolean usageLimitHitEnabled;
    /**
     * Instantiates a new {@link UserNotificationPreferences} and sets the default values.
     */
    public UserNotificationPreferences() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserNotificationPreferences}
     */
    @jakarta.annotation.Nonnull
    public static UserNotificationPreferences createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserNotificationPreferences();
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
     * Gets the automationFailedEmailEnabled property value. The automationFailedEmailEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutomationFailedEmailEnabled() {
        return this.automationFailedEmailEnabled;
    }
    /**
     * Gets the automationFailedEnabled property value. Whether automation failed notifications are enabled for this user notification preferences.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutomationFailedEnabled() {
        return this.automationFailedEnabled;
    }
    /**
     * Gets the automationFailedSmsEnabled property value. The automationFailedSmsEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutomationFailedSmsEnabled() {
        return this.automationFailedSmsEnabled;
    }
    /**
     * Gets the billingEmailEnabled property value. Whether billing email is enabled for this user notification preferences.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBillingEmailEnabled() {
        return this.billingEmailEnabled;
    }
    /**
     * Gets the billingSmsEnabled property value. Whether billing SMS is enabled for this user notification preferences.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBillingSmsEnabled() {
        return this.billingSmsEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(24);
        deserializerMap.put("automationFailedEmailEnabled", (n) -> { this.setAutomationFailedEmailEnabled(n.getBooleanValue()); });
        deserializerMap.put("automationFailedEnabled", (n) -> { this.setAutomationFailedEnabled(n.getBooleanValue()); });
        deserializerMap.put("automationFailedSmsEnabled", (n) -> { this.setAutomationFailedSmsEnabled(n.getBooleanValue()); });
        deserializerMap.put("billingEmailEnabled", (n) -> { this.setBillingEmailEnabled(n.getBooleanValue()); });
        deserializerMap.put("billingSmsEnabled", (n) -> { this.setBillingSmsEnabled(n.getBooleanValue()); });
        deserializerMap.put("lowWalletBalanceEmailEnabled", (n) -> { this.setLowWalletBalanceEmailEnabled(n.getBooleanValue()); });
        deserializerMap.put("lowWalletBalanceEnabled", (n) -> { this.setLowWalletBalanceEnabled(n.getBooleanValue()); });
        deserializerMap.put("lowWalletBalanceSmsEnabled", (n) -> { this.setLowWalletBalanceSmsEnabled(n.getBooleanValue()); });
        deserializerMap.put("missedCallEmailEnabled", (n) -> { this.setMissedCallEmailEnabled(n.getBooleanValue()); });
        deserializerMap.put("missedCallEnabled", (n) -> { this.setMissedCallEnabled(n.getBooleanValue()); });
        deserializerMap.put("missedCallSmsEnabled", (n) -> { this.setMissedCallSmsEnabled(n.getBooleanValue()); });
        deserializerMap.put("newLeadEmailEnabled", (n) -> { this.setNewLeadEmailEnabled(n.getBooleanValue()); });
        deserializerMap.put("newLeadEnabled", (n) -> { this.setNewLeadEnabled(n.getBooleanValue()); });
        deserializerMap.put("newLeadSmsEnabled", (n) -> { this.setNewLeadSmsEnabled(n.getBooleanValue()); });
        deserializerMap.put("paymentFailedEnabled", (n) -> { this.setPaymentFailedEnabled(n.getBooleanValue()); });
        deserializerMap.put("paymentFailedSmsEnabled", (n) -> { this.setPaymentFailedSmsEnabled(n.getBooleanValue()); });
        deserializerMap.put("subscriptionRenewingEmailEnabled", (n) -> { this.setSubscriptionRenewingEmailEnabled(n.getBooleanValue()); });
        deserializerMap.put("subscriptionRenewingEnabled", (n) -> { this.setSubscriptionRenewingEnabled(n.getBooleanValue()); });
        deserializerMap.put("subscriptionRenewingSmsEnabled", (n) -> { this.setSubscriptionRenewingSmsEnabled(n.getBooleanValue()); });
        deserializerMap.put("tenDlcStatusEnabled", (n) -> { this.setTenDlcStatusEnabled(n.getBooleanValue()); });
        deserializerMap.put("unreadSmsEmailEnabled", (n) -> { this.setUnreadSmsEmailEnabled(n.getBooleanValue()); });
        deserializerMap.put("unreadSmsEnabled", (n) -> { this.setUnreadSmsEnabled(n.getBooleanValue()); });
        deserializerMap.put("unreadSmsSmsEnabled", (n) -> { this.setUnreadSmsSmsEnabled(n.getBooleanValue()); });
        deserializerMap.put("usageLimitHitEnabled", (n) -> { this.setUsageLimitHitEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lowWalletBalanceEmailEnabled property value. The lowWalletBalanceEmailEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLowWalletBalanceEmailEnabled() {
        return this.lowWalletBalanceEmailEnabled;
    }
    /**
     * Gets the lowWalletBalanceEnabled property value. Whether low wallet balance notifications are enabled for this user notification preferences.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLowWalletBalanceEnabled() {
        return this.lowWalletBalanceEnabled;
    }
    /**
     * Gets the lowWalletBalanceSmsEnabled property value. The lowWalletBalanceSmsEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLowWalletBalanceSmsEnabled() {
        return this.lowWalletBalanceSmsEnabled;
    }
    /**
     * Gets the missedCallEmailEnabled property value. The missedCallEmailEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMissedCallEmailEnabled() {
        return this.missedCallEmailEnabled;
    }
    /**
     * Gets the missedCallEnabled property value. Whether missed call notifications are enabled for this user notification preferences.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMissedCallEnabled() {
        return this.missedCallEnabled;
    }
    /**
     * Gets the missedCallSmsEnabled property value. The missedCallSmsEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMissedCallSmsEnabled() {
        return this.missedCallSmsEnabled;
    }
    /**
     * Gets the newLeadEmailEnabled property value. Whether new lead email is enabled for this user notification preferences.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNewLeadEmailEnabled() {
        return this.newLeadEmailEnabled;
    }
    /**
     * Gets the newLeadEnabled property value. Whether new lead notifications are enabled for this user notification preferences.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNewLeadEnabled() {
        return this.newLeadEnabled;
    }
    /**
     * Gets the newLeadSmsEnabled property value. Whether new lead SMS is enabled for this user notification preferences.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNewLeadSmsEnabled() {
        return this.newLeadSmsEnabled;
    }
    /**
     * Gets the paymentFailedEnabled property value. Whether payment failed notifications are enabled for this user notification preferences.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPaymentFailedEnabled() {
        return this.paymentFailedEnabled;
    }
    /**
     * Gets the paymentFailedSmsEnabled property value. The paymentFailedSmsEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPaymentFailedSmsEnabled() {
        return this.paymentFailedSmsEnabled;
    }
    /**
     * Gets the subscriptionRenewingEmailEnabled property value. The subscriptionRenewingEmailEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSubscriptionRenewingEmailEnabled() {
        return this.subscriptionRenewingEmailEnabled;
    }
    /**
     * Gets the subscriptionRenewingEnabled property value. Whether subscription renewing notifications are enabled for this user notification preferences.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSubscriptionRenewingEnabled() {
        return this.subscriptionRenewingEnabled;
    }
    /**
     * Gets the subscriptionRenewingSmsEnabled property value. The subscriptionRenewingSmsEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSubscriptionRenewingSmsEnabled() {
        return this.subscriptionRenewingSmsEnabled;
    }
    /**
     * Gets the tenDlcStatusEnabled property value. Whether 10DLC status notifications are enabled for this user notification preferences.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTenDlcStatusEnabled() {
        return this.tenDlcStatusEnabled;
    }
    /**
     * Gets the unreadSmsEmailEnabled property value. The unreadSmsEmailEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUnreadSmsEmailEnabled() {
        return this.unreadSmsEmailEnabled;
    }
    /**
     * Gets the unreadSmsEnabled property value. Whether unread SMS notifications are enabled for this user notification preferences.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUnreadSmsEnabled() {
        return this.unreadSmsEnabled;
    }
    /**
     * Gets the unreadSmsSmsEnabled property value. The unreadSmsSmsEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUnreadSmsSmsEnabled() {
        return this.unreadSmsSmsEnabled;
    }
    /**
     * Gets the usageLimitHitEnabled property value. Whether usage limit hit notifications are enabled for this user notification preferences.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUsageLimitHitEnabled() {
        return this.usageLimitHitEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("automationFailedEmailEnabled", this.getAutomationFailedEmailEnabled());
        writer.writeBooleanValue("automationFailedEnabled", this.getAutomationFailedEnabled());
        writer.writeBooleanValue("automationFailedSmsEnabled", this.getAutomationFailedSmsEnabled());
        writer.writeBooleanValue("billingEmailEnabled", this.getBillingEmailEnabled());
        writer.writeBooleanValue("billingSmsEnabled", this.getBillingSmsEnabled());
        writer.writeBooleanValue("lowWalletBalanceEmailEnabled", this.getLowWalletBalanceEmailEnabled());
        writer.writeBooleanValue("lowWalletBalanceEnabled", this.getLowWalletBalanceEnabled());
        writer.writeBooleanValue("lowWalletBalanceSmsEnabled", this.getLowWalletBalanceSmsEnabled());
        writer.writeBooleanValue("missedCallEmailEnabled", this.getMissedCallEmailEnabled());
        writer.writeBooleanValue("missedCallEnabled", this.getMissedCallEnabled());
        writer.writeBooleanValue("missedCallSmsEnabled", this.getMissedCallSmsEnabled());
        writer.writeBooleanValue("newLeadEmailEnabled", this.getNewLeadEmailEnabled());
        writer.writeBooleanValue("newLeadEnabled", this.getNewLeadEnabled());
        writer.writeBooleanValue("newLeadSmsEnabled", this.getNewLeadSmsEnabled());
        writer.writeBooleanValue("paymentFailedEnabled", this.getPaymentFailedEnabled());
        writer.writeBooleanValue("paymentFailedSmsEnabled", this.getPaymentFailedSmsEnabled());
        writer.writeBooleanValue("subscriptionRenewingEmailEnabled", this.getSubscriptionRenewingEmailEnabled());
        writer.writeBooleanValue("subscriptionRenewingEnabled", this.getSubscriptionRenewingEnabled());
        writer.writeBooleanValue("subscriptionRenewingSmsEnabled", this.getSubscriptionRenewingSmsEnabled());
        writer.writeBooleanValue("tenDlcStatusEnabled", this.getTenDlcStatusEnabled());
        writer.writeBooleanValue("unreadSmsEmailEnabled", this.getUnreadSmsEmailEnabled());
        writer.writeBooleanValue("unreadSmsEnabled", this.getUnreadSmsEnabled());
        writer.writeBooleanValue("unreadSmsSmsEnabled", this.getUnreadSmsSmsEnabled());
        writer.writeBooleanValue("usageLimitHitEnabled", this.getUsageLimitHitEnabled());
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
     * Sets the automationFailedEmailEnabled property value. The automationFailedEmailEnabled property
     * @param value Value to set for the automationFailedEmailEnabled property.
     */
    public void setAutomationFailedEmailEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.automationFailedEmailEnabled = value;
    }
    /**
     * Sets the automationFailedEnabled property value. Whether automation failed notifications are enabled for this user notification preferences.
     * @param value Value to set for the automationFailedEnabled property.
     */
    public void setAutomationFailedEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.automationFailedEnabled = value;
    }
    /**
     * Sets the automationFailedSmsEnabled property value. The automationFailedSmsEnabled property
     * @param value Value to set for the automationFailedSmsEnabled property.
     */
    public void setAutomationFailedSmsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.automationFailedSmsEnabled = value;
    }
    /**
     * Sets the billingEmailEnabled property value. Whether billing email is enabled for this user notification preferences.
     * @param value Value to set for the billingEmailEnabled property.
     */
    public void setBillingEmailEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.billingEmailEnabled = value;
    }
    /**
     * Sets the billingSmsEnabled property value. Whether billing SMS is enabled for this user notification preferences.
     * @param value Value to set for the billingSmsEnabled property.
     */
    public void setBillingSmsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.billingSmsEnabled = value;
    }
    /**
     * Sets the lowWalletBalanceEmailEnabled property value. The lowWalletBalanceEmailEnabled property
     * @param value Value to set for the lowWalletBalanceEmailEnabled property.
     */
    public void setLowWalletBalanceEmailEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.lowWalletBalanceEmailEnabled = value;
    }
    /**
     * Sets the lowWalletBalanceEnabled property value. Whether low wallet balance notifications are enabled for this user notification preferences.
     * @param value Value to set for the lowWalletBalanceEnabled property.
     */
    public void setLowWalletBalanceEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.lowWalletBalanceEnabled = value;
    }
    /**
     * Sets the lowWalletBalanceSmsEnabled property value. The lowWalletBalanceSmsEnabled property
     * @param value Value to set for the lowWalletBalanceSmsEnabled property.
     */
    public void setLowWalletBalanceSmsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.lowWalletBalanceSmsEnabled = value;
    }
    /**
     * Sets the missedCallEmailEnabled property value. The missedCallEmailEnabled property
     * @param value Value to set for the missedCallEmailEnabled property.
     */
    public void setMissedCallEmailEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.missedCallEmailEnabled = value;
    }
    /**
     * Sets the missedCallEnabled property value. Whether missed call notifications are enabled for this user notification preferences.
     * @param value Value to set for the missedCallEnabled property.
     */
    public void setMissedCallEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.missedCallEnabled = value;
    }
    /**
     * Sets the missedCallSmsEnabled property value. The missedCallSmsEnabled property
     * @param value Value to set for the missedCallSmsEnabled property.
     */
    public void setMissedCallSmsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.missedCallSmsEnabled = value;
    }
    /**
     * Sets the newLeadEmailEnabled property value. Whether new lead email is enabled for this user notification preferences.
     * @param value Value to set for the newLeadEmailEnabled property.
     */
    public void setNewLeadEmailEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.newLeadEmailEnabled = value;
    }
    /**
     * Sets the newLeadEnabled property value. Whether new lead notifications are enabled for this user notification preferences.
     * @param value Value to set for the newLeadEnabled property.
     */
    public void setNewLeadEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.newLeadEnabled = value;
    }
    /**
     * Sets the newLeadSmsEnabled property value. Whether new lead SMS is enabled for this user notification preferences.
     * @param value Value to set for the newLeadSmsEnabled property.
     */
    public void setNewLeadSmsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.newLeadSmsEnabled = value;
    }
    /**
     * Sets the paymentFailedEnabled property value. Whether payment failed notifications are enabled for this user notification preferences.
     * @param value Value to set for the paymentFailedEnabled property.
     */
    public void setPaymentFailedEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.paymentFailedEnabled = value;
    }
    /**
     * Sets the paymentFailedSmsEnabled property value. The paymentFailedSmsEnabled property
     * @param value Value to set for the paymentFailedSmsEnabled property.
     */
    public void setPaymentFailedSmsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.paymentFailedSmsEnabled = value;
    }
    /**
     * Sets the subscriptionRenewingEmailEnabled property value. The subscriptionRenewingEmailEnabled property
     * @param value Value to set for the subscriptionRenewingEmailEnabled property.
     */
    public void setSubscriptionRenewingEmailEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.subscriptionRenewingEmailEnabled = value;
    }
    /**
     * Sets the subscriptionRenewingEnabled property value. Whether subscription renewing notifications are enabled for this user notification preferences.
     * @param value Value to set for the subscriptionRenewingEnabled property.
     */
    public void setSubscriptionRenewingEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.subscriptionRenewingEnabled = value;
    }
    /**
     * Sets the subscriptionRenewingSmsEnabled property value. The subscriptionRenewingSmsEnabled property
     * @param value Value to set for the subscriptionRenewingSmsEnabled property.
     */
    public void setSubscriptionRenewingSmsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.subscriptionRenewingSmsEnabled = value;
    }
    /**
     * Sets the tenDlcStatusEnabled property value. Whether 10DLC status notifications are enabled for this user notification preferences.
     * @param value Value to set for the tenDlcStatusEnabled property.
     */
    public void setTenDlcStatusEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.tenDlcStatusEnabled = value;
    }
    /**
     * Sets the unreadSmsEmailEnabled property value. The unreadSmsEmailEnabled property
     * @param value Value to set for the unreadSmsEmailEnabled property.
     */
    public void setUnreadSmsEmailEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.unreadSmsEmailEnabled = value;
    }
    /**
     * Sets the unreadSmsEnabled property value. Whether unread SMS notifications are enabled for this user notification preferences.
     * @param value Value to set for the unreadSmsEnabled property.
     */
    public void setUnreadSmsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.unreadSmsEnabled = value;
    }
    /**
     * Sets the unreadSmsSmsEnabled property value. The unreadSmsSmsEnabled property
     * @param value Value to set for the unreadSmsSmsEnabled property.
     */
    public void setUnreadSmsSmsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.unreadSmsSmsEnabled = value;
    }
    /**
     * Sets the usageLimitHitEnabled property value. Whether usage limit hit notifications are enabled for this user notification preferences.
     * @param value Value to set for the usageLimitHitEnabled property.
     */
    public void setUsageLimitHitEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.usageLimitHitEnabled = value;
    }
}
