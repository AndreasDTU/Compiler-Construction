# Variables
antlrjar = antlr-4.13.2-complete.jar
SRC_DIR = src
GEN_DIR = src
INPUT_FILE = 01-hello-world.hw
OUTPUT_FILE = hello-world.html

# Java compiler and classpath
JAVAC = javac
JAVA = java
antlr4 = java -cp $(classpath) org.antlr.v4.Tool
classpath = $(antlrjar):.
grun = java -cp $(classpath) org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = HDL0Listener.java HDL0BaseListener.java HDL0Parser.java HDL0Lexer.java


all:	
	make grun

HDL0Lexer.java:	HDL0.g4
	$(antlr4) -visitor HDL0.g4

HDL0Lexer.class:	HDL0Lexer.java
	javac -cp $(classpath) $(GENERATED)

grun:	HDL0Lexer.class $(INPUT_FILE)
	$(grun) HDL0 start -gui -tokens $(INPUT_FILE)

main.class:	HDL0Lexer.java main.java
	javac -cp $(classpath) $(GENERATED) main.java

run:	main.class
	java -cp $(classpath) main $(INPUT_FILE)


clean:
	@echo "Cleaning up..."
	find "$(GEN_DIR)" -type f -name '*.interp' -delete
	find "$(GEN_DIR)" -type f -name '*.tokens' -delete
	find "$(GEN_DIR)" -type f -name '*.class' -delete
	find "$(SRC_DIR)" -type f -name '*.class' -delete
	-rm -f "$(OUTPUT_FILE)"

