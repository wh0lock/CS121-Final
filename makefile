HasMenu.class: HasMenu.java
	javac -g HasMenu.java

User.class: User.java HasMenu.class
	javac -g User.java

Listener.class: Listener.java User.class
	javac -g Listener.java

Music.class: Music.java Listener.class User.class
	javac -g Music.java
	
testListener: Listener.class
	java Listener

clean:
	rm *.class

run: Music.class
	java Music

debug: Music.class
	jdb Music
