package it.petrovich.model.core;

import it.petrovich.model.interfaces.Contextual;
import it.petrovich.model.interfaces.Typed;

/**
 * Refer to <a href="https://www.w3.org/ns/activitystreams#Link">Link definition</a>.
 * <br>
 * A Link is an indirect, qualified reference to a resource identified by a URL.
 * The fundamental model for links is established by [ RFC5988].
 * Many of the properties defined by the Activity Vocabulary allow values that are either instances of Object or Link.
 * When a Link is used, it establishes a qualified relation connecting the subject (the containing object) to the
 * resource identified by the href. Properties of the Link are properties of the reference as opposed to properties
 * of the resource.
 */
public class Link implements Contextual, Typed {
    protected Object context;

    @Override
    public Object getContext() {
        return context;
    }

    @Override
    public void setContext(Object context) {
        this.context = context;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void setType(String type) {

    }
}
