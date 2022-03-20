package it.petrovich.model.core;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Refer to <a href="https://www.w3.org/ns/activitystreams#IntransitiveActivity">IntransitiveActivity definition</a>.
 * <br>
 * Instances of IntransitiveActivity are a subtype of Activity representing intransitive actions.
 * <br>
 * Inherits all properties from {@link Activity} except object.
 * <br>
 * The object property is therefore inappropriate for these activities.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class IntransitiveActivity extends BaseObject {

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#actor">actor definition</a>.
     * <br>
     * Describes one or more entities that either performed or are expected to perform the activity.
     * Any single activity can have multiple actors.
     * The actor may be specified using an indirect Link.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object actor;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#target">target definition</a>.
     * <br>
     * Describes the indirect object, or target, of the activity.
     * The precise meaning of the target is largely dependent on the type of action being described but will often be
     * the object of the English preposition "to".
     * For instance, in the activity "John added a movie to his wishlist", the target of the activity
     * is John's wishlist.
     * An activity can have more than one target.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object target;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#result">result definition</a>.
     * <br>
     * Describes the result of the activity.
     * For instance, if a particular action results in the creation of a new resource, the result property can be used
     * to describe that new resource.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object result;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#origin">origin definition</a>.
     * <br>
     * Describes an indirect object of the activity from which the activity is directed.
     * The precise meaning of the origin is the object of the English preposition "from".
     * For instance, in the activity "John moved an item to List B from List A", the origin of the activity is "List A".
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object origin;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#instrument">instrument definition</a>.
     * <br>
     * Identifies one or more objects used (or to be used) in the completion of an Activity.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link}
     */
    protected Object instrument;
}
