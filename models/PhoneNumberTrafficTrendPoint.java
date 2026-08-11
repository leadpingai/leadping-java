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
 * Time-series data point schema for Leadping API phone number traffic trend bucket charts and metrics.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberTrafficTrendPoint implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of outbound calls that failed during this metrics window.
     */
    private UntypedNode callFailedCount;
    /**
     * Number of outbound calls placed during this metrics window.
     */
    private UntypedNode callPlacedCount;
    /**
     * UTC timestamp when this reporting bucket ends.
     */
    private OffsetDateTime endAt;
    /**
     * Short display label for this phone number traffic trend bucket, formatted for charts, filters, or list views.
     */
    private String label;
    /**
     * Number of MMS messages that failed during this metrics window.
     */
    private UntypedNode mmsFailedCount;
    /**
     * Number of MMS messages sent during this metrics window.
     */
    private UntypedNode mmsSentCount;
    /**
     * Number of SMS messages that failed during this metrics window.
     */
    private UntypedNode smsFailedCount;
    /**
     * Number of SMS messages sent during this metrics window.
     */
    private UntypedNode smsSentCount;
    /**
     * UTC timestamp when this reporting bucket starts.
     */
    private OffsetDateTime startAt;
    /**
     * Instantiates a new {@link PhoneNumberTrafficTrendPoint} and sets the default values.
     */
    public PhoneNumberTrafficTrendPoint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberTrafficTrendPoint}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberTrafficTrendPoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberTrafficTrendPoint();
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
     * Gets the callFailedCount property value. Number of outbound calls that failed during this metrics window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCallFailedCount() {
        return this.callFailedCount;
    }
    /**
     * Gets the callPlacedCount property value. Number of outbound calls placed during this metrics window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCallPlacedCount() {
        return this.callPlacedCount;
    }
    /**
     * Gets the endAt property value. UTC timestamp when this reporting bucket ends.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndAt() {
        return this.endAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("callFailedCount", (n) -> { this.setCallFailedCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("callPlacedCount", (n) -> { this.setCallPlacedCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("endAt", (n) -> { this.setEndAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("mmsFailedCount", (n) -> { this.setMmsFailedCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("mmsSentCount", (n) -> { this.setMmsSentCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("smsFailedCount", (n) -> { this.setSmsFailedCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("smsSentCount", (n) -> { this.setSmsSentCount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("startAt", (n) -> { this.setStartAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. Short display label for this phone number traffic trend bucket, formatted for charts, filters, or list views.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the mmsFailedCount property value. Number of MMS messages that failed during this metrics window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getMmsFailedCount() {
        return this.mmsFailedCount;
    }
    /**
     * Gets the mmsSentCount property value. Number of MMS messages sent during this metrics window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getMmsSentCount() {
        return this.mmsSentCount;
    }
    /**
     * Gets the smsFailedCount property value. Number of SMS messages that failed during this metrics window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getSmsFailedCount() {
        return this.smsFailedCount;
    }
    /**
     * Gets the smsSentCount property value. Number of SMS messages sent during this metrics window.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getSmsSentCount() {
        return this.smsSentCount;
    }
    /**
     * Gets the startAt property value. UTC timestamp when this reporting bucket starts.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartAt() {
        return this.startAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("callFailedCount", this.getCallFailedCount());
        writer.writeObjectValue("callPlacedCount", this.getCallPlacedCount());
        writer.writeOffsetDateTimeValue("endAt", this.getEndAt());
        writer.writeStringValue("label", this.getLabel());
        writer.writeObjectValue("mmsFailedCount", this.getMmsFailedCount());
        writer.writeObjectValue("mmsSentCount", this.getMmsSentCount());
        writer.writeObjectValue("smsFailedCount", this.getSmsFailedCount());
        writer.writeObjectValue("smsSentCount", this.getSmsSentCount());
        writer.writeOffsetDateTimeValue("startAt", this.getStartAt());
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
     * Sets the callFailedCount property value. Number of outbound calls that failed during this metrics window.
     * @param value Value to set for the callFailedCount property.
     */
    public void setCallFailedCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.callFailedCount = value;
    }
    /**
     * Sets the callPlacedCount property value. Number of outbound calls placed during this metrics window.
     * @param value Value to set for the callPlacedCount property.
     */
    public void setCallPlacedCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.callPlacedCount = value;
    }
    /**
     * Sets the endAt property value. UTC timestamp when this reporting bucket ends.
     * @param value Value to set for the endAt property.
     */
    public void setEndAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endAt = value;
    }
    /**
     * Sets the label property value. Short display label for this phone number traffic trend bucket, formatted for charts, filters, or list views.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the mmsFailedCount property value. Number of MMS messages that failed during this metrics window.
     * @param value Value to set for the mmsFailedCount property.
     */
    public void setMmsFailedCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.mmsFailedCount = value;
    }
    /**
     * Sets the mmsSentCount property value. Number of MMS messages sent during this metrics window.
     * @param value Value to set for the mmsSentCount property.
     */
    public void setMmsSentCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.mmsSentCount = value;
    }
    /**
     * Sets the smsFailedCount property value. Number of SMS messages that failed during this metrics window.
     * @param value Value to set for the smsFailedCount property.
     */
    public void setSmsFailedCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.smsFailedCount = value;
    }
    /**
     * Sets the smsSentCount property value. Number of SMS messages sent during this metrics window.
     * @param value Value to set for the smsSentCount property.
     */
    public void setSmsSentCount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.smsSentCount = value;
    }
    /**
     * Sets the startAt property value. UTC timestamp when this reporting bucket starts.
     * @param value Value to set for the startAt property.
     */
    public void setStartAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startAt = value;
    }
}
