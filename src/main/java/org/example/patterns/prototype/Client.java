package org.example.patterns.prototype;

import org.example.patterns.prototype.impl.Resume;
import org.example.patterns.prototype.impl.Letter;

public class Client {
    public static void main(String[] args) {
        DocumentPrototype resume = new Resume(
                "John Doe",
                "hritika@example.com",
                "123-456-7890",
                "5 years of experience in software development"
        );
        DocumentPrototype letter = new Letter(
                "Jane Smith",
                "John Doe",
                "Dear Jane, I hope this letter finds you well."
        );
        DocumentRegistry registry = new DocumentRegistry();
        registry.addType("resume", resume);
        registry.addType("letter", letter);

        DocumentPrototype clonedResume = registry.get("resume");
        clonedResume.setName("John Smith");
        clonedResume.setEmail("matter");
        clonedResume.print();

        }
}
