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
 * UTC calendar usage budgets, settled spend, and pending usage reservations in USD.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SpendLimitsResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The dailyLimit property
     */
    private Double dailyLimit;
    /**
     * The dailyResetsAt property
     */
    private OffsetDateTime dailyResetsAt;
    /**
     * The dailySpent property
     */
    private Double dailySpent;
    /**
     * The monthlyLimit property
     */
    private Double monthlyLimit;
    /**
     * The monthlyResetsAt property
     */
    private OffsetDateTime monthlyResetsAt;
    /**
     * The monthlySpent property
     */
    private Double monthlySpent;
    /**
     * The reserved property
     */
    private Double reserved;
    /**
     * Instantiates a new {@link SpendLimitsResponse} and sets the default values.
     */
    public SpendLimitsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SpendLimitsResponse}
     */
    @jakarta.annotation.Nonnull
    public static SpendLimitsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SpendLimitsResponse();
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
     * Gets the dailyLimit property value. The dailyLimit property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getDailyLimit() {
        return this.dailyLimit;
    }
    /**
     * Gets the dailyResetsAt property value. The dailyResetsAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDailyResetsAt() {
        return this.dailyResetsAt;
    }
    /**
     * Gets the dailySpent property value. The dailySpent property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getDailySpent() {
        return this.dailySpent;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("dailyLimit", (n) -> { this.setDailyLimit(n.getDoubleValue()); });
        deserializerMap.put("dailyResetsAt", (n) -> { this.setDailyResetsAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("dailySpent", (n) -> { this.setDailySpent(n.getDoubleValue()); });
        deserializerMap.put("monthlyLimit", (n) -> { this.setMonthlyLimit(n.getDoubleValue()); });
        deserializerMap.put("monthlyResetsAt", (n) -> { this.setMonthlyResetsAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("monthlySpent", (n) -> { this.setMonthlySpent(n.getDoubleValue()); });
        deserializerMap.put("reserved", (n) -> { this.setReserved(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the monthlyLimit property value. The monthlyLimit property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMonthlyLimit() {
        return this.monthlyLimit;
    }
    /**
     * Gets the monthlyResetsAt property value. The monthlyResetsAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getMonthlyResetsAt() {
        return this.monthlyResetsAt;
    }
    /**
     * Gets the monthlySpent property value. The monthlySpent property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMonthlySpent() {
        return this.monthlySpent;
    }
    /**
     * Gets the reserved property value. The reserved property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getReserved() {
        return this.reserved;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("dailyLimit", this.getDailyLimit());
        writer.writeOffsetDateTimeValue("dailyResetsAt", this.getDailyResetsAt());
        writer.writeDoubleValue("dailySpent", this.getDailySpent());
        writer.writeDoubleValue("monthlyLimit", this.getMonthlyLimit());
        writer.writeOffsetDateTimeValue("monthlyResetsAt", this.getMonthlyResetsAt());
        writer.writeDoubleValue("monthlySpent", this.getMonthlySpent());
        writer.writeDoubleValue("reserved", this.getReserved());
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
     * Sets the dailyLimit property value. The dailyLimit property
     * @param value Value to set for the dailyLimit property.
     */
    public void setDailyLimit(@jakarta.annotation.Nullable final Double value) {
        this.dailyLimit = value;
    }
    /**
     * Sets the dailyResetsAt property value. The dailyResetsAt property
     * @param value Value to set for the dailyResetsAt property.
     */
    public void setDailyResetsAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.dailyResetsAt = value;
    }
    /**
     * Sets the dailySpent property value. The dailySpent property
     * @param value Value to set for the dailySpent property.
     */
    public void setDailySpent(@jakarta.annotation.Nullable final Double value) {
        this.dailySpent = value;
    }
    /**
     * Sets the monthlyLimit property value. The monthlyLimit property
     * @param value Value to set for the monthlyLimit property.
     */
    public void setMonthlyLimit(@jakarta.annotation.Nullable final Double value) {
        this.monthlyLimit = value;
    }
    /**
     * Sets the monthlyResetsAt property value. The monthlyResetsAt property
     * @param value Value to set for the monthlyResetsAt property.
     */
    public void setMonthlyResetsAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.monthlyResetsAt = value;
    }
    /**
     * Sets the monthlySpent property value. The monthlySpent property
     * @param value Value to set for the monthlySpent property.
     */
    public void setMonthlySpent(@jakarta.annotation.Nullable final Double value) {
        this.monthlySpent = value;
    }
    /**
     * Sets the reserved property value. The reserved property
     * @param value Value to set for the reserved property.
     */
    public void setReserved(@jakarta.annotation.Nullable final Double value) {
        this.reserved = value;
    }
}
