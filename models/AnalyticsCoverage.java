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
 * States whether missing historical evidence can make reported counts incomplete.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AnalyticsCoverage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The completeFrom property
     */
    private OffsetDateTime completeFrom;
    /**
     * The detail property
     */
    private String detail;
    /**
     * The isPartial property
     */
    private Boolean isPartial;
    /**
     * Instantiates a new {@link AnalyticsCoverage} and sets the default values.
     */
    public AnalyticsCoverage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AnalyticsCoverage}
     */
    @jakarta.annotation.Nonnull
    public static AnalyticsCoverage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AnalyticsCoverage();
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
     * Gets the completeFrom property value. The completeFrom property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompleteFrom() {
        return this.completeFrom;
    }
    /**
     * Gets the detail property value. The detail property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetail() {
        return this.detail;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("completeFrom", (n) -> { this.setCompleteFrom(n.getOffsetDateTimeValue()); });
        deserializerMap.put("detail", (n) -> { this.setDetail(n.getStringValue()); });
        deserializerMap.put("isPartial", (n) -> { this.setIsPartial(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isPartial property value. The isPartial property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPartial() {
        return this.isPartial;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("completeFrom", this.getCompleteFrom());
        writer.writeStringValue("detail", this.getDetail());
        writer.writeBooleanValue("isPartial", this.getIsPartial());
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
     * Sets the completeFrom property value. The completeFrom property
     * @param value Value to set for the completeFrom property.
     */
    public void setCompleteFrom(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.completeFrom = value;
    }
    /**
     * Sets the detail property value. The detail property
     * @param value Value to set for the detail property.
     */
    public void setDetail(@jakarta.annotation.Nullable final String value) {
        this.detail = value;
    }
    /**
     * Sets the isPartial property value. The isPartial property
     * @param value Value to set for the isPartial property.
     */
    public void setIsPartial(@jakarta.annotation.Nullable final Boolean value) {
        this.isPartial = value;
    }
}
