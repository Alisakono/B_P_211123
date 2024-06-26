package org.example.src.lesson20240320.hometask;

public interface JobActions {

    void doTask(Task task);
    void haveRest();


    class Task {
        private String name;
        private String description;

        public Task(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }
    }

}
