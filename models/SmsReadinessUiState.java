package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * API DTO containing SMS readiness UI state data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SmsReadinessUiState implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The human-readable description of this SMS readiness UI state.
     */
    private String description;
    /**
     * The human-readable label shown for this SMS readiness UI state.
     */
    private SmsReadinessState label;
    /**
     * The tone value for this SMS readiness UI state.
     */
    private String tone;
    /**
     * Instantiates a new {@link SmsReadinessUiState} and sets the default values.
     */
    public SmsReadinessUiState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SmsReadinessUiState}
     */
    @jakarta.annotation.Nonnull
    public static SmsReadinessUiState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SmsReadinessUiState();
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
     * Gets the description property value. The human-readable description of this SMS readiness UI state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getEnumValue(SmsReadinessState::forValue)); });
        deserializerMap.put("tone", (n) -> { this.setTone(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. The human-readable label shown for this SMS readiness UI state.
     * @return a {@link SmsReadinessState}
     */
    @jakarta.annotation.Nullable
    public SmsReadinessState getLabel() {
        return this.label;
    }
    /**
     * Gets the tone property value. The tone value for this SMS readiness UI state.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTone() {
        return this.tone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("label", this.getLabel());
        writer.writeStringValue("tone", this.getTone());
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
     * Sets the description property value. The human-readable description of this SMS readiness UI state.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the label property value. The human-readable label shown for this SMS readiness UI state.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final SmsReadinessState value) {
        this.label = value;
    }
    /**
     * Sets the tone property value. The tone value for this SMS readiness UI state.
     * @param value Value to set for the tone property.
     */
    public void setTone(@jakarta.annotation.Nullable final String value) {
        this.tone = value;
    }
}
