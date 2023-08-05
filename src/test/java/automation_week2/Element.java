package automation_week2;

public enum Element {
        H("Hydrogen"),
        HE("Helium"),
        // ...
        NE("Neon");

        public final String label;

        private Element(String label) {
            this.label = label;
        }
    }

