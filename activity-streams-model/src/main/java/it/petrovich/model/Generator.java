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
 * Refer to <a href="https://www.w3.org/ns/activitystreams#generator">Generator definition</a>.
 * <br>
 * Identifies the entity (e.g. an application) that generated the object.
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Generator implements Typed, Named {
    private String type;
    private String name;
}
