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
 * API response containing SMS warmup action data returned to callers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SmsWarmupActionResponse implements AdditionalDataHolder, Parsable {
    /**
     * The action type classification for this SMS warmup action.
     */
    private SmsWarmupActionType actionType;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The body value for this SMS warmup action.
     */
    private String body;
    /**
     * The conversation ID associated with this SMS warmup action.
     */
    private String conversationId;
    /**
     * The date and time for the executed at value on this SMS warmup action.
     */
    private OffsetDateTime executedAt;
    /**
     * The human-readable failure reason explaining this SMS warmup action.
     */
    private String failureReason;
    /**
     * The phone number associated with this SMS warmup action.
     */
    private String fromPhoneNumber;
    /**
     * The unique ID for this SMS warmup action.
     */
    private String id;
    /**
     * The date and time for the scheduled at value on this SMS warmup action.
     */
    private OffsetDateTime scheduledAt;
    /**
     * The current status for this SMS warmup action.
     */
    private SmsWarmupActionStatus status;
    /**
     * The phone number associated with this SMS warmup action.
     */
    private String toPhoneNumber;
    /**
     * Instantiates a new {@link SmsWarmupActionResponse} and sets the default values.
     */
    public SmsWarmupActionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SmsWarmupActionResponse}
     */
    @jakarta.annotation.Nonnull
    public static SmsWarmupActionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SmsWarmupActionResponse();
    }
    /**
     * Gets the actionType property value. The action type classification for this SMS warmup action.
     * @return a {@link SmsWarmupActionType}
     */
    @jakarta.annotation.Nullable
    public SmsWarmupActionType getActionType() {
        return this.actionType;
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
     * Gets the body property value. The body value for this SMS warmup action.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBody() {
        return this.body;
    }
    /**
     * Gets the conversationId property value. The conversation ID associated with this SMS warmup action.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConversationId() {
        return this.conversationId;
    }
    /**
     * Gets the executedAt property value. The date and time for the executed at value on this SMS warmup action.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExecutedAt() {
        return this.executedAt;
    }
    /**
     * Gets the failureReason property value. The human-readable failure reason explaining this SMS warmup action.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("actionType", (n) -> { this.setActionType(n.getEnumValue(SmsWarmupActionType::forValue)); });
        deserializerMap.put("body", (n) -> { this.setBody(n.getStringValue()); });
        deserializerMap.put("conversationId", (n) -> { this.setConversationId(n.getStringValue()); });
        deserializerMap.put("executedAt", (n) -> { this.setExecutedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failureReason", (n) -> { this.setFailureReason(n.getStringValue()); });
        deserializerMap.put("fromPhoneNumber", (n) -> { this.setFromPhoneNumber(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("scheduledAt", (n) -> { this.setScheduledAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SmsWarmupActionStatus::forValue)); });
        deserializerMap.put("toPhoneNumber", (n) -> { this.setToPhoneNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fromPhoneNumber property value. The phone number associated with this SMS warmup action.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFromPhoneNumber() {
        return this.fromPhoneNumber;
    }
    /**
     * Gets the id property value. The unique ID for this SMS warmup action.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the scheduledAt property value. The date and time for the scheduled at value on this SMS warmup action.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getScheduledAt() {
        return this.scheduledAt;
    }
    /**
     * Gets the status property value. The current status for this SMS warmup action.
     * @return a {@link SmsWarmupActionStatus}
     */
    @jakarta.annotation.Nullable
    public SmsWarmupActionStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the toPhoneNumber property value. The phone number associated with this SMS warmup action.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getToPhoneNumber() {
        return this.toPhoneNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("actionType", this.getActionType());
        writer.writeStringValue("body", this.getBody());
        writer.writeStringValue("conversationId", this.getConversationId());
        writer.writeOffsetDateTimeValue("executedAt", this.getExecutedAt());
        writer.writeStringValue("failureReason", this.getFailureReason());
        writer.writeStringValue("fromPhoneNumber", this.getFromPhoneNumber());
        writer.writeStringValue("id", this.getId());
        writer.writeOffsetDateTimeValue("scheduledAt", this.getScheduledAt());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("toPhoneNumber", this.getToPhoneNumber());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionType property value. The action type classification for this SMS warmup action.
     * @param value Value to set for the actionType property.
     */
    public void setActionType(@jakarta.annotation.Nullable final SmsWarmupActionType value) {
        this.actionType = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the body property value. The body value for this SMS warmup action.
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final String value) {
        this.body = value;
    }
    /**
     * Sets the conversationId property value. The conversation ID associated with this SMS warmup action.
     * @param value Value to set for the conversationId property.
     */
    public void setConversationId(@jakarta.annotation.Nullable final String value) {
        this.conversationId = value;
    }
    /**
     * Sets the executedAt property value. The date and time for the executed at value on this SMS warmup action.
     * @param value Value to set for the executedAt property.
     */
    public void setExecutedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.executedAt = value;
    }
    /**
     * Sets the failureReason property value. The human-readable failure reason explaining this SMS warmup action.
     * @param value Value to set for the failureReason property.
     */
    public void setFailureReason(@jakarta.annotation.Nullable final String value) {
        this.failureReason = value;
    }
    /**
     * Sets the fromPhoneNumber property value. The phone number associated with this SMS warmup action.
     * @param value Value to set for the fromPhoneNumber property.
     */
    public void setFromPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.fromPhoneNumber = value;
    }
    /**
     * Sets the id property value. The unique ID for this SMS warmup action.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the scheduledAt property value. The date and time for the scheduled at value on this SMS warmup action.
     * @param value Value to set for the scheduledAt property.
     */
    public void setScheduledAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.scheduledAt = value;
    }
    /**
     * Sets the status property value. The current status for this SMS warmup action.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SmsWarmupActionStatus value) {
        this.status = value;
    }
    /**
     * Sets the toPhoneNumber property value. The phone number associated with this SMS warmup action.
     * @param value Value to set for the toPhoneNumber property.
     */
    public void setToPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.toPhoneNumber = value;
    }
}
