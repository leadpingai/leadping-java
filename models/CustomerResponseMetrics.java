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
 * Measures how quickly and consistently an organization responds to leads across supported communication channels.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerResponseMetrics implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Average minutes measured in minutes.
     */
    private Double averageMinutes;
    /**
     * Collection of average minutes trend included with this Leadping customer response metrics.
     */
    private java.util.List<AnalyticsTrendPointOfdecimal> averageMinutesTrend;
    /**
     * Exclusive cohort end.
     */
    private OffsetDateTime cohortEndAt;
    /**
     * Inclusive cohort start.
     */
    private OffsetDateTime cohortStartAt;
    /**
     * Median minutes measured in minutes.
     */
    private Double medianMinutes;
    /**
     * Number of calls missed during the reporting period.
     */
    private Integer missedCalls;
    /**
     * Responses observed through this instant; min(report end plus five minutes, generation time).
     */
    private OffsetDateTime observedThrough;
    /**
     * Timely human responses divided by all mature eligible leads, including unanswered leads.
     */
    private Double overallFiveMinuteSlaPercent;
    /**
     * Number of responded leads represented by this Leadping customer response metrics.
     */
    private Integer respondedLeads;
    /**
     * Conditional percentage: human responses within five minutes divided by responded leads only; not overall coverage.
     */
    private Double respondedWithinFiveMinutesPercent;
    /**
     * Shared definition used in charts and exports.
     */
    private String responseDefinition;
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
     * Cohort SLA counts and coverage by lead creation bucket.
     */
    private java.util.List<CustomerResponseSlaPoint> slaTrend;
    /**
     * Mature eligible leads without a human response by ObservedThrough.
     */
    private Integer slaUnrespondedLeads;
    /**
     * Number of unread messages represented by this Leadping customer response metrics.
     */
    private Integer unreadMessages;
    /**
     * Number of unresponded leads represented by this Leadping customer response metrics.
     */
    private Integer unrespondedLeads;
    /**
     * Instantiates a new {@link CustomerResponseMetrics} and sets the default values.
     */
    public CustomerResponseMetrics() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerResponseMetrics}
     */
    @jakarta.annotation.Nonnull
    public static CustomerResponseMetrics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerResponseMetrics();
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
     * Gets the averageMinutes property value. Average minutes measured in minutes.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getAverageMinutes() {
        return this.averageMinutes;
    }
    /**
     * Gets the averageMinutesTrend property value. Collection of average minutes trend included with this Leadping customer response metrics.
     * @return a {@link java.util.List<AnalyticsTrendPointOfdecimal>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AnalyticsTrendPointOfdecimal> getAverageMinutesTrend() {
        return this.averageMinutesTrend;
    }
    /**
     * Gets the cohortEndAt property value. Exclusive cohort end.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCohortEndAt() {
        return this.cohortEndAt;
    }
    /**
     * Gets the cohortStartAt property value. Inclusive cohort start.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCohortStartAt() {
        return this.cohortStartAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("averageMinutes", (n) -> { this.setAverageMinutes(n.getDoubleValue()); });
        deserializerMap.put("averageMinutesTrend", (n) -> { this.setAverageMinutesTrend(n.getCollectionOfObjectValues(AnalyticsTrendPointOfdecimal::createFromDiscriminatorValue)); });
        deserializerMap.put("cohortEndAt", (n) -> { this.setCohortEndAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("cohortStartAt", (n) -> { this.setCohortStartAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("medianMinutes", (n) -> { this.setMedianMinutes(n.getDoubleValue()); });
        deserializerMap.put("missedCalls", (n) -> { this.setMissedCalls(n.getIntegerValue()); });
        deserializerMap.put("observedThrough", (n) -> { this.setObservedThrough(n.getOffsetDateTimeValue()); });
        deserializerMap.put("overallFiveMinuteSlaPercent", (n) -> { this.setOverallFiveMinuteSlaPercent(n.getDoubleValue()); });
        deserializerMap.put("respondedLeads", (n) -> { this.setRespondedLeads(n.getIntegerValue()); });
        deserializerMap.put("respondedWithinFiveMinutesPercent", (n) -> { this.setRespondedWithinFiveMinutesPercent(n.getDoubleValue()); });
        deserializerMap.put("responseDefinition", (n) -> { this.setResponseDefinition(n.getStringValue()); });
        deserializerMap.put("slaEligibleLeads", (n) -> { this.setSlaEligibleLeads(n.getIntegerValue()); });
        deserializerMap.put("slaPendingLeads", (n) -> { this.setSlaPendingLeads(n.getIntegerValue()); });
        deserializerMap.put("slaTimelyLeads", (n) -> { this.setSlaTimelyLeads(n.getIntegerValue()); });
        deserializerMap.put("slaTrend", (n) -> { this.setSlaTrend(n.getCollectionOfObjectValues(CustomerResponseSlaPoint::createFromDiscriminatorValue)); });
        deserializerMap.put("slaUnrespondedLeads", (n) -> { this.setSlaUnrespondedLeads(n.getIntegerValue()); });
        deserializerMap.put("unreadMessages", (n) -> { this.setUnreadMessages(n.getIntegerValue()); });
        deserializerMap.put("unrespondedLeads", (n) -> { this.setUnrespondedLeads(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the medianMinutes property value. Median minutes measured in minutes.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMedianMinutes() {
        return this.medianMinutes;
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
     * Gets the respondedLeads property value. Number of responded leads represented by this Leadping customer response metrics.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRespondedLeads() {
        return this.respondedLeads;
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
     * Gets the responseDefinition property value. Shared definition used in charts and exports.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResponseDefinition() {
        return this.responseDefinition;
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
     * Gets the slaTrend property value. Cohort SLA counts and coverage by lead creation bucket.
     * @return a {@link java.util.List<CustomerResponseSlaPoint>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomerResponseSlaPoint> getSlaTrend() {
        return this.slaTrend;
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
     * Gets the unreadMessages property value. Number of unread messages represented by this Leadping customer response metrics.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnreadMessages() {
        return this.unreadMessages;
    }
    /**
     * Gets the unrespondedLeads property value. Number of unresponded leads represented by this Leadping customer response metrics.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUnrespondedLeads() {
        return this.unrespondedLeads;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("averageMinutes", this.getAverageMinutes());
        writer.writeCollectionOfObjectValues("averageMinutesTrend", this.getAverageMinutesTrend());
        writer.writeOffsetDateTimeValue("cohortEndAt", this.getCohortEndAt());
        writer.writeOffsetDateTimeValue("cohortStartAt", this.getCohortStartAt());
        writer.writeDoubleValue("medianMinutes", this.getMedianMinutes());
        writer.writeIntegerValue("missedCalls", this.getMissedCalls());
        writer.writeOffsetDateTimeValue("observedThrough", this.getObservedThrough());
        writer.writeDoubleValue("overallFiveMinuteSlaPercent", this.getOverallFiveMinuteSlaPercent());
        writer.writeIntegerValue("respondedLeads", this.getRespondedLeads());
        writer.writeDoubleValue("respondedWithinFiveMinutesPercent", this.getRespondedWithinFiveMinutesPercent());
        writer.writeStringValue("responseDefinition", this.getResponseDefinition());
        writer.writeIntegerValue("slaEligibleLeads", this.getSlaEligibleLeads());
        writer.writeIntegerValue("slaPendingLeads", this.getSlaPendingLeads());
        writer.writeIntegerValue("slaTimelyLeads", this.getSlaTimelyLeads());
        writer.writeCollectionOfObjectValues("slaTrend", this.getSlaTrend());
        writer.writeIntegerValue("slaUnrespondedLeads", this.getSlaUnrespondedLeads());
        writer.writeIntegerValue("unreadMessages", this.getUnreadMessages());
        writer.writeIntegerValue("unrespondedLeads", this.getUnrespondedLeads());
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
     * Sets the averageMinutes property value. Average minutes measured in minutes.
     * @param value Value to set for the averageMinutes property.
     */
    public void setAverageMinutes(@jakarta.annotation.Nullable final Double value) {
        this.averageMinutes = value;
    }
    /**
     * Sets the averageMinutesTrend property value. Collection of average minutes trend included with this Leadping customer response metrics.
     * @param value Value to set for the averageMinutesTrend property.
     */
    public void setAverageMinutesTrend(@jakarta.annotation.Nullable final java.util.List<AnalyticsTrendPointOfdecimal> value) {
        this.averageMinutesTrend = value;
    }
    /**
     * Sets the cohortEndAt property value. Exclusive cohort end.
     * @param value Value to set for the cohortEndAt property.
     */
    public void setCohortEndAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.cohortEndAt = value;
    }
    /**
     * Sets the cohortStartAt property value. Inclusive cohort start.
     * @param value Value to set for the cohortStartAt property.
     */
    public void setCohortStartAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.cohortStartAt = value;
    }
    /**
     * Sets the medianMinutes property value. Median minutes measured in minutes.
     * @param value Value to set for the medianMinutes property.
     */
    public void setMedianMinutes(@jakarta.annotation.Nullable final Double value) {
        this.medianMinutes = value;
    }
    /**
     * Sets the missedCalls property value. Number of calls missed during the reporting period.
     * @param value Value to set for the missedCalls property.
     */
    public void setMissedCalls(@jakarta.annotation.Nullable final Integer value) {
        this.missedCalls = value;
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
     * Sets the respondedLeads property value. Number of responded leads represented by this Leadping customer response metrics.
     * @param value Value to set for the respondedLeads property.
     */
    public void setRespondedLeads(@jakarta.annotation.Nullable final Integer value) {
        this.respondedLeads = value;
    }
    /**
     * Sets the respondedWithinFiveMinutesPercent property value. Conditional percentage: human responses within five minutes divided by responded leads only; not overall coverage.
     * @param value Value to set for the respondedWithinFiveMinutesPercent property.
     */
    public void setRespondedWithinFiveMinutesPercent(@jakarta.annotation.Nullable final Double value) {
        this.respondedWithinFiveMinutesPercent = value;
    }
    /**
     * Sets the responseDefinition property value. Shared definition used in charts and exports.
     * @param value Value to set for the responseDefinition property.
     */
    public void setResponseDefinition(@jakarta.annotation.Nullable final String value) {
        this.responseDefinition = value;
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
     * Sets the slaTrend property value. Cohort SLA counts and coverage by lead creation bucket.
     * @param value Value to set for the slaTrend property.
     */
    public void setSlaTrend(@jakarta.annotation.Nullable final java.util.List<CustomerResponseSlaPoint> value) {
        this.slaTrend = value;
    }
    /**
     * Sets the slaUnrespondedLeads property value. Mature eligible leads without a human response by ObservedThrough.
     * @param value Value to set for the slaUnrespondedLeads property.
     */
    public void setSlaUnrespondedLeads(@jakarta.annotation.Nullable final Integer value) {
        this.slaUnrespondedLeads = value;
    }
    /**
     * Sets the unreadMessages property value. Number of unread messages represented by this Leadping customer response metrics.
     * @param value Value to set for the unreadMessages property.
     */
    public void setUnreadMessages(@jakarta.annotation.Nullable final Integer value) {
        this.unreadMessages = value;
    }
    /**
     * Sets the unrespondedLeads property value. Number of unresponded leads represented by this Leadping customer response metrics.
     * @param value Value to set for the unrespondedLeads property.
     */
    public void setUnrespondedLeads(@jakarta.annotation.Nullable final Integer value) {
        this.unrespondedLeads = value;
    }
}
