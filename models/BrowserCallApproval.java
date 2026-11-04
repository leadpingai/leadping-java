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
 * Server-approved parameters for one outbound browser call.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BrowserCallApproval implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The callerNumber property
     */
    private String callerNumber;
    /**
     * The clientState property
     */
    private String clientState;
    /**
     * The destinationNumber property
     */
    private String destinationNumber;
    /**
     * The expiresAt property
     */
    private OffsetDateTime expiresAt;
    /**
     * The maximumDurationSeconds property
     */
    private Integer maximumDurationSeconds;
    /**
     * Instantiates a new {@link BrowserCallApproval} and sets the default values.
     */
    public BrowserCallApproval() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BrowserCallApproval}
     */
    @jakarta.annotation.Nonnull
    public static BrowserCallApproval createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BrowserCallApproval();
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
     * Gets the callerNumber property value. The callerNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCallerNumber() {
        return this.callerNumber;
    }
    /**
     * Gets the clientState property value. The clientState property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientState() {
        return this.clientState;
    }
    /**
     * Gets the destinationNumber property value. The destinationNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationNumber() {
        return this.destinationNumber;
    }
    /**
     * Gets the expiresAt property value. The expiresAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("callerNumber", (n) -> { this.setCallerNumber(n.getStringValue()); });
        deserializerMap.put("clientState", (n) -> { this.setClientState(n.getStringValue()); });
        deserializerMap.put("destinationNumber", (n) -> { this.setDestinationNumber(n.getStringValue()); });
        deserializerMap.put("expiresAt", (n) -> { this.setExpiresAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("maximumDurationSeconds", (n) -> { this.setMaximumDurationSeconds(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maximumDurationSeconds property value. The maximumDurationSeconds property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumDurationSeconds() {
        return this.maximumDurationSeconds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("callerNumber", this.getCallerNumber());
        writer.writeStringValue("clientState", this.getClientState());
        writer.writeStringValue("destinationNumber", this.getDestinationNumber());
        writer.writeOffsetDateTimeValue("expiresAt", this.getExpiresAt());
        writer.writeIntegerValue("maximumDurationSeconds", this.getMaximumDurationSeconds());
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
     * Sets the callerNumber property value. The callerNumber property
     * @param value Value to set for the callerNumber property.
     */
    public void setCallerNumber(@jakarta.annotation.Nullable final String value) {
        this.callerNumber = value;
    }
    /**
     * Sets the clientState property value. The clientState property
     * @param value Value to set for the clientState property.
     */
    public void setClientState(@jakarta.annotation.Nullable final String value) {
        this.clientState = value;
    }
    /**
     * Sets the destinationNumber property value. The destinationNumber property
     * @param value Value to set for the destinationNumber property.
     */
    public void setDestinationNumber(@jakarta.annotation.Nullable final String value) {
        this.destinationNumber = value;
    }
    /**
     * Sets the expiresAt property value. The expiresAt property
     * @param value Value to set for the expiresAt property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expiresAt = value;
    }
    /**
     * Sets the maximumDurationSeconds property value. The maximumDurationSeconds property
     * @param value Value to set for the maximumDurationSeconds property.
     */
    public void setMaximumDurationSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.maximumDurationSeconds = value;
    }
}
