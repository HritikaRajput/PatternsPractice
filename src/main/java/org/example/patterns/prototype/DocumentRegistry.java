package org.example.patterns.prototype;

import java.util.HashMap;
import java.util.Map;
public class DocumentRegistry {
    private Map<String, DocumentPrototype> register = new HashMap<>();

    public void addType(String type, DocumentPrototype prototype) {
        register.put(type, prototype);
    }

    public DocumentPrototype get(String key) {
        DocumentPrototype prototype = register.get(key);
        if (prototype != null) {
            return prototype.clone();
        }
        throw new IllegalArgumentException("No prototype found for key: " + key);
    }

}
