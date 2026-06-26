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
 * API response containing a voice call warmup attempt.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberWarmupCallResponse implements AdditionalDataHolder, Parsable {
    /**
     * The actualConnectedDurationSeconds property
     */
    private UntypedNode actualConnectedDurationSeconds;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The answeredAt property
     */
    private OffsetDateTime answeredAt;
    /**
     * The completedAt property
     */
    private OffsetDateTime completedAt;
    /**
     * The destinationPhoneNumber property
     */
    private String destinationPhoneNumber;
    /**
     * The destinationPhoneNumberId property
     */
    private String destinationPhoneNumberId;
    /**
     * The failureReason property
     */
    private String failureReason;
    /**
     * The id property
     */
    private String id;
    /**
     * The scheduledAt property
     */
    private OffsetDateTime scheduledAt;
    /**
     * The sourcePhoneNumber property
     */
    private String sourcePhoneNumber;
    /**
     * The sourcePhoneNumberId property
     */
    private String sourcePhoneNumberId;
    /**
     * Defines the durable state machine statuses for voice call warmup attempts.
     */
    private PhoneNumberWarmupCallStatus status;
    /**
     * The targetDurationSeconds property
     */
    private Integer targetDurationSeconds;
    /**
     * Instantiates a new {@link PhoneNumberWarmupCallResponse} and sets the default values.
     */
    public PhoneNumberWarmupCallResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberWarmupCallResponse}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberWarmupCallResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberWarmupCallResponse();
    }
    /**
     * Gets the actualConnectedDurationSeconds property value. The actualConnectedDurationSeconds property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getActualConnectedDurationSeconds() {
        return this.actualConnectedDurationSeconds;
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
     * Gets the answeredAt property value. The answeredAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAnsweredAt() {
        return this.answeredAt;
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
     * Gets the destinationPhoneNumber property value. The destinationPhoneNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationPhoneNumber() {
        return this.destinationPhoneNumber;
    }
    /**
     * Gets the destinationPhoneNumberId property value. The destinationPhoneNumberId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationPhoneNumberId() {
        return this.destinationPhoneNumberId;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("actualConnectedDurationSeconds", (n) -> { this.setActualConnectedDurationSeconds(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("answeredAt", (n) -> { this.setAnsweredAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("completedAt", (n) -> { this.setCompletedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("destinationPhoneNumber", (n) -> { this.setDestinationPhoneNumber(n.getStringValue()); });
        deserializerMap.put("destinationPhoneNumberId", (n) -> { this.setDestinationPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("failureReason", (n) -> { this.setFailureReason(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("scheduledAt", (n) -> { this.setScheduledAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sourcePhoneNumber", (n) -> { this.setSourcePhoneNumber(n.getStringValue()); });
        deserializerMap.put("sourcePhoneNumberId", (n) -> { this.setSourcePhoneNumberId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(PhoneNumberWarmupCallStatus::forValue)); });
        deserializerMap.put("targetDurationSeconds", (n) -> { this.setTargetDurationSeconds(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the scheduledAt property value. The scheduledAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getScheduledAt() {
        return this.scheduledAt;
    }
    /**
     * Gets the sourcePhoneNumber property value. The sourcePhoneNumber property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourcePhoneNumber() {
        return this.sourcePhoneNumber;
    }
    /**
     * Gets the sourcePhoneNumberId property value. The sourcePhoneNumberId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourcePhoneNumberId() {
        return this.sourcePhoneNumberId;
    }
    /**
     * Gets the status property value. Defines the durable state machine statuses for voice call warmup attempts.
     * @return a {@link PhoneNumberWarmupCallStatus}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberWarmupCallStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the targetDurationSeconds property value. The targetDurationSeconds property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTargetDurationSeconds() {
        return this.targetDurationSeconds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("actualConnectedDurationSeconds", this.getActualConnectedDurationSeconds());
        writer.writeOffsetDateTimeValue("answeredAt", this.getAnsweredAt());
        writer.writeOffsetDateTimeValue("completedAt", this.getCompletedAt());
        writer.writeStringValue("destinationPhoneNumber", this.getDestinationPhoneNumber());
        writer.writeStringValue("destinationPhoneNumberId", this.getDestinationPhoneNumberId());
        writer.writeStringValue("failureReason", this.getFailureReason());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("scheduledAt", this.getScheduledAt());
        writer.writeStringValue("sourcePhoneNumber", this.getSourcePhoneNumber());
        writer.writeStringValue("sourcePhoneNumberId", this.getSourcePhoneNumberId());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeIntegerValue("targetDurationSeconds", this.getTargetDurationSeconds());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actualConnectedDurationSeconds property value. The actualConnectedDurationSeconds property
     * @param value Value to set for the actualConnectedDurationSeconds property.
     */
    public void setActualConnectedDurationSeconds(@jakarta.annotation.Nullable final UntypedNode value) {
        this.actualConnectedDurationSeconds = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the answeredAt property value. The answeredAt property
     * @param value Value to set for the answeredAt property.
     */
    public void setAnsweredAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.answeredAt = value;
    }
    /**
     * Sets the completedAt property value. The completedAt property
     * @param value Value to set for the completedAt property.
     */
    public void setCompletedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completedAt = value;
    }
    /**
     * Sets the destinationPhoneNumber property value. The destinationPhoneNumber property
     * @param value Value to set for the destinationPhoneNumber property.
     */
    public void setDestinationPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.destinationPhoneNumber = value;
    }
    /**
     * Sets the destinationPhoneNumberId property value. The destinationPhoneNumberId property
     * @param value Value to set for the destinationPhoneNumberId property.
     */
    public void setDestinationPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.destinationPhoneNumberId = value;
    }
    /**
     * Sets the failureReason property value. The failureReason property
     * @param value Value to set for the failureReason property.
     */
    public void setFailureReason(@jakarta.annotation.Nullable final String value) {
        this.failureReason = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the scheduledAt property value. The scheduledAt property
     * @param value Value to set for the scheduledAt property.
     */
    public void setScheduledAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.scheduledAt = value;
    }
    /**
     * Sets the sourcePhoneNumber property value. The sourcePhoneNumber property
     * @param value Value to set for the sourcePhoneNumber property.
     */
    public void setSourcePhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.sourcePhoneNumber = value;
    }
    /**
     * Sets the sourcePhoneNumberId property value. The sourcePhoneNumberId property
     * @param value Value to set for the sourcePhoneNumberId property.
     */
    public void setSourcePhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.sourcePhoneNumberId = value;
    }
    /**
     * Sets the status property value. Defines the durable state machine statuses for voice call warmup attempts.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final PhoneNumberWarmupCallStatus value) {
        this.status = value;
    }
    /**
     * Sets the targetDurationSeconds property value. The targetDurationSeconds property
     * @param value Value to set for the targetDurationSeconds property.
     */
    public void setTargetDurationSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.targetDurationSeconds = value;
    }
}
