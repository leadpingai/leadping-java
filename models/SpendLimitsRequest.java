package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Organization usage budgets in USD. Null removes a limit; zero stops new paid usage.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SpendLimitsRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Optional calling budget in USD.
     */
    private Double callingLimit;
    /**
     * Calendar period for an organization channel budget, in UTC.
     */
    private SpendPeriod callingPeriod;
    /**
     * Daily usage budget in USD for the UTC calendar day. Null removes the limit; zero stops new paid usage.
     */
    private Double dailyLimit;
    /**
     * Monthly usage budget in USD for the UTC calendar month. Null removes the limit; zero stops new paid usage.
     */
    private Double monthlyLimit;
    /**
     * Optional texting budget in USD.
     */
    private Double textingLimit;
    /**
     * Calendar period for an organization channel budget, in UTC.
     */
    private SpendPeriod textingPeriod;
    /**
     * Instantiates a new {@link SpendLimitsRequest} and sets the default values.
     */
    public SpendLimitsRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SpendLimitsRequest}
     */
    @jakarta.annotation.Nonnull
    public static SpendLimitsRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SpendLimitsRequest();
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
     * Gets the callingLimit property value. Optional calling budget in USD.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getCallingLimit() {
        return this.callingLimit;
    }
    /**
     * Gets the callingPeriod property value. Calendar period for an organization channel budget, in UTC.
     * @return a {@link SpendPeriod}
     */
    @jakarta.annotation.Nullable
    public SpendPeriod getCallingPeriod() {
        return this.callingPeriod;
    }
    /**
     * Gets the dailyLimit property value. Daily usage budget in USD for the UTC calendar day. Null removes the limit; zero stops new paid usage.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getDailyLimit() {
        return this.dailyLimit;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("callingLimit", (n) -> { this.setCallingLimit(n.getDoubleValue()); });
        deserializerMap.put("callingPeriod", (n) -> { this.setCallingPeriod(n.getEnumValue(SpendPeriod::forValue)); });
        deserializerMap.put("dailyLimit", (n) -> { this.setDailyLimit(n.getDoubleValue()); });
        deserializerMap.put("monthlyLimit", (n) -> { this.setMonthlyLimit(n.getDoubleValue()); });
        deserializerMap.put("textingLimit", (n) -> { this.setTextingLimit(n.getDoubleValue()); });
        deserializerMap.put("textingPeriod", (n) -> { this.setTextingPeriod(n.getEnumValue(SpendPeriod::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the monthlyLimit property value. Monthly usage budget in USD for the UTC calendar month. Null removes the limit; zero stops new paid usage.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMonthlyLimit() {
        return this.monthlyLimit;
    }
    /**
     * Gets the textingLimit property value. Optional texting budget in USD.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getTextingLimit() {
        return this.textingLimit;
    }
    /**
     * Gets the textingPeriod property value. Calendar period for an organization channel budget, in UTC.
     * @return a {@link SpendPeriod}
     */
    @jakarta.annotation.Nullable
    public SpendPeriod getTextingPeriod() {
        return this.textingPeriod;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("callingLimit", this.getCallingLimit());
        writer.writeEnumValue("callingPeriod", this.getCallingPeriod());
        writer.writeDoubleValue("dailyLimit", this.getDailyLimit());
        writer.writeDoubleValue("monthlyLimit", this.getMonthlyLimit());
        writer.writeDoubleValue("textingLimit", this.getTextingLimit());
        writer.writeEnumValue("textingPeriod", this.getTextingPeriod());
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
     * Sets the callingLimit property value. Optional calling budget in USD.
     * @param value Value to set for the callingLimit property.
     */
    public void setCallingLimit(@jakarta.annotation.Nullable final Double value) {
        this.callingLimit = value;
    }
    /**
     * Sets the callingPeriod property value. Calendar period for an organization channel budget, in UTC.
     * @param value Value to set for the callingPeriod property.
     */
    public void setCallingPeriod(@jakarta.annotation.Nullable final SpendPeriod value) {
        this.callingPeriod = value;
    }
    /**
     * Sets the dailyLimit property value. Daily usage budget in USD for the UTC calendar day. Null removes the limit; zero stops new paid usage.
     * @param value Value to set for the dailyLimit property.
     */
    public void setDailyLimit(@jakarta.annotation.Nullable final Double value) {
        this.dailyLimit = value;
    }
    /**
     * Sets the monthlyLimit property value. Monthly usage budget in USD for the UTC calendar month. Null removes the limit; zero stops new paid usage.
     * @param value Value to set for the monthlyLimit property.
     */
    public void setMonthlyLimit(@jakarta.annotation.Nullable final Double value) {
        this.monthlyLimit = value;
    }
    /**
     * Sets the textingLimit property value. Optional texting budget in USD.
     * @param value Value to set for the textingLimit property.
     */
    public void setTextingLimit(@jakarta.annotation.Nullable final Double value) {
        this.textingLimit = value;
    }
    /**
     * Sets the textingPeriod property value. Calendar period for an organization channel budget, in UTC.
     * @param value Value to set for the textingPeriod property.
     */
    public void setTextingPeriod(@jakarta.annotation.Nullable final SpendPeriod value) {
        this.textingPeriod = value;
    }
}
