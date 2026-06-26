package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Public Leadping API schema for phone number capabilities data.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberCapabilities implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * SMS readiness details for this phone number or business.
     */
    private Boolean sms;
    /**
     * Indicates whether the request should run in test mode.
     */
    private Boolean testing;
    /**
     * Voice readiness details for this phone number or business.
     */
    private Boolean voice;
    /**
     * Warmup status data for this sender or phone number.
     */
    private Boolean warmup;
    /**
     * Instantiates a new {@link PhoneNumberCapabilities} and sets the default values.
     */
    public PhoneNumberCapabilities() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberCapabilities}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberCapabilities createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberCapabilities();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("sms", (n) -> { this.setSms(n.getBooleanValue()); });
        deserializerMap.put("testing", (n) -> { this.setTesting(n.getBooleanValue()); });
        deserializerMap.put("voice", (n) -> { this.setVoice(n.getBooleanValue()); });
        deserializerMap.put("warmup", (n) -> { this.setWarmup(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sms property value. SMS readiness details for this phone number or business.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSms() {
        return this.sms;
    }
    /**
     * Gets the testing property value. Indicates whether the request should run in test mode.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTesting() {
        return this.testing;
    }
    /**
     * Gets the voice property value. Voice readiness details for this phone number or business.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVoice() {
        return this.voice;
    }
    /**
     * Gets the warmup property value. Warmup status data for this sender or phone number.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWarmup() {
        return this.warmup;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("sms", this.getSms());
        writer.writeBooleanValue("testing", this.getTesting());
        writer.writeBooleanValue("voice", this.getVoice());
        writer.writeBooleanValue("warmup", this.getWarmup());
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
     * Sets the sms property value. SMS readiness details for this phone number or business.
     * @param value Value to set for the sms property.
     */
    public void setSms(@jakarta.annotation.Nullable final Boolean value) {
        this.sms = value;
    }
    /**
     * Sets the testing property value. Indicates whether the request should run in test mode.
     * @param value Value to set for the testing property.
     */
    public void setTesting(@jakarta.annotation.Nullable final Boolean value) {
        this.testing = value;
    }
    /**
     * Sets the voice property value. Voice readiness details for this phone number or business.
     * @param value Value to set for the voice property.
     */
    public void setVoice(@jakarta.annotation.Nullable final Boolean value) {
        this.voice = value;
    }
    /**
     * Sets the warmup property value. Warmup status data for this sender or phone number.
     * @param value Value to set for the warmup property.
     */
    public void setWarmup(@jakarta.annotation.Nullable final Boolean value) {
        this.warmup = value;
    }
}
