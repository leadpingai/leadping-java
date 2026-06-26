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
 * A generic object for handling range filtering during querying
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RangeFilter implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The field to filter by.
     */
    private String field;
    /**
     * The exclusive lower bound for the field value.
     */
    private UntypedNode greaterThan;
    /**
     * The inclusive lower bound for the field value.
     */
    private UntypedNode greaterThanOrEqual;
    /**
     * The exclusive upper bound for the field value.
     */
    private UntypedNode lessThan;
    /**
     * The inclusive upper bound for the field value.
     */
    private UntypedNode lessThanOrEqual;
    /**
     * Instantiates a new {@link RangeFilter} and sets the default values.
     */
    public RangeFilter() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RangeFilter}
     */
    @jakarta.annotation.Nonnull
    public static RangeFilter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RangeFilter();
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
     * Gets the field property value. The field to filter by.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("field", (n) -> { this.setField(n.getStringValue()); });
        deserializerMap.put("greaterThan", (n) -> { this.setGreaterThan(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("greaterThanOrEqual", (n) -> { this.setGreaterThanOrEqual(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("lessThan", (n) -> { this.setLessThan(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("lessThanOrEqual", (n) -> { this.setLessThanOrEqual(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the greaterThan property value. The exclusive lower bound for the field value.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getGreaterThan() {
        return this.greaterThan;
    }
    /**
     * Gets the greaterThanOrEqual property value. The inclusive lower bound for the field value.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getGreaterThanOrEqual() {
        return this.greaterThanOrEqual;
    }
    /**
     * Gets the lessThan property value. The exclusive upper bound for the field value.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getLessThan() {
        return this.lessThan;
    }
    /**
     * Gets the lessThanOrEqual property value. The inclusive upper bound for the field value.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getLessThanOrEqual() {
        return this.lessThanOrEqual;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("field", this.getField());
        writer.writeObjectValue("greaterThan", this.getGreaterThan());
        writer.writeObjectValue("greaterThanOrEqual", this.getGreaterThanOrEqual());
        writer.writeObjectValue("lessThan", this.getLessThan());
        writer.writeObjectValue("lessThanOrEqual", this.getLessThanOrEqual());
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
     * Sets the field property value. The field to filter by.
     * @param value Value to set for the field property.
     */
    public void setField(@jakarta.annotation.Nullable final String value) {
        this.field = value;
    }
    /**
     * Sets the greaterThan property value. The exclusive lower bound for the field value.
     * @param value Value to set for the greaterThan property.
     */
    public void setGreaterThan(@jakarta.annotation.Nullable final UntypedNode value) {
        this.greaterThan = value;
    }
    /**
     * Sets the greaterThanOrEqual property value. The inclusive lower bound for the field value.
     * @param value Value to set for the greaterThanOrEqual property.
     */
    public void setGreaterThanOrEqual(@jakarta.annotation.Nullable final UntypedNode value) {
        this.greaterThanOrEqual = value;
    }
    /**
     * Sets the lessThan property value. The exclusive upper bound for the field value.
     * @param value Value to set for the lessThan property.
     */
    public void setLessThan(@jakarta.annotation.Nullable final UntypedNode value) {
        this.lessThan = value;
    }
    /**
     * Sets the lessThanOrEqual property value. The inclusive upper bound for the field value.
     * @param value Value to set for the lessThanOrEqual property.
     */
    public void setLessThanOrEqual(@jakarta.annotation.Nullable final UntypedNode value) {
        this.lessThanOrEqual = value;
    }
}
