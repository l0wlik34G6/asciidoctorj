package org.asciidoctor.extension;

import java.util.Map;

import org.asciidoctor.dom.DocumentRuby;

public abstract class IncludeProcessor extends Processor {

    public IncludeProcessor(DocumentRuby documentRuby) {
        super(documentRuby);
    }

    public abstract boolean handles(String target);
    public abstract void process(PreprocessorReader reader, String target, Map<String, Object> attributes);
    
}
