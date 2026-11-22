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
public class CallRetryRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The prior retry time observed by the rep.
     */
    private OffsetDateTime expectedRetryAt;
    /**
     * When to offer this call again. Clear to remove the retry.
     */
    private OffsetDateTime retryAt;
    /**
     * Instantiates a new {@link CallRetryRequest} and sets the default values.
     */
    public CallRetryRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CallRetryRequest}
     */
    @jakarta.annotation.Nonnull
    public static CallRetryRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallRetryRequest();
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
     * Gets the expectedRetryAt property value. The prior retry time observed by the rep.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpectedRetryAt() {
        return this.expectedRetryAt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("expectedRetryAt", (n) -> { this.setExpectedRetryAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("retryAt", (n) -> { this.setRetryAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the retryAt property value. When to offer this call again. Clear to remove the retry.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRetryAt() {
        return this.retryAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("expectedRetryAt", this.getExpectedRetryAt());
        writer.writeOffsetDateTimeValue("retryAt", this.getRetryAt());
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
     * Sets the expectedRetryAt property value. The prior retry time observed by the rep.
     * @param value Value to set for the expectedRetryAt property.
     */
    public void setExpectedRetryAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.expectedRetryAt = value;
    }
    /**
     * Sets the retryAt property value. When to offer this call again. Clear to remove the retry.
     * @param value Value to set for the retryAt property.
     */
    public void setRetryAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.retryAt = value;
    }
}
