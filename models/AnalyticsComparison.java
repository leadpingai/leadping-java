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
 * Represents analytics comparison data exposed by Leadping analytics.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AnalyticsComparison implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Percentage change between the current and previous reporting periods.
     */
    private UntypedNode changePercent;
    /**
     * Metric value for the current reporting period.
     */
    private Double current;
    /**
     * Direction classification for this Leadping analytics comparison.
     */
    private String direction;
    /**
     * Metric value for the preceding comparison period.
     */
    private Double previous;
    /**
     * Instantiates a new {@link AnalyticsComparison} and sets the default values.
     */
    public AnalyticsComparison() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AnalyticsComparison}
     */
    @jakarta.annotation.Nonnull
    public static AnalyticsComparison createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnalyticsComparison();
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
     * Gets the changePercent property value. Percentage change between the current and previous reporting periods.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getChangePercent() {
        return this.changePercent;
    }
    /**
     * Gets the current property value. Metric value for the current reporting period.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getCurrent() {
        return this.current;
    }
    /**
     * Gets the direction property value. Direction classification for this Leadping analytics comparison.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDirection() {
        return this.direction;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("changePercent", (n) -> { this.setChangePercent(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("current", (n) -> { this.setCurrent(n.getDoubleValue()); });
        deserializerMap.put("direction", (n) -> { this.setDirection(n.getStringValue()); });
        deserializerMap.put("previous", (n) -> { this.setPrevious(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the previous property value. Metric value for the preceding comparison period.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPrevious() {
        return this.previous;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("changePercent", this.getChangePercent());
        writer.writeDoubleValue("current", this.getCurrent());
        writer.writeStringValue("direction", this.getDirection());
        writer.writeDoubleValue("previous", this.getPrevious());
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
     * Sets the changePercent property value. Percentage change between the current and previous reporting periods.
     * @param value Value to set for the changePercent property.
     */
    public void setChangePercent(@jakarta.annotation.Nullable final UntypedNode value) {
        this.changePercent = value;
    }
    /**
     * Sets the current property value. Metric value for the current reporting period.
     * @param value Value to set for the current property.
     */
    public void setCurrent(@jakarta.annotation.Nullable final Double value) {
        this.current = value;
    }
    /**
     * Sets the direction property value. Direction classification for this Leadping analytics comparison.
     * @param value Value to set for the direction property.
     */
    public void setDirection(@jakarta.annotation.Nullable final String value) {
        this.direction = value;
    }
    /**
     * Sets the previous property value. Metric value for the preceding comparison period.
     * @param value Value to set for the previous property.
     */
    public void setPrevious(@jakarta.annotation.Nullable final Double value) {
        this.previous = value;
    }
}
