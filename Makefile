# Variables
ANTLR_JAR = antlr-4.13.2-complete.jar
SRC_DIR = src
GEN_DIR = src
INPUT_FILE = 01-hello-world.hw
OUTPUT_FILE = hello-world.html

# Java compiler and classpath
JAVAC = javac
JAVA = java
CLASSPATH = .:$(ANTLR_JAR):$(GEN_DIR)

# Target to generate the ANTLR parser and lexer
$(GEN_DIR)/HDL0Lexer.java: HDL0.g4
	@echo "Generating ANTLR lexer and parser..."
	$(JAVA) -jar $(ANTLR_JAR) -Dlanguage=Java -visitor -no-listener -o $(GEN_DIR) HDL0.g4


# Target to compile the generated ANTLR files and your Java files
compile: $(GEN_DIR)/HDL0Lexer.java
	@echo "Compiling ANTLR-generated and source Java files..."
	$(JAVAC) -cp "$(CLASSPATH)" $(GEN_DIR)/HDL0Lexer.java $(GEN_DIR)/HDL0Parser.java $(SRC_DIR)/*.java

# Target to run the program and output HTML
run: compile
	@echo "Running prettyprint visitor on $(INPUT_FILE)..."
	$(JAVA) -cp "$(CLASSPATH)" PrettyPrintMain "$(INPUT_FILE)" > "$(OUTPUT_FILE)"
	@echo "HTML output generated: $(OUTPUT_FILE)"

# Clean the generated and compiled files
clean:
	@echo "Cleaning up..."
	find "$(GEN_DIR)" -type f -name '*.interp' -delete
	find "$(GEN_DIR)" -type f -name '*.tokens' -delete
	find "$(GEN_DIR)" -type f -name '*.class' -delete
	find "$(SRC_DIR)" -type f -name '*.class' -delete
	-rm -f "$(OUTPUT_FILE)"

# Phony targets
.PHONY: compile run clean
