package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A page of inbox conversations with optional action counts and refresh timing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConversationPage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The continuationToken property
     */
    private String continuationToken;
    /**
     * The items property
     */
    private java.util.List<ConversationResponse> items;
    /**
     * Visible unanswered conversations, capped at ReplyCountDisplayLimit + 1. Included on request.
     */
    private Integer needsReplyCount;
    /**
     * The pageSize property
     */
    private Integer pageSize;
    /**
     * Time remaining until a scheduled action or contact window could change this page, measured on the server.
     */
    private String refreshAfter;
    /**
     * The totalCount property
     */
    private Integer totalCount;
    /**
     * Instantiates a new {@link ConversationPage} and sets the default values.
     */
    public ConversationPage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConversationPage}
     */
    @jakarta.annotation.Nonnull
    public static ConversationPage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConversationPage();
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
     * Gets the continuationToken property value. The continuationToken property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContinuationToken() {
        return this.continuationToken;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("continuationToken", (n) -> { this.setContinuationToken(n.getStringValue()); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(ConversationResponse::createFromDiscriminatorValue)); });
        deserializerMap.put("needsReplyCount", (n) -> { this.setNeedsReplyCount(n.getIntegerValue()); });
        deserializerMap.put("pageSize", (n) -> { this.setPageSize(n.getIntegerValue()); });
        deserializerMap.put("refreshAfter", (n) -> { this.setRefreshAfter(n.getStringValue()); });
        deserializerMap.put("totalCount", (n) -> { this.setTotalCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the items property value. The items property
     * @return a {@link java.util.List<ConversationResponse>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConversationResponse> getItems() {
        return this.items;
    }
    /**
     * Gets the needsReplyCount property value. Visible unanswered conversations, capped at ReplyCountDisplayLimit + 1. Included on request.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNeedsReplyCount() {
        return this.needsReplyCount;
    }
    /**
     * Gets the pageSize property value. The pageSize property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPageSize() {
        return this.pageSize;
    }
    /**
     * Gets the refreshAfter property value. Time remaining until a scheduled action or contact window could change this page, measured on the server.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefreshAfter() {
        return this.refreshAfter;
    }
    /**
     * Gets the totalCount property value. The totalCount property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalCount() {
        return this.totalCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("continuationToken", this.getContinuationToken());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeIntegerValue("needsReplyCount", this.getNeedsReplyCount());
        writer.writeIntegerValue("pageSize", this.getPageSize());
        writer.writeStringValue("refreshAfter", this.getRefreshAfter());
        writer.writeIntegerValue("totalCount", this.getTotalCount());
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
     * Sets the continuationToken property value. The continuationToken property
     * @param value Value to set for the continuationToken property.
     */
    public void setContinuationToken(@jakarta.annotation.Nullable final String value) {
        this.continuationToken = value;
    }
    /**
     * Sets the items property value. The items property
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<ConversationResponse> value) {
        this.items = value;
    }
    /**
     * Sets the needsReplyCount property value. Visible unanswered conversations, capped at ReplyCountDisplayLimit + 1. Included on request.
     * @param value Value to set for the needsReplyCount property.
     */
    public void setNeedsReplyCount(@jakarta.annotation.Nullable final Integer value) {
        this.needsReplyCount = value;
    }
    /**
     * Sets the pageSize property value. The pageSize property
     * @param value Value to set for the pageSize property.
     */
    public void setPageSize(@jakarta.annotation.Nullable final Integer value) {
        this.pageSize = value;
    }
    /**
     * Sets the refreshAfter property value. Time remaining until a scheduled action or contact window could change this page, measured on the server.
     * @param value Value to set for the refreshAfter property.
     */
    public void setRefreshAfter(@jakarta.annotation.Nullable final String value) {
        this.refreshAfter = value;
    }
    /**
     * Sets the totalCount property value. The totalCount property
     * @param value Value to set for the totalCount property.
     */
    public void setTotalCount(@jakarta.annotation.Nullable final Integer value) {
        this.totalCount = value;
    }
}
