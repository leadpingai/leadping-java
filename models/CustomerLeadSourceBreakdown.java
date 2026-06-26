package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomerLeadSourceBreakdown implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The leads property
     */
    private Integer leads;
    /**
     * The percent property
     */
    private Double percent;
    /**
     * The source property
     */
    private String source;
    /**
     * Instantiates a new {@link CustomerLeadSourceBreakdown} and sets the default values.
     */
    public CustomerLeadSourceBreakdown() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomerLeadSourceBreakdown}
     */
    @jakarta.annotation.Nonnull
    public static CustomerLeadSourceBreakdown createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomerLeadSourceBreakdown();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("leads", (n) -> { this.setLeads(n.getIntegerValue()); });
        deserializerMap.put("percent", (n) -> { this.setPercent(n.getDoubleValue()); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the leads property value. The leads property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLeads() {
        return this.leads;
    }
    /**
     * Gets the percent property value. The percent property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getPercent() {
        return this.percent;
    }
    /**
     * Gets the source property value. The source property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSource() {
        return this.source;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("leads", this.getLeads());
        writer.writeDoubleValue("percent", this.getPercent());
        writer.writeStringValue("source", this.getSource());
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
     * Sets the leads property value. The leads property
     * @param value Value to set for the leads property.
     */
    public void setLeads(@jakarta.annotation.Nullable final Integer value) {
        this.leads = value;
    }
    /**
     * Sets the percent property value. The percent property
     * @param value Value to set for the percent property.
     */
    public void setPercent(@jakarta.annotation.Nullable final Double value) {
        this.percent = value;
    }
    /**
     * Sets the source property value. The source property
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final String value) {
        this.source = value;
    }
}
