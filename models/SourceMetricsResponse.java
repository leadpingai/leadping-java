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
 * Response model containing source metrics data returned by the Leadping API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SourceMetricsResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Date and time when the source metrics was generated.
     */
    private OffsetDateTime generatedAt;
    /**
     * Collection of points included with this Leadping source metrics.
     */
    private java.util.List<AnalyticsTrendPointOfint> points;
    /**
     * Range associated with this Leadping source metrics.
     */
    private AnalyticsDateRange range;
    /**
     * Total number of leads records represented by this Leadping source metrics.
     */
    private Integer totalLeads;
    /**
     * Instantiates a new {@link SourceMetricsResponse} and sets the default values.
     */
    public SourceMetricsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SourceMetricsResponse}
     */
    @jakarta.annotation.Nonnull
    public static SourceMetricsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SourceMetricsResponse();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("generatedAt", (n) -> { this.setGeneratedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("points", (n) -> { this.setPoints(n.getCollectionOfObjectValues(AnalyticsTrendPointOfint::createFromDiscriminatorValue)); });
        deserializerMap.put("range", (n) -> { this.setRange(n.getObjectValue(AnalyticsDateRange::createFromDiscriminatorValue)); });
        deserializerMap.put("totalLeads", (n) -> { this.setTotalLeads(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the generatedAt property value. Date and time when the source metrics was generated.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getGeneratedAt() {
        return this.generatedAt;
    }
    /**
     * Gets the points property value. Collection of points included with this Leadping source metrics.
     * @return a {@link java.util.List<AnalyticsTrendPointOfint>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AnalyticsTrendPointOfint> getPoints() {
        return this.points;
    }
    /**
     * Gets the range property value. Range associated with this Leadping source metrics.
     * @return a {@link AnalyticsDateRange}
     */
    @jakarta.annotation.Nullable
    public AnalyticsDateRange getRange() {
        return this.range;
    }
    /**
     * Gets the totalLeads property value. Total number of leads records represented by this Leadping source metrics.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLeads() {
        return this.totalLeads;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("generatedAt", this.getGeneratedAt());
        writer.writeCollectionOfObjectValues("points", this.getPoints());
        writer.writeObjectValue("range", this.getRange());
        writer.writeIntegerValue("totalLeads", this.getTotalLeads());
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
     * Sets the generatedAt property value. Date and time when the source metrics was generated.
     * @param value Value to set for the generatedAt property.
     */
    public void setGeneratedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.generatedAt = value;
    }
    /**
     * Sets the points property value. Collection of points included with this Leadping source metrics.
     * @param value Value to set for the points property.
     */
    public void setPoints(@jakarta.annotation.Nullable final java.util.List<AnalyticsTrendPointOfint> value) {
        this.points = value;
    }
    /**
     * Sets the range property value. Range associated with this Leadping source metrics.
     * @param value Value to set for the range property.
     */
    public void setRange(@jakarta.annotation.Nullable final AnalyticsDateRange value) {
        this.range = value;
    }
    /**
     * Sets the totalLeads property value. Total number of leads records represented by this Leadping source metrics.
     * @param value Value to set for the totalLeads property.
     */
    public void setTotalLeads(@jakarta.annotation.Nullable final Integer value) {
        this.totalLeads = value;
    }
}
