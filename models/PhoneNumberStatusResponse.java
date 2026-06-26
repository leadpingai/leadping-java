package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Response schema for the Leadping API phone number readiness status returned to authenticated clients.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumberStatusResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether this phone number can currently place outbound calls.
     */
    private Integer callsPossible;
    /**
     * Voice call warmup status for this phone number.
     */
    private PhoneNumberStatusResponseCallWarmup callWarmup;
    /**
     * Indicates whether this phone number can currently send SMS messages.
     */
    private Integer messagesPossible;
    /**
     * Number of warmup SMS messages completed for this sender.
     */
    private Integer messagesWarmed;
    /**
     * E.164 phone number exposed by this phone number readiness status.
     */
    private String number;
    /**
     * Recent SMS opt-out metrics used to evaluate sender health and compliance risk.
     */
    private PhoneNumberOptOutMetricsResponse optOutMetrics;
    /**
     * Recent workflow events returned for timeline and troubleshooting.
     */
    private java.util.List<PhoneNumberMessagingEventResponse> recentEvents;
    /**
     * SMS sender warmup status for this phone number.
     */
    private PhoneNumberStatusResponseSmsWarmup smsWarmup;
    /**
     * Phone number traffic metrics for recent SMS and call activity.
     */
    private PhoneNumberTrafficMetricsResponse trafficMetrics;
    /**
     * Number of voice warmup calls completed for this phone number.
     */
    private Integer warmupCallsMade;
    /**
     * Instantiates a new {@link PhoneNumberStatusResponse} and sets the default values.
     */
    public PhoneNumberStatusResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PhoneNumberStatusResponse}
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumberStatusResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumberStatusResponse();
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
     * Gets the callsPossible property value. Indicates whether this phone number can currently place outbound calls.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCallsPossible() {
        return this.callsPossible;
    }
    /**
     * Gets the callWarmup property value. Voice call warmup status for this phone number.
     * @return a {@link PhoneNumberStatusResponseCallWarmup}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberStatusResponseCallWarmup getCallWarmup() {
        return this.callWarmup;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("callsPossible", (n) -> { this.setCallsPossible(n.getIntegerValue()); });
        deserializerMap.put("callWarmup", (n) -> { this.setCallWarmup(n.getObjectValue(PhoneNumberStatusResponseCallWarmup::createFromDiscriminatorValue)); });
        deserializerMap.put("messagesPossible", (n) -> { this.setMessagesPossible(n.getIntegerValue()); });
        deserializerMap.put("messagesWarmed", (n) -> { this.setMessagesWarmed(n.getIntegerValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("optOutMetrics", (n) -> { this.setOptOutMetrics(n.getObjectValue(PhoneNumberOptOutMetricsResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("recentEvents", (n) -> { this.setRecentEvents(n.getCollectionOfObjectValues(PhoneNumberMessagingEventResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("smsWarmup", (n) -> { this.setSmsWarmup(n.getObjectValue(PhoneNumberStatusResponseSmsWarmup::createFromDiscriminatorValue)); });
        deserializerMap.put("trafficMetrics", (n) -> { this.setTrafficMetrics(n.getObjectValue(PhoneNumberTrafficMetricsResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("warmupCallsMade", (n) -> { this.setWarmupCallsMade(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the messagesPossible property value. Indicates whether this phone number can currently send SMS messages.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMessagesPossible() {
        return this.messagesPossible;
    }
    /**
     * Gets the messagesWarmed property value. Number of warmup SMS messages completed for this sender.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMessagesWarmed() {
        return this.messagesWarmed;
    }
    /**
     * Gets the number property value. E.164 phone number exposed by this phone number readiness status.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.number;
    }
    /**
     * Gets the optOutMetrics property value. Recent SMS opt-out metrics used to evaluate sender health and compliance risk.
     * @return a {@link PhoneNumberOptOutMetricsResponse}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberOptOutMetricsResponse getOptOutMetrics() {
        return this.optOutMetrics;
    }
    /**
     * Gets the recentEvents property value. Recent workflow events returned for timeline and troubleshooting.
     * @return a {@link java.util.List<PhoneNumberMessagingEventResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PhoneNumberMessagingEventResponse> getRecentEvents() {
        return this.recentEvents;
    }
    /**
     * Gets the smsWarmup property value. SMS sender warmup status for this phone number.
     * @return a {@link PhoneNumberStatusResponseSmsWarmup}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberStatusResponseSmsWarmup getSmsWarmup() {
        return this.smsWarmup;
    }
    /**
     * Gets the trafficMetrics property value. Phone number traffic metrics for recent SMS and call activity.
     * @return a {@link PhoneNumberTrafficMetricsResponse}
     */
    @jakarta.annotation.Nullable
    public PhoneNumberTrafficMetricsResponse getTrafficMetrics() {
        return this.trafficMetrics;
    }
    /**
     * Gets the warmupCallsMade property value. Number of voice warmup calls completed for this phone number.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getWarmupCallsMade() {
        return this.warmupCallsMade;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("callsPossible", this.getCallsPossible());
        writer.writeObjectValue("callWarmup", this.getCallWarmup());
        writer.writeIntegerValue("messagesPossible", this.getMessagesPossible());
        writer.writeIntegerValue("messagesWarmed", this.getMessagesWarmed());
        writer.writeStringValue("number", this.getNumber());
        writer.writeObjectValue("optOutMetrics", this.getOptOutMetrics());
        writer.writeCollectionOfObjectValues("recentEvents", this.getRecentEvents());
        writer.writeObjectValue("smsWarmup", this.getSmsWarmup());
        writer.writeObjectValue("trafficMetrics", this.getTrafficMetrics());
        writer.writeIntegerValue("warmupCallsMade", this.getWarmupCallsMade());
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
     * Sets the callsPossible property value. Indicates whether this phone number can currently place outbound calls.
     * @param value Value to set for the callsPossible property.
     */
    public void setCallsPossible(@jakarta.annotation.Nullable final Integer value) {
        this.callsPossible = value;
    }
    /**
     * Sets the callWarmup property value. Voice call warmup status for this phone number.
     * @param value Value to set for the callWarmup property.
     */
    public void setCallWarmup(@jakarta.annotation.Nullable final PhoneNumberStatusResponseCallWarmup value) {
        this.callWarmup = value;
    }
    /**
     * Sets the messagesPossible property value. Indicates whether this phone number can currently send SMS messages.
     * @param value Value to set for the messagesPossible property.
     */
    public void setMessagesPossible(@jakarta.annotation.Nullable final Integer value) {
        this.messagesPossible = value;
    }
    /**
     * Sets the messagesWarmed property value. Number of warmup SMS messages completed for this sender.
     * @param value Value to set for the messagesWarmed property.
     */
    public void setMessagesWarmed(@jakarta.annotation.Nullable final Integer value) {
        this.messagesWarmed = value;
    }
    /**
     * Sets the number property value. E.164 phone number exposed by this phone number readiness status.
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.number = value;
    }
    /**
     * Sets the optOutMetrics property value. Recent SMS opt-out metrics used to evaluate sender health and compliance risk.
     * @param value Value to set for the optOutMetrics property.
     */
    public void setOptOutMetrics(@jakarta.annotation.Nullable final PhoneNumberOptOutMetricsResponse value) {
        this.optOutMetrics = value;
    }
    /**
     * Sets the recentEvents property value. Recent workflow events returned for timeline and troubleshooting.
     * @param value Value to set for the recentEvents property.
     */
    public void setRecentEvents(@jakarta.annotation.Nullable final java.util.List<PhoneNumberMessagingEventResponse> value) {
        this.recentEvents = value;
    }
    /**
     * Sets the smsWarmup property value. SMS sender warmup status for this phone number.
     * @param value Value to set for the smsWarmup property.
     */
    public void setSmsWarmup(@jakarta.annotation.Nullable final PhoneNumberStatusResponseSmsWarmup value) {
        this.smsWarmup = value;
    }
    /**
     * Sets the trafficMetrics property value. Phone number traffic metrics for recent SMS and call activity.
     * @param value Value to set for the trafficMetrics property.
     */
    public void setTrafficMetrics(@jakarta.annotation.Nullable final PhoneNumberTrafficMetricsResponse value) {
        this.trafficMetrics = value;
    }
    /**
     * Sets the warmupCallsMade property value. Number of voice warmup calls completed for this phone number.
     * @param value Value to set for the warmupCallsMade property.
     */
    public void setWarmupCallsMade(@jakarta.annotation.Nullable final Integer value) {
        this.warmupCallsMade = value;
    }
}
