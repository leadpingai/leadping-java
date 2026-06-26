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
 * API response containing SMS warmup status data returned to callers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SmsWarmupStatusResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The human-readable block reason explaining this SMS warmup status.
     */
    private String blockReason;
    /**
     * Whether the caller can pause this SMS warmup status.
     */
    private Boolean canPause;
    /**
     * Whether the caller can resume this SMS warmup status.
     */
    private Boolean canResume;
    /**
     * The carrier rejection count for this SMS warmup status.
     */
    private Integer carrierRejectionCount;
    /**
     * The date and time for the completed at value on this SMS warmup status.
     */
    private OffsetDateTime completedAt;
    /**
     * The delivered count for this SMS warmup status.
     */
    private Integer deliveredCount;
    /**
     * The delivery success rate metric for this SMS warmup status.
     */
    private Double deliverySuccessRate;
    /**
     * The failure count for this SMS warmup status.
     */
    private Integer failureCount;
    /**
     * Whether global warmup is enabled for this SMS warmup status.
     */
    private Boolean globalWarmupEnabled;
    /**
     * The health score metric for this SMS warmup status.
     */
    private Integer healthScore;
    /**
     * Whether this SMS warmup status is approved test destination.
     */
    private Boolean isApprovedTestDestination;
    /**
     * Whether this SMS warmup status is internal pool.
     */
    private Boolean isInternalPool;
    /**
     * Whether this SMS warmup status is messaging program approved.
     */
    private Boolean isMessagingProgramApproved;
    /**
     * The date and time for the last health snapshot at value on this SMS warmup status.
     */
    private OffsetDateTime lastHealthSnapshotAt;
    /**
     * The date and time for the last successful message at value on this SMS warmup status.
     */
    private OffsetDateTime lastSuccessfulMessageAt;
    /**
     * The date and time for the next scheduled action at value on this SMS warmup status.
     */
    private OffsetDateTime nextScheduledActionAt;
    /**
     * The opt out signal count for this SMS warmup status.
     */
    private Integer optOutSignalCount;
    /**
     * The human-readable pause reason explaining this SMS warmup status.
     */
    private String pauseReason;
    /**
     * The phone number associated with this SMS warmup status.
     */
    private String phoneNumber;
    /**
     * The phone number ID associated with this SMS warmup status.
     */
    private String phoneNumberId;
    /**
     * The progress percent metric for this SMS warmup status.
     */
    private Integer progressPercent;
    /**
     * The received count for this SMS warmup status.
     */
    private Integer receivedCount;
    /**
     * The recent actions included with this SMS warmup status.
     */
    private java.util.List<SmsWarmupActionResponse> recentActions;
    /**
     * The sent count for this SMS warmup status.
     */
    private Integer sentCount;
    /**
     * The spam signal count for this SMS warmup status.
     */
    private Integer spamSignalCount;
    /**
     * The date and time for the started at value on this SMS warmup status.
     */
    private OffsetDateTime startedAt;
    /**
     * The current status for this SMS warmup status.
     */
    private SmsWarmupHealthState status;
    /**
     * The current UI state for this SMS warmup status.
     */
    private SmsWarmupUiState uiState;
    /**
     * Whether warmup is enabled for this SMS warmup status.
     */
    private Boolean warmupEnabled;
    /**
     * Instantiates a new {@link SmsWarmupStatusResponse} and sets the default values.
     */
    public SmsWarmupStatusResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SmsWarmupStatusResponse}
     */
    @jakarta.annotation.Nonnull
    public static SmsWarmupStatusResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SmsWarmupStatusResponse();
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
     * Gets the blockReason property value. The human-readable block reason explaining this SMS warmup status.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBlockReason() {
        return this.blockReason;
    }
    /**
     * Gets the canPause property value. Whether the caller can pause this SMS warmup status.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCanPause() {
        return this.canPause;
    }
    /**
     * Gets the canResume property value. Whether the caller can resume this SMS warmup status.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCanResume() {
        return this.canResume;
    }
    /**
     * Gets the carrierRejectionCount property value. The carrier rejection count for this SMS warmup status.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCarrierRejectionCount() {
        return this.carrierRejectionCount;
    }
    /**
     * Gets the completedAt property value. The date and time for the completed at value on this SMS warmup status.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedAt() {
        return this.completedAt;
    }
    /**
     * Gets the deliveredCount property value. The delivered count for this SMS warmup status.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDeliveredCount() {
        return this.deliveredCount;
    }
    /**
     * Gets the deliverySuccessRate property value. The delivery success rate metric for this SMS warmup status.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getDeliverySuccessRate() {
        return this.deliverySuccessRate;
    }
    /**
     * Gets the failureCount property value. The failure count for this SMS warmup status.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailureCount() {
        return this.failureCount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(29);
        deserializerMap.put("blockReason", (n) -> { this.setBlockReason(n.getStringValue()); });
        deserializerMap.put("canPause", (n) -> { this.setCanPause(n.getBooleanValue()); });
        deserializerMap.put("canResume", (n) -> { this.setCanResume(n.getBooleanValue()); });
        deserializerMap.put("carrierRejectionCount", (n) -> { this.setCarrierRejectionCount(n.getIntegerValue()); });
        deserializerMap.put("completedAt", (n) -> { this.setCompletedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deliveredCount", (n) -> { this.setDeliveredCount(n.getIntegerValue()); });
        deserializerMap.put("deliverySuccessRate", (n) -> { this.setDeliverySuccessRate(n.getDoubleValue()); });
        deserializerMap.put("failureCount", (n) -> { this.setFailureCount(n.getIntegerValue()); });
        deserializerMap.put("globalWarmupEnabled", (n) -> { this.setGlobalWarmupEnabled(n.getBooleanValue()); });
        deserializerMap.put("healthScore", (n) -> { this.setHealthScore(n.getIntegerValue()); });
        deserializerMap.put("isApprovedTestDestination", (n) -> { this.setIsApprovedTestDestination(n.getBooleanValue()); });
        deserializerMap.put("isInternalPool", (n) -> { this.setIsInternalPool(n.getBooleanValue()); });
        deserializerMap.put("isMessagingProgramApproved", (n) -> { this.setIsMessagingProgramApproved(n.getBooleanValue()); });
        deserializerMap.put("lastHealthSnapshotAt", (n) -> { this.setLastHealthSnapshotAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSuccessfulMessageAt", (n) -> { this.setLastSuccessfulMessageAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("nextScheduledActionAt", (n) -> { this.setNextScheduledActionAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("optOutSignalCount", (n) -> { this.setOptOutSignalCount(n.getIntegerValue()); });
        deserializerMap.put("pauseReason", (n) -> { this.setPauseReason(n.getStringValue()); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("phoneNumberId", (n) -> { this.setPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("progressPercent", (n) -> { this.setProgressPercent(n.getIntegerValue()); });
        deserializerMap.put("receivedCount", (n) -> { this.setReceivedCount(n.getIntegerValue()); });
        deserializerMap.put("recentActions", (n) -> { this.setRecentActions(n.getCollectionOfObjectValues(SmsWarmupActionResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("sentCount", (n) -> { this.setSentCount(n.getIntegerValue()); });
        deserializerMap.put("spamSignalCount", (n) -> { this.setSpamSignalCount(n.getIntegerValue()); });
        deserializerMap.put("startedAt", (n) -> { this.setStartedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SmsWarmupHealthState::forValue)); });
        deserializerMap.put("uiState", (n) -> { this.setUiState(n.getObjectValue(SmsWarmupUiState::createFromDiscriminatorValue)); });
        deserializerMap.put("warmupEnabled", (n) -> { this.setWarmupEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the globalWarmupEnabled property value. Whether global warmup is enabled for this SMS warmup status.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGlobalWarmupEnabled() {
        return this.globalWarmupEnabled;
    }
    /**
     * Gets the healthScore property value. The health score metric for this SMS warmup status.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHealthScore() {
        return this.healthScore;
    }
    /**
     * Gets the isApprovedTestDestination property value. Whether this SMS warmup status is approved test destination.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsApprovedTestDestination() {
        return this.isApprovedTestDestination;
    }
    /**
     * Gets the isInternalPool property value. Whether this SMS warmup status is internal pool.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsInternalPool() {
        return this.isInternalPool;
    }
    /**
     * Gets the isMessagingProgramApproved property value. Whether this SMS warmup status is messaging program approved.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMessagingProgramApproved() {
        return this.isMessagingProgramApproved;
    }
    /**
     * Gets the lastHealthSnapshotAt property value. The date and time for the last health snapshot at value on this SMS warmup status.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastHealthSnapshotAt() {
        return this.lastHealthSnapshotAt;
    }
    /**
     * Gets the lastSuccessfulMessageAt property value. The date and time for the last successful message at value on this SMS warmup status.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSuccessfulMessageAt() {
        return this.lastSuccessfulMessageAt;
    }
    /**
     * Gets the nextScheduledActionAt property value. The date and time for the next scheduled action at value on this SMS warmup status.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextScheduledActionAt() {
        return this.nextScheduledActionAt;
    }
    /**
     * Gets the optOutSignalCount property value. The opt out signal count for this SMS warmup status.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOptOutSignalCount() {
        return this.optOutSignalCount;
    }
    /**
     * Gets the pauseReason property value. The human-readable pause reason explaining this SMS warmup status.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPauseReason() {
        return this.pauseReason;
    }
    /**
     * Gets the phoneNumber property value. The phone number associated with this SMS warmup status.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the phoneNumberId property value. The phone number ID associated with this SMS warmup status.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }
    /**
     * Gets the progressPercent property value. The progress percent metric for this SMS warmup status.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getProgressPercent() {
        return this.progressPercent;
    }
    /**
     * Gets the receivedCount property value. The received count for this SMS warmup status.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getReceivedCount() {
        return this.receivedCount;
    }
    /**
     * Gets the recentActions property value. The recent actions included with this SMS warmup status.
     * @return a {@link java.util.List<SmsWarmupActionResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SmsWarmupActionResponse> getRecentActions() {
        return this.recentActions;
    }
    /**
     * Gets the sentCount property value. The sent count for this SMS warmup status.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSentCount() {
        return this.sentCount;
    }
    /**
     * Gets the spamSignalCount property value. The spam signal count for this SMS warmup status.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSpamSignalCount() {
        return this.spamSignalCount;
    }
    /**
     * Gets the startedAt property value. The date and time for the started at value on this SMS warmup status.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartedAt() {
        return this.startedAt;
    }
    /**
     * Gets the status property value. The current status for this SMS warmup status.
     * @return a {@link SmsWarmupHealthState}
     */
    @jakarta.annotation.Nullable
    public SmsWarmupHealthState getStatus() {
        return this.status;
    }
    /**
     * Gets the uiState property value. The current UI state for this SMS warmup status.
     * @return a {@link SmsWarmupUiState}
     */
    @jakarta.annotation.Nullable
    public SmsWarmupUiState getUiState() {
        return this.uiState;
    }
    /**
     * Gets the warmupEnabled property value. Whether warmup is enabled for this SMS warmup status.
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
        writer.writeStringValue("blockReason", this.getBlockReason());
        writer.writeBooleanValue("canPause", this.getCanPause());
        writer.writeBooleanValue("canResume", this.getCanResume());
        writer.writeIntegerValue("carrierRejectionCount", this.getCarrierRejectionCount());
        writer.writeOffsetDateTimeValue("completedAt", this.getCompletedAt());
        writer.writeIntegerValue("deliveredCount", this.getDeliveredCount());
        writer.writeDoubleValue("deliverySuccessRate", this.getDeliverySuccessRate());
        writer.writeIntegerValue("failureCount", this.getFailureCount());
        writer.writeBooleanValue("globalWarmupEnabled", this.getGlobalWarmupEnabled());
        writer.writeIntegerValue("healthScore", this.getHealthScore());
        writer.writeBooleanValue("isApprovedTestDestination", this.getIsApprovedTestDestination());
        writer.writeBooleanValue("isInternalPool", this.getIsInternalPool());
        writer.writeBooleanValue("isMessagingProgramApproved", this.getIsMessagingProgramApproved());
        writer.writeOffsetDateTimeValue("lastHealthSnapshotAt", this.getLastHealthSnapshotAt());
        writer.writeOffsetDateTimeValue("lastSuccessfulMessageAt", this.getLastSuccessfulMessageAt());
        writer.writeOffsetDateTimeValue("nextScheduledActionAt", this.getNextScheduledActionAt());
        writer.writeIntegerValue("optOutSignalCount", this.getOptOutSignalCount());
        writer.writeStringValue("pauseReason", this.getPauseReason());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeStringValue("phoneNumberId", this.getPhoneNumberId());
        writer.writeIntegerValue("progressPercent", this.getProgressPercent());
        writer.writeIntegerValue("receivedCount", this.getReceivedCount());
        writer.writeCollectionOfObjectValues("recentActions", this.getRecentActions());
        writer.writeIntegerValue("sentCount", this.getSentCount());
        writer.writeIntegerValue("spamSignalCount", this.getSpamSignalCount());
        writer.writeOffsetDateTimeValue("startedAt", this.getStartedAt());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeObjectValue("uiState", this.getUiState());
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
     * Sets the blockReason property value. The human-readable block reason explaining this SMS warmup status.
     * @param value Value to set for the blockReason property.
     */
    public void setBlockReason(@jakarta.annotation.Nullable final String value) {
        this.blockReason = value;
    }
    /**
     * Sets the canPause property value. Whether the caller can pause this SMS warmup status.
     * @param value Value to set for the canPause property.
     */
    public void setCanPause(@jakarta.annotation.Nullable final Boolean value) {
        this.canPause = value;
    }
    /**
     * Sets the canResume property value. Whether the caller can resume this SMS warmup status.
     * @param value Value to set for the canResume property.
     */
    public void setCanResume(@jakarta.annotation.Nullable final Boolean value) {
        this.canResume = value;
    }
    /**
     * Sets the carrierRejectionCount property value. The carrier rejection count for this SMS warmup status.
     * @param value Value to set for the carrierRejectionCount property.
     */
    public void setCarrierRejectionCount(@jakarta.annotation.Nullable final Integer value) {
        this.carrierRejectionCount = value;
    }
    /**
     * Sets the completedAt property value. The date and time for the completed at value on this SMS warmup status.
     * @param value Value to set for the completedAt property.
     */
    public void setCompletedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completedAt = value;
    }
    /**
     * Sets the deliveredCount property value. The delivered count for this SMS warmup status.
     * @param value Value to set for the deliveredCount property.
     */
    public void setDeliveredCount(@jakarta.annotation.Nullable final Integer value) {
        this.deliveredCount = value;
    }
    /**
     * Sets the deliverySuccessRate property value. The delivery success rate metric for this SMS warmup status.
     * @param value Value to set for the deliverySuccessRate property.
     */
    public void setDeliverySuccessRate(@jakarta.annotation.Nullable final Double value) {
        this.deliverySuccessRate = value;
    }
    /**
     * Sets the failureCount property value. The failure count for this SMS warmup status.
     * @param value Value to set for the failureCount property.
     */
    public void setFailureCount(@jakarta.annotation.Nullable final Integer value) {
        this.failureCount = value;
    }
    /**
     * Sets the globalWarmupEnabled property value. Whether global warmup is enabled for this SMS warmup status.
     * @param value Value to set for the globalWarmupEnabled property.
     */
    public void setGlobalWarmupEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.globalWarmupEnabled = value;
    }
    /**
     * Sets the healthScore property value. The health score metric for this SMS warmup status.
     * @param value Value to set for the healthScore property.
     */
    public void setHealthScore(@jakarta.annotation.Nullable final Integer value) {
        this.healthScore = value;
    }
    /**
     * Sets the isApprovedTestDestination property value. Whether this SMS warmup status is approved test destination.
     * @param value Value to set for the isApprovedTestDestination property.
     */
    public void setIsApprovedTestDestination(@jakarta.annotation.Nullable final Boolean value) {
        this.isApprovedTestDestination = value;
    }
    /**
     * Sets the isInternalPool property value. Whether this SMS warmup status is internal pool.
     * @param value Value to set for the isInternalPool property.
     */
    public void setIsInternalPool(@jakarta.annotation.Nullable final Boolean value) {
        this.isInternalPool = value;
    }
    /**
     * Sets the isMessagingProgramApproved property value. Whether this SMS warmup status is messaging program approved.
     * @param value Value to set for the isMessagingProgramApproved property.
     */
    public void setIsMessagingProgramApproved(@jakarta.annotation.Nullable final Boolean value) {
        this.isMessagingProgramApproved = value;
    }
    /**
     * Sets the lastHealthSnapshotAt property value. The date and time for the last health snapshot at value on this SMS warmup status.
     * @param value Value to set for the lastHealthSnapshotAt property.
     */
    public void setLastHealthSnapshotAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastHealthSnapshotAt = value;
    }
    /**
     * Sets the lastSuccessfulMessageAt property value. The date and time for the last successful message at value on this SMS warmup status.
     * @param value Value to set for the lastSuccessfulMessageAt property.
     */
    public void setLastSuccessfulMessageAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSuccessfulMessageAt = value;
    }
    /**
     * Sets the nextScheduledActionAt property value. The date and time for the next scheduled action at value on this SMS warmup status.
     * @param value Value to set for the nextScheduledActionAt property.
     */
    public void setNextScheduledActionAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.nextScheduledActionAt = value;
    }
    /**
     * Sets the optOutSignalCount property value. The opt out signal count for this SMS warmup status.
     * @param value Value to set for the optOutSignalCount property.
     */
    public void setOptOutSignalCount(@jakarta.annotation.Nullable final Integer value) {
        this.optOutSignalCount = value;
    }
    /**
     * Sets the pauseReason property value. The human-readable pause reason explaining this SMS warmup status.
     * @param value Value to set for the pauseReason property.
     */
    public void setPauseReason(@jakarta.annotation.Nullable final String value) {
        this.pauseReason = value;
    }
    /**
     * Sets the phoneNumber property value. The phone number associated with this SMS warmup status.
     * @param value Value to set for the phoneNumber property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the phoneNumberId property value. The phone number ID associated with this SMS warmup status.
     * @param value Value to set for the phoneNumberId property.
     */
    public void setPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.phoneNumberId = value;
    }
    /**
     * Sets the progressPercent property value. The progress percent metric for this SMS warmup status.
     * @param value Value to set for the progressPercent property.
     */
    public void setProgressPercent(@jakarta.annotation.Nullable final Integer value) {
        this.progressPercent = value;
    }
    /**
     * Sets the receivedCount property value. The received count for this SMS warmup status.
     * @param value Value to set for the receivedCount property.
     */
    public void setReceivedCount(@jakarta.annotation.Nullable final Integer value) {
        this.receivedCount = value;
    }
    /**
     * Sets the recentActions property value. The recent actions included with this SMS warmup status.
     * @param value Value to set for the recentActions property.
     */
    public void setRecentActions(@jakarta.annotation.Nullable final java.util.List<SmsWarmupActionResponse> value) {
        this.recentActions = value;
    }
    /**
     * Sets the sentCount property value. The sent count for this SMS warmup status.
     * @param value Value to set for the sentCount property.
     */
    public void setSentCount(@jakarta.annotation.Nullable final Integer value) {
        this.sentCount = value;
    }
    /**
     * Sets the spamSignalCount property value. The spam signal count for this SMS warmup status.
     * @param value Value to set for the spamSignalCount property.
     */
    public void setSpamSignalCount(@jakarta.annotation.Nullable final Integer value) {
        this.spamSignalCount = value;
    }
    /**
     * Sets the startedAt property value. The date and time for the started at value on this SMS warmup status.
     * @param value Value to set for the startedAt property.
     */
    public void setStartedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startedAt = value;
    }
    /**
     * Sets the status property value. The current status for this SMS warmup status.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SmsWarmupHealthState value) {
        this.status = value;
    }
    /**
     * Sets the uiState property value. The current UI state for this SMS warmup status.
     * @param value Value to set for the uiState property.
     */
    public void setUiState(@jakarta.annotation.Nullable final SmsWarmupUiState value) {
        this.uiState = value;
    }
    /**
     * Sets the warmupEnabled property value. Whether warmup is enabled for this SMS warmup status.
     * @param value Value to set for the warmupEnabled property.
     */
    public void setWarmupEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.warmupEnabled = value;
    }
}
