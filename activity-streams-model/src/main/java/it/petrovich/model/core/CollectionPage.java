package it.petrovich.model.core;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Refer to <a href="https://www.w3.org/ns/activitystreams#CollectionPage">CollectionPage definition</a>.
 * <br>
 * Used to represent distinct subsets of items from a Collection.
 * <br>
 * Refer to the Activity Streams 2.0 Core for a complete description of the CollectionPage object.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CollectionPage extends Collection {

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#partOf">partOf definition</a>.
     * <br>
     * Identifies the Collection to which a CollectionPage objects items belong.
     * <br>
     * Possible values are: {@link Link} or {@link Collection}
     */
    protected Object partOf;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#next">next definition</a>.
     * <br>
     * In a paged Collection, indicates the next page of items.
     * <br>
     * Possible values are: {@link Link} or {@link CollectionPage}
     */
    protected Object next;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#prev">prev definition</a>.
     * <br>
     * In a paged Collection, identifies the previous page of items.
     * <br>
     * Possible values are: {@link Link} or {@link CollectionPage}
     */
    protected Object prev;
}
