package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The service or purchase requested by a lead.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadInquiry implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Maximum budget in the specified currency.
     */
    private Double budgetMaximum;
    /**
     * Minimum budget in the specified currency.
     */
    private Double budgetMinimum;
    /**
     * ISO 4217 currency code for the budget.
     */
    private String currency;
    /**
     * Description of the requested work or purchase.
     */
    private String description;
    /**
     * Requested start date.
     */
    private LocalDate desiredStartDate;
    /**
     * Requested service or product.
     */
    private String service;
    /**
     * Supported LeadUrgency values.
     */
    private LeadInquiryUrgency urgency;
    /**
     * Instantiates a new {@link LeadInquiry} and sets the default values.
     */
    public LeadInquiry() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadInquiry}
     */
    @jakarta.annotation.Nonnull
    public static LeadInquiry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadInquiry();
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
     * Gets the budgetMaximum property value. Maximum budget in the specified currency.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getBudgetMaximum() {
        return this.budgetMaximum;
    }
    /**
     * Gets the budgetMinimum property value. Minimum budget in the specified currency.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getBudgetMinimum() {
        return this.budgetMinimum;
    }
    /**
     * Gets the currency property value. ISO 4217 currency code for the budget.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrency() {
        return this.currency;
    }
    /**
     * Gets the description property value. Description of the requested work or purchase.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the desiredStartDate property value. Requested start date.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getDesiredStartDate() {
        return this.desiredStartDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("budgetMaximum", (n) -> { this.setBudgetMaximum(n.getDoubleValue()); });
        deserializerMap.put("budgetMinimum", (n) -> { this.setBudgetMinimum(n.getDoubleValue()); });
        deserializerMap.put("currency", (n) -> { this.setCurrency(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("desiredStartDate", (n) -> { this.setDesiredStartDate(n.getLocalDateValue()); });
        deserializerMap.put("service", (n) -> { this.setService(n.getStringValue()); });
        deserializerMap.put("urgency", (n) -> { this.setUrgency(n.getEnumValue(LeadInquiryUrgency::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the service property value. Requested service or product.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getService() {
        return this.service;
    }
    /**
     * Gets the urgency property value. Supported LeadUrgency values.
     * @return a {@link LeadInquiryUrgency}
     */
    @jakarta.annotation.Nullable
    public LeadInquiryUrgency getUrgency() {
        return this.urgency;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("budgetMaximum", this.getBudgetMaximum());
        writer.writeDoubleValue("budgetMinimum", this.getBudgetMinimum());
        writer.writeStringValue("currency", this.getCurrency());
        writer.writeStringValue("description", this.getDescription());
        writer.writeLocalDateValue("desiredStartDate", this.getDesiredStartDate());
        writer.writeStringValue("service", this.getService());
        writer.writeEnumValue("urgency", this.getUrgency());
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
     * Sets the budgetMaximum property value. Maximum budget in the specified currency.
     * @param value Value to set for the budgetMaximum property.
     */
    public void setBudgetMaximum(@jakarta.annotation.Nullable final Double value) {
        this.budgetMaximum = value;
    }
    /**
     * Sets the budgetMinimum property value. Minimum budget in the specified currency.
     * @param value Value to set for the budgetMinimum property.
     */
    public void setBudgetMinimum(@jakarta.annotation.Nullable final Double value) {
        this.budgetMinimum = value;
    }
    /**
     * Sets the currency property value. ISO 4217 currency code for the budget.
     * @param value Value to set for the currency property.
     */
    public void setCurrency(@jakarta.annotation.Nullable final String value) {
        this.currency = value;
    }
    /**
     * Sets the description property value. Description of the requested work or purchase.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the desiredStartDate property value. Requested start date.
     * @param value Value to set for the desiredStartDate property.
     */
    public void setDesiredStartDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.desiredStartDate = value;
    }
    /**
     * Sets the service property value. Requested service or product.
     * @param value Value to set for the service property.
     */
    public void setService(@jakarta.annotation.Nullable final String value) {
        this.service = value;
    }
    /**
     * Sets the urgency property value. Supported LeadUrgency values.
     * @param value Value to set for the urgency property.
     */
    public void setUrgency(@jakarta.annotation.Nullable final LeadInquiryUrgency value) {
        this.urgency = value;
    }
}
