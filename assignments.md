# Data Engineering
## Assignment 1: Big Data in Ihrem Umfeld (4 Punkte)
Schauen Sie sich in Ihrem Umfeld um. FH Technikum oder Ihr Job. Nennen Sie mindestens ein Beispiel für Daten, die schemalos (unstrukturiert) sind und mindestens ein Bespiel für Daten, die strukturiert (schematisch) sind. (2 Punkte)  
Nennen Sie ein Beispiel für Daten in Ihrem Umfeld, die gestreamt verarbeitet werden, nennen Sie ein Beispiel für Daten in Ihrem Umfeld, die über Batchverarbeitung verarbeitet werden. (2 Punkte)

* Strukturierte Daten:
 * Daten, die durch das firmeninterne Zeitaufzeichnungstool generiert werden.
 * Im TFS verwaltete Projekte (Epics/Features/US/Tasks/etc.)
* Unstrukturierte Daten:
 * E-Mails
 * Slack-Nachrichten (semistrukturiert)
* Gestreamte Daten:
 * Ein firmeninternes Tool ermöglicht die Verarbeitung und Visualisierung von Logging-Informationen, die von Komponenten an das Tool gestreamt werden können.
* Batchdaten:
 * Tägliche Datenbank-Backups die ohne Benutzerinteraktion durchgeführt werden
 * Am Ende des Tages wird ein aktueller Report für jedes Projekt generiert, welcher den aktuellen Status der jeweiligen Projekte anzeigt.

## Assignment 2: Big Data in Ihrem Umfeld (4 Punkte)
Entscheiden Sie sich für eine Data Engineering Plattform. Apache Flink oder Apache Spark. Installieren Sie die auf Ihrem Arbeitsgerät.
* Erklären Sie ihre Entscheidug
* Schicken Sie einen Screenshot der installierten Umgebung mit  
* Beschreiben Sie Ihre Toolchain, die Sie mit dem Framework nutzen würden (z.B. IDE)  

