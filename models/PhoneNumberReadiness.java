package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Messaging and calling warmup for a Leadping phone number.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberReadiness implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether phone number warmup is enabled in Leadping.
     */
    private Boolean enabled;
    /**
     * Current warmup health score used to assess phone number warmup.
     */
    private Integer healthScore;
    /**
     * Defines the supported SMS readiness health assessments.
     */
    private PhoneNumberReadinessHealthStatus healthStatus;
    /**
     * Warmup completion percentage, from 0 through 100.
     */
    private Integer progressPercent;
    /**
     * Defines the supported SMS readiness states.
     */
    private PhoneNumberReadinessState state;
    /**
     * Instantiates a new {@link PhoneNumberReadiness} and sets the default values.
     */
    public PhoneNumberReadiness() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberReadiness}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberReadiness createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberReadiness();
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
     * Gets the enabled property value. Indicates whether phone number warmup is enabled in Leadping.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("enabled", (n) -> { this.setEnabled(n.getBooleanValue()); });
        deserializerMap.put("healthScore", (n) -> { this.setHealthScore(n.getIntegerValue()); });
        deserializerMap.put("healthStatus", (n) -> { this.setHealthStatus(n.getEnumValue(PhoneNumberReadinessHealthStatus::forValue)); });
        deserializerMap.put("progressPercent", (n) -> { this.setProgressPercent(n.getIntegerValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(PhoneNumberReadinessState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the healthScore property value. Current warmup health score used to assess phone number warmup.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHealthScore() {
        return this.healthScore;
    }
    /**
     * Gets the healthStatus property value. Defines the supported SMS readiness health assessments.
     * @return a {@link PhoneNumberReadinessHealthStatus}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberReadinessHealthStatus getHealthStatus() {
        return this.healthStatus;
    }
    /**
     * Gets the progressPercent property value. Warmup completion percentage, from 0 through 100.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getProgressPercent() {
        return this.progressPercent;
    }
    /**
     * Gets the state property value. Defines the supported SMS readiness states.
     * @return a {@link PhoneNumberReadinessState}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberReadinessState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeIntegerValue("healthScore", this.getHealthScore());
        writer.writeEnumValue("healthStatus", this.getHealthStatus());
        writer.writeIntegerValue("progressPercent", this.getProgressPercent());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the enabled property value. Indicates whether phone number warmup is enabled in Leadping.
     * @param value Value to set for the enabled property.
     */
    public void setEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.enabled = value;
    }
    /**
     * Sets the healthScore property value. Current warmup health score used to assess phone number warmup.
     * @param value Value to set for the healthScore property.
     */
    public void setHealthScore(@jakarta.annotation.Nullable final Integer value) {
        this.healthScore = value;
    }
    /**
     * Sets the healthStatus property value. Defines the supported SMS readiness health assessments.
     * @param value Value to set for the healthStatus property.
     */
    public void setHealthStatus(@jakarta.annotation.Nullable final PhoneNumberReadinessHealthStatus value) {
        this.healthStatus = value;
    }
    /**
     * Sets the progressPercent property value. Warmup completion percentage, from 0 through 100.
     * @param value Value to set for the progressPercent property.
     */
    public void setProgressPercent(@jakarta.annotation.Nullable final Integer value) {
        this.progressPercent = value;
    }
    /**
     * Sets the state property value. Defines the supported SMS readiness states.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final PhoneNumberReadinessState value) {
        this.state = value;
    }
}
