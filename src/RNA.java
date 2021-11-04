public class RNA extends NucleicAcid {
    RNA(Nucleotide[] bases) {
        super(bases);
    }

    public RNA(String sequence) {
        this(sequence.split(""));
    }

    public RNA(String[] sequence) {
        super(new Nucleotide[sequence.length]);

        for (int i = 0; i < sequence.length; i++) {
            switch (sequence[i]) {
                case "A" -> bases[i] = Nucleotide.ADENINE;
                case "T" -> bases[i] = Nucleotide.THYMINE;
                case "U" -> bases[i] = Nucleotide.URACIL;
                case "G" -> bases[i] = Nucleotide.CYTOSINE;
                default -> throw new IllegalArgumentException("Base \"" + sequence[i] + "\" is not a valid base in RNA!");
            }
        }
    }

    public DNA toDNA() {
        Nucleotide[] dnaBases = new Nucleotide[bases.length];

        for (int i = 0; i < bases.length; i++) {
            switch (bases[i]) {
                case ADENINE -> dnaBases[i] = Nucleotide.THYMINE;
                case URACIL -> dnaBases[i] = Nucleotide.ADENINE;
                case CYTOSINE -> dnaBases[i] = Nucleotide.GUANINE;
                case GUANINE -> dnaBases[i] = Nucleotide.CYTOSINE;
                default -> throw new IllegalArgumentException("Base \"" + bases[i] + "\" is not a valid base in RNA!");
            }
        }

        return new DNA(dnaBases);
    }

    public String toString() {
        StringBuilder sequence = new StringBuilder();

        for (Nucleotide base : bases) {
            sequence.append(base.toString());
        }

        return sequence.toString();
    }
}
