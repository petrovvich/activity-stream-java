package it.petrovich.model.core;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Refer to <a href="https://www.w3.org/ns/activitystreams#Collection">Collection definition</a>.
 * <br>
 * A Collection is a subtype of Object that represents ordered or unordered sets of Object or Link instances.
 * <br>
 * Refer to the Activity Streams 2.0 Core specification for a complete description of the Collection type.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Collection extends BaseObject {

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#totalItems">totalItems definition</a>.
     * <br>
     * A non-negative integer specifying the total number of objects contained by the logical view of the collection.
     * <br>
     * This number might not reflect the actual number of items serialized within the Collection object instance.
     * <br>
     * Possible values are: xsd:nonNegativeInteger
     */
    protected Integer totalItems;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#current">current definition</a>.
     * <br>
     * In a paged Collection, indicates the page that contains the most recently updated member items.
     * <br>
     * Possible values are: {@link CollectionPage} or {@link Link}
     */
    protected Object current;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#first">first definition</a>.
     * <br>
     * In a paged Collection, indicates the furthest preceeding page of items in the collection.
     * <br>
     * Possible values are: {@link CollectionPage} or {@link Link}
     */
    protected Object first;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#last">last definition</a>.
     * <br>
     * In a paged Collection, indicates the furthest proceeding page of the collection.
     * <br>
     * Possible values are: {@link CollectionPage} or {@link Link}
     */
    protected Object last;

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#last">last definition</a>.
     * <br>
     * Identifies the items contained in a collection. The items might be ordered or unordered.
     * <br>
     * Possible values are: {@link BaseObject} or {@link Link} or Ordered List of {@link BaseObject} or {@link Link}
     */
    protected Object items;
}
