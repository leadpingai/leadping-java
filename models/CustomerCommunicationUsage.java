package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
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
    private UntypedNode answeredCalls;
    /**
     * Total connected call duration, in minutes, during the reporting period.
     */
    private UntypedNode callMinutes;
    /**
     * Number of outbound calls placed during the reporting period.
     */
    private UntypedNode callsPlaced;
    /**
     * Number of inbound calls received during the reporting period.
     */
    private UntypedNode callsReceived;
    /**
     * Number of SMS messages that failed or were blocked during the reporting period.
     */
    private UntypedNode failedOrBlockedSms;
    /**
     * Number of calls missed during the reporting period.
     */
    private UntypedNode missedCalls;
    /**
     * Number of SMS messages received during the reporting period.
     */
    private UntypedNode smsReceived;
    /**
     * Number of SMS messages sent during the reporting period.
     */
    private UntypedNode smsSent;
    /**
     * Collection of trend included with this Leadping customer communication usage.
     */
    private java.util.List<CustomerCommunicationUsagePoint> trend;
    /**
     * Usage spend represented by this Leadping customer communication usage.
     */
    private UntypedNode usageSpend;
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
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAnsweredCalls() {
        return this.answeredCalls;
    }
    /**
     * Gets the callMinutes property value. Total connected call duration, in minutes, during the reporting period.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCallMinutes() {
        return this.callMinutes;
    }
    /**
     * Gets the callsPlaced property value. Number of outbound calls placed during the reporting period.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCallsPlaced() {
        return this.callsPlaced;
    }
    /**
     * Gets the callsReceived property value. Number of inbound calls received during the reporting period.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getCallsReceived() {
        return this.callsReceived;
    }
    /**
     * Gets the failedOrBlockedSms property value. Number of SMS messages that failed or were blocked during the reporting period.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getFailedOrBlockedSms() {
        return this.failedOrBlockedSms;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("answeredCalls", (n) -> { this.setAnsweredCalls(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("callMinutes", (n) -> { this.setCallMinutes(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("callsPlaced", (n) -> { this.setCallsPlaced(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("callsReceived", (n) -> { this.setCallsReceived(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("failedOrBlockedSms", (n) -> { this.setFailedOrBlockedSms(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("missedCalls", (n) -> { this.setMissedCalls(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("smsReceived", (n) -> { this.setSmsReceived(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("smsSent", (n) -> { this.setSmsSent(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("trend", (n) -> { this.setTrend(n.getCollectionOfObjectValues(CustomerCommunicationUsagePoint::createFromDiscriminatorValue)); });
        deserializerMap.put("usageSpend", (n) -> { this.setUsageSpend(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the missedCalls property value. Number of calls missed during the reporting period.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getMissedCalls() {
        return this.missedCalls;
    }
    /**
     * Gets the smsReceived property value. Number of SMS messages received during the reporting period.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getSmsReceived() {
        return this.smsReceived;
    }
    /**
     * Gets the smsSent property value. Number of SMS messages sent during the reporting period.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getSmsSent() {
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
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getUsageSpend() {
        return this.usageSpend;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("answeredCalls", this.getAnsweredCalls());
        writer.writeObjectValue("callMinutes", this.getCallMinutes());
        writer.writeObjectValue("callsPlaced", this.getCallsPlaced());
        writer.writeObjectValue("callsReceived", this.getCallsReceived());
        writer.writeObjectValue("failedOrBlockedSms", this.getFailedOrBlockedSms());
        writer.writeObjectValue("missedCalls", this.getMissedCalls());
        writer.writeObjectValue("smsReceived", this.getSmsReceived());
        writer.writeObjectValue("smsSent", this.getSmsSent());
        writer.writeCollectionOfObjectValues("trend", this.getTrend());
        writer.writeObjectValue("usageSpend", this.getUsageSpend());
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
    public void setAnsweredCalls(@jakarta.annotation.Nullable final UntypedNode value) {
        this.answeredCalls = value;
    }
    /**
     * Sets the callMinutes property value. Total connected call duration, in minutes, during the reporting period.
     * @param value Value to set for the callMinutes property.
     */
    public void setCallMinutes(@jakarta.annotation.Nullable final UntypedNode value) {
        this.callMinutes = value;
    }
    /**
     * Sets the callsPlaced property value. Number of outbound calls placed during the reporting period.
     * @param value Value to set for the callsPlaced property.
     */
    public void setCallsPlaced(@jakarta.annotation.Nullable final UntypedNode value) {
        this.callsPlaced = value;
    }
    /**
     * Sets the callsReceived property value. Number of inbound calls received during the reporting period.
     * @param value Value to set for the callsReceived property.
     */
    public void setCallsReceived(@jakarta.annotation.Nullable final UntypedNode value) {
        this.callsReceived = value;
    }
    /**
     * Sets the failedOrBlockedSms property value. Number of SMS messages that failed or were blocked during the reporting period.
     * @param value Value to set for the failedOrBlockedSms property.
     */
    public void setFailedOrBlockedSms(@jakarta.annotation.Nullable final UntypedNode value) {
        this.failedOrBlockedSms = value;
    }
    /**
     * Sets the missedCalls property value. Number of calls missed during the reporting period.
     * @param value Value to set for the missedCalls property.
     */
    public void setMissedCalls(@jakarta.annotation.Nullable final UntypedNode value) {
        this.missedCalls = value;
    }
    /**
     * Sets the smsReceived property value. Number of SMS messages received during the reporting period.
     * @param value Value to set for the smsReceived property.
     */
    public void setSmsReceived(@jakarta.annotation.Nullable final UntypedNode value) {
        this.smsReceived = value;
    }
    /**
     * Sets the smsSent property value. Number of SMS messages sent during the reporting period.
     * @param value Value to set for the smsSent property.
     */
    public void setSmsSent(@jakarta.annotation.Nullable final UntypedNode value) {
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
    public void setUsageSpend(@jakarta.annotation.Nullable final UntypedNode value) {
        this.usageSpend = value;
    }
}
