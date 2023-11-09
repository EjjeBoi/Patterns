package Builder;

class Programmer {
    private String name;
    private int experienceLevel;
    private String programmingLanguage;

    private Programmer(String name, int experienceLevel, String programmingLanguage) {
        this.name = name;
        this.experienceLevel = experienceLevel;
        this.programmingLanguage = programmingLanguage;
    }

    String getName() {
        return name;
    }

    int getExperienceLevel() {
        return experienceLevel;
    }

    String getProgrammingLanguage() {
        return programmingLanguage;
    }

    static class Builder {
        private String name;
        private int experienceLevel;
        private String programmingLanguage;

        Builder setName(String name) {
            this.name = name;
            return this;
        }

        Builder setExperienceLevel(int experienceLevel) {
            this.experienceLevel = experienceLevel;
            return this;
        }

        Builder setProgrammingLanguage(String programmingLanguage) {
            this.programmingLanguage = programmingLanguage;
            return this;
        }

        Programmer build() {
            return new Programmer(name, experienceLevel, programmingLanguage);
        }
    }
}