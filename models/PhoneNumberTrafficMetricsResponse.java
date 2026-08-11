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
 * Describes phone number traffic metrics data returned by Leadping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberTrafficMetricsResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of outbound calls that connected during this metrics window.
     */
    private UntypedNode callConnectedCount;
    /**
     * Number of outbound calls that failed during this metrics window.
     */
    private UntypedNode callFailedCount;
    /**
     * Number of outbound calls that failed because the destination number was invalid during this metrics window.
     */
    private UntypedNode callInvalidNumberCount;
    /**
     * Number of outbound calls placed during this metrics window.
     */
    private UntypedNode callPlacedCount;
    /**
     * Number of connected outbound calls shorter than 30 seconds during this metrics window.
     */
    private UntypedNode callShortCount;
    /**
     * Number of MMS messages that failed during this metrics window.
     */
    private UntypedNode mmsFailedCount;
    /**
     * Number of MMS messages sent during this metrics window.
     */
    private UntypedNode mmsSentCount;
    /**
     * Number of SMS messages that failed during this metrics window.
     */
    private UntypedNode smsFailedCount;
    /**
     * Number of SMS messages sent during this metrics window.
     */
    private UntypedNode smsSentCount;
    /**
     * Time-series buckets that show how the metric changes across the reporting window.
     */
    private java.util.List<PhoneNumberTrafficTrendPoint> trend;
    /**
     * Number of days included in the metrics reporting window.
     */
    private UntypedNode windowDays;
    /**
     * UTC timestamp when the metrics reporting window starts.
     */
    private OffsetDateTime windowStartedAt;
    /**
     * Instantiates a new {@link PhoneNumberTrafficMetricsResponse} and sets the default values.
     */
    public PhoneNumberTrafficMetricsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberTrafficMetricsResponse}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberTrafficMetricsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberTrafficMetricsResponse();
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
     * Gets the callConnectedCount property value. Number of outbound calls that connected during this metrics window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCallConnectedCount() {
        return this.callConnectedCount;
    }
    /**
     * Gets the callFailedCount property value. Number of outbound calls that failed during this metrics window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCallFailedCount() {
        return this.callFailedCount;
    }
    /**
     * Gets the callInvalidNumberCount property value. Number of outbound calls that failed because the destination number was invalid during this metrics window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCallInvalidNumberCount() {
        return this.callInvalidNumberCount;
    }
    /**
     * Gets the callPlacedCount property value. Number of outbound calls placed during this metrics window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCallPlacedCount() {
        return this.callPlacedCount;
    }
    /**
     * Gets the callShortCount property value. Number of connected outbound calls shorter than 30 seconds during this metrics window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCallShortCount() {
        return this.callShortCount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("callConnectedCount", (n) -> { this.setCallConnectedCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("callFailedCount", (n) -> { this.setCallFailedCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("callInvalidNumberCount", (n) -> { this.setCallInvalidNumberCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("callPlacedCount", (n) -> { this.setCallPlacedCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("callShortCount", (n) -> { this.setCallShortCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("mmsFailedCount", (n) -> { this.setMmsFailedCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("mmsSentCount", (n) -> { this.setMmsSentCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("smsFailedCount", (n) -> { this.setSmsFailedCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("smsSentCount", (n) -> { this.setSmsSentCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("trend", (n) -> { this.setTrend(n.getCollectionOfObjectValues(PhoneNumberTrafficTrendPoint::createFromDiscriminatorValue)); });
        deserializerMap.put("windowDays", (n) -> { this.setWindowDays(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("windowStartedAt", (n) -> { this.setWindowStartedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mmsFailedCount property value. Number of MMS messages that failed during this metrics window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getMmsFailedCount() {
        return this.mmsFailedCount;
    }
    /**
     * Gets the mmsSentCount property value. Number of MMS messages sent during this metrics window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getMmsSentCount() {
        return this.mmsSentCount;
    }
    /**
     * Gets the smsFailedCount property value. Number of SMS messages that failed during this metrics window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getSmsFailedCount() {
        return this.smsFailedCount;
    }
    /**
     * Gets the smsSentCount property value. Number of SMS messages sent during this metrics window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getSmsSentCount() {
        return this.smsSentCount;
    }
    /**
     * Gets the trend property value. Time-series buckets that show how the metric changes across the reporting window.
     * @return a {@link java.util.List<PhoneNumberTrafficTrendPoint>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PhoneNumberTrafficTrendPoint> getTrend() {
        return this.trend;
    }
    /**
     * Gets the windowDays property value. Number of days included in the metrics reporting window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getWindowDays() {
        return this.windowDays;
    }
    /**
     * Gets the windowStartedAt property value. UTC timestamp when the metrics reporting window starts.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getWindowStartedAt() {
        return this.windowStartedAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("callConnectedCount", this.getCallConnectedCount());
        writer.writeObjectValue("callFailedCount", this.getCallFailedCount());
        writer.writeObjectValue("callInvalidNumberCount", this.getCallInvalidNumberCount());
        writer.writeObjectValue("callPlacedCount", this.getCallPlacedCount());
        writer.writeObjectValue("callShortCount", this.getCallShortCount());
        writer.writeObjectValue("mmsFailedCount", this.getMmsFailedCount());
        writer.writeObjectValue("mmsSentCount", this.getMmsSentCount());
        writer.writeObjectValue("smsFailedCount", this.getSmsFailedCount());
        writer.writeObjectValue("smsSentCount", this.getSmsSentCount());
        writer.writeCollectionOfObjectValues("trend", this.getTrend());
        writer.writeObjectValue("windowDays", this.getWindowDays());
        writer.writeOffsetDateTimeValue("windowStartedAt", this.getWindowStartedAt());
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
     * Sets the callConnectedCount property value. Number of outbound calls that connected during this metrics window.
     * @param value Value to set for the callConnectedCount property.
     */
    public void setCallConnectedCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.callConnectedCount = value;
    }
    /**
     * Sets the callFailedCount property value. Number of outbound calls that failed during this metrics window.
     * @param value Value to set for the callFailedCount property.
     */
    public void setCallFailedCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.callFailedCount = value;
    }
    /**
     * Sets the callInvalidNumberCount property value. Number of outbound calls that failed because the destination number was invalid during this metrics window.
     * @param value Value to set for the callInvalidNumberCount property.
     */
    public void setCallInvalidNumberCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.callInvalidNumberCount = value;
    }
    /**
     * Sets the callPlacedCount property value. Number of outbound calls placed during this metrics window.
     * @param value Value to set for the callPlacedCount property.
     */
    public void setCallPlacedCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.callPlacedCount = value;
    }
    /**
     * Sets the callShortCount property value. Number of connected outbound calls shorter than 30 seconds during this metrics window.
     * @param value Value to set for the callShortCount property.
     */
    public void setCallShortCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.callShortCount = value;
    }
    /**
     * Sets the mmsFailedCount property value. Number of MMS messages that failed during this metrics window.
     * @param value Value to set for the mmsFailedCount property.
     */
    public void setMmsFailedCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.mmsFailedCount = value;
    }
    /**
     * Sets the mmsSentCount property value. Number of MMS messages sent during this metrics window.
     * @param value Value to set for the mmsSentCount property.
     */
    public void setMmsSentCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.mmsSentCount = value;
    }
    /**
     * Sets the smsFailedCount property value. Number of SMS messages that failed during this metrics window.
     * @param value Value to set for the smsFailedCount property.
     */
    public void setSmsFailedCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.smsFailedCount = value;
    }
    /**
     * Sets the smsSentCount property value. Number of SMS messages sent during this metrics window.
     * @param value Value to set for the smsSentCount property.
     */
    public void setSmsSentCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.smsSentCount = value;
    }
    /**
     * Sets the trend property value. Time-series buckets that show how the metric changes across the reporting window.
     * @param value Value to set for the trend property.
     */
    public void setTrend(@jakarta.annotation.Nullable final java.util.List<PhoneNumberTrafficTrendPoint> value) {
        this.trend = value;
    }
    /**
     * Sets the windowDays property value. Number of days included in the metrics reporting window.
     * @param value Value to set for the windowDays property.
     */
    public void setWindowDays(@jakarta.annotation.Nullable final UntypedNode value) {
        this.windowDays = value;
    }
    /**
     * Sets the windowStartedAt property value. UTC timestamp when the metrics reporting window starts.
     * @param value Value to set for the windowStartedAt property.
     */
    public void setWindowStartedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.windowStartedAt = value;
    }
}
