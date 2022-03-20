package it.petrovich.model.core;

import it.petrovich.model.annotations.SerializedName;
import it.petrovich.model.interfaces.Contextual;
import it.petrovich.model.interfaces.Named;
import it.petrovich.model.interfaces.Typed;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

/**
 * Refer to <a href="https://www.w3.org/ns/activitystreams#Link">Link definition</a>.
 * <br>
 * A Link is an indirect, qualified reference to a resource identified by a URL.
 * The fundamental model for links is established by [ RFC5988].
 * Many of the properties defined by the Activity Vocabulary allow values that are either instances of Object or Link.
 * When a Link is used, it establishes a qualified relation connecting the subject (the containing object) to the
 * resource identified by the href. Properties of the Link are properties of the reference as opposed to properties
 * of the resource.
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Link implements Contextual, Named, Typed {

    @SerializedName(name = "@context")
    protected Object globalContext;
    protected String type;
    protected String name;
    protected Map<String, String> nameMap;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#href">href definition</a>.
     * <br>
     * The target resource pointed to by a Link.
     * <br>
     * Possible values are: xsd:anyURI
     */
    protected String href;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#rel">rel definition</a>.
     * <br>
     * A link relation associated with a Link. The value must conform to both the [HTML5] and [RFC5988] "link relation"
     * definitions.
     * <br>
     * In the [HTML5], any string not containing the "space" U+0020, "tab" (U+0009), "LF" (U+000A), "FF" (U+000C),
     * "CR" (U+000D) or "," (U+002C) characters can be used as a valid link relation.
     * <br>
     * Possible values are: [RFC5988] or [HTML5] Link Relation
     */
    protected Object rel;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#mediaType">mediaType definition</a>.
     * <br>
     * When used on a Link, identifies the MIME media type of the referenced resource.
     * <br>
     * When used on an Object, identifies the MIME media type of the value of the content property.
     * <br>
     * If not specified, the content property is assumed to contain text/html content.
     * <br>
     * Possible values are: MIME Media Type
     */
    protected String mediaType;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#hreflang">hreflang definition</a>.
     * <br>
     * Hints as to the language used by the target resource. Value must be a [BCP47] Language-Tag.
     * <br>
     * Possible values are: [BCP47] Language Tag
     */
    protected String hreflang;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#height">height definition</a>.
     * <br>
     * On a Link, specifies a hint as to the rendering height in device-independent pixels of the linked resource.
     * <br>
     * Possible values are: xsd:nonNegativeInteger
     */
    protected Integer height;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#width">width definition</a>.
     * <br>
     * On a Link, specifies a hint as to the rendering width in device-independent pixels of the linked resource.
     * <br>
     * Possible values are: xsd:nonNegativeInteger
     */
    protected Integer width;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#preview">preview definition</a>.
     * <br>
     * Identifies an entity that provides a preview of this object.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object preview;
}
