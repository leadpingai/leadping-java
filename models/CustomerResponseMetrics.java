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
 * Response metrics associated with this Leadping customer analytics.
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
    private UntypedNode averageMinutes;
    /**
     * Collection of average minutes trend included with this Leadping customer response metrics.
     */
    private java.util.List<AnalyticsTrendPointOfdecimal> averageMinutesTrend;
    /**
     * Median minutes measured in minutes.
     */
    private UntypedNode medianMinutes;
    /**
     * Number of calls missed during the reporting period.
     */
    private Integer missedCalls;
    /**
     * Number of responded leads represented by this Leadping customer response metrics.
     */
    private Integer respondedLeads;
    /**
     * Responded within five minutes percent expressed as a percentage.
     */
    private Double respondedWithinFiveMinutesPercent;
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
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAverageMinutes() {
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("averageMinutes", (n) -> { this.setAverageMinutes(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("averageMinutesTrend", (n) -> { this.setAverageMinutesTrend(n.getCollectionOfObjectValues(AnalyticsTrendPointOfdecimal::createFromDiscriminatorValue)); });
        deserializerMap.put("medianMinutes", (n) -> { this.setMedianMinutes(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("missedCalls", (n) -> { this.setMissedCalls(n.getIntegerValue()); });
        deserializerMap.put("respondedLeads", (n) -> { this.setRespondedLeads(n.getIntegerValue()); });
        deserializerMap.put("respondedWithinFiveMinutesPercent", (n) -> { this.setRespondedWithinFiveMinutesPercent(n.getDoubleValue()); });
        deserializerMap.put("unreadMessages", (n) -> { this.setUnreadMessages(n.getIntegerValue()); });
        deserializerMap.put("unrespondedLeads", (n) -> { this.setUnrespondedLeads(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the medianMinutes property value. Median minutes measured in minutes.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getMedianMinutes() {
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
     * Gets the respondedLeads property value. Number of responded leads represented by this Leadping customer response metrics.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRespondedLeads() {
        return this.respondedLeads;
    }
    /**
     * Gets the respondedWithinFiveMinutesPercent property value. Responded within five minutes percent expressed as a percentage.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getRespondedWithinFiveMinutesPercent() {
        return this.respondedWithinFiveMinutesPercent;
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
        writer.writeObjectValue("averageMinutes", this.getAverageMinutes());
        writer.writeCollectionOfObjectValues("averageMinutesTrend", this.getAverageMinutesTrend());
        writer.writeObjectValue("medianMinutes", this.getMedianMinutes());
        writer.writeIntegerValue("missedCalls", this.getMissedCalls());
        writer.writeIntegerValue("respondedLeads", this.getRespondedLeads());
        writer.writeDoubleValue("respondedWithinFiveMinutesPercent", this.getRespondedWithinFiveMinutesPercent());
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
    public void setAverageMinutes(@jakarta.annotation.Nullable final UntypedNode value) {
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
     * Sets the medianMinutes property value. Median minutes measured in minutes.
     * @param value Value to set for the medianMinutes property.
     */
    public void setMedianMinutes(@jakarta.annotation.Nullable final UntypedNode value) {
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
     * Sets the respondedLeads property value. Number of responded leads represented by this Leadping customer response metrics.
     * @param value Value to set for the respondedLeads property.
     */
    public void setRespondedLeads(@jakarta.annotation.Nullable final Integer value) {
        this.respondedLeads = value;
    }
    /**
     * Sets the respondedWithinFiveMinutesPercent property value. Responded within five minutes percent expressed as a percentage.
     * @param value Value to set for the respondedWithinFiveMinutesPercent property.
     */
    public void setRespondedWithinFiveMinutesPercent(@jakarta.annotation.Nullable final Double value) {
        this.respondedWithinFiveMinutesPercent = value;
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
