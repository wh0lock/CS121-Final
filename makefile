HasMenu.class: HasMenu.java
	javac -g HasMenu.java

User.class: User.java HasMenu.class
	javac -g User.java

Listener.class: Listener.java User.java
	javac -g Listener.java

testListener: Listener.class
	java Listener

clean:
	rm *.class

run: Music.class
	java Music

debug: Music.class
	jdb Music
