package it.petrovich.model.core;

public class OrderedCollectionPage extends CollectionPage {
    
    private final OrderedCollection orderedCollectionProxy = new InnerOrderedCollection();
    
    private static class InnerOrderedCollection extends OrderedCollection {

    }
}
