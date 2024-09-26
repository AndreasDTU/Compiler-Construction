antlrjar = lib/antlr-4.13.2-complete.jar

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

grun: HDL0Lexer.class cc.txt
	$(grun) HDL0 hdl0 -gui -tokens $(file); make clean

# Allow file to be passed as an argument
file ?= 01-hello-world.hw  # You can set a default file if needed

clean:
	@find . -maxdepth 1 -type f \( -name '*.class' -o -name '*.tokens' -o -name '*.interp' \) ! -name 'main.java' -exec rm -f {} +