package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A directed connection between two nodes in an automation graph.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationConnection implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Unique identifier for this connection.
     */
    private String id;
    /**
     * Graph node identifier where the connection begins.
     */
    private String sourceNodeId;
    /**
     * Graph node identifier where the connection ends.
     */
    private String targetNodeId;
    /**
     * Instantiates a new {@link AutomationConnection} and sets the default values.
     */
    public AutomationConnection() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationConnection}
     */
    @jakarta.annotation.Nonnull
    public static AutomationConnection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationConnection();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("sourceNodeId", (n) -> { this.setSourceNodeId(n.getStringValue()); });
        deserializerMap.put("targetNodeId", (n) -> { this.setTargetNodeId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique identifier for this connection.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the sourceNodeId property value. Graph node identifier where the connection begins.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceNodeId() {
        return this.sourceNodeId;
    }
    /**
     * Gets the targetNodeId property value. Graph node identifier where the connection ends.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetNodeId() {
        return this.targetNodeId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("sourceNodeId", this.getSourceNodeId());
        writer.writeStringValue("targetNodeId", this.getTargetNodeId());
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
     * Sets the id property value. Unique identifier for this connection.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the sourceNodeId property value. Graph node identifier where the connection begins.
     * @param value Value to set for the sourceNodeId property.
     */
    public void setSourceNodeId(@jakarta.annotation.Nullable final String value) {
        this.sourceNodeId = value;
    }
    /**
     * Sets the targetNodeId property value. Graph node identifier where the connection ends.
     * @param value Value to set for the targetNodeId property.
     */
    public void setTargetNodeId(@jakarta.annotation.Nullable final String value) {
        this.targetNodeId = value;
    }
}