Bei der Wahl der Data Engineering Plattform ist natürlich zu berücksichtigen, welche Daten letzten Endes damit verarbeitet werden sollen. Sowohl Flink als auch Spark bieten eine große Palette an Features an. Dennoch hat sich bei der Recherche gezeigt, dass Apache Flink Apache Spark vorgezogen wird. [Hier](http://www.kdnuggets.com/2015/11/fast-big-data-apache-flink-spark-streaming.html) wird unter anderem ein Performance-Vergleich durchgeführt, welcher zugunsten Apache Flinks ausfällt. Weiters unterscheiden sich Spark und Flink dahingehend, dass Spark eher auf Batch-Verarbeitung ausgelegt ist, wohingegen Flink ein Stream processing framework ist [siehe hier](http://stackoverflow.com/questions/28082581/what-is-the-difference-between-apache-spark-and-apache-flink). Aufgrund dieser Informationen und jenem Vergleich in diesem [Video](https://www.youtube.com/watch?v=OHAv6o2fCi8), fällt meine Wahl auf Apache Flink. Ein Screenshot der lokalen Apache Flink Installation ist [hier](https://github.com/buffaloluk7/bld/blob/master/Apache_Flink.png) zu finden.  
  
Neben der Installation und Ausführung von Apache Flink über das auf der Website angebotene Zip-Package, habe ich auch das Sample zum Laufen gebracht. Hierfür war es lediglich notwendig 3 Maven-Dependencies anzugeben, um das Programm lauffähig zu bekommen. Ein Screenshot dieses Beispiel-Programms befindet sich [hier](https://github.com/buffaloluk7/bld/blob/master/Apache_Flink_Sample.png).  
  
Daraus würde sich folgende Toolchain ergeben: JetBrains IntelliJ IDEA und Maven.

## Assignment 3: Big Data in Ihrem Umfeld (4 Punkte)
Schreiben Sie ein simples Program mit dem Framework (z.B. Helloworld) und laden Sie es hoch.
* 2 Punkte für Programm
* 2 Punkte, wenn das Programm auch ausführbar ist.  

Das Programm lehnt sich an das Beispiel, welches auf der Flink-Website angeführt ist, an. Das Programm setzt dabei auf die auf der Website verwiesenen Maven-Dependencies. Aufgabe dieses Programms ist es, die Häufigkeiten von Wörtern in einem String zu zählen. Sofern maven installiert ist, kann ein entsprechender Unit-Test über den Befehl `mvn test` ausgeführt werden. Anderenfalls kann der Unit-Test auch manuell über eine entsprechende IDE angestoßen werden. Zu finden ist das Sample im Ordner [flink-sample](https://github.com/buffaloluk7/bld/tree/master/flink-sample).

# Data Science
## Assignment 1: Technologien (4 Punkte)
Sie haben in der LVA zwei Frameworks kennengelernt (R und Python). Nennen Sie zwei weitere Technologien, um Daten zu analysieren (müssen nicht open source sein). Sie bekommen den Auftrag, sich mit einer Data Science Technologie zu arbeiten. Nennen Sie Technologie, die ihnen auf dem ersten Blick am besten für Sie ersscheint und begründen Sie das!  

Zwei weitere Frameworks/Sprachen: [Julia](http://julialang.org/), [Scala](http://www.scala-lang.org/).  
Ich hatte bis jetzt noch nie die Gelegenheit mit R bzw. Python mehr als nur ein Paar Zeilen Code zu schreiben. Daher sind so gut wie alle Sprachen/Frameworks, die sich für Data Analysis anbieten, noch Neuland für mich. Python ist im Vergleich zu R was die Syntax anbelangt jedoch eher mit gängen Programmiersprachen wie Java, C#, (JavaScript), Go, etc. vergleichbar. Daher würde meine Wahl vermutlich auf Python fallen. Liest man sich diverse Artikel zu diesem Thema durch, so wird auch dort meist Python präferiert. [Hier](http://blog.udacity.com/2015/01/python-vs-r-learn-first.html), [hier](https://www.quora.com/Which-is-better-for-data-analysis-R-or-Python) und [hier](http://www.kdnuggets.com/2015/05/r-vs-python-data-science.html). Nichtsdestotrotz sollte eine Technologie nicht nur nach Bauchgefühl ausgesucht werden, sondern mit den Anforderungen des Projektes abgestimmt werden.

## Assignment 2: Technologien
Entscheiden Sie sich für eine Data Science Plattform. R oder Python Installieren Sie die auf Ihrem Arbeitsgerät.
* 1 Punkt: Begründen Sie ihre Entscheidung (Warum ziehen Sie persönlich aus ihrer Ausgangssituation die eine Technologie der anderen vor).
* 2 Punkte: Schicken Sie einen Screenshot der installierten Umgebung mit
* 1 Punkt: Beschreiben Sie Ihre Toolchain, die Sie mit dem Framework nutzen (z.B. IDE)  

Wie bereits bei Frage 2.1 erwähnt, würde meine Wahl auf Pythong fallen. Einerseits weil deren Syntax eher einer Hochsprache bzw. jenen Sprachen ähnelt, mit denen ich bis jetzt Kontakt hatte. Andererseits findet man immer mehr Projekte, die in Python geschrieben sind. Screenshots der installierten Umgebung befinden sich [hier](https://github.com/buffaloluk7/bld/blob/master/Python.png) und [hier](https://github.com/buffaloluk7/bld/blob/master/Python_Shell.png).  

Da JetBrains auch für Pyhton eine eigene IDE anbietet, kommt in diesem Fall PyCharm zum Einsatz.

## Assignment 3: Big Science
Der Cheatsheet auf http://scikit-learn.org/stable/tutorial/machine_learning_map/ ist eine einfache Anleitung, wie man den richtigen Algorithmus zum richtigen Data Science Problem findet.  
Schauen Sie in Google nach und lernen Sie classificatiom, regression, clusting und dimensional reduction unterscheiden. 
Nennen Sie ein Beispiel aus ihrem Umfeld, wo Sie mit dem Algorithmus zu tun haben. Das kann ein Beispiel sein, wie: Wenn Sie bei Amazon einkaufen. Wenn Sie von einem Marketinginstitut angerufen werden, etc.  

Bei __classification__ geht es darum, Daten in Kategorien zu unterteilen und aufgrund von Vorhersagen bestimmen zu können, zu welcher Klasse ein Datenpunkt aus einer Population gehört. Ein Beispiel für _classification_ in Verbindung mit Facebook und Werbung ist meiner Meinung nach Folgendes: Facebook kann das Verhalten (Likes, Shares, etc.) von Freunden eines Benutzers analysieren und dem Benutzer entsprechend Werbung präsentieren, selbst wenn dieser kaum Aktivität aufweist. Dennoch kann FB diesen Benutzer einer gewissen Kategorie(n) zuordnen und unter Umständen ansprechende Werbung präsentieren.

Bei __regression__ geht es ebenfalls um die Vorhersage, jedoch nicht um die Zuweisung einer Kategorie, sondern um die eines konkreten Wertes. Als Beispiel könnte unter Umständen der Preisverlauf auf Amazon hergenommen werden. Mit Hilfe von _regression_ könnte man versuchen, den zukünftigen Preis, um den die Konkurrenz ein Produkt anbieten wird, vorherzusagen, um frühzeitig darauf reagieren zu können.

Bei __clustering__ geht es ähnlich wie bei _classification_ um Kategorien, jedoch werden diese nicht zuvor definiert. Als Beispiel für _clustering_ könnten beispielsweise die empfohlenen Seiten auf Facebook angesehen werden.

Umso mehr Daten, desto besser können Datenanalysen durchgeführt werden? Dies ist nicht immer der Fall, da zu große Datenmengen unter Umständen eine schlechtere Performance bei Verwendung von Datenanalyse-Applikationen liefern können. Daher kommt die sogenannte __dimensional reduction__ zum Einsatz. Darunter versteht man eine Vorphase, bevor bspw. _regression_ oder _clustering_ angewandt werden. Dies bringt unter anderem die Vorteile, dass der Speicherplatz für die zu analysierenden Daten verringert wird und die Zeit für die Verarbeitung reduziert werden kann. Weiters kann die Visualisierung der Daten um ein Vielfaches vereinfacht werden, wenn statt bspw. 8 Dimensionen lediglich eine 2/3-dimensionale Darstellung betrachtet werden muss.
