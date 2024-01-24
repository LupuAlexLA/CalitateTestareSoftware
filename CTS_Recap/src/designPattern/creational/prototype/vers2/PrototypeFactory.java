package designPattern.creational.prototype.vers2;

import java.util.HashMap;

public class PrototypeFactory {
    private static HashMap<String, Task> prototipuriTaskuri = new HashMap<>();

    static {
        TaskBackend taskBackend = new TaskBackend();
        taskBackend.setId("backend");
        prototipuriTaskuri.put("backend", taskBackend);

        TaskFrontend taskFrontend = new TaskFrontend();
        taskFrontend.setId("frontend");
        prototipuriTaskuri.put("frontend", taskFrontend);
    }

    public static Task getPrototip(String id) throws CloneNotSupportedException {
        Task copiePrototip = null;
        Task prototip = prototipuriTaskuri.get(id);

        if(prototip != null) {
            copiePrototip = (Task) prototip.clone();
        }

        return copiePrototip;
    }
}
