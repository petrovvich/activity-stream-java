package it.petrovich.model.core;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Refer to <a href="https://www.w3.org/ns/activitystreams#Activity">Activity definition</a>.
 * <br>
 * An Activity is a subtype of Object that describes some form of action that may happen, is currently happening,
 * or has already happened. The Activity type itself serves as an abstract base type for all types of activities.
 * It is important to note that the Activity type itself does not carry any specific semantics about the kind of
 * action being taken.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Activity extends IntransitiveActivity {

    /**
     * @see BaseObject
     */
    protected BaseObject object;

}
