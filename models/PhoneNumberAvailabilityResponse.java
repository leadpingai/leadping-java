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
 * Response schema for the Leadping API phone number availability result returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberAvailabilityResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * ISO currency code used for the monetary amounts in this phone number availability result.
     */
    private String currency;
    /**
     * Indicates whether this phone number is available for purchase or assignment.
     */
    private Boolean isAvailable;
    /**
     * Geographic location metadata for the phone number, lead, or lookup result.
     */
    private PhoneNumberAvailabilityResponseLocation location;
    /**
     * Phone number used by this phone number availability result for calls, SMS, lookup, or routing.
     */
    private String phoneNumber;
    /**
     * Lead price or transaction price supplied to the Leadping API.
     */
    private UntypedNode price;
    /**
     * Instantiates a new {@link PhoneNumberAvailabilityResponse} and sets the default values.
     */
    public PhoneNumberAvailabilityResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberAvailabilityResponse}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberAvailabilityResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberAvailabilityResponse();
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
     * Gets the currency property value. ISO currency code used for the monetary amounts in this phone number availability result.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("isAvailable", (n) -> { this.setIsAvailable(n.getBooleanValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(PhoneNumberAvailabilityResponseLocation::createFromDiscriminatorValue)); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("price", (n) -> { this.setPrice(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isAvailable property value. Indicates whether this phone number is available for purchase or assignment.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAvailable() {
        return this.isAvailable;
    }
    /**
     * Gets the location property value. Geographic location metadata for the phone number, lead, or lookup result.
     * @return a {@link PhoneNumberAvailabilityResponseLocation}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberAvailabilityResponseLocation getLocation() {
        return this.location;
    }
    /**
     * Gets the phoneNumber property value. Phone number used by this phone number availability result for calls, SMS, lookup, or routing.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the price property value. Lead price or transaction price supplied to the Leadping API.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getPrice() {
        return this.price;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeBooleanValue("isAvailable", this.getIsAvailable());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeObjectValue("price", this.getPrice());
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
     * Sets the currency property value. ISO currency code used for the monetary amounts in this phone number availability result.
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the isAvailable property value. Indicates whether this phone number is available for purchase or assignment.
     * @param value Value to set for the isAvailable property.
     */
    public void setIsAvailable(@jakarta.annotation.Nullable final Boolean value) {
        this.isAvailable = value;
    }
    /**
     * Sets the location property value. Geographic location metadata for the phone number, lead, or lookup result.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final PhoneNumberAvailabilityResponseLocation value) {
        this.location = value;
    }
    /**
     * Sets the phoneNumber property value. Phone number used by this phone number availability result for calls, SMS, lookup, or routing.
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the price property value. Lead price or transaction price supplied to the Leadping API.
     * @param value Value to set for the price property.
     */
    public void setPrice(@jakarta.annotation.Nullable final UntypedNode value) {
        this.price = value;
    }
}
