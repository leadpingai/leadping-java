package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * API DTO containing a named usage counter shown in usage summaries.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsageCounterLine implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The stable key for this usage counter.
     */
    private String key;
    /**
     * The human-readable label for this usage counter.
     */
    private String label;
    /**
     * The display order for this usage counter.
     */
    private Integer sortOrder;
    /**
     * The unit label for this usage counter.
     */
    private String unit;
    /**
     * The numeric value for this usage counter.
     */
    private Double value;
    /**
     * Instantiates a new {@link UsageCounterLine} and sets the default values.
     */
    public UsageCounterLine() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UsageCounterLine}
     */
    @jakarta.annotation.Nonnull
    public static UsageCounterLine createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UsageCounterLine();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("key", (n) -> { this.setKey(n.getStringValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("sortOrder", (n) -> { this.setSortOrder(n.getIntegerValue()); });
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the key property value. The stable key for this usage counter.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getKey() {
        return this.key;
    }
    /**
     * Gets the label property value. The human-readable label for this usage counter.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the sortOrder property value. The display order for this usage counter.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSortOrder() {
        return this.sortOrder;
    }
    /**
     * Gets the unit property value. The unit label for this usage counter.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUnit() {
        return this.unit;
    }
    /**
     * Gets the value property value. The numeric value for this usage counter.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("key", this.getKey());
        writer.writeStringValue("label", this.getLabel());
        writer.writeIntegerValue("sortOrder", this.getSortOrder());
        writer.writeStringValue("unit", this.getUnit());
        writer.writeDoubleValue("value", this.getValue());
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
     * Sets the key property value. The stable key for this usage counter.
     * @param value Value to set for the key property.
     */
    public void setKey(@jakarta.annotation.Nullable final String value) {
        this.key = value;
    }
    /**
     * Sets the label property value. The human-readable label for this usage counter.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the sortOrder property value. The display order for this usage counter.
     * @param value Value to set for the sortOrder property.
     */
    public void setSortOrder(@jakarta.annotation.Nullable final Integer value) {
        this.sortOrder = value;
    }
    /**
     * Sets the unit property value. The unit label for this usage counter.
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final String value) {
        this.unit = value;
    }
    /**
     * Sets the value property value. The numeric value for this usage counter.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Double value) {
        this.value = value;
    }
}
