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
 * Delivery outcome of the persisted SMS. Workflow steps advance on command acceptance, without waiting for delivery.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomationSmsDeliveryRecord implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Machine-readable delivery failure code.
     */
    private String errorCode;
    /**
     * UTC time of the next automatic delivery retry, if any.
     */
    private OffsetDateTime nextRetryAt;
    /**
     * Redacted reason supplied by the delivery pipeline.
     */
    private String reason;
    /**
     * UTC time at which the SMS is scheduled to send.
     */
    private OffsetDateTime scheduledFor;
    /**
     * Durable SMS event ID used to read subsequent delivery outcomes.
     */
    private String smsEventId;
    /**
     * Describes the normalized lifecycle of an SMS or MMS message from scheduling through delivery or failure.
     */
    private AutomationSmsDeliveryRecordStatus status;
    /**
     * Customer-safe delivery summary and suggested next action.
     */
    private String summary;
    /**
     * Instantiates a new {@link AutomationSmsDeliveryRecord} and sets the default values.
     */
    public AutomationSmsDeliveryRecord() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomationSmsDeliveryRecord}
     */
    @jakarta.annotation.Nonnull
    public static AutomationSmsDeliveryRecord createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomationSmsDeliveryRecord();
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
     * Gets the errorCode property value. Machine-readable delivery failure code.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getStringValue()); });
        deserializerMap.put("nextRetryAt", (n) -> { this.setNextRetryAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("scheduledFor", (n) -> { this.setScheduledFor(n.getOffsetDateTimeValue()); });
        deserializerMap.put("smsEventId", (n) -> { this.setSmsEventId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AutomationSmsDeliveryRecordStatus::forValue)); });
        deserializerMap.put("summary", (n) -> { this.setSummary(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nextRetryAt property value. UTC time of the next automatic delivery retry, if any.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextRetryAt() {
        return this.nextRetryAt;
    }
    /**
     * Gets the reason property value. Redacted reason supplied by the delivery pipeline.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the scheduledFor property value. UTC time at which the SMS is scheduled to send.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getScheduledFor() {
        return this.scheduledFor;
    }
    /**
     * Gets the smsEventId property value. Durable SMS event ID used to read subsequent delivery outcomes.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSmsEventId() {
        return this.smsEventId;
    }
    /**
     * Gets the status property value. Describes the normalized lifecycle of an SMS or MMS message from scheduling through delivery or failure.
     * @return a {@link AutomationSmsDeliveryRecordStatus}
     */
    @jakarta.annotation.Nullable
    public AutomationSmsDeliveryRecordStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the summary property value. Customer-safe delivery summary and suggested next action.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSummary() {
        return this.summary;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeOffsetDateTimeValue("nextRetryAt", this.getNextRetryAt());
        writer.writeStringValue("reason", this.getReason());
        writer.writeOffsetDateTimeValue("scheduledFor", this.getScheduledFor());
        writer.writeStringValue("smsEventId", this.getSmsEventId());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("summary", this.getSummary());
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
     * Sets the errorCode property value. Machine-readable delivery failure code.
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final String value) {
        this.errorCode = value;
    }
    /**
     * Sets the nextRetryAt property value. UTC time of the next automatic delivery retry, if any.
     * @param value Value to set for the nextRetryAt property.
     */
    public void setNextRetryAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.nextRetryAt = value;
    }
    /**
     * Sets the reason property value. Redacted reason supplied by the delivery pipeline.
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the scheduledFor property value. UTC time at which the SMS is scheduled to send.
     * @param value Value to set for the scheduledFor property.
     */
    public void setScheduledFor(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.scheduledFor = value;
    }
    /**
     * Sets the smsEventId property value. Durable SMS event ID used to read subsequent delivery outcomes.
     * @param value Value to set for the smsEventId property.
     */
    public void setSmsEventId(@jakarta.annotation.Nullable final String value) {
        this.smsEventId = value;
    }
    /**
     * Sets the status property value. Describes the normalized lifecycle of an SMS or MMS message from scheduling through delivery or failure.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AutomationSmsDeliveryRecordStatus value) {
        this.status = value;
    }
    /**
     * Sets the summary property value. Customer-safe delivery summary and suggested next action.
     * @param value Value to set for the summary property.
     */
    public void setSummary(@jakarta.annotation.Nullable final String value) {
        this.summary = value;
    }
}
