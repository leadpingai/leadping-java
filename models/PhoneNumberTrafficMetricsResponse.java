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
 * Response schema for the Leadping API phone number traffic metrics response returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberTrafficMetricsResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of outbound calls that failed during this metrics window.
     */
    private Integer callFailedCount;
    /**
     * Number of outbound calls placed during this metrics window.
     */
    private Integer callPlacedCount;
    /**
     * Number of SMS messages that failed during this metrics window.
     */
    private Integer smsFailedCount;
    /**
     * Number of SMS messages sent during this metrics window.
     */
    private Integer smsSentCount;
    /**
     * Time-series buckets that show how the metric changes across the reporting window.
     */
    private java.util.List<PhoneNumberTrafficTrendPoint> trend;
    /**
     * Number of days included in the metrics reporting window.
     */
    private Integer windowDays;
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
     * Gets the callFailedCount property value. Number of outbound calls that failed during this metrics window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCallFailedCount() {
        return this.callFailedCount;
    }
    /**
     * Gets the callPlacedCount property value. Number of outbound calls placed during this metrics window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCallPlacedCount() {
        return this.callPlacedCount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("callFailedCount", (n) -> { this.setCallFailedCount(n.getIntegerValue()); });
        deserializerMap.put("callPlacedCount", (n) -> { this.setCallPlacedCount(n.getIntegerValue()); });
        deserializerMap.put("smsFailedCount", (n) -> { this.setSmsFailedCount(n.getIntegerValue()); });
        deserializerMap.put("smsSentCount", (n) -> { this.setSmsSentCount(n.getIntegerValue()); });
        deserializerMap.put("trend", (n) -> { this.setTrend(n.getCollectionOfObjectValues(PhoneNumberTrafficTrendPoint::createFromDiscriminatorValue)); });
        deserializerMap.put("windowDays", (n) -> { this.setWindowDays(n.getIntegerValue()); });
        deserializerMap.put("windowStartedAt", (n) -> { this.setWindowStartedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the smsFailedCount property value. Number of SMS messages that failed during this metrics window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsFailedCount() {
        return this.smsFailedCount;
    }
    /**
     * Gets the smsSentCount property value. Number of SMS messages sent during this metrics window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsSentCount() {
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
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWindowDays() {
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
        writer.writeIntegerValue("callFailedCount", this.getCallFailedCount());
        writer.writeIntegerValue("callPlacedCount", this.getCallPlacedCount());
        writer.writeIntegerValue("smsFailedCount", this.getSmsFailedCount());
        writer.writeIntegerValue("smsSentCount", this.getSmsSentCount());
        writer.writeCollectionOfObjectValues("trend", this.getTrend());
        writer.writeIntegerValue("windowDays", this.getWindowDays());
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
     * Sets the callFailedCount property value. Number of outbound calls that failed during this metrics window.
     * @param value Value to set for the callFailedCount property.
     */
    public void setCallFailedCount(@jakarta.annotation.Nullable final Integer value) {
        this.callFailedCount = value;
    }
    /**
     * Sets the callPlacedCount property value. Number of outbound calls placed during this metrics window.
     * @param value Value to set for the callPlacedCount property.
     */
    public void setCallPlacedCount(@jakarta.annotation.Nullable final Integer value) {
        this.callPlacedCount = value;
    }
    /**
     * Sets the smsFailedCount property value. Number of SMS messages that failed during this metrics window.
     * @param value Value to set for the smsFailedCount property.
     */
    public void setSmsFailedCount(@jakarta.annotation.Nullable final Integer value) {
        this.smsFailedCount = value;
    }
    /**
     * Sets the smsSentCount property value. Number of SMS messages sent during this metrics window.
     * @param value Value to set for the smsSentCount property.
     */
    public void setSmsSentCount(@jakarta.annotation.Nullable final Integer value) {
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
    public void setWindowDays(@jakarta.annotation.Nullable final Integer value) {
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
