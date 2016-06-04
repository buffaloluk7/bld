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

Das Programm lehnt sich an das Beispiel, welches auf der Flink-Website angeführt ist, an. Das Programm setzt dabei auf die auf der Website verwiesenen Maven-Dependencies. Aufgabe dieses Programms ist es, die Häufigkeiten von Wörtern in einem String zu zählen. Sofern maven installiert ist, kann ein entsprechender Unit-Test über den Befehl `mvn test` ausgeführt werden. Anderenfalls kann der Unit-Test auch manuell über eine entsprechende IDE angestoßen werden.

# Data Science
## Assignment 1: Technologien (4 Punkte)
1. Sie haben in der LVA zwei Frameworks kennengelernt (R und Python). Nennen Sie zwei weitere Technologien, um Daten zu analysieren (müssen nicht open source sein)
2. Sie bekommen den Auftrag, sich mit einer Data Science Technologie zu arbeiten. Nennen Sie Technologie, die ihnen auf dem ersten Blick am besten für Sie ersscheint und begründen Sie das!

## Assignment 2: Technologien
Entscheiden Sie sich für eine Data Science Plattform. R oder Python Installieren Sie die auf Ihrem Arbeitsgerät.
* 1 Punkt: Begründen Sie ihre Entscheidung (Warum ziehen Sie persönlich aus ihrer Ausgangssituation die eine Technologie der anderen vor).
* 2 Punkte: Schicken Sie einen Screenshot der installierten Umgebung mit
* 1 Punkt: Beschreiben Sie Ihre Toolchain, die Sie mit dem Framework nutzen (z.B. IDE)

## Assignment 3: Big Science
Der Cheatsheet auf http://scikit-learn.org/stable/tutorial/machine_learning_map/ ist eine einfache Anleitung, wie man den richtigen Algorithmus zum richtigen Data Science Problem findet.  
Schauen Sie in Google nach und lernen Sie classificatiom, regression, clusting und dimensional reduction unterscheiden. 
Nennen Sie ein Beispiel aus ihrem Umfeld, wo Sie mit dem Algorithmus zu tun haben. Das kann ein Beispiel sein, wie: Wenn Sie bei Amazon einkaufen. Wenn Sie von einem Marketinginstitut angerufen werden, etc.  
