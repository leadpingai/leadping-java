package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Request payload for suppression entry.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SuppressionEntryRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The business ID associated with this ion entry.
     */
    private String businessId;
    /**
     * The channel value for this ion entry.
     */
    private String channel;
    /**
     * The email address associated with this ion entry.
     */
    private String email;
    /**
     * The phone number associated with this ion entry.
     */
    private String phoneNumber;
    /**
     * The human-readable reason explaining this ion entry.
     */
    private String reason;
    /**
     * The recipient identifier value for this ion entry.
     */
    private String recipientIdentifier;
    /**
     * Instantiates a new {@link SuppressionEntryRequest} and sets the default values.
     */
    public SuppressionEntryRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SuppressionEntryRequest}
     */
    @jakarta.annotation.Nonnull
    public static SuppressionEntryRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SuppressionEntryRequest();
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
     * Gets the businessId property value. The business ID associated with this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBusinessId() {
        return this.businessId;
    }
    /**
     * Gets the channel property value. The channel value for this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getChannel() {
        return this.channel;
    }
    /**
     * Gets the email property value. The email address associated with this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("businessId", (n) -> { this.setBusinessId(n.getStringValue()); });
        deserializerMap.put("channel", (n) -> { this.setChannel(n.getStringValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("recipientIdentifier", (n) -> { this.setRecipientIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the phoneNumber property value. The phone number associated with this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the reason property value. The human-readable reason explaining this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the recipientIdentifier property value. The recipient identifier value for this ion entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRecipientIdentifier() {
        return this.recipientIdentifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("businessId", this.getBusinessId());
        writer.writeStringValue("channel", this.getChannel());
        writer.writeStringValue("email", this.getEmail());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeStringValue("reason", this.getReason());
        writer.writeStringValue("recipientIdentifier", this.getRecipientIdentifier());
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
     * Sets the businessId property value. The business ID associated with this ion entry.
     * @param value Value to set for the businessId property.
     */
    public void setBusinessId(@jakarta.annotation.Nullable final String value) {
        this.businessId = value;
    }
    /**
     * Sets the channel property value. The channel value for this ion entry.
     * @param value Value to set for the channel property.
     */
    public void setChannel(@jakarta.annotation.Nullable final String value) {
        this.channel = value;
    }
    /**
     * Sets the email property value. The email address associated with this ion entry.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the phoneNumber property value. The phone number associated with this ion entry.
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the reason property value. The human-readable reason explaining this ion entry.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the recipientIdentifier property value. The recipient identifier value for this ion entry.
     * @param value Value to set for the recipientIdentifier property.
     */
    public void setRecipientIdentifier(@jakarta.annotation.Nullable final String value) {
        this.recipientIdentifier = value;
    }
}
