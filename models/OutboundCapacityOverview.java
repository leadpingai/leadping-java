package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents outbound capacity overview data used by Leadping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutboundCapacityOverview implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Total number of blocked records represented by this Leadping outbound capacity overview.
     */
    private Integer blockedCount;
    /**
     * Number of cooling phone numbers represented by this Leadping outbound capacity overview.
     */
    private Integer coolingPhoneNumbers;
    /**
     * Number of healthy phone numbers represented by this Leadping outbound capacity overview.
     */
    private Integer healthyPhoneNumbers;
    /**
     * Number of limited phone numbers represented by this Leadping outbound capacity overview.
     */
    private Integer limitedPhoneNumbers;
    /**
     * Collection of phone numbers included with this Leadping outbound capacity overview.
     */
    private java.util.List<OutboundPhoneNumberCapacity> phoneNumbers;
    /**
     * Collection of recent decisions included with this Leadping outbound capacity overview.
     */
    private java.util.List<OutboundQueueItem> recentDecisions;
    /**
     * Total number of scheduled records represented by this Leadping outbound capacity overview.
     */
    private Integer scheduledCount;
    /**
     * SMS capacity remaining today for the applicable messaging or voice capacity window.
     */
    private Integer smsCapacityRemainingToday;
    /**
     * Voice capacity remaining today for the applicable messaging or voice capacity window.
     */
    private Integer voiceCapacityRemainingToday;
    /**
     * Instantiates a new {@link OutboundCapacityOverview} and sets the default values.
     */
    public OutboundCapacityOverview() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OutboundCapacityOverview}
     */
    @jakarta.annotation.Nonnull
    public static OutboundCapacityOverview createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutboundCapacityOverview();
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
     * Gets the blockedCount property value. Total number of blocked records represented by this Leadping outbound capacity overview.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getBlockedCount() {
        return this.blockedCount;
    }
    /**
     * Gets the coolingPhoneNumbers property value. Number of cooling phone numbers represented by this Leadping outbound capacity overview.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCoolingPhoneNumbers() {
        return this.coolingPhoneNumbers;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("blockedCount", (n) -> { this.setBlockedCount(n.getIntegerValue()); });
        deserializerMap.put("coolingPhoneNumbers", (n) -> { this.setCoolingPhoneNumbers(n.getIntegerValue()); });
        deserializerMap.put("healthyPhoneNumbers", (n) -> { this.setHealthyPhoneNumbers(n.getIntegerValue()); });
        deserializerMap.put("limitedPhoneNumbers", (n) -> { this.setLimitedPhoneNumbers(n.getIntegerValue()); });
        deserializerMap.put("phoneNumbers", (n) -> { this.setPhoneNumbers(n.getCollectionOfObjectValues(OutboundPhoneNumberCapacity::createFromDiscriminatorValue)); });
        deserializerMap.put("recentDecisions", (n) -> { this.setRecentDecisions(n.getCollectionOfObjectValues(OutboundQueueItem::createFromDiscriminatorValue)); });
        deserializerMap.put("scheduledCount", (n) -> { this.setScheduledCount(n.getIntegerValue()); });
        deserializerMap.put("smsCapacityRemainingToday", (n) -> { this.setSmsCapacityRemainingToday(n.getIntegerValue()); });
        deserializerMap.put("voiceCapacityRemainingToday", (n) -> { this.setVoiceCapacityRemainingToday(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the healthyPhoneNumbers property value. Number of healthy phone numbers represented by this Leadping outbound capacity overview.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHealthyPhoneNumbers() {
        return this.healthyPhoneNumbers;
    }
    /**
     * Gets the limitedPhoneNumbers property value. Number of limited phone numbers represented by this Leadping outbound capacity overview.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimitedPhoneNumbers() {
        return this.limitedPhoneNumbers;
    }
    /**
     * Gets the phoneNumbers property value. Collection of phone numbers included with this Leadping outbound capacity overview.
     * @return a {@link java.util.List<OutboundPhoneNumberCapacity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OutboundPhoneNumberCapacity> getPhoneNumbers() {
        return this.phoneNumbers;
    }
    /**
     * Gets the recentDecisions property value. Collection of recent decisions included with this Leadping outbound capacity overview.
     * @return a {@link java.util.List<OutboundQueueItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OutboundQueueItem> getRecentDecisions() {
        return this.recentDecisions;
    }
    /**
     * Gets the scheduledCount property value. Total number of scheduled records represented by this Leadping outbound capacity overview.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getScheduledCount() {
        return this.scheduledCount;
    }
    /**
     * Gets the smsCapacityRemainingToday property value. SMS capacity remaining today for the applicable messaging or voice capacity window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsCapacityRemainingToday() {
        return this.smsCapacityRemainingToday;
    }
    /**
     * Gets the voiceCapacityRemainingToday property value. Voice capacity remaining today for the applicable messaging or voice capacity window.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVoiceCapacityRemainingToday() {
        return this.voiceCapacityRemainingToday;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("blockedCount", this.getBlockedCount());
        writer.writeIntegerValue("coolingPhoneNumbers", this.getCoolingPhoneNumbers());
        writer.writeIntegerValue("healthyPhoneNumbers", this.getHealthyPhoneNumbers());
        writer.writeIntegerValue("limitedPhoneNumbers", this.getLimitedPhoneNumbers());
        writer.writeCollectionOfObjectValues("phoneNumbers", this.getPhoneNumbers());
        writer.writeCollectionOfObjectValues("recentDecisions", this.getRecentDecisions());
        writer.writeIntegerValue("scheduledCount", this.getScheduledCount());
        writer.writeIntegerValue("smsCapacityRemainingToday", this.getSmsCapacityRemainingToday());
        writer.writeIntegerValue("voiceCapacityRemainingToday", this.getVoiceCapacityRemainingToday());
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
     * Sets the blockedCount property value. Total number of blocked records represented by this Leadping outbound capacity overview.
     * @param value Value to set for the blockedCount property.
     */
    public void setBlockedCount(@jakarta.annotation.Nullable final Integer value) {
        this.blockedCount = value;
    }
    /**
     * Sets the coolingPhoneNumbers property value. Number of cooling phone numbers represented by this Leadping outbound capacity overview.
     * @param value Value to set for the coolingPhoneNumbers property.
     */
    public void setCoolingPhoneNumbers(@jakarta.annotation.Nullable final Integer value) {
        this.coolingPhoneNumbers = value;
    }
    /**
     * Sets the healthyPhoneNumbers property value. Number of healthy phone numbers represented by this Leadping outbound capacity overview.
     * @param value Value to set for the healthyPhoneNumbers property.
     */
    public void setHealthyPhoneNumbers(@jakarta.annotation.Nullable final Integer value) {
        this.healthyPhoneNumbers = value;
    }
    /**
     * Sets the limitedPhoneNumbers property value. Number of limited phone numbers represented by this Leadping outbound capacity overview.
     * @param value Value to set for the limitedPhoneNumbers property.
     */
    public void setLimitedPhoneNumbers(@jakarta.annotation.Nullable final Integer value) {
        this.limitedPhoneNumbers = value;
    }
    /**
     * Sets the phoneNumbers property value. Collection of phone numbers included with this Leadping outbound capacity overview.
     * @param value Value to set for the phoneNumbers property.
     */
    public void setPhoneNumbers(@jakarta.annotation.Nullable final java.util.List<OutboundPhoneNumberCapacity> value) {
        this.phoneNumbers = value;
    }
    /**
     * Sets the recentDecisions property value. Collection of recent decisions included with this Leadping outbound capacity overview.
     * @param value Value to set for the recentDecisions property.
     */
    public void setRecentDecisions(@jakarta.annotation.Nullable final java.util.List<OutboundQueueItem> value) {
        this.recentDecisions = value;
    }
    /**
     * Sets the scheduledCount property value. Total number of scheduled records represented by this Leadping outbound capacity overview.
     * @param value Value to set for the scheduledCount property.
     */
    public void setScheduledCount(@jakarta.annotation.Nullable final Integer value) {
        this.scheduledCount = value;
    }
    /**
     * Sets the smsCapacityRemainingToday property value. SMS capacity remaining today for the applicable messaging or voice capacity window.
     * @param value Value to set for the smsCapacityRemainingToday property.
     */
    public void setSmsCapacityRemainingToday(@jakarta.annotation.Nullable final Integer value) {
        this.smsCapacityRemainingToday = value;
    }
    /**
     * Sets the voiceCapacityRemainingToday property value. Voice capacity remaining today for the applicable messaging or voice capacity window.
     * @param value Value to set for the voiceCapacityRemainingToday property.
     */
    public void setVoiceCapacityRemainingToday(@jakarta.annotation.Nullable final Integer value) {
        this.voiceCapacityRemainingToday = value;
    }
}
