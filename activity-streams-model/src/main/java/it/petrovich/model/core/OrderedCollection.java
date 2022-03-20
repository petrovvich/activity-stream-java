package it.petrovich.model.core;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Refer to <a href="https://www.w3.org/ns/activitystreams#OrderedCollection">OrderedCollection definition</a>.
 * <br>
 * A subtype of Collection in which members of the logical collection are assumed to always be strictly ordered.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OrderedCollection extends Collection {
}
