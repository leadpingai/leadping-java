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
 * Represents analytics trend point data exposed by Leadping analytics.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AnalyticsTrendPointOfint implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Date and time when this Leadping analytics trend point was end.
     */
    private OffsetDateTime endAt;
    /**
     * Human-readable label for this Leadping analytics trend point.
     */
    private String label;
    /**
     * Date and time when this Leadping analytics trend point was start.
     */
    private OffsetDateTime startAt;
    /**
     * Value associated with this Leadping analytics trend point.
     */
    private Integer value;
    /**
     * Instantiates a new {@link AnalyticsTrendPointOfint} and sets the default values.
     */
    public AnalyticsTrendPointOfint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AnalyticsTrendPointOfint}
     */
    @jakarta.annotation.Nonnull
    public static AnalyticsTrendPointOfint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnalyticsTrendPointOfint();
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
     * Gets the endAt property value. Date and time when this Leadping analytics trend point was end.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndAt() {
        return this.endAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("endAt", (n) -> { this.setEndAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("startAt", (n) -> { this.setStartAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. Human-readable label for this Leadping analytics trend point.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the startAt property value. Date and time when this Leadping analytics trend point was start.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartAt() {
        return this.startAt;
    }
    /**
     * Gets the value property value. Value associated with this Leadping analytics trend point.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("endAt", this.getEndAt());
        writer.writeStringValue("label", this.getLabel());
        writer.writeOffsetDateTimeValue("startAt", this.getStartAt());
        writer.writeIntegerValue("value", this.getValue());
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
     * Sets the endAt property value. Date and time when this Leadping analytics trend point was end.
     * @param value Value to set for the endAt property.
     */
    public void setEndAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endAt = value;
    }
    /**
     * Sets the label property value. Human-readable label for this Leadping analytics trend point.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the startAt property value. Date and time when this Leadping analytics trend point was start.
     * @param value Value to set for the startAt property.
     */
    public void setStartAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startAt = value;
    }
    /**
     * Sets the value property value. Value associated with this Leadping analytics trend point.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Integer value) {
        this.value = value;
    }
}
