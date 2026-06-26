package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerAnalyticsSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The averageResponseMinutes property
     */
    private UntypedNode averageResponseMinutes;
    /**
     * The billingStatus property
     */
    private String billingStatus;
    /**
     * The callMinutes property
     */
    private Double callMinutes;
    /**
     * The callsPlaced property
     */
    private Integer callsPlaced;
    /**
     * The callsReceived property
     */
    private Integer callsReceived;
    /**
     * The leads property
     */
    private Integer leads;
    /**
     * The leadsComparison property
     */
    private AnalyticsComparison leadsComparison;
    /**
     * The medianResponseMinutes property
     */
    private UntypedNode medianResponseMinutes;
    /**
     * The missedCalls property
     */
    private Integer missedCalls;
    /**
     * The missedLeads property
     */
    private Integer missedLeads;
    /**
     * The respondedWithinFiveMinutesPercent property
     */
    private Double respondedWithinFiveMinutesPercent;
    /**
     * The smsReceived property
     */
    private Integer smsReceived;
    /**
     * The smsSent property
     */
    private Integer smsSent;
    /**
     * The unreadMessages property
     */
    private Integer unreadMessages;
    /**
     * The usageSpend property
     */
    private Double usageSpend;
    /**
     * The walletBalance property
     */
    private Double walletBalance;
    /**
     * The walletStatus property
     */
    private String walletStatus;
    /**
     * Instantiates a new {@link CustomerAnalyticsSummary} and sets the default values.
     */
    public CustomerAnalyticsSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerAnalyticsSummary}
     */
    @jakarta.annotation.Nonnull
    public static CustomerAnalyticsSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerAnalyticsSummary();
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
     * Gets the averageResponseMinutes property value. The averageResponseMinutes property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAverageResponseMinutes() {
        return this.averageResponseMinutes;
    }
    /**
     * Gets the billingStatus property value. The billingStatus property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBillingStatus() {
        return this.billingStatus;
    }
    /**
     * Gets the callMinutes property value. The callMinutes property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getCallMinutes() {
        return this.callMinutes;
    }
    /**
     * Gets the callsPlaced property value. The callsPlaced property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCallsPlaced() {
        return this.callsPlaced;
    }
    /**
     * Gets the callsReceived property value. The callsReceived property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCallsReceived() {
        return this.callsReceived;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("averageResponseMinutes", (n) -> { this.setAverageResponseMinutes(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("billingStatus", (n) -> { this.setBillingStatus(n.getStringValue()); });
        deserializerMap.put("callMinutes", (n) -> { this.setCallMinutes(n.getDoubleValue()); });
        deserializerMap.put("callsPlaced", (n) -> { this.setCallsPlaced(n.getIntegerValue()); });
        deserializerMap.put("callsReceived", (n) -> { this.setCallsReceived(n.getIntegerValue()); });
        deserializerMap.put("leads", (n) -> { this.setLeads(n.getIntegerValue()); });
        deserializerMap.put("leadsComparison", (n) -> { this.setLeadsComparison(n.getObjectValue(AnalyticsComparison::createFromDiscriminatorValue)); });
        deserializerMap.put("medianResponseMinutes", (n) -> { this.setMedianResponseMinutes(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("missedCalls", (n) -> { this.setMissedCalls(n.getIntegerValue()); });
        deserializerMap.put("missedLeads", (n) -> { this.setMissedLeads(n.getIntegerValue()); });
        deserializerMap.put("respondedWithinFiveMinutesPercent", (n) -> { this.setRespondedWithinFiveMinutesPercent(n.getDoubleValue()); });
        deserializerMap.put("smsReceived", (n) -> { this.setSmsReceived(n.getIntegerValue()); });
        deserializerMap.put("smsSent", (n) -> { this.setSmsSent(n.getIntegerValue()); });
        deserializerMap.put("unreadMessages", (n) -> { this.setUnreadMessages(n.getIntegerValue()); });
        deserializerMap.put("usageSpend", (n) -> { this.setUsageSpend(n.getDoubleValue()); });
        deserializerMap.put("walletBalance", (n) -> { this.setWalletBalance(n.getDoubleValue()); });
        deserializerMap.put("walletStatus", (n) -> { this.setWalletStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the leads property value. The leads property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLeads() {
        return this.leads;
    }
    /**
     * Gets the leadsComparison property value. The leadsComparison property
     * @return a {@link AnalyticsComparison}
     */
    @jakarta.annotation.Nullable
    public AnalyticsComparison getLeadsComparison() {
        return this.leadsComparison;
    }
    /**
     * Gets the medianResponseMinutes property value. The medianResponseMinutes property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getMedianResponseMinutes() {
        return this.medianResponseMinutes;
    }
    /**
     * Gets the missedCalls property value. The missedCalls property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMissedCalls() {
        return this.missedCalls;
    }
    /**
     * Gets the missedLeads property value. The missedLeads property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMissedLeads() {
        return this.missedLeads;
    }
    /**
     * Gets the respondedWithinFiveMinutesPercent property value. The respondedWithinFiveMinutesPercent property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getRespondedWithinFiveMinutesPercent() {
        return this.respondedWithinFiveMinutesPercent;
    }
    /**
     * Gets the smsReceived property value. The smsReceived property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsReceived() {
        return this.smsReceived;
    }
    /**
     * Gets the smsSent property value. The smsSent property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsSent() {
        return this.smsSent;
    }
    /**
     * Gets the unreadMessages property value. The unreadMessages property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnreadMessages() {
        return this.unreadMessages;
    }
    /**
     * Gets the usageSpend property value. The usageSpend property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getUsageSpend() {
        return this.usageSpend;
    }
    /**
     * Gets the walletBalance property value. The walletBalance property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getWalletBalance() {
        return this.walletBalance;
    }
    /**
     * Gets the walletStatus property value. The walletStatus property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWalletStatus() {
        return this.walletStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("averageResponseMinutes", this.getAverageResponseMinutes());
        writer.writeStringValue("billingStatus", this.getBillingStatus());
        writer.writeDoubleValue("callMinutes", this.getCallMinutes());
        writer.writeIntegerValue("callsPlaced", this.getCallsPlaced());
        writer.writeIntegerValue("callsReceived", this.getCallsReceived());
        writer.writeIntegerValue("leads", this.getLeads());
        writer.writeObjectValue("leadsComparison", this.getLeadsComparison());
        writer.writeObjectValue("medianResponseMinutes", this.getMedianResponseMinutes());
        writer.writeIntegerValue("missedCalls", this.getMissedCalls());
        writer.writeIntegerValue("missedLeads", this.getMissedLeads());
        writer.writeDoubleValue("respondedWithinFiveMinutesPercent", this.getRespondedWithinFiveMinutesPercent());
        writer.writeIntegerValue("smsReceived", this.getSmsReceived());
        writer.writeIntegerValue("smsSent", this.getSmsSent());
        writer.writeIntegerValue("unreadMessages", this.getUnreadMessages());
        writer.writeDoubleValue("usageSpend", this.getUsageSpend());
        writer.writeDoubleValue("walletBalance", this.getWalletBalance());
        writer.writeStringValue("walletStatus", this.getWalletStatus());
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
     * Sets the averageResponseMinutes property value. The averageResponseMinutes property
     * @param value Value to set for the averageResponseMinutes property.
     */
    public void setAverageResponseMinutes(@jakarta.annotation.Nullable final UntypedNode value) {
        this.averageResponseMinutes = value;
    }
    /**
     * Sets the billingStatus property value. The billingStatus property
     * @param value Value to set for the billingStatus property.
     */
    public void setBillingStatus(@jakarta.annotation.Nullable final String value) {
        this.billingStatus = value;
    }
    /**
     * Sets the callMinutes property value. The callMinutes property
     * @param value Value to set for the callMinutes property.
     */
    public void setCallMinutes(@jakarta.annotation.Nullable final Double value) {
        this.callMinutes = value;
    }
    /**
     * Sets the callsPlaced property value. The callsPlaced property
     * @param value Value to set for the callsPlaced property.
     */
    public void setCallsPlaced(@jakarta.annotation.Nullable final Integer value) {
        this.callsPlaced = value;
    }
    /**
     * Sets the callsReceived property value. The callsReceived property
     * @param value Value to set for the callsReceived property.
     */
    public void setCallsReceived(@jakarta.annotation.Nullable final Integer value) {
        this.callsReceived = value;
    }
    /**
     * Sets the leads property value. The leads property
     * @param value Value to set for the leads property.
     */
    public void setLeads(@jakarta.annotation.Nullable final Integer value) {
        this.leads = value;
    }
    /**
     * Sets the leadsComparison property value. The leadsComparison property
     * @param value Value to set for the leadsComparison property.
     */
    public void setLeadsComparison(@jakarta.annotation.Nullable final AnalyticsComparison value) {
        this.leadsComparison = value;
    }
    /**
     * Sets the medianResponseMinutes property value. The medianResponseMinutes property
     * @param value Value to set for the medianResponseMinutes property.
     */
    public void setMedianResponseMinutes(@jakarta.annotation.Nullable final UntypedNode value) {
        this.medianResponseMinutes = value;
    }
    /**
     * Sets the missedCalls property value. The missedCalls property
     * @param value Value to set for the missedCalls property.
     */
    public void setMissedCalls(@jakarta.annotation.Nullable final Integer value) {
        this.missedCalls = value;
    }
    /**
     * Sets the missedLeads property value. The missedLeads property
     * @param value Value to set for the missedLeads property.
     */
    public void setMissedLeads(@jakarta.annotation.Nullable final Integer value) {
        this.missedLeads = value;
    }
    /**
     * Sets the respondedWithinFiveMinutesPercent property value. The respondedWithinFiveMinutesPercent property
     * @param value Value to set for the respondedWithinFiveMinutesPercent property.
     */
    public void setRespondedWithinFiveMinutesPercent(@jakarta.annotation.Nullable final Double value) {
        this.respondedWithinFiveMinutesPercent = value;
    }
    /**
     * Sets the smsReceived property value. The smsReceived property
     * @param value Value to set for the smsReceived property.
     */
    public void setSmsReceived(@jakarta.annotation.Nullable final Integer value) {
        this.smsReceived = value;
    }
    /**
     * Sets the smsSent property value. The smsSent property
     * @param value Value to set for the smsSent property.
     */
    public void setSmsSent(@jakarta.annotation.Nullable final Integer value) {
        this.smsSent = value;
    }
    /**
     * Sets the unreadMessages property value. The unreadMessages property
     * @param value Value to set for the unreadMessages property.
     */
    public void setUnreadMessages(@jakarta.annotation.Nullable final Integer value) {
        this.unreadMessages = value;
    }
    /**
     * Sets the usageSpend property value. The usageSpend property
     * @param value Value to set for the usageSpend property.
     */
    public void setUsageSpend(@jakarta.annotation.Nullable final Double value) {
        this.usageSpend = value;
    }
    /**
     * Sets the walletBalance property value. The walletBalance property
     * @param value Value to set for the walletBalance property.
     */
    public void setWalletBalance(@jakarta.annotation.Nullable final Double value) {
        this.walletBalance = value;
    }
    /**
     * Sets the walletStatus property value. The walletStatus property
     * @param value Value to set for the walletStatus property.
     */
    public void setWalletStatus(@jakarta.annotation.Nullable final String value) {
        this.walletStatus = value;
    }
}
