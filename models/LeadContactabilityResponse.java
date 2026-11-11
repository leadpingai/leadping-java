package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Current call and text eligibility for a lead under the applicable contact rules.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadContactabilityResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Whether the lead can currently be called after evaluating applicable contact hours, suppression, and consent rules.
     */
    private Boolean canCall;
    /**
     * Whether the lead can currently be texted after evaluating applicable contact hours, suppression, and consent rules.
     */
    private Boolean canText;
    /**
     * Instantiates a new {@link LeadContactabilityResponse} and sets the default values.
     */
    public LeadContactabilityResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadContactabilityResponse}
     */
    @jakarta.annotation.Nonnull
    public static LeadContactabilityResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadContactabilityResponse();
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
     * Gets the canCall property value. Whether the lead can currently be called after evaluating applicable contact hours, suppression, and consent rules.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCanCall() {
        return this.canCall;
    }
    /**
     * Gets the canText property value. Whether the lead can currently be texted after evaluating applicable contact hours, suppression, and consent rules.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCanText() {
        return this.canText;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("canCall", (n) -> { this.setCanCall(n.getBooleanValue()); });
        deserializerMap.put("canText", (n) -> { this.setCanText(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("canCall", this.getCanCall());
        writer.writeBooleanValue("canText", this.getCanText());
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
     * Sets the canCall property value. Whether the lead can currently be called after evaluating applicable contact hours, suppression, and consent rules.
     * @param value Value to set for the canCall property.
     */
    public void setCanCall(@jakarta.annotation.Nullable final Boolean value) {
        this.canCall = value;
    }
    /**
     * Sets the canText property value. Whether the lead can currently be texted after evaluating applicable contact hours, suppression, and consent rules.
     * @param value Value to set for the canText property.
     */
    public void setCanText(@jakarta.annotation.Nullable final Boolean value) {
        this.canText = value;
    }
}
