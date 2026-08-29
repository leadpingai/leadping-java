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
     * Gets or sets the author name.
     */
    private String authorName;
    /**
     * Gets or sets the category.
     */
    private String category;
    /**
     * Gets or sets the content.
     */
    private String content;
    /**
     * Gets or sets the cover image URL.
     */
    private String coverImageUrl;
    /**
     * Gets or sets the created at.
     */
    private OffsetDateTime createdAt;
    /**
     * Gets or sets the excerpt.
     */
    private String excerpt;
    /**
     * Gets or sets the ID.
     */
    private String id;
    /**
     * Gets or sets the is featured.
     */
    private Boolean isFeatured;
    /**
     * Gets or sets the is published.
     */
    private Boolean isPublished;
    /**
     * Gets or sets the modified at.
     */
    private OffsetDateTime modifiedAt;
    /**
     * Gets or sets the published at.
     */
    private OffsetDateTime publishedAt;
    /**
     * Gets or sets the slug.
     */
    private String slug;
    /**
     * Gets or sets the title.
     */
    private String title;
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
     * Gets the authorName property value. Gets or sets the author name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAuthorName() {
        return this.authorName;
    }
    /**
     * Gets the category property value. Gets or sets the category.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.category;
    }
    /**
     * Gets the content property value. Gets or sets the content.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.content;
    }
    /**
     * Gets the coverImageUrl property value. Gets or sets the cover image URL.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCoverImageUrl() {
        return this.coverImageUrl;
    }
    /**
     * Gets the createdAt property value. Gets or sets the created at.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the excerpt property value. Gets or sets the excerpt.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("authorName", (n) -> { this.setAuthorName(n.getStringValue()); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("coverImageUrl", (n) -> { this.setCoverImageUrl(n.getStringValue()); });
        deserializerMap.put("createdAt", (n) -> { this.setCreatedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("excerpt", (n) -> { this.setExcerpt(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("isFeatured", (n) -> { this.setIsFeatured(n.getBooleanValue()); });
        deserializerMap.put("isPublished", (n) -> { this.setIsPublished(n.getBooleanValue()); });
        deserializerMap.put("modifiedAt", (n) -> { this.setModifiedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("publishedAt", (n) -> { this.setPublishedAt(n.getOffsetDateTimeValue()); });
        deserializerMap.put("slug", (n) -> { this.setSlug(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. Gets or sets the ID.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the isFeatured property value. Gets or sets the is featured.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsFeatured() {
        return this.isFeatured;
    }
    /**
     * Gets the isPublished property value. Gets or sets the is published.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPublished() {
        return this.isPublished;
    }
    /**
     * Gets the modifiedAt property value. Gets or sets the modified at.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * Gets the publishedAt property value. Gets or sets the published at.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPublishedAt() {
        return this.publishedAt;
    }
    /**
     * Gets the slug property value. Gets or sets the slug.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSlug() {
        return this.slug;
    }
    /**
     * Gets the title property value. Gets or sets the title.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
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
        writer.writeStringValue("coverImageUrl", this.getCoverImageUrl());
        writer.writeOffsetDateTimeValue("createdAt", this.getCreatedAt());
        writer.writeStringValue("excerpt", this.getExcerpt());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isFeatured", this.getIsFeatured());
        writer.writeBooleanValue("isPublished", this.getIsPublished());
        writer.writeOffsetDateTimeValue("modifiedAt", this.getModifiedAt());
        writer.writeOffsetDateTimeValue("publishedAt", this.getPublishedAt());
        writer.writeStringValue("slug", this.getSlug());
        writer.writeStringValue("title", this.getTitle());
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
     * Sets the authorName property value. Gets or sets the author name.
     * @param value Value to set for the authorName property.
     */
    public void setAuthorName(@jakarta.annotation.Nullable final String value) {
        this.authorName = value;
    }
    /**
     * Sets the category property value. Gets or sets the category.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.category = value;
    }
    /**
     * Sets the content property value. Gets or sets the content.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.content = value;
    }
    /**
     * Sets the coverImageUrl property value. Gets or sets the cover image URL.
     * @param value Value to set for the coverImageUrl property.
     */
    public void setCoverImageUrl(@jakarta.annotation.Nullable final String value) {
        this.coverImageUrl = value;
    }
    /**
     * Sets the createdAt property value. Gets or sets the created at.
     * @param value Value to set for the createdAt property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.createdAt = value;
    }
    /**
     * Sets the excerpt property value. Gets or sets the excerpt.
     * @param value Value to set for the excerpt property.
     */
    public void setExcerpt(@jakarta.annotation.Nullable final String value) {
        this.excerpt = value;
    }
    /**
     * Sets the id property value. Gets or sets the ID.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the isFeatured property value. Gets or sets the is featured.
     * @param value Value to set for the isFeatured property.
     */
    public void setIsFeatured(@jakarta.annotation.Nullable final Boolean value) {
        this.isFeatured = value;
    }
    /**
     * Sets the isPublished property value. Gets or sets the is published.
     * @param value Value to set for the isPublished property.
     */
    public void setIsPublished(@jakarta.annotation.Nullable final Boolean value) {
        this.isPublished = value;
    }
    /**
     * Sets the modifiedAt property value. Gets or sets the modified at.
     * @param value Value to set for the modifiedAt property.
     */
    public void setModifiedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.modifiedAt = value;
    }
    /**
     * Sets the publishedAt property value. Gets or sets the published at.
     * @param value Value to set for the publishedAt property.
     */
    public void setPublishedAt(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.publishedAt = value;
    }
    /**
     * Sets the slug property value. Gets or sets the slug.
     * @param value Value to set for the slug property.
     */
    public void setSlug(@jakarta.annotation.Nullable final String value) {
        this.slug = value;
    }
    /**
     * Sets the title property value. Gets or sets the title.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}
