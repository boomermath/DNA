public class DNA extends NucleicAcid {
    DNA(Nucleotide[] dnaBases) {
        super(dnaBases);
    }

    public DNA(String sequence) {
        this(sequence.split(""));
    }

    public DNA(String[] sequence) {
        super(new Nucleotide[sequence.length]);

        for (int i = 0; i < sequence.length; i++) {
            switch (sequence[i]) {
                case "A" -> bases[i] = Nucleotide.ADENINE;
                case "T" -> bases[i] = Nucleotide.THYMINE;
                case "C" -> bases[i] = Nucleotide.CYTOSINE;
                case "G" -> bases[i] = Nucleotide.GUANINE;
                default -> throw new IllegalArgumentException("Base \"" + sequence[i] + "\" is not a valid base in DNA!");
            }
        }
    }

    public RNA toRNA() {
        Nucleotide[] rnaBases = new Nucleotide[bases.length];

        for (int i = 0; i < bases.length; i++) {
            if (bases[i] == Nucleotide.THYMINE) {
                rnaBases[i] = Nucleotide.URACIL;
            }
            rnaBases[i] = bases[i];
        }

        return new RNA(rnaBases);
    }
}
