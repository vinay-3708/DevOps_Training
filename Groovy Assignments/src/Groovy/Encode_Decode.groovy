package assignment

String usr_name="vinay"
String pass="vi@58_"
String sc=":"
String conc=usr_name + sc + pass
byte[] str = conc.getBytes()
def encoded = str.encodeBase64().toString()
println "Encoded String: "+encoded
byte[] decoded = encoded.decodeBase64()
def rev_conc = new String(decoded)
List lis = rev_conc.split(":")
println "usr_name: "+lis[0]
println "pass: "+lis[1]