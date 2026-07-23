package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents outbound phone number capacity data used by Leadping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutboundPhoneNumberCapacity implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether Leadping successfully calculated capacity for this phone number.
     */
    private Boolean capacityAvailable;
    /**
     * Current health status for this Leadping outbound phone number capacity.
     */
    private PhoneNumberOutboundHealthStatus healthStatus;
    /**
     * Phone number associated with this Leadping outbound phone number capacity.
     */
    private String phoneNumber;
    /**
     * Unique identifier of the phone number associated with this Leadping outbound phone number capacity.
     */
    private String phoneNumberId;
    /**
     * Next midnight Eastern time, when SMS daily capacity resets.
     */
    private OffsetDateTime smsDailyResetsAt;
    /**
     * Start of the next Eastern time hour, when SMS hourly capacity resets.
     */
    private OffsetDateTime smsHourlyResetsAt;
    /**
     * Number of SMS limit this hour represented by this Leadping outbound phone number capacity.
     */
    private Integer smsLimitThisHour;
    /**
     * Number of SMS limit today represented by this Leadping outbound phone number capacity.
     */
    private Integer smsLimitToday;
    /**
     * SMS remaining this hour for the applicable messaging or voice capacity window.
     */
    private Integer smsRemainingThisHour;
    /**
     * SMS remaining today for the applicable messaging or voice capacity window.
     */
    private Integer smsRemainingToday;
    /**
     * SMS used this hour for the applicable messaging or voice capacity window.
     */
    private Integer smsUsedThisHour;
    /**
     * SMS used today for the applicable messaging or voice capacity window.
     */
    private Integer smsUsedToday;
    /**
     * Next midnight Eastern time, when voice daily capacity resets.
     */
    private OffsetDateTime voiceDailyResetsAt;
    /**
     * Start of the next Eastern time hour, when voice hourly capacity resets.
     */
    private OffsetDateTime voiceHourlyResetsAt;
    /**
     * Voice limit this hour associated with this Leadping outbound phone number capacity.
     */
    private Integer voiceLimitThisHour;
    /**
     * Voice limit today associated with this Leadping outbound phone number capacity.
     */
    private Integer voiceLimitToday;
    /**
     * Voice remaining this hour for the applicable messaging or voice capacity window.
     */
    private Integer voiceRemainingThisHour;
    /**
     * Voice remaining today for the applicable messaging or voice capacity window.
     */
    private Integer voiceRemainingToday;
    /**
     * Voice used this hour for the applicable messaging or voice capacity window.
     */
    private Integer voiceUsedThisHour;
    /**
     * Voice used today for the applicable messaging or voice capacity window.
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
     * Gets the capacityAvailable property value. Indicates whether Leadping successfully calculated capacity for this phone number.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCapacityAvailable() {
        return this.capacityAvailable;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("capacityAvailable", (n) -> { this.setCapacityAvailable(n.getBooleanValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(PhoneNumberOutboundHealthStatus::forValue)); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("phoneNumberId", (n) -> { this.setPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("smsDailyResetsAt", (n) -> { this.setSmsDailyResetsAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("smsHourlyResetsAt", (n) -> { this.setSmsHourlyResetsAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("smsLimitThisHour", (n) -> { this.setSmsLimitThisHour(n.getIntegerValue()); });
        deserializerMap.put("smsLimitToday", (n) -> { this.setSmsLimitToday(n.getIntegerValue()); });
        deserializerMap.put("smsRemainingThisHour", (n) -> { this.setSmsRemainingThisHour(n.getIntegerValue()); });
        deserializerMap.put("smsRemainingToday", (n) -> { this.setSmsRemainingToday(n.getIntegerValue()); });
        deserializerMap.put("smsUsedThisHour", (n) -> { this.setSmsUsedThisHour(n.getIntegerValue()); });
        deserializerMap.put("smsUsedToday", (n) -> { this.setSmsUsedToday(n.getIntegerValue()); });
        deserializerMap.put("voiceDailyResetsAt", (n) -> { this.setVoiceDailyResetsAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("voiceHourlyResetsAt", (n) -> { this.setVoiceHourlyResetsAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("voiceLimitThisHour", (n) -> { this.setVoiceLimitThisHour(n.getIntegerValue()); });
        deserializerMap.put("voiceLimitToday", (n) -> { this.setVoiceLimitToday(n.getIntegerValue()); });
        deserializerMap.put("voiceRemainingThisHour", (n) -> { this.setVoiceRemainingThisHour(n.getIntegerValue()); });
        deserializerMap.put("voiceRemainingToday", (n) -> { this.setVoiceRemainingToday(n.getIntegerValue()); });
        deserializerMap.put("voiceUsedThisHour", (n) -> { this.setVoiceUsedThisHour(n.getIntegerValue()); });
        deserializerMap.put("voiceUsedToday", (n) -> { this.setVoiceUsedToday(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthStatus property value. Current health status for this Leadping outbound phone number capacity.
     * @return a {@link PhoneNumberOutboundHealthStatus}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberOutboundHealthStatus getHealthStatus() {
        return this.healthStatus;
    }
    /**
     * Gets the phoneNumber property value. Phone number associated with this Leadping outbound phone number capacity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the phoneNumberId property value. Unique identifier of the phone number associated with this Leadping outbound phone number capacity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }
    /**
     * Gets the smsDailyResetsAt property value. Next midnight Eastern time, when SMS daily capacity resets.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSmsDailyResetsAt() {
        return this.smsDailyResetsAt;
    }
    /**
     * Gets the smsHourlyResetsAt property value. Start of the next Eastern time hour, when SMS hourly capacity resets.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getSmsHourlyResetsAt() {
        return this.smsHourlyResetsAt;
    }
    /**
     * Gets the smsLimitThisHour property value. Number of SMS limit this hour represented by this Leadping outbound phone number capacity.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsLimitThisHour() {
        return this.smsLimitThisHour;
    }
    /**
     * Gets the smsLimitToday property value. Number of SMS limit today represented by this Leadping outbound phone number capacity.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsLimitToday() {
        return this.smsLimitToday;
    }
    /**
     * Gets the smsRemainingThisHour property value. SMS remaining this hour for the applicable messaging or voice capacity window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsRemainingThisHour() {
        return this.smsRemainingThisHour;
    }
    /**
     * Gets the smsRemainingToday property value. SMS remaining today for the applicable messaging or voice capacity window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsRemainingToday() {
        return this.smsRemainingToday;
    }
    /**
     * Gets the smsUsedThisHour property value. SMS used this hour for the applicable messaging or voice capacity window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsUsedThisHour() {
        return this.smsUsedThisHour;
    }
    /**
     * Gets the smsUsedToday property value. SMS used today for the applicable messaging or voice capacity window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsUsedToday() {
        return this.smsUsedToday;
    }
    /**
     * Gets the voiceDailyResetsAt property value. Next midnight Eastern time, when voice daily capacity resets.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getVoiceDailyResetsAt() {
        return this.voiceDailyResetsAt;
    }
    /**
     * Gets the voiceHourlyResetsAt property value. Start of the next Eastern time hour, when voice hourly capacity resets.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getVoiceHourlyResetsAt() {
        return this.voiceHourlyResetsAt;
    }
    /**
     * Gets the voiceLimitThisHour property value. Voice limit this hour associated with this Leadping outbound phone number capacity.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVoiceLimitThisHour() {
        return this.voiceLimitThisHour;
    }
    /**
     * Gets the voiceLimitToday property value. Voice limit today associated with this Leadping outbound phone number capacity.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVoiceLimitToday() {
        return this.voiceLimitToday;
    }
    /**
     * Gets the voiceRemainingThisHour property value. Voice remaining this hour for the applicable messaging or voice capacity window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVoiceRemainingThisHour() {
        return this.voiceRemainingThisHour;
    }
    /**
     * Gets the voiceRemainingToday property value. Voice remaining today for the applicable messaging or voice capacity window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVoiceRemainingToday() {
        return this.voiceRemainingToday;
    }
    /**
     * Gets the voiceUsedThisHour property value. Voice used this hour for the applicable messaging or voice capacity window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVoiceUsedThisHour() {
        return this.voiceUsedThisHour;
    }
    /**
     * Gets the voiceUsedToday property value. Voice used today for the applicable messaging or voice capacity window.
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
        writer.writeBooleanValue("capacityAvailable", this.getCapacityAvailable());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeStringValue("phoneNumberId", this.getPhoneNumberId());
        writer.writeOffsetDateTimeValue("smsDailyResetsAt", this.getSmsDailyResetsAt());
        writer.writeOffsetDateTimeValue("smsHourlyResetsAt", this.getSmsHourlyResetsAt());
        writer.writeIntegerValue("smsLimitThisHour", this.getSmsLimitThisHour());
        writer.writeIntegerValue("smsLimitToday", this.getSmsLimitToday());
        writer.writeIntegerValue("smsRemainingThisHour", this.getSmsRemainingThisHour());
        writer.writeIntegerValue("smsRemainingToday", this.getSmsRemainingToday());
        writer.writeIntegerValue("smsUsedThisHour", this.getSmsUsedThisHour());
        writer.writeIntegerValue("smsUsedToday", this.getSmsUsedToday());
        writer.writeOffsetDateTimeValue("voiceDailyResetsAt", this.getVoiceDailyResetsAt());
        writer.writeOffsetDateTimeValue("voiceHourlyResetsAt", this.getVoiceHourlyResetsAt());
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
     * Sets the capacityAvailable property value. Indicates whether Leadping successfully calculated capacity for this phone number.
     * @param value Value to set for the capacityAvailable property.
     */
    public void setCapacityAvailable(@jakarta.annotation.Nullable final Boolean value) {
        this.capacityAvailable = value;
    }
    /**
     * Sets the healthStatus property value. Current health status for this Leadping outbound phone number capacity.
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final PhoneNumberOutboundHealthStatus value) {
        this.healthStatus = value;
    }
    /**
     * Sets the phoneNumber property value. Phone number associated with this Leadping outbound phone number capacity.
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the phoneNumberId property value. Unique identifier of the phone number associated with this Leadping outbound phone number capacity.
     * @param value Value to set for the phoneNumberId property.
     */
    public void setPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.phoneNumberId = value;
    }
    /**
     * Sets the smsDailyResetsAt property value. Next midnight Eastern time, when SMS daily capacity resets.
     * @param value Value to set for the smsDailyResetsAt property.
     */
    public void setSmsDailyResetsAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.smsDailyResetsAt = value;
    }
    /**
     * Sets the smsHourlyResetsAt property value. Start of the next Eastern time hour, when SMS hourly capacity resets.
     * @param value Value to set for the smsHourlyResetsAt property.
     */
    public void setSmsHourlyResetsAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.smsHourlyResetsAt = value;
    }
    /**
     * Sets the smsLimitThisHour property value. Number of SMS limit this hour represented by this Leadping outbound phone number capacity.
     * @param value Value to set for the smsLimitThisHour property.
     */
    public void setSmsLimitThisHour(@jakarta.annotation.Nullable final Integer value) {
        this.smsLimitThisHour = value;
    }
    /**
     * Sets the smsLimitToday property value. Number of SMS limit today represented by this Leadping outbound phone number capacity.
     * @param value Value to set for the smsLimitToday property.
     */
    public void setSmsLimitToday(@jakarta.annotation.Nullable final Integer value) {
        this.smsLimitToday = value;
    }
    /**
     * Sets the smsRemainingThisHour property value. SMS remaining this hour for the applicable messaging or voice capacity window.
     * @param value Value to set for the smsRemainingThisHour property.
     */
    public void setSmsRemainingThisHour(@jakarta.annotation.Nullable final Integer value) {
        this.smsRemainingThisHour = value;
    }
    /**
     * Sets the smsRemainingToday property value. SMS remaining today for the applicable messaging or voice capacity window.
     * @param value Value to set for the smsRemainingToday property.
     */
    public void setSmsRemainingToday(@jakarta.annotation.Nullable final Integer value) {
        this.smsRemainingToday = value;
    }
    /**
     * Sets the smsUsedThisHour property value. SMS used this hour for the applicable messaging or voice capacity window.
     * @param value Value to set for the smsUsedThisHour property.
     */
    public void setSmsUsedThisHour(@jakarta.annotation.Nullable final Integer value) {
        this.smsUsedThisHour = value;
    }
    /**
     * Sets the smsUsedToday property value. SMS used today for the applicable messaging or voice capacity window.
     * @param value Value to set for the smsUsedToday property.
     */
    public void setSmsUsedToday(@jakarta.annotation.Nullable final Integer value) {
        this.smsUsedToday = value;
    }
    /**
     * Sets the voiceDailyResetsAt property value. Next midnight Eastern time, when voice daily capacity resets.
     * @param value Value to set for the voiceDailyResetsAt property.
     */
    public void setVoiceDailyResetsAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.voiceDailyResetsAt = value;
    }
    /**
     * Sets the voiceHourlyResetsAt property value. Start of the next Eastern time hour, when voice hourly capacity resets.
     * @param value Value to set for the voiceHourlyResetsAt property.
     */
    public void setVoiceHourlyResetsAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.voiceHourlyResetsAt = value;
    }
    /**
     * Sets the voiceLimitThisHour property value. Voice limit this hour associated with this Leadping outbound phone number capacity.
     * @param value Value to set for the voiceLimitThisHour property.
     */
    public void setVoiceLimitThisHour(@jakarta.annotation.Nullable final Integer value) {
        this.voiceLimitThisHour = value;
    }
    /**
     * Sets the voiceLimitToday property value. Voice limit today associated with this Leadping outbound phone number capacity.
     * @param value Value to set for the voiceLimitToday property.
     */
    public void setVoiceLimitToday(@jakarta.annotation.Nullable final Integer value) {
        this.voiceLimitToday = value;
    }
    /**
     * Sets the voiceRemainingThisHour property value. Voice remaining this hour for the applicable messaging or voice capacity window.
     * @param value Value to set for the voiceRemainingThisHour property.
     */
    public void setVoiceRemainingThisHour(@jakarta.annotation.Nullable final Integer value) {
        this.voiceRemainingThisHour = value;
    }
    /**
     * Sets the voiceRemainingToday property value. Voice remaining today for the applicable messaging or voice capacity window.
     * @param value Value to set for the voiceRemainingToday property.
     */
    public void setVoiceRemainingToday(@jakarta.annotation.Nullable final Integer value) {
        this.voiceRemainingToday = value;
    }
    /**
     * Sets the voiceUsedThisHour property value. Voice used this hour for the applicable messaging or voice capacity window.
     * @param value Value to set for the voiceUsedThisHour property.
     */
    public void setVoiceUsedThisHour(@jakarta.annotation.Nullable final Integer value) {
        this.voiceUsedThisHour = value;
    }
    /**
     * Sets the voiceUsedToday property value. Voice used today for the applicable messaging or voice capacity window.
     * @param value Value to set for the voiceUsedToday property.
     */
    public void setVoiceUsedToday(@jakarta.annotation.Nullable final Integer value) {
        this.voiceUsedToday = value;
    }
}
