antlrjar = antlr-4.13.2-complete.jar

###### FOR LINUX AND MAC -- comment the following line if you use Windows:
#classpath = '$(antlrjar):.'

###### FOR WINDOWS -- uncomment the following line if you use Windows:
classpath = '$(antlrjar);.'
antlr4 = java -cp $(classpath) org.antlr.v4.Tool
grun = java -cp $(classpath) org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = progListener.java progBaseListener.java progParser.java progLexer.java

all:	
	make run

progLexer.java:	prog.g4
	$(antlr4) -visitor prog.g4

progLexer.class:	progLexer.java
	javac -cp $(classpath) $(GENERATED)

grun:	progLexer.class prog.txt
	$(grun) prog start -gui -tokens prog.txt; make clean

main.class:	progLexer.java main.java
	javac -cp $(classpath) $(GENERATED) main.java

run:	main.class
	java -cp $(classpath) main prog.txt; make clean



clean:
	@find . -maxdepth 1 -type f \( -name '*.class' -o -name '*.tokens' -o -name '*.interp' \) ! -name 'main.java' -exec rm -f {} +