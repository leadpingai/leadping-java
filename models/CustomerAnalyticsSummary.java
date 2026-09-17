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
 * Summarizes an organization&apos;s primary lead, response, communication, and conversion KPIs for the selected period.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerAnalyticsSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Average time, in minutes, before a lead receives a response.
     */
    private Double averageResponseMinutes;
    /**
     * Current billing status for this Leadping customer analytics summary.
     */
    private String billingStatus;
    /**
     * Total connected call duration, in minutes, during the reporting period.
     */
    private Double callMinutes;
    /**
     * Number of outbound calls placed during the reporting period.
     */
    private Integer callsPlaced;
    /**
     * Number of inbound calls received during the reporting period.
     */
    private Integer callsReceived;
    /**
     * Manual provider-accepted SMS messages; automated messages are excluded.
     */
    private Integer humanResponses;
    /**
     * Number of leads represented by this Leadping customer analytics summary.
     */
    private Integer leads;
    /**
     * Compares a metric with the preceding period and reports its absolute and percentage change.
     */
    private AnalyticsComparison leadsComparison;
    /**
     * Median response minutes measured in minutes.
     */
    private Double medianResponseMinutes;
    /**
     * Number of calls missed during the reporting period.
     */
    private Integer missedCalls;
    /**
     * Number of missed leads represented by this Leadping customer analytics summary.
     */
    private Integer missedLeads;
    /**
     * Responses observed through this instant; min(report end plus five minutes, generation time).
     */
    private OffsetDateTime observedThrough;
    /**
     * Timely human responses divided by all mature eligible leads, including unanswered leads.
     */
    private Double overallFiveMinuteSlaPercent;
    /**
     * Received prospect messages excluding consent and help commands.
     */
    private Integer prospectReplies;
    /**
     * Conditional percentage: human responses within five minutes divided by responded leads only; not overall coverage.
     */
    private Double respondedWithinFiveMinutesPercent;
    /**
     * Non-deleted leads created in the cohort with a full five-minute observation window.
     */
    private Integer slaEligibleLeads;
    /**
     * Cohort leads younger than five minutes at ObservedThrough; excluded from SLA denominator.
     */
    private Integer slaPendingLeads;
    /**
     * Mature eligible leads with a human response within exactly five minutes.
     */
    private Integer slaTimelyLeads;
    /**
     * Mature eligible leads without a human response by ObservedThrough.
     */
    private Integer slaUnrespondedLeads;
    /**
     * Messages whose send execution started; queued and scheduled messages are excluded.
     */
    private Integer smsAttempted;
    /**
     * Messages confirmed delivered, counted at delivery time.
     */
    private Integer smsDelivered;
    /**
     * Number of SMS messages received during the reporting period.
     */
    private Integer smsReceived;
    /**
     * Provider-accepted outbound messages, counted at acceptance time (SmsSent is the compatibility field name).
     */
    private Integer smsSent;
    /**
     * Number of unread messages represented by this Leadping customer analytics summary.
     */
    private Integer unreadMessages;
    /**
     * Usage spend represented by this Leadping customer analytics summary.
     */
    private Double usageSpend;
    /**
     * Wallet balance represented by this Leadping customer analytics summary.
     */
    private Double walletBalance;
    /**
     * Current wallet status for this Leadping customer analytics summary.
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
     * Gets the averageResponseMinutes property value. Average time, in minutes, before a lead receives a response.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAverageResponseMinutes() {
        return this.averageResponseMinutes;
    }
    /**
     * Gets the billingStatus property value. Current billing status for this Leadping customer analytics summary.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBillingStatus() {
        return this.billingStatus;
    }
    /**
     * Gets the callMinutes property value. Total connected call duration, in minutes, during the reporting period.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getCallMinutes() {
        return this.callMinutes;
    }
    /**
     * Gets the callsPlaced property value. Number of outbound calls placed during the reporting period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCallsPlaced() {
        return this.callsPlaced;
    }
    /**
     * Gets the callsReceived property value. Number of inbound calls received during the reporting period.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(27);
        deserializerMap.put("averageResponseMinutes", (n) -> { this.setAverageResponseMinutes(n.getDoubleValue()); });
        deserializerMap.put("billingStatus", (n) -> { this.setBillingStatus(n.getStringValue()); });
        deserializerMap.put("callMinutes", (n) -> { this.setCallMinutes(n.getDoubleValue()); });
        deserializerMap.put("callsPlaced", (n) -> { this.setCallsPlaced(n.getIntegerValue()); });
        deserializerMap.put("callsReceived", (n) -> { this.setCallsReceived(n.getIntegerValue()); });
        deserializerMap.put("humanResponses", (n) -> { this.setHumanResponses(n.getIntegerValue()); });
        deserializerMap.put("leads", (n) -> { this.setLeads(n.getIntegerValue()); });
        deserializerMap.put("leadsComparison", (n) -> { this.setLeadsComparison(n.getObjectValue(AnalyticsComparison::createFromDiscriminatorValue)); });
        deserializerMap.put("medianResponseMinutes", (n) -> { this.setMedianResponseMinutes(n.getDoubleValue()); });
        deserializerMap.put("missedCalls", (n) -> { this.setMissedCalls(n.getIntegerValue()); });
        deserializerMap.put("missedLeads", (n) -> { this.setMissedLeads(n.getIntegerValue()); });
        deserializerMap.put("observedThrough", (n) -> { this.setObservedThrough(n.getOffsetDateTimeValue()); });
        deserializerMap.put("overallFiveMinuteSlaPercent", (n) -> { this.setOverallFiveMinuteSlaPercent(n.getDoubleValue()); });
        deserializerMap.put("prospectReplies", (n) -> { this.setProspectReplies(n.getIntegerValue()); });
        deserializerMap.put("respondedWithinFiveMinutesPercent", (n) -> { this.setRespondedWithinFiveMinutesPercent(n.getDoubleValue()); });
        deserializerMap.put("slaEligibleLeads", (n) -> { this.setSlaEligibleLeads(n.getIntegerValue()); });
        deserializerMap.put("slaPendingLeads", (n) -> { this.setSlaPendingLeads(n.getIntegerValue()); });
        deserializerMap.put("slaTimelyLeads", (n) -> { this.setSlaTimelyLeads(n.getIntegerValue()); });
        deserializerMap.put("slaUnrespondedLeads", (n) -> { this.setSlaUnrespondedLeads(n.getIntegerValue()); });
        deserializerMap.put("smsAttempted", (n) -> { this.setSmsAttempted(n.getIntegerValue()); });
        deserializerMap.put("smsDelivered", (n) -> { this.setSmsDelivered(n.getIntegerValue()); });
        deserializerMap.put("smsReceived", (n) -> { this.setSmsReceived(n.getIntegerValue()); });
        deserializerMap.put("smsSent", (n) -> { this.setSmsSent(n.getIntegerValue()); });
        deserializerMap.put("unreadMessages", (n) -> { this.setUnreadMessages(n.getIntegerValue()); });
        deserializerMap.put("usageSpend", (n) -> { this.setUsageSpend(n.getDoubleValue()); });
        deserializerMap.put("walletBalance", (n) -> { this.setWalletBalance(n.getDoubleValue()); });
        deserializerMap.put("walletStatus", (n) -> { this.setWalletStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the humanResponses property value. Manual provider-accepted SMS messages; automated messages are excluded.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHumanResponses() {
        return this.humanResponses;
    }
    /**
     * Gets the leads property value. Number of leads represented by this Leadping customer analytics summary.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLeads() {
        return this.leads;
    }
    /**
     * Gets the leadsComparison property value. Compares a metric with the preceding period and reports its absolute and percentage change.
     * @return a {@link AnalyticsComparison}
     */
    @jakarta.annotation.Nullable
    public AnalyticsComparison getLeadsComparison() {
        return this.leadsComparison;
    }
    /**
     * Gets the medianResponseMinutes property value. Median response minutes measured in minutes.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMedianResponseMinutes() {
        return this.medianResponseMinutes;
    }
    /**
     * Gets the missedCalls property value. Number of calls missed during the reporting period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMissedCalls() {
        return this.missedCalls;
    }
    /**
     * Gets the missedLeads property value. Number of missed leads represented by this Leadping customer analytics summary.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMissedLeads() {
        return this.missedLeads;
    }
    /**
     * Gets the observedThrough property value. Responses observed through this instant; min(report end plus five minutes, generation time).
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getObservedThrough() {
        return this.observedThrough;
    }
    /**
     * Gets the overallFiveMinuteSlaPercent property value. Timely human responses divided by all mature eligible leads, including unanswered leads.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getOverallFiveMinuteSlaPercent() {
        return this.overallFiveMinuteSlaPercent;
    }
    /**
     * Gets the prospectReplies property value. Received prospect messages excluding consent and help commands.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getProspectReplies() {
        return this.prospectReplies;
    }
    /**
     * Gets the respondedWithinFiveMinutesPercent property value. Conditional percentage: human responses within five minutes divided by responded leads only; not overall coverage.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getRespondedWithinFiveMinutesPercent() {
        return this.respondedWithinFiveMinutesPercent;
    }
    /**
     * Gets the slaEligibleLeads property value. Non-deleted leads created in the cohort with a full five-minute observation window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSlaEligibleLeads() {
        return this.slaEligibleLeads;
    }
    /**
     * Gets the slaPendingLeads property value. Cohort leads younger than five minutes at ObservedThrough; excluded from SLA denominator.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSlaPendingLeads() {
        return this.slaPendingLeads;
    }
    /**
     * Gets the slaTimelyLeads property value. Mature eligible leads with a human response within exactly five minutes.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSlaTimelyLeads() {
        return this.slaTimelyLeads;
    }
    /**
     * Gets the slaUnrespondedLeads property value. Mature eligible leads without a human response by ObservedThrough.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSlaUnrespondedLeads() {
        return this.slaUnrespondedLeads;
    }
    /**
     * Gets the smsAttempted property value. Messages whose send execution started; queued and scheduled messages are excluded.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsAttempted() {
        return this.smsAttempted;
    }
    /**
     * Gets the smsDelivered property value. Messages confirmed delivered, counted at delivery time.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsDelivered() {
        return this.smsDelivered;
    }
    /**
     * Gets the smsReceived property value. Number of SMS messages received during the reporting period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsReceived() {
        return this.smsReceived;
    }
    /**
     * Gets the smsSent property value. Provider-accepted outbound messages, counted at acceptance time (SmsSent is the compatibility field name).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsSent() {
        return this.smsSent;
    }
    /**
     * Gets the unreadMessages property value. Number of unread messages represented by this Leadping customer analytics summary.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnreadMessages() {
        return this.unreadMessages;
    }
    /**
     * Gets the usageSpend property value. Usage spend represented by this Leadping customer analytics summary.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getUsageSpend() {
        return this.usageSpend;
    }
    /**
     * Gets the walletBalance property value. Wallet balance represented by this Leadping customer analytics summary.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getWalletBalance() {
        return this.walletBalance;
    }
    /**
     * Gets the walletStatus property value. Current wallet status for this Leadping customer analytics summary.
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
        writer.writeDoubleValue("averageResponseMinutes", this.getAverageResponseMinutes());
        writer.writeStringValue("billingStatus", this.getBillingStatus());
        writer.writeDoubleValue("callMinutes", this.getCallMinutes());
        writer.writeIntegerValue("callsPlaced", this.getCallsPlaced());
        writer.writeIntegerValue("callsReceived", this.getCallsReceived());
        writer.writeIntegerValue("humanResponses", this.getHumanResponses());
        writer.writeIntegerValue("leads", this.getLeads());
        writer.writeObjectValue("leadsComparison", this.getLeadsComparison());
        writer.writeDoubleValue("medianResponseMinutes", this.getMedianResponseMinutes());
        writer.writeIntegerValue("missedCalls", this.getMissedCalls());
        writer.writeIntegerValue("missedLeads", this.getMissedLeads());
        writer.writeOffsetDateTimeValue("observedThrough", this.getObservedThrough());
        writer.writeDoubleValue("overallFiveMinuteSlaPercent", this.getOverallFiveMinuteSlaPercent());
        writer.writeIntegerValue("prospectReplies", this.getProspectReplies());
        writer.writeDoubleValue("respondedWithinFiveMinutesPercent", this.getRespondedWithinFiveMinutesPercent());
        writer.writeIntegerValue("slaEligibleLeads", this.getSlaEligibleLeads());
        writer.writeIntegerValue("slaPendingLeads", this.getSlaPendingLeads());
        writer.writeIntegerValue("slaTimelyLeads", this.getSlaTimelyLeads());
        writer.writeIntegerValue("slaUnrespondedLeads", this.getSlaUnrespondedLeads());
        writer.writeIntegerValue("smsAttempted", this.getSmsAttempted());
        writer.writeIntegerValue("smsDelivered", this.getSmsDelivered());
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
     * Sets the averageResponseMinutes property value. Average time, in minutes, before a lead receives a response.
     * @param value Value to set for the averageResponseMinutes property.
     */
    public void setAverageResponseMinutes(@jakarta.annotation.Nullable final Double value) {
        this.averageResponseMinutes = value;
    }
    /**
     * Sets the billingStatus property value. Current billing status for this Leadping customer analytics summary.
     * @param value Value to set for the billingStatus property.
     */
    public void setBillingStatus(@jakarta.annotation.Nullable final String value) {
        this.billingStatus = value;
    }
    /**
     * Sets the callMinutes property value. Total connected call duration, in minutes, during the reporting period.
     * @param value Value to set for the callMinutes property.
     */
    public void setCallMinutes(@jakarta.annotation.Nullable final Double value) {
        this.callMinutes = value;
    }
    /**
     * Sets the callsPlaced property value. Number of outbound calls placed during the reporting period.
     * @param value Value to set for the callsPlaced property.
     */
    public void setCallsPlaced(@jakarta.annotation.Nullable final Integer value) {
        this.callsPlaced = value;
    }
    /**
     * Sets the callsReceived property value. Number of inbound calls received during the reporting period.
     * @param value Value to set for the callsReceived property.
     */
    public void setCallsReceived(@jakarta.annotation.Nullable final Integer value) {
        this.callsReceived = value;
    }
    /**
     * Sets the humanResponses property value. Manual provider-accepted SMS messages; automated messages are excluded.
     * @param value Value to set for the humanResponses property.
     */
    public void setHumanResponses(@jakarta.annotation.Nullable final Integer value) {
        this.humanResponses = value;
    }
    /**
     * Sets the leads property value. Number of leads represented by this Leadping customer analytics summary.
     * @param value Value to set for the leads property.
     */
    public void setLeads(@jakarta.annotation.Nullable final Integer value) {
        this.leads = value;
    }
    /**
     * Sets the leadsComparison property value. Compares a metric with the preceding period and reports its absolute and percentage change.
     * @param value Value to set for the leadsComparison property.
     */
    public void setLeadsComparison(@jakarta.annotation.Nullable final AnalyticsComparison value) {
        this.leadsComparison = value;
    }
    /**
     * Sets the medianResponseMinutes property value. Median response minutes measured in minutes.
     * @param value Value to set for the medianResponseMinutes property.
     */
    public void setMedianResponseMinutes(@jakarta.annotation.Nullable final Double value) {
        this.medianResponseMinutes = value;
    }
    /**
     * Sets the missedCalls property value. Number of calls missed during the reporting period.
     * @param value Value to set for the missedCalls property.
     */
    public void setMissedCalls(@jakarta.annotation.Nullable final Integer value) {
        this.missedCalls = value;
    }
    /**
     * Sets the missedLeads property value. Number of missed leads represented by this Leadping customer analytics summary.
     * @param value Value to set for the missedLeads property.
     */
    public void setMissedLeads(@jakarta.annotation.Nullable final Integer value) {
        this.missedLeads = value;
    }
    /**
     * Sets the observedThrough property value. Responses observed through this instant; min(report end plus five minutes, generation time).
     * @param value Value to set for the observedThrough property.
     */
    public void setObservedThrough(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.observedThrough = value;
    }
    /**
     * Sets the overallFiveMinuteSlaPercent property value. Timely human responses divided by all mature eligible leads, including unanswered leads.
     * @param value Value to set for the overallFiveMinuteSlaPercent property.
     */
    public void setOverallFiveMinuteSlaPercent(@jakarta.annotation.Nullable final Double value) {
        this.overallFiveMinuteSlaPercent = value;
    }
    /**
     * Sets the prospectReplies property value. Received prospect messages excluding consent and help commands.
     * @param value Value to set for the prospectReplies property.
     */
    public void setProspectReplies(@jakarta.annotation.Nullable final Integer value) {
        this.prospectReplies = value;
    }
    /**
     * Sets the respondedWithinFiveMinutesPercent property value. Conditional percentage: human responses within five minutes divided by responded leads only; not overall coverage.
     * @param value Value to set for the respondedWithinFiveMinutesPercent property.
     */
    public void setRespondedWithinFiveMinutesPercent(@jakarta.annotation.Nullable final Double value) {
        this.respondedWithinFiveMinutesPercent = value;
    }
    /**
     * Sets the slaEligibleLeads property value. Non-deleted leads created in the cohort with a full five-minute observation window.
     * @param value Value to set for the slaEligibleLeads property.
     */
    public void setSlaEligibleLeads(@jakarta.annotation.Nullable final Integer value) {
        this.slaEligibleLeads = value;
    }
    /**
     * Sets the slaPendingLeads property value. Cohort leads younger than five minutes at ObservedThrough; excluded from SLA denominator.
     * @param value Value to set for the slaPendingLeads property.
     */
    public void setSlaPendingLeads(@jakarta.annotation.Nullable final Integer value) {
        this.slaPendingLeads = value;
    }
    /**
     * Sets the slaTimelyLeads property value. Mature eligible leads with a human response within exactly five minutes.
     * @param value Value to set for the slaTimelyLeads property.
     */
    public void setSlaTimelyLeads(@jakarta.annotation.Nullable final Integer value) {
        this.slaTimelyLeads = value;
    }
    /**
     * Sets the slaUnrespondedLeads property value. Mature eligible leads without a human response by ObservedThrough.
     * @param value Value to set for the slaUnrespondedLeads property.
     */
    public void setSlaUnrespondedLeads(@jakarta.annotation.Nullable final Integer value) {
        this.slaUnrespondedLeads = value;
    }
    /**
     * Sets the smsAttempted property value. Messages whose send execution started; queued and scheduled messages are excluded.
     * @param value Value to set for the smsAttempted property.
     */
    public void setSmsAttempted(@jakarta.annotation.Nullable final Integer value) {
        this.smsAttempted = value;
    }
    /**
     * Sets the smsDelivered property value. Messages confirmed delivered, counted at delivery time.
     * @param value Value to set for the smsDelivered property.
     */
    public void setSmsDelivered(@jakarta.annotation.Nullable final Integer value) {
        this.smsDelivered = value;
    }
    /**
     * Sets the smsReceived property value. Number of SMS messages received during the reporting period.
     * @param value Value to set for the smsReceived property.
     */
    public void setSmsReceived(@jakarta.annotation.Nullable final Integer value) {
        this.smsReceived = value;
    }
    /**
     * Sets the smsSent property value. Provider-accepted outbound messages, counted at acceptance time (SmsSent is the compatibility field name).
     * @param value Value to set for the smsSent property.
     */
    public void setSmsSent(@jakarta.annotation.Nullable final Integer value) {
        this.smsSent = value;
    }
    /**
     * Sets the unreadMessages property value. Number of unread messages represented by this Leadping customer analytics summary.
     * @param value Value to set for the unreadMessages property.
     */
    public void setUnreadMessages(@jakarta.annotation.Nullable final Integer value) {
        this.unreadMessages = value;
    }
    /**
     * Sets the usageSpend property value. Usage spend represented by this Leadping customer analytics summary.
     * @param value Value to set for the usageSpend property.
     */
    public void setUsageSpend(@jakarta.annotation.Nullable final Double value) {
        this.usageSpend = value;
    }
    /**
     * Sets the walletBalance property value. Wallet balance represented by this Leadping customer analytics summary.
     * @param value Value to set for the walletBalance property.
     */
    public void setWalletBalance(@jakarta.annotation.Nullable final Double value) {
        this.walletBalance = value;
    }
    /**
     * Sets the walletStatus property value. Current wallet status for this Leadping customer analytics summary.
     * @param value Value to set for the walletStatus property.
     */
    public void setWalletStatus(@jakarta.annotation.Nullable final String value) {
        this.walletStatus = value;
    }
}
