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
 * Describes one durable diagnostic entry from the processing of a communication.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CommunicationConsoleEntry implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Unique identifier of this diagnostic console entry.
     */
    private String id;
    /**
     * User-safe diagnostic message describing what occurred at this stage.
     */
    private String message;
    /**
     * UTC timestamp when this communication-processing event occurred.
     */
    private OffsetDateTime occurredAt;
    /**
     * Communication-processing stage that produced the entry, such as validation, routing, or provider delivery.
     */
    private String stage;
    /**
     * Outcome or state recorded for this processing stage.
     */
    private String status;
    /**
     * Instantiates a new {@link CommunicationConsoleEntry} and sets the default values.
     */
    public CommunicationConsoleEntry() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CommunicationConsoleEntry}
     */
    @jakarta.annotation.Nonnull
    public static CommunicationConsoleEntry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CommunicationConsoleEntry();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("occurredAt", (n) -> { this.setOccurredAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("stage", (n) -> { this.setStage(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique identifier of this diagnostic console entry.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the message property value. User-safe diagnostic message describing what occurred at this stage.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the occurredAt property value. UTC timestamp when this communication-processing event occurred.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOccurredAt() {
        return this.occurredAt;
    }
    /**
     * Gets the stage property value. Communication-processing stage that produced the entry, such as validation, routing, or provider delivery.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStage() {
        return this.stage;
    }
    /**
     * Gets the status property value. Outcome or state recorded for this processing stage.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("message", this.getMessage());
        writer.writeOffsetDateTimeValue("occurredAt", this.getOccurredAt());
        writer.writeStringValue("stage", this.getStage());
        writer.writeStringValue("status", this.getStatus());
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
     * Sets the id property value. Unique identifier of this diagnostic console entry.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the message property value. User-safe diagnostic message describing what occurred at this stage.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the occurredAt property value. UTC timestamp when this communication-processing event occurred.
     * @param value Value to set for the occurredAt property.
     */
    public void setOccurredAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.occurredAt = value;
    }
    /**
     * Sets the stage property value. Communication-processing stage that produced the entry, such as validation, routing, or provider delivery.
     * @param value Value to set for the stage property.
     */
    public void setStage(@jakarta.annotation.Nullable final String value) {
        this.stage = value;
    }
    /**
     * Sets the status property value. Outcome or state recorded for this processing stage.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
}
