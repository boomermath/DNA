# DNA Sequencer

My fellow biologists, I present to you a solution to the problem that has plagued us for centuries: sequencing DNA.

Ok, but seriously, I was bored, and didn't want to do my biomed homework by hand, because converting RNA to individual amino acids is annoying.

Usage
```java
DNA dna = new DNA("ATAGAGTC"); //some valid sequence of DNA
RNA rna = new RNA("AUAUGCUGA"); //some valid sequence of RNA
        
DNA convertedRNA = rna.toDNA(); //convert RNA to DNA 
RNA convertedDNA = dna.toRNA(); //convert to RNA

//call reverseComplement() to get the reverse complement of a DNA/RNA sequence

//and for la piece de resistance

String[] aminoAcids = rna.synthesizeAminoAcids(); //returns a string array with the amino acids in order, until the stop codon or the end of the array.

//also if you want to manually get the amino acid for a specific codon
String aminoAcid = CodonDictionary.getAminoAcid("UGA"); //get amino acid from codon

System.out.println(aminoAcid); //prints "stop" because its a stop codon
```

## Happy Sequencing!
