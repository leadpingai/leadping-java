package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Describes how a phone location value was resolved.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneLocationSource implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The resolution method, such as telnyx-city-state, coordinates, phone-number, or state-default.
     */
    private String method;
    /**
     * The city, state, coordinates, phone number, or representative ZIP used by the method.
     */
    private String query;
    /**
     * Instantiates a new {@link PhoneLocationSource} and sets the default values.
     */
    public PhoneLocationSource() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneLocationSource}
     */
    @jakarta.annotation.Nonnull
    public static PhoneLocationSource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneLocationSource();
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
        deserializerMap.put("method", (n) -> { this.setMethod(n.getStringValue()); });
        deserializerMap.put("query", (n) -> { this.setQuery(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the method property value. The resolution method, such as telnyx-city-state, coordinates, phone-number, or state-default.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMethod() {
        return this.method;
    }
    /**
     * Gets the query property value. The city, state, coordinates, phone number, or representative ZIP used by the method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getQuery() {
        return this.query;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("method", this.getMethod());
        writer.writeStringValue("query", this.getQuery());
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
     * Sets the method property value. The resolution method, such as telnyx-city-state, coordinates, phone-number, or state-default.
     * @param value Value to set for the method property.
     */
    public void setMethod(@jakarta.annotation.Nullable final String value) {
        this.method = value;
    }
    /**
     * Sets the query property value. The city, state, coordinates, phone number, or representative ZIP used by the method.
     * @param value Value to set for the query property.
     */
    public void setQuery(@jakarta.annotation.Nullable final String value) {
        this.query = value;
    }
}
