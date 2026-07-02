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
     * The smsLimitThisHour property
     */
    private Integer smsLimitThisHour;
    /**
     * The smsLimitToday property
     */
    private Integer smsLimitToday;
    /**
     * The smsRemainingThisHour property
     */
    private Integer smsRemainingThisHour;
    /**
     * The smsRemainingToday property
     */
    private Integer smsRemainingToday;
    /**
     * The smsUsedThisHour property
     */
    private Integer smsUsedThisHour;
    /**
     * The smsUsedToday property
     */
    private Integer smsUsedToday;
    /**
     * The voiceLimitThisHour property
     */
    private Integer voiceLimitThisHour;
    /**
     * The voiceLimitToday property
     */
    private Integer voiceLimitToday;
    /**
     * The voiceRemainingThisHour property
     */
    private Integer voiceRemainingThisHour;
    /**
     * The voiceRemainingToday property
     */
    private Integer voiceRemainingToday;
    /**
     * The voiceUsedThisHour property
     */
    private Integer voiceUsedThisHour;
    /**
     * The voiceUsedToday property
     */
    private Integer voiceUsedToday;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(PhoneNumberOutboundHealthStatus::forValue)); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("phoneNumberId", (n) -> { this.setPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("smsLimitThisHour", (n) -> { this.setSmsLimitThisHour(n.getIntegerValue()); });
        deserializerMap.put("smsLimitToday", (n) -> { this.setSmsLimitToday(n.getIntegerValue()); });
        deserializerMap.put("smsRemainingThisHour", (n) -> { this.setSmsRemainingThisHour(n.getIntegerValue()); });
        deserializerMap.put("smsRemainingToday", (n) -> { this.setSmsRemainingToday(n.getIntegerValue()); });
        deserializerMap.put("smsUsedThisHour", (n) -> { this.setSmsUsedThisHour(n.getIntegerValue()); });
        deserializerMap.put("smsUsedToday", (n) -> { this.setSmsUsedToday(n.getIntegerValue()); });
        deserializerMap.put("voiceLimitThisHour", (n) -> { this.setVoiceLimitThisHour(n.getIntegerValue()); });
        deserializerMap.put("voiceLimitToday", (n) -> { this.setVoiceLimitToday(n.getIntegerValue()); });
        deserializerMap.put("voiceRemainingThisHour", (n) -> { this.setVoiceRemainingThisHour(n.getIntegerValue()); });
        deserializerMap.put("voiceRemainingToday", (n) -> { this.setVoiceRemainingToday(n.getIntegerValue()); });
        deserializerMap.put("voiceUsedThisHour", (n) -> { this.setVoiceUsedThisHour(n.getIntegerValue()); });
        deserializerMap.put("voiceUsedToday", (n) -> { this.setVoiceUsedToday(n.getIntegerValue()); });
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
     * Gets the smsLimitThisHour property value. The smsLimitThisHour property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsLimitThisHour() {
        return this.smsLimitThisHour;
    }
    /**
     * Gets the smsLimitToday property value. The smsLimitToday property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsLimitToday() {
        return this.smsLimitToday;
    }
    /**
     * Gets the smsRemainingThisHour property value. The smsRemainingThisHour property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsRemainingThisHour() {
        return this.smsRemainingThisHour;
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
     * Gets the smsUsedThisHour property value. The smsUsedThisHour property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsUsedThisHour() {
        return this.smsUsedThisHour;
    }
    /**
     * Gets the smsUsedToday property value. The smsUsedToday property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsUsedToday() {
        return this.smsUsedToday;
    }
    /**
     * Gets the voiceLimitThisHour property value. The voiceLimitThisHour property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVoiceLimitThisHour() {
        return this.voiceLimitThisHour;
    }
    /**
     * Gets the voiceLimitToday property value. The voiceLimitToday property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVoiceLimitToday() {
        return this.voiceLimitToday;
    }
    /**
     * Gets the voiceRemainingThisHour property value. The voiceRemainingThisHour property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVoiceRemainingThisHour() {
        return this.voiceRemainingThisHour;
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
     * Gets the voiceUsedThisHour property value. The voiceUsedThisHour property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVoiceUsedThisHour() {
        return this.voiceUsedThisHour;
    }
    /**
     * Gets the voiceUsedToday property value. The voiceUsedToday property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVoiceUsedToday() {
        return this.voiceUsedToday;
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
        writer.writeIntegerValue("smsLimitThisHour", this.getSmsLimitThisHour());
        writer.writeIntegerValue("smsLimitToday", this.getSmsLimitToday());
        writer.writeIntegerValue("smsRemainingThisHour", this.getSmsRemainingThisHour());
        writer.writeIntegerValue("smsRemainingToday", this.getSmsRemainingToday());
        writer.writeIntegerValue("smsUsedThisHour", this.getSmsUsedThisHour());
        writer.writeIntegerValue("smsUsedToday", this.getSmsUsedToday());
        writer.writeIntegerValue("voiceLimitThisHour", this.getVoiceLimitThisHour());
        writer.writeIntegerValue("voiceLimitToday", this.getVoiceLimitToday());
        writer.writeIntegerValue("voiceRemainingThisHour", this.getVoiceRemainingThisHour());
        writer.writeIntegerValue("voiceRemainingToday", this.getVoiceRemainingToday());
        writer.writeIntegerValue("voiceUsedThisHour", this.getVoiceUsedThisHour());
        writer.writeIntegerValue("voiceUsedToday", this.getVoiceUsedToday());
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
     * Sets the smsLimitThisHour property value. The smsLimitThisHour property
     * @param value Value to set for the smsLimitThisHour property.
     */
    public void setSmsLimitThisHour(@jakarta.annotation.Nullable final Integer value) {
        this.smsLimitThisHour = value;
    }
    /**
     * Sets the smsLimitToday property value. The smsLimitToday property
     * @param value Value to set for the smsLimitToday property.
     */
    public void setSmsLimitToday(@jakarta.annotation.Nullable final Integer value) {
        this.smsLimitToday = value;
    }
    /**
     * Sets the smsRemainingThisHour property value. The smsRemainingThisHour property
     * @param value Value to set for the smsRemainingThisHour property.
     */
    public void setSmsRemainingThisHour(@jakarta.annotation.Nullable final Integer value) {
        this.smsRemainingThisHour = value;
    }
    /**
     * Sets the smsRemainingToday property value. The smsRemainingToday property
     * @param value Value to set for the smsRemainingToday property.
     */
    public void setSmsRemainingToday(@jakarta.annotation.Nullable final Integer value) {
        this.smsRemainingToday = value;
    }
    /**
     * Sets the smsUsedThisHour property value. The smsUsedThisHour property
     * @param value Value to set for the smsUsedThisHour property.
     */
    public void setSmsUsedThisHour(@jakarta.annotation.Nullable final Integer value) {
        this.smsUsedThisHour = value;
    }
    /**
     * Sets the smsUsedToday property value. The smsUsedToday property
     * @param value Value to set for the smsUsedToday property.
     */
    public void setSmsUsedToday(@jakarta.annotation.Nullable final Integer value) {
        this.smsUsedToday = value;
    }
    /**
     * Sets the voiceLimitThisHour property value. The voiceLimitThisHour property
     * @param value Value to set for the voiceLimitThisHour property.
     */
    public void setVoiceLimitThisHour(@jakarta.annotation.Nullable final Integer value) {
        this.voiceLimitThisHour = value;
    }
    /**
     * Sets the voiceLimitToday property value. The voiceLimitToday property
     * @param value Value to set for the voiceLimitToday property.
     */
    public void setVoiceLimitToday(@jakarta.annotation.Nullable final Integer value) {
        this.voiceLimitToday = value;
    }
    /**
     * Sets the voiceRemainingThisHour property value. The voiceRemainingThisHour property
     * @param value Value to set for the voiceRemainingThisHour property.
     */
    public void setVoiceRemainingThisHour(@jakarta.annotation.Nullable final Integer value) {
        this.voiceRemainingThisHour = value;
    }
    /**
     * Sets the voiceRemainingToday property value. The voiceRemainingToday property
     * @param value Value to set for the voiceRemainingToday property.
     */
    public void setVoiceRemainingToday(@jakarta.annotation.Nullable final Integer value) {
        this.voiceRemainingToday = value;
    }
    /**
     * Sets the voiceUsedThisHour property value. The voiceUsedThisHour property
     * @param value Value to set for the voiceUsedThisHour property.
     */
    public void setVoiceUsedThisHour(@jakarta.annotation.Nullable final Integer value) {
        this.voiceUsedThisHour = value;
    }
    /**
     * Sets the voiceUsedToday property value. The voiceUsedToday property
     * @param value Value to set for the voiceUsedToday property.
     */
    public void setVoiceUsedToday(@jakarta.annotation.Nullable final Integer value) {
        this.voiceUsedToday = value;
    }
}
