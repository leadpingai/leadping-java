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
 * Response schema for the Leadping API phone number opt-out metrics response returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberOptOutMetricsResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of distinct recipients contacted during this metrics window.
     */
    private Integer distinctContactedCount;
    /**
     * Number of recipients who opted out during this metrics window.
     */
    private Integer optOutCount;
    /**
     * Percentage of contacted recipients who opted out during this metrics window.
     */
    private Double optOutRatePercent;
    /**
     * Number of days included in the metrics reporting window.
     */
    private Integer windowDays;
    /**
     * UTC timestamp when the metrics reporting window starts.
     */
    private OffsetDateTime windowStartedAt;
    /**
     * Instantiates a new {@link PhoneNumberOptOutMetricsResponse} and sets the default values.
     */
    public PhoneNumberOptOutMetricsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberOptOutMetricsResponse}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberOptOutMetricsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberOptOutMetricsResponse();
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
     * Gets the distinctContactedCount property value. Number of distinct recipients contacted during this metrics window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDistinctContactedCount() {
        return this.distinctContactedCount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("distinctContactedCount", (n) -> { this.setDistinctContactedCount(n.getIntegerValue()); });
        deserializerMap.put("optOutCount", (n) -> { this.setOptOutCount(n.getIntegerValue()); });
        deserializerMap.put("optOutRatePercent", (n) -> { this.setOptOutRatePercent(n.getDoubleValue()); });
        deserializerMap.put("windowDays", (n) -> { this.setWindowDays(n.getIntegerValue()); });
        deserializerMap.put("windowStartedAt", (n) -> { this.setWindowStartedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the optOutCount property value. Number of recipients who opted out during this metrics window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOptOutCount() {
        return this.optOutCount;
    }
    /**
     * Gets the optOutRatePercent property value. Percentage of contacted recipients who opted out during this metrics window.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getOptOutRatePercent() {
        return this.optOutRatePercent;
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
        writer.writeIntegerValue("distinctContactedCount", this.getDistinctContactedCount());
        writer.writeIntegerValue("optOutCount", this.getOptOutCount());
        writer.writeDoubleValue("optOutRatePercent", this.getOptOutRatePercent());
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
     * Sets the distinctContactedCount property value. Number of distinct recipients contacted during this metrics window.
     * @param value Value to set for the distinctContactedCount property.
     */
    public void setDistinctContactedCount(@jakarta.annotation.Nullable final Integer value) {
        this.distinctContactedCount = value;
    }
    /**
     * Sets the optOutCount property value. Number of recipients who opted out during this metrics window.
     * @param value Value to set for the optOutCount property.
     */
    public void setOptOutCount(@jakarta.annotation.Nullable final Integer value) {
        this.optOutCount = value;
    }
    /**
     * Sets the optOutRatePercent property value. Percentage of contacted recipients who opted out during this metrics window.
     * @param value Value to set for the optOutRatePercent property.
     */
    public void setOptOutRatePercent(@jakarta.annotation.Nullable final Double value) {
        this.optOutRatePercent = value;
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
