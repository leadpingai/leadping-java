package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.serialization.UntypedNode;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Customer-safe Leadping invoice summary for billing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StripeInvoiceResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Total invoice amount in the invoice currency.
     */
    private UntypedNode amount;
    /**
     * Date and time when the invoice was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Indicates whether a downloadable PDF is available for the invoice.
     */
    private Boolean hasPdf;
    /**
     * Provider identifier for the invoice.
     */
    private String id;
    /**
     * Human-readable invoice number, when assigned.
     */
    private String number;
    /**
     * Current provider-reported invoice status.
     */
    private String status;
    /**
     * Instantiates a new {@link StripeInvoiceResponse} and sets the default values.
     */
    public StripeInvoiceResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link StripeInvoiceResponse}
     */
    @jakarta.annotation.Nonnull
    public static StripeInvoiceResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new StripeInvoiceResponse();
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
     * Gets the amount property value. Total invoice amount in the invoice currency.
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getAmount() {
        return this.amount;
    }
    /**
     * Gets the createdAt property value. Date and time when the invoice was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("hasPdf", (n) -> { this.setHasPdf(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("number", (n) -> { this.setNumber(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hasPdf property value. Indicates whether a downloadable PDF is available for the invoice.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHasPdf() {
        return this.hasPdf;
    }
    /**
     * Gets the id property value. Provider identifier for the invoice.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the number property value. Human-readable invoice number, when assigned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNumber() {
        return this.number;
    }
    /**
     * Gets the status property value. Current provider-reported invoice status.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeBooleanValue("hasPdf", this.getHasPdf());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("number", this.getNumber());
        writer.writeStringValue("status", this.getStatus());
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
     * Sets the amount property value. Total invoice amount in the invoice currency.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final UntypedNode value) {
        this.amount = value;
    }
    /**
     * Sets the createdAt property value. Date and time when the invoice was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the hasPdf property value. Indicates whether a downloadable PDF is available for the invoice.
     * @param value Value to set for the hasPdf property.
     */
    public void setHasPdf(@jakarta.annotation.Nullable final Boolean value) {
        this.hasPdf = value;
    }
    /**
     * Sets the id property value. Provider identifier for the invoice.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the number property value. Human-readable invoice number, when assigned.
     * @param value Value to set for the number property.
     */
    public void setNumber(@jakarta.annotation.Nullable final String value) {
        this.number = value;
    }
    /**
     * Sets the status property value. Current provider-reported invoice status.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.status = value;
    }
}
