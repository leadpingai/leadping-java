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
 * API DTO containing stripe payment method data used by Leadping API contracts.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StripePaymentMethodResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The brand value for this Stripe payment method.
     */
    private String brand;
    /**
     * The date and time for the created at value on this Stripe payment method.
     */
    private OffsetDateTime createdAt;
    /**
     * The exp month value for this Stripe payment method.
     */
    private Integer expMonth;
    /**
     * The exp year value for this Stripe payment method.
     */
    private Integer expYear;
    /**
     * The unique ID for this Stripe payment method.
     */
    private String id;
    /**
     * Whether this Stripe payment method is default.
     */
    private Boolean isDefault;
    /**
     * The date and time for the last4 value on this Stripe payment method.
     */
    private String last4;
    /**
     * Instantiates a new {@link StripePaymentMethodResponse} and sets the default values.
     */
    public StripePaymentMethodResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StripePaymentMethodResponse}
     */
    @jakarta.annotation.Nonnull
    public static StripePaymentMethodResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StripePaymentMethodResponse();
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
     * Gets the brand property value. The brand value for this Stripe payment method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrand() {
        return this.brand;
    }
    /**
     * Gets the createdAt property value. The date and time for the created at value on this Stripe payment method.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the expMonth property value. The exp month value for this Stripe payment method.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getExpMonth() {
        return this.expMonth;
    }
    /**
     * Gets the expYear property value. The exp year value for this Stripe payment method.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getExpYear() {
        return this.expYear;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("brand", (n) -> { this.setBrand(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expMonth", (n) -> { this.setExpMonth(n.getIntegerValue()); });
        deserializerMap.put("expYear", (n) -> { this.setExpYear(n.getIntegerValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isDefault", (n) -> { this.setIsDefault(n.getBooleanValue()); });
        deserializerMap.put("last4", (n) -> { this.setLast4(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The unique ID for this Stripe payment method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isDefault property value. Whether this Stripe payment method is default.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    /**
     * Gets the last4 property value. The date and time for the last4 value on this Stripe payment method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLast4() {
        return this.last4;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("brand", this.getBrand());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeIntegerValue("expMonth", this.getExpMonth());
        writer.writeIntegerValue("expYear", this.getExpYear());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isDefault", this.getIsDefault());
        writer.writeStringValue("last4", this.getLast4());
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
     * Sets the brand property value. The brand value for this Stripe payment method.
     * @param value Value to set for the brand property.
     */
    public void setBrand(@jakarta.annotation.Nullable final String value) {
        this.brand = value;
    }
    /**
     * Sets the createdAt property value. The date and time for the created at value on this Stripe payment method.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the expMonth property value. The exp month value for this Stripe payment method.
     * @param value Value to set for the expMonth property.
     */
    public void setExpMonth(@jakarta.annotation.Nullable final Integer value) {
        this.expMonth = value;
    }
    /**
     * Sets the expYear property value. The exp year value for this Stripe payment method.
     * @param value Value to set for the expYear property.
     */
    public void setExpYear(@jakarta.annotation.Nullable final Integer value) {
        this.expYear = value;
    }
    /**
     * Sets the id property value. The unique ID for this Stripe payment method.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isDefault property value. Whether this Stripe payment method is default.
     * @param value Value to set for the isDefault property.
     */
    public void setIsDefault(@jakarta.annotation.Nullable final Boolean value) {
        this.isDefault = value;
    }
    /**
     * Sets the last4 property value. The date and time for the last4 value on this Stripe payment method.
     * @param value Value to set for the last4 property.
     */
    public void setLast4(@jakarta.annotation.Nullable final String value) {
        this.last4 = value;
    }
}
