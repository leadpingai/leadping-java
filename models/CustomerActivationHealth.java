package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents customer activation health data exposed by Leadping analytics.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerActivationHealth implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Collection of items included with this Leadping customer activation health.
     */
    private java.util.List<CustomerActivationHealthItem> items;
    /**
     * Current overall status for this Leadping customer activation health.
     */
    private String overallStatus;
    /**
     * Instantiates a new {@link CustomerActivationHealth} and sets the default values.
     */
    public CustomerActivationHealth() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerActivationHealth}
     */
    @jakarta.annotation.Nonnull
    public static CustomerActivationHealth createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerActivationHealth();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(CustomerActivationHealthItem::createFromDiscriminatorValue)); });
        deserializerMap.put("overallStatus", (n) -> { this.setOverallStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the items property value. Collection of items included with this Leadping customer activation health.
     * @return a {@link java.util.List<CustomerActivationHealthItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomerActivationHealthItem> getItems() {
        return this.items;
    }
    /**
     * Gets the overallStatus property value. Current overall status for this Leadping customer activation health.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOverallStatus() {
        return this.overallStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeStringValue("overallStatus", this.getOverallStatus());
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
     * Sets the items property value. Collection of items included with this Leadping customer activation health.
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<CustomerActivationHealthItem> value) {
        this.items = value;
    }
    /**
     * Sets the overallStatus property value. Current overall status for this Leadping customer activation health.
     * @param value Value to set for the overallStatus property.
     */
    public void setOverallStatus(@jakarta.annotation.Nullable final String value) {
        this.overallStatus = value;
    }
}
