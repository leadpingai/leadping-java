package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * API response containing voice call warmup status for a Leadping-managed phone number.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberWarmupStatusResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The callsThisHour property
     */
    private Integer callsThisHour;
    /**
     * The callsToday property
     */
    private Integer callsToday;
    /**
     * The completedAt property
     */
    private OffsetDateTime completedAt;
    /**
     * The consecutiveFailedCalls property
     */
    private Integer consecutiveFailedCalls;
    /**
     * The consecutiveSuccessfulCalls property
     */
    private Integer consecutiveSuccessfulCalls;
    /**
     * The dailyCap property
     */
    private Integer dailyCap;
    /**
     * The eligibilityReasons property
     */
    private UntypedNode eligibilityReasons;
    /**
     * The failureReason property
     */
    private String failureReason;
    /**
     * The hourlyCap property
     */
    private Integer hourlyCap;
    /**
     * The lastSuccessfulWarmupAt property
     */
    private OffsetDateTime lastSuccessfulWarmupAt;
    /**
     * The lowConfidenceTimeZone property
     */
    private Boolean lowConfidenceTimeZone;
    /**
     * The maxTargetDurationSeconds property
     */
    private Integer maxTargetDurationSeconds;
    /**
     * The minTargetDurationSeconds property
     */
    private Integer minTargetDurationSeconds;
    /**
     * The networkWarmupOptIn property
     */
    private Boolean networkWarmupOptIn;
    /**
     * The nextEligibleAt property
     */
    private OffsetDateTime nextEligibleAt;
    /**
     * The phoneNumber property
     */
    private String phoneNumber;
    /**
     * The phoneNumberId property
     */
    private String phoneNumberId;
    /**
     * The recentCalls property
     */
    private java.util.List<PhoneNumberWarmupCallResponse> recentCalls;
    /**
     * Defines the supported voice call warmup stages for a Leadping-managed phone number.
     */
    private PhoneNumberWarmupStage stage;
    /**
     * The startAt property
     */
    private OffsetDateTime startAt;
    /**
     * Defines the supported health states for controlled internal voice call warmup.
     */
    private PhoneNumberWarmupHealthStatus status;
    /**
     * The timeZoneId property
     */
    private String timeZoneId;
    /**
     * The totalFailedCalls property
     */
    private Integer totalFailedCalls;
    /**
     * The totalSuccessfulCalls property
     */
    private Integer totalSuccessfulCalls;
    /**
     * The warmupEnabled property
     */
    private Boolean warmupEnabled;
    /**
     * Instantiates a new {@link PhoneNumberWarmupStatusResponse} and sets the default values.
     */
    public PhoneNumberWarmupStatusResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberWarmupStatusResponse}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberWarmupStatusResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberWarmupStatusResponse();
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
     * Gets the callsThisHour property value. The callsThisHour property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCallsThisHour() {
        return this.callsThisHour;
    }
    /**
     * Gets the callsToday property value. The callsToday property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCallsToday() {
        return this.callsToday;
    }
    /**
     * Gets the completedAt property value. The completedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedAt() {
        return this.completedAt;
    }
    /**
     * Gets the consecutiveFailedCalls property value. The consecutiveFailedCalls property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getConsecutiveFailedCalls() {
        return this.consecutiveFailedCalls;
    }
    /**
     * Gets the consecutiveSuccessfulCalls property value. The consecutiveSuccessfulCalls property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getConsecutiveSuccessfulCalls() {
        return this.consecutiveSuccessfulCalls;
    }
    /**
     * Gets the dailyCap property value. The dailyCap property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDailyCap() {
        return this.dailyCap;
    }
    /**
     * Gets the eligibilityReasons property value. The eligibilityReasons property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getEligibilityReasons() {
        return this.eligibilityReasons;
    }
    /**
     * Gets the failureReason property value. The failureReason property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFailureReason() {
        return this.failureReason;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(25);
        deserializerMap.put("callsThisHour", (n) -> { this.setCallsThisHour(n.getIntegerValue()); });
        deserializerMap.put("callsToday", (n) -> { this.setCallsToday(n.getIntegerValue()); });
        deserializerMap.put("completedAt", (n) -> { this.setCompletedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("consecutiveFailedCalls", (n) -> { this.setConsecutiveFailedCalls(n.getIntegerValue()); });
        deserializerMap.put("consecutiveSuccessfulCalls", (n) -> { this.setConsecutiveSuccessfulCalls(n.getIntegerValue()); });
        deserializerMap.put("dailyCap", (n) -> { this.setDailyCap(n.getIntegerValue()); });
        deserializerMap.put("eligibilityReasons", (n) -> { this.setEligibilityReasons(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("failureReason", (n) -> { this.setFailureReason(n.getStringValue()); });
        deserializerMap.put("hourlyCap", (n) -> { this.setHourlyCap(n.getIntegerValue()); });
        deserializerMap.put("lastSuccessfulWarmupAt", (n) -> { this.setLastSuccessfulWarmupAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lowConfidenceTimeZone", (n) -> { this.setLowConfidenceTimeZone(n.getBooleanValue()); });
        deserializerMap.put("maxTargetDurationSeconds", (n) -> { this.setMaxTargetDurationSeconds(n.getIntegerValue()); });
        deserializerMap.put("minTargetDurationSeconds", (n) -> { this.setMinTargetDurationSeconds(n.getIntegerValue()); });
        deserializerMap.put("networkWarmupOptIn", (n) -> { this.setNetworkWarmupOptIn(n.getBooleanValue()); });
        deserializerMap.put("nextEligibleAt", (n) -> { this.setNextEligibleAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("phoneNumberId", (n) -> { this.setPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("recentCalls", (n) -> { this.setRecentCalls(n.getCollectionOfObjectValues(PhoneNumberWarmupCallResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("stage", (n) -> { this.setStage(n.getEnumValue(PhoneNumberWarmupStage::forValue)); });
        deserializerMap.put("startAt", (n) -> { this.setStartAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(PhoneNumberWarmupHealthStatus::forValue)); });
        deserializerMap.put("timeZoneId", (n) -> { this.setTimeZoneId(n.getStringValue()); });
        deserializerMap.put("totalFailedCalls", (n) -> { this.setTotalFailedCalls(n.getIntegerValue()); });
        deserializerMap.put("totalSuccessfulCalls", (n) -> { this.setTotalSuccessfulCalls(n.getIntegerValue()); });
        deserializerMap.put("warmupEnabled", (n) -> { this.setWarmupEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hourlyCap property value. The hourlyCap property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHourlyCap() {
        return this.hourlyCap;
    }
    /**
     * Gets the lastSuccessfulWarmupAt property value. The lastSuccessfulWarmupAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSuccessfulWarmupAt() {
        return this.lastSuccessfulWarmupAt;
    }
    /**
     * Gets the lowConfidenceTimeZone property value. The lowConfidenceTimeZone property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLowConfidenceTimeZone() {
        return this.lowConfidenceTimeZone;
    }
    /**
     * Gets the maxTargetDurationSeconds property value. The maxTargetDurationSeconds property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxTargetDurationSeconds() {
        return this.maxTargetDurationSeconds;
    }
    /**
     * Gets the minTargetDurationSeconds property value. The minTargetDurationSeconds property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinTargetDurationSeconds() {
        return this.minTargetDurationSeconds;
    }
    /**
     * Gets the networkWarmupOptIn property value. The networkWarmupOptIn property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNetworkWarmupOptIn() {
        return this.networkWarmupOptIn;
    }
    /**
     * Gets the nextEligibleAt property value. The nextEligibleAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextEligibleAt() {
        return this.nextEligibleAt;
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
     * Gets the recentCalls property value. The recentCalls property
     * @return a {@link java.util.List<PhoneNumberWarmupCallResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PhoneNumberWarmupCallResponse> getRecentCalls() {
        return this.recentCalls;
    }
    /**
     * Gets the stage property value. Defines the supported voice call warmup stages for a Leadping-managed phone number.
     * @return a {@link PhoneNumberWarmupStage}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberWarmupStage getStage() {
        return this.stage;
    }
    /**
     * Gets the startAt property value. The startAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartAt() {
        return this.startAt;
    }
    /**
     * Gets the status property value. Defines the supported health states for controlled internal voice call warmup.
     * @return a {@link PhoneNumberWarmupHealthStatus}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberWarmupHealthStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the timeZoneId property value. The timeZoneId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTimeZoneId() {
        return this.timeZoneId;
    }
    /**
     * Gets the totalFailedCalls property value. The totalFailedCalls property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalFailedCalls() {
        return this.totalFailedCalls;
    }
    /**
     * Gets the totalSuccessfulCalls property value. The totalSuccessfulCalls property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalSuccessfulCalls() {
        return this.totalSuccessfulCalls;
    }
    /**
     * Gets the warmupEnabled property value. The warmupEnabled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWarmupEnabled() {
        return this.warmupEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("callsThisHour", this.getCallsThisHour());
        writer.writeIntegerValue("callsToday", this.getCallsToday());
        writer.writeOffsetDateTimeValue("completedAt", this.getCompletedAt());
        writer.writeIntegerValue("consecutiveFailedCalls", this.getConsecutiveFailedCalls());
        writer.writeIntegerValue("consecutiveSuccessfulCalls", this.getConsecutiveSuccessfulCalls());
        writer.writeIntegerValue("dailyCap", this.getDailyCap());
        writer.writeObjectValue("eligibilityReasons", this.getEligibilityReasons());
        writer.writeStringValue("failureReason", this.getFailureReason());
        writer.writeIntegerValue("hourlyCap", this.getHourlyCap());
        writer.writeOffsetDateTimeValue("lastSuccessfulWarmupAt", this.getLastSuccessfulWarmupAt());
        writer.writeBooleanValue("lowConfidenceTimeZone", this.getLowConfidenceTimeZone());
        writer.writeIntegerValue("maxTargetDurationSeconds", this.getMaxTargetDurationSeconds());
        writer.writeIntegerValue("minTargetDurationSeconds", this.getMinTargetDurationSeconds());
        writer.writeBooleanValue("networkWarmupOptIn", this.getNetworkWarmupOptIn());
        writer.writeOffsetDateTimeValue("nextEligibleAt", this.getNextEligibleAt());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeStringValue("phoneNumberId", this.getPhoneNumberId());
        writer.writeCollectionOfObjectValues("recentCalls", this.getRecentCalls());
        writer.writeEnumValue("stage", this.getStage());
        writer.writeOffsetDateTimeValue("startAt", this.getStartAt());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("timeZoneId", this.getTimeZoneId());
        writer.writeIntegerValue("totalFailedCalls", this.getTotalFailedCalls());
        writer.writeIntegerValue("totalSuccessfulCalls", this.getTotalSuccessfulCalls());
        writer.writeBooleanValue("warmupEnabled", this.getWarmupEnabled());
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
     * Sets the callsThisHour property value. The callsThisHour property
     * @param value Value to set for the callsThisHour property.
     */
    public void setCallsThisHour(@jakarta.annotation.Nullable final Integer value) {
        this.callsThisHour = value;
    }
    /**
     * Sets the callsToday property value. The callsToday property
     * @param value Value to set for the callsToday property.
     */
    public void setCallsToday(@jakarta.annotation.Nullable final Integer value) {
        this.callsToday = value;
    }
    /**
     * Sets the completedAt property value. The completedAt property
     * @param value Value to set for the completedAt property.
     */
    public void setCompletedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completedAt = value;
    }
    /**
     * Sets the consecutiveFailedCalls property value. The consecutiveFailedCalls property
     * @param value Value to set for the consecutiveFailedCalls property.
     */
    public void setConsecutiveFailedCalls(@jakarta.annotation.Nullable final Integer value) {
        this.consecutiveFailedCalls = value;
    }
    /**
     * Sets the consecutiveSuccessfulCalls property value. The consecutiveSuccessfulCalls property
     * @param value Value to set for the consecutiveSuccessfulCalls property.
     */
    public void setConsecutiveSuccessfulCalls(@jakarta.annotation.Nullable final Integer value) {
        this.consecutiveSuccessfulCalls = value;
    }
    /**
     * Sets the dailyCap property value. The dailyCap property
     * @param value Value to set for the dailyCap property.
     */
    public void setDailyCap(@jakarta.annotation.Nullable final Integer value) {
        this.dailyCap = value;
    }
    /**
     * Sets the eligibilityReasons property value. The eligibilityReasons property
     * @param value Value to set for the eligibilityReasons property.
     */
    public void setEligibilityReasons(@jakarta.annotation.Nullable final UntypedNode value) {
        this.eligibilityReasons = value;
    }
    /**
     * Sets the failureReason property value. The failureReason property
     * @param value Value to set for the failureReason property.
     */
    public void setFailureReason(@jakarta.annotation.Nullable final String value) {
        this.failureReason = value;
    }
    /**
     * Sets the hourlyCap property value. The hourlyCap property
     * @param value Value to set for the hourlyCap property.
     */
    public void setHourlyCap(@jakarta.annotation.Nullable final Integer value) {
        this.hourlyCap = value;
    }
    /**
     * Sets the lastSuccessfulWarmupAt property value. The lastSuccessfulWarmupAt property
     * @param value Value to set for the lastSuccessfulWarmupAt property.
     */
    public void setLastSuccessfulWarmupAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSuccessfulWarmupAt = value;
    }
    /**
     * Sets the lowConfidenceTimeZone property value. The lowConfidenceTimeZone property
     * @param value Value to set for the lowConfidenceTimeZone property.
     */
    public void setLowConfidenceTimeZone(@jakarta.annotation.Nullable final Boolean value) {
        this.lowConfidenceTimeZone = value;
    }
    /**
     * Sets the maxTargetDurationSeconds property value. The maxTargetDurationSeconds property
     * @param value Value to set for the maxTargetDurationSeconds property.
     */
    public void setMaxTargetDurationSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.maxTargetDurationSeconds = value;
    }
    /**
     * Sets the minTargetDurationSeconds property value. The minTargetDurationSeconds property
     * @param value Value to set for the minTargetDurationSeconds property.
     */
    public void setMinTargetDurationSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.minTargetDurationSeconds = value;
    }
    /**
     * Sets the networkWarmupOptIn property value. The networkWarmupOptIn property
     * @param value Value to set for the networkWarmupOptIn property.
     */
    public void setNetworkWarmupOptIn(@jakarta.annotation.Nullable final Boolean value) {
        this.networkWarmupOptIn = value;
    }
    /**
     * Sets the nextEligibleAt property value. The nextEligibleAt property
     * @param value Value to set for the nextEligibleAt property.
     */
    public void setNextEligibleAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.nextEligibleAt = value;
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
     * Sets the recentCalls property value. The recentCalls property
     * @param value Value to set for the recentCalls property.
     */
    public void setRecentCalls(@jakarta.annotation.Nullable final java.util.List<PhoneNumberWarmupCallResponse> value) {
        this.recentCalls = value;
    }
    /**
     * Sets the stage property value. Defines the supported voice call warmup stages for a Leadping-managed phone number.
     * @param value Value to set for the stage property.
     */
    public void setStage(@jakarta.annotation.Nullable final PhoneNumberWarmupStage value) {
        this.stage = value;
    }
    /**
     * Sets the startAt property value. The startAt property
     * @param value Value to set for the startAt property.
     */
    public void setStartAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startAt = value;
    }
    /**
     * Sets the status property value. Defines the supported health states for controlled internal voice call warmup.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final PhoneNumberWarmupHealthStatus value) {
        this.status = value;
    }
    /**
     * Sets the timeZoneId property value. The timeZoneId property
     * @param value Value to set for the timeZoneId property.
     */
    public void setTimeZoneId(@jakarta.annotation.Nullable final String value) {
        this.timeZoneId = value;
    }
    /**
     * Sets the totalFailedCalls property value. The totalFailedCalls property
     * @param value Value to set for the totalFailedCalls property.
     */
    public void setTotalFailedCalls(@jakarta.annotation.Nullable final Integer value) {
        this.totalFailedCalls = value;
    }
    /**
     * Sets the totalSuccessfulCalls property value. The totalSuccessfulCalls property
     * @param value Value to set for the totalSuccessfulCalls property.
     */
    public void setTotalSuccessfulCalls(@jakarta.annotation.Nullable final Integer value) {
        this.totalSuccessfulCalls = value;
    }
    /**
     * Sets the warmupEnabled property value. The warmupEnabled property
     * @param value Value to set for the warmupEnabled property.
     */
    public void setWarmupEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.warmupEnabled = value;
    }
}
