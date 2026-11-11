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
     * Public display name of the article author, when provided.
     */
    private String authorName;
    /**
     * Editorial category assigned to the article, when present.
     */
    private String category;
    /**
     * Saved article body before server-side rendering.
     */
    private String content;
    /**
     * UTC timestamp of the most recent editorial content update.
     */
    private OffsetDateTime contentUpdatedAt;
    /**
     * Alternative text describing the cover image.
     */
    private String coverImageAlt;
    /**
     * The processed cover image height in pixels, when known.
     */
    private Integer coverImageHeight;
    /**
     * URL of the article&apos;s cover image, when available.
     */
    private String coverImageUrl;
    /**
     * The processed cover image width in pixels, when known.
     */
    private Integer coverImageWidth;
    /**
     * UTC timestamp when the article was created.
     */
    private OffsetDateTime createdAt;
    /**
     * Short plain-language preview of the article.
     */
    private String excerpt;
    /**
     * Unique Leadping identifier of the blog article.
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
     * Whether the article is selected for featured placement.
     */
    private Boolean isFeatured;
    /**
     * Whether the article is currently published and available to public readers.
     */
    private Boolean isPublished;
    /**
     * UTC timestamp when the article last changed from unpublished to published.
     */
    private OffsetDateTime lastPublishedAt;
    /**
     * Optional article description used in search-engine metadata.
     */
    private String metaDescription;
    /**
     * UTC timestamp when the article was last modified.
     */
    private OffsetDateTime modifiedAt;
    /**
     * UTC publication timestamp shown for the article, when set.
     */
    private OffsetDateTime publishedAt;
    /**
     * Server-rendered and sanitized HTML for displaying the article.
     */
    private String renderedHtml;
    /**
     * Optional title used in search-engine metadata.
     */
    private String seoTitle;
    /**
     * Whether to create a Facebook post after publication.
     */
    private Boolean shareOnFacebook;
    /**
     * Whether to create a Instagram post after publication.
     */
    private Boolean shareOnInstagram;
    /**
     * Whether to create a LinkedIn post after publication.
     */
    private Boolean shareOnLinkedIn;
    /**
     * Whether to create a X post after publication.
     */
    private Boolean shareOnX;
    /**
     * URL slug used to retrieve the published article.
     */
    private String slug;
    /**
     * Publication attempts and provider post identifiers for each social platform.
     */
    private java.util.List<BlogSocialPost> socialPosts;
    /**
     * Public title of the article.
     */
    private String title;
    /**
     * UTC timestamp when the article last changed from published to unpublished.
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
     * Gets the authorName property value. Public display name of the article author, when provided.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthorName() {
        return this.authorName;
    }
    /**
     * Gets the category property value. Editorial category assigned to the article, when present.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.category;
    }
    /**
     * Gets the content property value. Saved article body before server-side rendering.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.content;
    }
    /**
     * Gets the contentUpdatedAt property value. UTC timestamp of the most recent editorial content update.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getContentUpdatedAt() {
        return this.contentUpdatedAt;
    }
    /**
     * Gets the coverImageAlt property value. Alternative text describing the cover image.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCoverImageAlt() {
        return this.coverImageAlt;
    }
    /**
     * Gets the coverImageHeight property value. The processed cover image height in pixels, when known.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCoverImageHeight() {
        return this.coverImageHeight;
    }
    /**
     * Gets the coverImageUrl property value. URL of the article&apos;s cover image, when available.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCoverImageUrl() {
        return this.coverImageUrl;
    }
    /**
     * Gets the coverImageWidth property value. The processed cover image width in pixels, when known.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCoverImageWidth() {
        return this.coverImageWidth;
    }
    /**
     * Gets the createdAt property value. UTC timestamp when the article was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the excerpt property value. Short plain-language preview of the article.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(29);
        deserializerMap.put("authorName", (n) -> { this.setAuthorName(n.getStringValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("contentUpdatedAt", (n) -> { this.setContentUpdatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("coverImageAlt", (n) -> { this.setCoverImageAlt(n.getStringValue()); });
        deserializerMap.put("coverImageHeight", (n) -> { this.setCoverImageHeight(n.getIntegerValue()); });
        deserializerMap.put("coverImageUrl", (n) -> { this.setCoverImageUrl(n.getStringValue()); });
        deserializerMap.put("coverImageWidth", (n) -> { this.setCoverImageWidth(n.getIntegerValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("excerpt", (n) -> { this.setExcerpt(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("imageProcessingError", (n) -> { this.setImageProcessingError(n.getStringValue()); });
        deserializerMap.put("imagesProcessing", (n) -> { this.setImagesProcessing(n.getBooleanValue()); });
        deserializerMap.put("isFeatured", (n) -> { this.setIsFeatured(n.getBooleanValue()); });
        deserializerMap.put("isPublished", (n) -> { this.setIsPublished(n.getBooleanValue()); });
        deserializerMap.put("lastPublishedAt", (n) -> { this.setLastPublishedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("metaDescription", (n) -> { this.setMetaDescription(n.getStringValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("publishedAt", (n) -> { this.setPublishedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("renderedHtml", (n) -> { this.setRenderedHtml(n.getStringValue()); });
        deserializerMap.put("seoTitle", (n) -> { this.setSeoTitle(n.getStringValue()); });
        deserializerMap.put("shareOnFacebook", (n) -> { this.setShareOnFacebook(n.getBooleanValue()); });
        deserializerMap.put("shareOnInstagram", (n) -> { this.setShareOnInstagram(n.getBooleanValue()); });
        deserializerMap.put("shareOnLinkedIn", (n) -> { this.setShareOnLinkedIn(n.getBooleanValue()); });
        deserializerMap.put("shareOnX", (n) -> { this.setShareOnX(n.getBooleanValue()); });
        deserializerMap.put("slug", (n) -> { this.setSlug(n.getStringValue()); });
        deserializerMap.put("socialPosts", (n) -> { this.setSocialPosts(n.getCollectionOfObjectValues(BlogSocialPost::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("unpublishedAt", (n) -> { this.setUnpublishedAt(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Unique Leadping identifier of the blog article.
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
     * Gets the isFeatured property value. Whether the article is selected for featured placement.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFeatured() {
        return this.isFeatured;
    }
    /**
     * Gets the isPublished property value. Whether the article is currently published and available to public readers.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPublished() {
        return this.isPublished;
    }
    /**
     * Gets the lastPublishedAt property value. UTC timestamp when the article last changed from unpublished to published.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastPublishedAt() {
        return this.lastPublishedAt;
    }
    /**
     * Gets the metaDescription property value. Optional article description used in search-engine metadata.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMetaDescription() {
        return this.metaDescription;
    }
    /**
     * Gets the modifiedAt property value. UTC timestamp when the article was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the publishedAt property value. UTC publication timestamp shown for the article, when set.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPublishedAt() {
        return this.publishedAt;
    }
    /**
     * Gets the renderedHtml property value. Server-rendered and sanitized HTML for displaying the article.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRenderedHtml() {
        return this.renderedHtml;
    }
    /**
     * Gets the seoTitle property value. Optional title used in search-engine metadata.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSeoTitle() {
        return this.seoTitle;
    }
    /**
     * Gets the shareOnFacebook property value. Whether to create a Facebook post after publication.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShareOnFacebook() {
        return this.shareOnFacebook;
    }
    /**
     * Gets the shareOnInstagram property value. Whether to create a Instagram post after publication.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShareOnInstagram() {
        return this.shareOnInstagram;
    }
    /**
     * Gets the shareOnLinkedIn property value. Whether to create a LinkedIn post after publication.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShareOnLinkedIn() {
        return this.shareOnLinkedIn;
    }
    /**
     * Gets the shareOnX property value. Whether to create a X post after publication.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShareOnX() {
        return this.shareOnX;
    }
    /**
     * Gets the slug property value. URL slug used to retrieve the published article.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSlug() {
        return this.slug;
    }
    /**
     * Gets the socialPosts property value. Publication attempts and provider post identifiers for each social platform.
     * @return a {@link java.util.List<BlogSocialPost>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<BlogSocialPost> getSocialPosts() {
        return this.socialPosts;
    }
    /**
     * Gets the title property value. Public title of the article.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the unpublishedAt property value. UTC timestamp when the article last changed from published to unpublished.
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
        writer.writeIntegerValue("coverImageHeight", this.getCoverImageHeight());
        writer.writeStringValue("coverImageUrl", this.getCoverImageUrl());
        writer.writeIntegerValue("coverImageWidth", this.getCoverImageWidth());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("excerpt", this.getExcerpt());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("imageProcessingError", this.getImageProcessingError());
        writer.writeBooleanValue("imagesProcessing", this.getImagesProcessing());
        writer.writeBooleanValue("isFeatured", this.getIsFeatured());
        writer.writeBooleanValue("isPublished", this.getIsPublished());
        writer.writeOffsetDateTimeValue("lastPublishedAt", this.getLastPublishedAt());
        writer.writeStringValue("metaDescription", this.getMetaDescription());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeOffsetDateTimeValue("publishedAt", this.getPublishedAt());
        writer.writeStringValue("renderedHtml", this.getRenderedHtml());
        writer.writeStringValue("seoTitle", this.getSeoTitle());
        writer.writeBooleanValue("shareOnFacebook", this.getShareOnFacebook());
        writer.writeBooleanValue("shareOnInstagram", this.getShareOnInstagram());
        writer.writeBooleanValue("shareOnLinkedIn", this.getShareOnLinkedIn());
        writer.writeBooleanValue("shareOnX", this.getShareOnX());
        writer.writeStringValue("slug", this.getSlug());
        writer.writeCollectionOfObjectValues("socialPosts", this.getSocialPosts());
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
     * Sets the authorName property value. Public display name of the article author, when provided.
     * @param value Value to set for the authorName property.
     */
    public void setAuthorName(@jakarta.annotation.Nullable final String value) {
        this.authorName = value;
    }
    /**
     * Sets the category property value. Editorial category assigned to the article, when present.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.category = value;
    }
    /**
     * Sets the content property value. Saved article body before server-side rendering.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.content = value;
    }
    /**
     * Sets the contentUpdatedAt property value. UTC timestamp of the most recent editorial content update.
     * @param value Value to set for the contentUpdatedAt property.
     */
    public void setContentUpdatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.contentUpdatedAt = value;
    }
    /**
     * Sets the coverImageAlt property value. Alternative text describing the cover image.
     * @param value Value to set for the coverImageAlt property.
     */
    public void setCoverImageAlt(@jakarta.annotation.Nullable final String value) {
        this.coverImageAlt = value;
    }
    /**
     * Sets the coverImageHeight property value. The processed cover image height in pixels, when known.
     * @param value Value to set for the coverImageHeight property.
     */
    public void setCoverImageHeight(@jakarta.annotation.Nullable final Integer value) {
        this.coverImageHeight = value;
    }
    /**
     * Sets the coverImageUrl property value. URL of the article&apos;s cover image, when available.
     * @param value Value to set for the coverImageUrl property.
     */
    public void setCoverImageUrl(@jakarta.annotation.Nullable final String value) {
        this.coverImageUrl = value;
    }
    /**
     * Sets the coverImageWidth property value. The processed cover image width in pixels, when known.
     * @param value Value to set for the coverImageWidth property.
     */
    public void setCoverImageWidth(@jakarta.annotation.Nullable final Integer value) {
        this.coverImageWidth = value;
    }
    /**
     * Sets the createdAt property value. UTC timestamp when the article was created.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the excerpt property value. Short plain-language preview of the article.
     * @param value Value to set for the excerpt property.
     */
    public void setExcerpt(@jakarta.annotation.Nullable final String value) {
        this.excerpt = value;
    }
    /**
     * Sets the id property value. Unique Leadping identifier of the blog article.
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
     * Sets the isFeatured property value. Whether the article is selected for featured placement.
     * @param value Value to set for the isFeatured property.
     */
    public void setIsFeatured(@jakarta.annotation.Nullable final Boolean value) {
        this.isFeatured = value;
    }
    /**
     * Sets the isPublished property value. Whether the article is currently published and available to public readers.
     * @param value Value to set for the isPublished property.
     */
    public void setIsPublished(@jakarta.annotation.Nullable final Boolean value) {
        this.isPublished = value;
    }
    /**
     * Sets the lastPublishedAt property value. UTC timestamp when the article last changed from unpublished to published.
     * @param value Value to set for the lastPublishedAt property.
     */
    public void setLastPublishedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastPublishedAt = value;
    }
    /**
     * Sets the metaDescription property value. Optional article description used in search-engine metadata.
     * @param value Value to set for the metaDescription property.
     */
    public void setMetaDescription(@jakarta.annotation.Nullable final String value) {
        this.metaDescription = value;
    }
    /**
     * Sets the modifiedAt property value. UTC timestamp when the article was last modified.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the publishedAt property value. UTC publication timestamp shown for the article, when set.
     * @param value Value to set for the publishedAt property.
     */
    public void setPublishedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.publishedAt = value;
    }
    /**
     * Sets the renderedHtml property value. Server-rendered and sanitized HTML for displaying the article.
     * @param value Value to set for the renderedHtml property.
     */
    public void setRenderedHtml(@jakarta.annotation.Nullable final String value) {
        this.renderedHtml = value;
    }
    /**
     * Sets the seoTitle property value. Optional title used in search-engine metadata.
     * @param value Value to set for the seoTitle property.
     */
    public void setSeoTitle(@jakarta.annotation.Nullable final String value) {
        this.seoTitle = value;
    }
    /**
     * Sets the shareOnFacebook property value. Whether to create a Facebook post after publication.
     * @param value Value to set for the shareOnFacebook property.
     */
    public void setShareOnFacebook(@jakarta.annotation.Nullable final Boolean value) {
        this.shareOnFacebook = value;
    }
    /**
     * Sets the shareOnInstagram property value. Whether to create a Instagram post after publication.
     * @param value Value to set for the shareOnInstagram property.
     */
    public void setShareOnInstagram(@jakarta.annotation.Nullable final Boolean value) {
        this.shareOnInstagram = value;
    }
    /**
     * Sets the shareOnLinkedIn property value. Whether to create a LinkedIn post after publication.
     * @param value Value to set for the shareOnLinkedIn property.
     */
    public void setShareOnLinkedIn(@jakarta.annotation.Nullable final Boolean value) {
        this.shareOnLinkedIn = value;
    }
    /**
     * Sets the shareOnX property value. Whether to create a X post after publication.
     * @param value Value to set for the shareOnX property.
     */
    public void setShareOnX(@jakarta.annotation.Nullable final Boolean value) {
        this.shareOnX = value;
    }
    /**
     * Sets the slug property value. URL slug used to retrieve the published article.
     * @param value Value to set for the slug property.
     */
    public void setSlug(@jakarta.annotation.Nullable final String value) {
        this.slug = value;
    }
    /**
     * Sets the socialPosts property value. Publication attempts and provider post identifiers for each social platform.
     * @param value Value to set for the socialPosts property.
     */
    public void setSocialPosts(@jakarta.annotation.Nullable final java.util.List<BlogSocialPost> value) {
        this.socialPosts = value;
    }
    /**
     * Sets the title property value. Public title of the article.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the unpublishedAt property value. UTC timestamp when the article last changed from published to unpublished.
     * @param value Value to set for the unpublishedAt property.
     */
    public void setUnpublishedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.unpublishedAt = value;
    }
}
