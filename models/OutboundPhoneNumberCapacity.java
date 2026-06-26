package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutboundPhoneNumberCapacity implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Defines phone-number outbound health states used by pacing.
     */
    private PhoneNumberOutboundHealthStatus healthStatus;
    /**
     * The phoneNumber property
     */
    private String phoneNumber;
    /**
     * The phoneNumberId property
     */
    private String phoneNumberId;
    /**
     * The smsRemainingToday property
     */
    private Integer smsRemainingToday;
    /**
     * The voiceRemainingToday property
     */
    private Integer voiceRemainingToday;
    /**
     * Instantiates a new {@link OutboundPhoneNumberCapacity} and sets the default values.
     */
    public OutboundPhoneNumberCapacity() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OutboundPhoneNumberCapacity}
     */
    @jakarta.annotation.Nonnull
    public static OutboundPhoneNumberCapacity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutboundPhoneNumberCapacity();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(PhoneNumberOutboundHealthStatus::forValue)); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("phoneNumberId", (n) -> { this.setPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("smsRemainingToday", (n) -> { this.setSmsRemainingToday(n.getIntegerValue()); });
        deserializerMap.put("voiceRemainingToday", (n) -> { this.setVoiceRemainingToday(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthStatus property value. Defines phone-number outbound health states used by pacing.
     * @return a {@link PhoneNumberOutboundHealthStatus}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberOutboundHealthStatus getHealthStatus() {
        return this.healthStatus;
    }
    /**
     * Gets the phoneNumber property value. The phoneNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the phoneNumberId property value. The phoneNumberId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }
    /**
     * Gets the smsRemainingToday property value. The smsRemainingToday property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsRemainingToday() {
        return this.smsRemainingToday;
    }
    /**
     * Gets the voiceRemainingToday property value. The voiceRemainingToday property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVoiceRemainingToday() {
        return this.voiceRemainingToday;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeStringValue("phoneNumberId", this.getPhoneNumberId());
        writer.writeIntegerValue("smsRemainingToday", this.getSmsRemainingToday());
        writer.writeIntegerValue("voiceRemainingToday", this.getVoiceRemainingToday());
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
     * Sets the healthStatus property value. Defines phone-number outbound health states used by pacing.
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final PhoneNumberOutboundHealthStatus value) {
        this.healthStatus = value;
    }
    /**
     * Sets the phoneNumber property value. The phoneNumber property
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the phoneNumberId property value. The phoneNumberId property
     * @param value Value to set for the phoneNumberId property.
     */
    public void setPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.phoneNumberId = value;
    }
    /**
     * Sets the smsRemainingToday property value. The smsRemainingToday property
     * @param value Value to set for the smsRemainingToday property.
     */
    public void setSmsRemainingToday(@jakarta.annotation.Nullable final Integer value) {
        this.smsRemainingToday = value;
    }
    /**
     * Sets the voiceRemainingToday property value. The voiceRemainingToday property
     * @param value Value to set for the voiceRemainingToday property.
     */
    public void setVoiceRemainingToday(@jakarta.annotation.Nullable final Integer value) {
        this.voiceRemainingToday = value;
    }
}
