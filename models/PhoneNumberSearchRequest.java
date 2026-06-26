package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Request schema for the Leadping API phone number search request, including the fields clients can send.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberSearchRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Geographic location metadata for the phone number, lead, or lookup result.
     */
    private PhoneNumberSearchRequestLocation location;
    /**
     * Phone number used by this phone number search request for calls, SMS, lookup, or routing.
     */
    private String phoneNumber;
    /**
     * Instantiates a new {@link PhoneNumberSearchRequest} and sets the default values.
     */
    public PhoneNumberSearchRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberSearchRequest}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberSearchRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberSearchRequest();
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
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(PhoneNumberSearchRequestLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the location property value. Geographic location metadata for the phone number, lead, or lookup result.
     * @return a {@link PhoneNumberSearchRequestLocation}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberSearchRequestLocation getLocation() {
        return this.location;
    }
    /**
     * Gets the phoneNumber property value. Phone number used by this phone number search request for calls, SMS, lookup, or routing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("location", this.getLocation());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
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
     * Sets the location property value. Geographic location metadata for the phone number, lead, or lookup result.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final PhoneNumberSearchRequestLocation value) {
        this.location = value;
    }
    /**
     * Sets the phoneNumber property value. Phone number used by this phone number search request for calls, SMS, lookup, or routing.
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
}
