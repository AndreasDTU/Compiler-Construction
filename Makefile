antlrjar = antlr-4.13.2-complete.jar

###### FOR LINUX AND MAC -- uncomment the following line if you do not use Windows:
# classpath = '$(antlrjar):.'

###### FOR WINDOWS -- comment the following line if you do not use Windows:
classpath = '$(antlrjar);.'

antlr4 = java -cp $(classpath) org.antlr.v4.Tool
grun = java -cp $(classpath) org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = HDL0Listener.java HDL0BaseListener.java HDL0Parser.java HDL0Lexer.java

all:	
	make grun

HDL0Lexer.java:	HDL0.g4
	$(antlr4) HDL0.g4

HDL0Lexer.class:	HDL0Lexer.java
	javac -cp $(classpath) $(GENERATED)

grun:	HDL0Lexer.class cc.txt
	$(grun) HDL0 hdl0 -gui -tokens 01-hello-world.hw; make clean

clean:
	rm -f *.class *.tokens *.interp *.java
