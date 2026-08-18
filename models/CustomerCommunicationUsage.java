package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents customer communication usage data exposed by Leadping analytics.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerCommunicationUsage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of calls answered during the reporting period.
     */
    private Integer answeredCalls;
    /**
     * Total connected call duration, in minutes, during the reporting period.
     */
    private Double callMinutes;
    /**
     * Number of outbound calls placed during the reporting period.
     */
    private Integer callsPlaced;
    /**
     * Number of inbound calls received during the reporting period.
     */
    private Integer callsReceived;
    /**
     * Number of SMS messages that failed or were blocked during the reporting period.
     */
    private Integer failedOrBlockedSms;
    /**
     * Number of calls missed during the reporting period.
     */
    private Integer missedCalls;
    /**
     * Number of SMS messages received during the reporting period.
     */
    private Integer smsReceived;
    /**
     * Number of SMS messages sent during the reporting period.
     */
    private Integer smsSent;
    /**
     * Collection of trend included with this Leadping customer communication usage.
     */
    private java.util.List<CustomerCommunicationUsagePoint> trend;
    /**
     * Usage spend represented by this Leadping customer communication usage.
     */
    private Double usageSpend;
    /**
     * Instantiates a new {@link CustomerCommunicationUsage} and sets the default values.
     */
    public CustomerCommunicationUsage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerCommunicationUsage}
     */
    @jakarta.annotation.Nonnull
    public static CustomerCommunicationUsage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerCommunicationUsage();
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
     * Gets the answeredCalls property value. Number of calls answered during the reporting period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAnsweredCalls() {
        return this.answeredCalls;
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
     * Gets the callsPlaced property value. Number of outbound calls placed during the reporting period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCallsPlaced() {
        return this.callsPlaced;
    }
    /**
     * Gets the callsReceived property value. Number of inbound calls received during the reporting period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCallsReceived() {
        return this.callsReceived;
    }
    /**
     * Gets the failedOrBlockedSms property value. Number of SMS messages that failed or were blocked during the reporting period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedOrBlockedSms() {
        return this.failedOrBlockedSms;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("answeredCalls", (n) -> { this.setAnsweredCalls(n.getIntegerValue()); });
        deserializerMap.put("callMinutes", (n) -> { this.setCallMinutes(n.getDoubleValue()); });
        deserializerMap.put("callsPlaced", (n) -> { this.setCallsPlaced(n.getIntegerValue()); });
        deserializerMap.put("callsReceived", (n) -> { this.setCallsReceived(n.getIntegerValue()); });
        deserializerMap.put("failedOrBlockedSms", (n) -> { this.setFailedOrBlockedSms(n.getIntegerValue()); });
        deserializerMap.put("missedCalls", (n) -> { this.setMissedCalls(n.getIntegerValue()); });
        deserializerMap.put("smsReceived", (n) -> { this.setSmsReceived(n.getIntegerValue()); });
        deserializerMap.put("smsSent", (n) -> { this.setSmsSent(n.getIntegerValue()); });
        deserializerMap.put("trend", (n) -> { this.setTrend(n.getCollectionOfObjectValues(CustomerCommunicationUsagePoint::createFromDiscriminatorValue)); });
        deserializerMap.put("usageSpend", (n) -> { this.setUsageSpend(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the missedCalls property value. Number of calls missed during the reporting period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMissedCalls() {
        return this.missedCalls;
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
     * Gets the smsSent property value. Number of SMS messages sent during the reporting period.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsSent() {
        return this.smsSent;
    }
    /**
     * Gets the trend property value. Collection of trend included with this Leadping customer communication usage.
     * @return a {@link java.util.List<CustomerCommunicationUsagePoint>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CustomerCommunicationUsagePoint> getTrend() {
        return this.trend;
    }
    /**
     * Gets the usageSpend property value. Usage spend represented by this Leadping customer communication usage.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getUsageSpend() {
        return this.usageSpend;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("answeredCalls", this.getAnsweredCalls());
        writer.writeDoubleValue("callMinutes", this.getCallMinutes());
        writer.writeIntegerValue("callsPlaced", this.getCallsPlaced());
        writer.writeIntegerValue("callsReceived", this.getCallsReceived());
        writer.writeIntegerValue("failedOrBlockedSms", this.getFailedOrBlockedSms());
        writer.writeIntegerValue("missedCalls", this.getMissedCalls());
        writer.writeIntegerValue("smsReceived", this.getSmsReceived());
        writer.writeIntegerValue("smsSent", this.getSmsSent());
        writer.writeCollectionOfObjectValues("trend", this.getTrend());
        writer.writeDoubleValue("usageSpend", this.getUsageSpend());
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
     * Sets the answeredCalls property value. Number of calls answered during the reporting period.
     * @param value Value to set for the answeredCalls property.
     */
    public void setAnsweredCalls(@jakarta.annotation.Nullable final Integer value) {
        this.answeredCalls = value;
    }
    /**
     * Sets the callMinutes property value. Total connected call duration, in minutes, during the reporting period.
     * @param value Value to set for the callMinutes property.
     */
    public void setCallMinutes(@jakarta.annotation.Nullable final Double value) {
        this.callMinutes = value;
    }
    /**
     * Sets the callsPlaced property value. Number of outbound calls placed during the reporting period.
     * @param value Value to set for the callsPlaced property.
     */
    public void setCallsPlaced(@jakarta.annotation.Nullable final Integer value) {
        this.callsPlaced = value;
    }
    /**
     * Sets the callsReceived property value. Number of inbound calls received during the reporting period.
     * @param value Value to set for the callsReceived property.
     */
    public void setCallsReceived(@jakarta.annotation.Nullable final Integer value) {
        this.callsReceived = value;
    }
    /**
     * Sets the failedOrBlockedSms property value. Number of SMS messages that failed or were blocked during the reporting period.
     * @param value Value to set for the failedOrBlockedSms property.
     */
    public void setFailedOrBlockedSms(@jakarta.annotation.Nullable final Integer value) {
        this.failedOrBlockedSms = value;
    }
    /**
     * Sets the missedCalls property value. Number of calls missed during the reporting period.
     * @param value Value to set for the missedCalls property.
     */
    public void setMissedCalls(@jakarta.annotation.Nullable final Integer value) {
        this.missedCalls = value;
    }
    /**
     * Sets the smsReceived property value. Number of SMS messages received during the reporting period.
     * @param value Value to set for the smsReceived property.
     */
    public void setSmsReceived(@jakarta.annotation.Nullable final Integer value) {
        this.smsReceived = value;
    }
    /**
     * Sets the smsSent property value. Number of SMS messages sent during the reporting period.
     * @param value Value to set for the smsSent property.
     */
    public void setSmsSent(@jakarta.annotation.Nullable final Integer value) {
        this.smsSent = value;
    }
    /**
     * Sets the trend property value. Collection of trend included with this Leadping customer communication usage.
     * @param value Value to set for the trend property.
     */
    public void setTrend(@jakarta.annotation.Nullable final java.util.List<CustomerCommunicationUsagePoint> value) {
        this.trend = value;
    }
    /**
     * Sets the usageSpend property value. Usage spend represented by this Leadping customer communication usage.
     * @param value Value to set for the usageSpend property.
     */
    public void setUsageSpend(@jakarta.annotation.Nullable final Double value) {
        this.usageSpend = value;
    }
}
