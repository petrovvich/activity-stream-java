package it.petrovich.model.core;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Refer to <a href="https://www.w3.org/ns/activitystreams#OrderedCollectionPage">OrderedCollectionPage definition</a>.
 * <br>
 * Used to represent ordered subsets of items from an OrderedCollection.
 * <br>
 * Refer to the Activity Streams 2.0 Core for a complete description of the OrderedCollectionPage object.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OrderedCollectionPage extends OrderedCollection {

    private final CollectionPage collectionPageProxy = new CollectionPageProxy();

    /**
     * Refer to <a href="https://www.w3.org/ns/activitystreams#startIndex">startIndex definition</a>.
     * <br>
     * A non-negative integer value identifying the relative position within the logical view of a strictly ordered collection.
     * <br>
     * Possible values are: xsd:nonNegativeInteger
     */
    private Integer startIndex;

    private static class CollectionPageProxy extends CollectionPage {
    }


    public Object getPartOf() {
        return collectionPageProxy.getPartOf();
    }

    public void setPartOf(Object partOf) {
        collectionPageProxy.setPartOf(partOf);
    }


    public Object getNext() {
        return collectionPageProxy.getNext();
    }

    public void setNext(Object next) {
        collectionPageProxy.setNext(next);
    }

    public Object getPrev() {
        return collectionPageProxy.getPrev();
    }

    public void setPrev(Object prev) {
        collectionPageProxy.setPrev(prev);
    }
}
