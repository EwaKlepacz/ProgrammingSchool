package pl.ewaklepacz.progschool.model;

import java.util.Objects;


    public class Exercise {
        private int id;
        private String title;
        private String description;

        public Exercise () {

        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Exercise{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Exercise exercise = (Exercise) o;
            return id == exercise.id &&
                    Objects.equals(title, exercise.title) &&
                    Objects.equals(description, exercise.description);
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }




