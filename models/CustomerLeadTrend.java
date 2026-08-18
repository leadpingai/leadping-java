package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents customer lead trend data exposed by Leadping analytics.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerLeadTrend implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Date and time when this Leadping customer lead trend was comparison.
     */
    private AnalyticsComparison comparison;
    /**
     * Collection of points included with this Leadping customer lead trend.
     */
    private java.util.List<AnalyticsTrendPointOfint> points;
    /**
     * Total number of total records represented by this Leadping customer lead trend.
     */
    private Integer total;
    /**
     * Instantiates a new {@link CustomerLeadTrend} and sets the default values.
     */
    public CustomerLeadTrend() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerLeadTrend}
     */
    @jakarta.annotation.Nonnull
    public static CustomerLeadTrend createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerLeadTrend();
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
     * Gets the comparison property value. Date and time when this Leadping customer lead trend was comparison.
     * @return a {@link AnalyticsComparison}
     */
    @jakarta.annotation.Nullable
    public AnalyticsComparison getComparison() {
        return this.comparison;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("comparison", (n) -> { this.setComparison(n.getObjectValue(AnalyticsComparison::createFromDiscriminatorValue)); });
        deserializerMap.put("points", (n) -> { this.setPoints(n.getCollectionOfObjectValues(AnalyticsTrendPointOfint::createFromDiscriminatorValue)); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the points property value. Collection of points included with this Leadping customer lead trend.
     * @return a {@link java.util.List<AnalyticsTrendPointOfint>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AnalyticsTrendPointOfint> getPoints() {
        return this.points;
    }
    /**
     * Gets the total property value. Total number of total records represented by this Leadping customer lead trend.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("comparison", this.getComparison());
        writer.writeCollectionOfObjectValues("points", this.getPoints());
        writer.writeIntegerValue("total", this.getTotal());
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
     * Sets the comparison property value. Date and time when this Leadping customer lead trend was comparison.
     * @param value Value to set for the comparison property.
     */
    public void setComparison(@jakarta.annotation.Nullable final AnalyticsComparison value) {
        this.comparison = value;
    }
    /**
     * Sets the points property value. Collection of points included with this Leadping customer lead trend.
     * @param value Value to set for the points property.
     */
    public void setPoints(@jakarta.annotation.Nullable final java.util.List<AnalyticsTrendPointOfint> value) {
        this.points = value;
    }
    /**
     * Sets the total property value. Total number of total records represented by this Leadping customer lead trend.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.total = value;
    }
}
