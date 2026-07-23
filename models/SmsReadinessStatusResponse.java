package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * API response containing SMS warmup status data returned to callers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SmsReadinessStatusResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The health score metric for this SMS warmup status.
     */
    private Integer healthScore;
    /**
     * The current delivery-health assessment for this SMS warmup status.
     */
    private SmsReadinessHealthStatus healthStatus;
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
     * The current state for this SMS warmup status.
     */
    private SmsReadinessState status;
    /**
     * The current UI state for this SMS warmup status.
     */
    private SmsReadinessUiState uiState;
    /**
     * Whether warmup is enabled for this SMS warmup status.
     */
    private Boolean warmupEnabled;
    /**
     * Instantiates a new {@link SmsReadinessStatusResponse} and sets the default values.
     */
    public SmsReadinessStatusResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SmsReadinessStatusResponse}
     */
    @jakarta.annotation.Nonnull
    public static SmsReadinessStatusResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SmsReadinessStatusResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("healthScore", (n) -> { this.setHealthScore(n.getIntegerValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(SmsReadinessHealthStatus::forValue)); });
        deserializerMap.put("phoneNumber", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("phoneNumberId", (n) -> { this.setPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("progressPercent", (n) -> { this.setProgressPercent(n.getIntegerValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SmsReadinessState::forValue)); });
        deserializerMap.put("uiState", (n) -> { this.setUiState(n.getObjectValue(SmsReadinessUiState::createFromDiscriminatorValue)); });
        deserializerMap.put("warmupEnabled", (n) -> { this.setWarmupEnabled(n.getBooleanValue()); });
        return deserializerMap;
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
     * Gets the healthStatus property value. The current delivery-health assessment for this SMS warmup status.
     * @return a {@link SmsReadinessHealthStatus}
     */
    @jakarta.annotation.Nullable
    public SmsReadinessHealthStatus getHealthStatus() {
        return this.healthStatus;
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
     * Gets the status property value. The current state for this SMS warmup status.
     * @return a {@link SmsReadinessState}
     */
    @jakarta.annotation.Nullable
    public SmsReadinessState getStatus() {
        return this.status;
    }
    /**
     * Gets the uiState property value. The current UI state for this SMS warmup status.
     * @return a {@link SmsReadinessUiState}
     */
    @jakarta.annotation.Nullable
    public SmsReadinessUiState getUiState() {
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
        writer.writeIntegerValue("healthScore", this.getHealthScore());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeStringValue("phoneNumber", this.getPhoneNumber());
        writer.writeStringValue("phoneNumberId", this.getPhoneNumberId());
        writer.writeIntegerValue("progressPercent", this.getProgressPercent());
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
     * Sets the healthScore property value. The health score metric for this SMS warmup status.
     * @param value Value to set for the healthScore property.
     */
    public void setHealthScore(@jakarta.annotation.Nullable final Integer value) {
        this.healthScore = value;
    }
    /**
     * Sets the healthStatus property value. The current delivery-health assessment for this SMS warmup status.
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final SmsReadinessHealthStatus value) {
        this.healthStatus = value;
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
     * Sets the status property value. The current state for this SMS warmup status.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SmsReadinessState value) {
        this.status = value;
    }
    /**
     * Sets the uiState property value. The current UI state for this SMS warmup status.
     * @param value Value to set for the uiState property.
     */
    public void setUiState(@jakarta.annotation.Nullable final SmsReadinessUiState value) {
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
