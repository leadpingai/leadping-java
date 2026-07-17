package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Public Leadping API schema for lead phone number data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Phone implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * E.164 phone number exposed by this lead phone number.
     */
    private String number;
    /**
     * Identifier of the canonical phone identity stored by Leadping.
     */
    private String phoneIdentityId;
    /**
     * Type classification used to route and interpret this lead phone number in the Leadping API.
     */
    private String type;
    /**
     * Instantiates a new {@link Phone} and sets the default values.
     */
    public Phone() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Phone}
     */
    @jakarta.annotation.Nonnull
    public static Phone createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Phone();
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
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("phoneIdentityId", (n) -> { this.setPhoneIdentityId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the number property value. E.164 phone number exposed by this lead phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.number;
    }
    /**
     * Gets the phoneIdentityId property value. Identifier of the canonical phone identity stored by Leadping.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneIdentityId() {
        return this.phoneIdentityId;
    }
    /**
     * Gets the type property value. Type classification used to route and interpret this lead phone number in the Leadping API.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("phoneIdentityId", this.getPhoneIdentityId());
        writer.writeStringValue("type", this.getType());
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
     * Sets the number property value. E.164 phone number exposed by this lead phone number.
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.number = value;
    }
    /**
     * Sets the phoneIdentityId property value. Identifier of the canonical phone identity stored by Leadping.
     * @param value Value to set for the phoneIdentityId property.
     */
    public void setPhoneIdentityId(@jakarta.annotation.Nullable final String value) {
        this.phoneIdentityId = value;
    }
    /**
     * Sets the type property value. Type classification used to route and interpret this lead phone number in the Leadping API.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
