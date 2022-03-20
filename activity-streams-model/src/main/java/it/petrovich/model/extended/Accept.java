package it.petrovich.model.extended;

import it.petrovich.model.core.Activity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Refer to <a href="https://www.w3.org/ns/activitystreams#Accept">Accept definition</a>.
 * <br>
 * Indicates that the actor accepts the object.
 * The target property can be used in certain circumstances to indicate the context into which the object has been
 * accepted.
 */
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Accept extends Activity {

    private static final String ACCEPT_TYPE = "Accept";

    @Override
    public String getType() {
        return ACCEPT_TYPE;
    }
}
