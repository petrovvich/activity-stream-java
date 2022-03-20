package it.petrovich.model.core;

import it.petrovich.model.Attachment;
import it.petrovich.model.Audience;
import it.petrovich.model.Generator;
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

import java.time.LocalDateTime;
import java.util.Collection;

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

    protected Collection<Attachment> attachment;
    protected Object attributedTo;
    protected Audience audience;
    protected String content;
    @SerializedName(name = "@context")
    protected Object context;
    protected String name;
    protected LocalDateTime endTime;
    protected Generator generator;

    protected String type;
    protected String id;
    protected String contentMap;
    protected String mediaType;

}
