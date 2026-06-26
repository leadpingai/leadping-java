package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Request schema for the Leadping API lead tag update request, including the fields clients can send.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LeadTagsRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates whether Leadping should create missing records while processing the request.
     */
    private Boolean createMissing;
    /**
     * Tag IDs assigned to or filtered against this lead.
     */
    private java.util.List<String> tagIds;
    /**
     * Tag names assigned to this lead when matching existing tags by name.
     */
    private java.util.List<String> tagNames;
    /**
     * Instantiates a new {@link LeadTagsRequest} and sets the default values.
     */
    public LeadTagsRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LeadTagsRequest}
     */
    @jakarta.annotation.Nonnull
    public static LeadTagsRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LeadTagsRequest();
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
     * Gets the createMissing property value. Indicates whether Leadping should create missing records while processing the request.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCreateMissing() {
        return this.createMissing;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("createMissing", (n) -> { this.setCreateMissing(n.getBooleanValue()); });
        deserializerMap.put("tagIds", (n) -> { this.setTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("tagNames", (n) -> { this.setTagNames(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the tagIds property value. Tag IDs assigned to or filtered against this lead.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }
    /**
     * Gets the tagNames property value. Tag names assigned to this lead when matching existing tags by name.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTagNames() {
        return this.tagNames;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("createMissing", this.getCreateMissing());
        writer.writeCollectionOfPrimitiveValues("tagIds", this.getTagIds());
        writer.writeCollectionOfPrimitiveValues("tagNames", this.getTagNames());
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
     * Sets the createMissing property value. Indicates whether Leadping should create missing records while processing the request.
     * @param value Value to set for the createMissing property.
     */
    public void setCreateMissing(@jakarta.annotation.Nullable final Boolean value) {
        this.createMissing = value;
    }
    /**
     * Sets the tagIds property value. Tag IDs assigned to or filtered against this lead.
     * @param value Value to set for the tagIds property.
     */
    public void setTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tagIds = value;
    }
    /**
     * Sets the tagNames property value. Tag names assigned to this lead when matching existing tags by name.
     * @param value Value to set for the tagNames property.
     */
    public void setTagNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tagNames = value;
    }
}
