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
 * Measures automation execution activity within one analytics time bucket.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerAutomationHealthPoint implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Gets or sets the end at.
     */
    private OffsetDateTime endAt;
    /**
     * Gets or sets the executions.
     */
    private Integer executions;
    /**
     * Gets or sets the failure count.
     */
    private Integer failureCount;
    /**
     * Gets or sets the label.
     */
    private String label;
    /**
     * Gets or sets the start at.
     */
    private OffsetDateTime startAt;
    /**
     * Gets or sets the success count.
     */
    private Integer successCount;
    /**
     * Instantiates a new {@link CustomerAutomationHealthPoint} and sets the default values.
     */
    public CustomerAutomationHealthPoint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerAutomationHealthPoint}
     */
    @jakarta.annotation.Nonnull
    public static CustomerAutomationHealthPoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerAutomationHealthPoint();
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
     * Gets the endAt property value. Gets or sets the end at.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndAt() {
        return this.endAt;
    }
    /**
     * Gets the executions property value. Gets or sets the executions.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getExecutions() {
        return this.executions;
    }
    /**
     * Gets the failureCount property value. Gets or sets the failure count.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailureCount() {
        return this.failureCount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("endAt", (n) -> { this.setEndAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("executions", (n) -> { this.setExecutions(n.getIntegerValue()); });
        deserializerMap.put("failureCount", (n) -> { this.setFailureCount(n.getIntegerValue()); });
        deserializerMap.put("label", (n) -> { this.setLabel(n.getStringValue()); });
        deserializerMap.put("startAt", (n) -> { this.setStartAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("successCount", (n) -> { this.setSuccessCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the label property value. Gets or sets the label.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabel() {
        return this.label;
    }
    /**
     * Gets the startAt property value. Gets or sets the start at.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartAt() {
        return this.startAt;
    }
    /**
     * Gets the successCount property value. Gets or sets the success count.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessCount() {
        return this.successCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("endAt", this.getEndAt());
        writer.writeIntegerValue("executions", this.getExecutions());
        writer.writeIntegerValue("failureCount", this.getFailureCount());
        writer.writeStringValue("label", this.getLabel());
        writer.writeOffsetDateTimeValue("startAt", this.getStartAt());
        writer.writeIntegerValue("successCount", this.getSuccessCount());
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
     * Sets the endAt property value. Gets or sets the end at.
     * @param value Value to set for the endAt property.
     */
    public void setEndAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.endAt = value;
    }
    /**
     * Sets the executions property value. Gets or sets the executions.
     * @param value Value to set for the executions property.
     */
    public void setExecutions(@jakarta.annotation.Nullable final Integer value) {
        this.executions = value;
    }
    /**
     * Sets the failureCount property value. Gets or sets the failure count.
     * @param value Value to set for the failureCount property.
     */
    public void setFailureCount(@jakarta.annotation.Nullable final Integer value) {
        this.failureCount = value;
    }
    /**
     * Sets the label property value. Gets or sets the label.
     * @param value Value to set for the label property.
     */
    public void setLabel(@jakarta.annotation.Nullable final String value) {
        this.label = value;
    }
    /**
     * Sets the startAt property value. Gets or sets the start at.
     * @param value Value to set for the startAt property.
     */
    public void setStartAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.startAt = value;
    }
    /**
     * Sets the successCount property value. Gets or sets the success count.
     * @param value Value to set for the successCount property.
     */
    public void setSuccessCount(@jakarta.annotation.Nullable final Integer value) {
        this.successCount = value;
    }
}
