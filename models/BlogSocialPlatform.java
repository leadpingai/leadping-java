package ai.leadping.openapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BlogSocialPlatform implements ValuedEnum {
    Facebook("facebook"),
    Instagram("instagram"),
    X("x"),
    Linkedin("linkedin");
    public final String value;
    BlogSocialPlatform(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BlogSocialPlatform forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "facebook": return Facebook;
            case "instagram": return Instagram;
            case "x": return X;
            case "linkedin": return Linkedin;
            default: return null;
        }
    }
}
