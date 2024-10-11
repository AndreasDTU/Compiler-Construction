antlrjar = antlr-4.13.2-complete.jar

###### FOR LINUX AND MAC -- uncomment the following line if you do not use Windows:
#classpath = '$(antlrjar):.'
###### FOR WINDOWS -- comment the following line if you do not use Windows:
classpath = '$(antlrjar);.'

antlr4 = java -cp $(classpath) org.antlr.v4.Tool
grun = java -cp $(classpath) org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = HDL0Listener.java HDL0BaseListener.java HDL0Parser.java HDL0Lexer.java
FILE1 = 01-hello-world.hw
FILE2 = 01b-hello-world-withdef.hw
FILE3 = 02-trafiklys-minimal.hw
FILE4 = 03-trafiklys.hw
FILE5 = 04-von-Neumann.hw




all:	
	make grun

HDL0Lexer.java:	HDL0.g4
	$(antlr4) -visitor HDL0.g4

HDL0Lexer.class:	HDL0Lexer.java
	javac -cp $(classpath) $(GENERATED)

grun:	HDL0Lexer.class $(FILE5)
	$(grun) HDL0 hdl0 -gui -tokens $(FILE5)

main.class:	HDL0Lexer.java main.java
	javac -cp $(classpath) $(GENERATED) main.java

run:	main.class
	java -cp $(classpath) main $(FILE1)
	java -cp $(classpath) main $(FILE2)
	java -cp $(classpath) main $(FILE3)
	java -cp $(classpath) main $(FILE4)
	java -cp $(classpath) main $(FILE5)


clean:
	@echo "Cleaning up..."
	find -type f -name '*.interp' -delete
	find -type f -name '*.tokens' -delete
	find -type f -name '*.class' -delete
	find -type f -name '*.class' -delete
	-rm -f "$(OUTPUT_FILE)"

