package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerCommunicationUsagePoint implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The callMinutes property
     */
    private Double callMinutes;
    /**
     * The calls property
     */
    private Integer calls;
    /**
     * The endAt property
     */
    private OffsetDateTime endAt;
    /**
     * The label property
     */
    private String label;
    /**
     * The smsReceived property
     */
    private Integer smsReceived;
    /**
     * The smsSent property
     */
    private Integer smsSent;
    /**
     * The spend property
     */
    private Double spend;
    /**
     * The startAt property
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
     * Gets the callMinutes property value. The callMinutes property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getCallMinutes() {
        return this.callMinutes;
    }
    /**
     * Gets the calls property value. The calls property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCalls() {
        return this.calls;
    }
    /**
     * Gets the endAt property value. The endAt property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("callMinutes", (n) -> { this.setCallMinutes(n.getDoubleValue()); });
        deserializerMap.put("calls", (n) -> { this.setCalls(n.getIntegerValue()); });
        deserializerMap.put("endAt", (n) -> { this.setEndAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("smsReceived", (n) -> { this.setSmsReceived(n.getIntegerValue()); });
        deserializerMap.put("smsSent", (n) -> { this.setSmsSent(n.getIntegerValue()); });
        deserializerMap.put("spend", (n) -> { this.setSpend(n.getDoubleValue()); });
        deserializerMap.put("startAt", (n) -> { this.setStartAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. The label property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the smsReceived property value. The smsReceived property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsReceived() {
        return this.smsReceived;
    }
    /**
     * Gets the smsSent property value. The smsSent property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSmsSent() {
        return this.smsSent;
    }
    /**
     * Gets the spend property value. The spend property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getSpend() {
        return this.spend;
    }
    /**
     * Gets the startAt property value. The startAt property
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
        writer.writeDoubleValue("callMinutes", this.getCallMinutes());
        writer.writeIntegerValue("calls", this.getCalls());
        writer.writeOffsetDateTimeValue("endAt", this.getEndAt());
        writer.writeStringValue("label", this.getLabel());
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
     * Sets the callMinutes property value. The callMinutes property
     * @param value Value to set for the callMinutes property.
     */
    public void setCallMinutes(@jakarta.annotation.Nullable final Double value) {
        this.callMinutes = value;
    }
    /**
     * Sets the calls property value. The calls property
     * @param value Value to set for the calls property.
     */
    public void setCalls(@jakarta.annotation.Nullable final Integer value) {
        this.calls = value;
    }
    /**
     * Sets the endAt property value. The endAt property
     * @param value Value to set for the endAt property.
     */
    public void setEndAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endAt = value;
    }
    /**
     * Sets the label property value. The label property
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the smsReceived property value. The smsReceived property
     * @param value Value to set for the smsReceived property.
     */
    public void setSmsReceived(@jakarta.annotation.Nullable final Integer value) {
        this.smsReceived = value;
    }
    /**
     * Sets the smsSent property value. The smsSent property
     * @param value Value to set for the smsSent property.
     */
    public void setSmsSent(@jakarta.annotation.Nullable final Integer value) {
        this.smsSent = value;
    }
    /**
     * Sets the spend property value. The spend property
     * @param value Value to set for the spend property.
     */
    public void setSpend(@jakarta.annotation.Nullable final Double value) {
        this.spend = value;
    }
    /**
     * Sets the startAt property value. The startAt property
     * @param value Value to set for the startAt property.
     */
    public void setStartAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startAt = value;
    }
}
