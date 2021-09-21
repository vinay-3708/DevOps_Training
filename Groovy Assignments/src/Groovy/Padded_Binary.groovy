package assignment

for (def i=0; i<16; i++) {
	println String.format("%4s",Integer.toBinaryString(i)).replaceAll(" ", "0")
}