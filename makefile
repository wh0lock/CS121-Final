HasMenu.class: HasMenu.java
	javac -g HasMenu.java

testListener: Listener.class
	java Listener

clean:
	rm *.class

run: Music.class
	java Music

debug: Music.class
	jdb Music
