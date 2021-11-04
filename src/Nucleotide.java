enum Nucleotide {
    ADENINE,
    CYTOSINE,
    GUANINE,
    THYMINE,
    URACIL;

    public Nucleotide getInverse() {
        return switch (this) {
            case ADENINE -> THYMINE;
            case THYMINE, URACIL -> ADENINE;
            case CYTOSINE -> GUANINE;
            case GUANINE -> CYTOSINE;
        };
    }

    public String toString() {
        return switch (this) {
            case ADENINE -> "A";
            case THYMINE -> "T";
            case URACIL -> "U";
            case CYTOSINE -> "C";
            case GUANINE -> "G";
        };
    }
}
