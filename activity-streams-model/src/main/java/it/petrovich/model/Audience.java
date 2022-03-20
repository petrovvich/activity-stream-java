package it.petrovich.model;

import it.petrovich.model.interfaces.Named;
import it.petrovich.model.interfaces.Typed;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Refer to <a href="https://www.w3.org/ns/activitystreams#audience">audience definition</a>.
 * <br>
 * Identifies one or more entities that represent the total population of entities for which the object can
 * considered to be relevant.
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Audience implements Named, Typed {

    private String name;
    private String type;
}
