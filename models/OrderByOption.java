package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * An object for ordering during querying
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrderByOption implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An enumerator for sort direction during querying
     */
    private OrderByOptionDirection direction;
    /**
     * The field to sort by.
     */
    private String field;
    /**
     * Instantiates a new {@link OrderByOption} and sets the default values.
     */
    public OrderByOption() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OrderByOption}
     */
    @jakarta.annotation.Nonnull
    public static OrderByOption createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrderByOption();
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
     * Gets the direction property value. An enumerator for sort direction during querying
     * @return a {@link OrderByOptionDirection}
     */
    @jakarta.annotation.Nullable
    public OrderByOptionDirection getDirection() {
        return this.direction;
    }
    /**
     * Gets the field property value. The field to sort by.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getField() {
        return this.field;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("direction", (n) -> { this.setDirection(n.getEnumValue(OrderByOptionDirection::forValue)); });
        deserializerMap.put("field", (n) -> { this.setField(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("direction", this.getDirection());
        writer.writeStringValue("field", this.getField());
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
     * Sets the direction property value. An enumerator for sort direction during querying
     * @param value Value to set for the direction property.
     */
    public void setDirection(@jakarta.annotation.Nullable final OrderByOptionDirection value) {
        this.direction = value;
    }
    /**
     * Sets the field property value. The field to sort by.
     * @param value Value to set for the field property.
     */
    public void setField(@jakarta.annotation.Nullable final String value) {
        this.field = value;
    }
}
