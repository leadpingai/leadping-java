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
 * Measures organization messaging and calling activity within one analytics time bucket.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerCommunicationUsagePoint implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of calls that failed or were blocked in this time bucket.
     */
    private Integer callErrors;
    /**
     * Total connected call duration, in minutes, during the reporting period.
     */
    private Double callMinutes;
    /**
     * Number of calls represented by this Leadping customer communication usage point.
     */
    private Integer calls;
    /**
     * Number of outbound calls placed in this time bucket.
     */
    private Integer callsPlaced;
    /**
     * Number of inbound calls received in this time bucket.
     */
    private Integer callsReceived;
    /**
     * Date and time when this Leadping customer communication usage point was end.
     */
    private OffsetDateTime endAt;
    /**
     * Manual provider-accepted SMS messages; automated messages are excluded.
     */
    private Integer humanResponses;
    /**
     * Human-readable label for this Leadping customer communication usage point.
     */
    private String label;
    /**
     * Received prospect messages excluding consent and help commands.
     */
    private Integer prospectReplies;
    /**
     * Messages whose send execution started; queued and scheduled messages are excluded.
     */
    private Integer smsAttempted;
    /**
     * Messages confirmed delivered, counted at delivery time.
     */
    private Integer smsDelivered;
    /**
     * Number of SMS messages that failed or were blocked in this time bucket.
     */
    private Integer smsErrors;
    /**
     * Number of SMS messages received during the reporting period.
     */
    private Integer smsReceived;
    /**
     * Provider-accepted outbound messages, counted at acceptance time (SmsSent is the compatibility field name).
     */
    private Integer smsSent;
    /**
     * Spend represented by this Leadping customer communication usage point.
     */
    private Double spend;
    /**
     * Date and time when this Leadping customer communication usage point was start.
     */
    private OffsetDateTime startAt;
    /**
     * Instantiates a new {@link CustomerCommunicationUsagePoint} and sets the default values.
     */
    public CustomerCommunicationUsagePoint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerCommunicationUsagePoint}
     */
    @jakarta.annotation.Nonnull
    public static CustomerCommunicationUsagePoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerCommunicationUsagePoint();
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
     * Gets the callErrors property value. Number of calls that failed or were blocked in this time bucket.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCallErrors() {
        return this.callErrors;
    }
    /**
     * Gets the callMinutes property value. Total connected call duration, in minutes, during the reporting period.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getCallMinutes() {
        return this.callMinutes;
    }
    /**
     * Gets the calls property value. Number of calls represented by this Leadping customer communication usage point.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCalls() {
        return this.calls;
    }
    /**
     * Gets the callsPlaced property value. Number of outbound calls placed in this time bucket.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCallsPlaced() {
        return this.callsPlaced;
    }
    /**
     * Gets the callsReceived property value. Number of inbound calls received in this time bucket.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCallsReceived() {
        return this.callsReceived;
    }
    /**
     * Gets the endAt property value. Date and time when this Leadping customer communication usage point was end.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(16);
        deserializerMap.put("callErrors", (n) -> { this.setCallErrors(n.getIntegerValue()); });
        deserializerMap.put("callMinutes", (n) -> { this.setCallMinutes(n.getDoubleValue()); });
        deserializerMap.put("calls", (n) -> { this.setCalls(n.getIntegerValue()); });
        deserializerMap.put("callsPlaced", (n) -> { this.setCallsPlaced(n.getIntegerValue()); });
        deserializerMap.put("callsReceived", (n) -> { this.setCallsReceived(n.getIntegerValue()); });
        deserializerMap.put("endAt", (n) -> { this.setEndAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("humanResponses", (n) -> { this.setHumanResponses(n.getIntegerValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("prospectReplies", (n) -> { this.setProspectReplies(n.getIntegerValue()); });
        deserializerMap.put("smsAttempted", (n) -> { this.setSmsAttempted(n.getIntegerValue()); });
        deserializerMap.put("smsDelivered", (n) -> { this.setSmsDelivered(n.getIntegerValue()); });
        deserializerMap.put("smsErrors", (n) -> { this.setSmsErrors(n.getIntegerValue()); });
        deserializerMap.put("smsReceived", (n) -> { this.setSmsReceived(n.getIntegerValue()); });
        deserializerMap.put("smsSent", (n) -> { this.setSmsSent(n.getIntegerValue()); });
        deserializerMap.put("spend", (n) -> { this.setSpend(n.getDoubleValue()); });
        deserializerMap.put("startAt", (n) -> { this.setStartAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the humanResponses property value. Manual provider-accepted SMS messages; automated messages are excluded.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHumanResponses() {
        return this.humanResponses;
    }
    /**
     * Gets the label property value. Human-readable label for this Leadping customer communication usage point.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the prospectReplies property value. Received prospect messages excluding consent and help commands.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getProspectReplies() {
        return this.prospectReplies;
    }
    /**
     * Gets the smsAttempted property value. Messages whose send execution started; queued and scheduled messages are excluded.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsAttempted() {
        return this.smsAttempted;
    }
    /**
     * Gets the smsDelivered property value. Messages confirmed delivered, counted at delivery time.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsDelivered() {
        return this.smsDelivered;
    }
    /**
     * Gets the smsErrors property value. Number of SMS messages that failed or were blocked in this time bucket.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsErrors() {
        return this.smsErrors;
    }
    /**
     * Gets the smsReceived property value. Number of SMS messages received during the reporting period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsReceived() {
        return this.smsReceived;
    }
    /**
     * Gets the smsSent property value. Provider-accepted outbound messages, counted at acceptance time (SmsSent is the compatibility field name).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsSent() {
        return this.smsSent;
    }
    /**
     * Gets the spend property value. Spend represented by this Leadping customer communication usage point.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getSpend() {
        return this.spend;
    }
    /**
     * Gets the startAt property value. Date and time when this Leadping customer communication usage point was start.
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
        writer.writeIntegerValue("callErrors", this.getCallErrors());
        writer.writeDoubleValue("callMinutes", this.getCallMinutes());
        writer.writeIntegerValue("calls", this.getCalls());
        writer.writeIntegerValue("callsPlaced", this.getCallsPlaced());
        writer.writeIntegerValue("callsReceived", this.getCallsReceived());
        writer.writeOffsetDateTimeValue("endAt", this.getEndAt());
        writer.writeIntegerValue("humanResponses", this.getHumanResponses());
        writer.writeStringValue("label", this.getLabel());
        writer.writeIntegerValue("prospectReplies", this.getProspectReplies());
        writer.writeIntegerValue("smsAttempted", this.getSmsAttempted());
        writer.writeIntegerValue("smsDelivered", this.getSmsDelivered());
        writer.writeIntegerValue("smsErrors", this.getSmsErrors());
        writer.writeIntegerValue("smsReceived", this.getSmsReceived());
        writer.writeIntegerValue("smsSent", this.getSmsSent());
        writer.writeDoubleValue("spend", this.getSpend());
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
     * Sets the callErrors property value. Number of calls that failed or were blocked in this time bucket.
     * @param value Value to set for the callErrors property.
     */
    public void setCallErrors(@jakarta.annotation.Nullable final Integer value) {
        this.callErrors = value;
    }
    /**
     * Sets the callMinutes property value. Total connected call duration, in minutes, during the reporting period.
     * @param value Value to set for the callMinutes property.
     */
    public void setCallMinutes(@jakarta.annotation.Nullable final Double value) {
        this.callMinutes = value;
    }
    /**
     * Sets the calls property value. Number of calls represented by this Leadping customer communication usage point.
     * @param value Value to set for the calls property.
     */
    public void setCalls(@jakarta.annotation.Nullable final Integer value) {
        this.calls = value;
    }
    /**
     * Sets the callsPlaced property value. Number of outbound calls placed in this time bucket.
     * @param value Value to set for the callsPlaced property.
     */
    public void setCallsPlaced(@jakarta.annotation.Nullable final Integer value) {
        this.callsPlaced = value;
    }
    /**
     * Sets the callsReceived property value. Number of inbound calls received in this time bucket.
     * @param value Value to set for the callsReceived property.
     */
    public void setCallsReceived(@jakarta.annotation.Nullable final Integer value) {
        this.callsReceived = value;
    }
    /**
     * Sets the endAt property value. Date and time when this Leadping customer communication usage point was end.
     * @param value Value to set for the endAt property.
     */
    public void setEndAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endAt = value;
    }
    /**
     * Sets the humanResponses property value. Manual provider-accepted SMS messages; automated messages are excluded.
     * @param value Value to set for the humanResponses property.
     */
    public void setHumanResponses(@jakarta.annotation.Nullable final Integer value) {
        this.humanResponses = value;
    }
    /**
     * Sets the label property value. Human-readable label for this Leadping customer communication usage point.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the prospectReplies property value. Received prospect messages excluding consent and help commands.
     * @param value Value to set for the prospectReplies property.
     */
    public void setProspectReplies(@jakarta.annotation.Nullable final Integer value) {
        this.prospectReplies = value;
    }
    /**
     * Sets the smsAttempted property value. Messages whose send execution started; queued and scheduled messages are excluded.
     * @param value Value to set for the smsAttempted property.
     */
    public void setSmsAttempted(@jakarta.annotation.Nullable final Integer value) {
        this.smsAttempted = value;
    }
    /**
     * Sets the smsDelivered property value. Messages confirmed delivered, counted at delivery time.
     * @param value Value to set for the smsDelivered property.
     */
    public void setSmsDelivered(@jakarta.annotation.Nullable final Integer value) {
        this.smsDelivered = value;
    }
    /**
     * Sets the smsErrors property value. Number of SMS messages that failed or were blocked in this time bucket.
     * @param value Value to set for the smsErrors property.
     */
    public void setSmsErrors(@jakarta.annotation.Nullable final Integer value) {
        this.smsErrors = value;
    }
    /**
     * Sets the smsReceived property value. Number of SMS messages received during the reporting period.
     * @param value Value to set for the smsReceived property.
     */
    public void setSmsReceived(@jakarta.annotation.Nullable final Integer value) {
        this.smsReceived = value;
    }
    /**
     * Sets the smsSent property value. Provider-accepted outbound messages, counted at acceptance time (SmsSent is the compatibility field name).
     * @param value Value to set for the smsSent property.
     */
    public void setSmsSent(@jakarta.annotation.Nullable final Integer value) {
        this.smsSent = value;
    }
    /**
     * Sets the spend property value. Spend represented by this Leadping customer communication usage point.
     * @param value Value to set for the spend property.
     */
    public void setSpend(@jakarta.annotation.Nullable final Double value) {
        this.spend = value;
    }
    /**
     * Sets the startAt property value. Date and time when this Leadping customer communication usage point was start.
     * @param value Value to set for the startAt property.
     */
    public void setStartAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startAt = value;
    }
}
