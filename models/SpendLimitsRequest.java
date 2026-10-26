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
     * The dailyLimit property
     */
    private Double dailyLimit;
    /**
     * The monthlyLimit property
     */
    private Double monthlyLimit;
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
     * Gets the dailyLimit property value. The dailyLimit property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("dailyLimit", (n) -> { this.setDailyLimit(n.getDoubleValue()); });
        deserializerMap.put("monthlyLimit", (n) -> { this.setMonthlyLimit(n.getDoubleValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("dailyLimit", this.getDailyLimit());
        writer.writeDoubleValue("monthlyLimit", this.getMonthlyLimit());
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
     * Sets the monthlyLimit property value. The monthlyLimit property
     * @param value Value to set for the monthlyLimit property.
     */
    public void setMonthlyLimit(@jakarta.annotation.Nullable final Double value) {
        this.monthlyLimit = value;
    }
}
