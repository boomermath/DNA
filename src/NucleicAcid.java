class NucleicAcid {
    Nucleotide[] bases;

    NucleicAcid(Nucleotide[] bases) {
        this.bases = bases;
    }

    public NucleicAcid complement() {
        Nucleotide[] bases = new Nucleotide[this.bases.length];
        for (int i = 0; i < this.bases.length; i++) {
            bases[i] = this.bases[i].complement();
        }
        return new NucleicAcid(bases);
    }

    public String toString() {
        StringBuilder sequence = new StringBuilder();

        for (Nucleotide base : bases) {
            sequence.append(base.toString());
        }

        return sequence.toString();
    }
}
