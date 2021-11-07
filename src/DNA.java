public class DNA {
    Nucleotide[] bases;

    DNA(Nucleotide[] bases) {
        this.bases = bases;
    }

    public DNA(String sequence) {
        this(sequence.split(""));
    }

    public DNA(String[] sequence) {
        this(new Nucleotide[sequence.length]);

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

    public DNA reverseComplement() {
        Nucleotide[] nucleicBases = new Nucleotide[bases.length];

        for (int i = 0; i < this.bases.length; i++) {
            nucleicBases[i] = bases[i].getInverse();
        }

        return new DNA(nucleicBases);
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
    
    public String toString() {
        StringBuilder sequence = new StringBuilder();

        for (Nucleotide base : bases) {
            sequence.append(base.toString());
        }

        return sequence.toString();
    }
}
