package it.petrovich.model.core;

import it.petrovich.model.annotations.SerializedName;
import it.petrovich.model.interfaces.Contextual;
import it.petrovich.model.interfaces.Identifiable;
import it.petrovich.model.interfaces.Named;
import it.petrovich.model.interfaces.Typed;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Refer to <a href="https://www.w3.org/ns/activitystreams#Object">Object definition</a>.
 * <br>
 * Describes an object of any kind. The Object type serves as the base type for most of the other
 * kinds of objects defined in the Activity Vocabulary, including other Core types such as Activity,
 * IntransitiveActivity, Collection and OrderedCollection.
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class BaseObject implements Contextual, Typed, Identifiable, Named {

    /**
     * Refer to <a href="https://www.w3.org/TR/activitystreams-core/#jsonld">JSON-LD definition</a>.
     * <br>
     * The serialized JSON form of an Activity Streams 2.0 document must be consistent with what would be produced
     * by the standard JSON-LD 1.0 Processing Algorithms and API [JSON-LD-API] Compaction Algorithm using, at least,
     * the normative JSON-LD @context definition provided here.
     * <br>
     * Implementations may augment the provided @context with additional @context definitions but must not
     * override or change the normative context.
     * <br>
     * Implementations may also use additional properties and values not defined in the JSON-LD @context with the
     * understanding that any such properties will likely be unsupported and ignored by consuming implementations
     * that use the standard JSON-LD algorithms.
     * <br>
     * See the Extensibility section for more information on handling extensions within Activity Streams 2.0 documents.
     * <p>
     * JSON-LD uses the special @context property to define the processing context.
     * <p>
     * The value of the @context property is defined by the [JSON-LD] specification.
     * <p>
     * Implementations producing Activity Streams 2.0 documents should include a @context property with a value that
     * includes a reference to the normative Activity Streams 2.0 JSON-LD @context definition
     * using the URL " https://www.w3.org/ns/activitystreams".
     * <p>
     * Implementations may use the alternative URL " http://www.w3.org/ns/activitystreams" instead.
     * <p>
     * This can be done using a string, object, or array.
     */
    @SerializedName(name = "@context")
    private Object globalContext;
    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#attachment">attachment definition</a>.
     * <br>
     * Identifies a resource attached or related to an object that potentially requires special handling.
     * <br>
     * The intent is to provide a model that is at least semantically similar to attachments in email.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object attachment;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#attributedTo">attributedTo definition</a>.
     * <br>
     * Identifies one or more entities to which this object is attributed.
     * <br>
     * The attributed entities might not be Actors.
     * <br>
     * For instance, an object might be attributed to the completion of another activity.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object attributedTo;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#audience">audience definition</a>.
     * <br>
     * Identifies one or more entities that represent the total population of entities for which the object can
     * considered to be relevant.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object audience;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#content">content definition</a>.
     * <br>
     * The content or textual representation of the Object encoded as a JSON string.
     * By default, the value of content is HTML.
     * <br>
     * The mediaType property can be used in the object to indicate a different content type.
     * <br>
     * The content may be expressed using multiple language-tagged values.
     */
    protected String content;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#context">context definition</a>.
     * <br>
     * Identifies the context within which the object exists or an activity was performed.
     * <br>
     * The notion of "context" used is intentionally vague.
     * <br>
     * The intended function is to serve as a means of grouping objects and activities that share a common originating
     * context or purpose.
     * <br>
     * An example could be all activities relating to a common project or event.
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object context;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#name">name definition</a>.
     * <br>
     * A simple, human-readable, plain-text name for the object.
     * <br>
     * HTML markup must not be included.
     * <br>
     * The name may be expressed using multiple language-tagged values.
     * Possible values are: xsd:string
     */
    protected String name;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#name">name definition</a>.
     * <br>
     * Possible values are: rdf:langString
     */
    protected Map<String, String> nameMap;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#endTime">endTime definition</a>.
     * <br>
     * The date and time describing the actual or expected ending time of the object.
     * <br>
     * When used with an Activity object, for instance, the endTime property specifies the moment the activity
     * concluded or is expected to conclude.
     * <br>
     * Possible values are: xsd:dateTime
     */
    protected OffsetDateTime endTime;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#generator">generator definition</a>.
     * <br>
     * Identifies the entity (e.g. an application) that generated the object.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object generator;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#icon">icon definition</a>.
     * <br>
     * Indicates an entity that describes an icon for this object.
     * <br>
     * The image should have an aspect ratio of one (horizontal) to one (vertical) and should be suitable for
     * presentation at a small size.
     * <br>
     * Possible values are: {@link it.petrovich.model.extended.Image} or {@link Link}
     */
    protected Object icon;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#inReplyTo">inReplyTo definition</a>.
     * <br>
     * Indicates one or more entities for which this object is considered a response.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object inReplyTo;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#inReplyTo">inReplyTo definition</a>.
     * <br>
     * Indicates one or more physical or logical locations associated with the object.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object location;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#preview">preview definition</a>.
     * <br>
     * Identifies an entity that provides a preview of this object.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object preview;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#published">published definition</a>.
     * <br>
     * The date and time at which the object was published
     * <br>
     * Possible values are: xsd:dateTime
     */
    protected OffsetDateTime published;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#replies">replies definition</a>.
     * <br>
     * Identifies a Collection containing objects considered to be responses to this object.
     * <br>
     * Possible values are: {@link Collection}
     */
    protected Object replies;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#startTime">startTime definition</a>.
     * <br>
     * The date and time describing the actual or expected starting time of the object.
     * <br>
     * When used with an Activity object, for instance, the startTime property specifies the moment the activity
     * began or is scheduled to begin.
     * <br>
     * Possible values are: xsd:dateTime
     */
    protected OffsetDateTime startTime;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#summary">summary definition</a>.
     * <br>
     * A natural language summarization of the object encoded as HTML.
     * <br>
     * Multiple language tagged summaries may be provided.
     * <br>
     * Possible values are: xsd:string
     */
    protected Object summary;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#summary">summary definition</a>.
     * <br>
     * A natural language summarization of the object encoded as HTML.
     * <br>
     * Multiple language tagged summaries may be provided.
     * <br>
     * Possible values are: rdf:langString
     */
    protected Map<String, String> summaryMap;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#tag">tag definition</a>.
     * <br>
     * One or more "tags" that have been associated with an objects. A tag can be any kind of Object.
     * <br>
     * The key difference between attachment and tag is that the former implies association by inclusion, while the
     * latter implies associated by reference.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object tag;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#updated">updated definition</a>.
     * <br>
     * The date and time at which the object was updated
     * <br>
     * Possible values are: xsd:dateTime
     */
    protected OffsetDateTime updated;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#url">url definition</a>.
     * <br>
     * Identifies one or more links to representations of the object
     * <br>
     * Possible values are: xsd:anyURI or {@link Link}
     */
    protected Object url;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#to">to definition</a>.
     * <br>
     * Identifies an entity considered to be part of the public primary audience of an Object
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object to;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#bto">bto definition</a>.
     * <br>
     * Identifies an Object that is part of the private primary audience of this Object.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object bto;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#cc">cc definition</a>.
     * <br>
     * Identifies an Object that is part of the public secondary audience of this Object.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object cc;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#bcc">bcc definition</a>.
     * <br>
     * Identifies one or more Objects that are part of the private secondary audience of this Object.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object bcc;

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
     * Refer to <a href="https://www.w3.org/ns/activitystreams#duration">duration definition</a>.
     * <br>
     * When the object describes a time-bound resource, such as an audio or video, a meeting, etc, the duration
     * property indicates the object's approximate duration.
     * <br>
     * The value must be expressed as an xsd:duration as defined by [ xmlschema11-2], section 3.3.6 (e.g. a period
     * of 5 seconds is represented as "PT5S").
     * <br>
     * Possible values are: xsd:duration
     */
    protected String duration;

    protected String type;
    protected String id;
    protected Map<String, String> contentMap;

}
