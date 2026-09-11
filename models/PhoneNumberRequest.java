package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Defines the fields clients can send when working with phone number update.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Human-readable label for the phone number.
     */
    private String name;
    /**
     * E.164 phone number exposed by this phone number update request.
     */
    private String number;
    /**
     * Opts this number into the optional $2 monthly number health add-on. Defaults to on on creation; omitted updates preserve the current selection.
     */
    private Boolean numberHealthEnabled;
    /**
     * Instantiates a new {@link PhoneNumberRequest} and sets the default values.
     */
    public PhoneNumberRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberRequest}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberRequest();
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
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("numberHealthEnabled", (n) -> { this.setNumberHealthEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Human-readable label for the phone number.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the number property value. E.164 phone number exposed by this phone number update request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.number;
    }
    /**
     * Gets the numberHealthEnabled property value. Opts this number into the optional $2 monthly number health add-on. Defaults to on on creation; omitted updates preserve the current selection.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNumberHealthEnabled() {
        return this.numberHealthEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("number", this.getNumber());
        writer.writeBooleanValue("numberHealthEnabled", this.getNumberHealthEnabled());
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
     * Sets the name property value. Human-readable label for the phone number.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the number property value. E.164 phone number exposed by this phone number update request.
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.number = value;
    }
    /**
     * Sets the numberHealthEnabled property value. Opts this number into the optional $2 monthly number health add-on. Defaults to on on creation; omitted updates preserve the current selection.
     * @param value Value to set for the numberHealthEnabled property.
     */
    public void setNumberHealthEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.numberHealthEnabled = value;
    }
}
