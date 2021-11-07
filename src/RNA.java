public class RNA {
    Nucleotide[] bases;

    RNA(Nucleotide[] bases) {
        this.bases = bases;
    }

    public RNA(String sequence) {
        this(sequence.split(""));
    }

    public RNA(String[] sequence) {
        Nucleotide[] bases = new Nucleotide[sequence.length];

        for (int i = 0; i < sequence.length; i++) {
            switch (sequence[i]) {
                case "A" -> bases[i] = Nucleotide.ADENINE;
                case "C" -> bases[i] = Nucleotide.CYTOSINE;
                case "U" -> bases[i] = Nucleotide.URACIL;
                case "G" -> bases[i] = Nucleotide.GUANINE;
                default -> throw new IllegalArgumentException("Base \"" + sequence[i] + "\" is not a valid base in RNA!");
            }
        }

        this.bases = bases;
        CodonDictionary.init();
    }

    public RNA reverseComplement() {
        Nucleotide[] nucleicBases = new Nucleotide[bases.length];

        for (int i = 0; i < this.bases.length; i++) {
            nucleicBases[i] = bases[i].getInverse();
        }

        return new RNA(nucleicBases);
    }

    public String[] synthesizeAminoAcids() {
        String[] sequence = toString().split("");
        String[] aminoAcids = new String[bases.length / 3];
              
        if (bases.length % 3 != 0) {
            throw new IllegalArgumentException("RNA sequence is not in codons of 3!");
        }
        
        for (int i = 0; i < sequence.length; i += 3) {
            String key = sequence[i] + sequence[i + 1] + sequence[i + 2];
            String aminoAcid = CodonDictionary.getAminoAcid(key);
            aminoAcids[i] = aminoAcid;
            if (aminoAcid.equals("Stop")) {
                break;
            }
        }

        return aminoAcids;
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
