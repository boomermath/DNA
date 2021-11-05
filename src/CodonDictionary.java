import java.util.HashMap;

public class CodonDictionary {
    private static final HashMap<String, String> codons = new HashMap<>();

    public static void init() {
        if (codons.size() > 0) {
            return;
        }

        codons.put("AAA", "Lysine");
        codons.put("AAG", "Lysine");
        codons.put("AAC", "Asparagine");
        codons.put("AAU", "Asparagine");
        codons.put("ACA", "Theronine");
        codons.put("ACG", "Theronine");
        codons.put("ACU", "Theronine");
        codons.put("ACC", "Theronine");
        codons.put("AGG", "Arginine");
        codons.put("AGA", "Arginine");
        codons.put("AGC", "Serine");
        codons.put("AGU", "Serine");
        codons.put("AUU", "Isoleucine");
        codons.put("AUA", "Isoleucine");
        codons.put("AUC", "Isoleucine");
        codons.put("AUG", "Methionine");
        codons.put("CUC", "Leucine");
        codons.put("CUA", "Leucine");
        codons.put("CUG", "Leucine");
        codons.put("CUU", "Leucine");
        codons.put("CCU", "Proline");
        codons.put("CCA", "Proline");
        codons.put("CCC", "Proline");
        codons.put("CCG", "Proline");
        codons.put("CGG", "Arginine");
        codons.put("CGA", "Arginine");
        codons.put("CGU", "Arginine");
        codons.put("CGC", "Arginine");
        codons.put("CAG", "Glutamine");
        codons.put("CAA", "Glutamine");
        codons.put("CAC", "Histidine");
        codons.put("CAU", "Histidine");
        codons.put("GUU", "Valine");
        codons.put("GUA", "Valine");
        codons.put("GUC", "Valine");
        codons.put("GUG", "Valine");
        codons.put("GCA", "Alanine");
        codons.put("GCG", "Alanine");
        codons.put("GCU", "Alanine");
        codons.put("GCC", "Alanine");
        codons.put("GGA", "Glycine");
        codons.put("GGU", "Glycine");
        codons.put("GGC", "Glycine");
        codons.put("GGG", "Glycine");
        codons.put("GAA", "Glutamic Acid");
        codons.put("GAG", "Glutamic Acid");
        codons.put("GAU", "Aspartic Acid");
        codons.put("GAC", "Aspartic Acid");
        codons.put("UUC", "Phenylalanine");
        codons.put("UUU", "Phenylalanine");
        codons.put("UUA", "Leucine");
        codons.put("UUG", "Leucine");
        codons.put("UCA", "Serine");
        codons.put("UCU", "Serine");
        codons.put("UCC", "Serine");
        codons.put("UCG", "Serine");
        codons.put("UGU", "Cysteine");
        codons.put("UGC", "Cysteine");
        codons.put("UGG", "Tryptophan");
        codons.put("UAC", "Tyrosine");
        codons.put("UAU", "Tyrosine");
        codons.put("UAA", "Stop");
        codons.put("UGA", "Stop");
        codons.put("UAG", "Stop");
    }

    public static String getAminoAcid(String codonSequence) {
        return codons.get(codonSequence);
    }
}
