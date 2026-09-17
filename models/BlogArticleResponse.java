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
 * Represents a blog article response.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlogArticleResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The authorName property
     */
    private String authorName;
    /**
     * The category property
     */
    private String category;
    /**
     * The content property
     */
    private String content;
    /**
     * The contentUpdatedAt property
     */
    private OffsetDateTime contentUpdatedAt;
    /**
     * The coverImageAlt property
     */
    private String coverImageAlt;
    /**
     * The coverImageUrl property
     */
    private String coverImageUrl;
    /**
     * The createdAt property
     */
    private OffsetDateTime createdAt;
    /**
     * The excerpt property
     */
    private String excerpt;
    /**
     * The id property
     */
    private String id;
    /**
     * The latest background image processing failure, when present.
     */
    private String imageProcessingError;
    /**
     * Whether saved image references are awaiting Engine processing.
     */
    private Boolean imagesProcessing;
    /**
     * The isFeatured property
     */
    private Boolean isFeatured;
    /**
     * The isPublished property
     */
    private Boolean isPublished;
    /**
     * The metaDescription property
     */
    private String metaDescription;
    /**
     * The modifiedAt property
     */
    private OffsetDateTime modifiedAt;
    /**
     * The publishedAt property
     */
    private OffsetDateTime publishedAt;
    /**
     * The seoTitle property
     */
    private String seoTitle;
    /**
     * The slug property
     */
    private String slug;
    /**
     * The title property
     */
    private String title;
    /**
     * The unpublishedAt property
     */
    private OffsetDateTime unpublishedAt;
    /**
     * Instantiates a new {@link BlogArticleResponse} and sets the default values.
     */
    public BlogArticleResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BlogArticleResponse}
     */
    @jakarta.annotation.Nonnull
    public static BlogArticleResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlogArticleResponse();
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
     * Gets the authorName property value. The authorName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthorName() {
        return this.authorName;
    }
    /**
     * Gets the category property value. The category property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.category;
    }
    /**
     * Gets the content property value. The content property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.content;
    }
    /**
     * Gets the contentUpdatedAt property value. The contentUpdatedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getContentUpdatedAt() {
        return this.contentUpdatedAt;
    }
    /**
     * Gets the coverImageAlt property value. The coverImageAlt property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCoverImageAlt() {
        return this.coverImageAlt;
    }
    /**
     * Gets the coverImageUrl property value. The coverImageUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCoverImageUrl() {
        return this.coverImageUrl;
    }
    /**
     * Gets the createdAt property value. The createdAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the excerpt property value. The excerpt property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExcerpt() {
        return this.excerpt;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("authorName", (n) -> { this.setAuthorName(n.getStringValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("contentUpdatedAt", (n) -> { this.setContentUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("coverImageAlt", (n) -> { this.setCoverImageAlt(n.getStringValue()); });
        deserializerMap.put("coverImageUrl", (n) -> { this.setCoverImageUrl(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("excerpt", (n) -> { this.setExcerpt(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("imageProcessingError", (n) -> { this.setImageProcessingError(n.getStringValue()); });
        deserializerMap.put("imagesProcessing", (n) -> { this.setImagesProcessing(n.getBooleanValue()); });
        deserializerMap.put("isFeatured", (n) -> { this.setIsFeatured(n.getBooleanValue()); });
        deserializerMap.put("isPublished", (n) -> { this.setIsPublished(n.getBooleanValue()); });
        deserializerMap.put("metaDescription", (n) -> { this.setMetaDescription(n.getStringValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("publishedAt", (n) -> { this.setPublishedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("seoTitle", (n) -> { this.setSeoTitle(n.getStringValue()); });
        deserializerMap.put("slug", (n) -> { this.setSlug(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("unpublishedAt", (n) -> { this.setUnpublishedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the imageProcessingError property value. The latest background image processing failure, when present.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageProcessingError() {
        return this.imageProcessingError;
    }
    /**
     * Gets the imagesProcessing property value. Whether saved image references are awaiting Engine processing.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getImagesProcessing() {
        return this.imagesProcessing;
    }
    /**
     * Gets the isFeatured property value. The isFeatured property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFeatured() {
        return this.isFeatured;
    }
    /**
     * Gets the isPublished property value. The isPublished property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPublished() {
        return this.isPublished;
    }
    /**
     * Gets the metaDescription property value. The metaDescription property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMetaDescription() {
        return this.metaDescription;
    }
    /**
     * Gets the modifiedAt property value. The modifiedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the publishedAt property value. The publishedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPublishedAt() {
        return this.publishedAt;
    }
    /**
     * Gets the seoTitle property value. The seoTitle property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSeoTitle() {
        return this.seoTitle;
    }
    /**
     * Gets the slug property value. The slug property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSlug() {
        return this.slug;
    }
    /**
     * Gets the title property value. The title property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the unpublishedAt property value. The unpublishedAt property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getUnpublishedAt() {
        return this.unpublishedAt;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("authorName", this.getAuthorName());
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("content", this.getContent());
        writer.writeOffsetDateTimeValue("contentUpdatedAt", this.getContentUpdatedAt());
        writer.writeStringValue("coverImageAlt", this.getCoverImageAlt());
        writer.writeStringValue("coverImageUrl", this.getCoverImageUrl());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("excerpt", this.getExcerpt());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("imageProcessingError", this.getImageProcessingError());
        writer.writeBooleanValue("imagesProcessing", this.getImagesProcessing());
        writer.writeBooleanValue("isFeatured", this.getIsFeatured());
        writer.writeBooleanValue("isPublished", this.getIsPublished());
        writer.writeStringValue("metaDescription", this.getMetaDescription());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeOffsetDateTimeValue("publishedAt", this.getPublishedAt());
        writer.writeStringValue("seoTitle", this.getSeoTitle());
        writer.writeStringValue("slug", this.getSlug());
        writer.writeStringValue("title", this.getTitle());
        writer.writeOffsetDateTimeValue("unpublishedAt", this.getUnpublishedAt());
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
     * Sets the authorName property value. The authorName property
     * @param value Value to set for the authorName property.
     */
    public void setAuthorName(@jakarta.annotation.Nullable final String value) {
        this.authorName = value;
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.category = value;
    }
    /**
     * Sets the content property value. The content property
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.content = value;
    }
    /**
     * Sets the contentUpdatedAt property value. The contentUpdatedAt property
     * @param value Value to set for the contentUpdatedAt property.
     */
    public void setContentUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.contentUpdatedAt = value;
    }
    /**
     * Sets the coverImageAlt property value. The coverImageAlt property
     * @param value Value to set for the coverImageAlt property.
     */
    public void setCoverImageAlt(@jakarta.annotation.Nullable final String value) {
        this.coverImageAlt = value;
    }
    /**
     * Sets the coverImageUrl property value. The coverImageUrl property
     * @param value Value to set for the coverImageUrl property.
     */
    public void setCoverImageUrl(@jakarta.annotation.Nullable final String value) {
        this.coverImageUrl = value;
    }
    /**
     * Sets the createdAt property value. The createdAt property
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the excerpt property value. The excerpt property
     * @param value Value to set for the excerpt property.
     */
    public void setExcerpt(@jakarta.annotation.Nullable final String value) {
        this.excerpt = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the imageProcessingError property value. The latest background image processing failure, when present.
     * @param value Value to set for the imageProcessingError property.
     */
    public void setImageProcessingError(@jakarta.annotation.Nullable final String value) {
        this.imageProcessingError = value;
    }
    /**
     * Sets the imagesProcessing property value. Whether saved image references are awaiting Engine processing.
     * @param value Value to set for the imagesProcessing property.
     */
    public void setImagesProcessing(@jakarta.annotation.Nullable final Boolean value) {
        this.imagesProcessing = value;
    }
    /**
     * Sets the isFeatured property value. The isFeatured property
     * @param value Value to set for the isFeatured property.
     */
    public void setIsFeatured(@jakarta.annotation.Nullable final Boolean value) {
        this.isFeatured = value;
    }
    /**
     * Sets the isPublished property value. The isPublished property
     * @param value Value to set for the isPublished property.
     */
    public void setIsPublished(@jakarta.annotation.Nullable final Boolean value) {
        this.isPublished = value;
    }
    /**
     * Sets the metaDescription property value. The metaDescription property
     * @param value Value to set for the metaDescription property.
     */
    public void setMetaDescription(@jakarta.annotation.Nullable final String value) {
        this.metaDescription = value;
    }
    /**
     * Sets the modifiedAt property value. The modifiedAt property
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the publishedAt property value. The publishedAt property
     * @param value Value to set for the publishedAt property.
     */
    public void setPublishedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.publishedAt = value;
    }
    /**
     * Sets the seoTitle property value. The seoTitle property
     * @param value Value to set for the seoTitle property.
     */
    public void setSeoTitle(@jakarta.annotation.Nullable final String value) {
        this.seoTitle = value;
    }
    /**
     * Sets the slug property value. The slug property
     * @param value Value to set for the slug property.
     */
    public void setSlug(@jakarta.annotation.Nullable final String value) {
        this.slug = value;
    }
    /**
     * Sets the title property value. The title property
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the unpublishedAt property value. The unpublishedAt property
     * @param value Value to set for the unpublishedAt property.
     */
    public void setUnpublishedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.unpublishedAt = value;
    }
}
