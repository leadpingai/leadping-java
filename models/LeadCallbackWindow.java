package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Preferred callback interval on a calendar date in the contact time zone.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadCallbackWindow implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Local calendar date for the callback.
     */
    private LocalDate date;
    /**
     * Exclusive local end time on the same date.
     */
    private LocalTime end;
    /**
     * Inclusive local start time.
     */
    private LocalTime start;
    /**
     * Instantiates a new {@link LeadCallbackWindow} and sets the default values.
     */
    public LeadCallbackWindow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadCallbackWindow}
     */
    @jakarta.annotation.Nonnull
    public static LeadCallbackWindow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadCallbackWindow();
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
     * Gets the date property value. Local calendar date for the callback.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getDate() {
        return this.date;
    }
    /**
     * Gets the end property value. Exclusive local end time on the same date.
     * @return a {@link LocalTime}
     */
    @jakarta.annotation.Nullable
    public LocalTime getEnd() {
        return this.end;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("date", (n) -> { this.setDate(n.getLocalDateValue()); });
        deserializerMap.put("end", (n) -> { this.setEnd(n.getLocalTimeValue()); });
        deserializerMap.put("start", (n) -> { this.setStart(n.getLocalTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the start property value. Inclusive local start time.
     * @return a {@link LocalTime}
     */
    @jakarta.annotation.Nullable
    public LocalTime getStart() {
        return this.start;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLocalDateValue("date", this.getDate());
        writer.writeLocalTimeValue("end", this.getEnd());
        writer.writeLocalTimeValue("start", this.getStart());
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
     * Sets the date property value. Local calendar date for the callback.
     * @param value Value to set for the date property.
     */
    public void setDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.date = value;
    }
    /**
     * Sets the end property value. Exclusive local end time on the same date.
     * @param value Value to set for the end property.
     */
    public void setEnd(@jakarta.annotation.Nullable final LocalTime value) {
        this.end = value;
    }
    /**
     * Sets the start property value. Inclusive local start time.
     * @param value Value to set for the start property.
     */
    public void setStart(@jakarta.annotation.Nullable final LocalTime value) {
        this.start = value;
    }
}
