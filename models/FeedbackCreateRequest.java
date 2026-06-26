package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Request schema for the Leadping API feedback creation request, including the fields clients can send.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FeedbackCreateRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether the submitter permits Leadping support to contact them about the feedback.
     */
    private Boolean allowContact;
    /**
     * Product area or app section connected to this feedback creation request.
     */
    private String area;
    /**
     * Client application version that submitted this feedback creation request.
     */
    private String clientVersion;
    /**
     * Message text supplied by the user or returned by the Leadping API for this feedback creation request.
     */
    private String message;
    /**
     * Application route where this feedback creation request originated or should direct the user.
     */
    private String route;
    /**
     * Defines the type of product feedback submitted from inside Leadping.
     */
    private FeedbackCreateRequestType type;
    /**
     * Instantiates a new {@link FeedbackCreateRequest} and sets the default values.
     */
    public FeedbackCreateRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FeedbackCreateRequest}
     */
    @jakarta.annotation.Nonnull
    public static FeedbackCreateRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeedbackCreateRequest();
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
     * Gets the allowContact property value. Indicates whether the submitter permits Leadping support to contact them about the feedback.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowContact() {
        return this.allowContact;
    }
    /**
     * Gets the area property value. Product area or app section connected to this feedback creation request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getArea() {
        return this.area;
    }
    /**
     * Gets the clientVersion property value. Client application version that submitted this feedback creation request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientVersion() {
        return this.clientVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("allowContact", (n) -> { this.setAllowContact(n.getBooleanValue()); });
        deserializerMap.put("area", (n) -> { this.setArea(n.getStringValue()); });
        deserializerMap.put("clientVersion", (n) -> { this.setClientVersion(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("route", (n) -> { this.setRoute(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(FeedbackCreateRequestType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the message property value. Message text supplied by the user or returned by the Leadping API for this feedback creation request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the route property value. Application route where this feedback creation request originated or should direct the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRoute() {
        return this.route;
    }
    /**
     * Gets the type property value. Defines the type of product feedback submitted from inside Leadping.
     * @return a {@link FeedbackCreateRequestType}
     */
    @jakarta.annotation.Nullable
    public FeedbackCreateRequestType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowContact", this.getAllowContact());
        writer.writeStringValue("area", this.getArea());
        writer.writeStringValue("clientVersion", this.getClientVersion());
        writer.writeStringValue("message", this.getMessage());
        writer.writeStringValue("route", this.getRoute());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the allowContact property value. Indicates whether the submitter permits Leadping support to contact them about the feedback.
     * @param value Value to set for the allowContact property.
     */
    public void setAllowContact(@jakarta.annotation.Nullable final Boolean value) {
        this.allowContact = value;
    }
    /**
     * Sets the area property value. Product area or app section connected to this feedback creation request.
     * @param value Value to set for the area property.
     */
    public void setArea(@jakarta.annotation.Nullable final String value) {
        this.area = value;
    }
    /**
     * Sets the clientVersion property value. Client application version that submitted this feedback creation request.
     * @param value Value to set for the clientVersion property.
     */
    public void setClientVersion(@jakarta.annotation.Nullable final String value) {
        this.clientVersion = value;
    }
    /**
     * Sets the message property value. Message text supplied by the user or returned by the Leadping API for this feedback creation request.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the route property value. Application route where this feedback creation request originated or should direct the user.
     * @param value Value to set for the route property.
     */
    public void setRoute(@jakarta.annotation.Nullable final String value) {
        this.route = value;
    }
    /**
     * Sets the type property value. Defines the type of product feedback submitted from inside Leadping.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final FeedbackCreateRequestType value) {
        this.type = value;
    }
}
