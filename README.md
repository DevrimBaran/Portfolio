# Willkommen zu meinem Portfolio
- Ich habe 2023 mein Softwaretechnik Bachelor Studium an der Universität Stuttgart absolviert. <br />
- Seit 2023 habe ich zum Anschluss meines Absolvierten Softwaretechnik Studiums an der Universität Stuttgart ein Informatik Master Studium angefangen.
- Hier sehen Sie all meine ehemaligen Projekte. <br />

## Projekte
### Messaging Engine für eine IoT Umgebung zur direkten Kommunikation
Dieses Projekt war eine Entwicklung einer Messaging Engine für eine IoT Umgebung zur direkten Kommunikation zwischen den einzelnen Geräten. Mit dieser Entwicklung ist es möglich, dass Geräte ohne einen Zwischenserver direkt Informationen untereinander versenden können. Als Prototyp wurden hier Raspberry Pis benutzt, die Sensoren und auch Aktoren angeschlossen hatten. Die Raspberry Pis können jeweils gegenseitig Sensordaten von anderen Raspberry Pis abfragen, aber auch jeweils gegenseitig Aktuatoren von den Raspberry Pis ansteuern. Dies ist dafür gedacht die Effiziens in Smart Factories sowie Smart Cities zu steigern. Bei Interesse für dieses System und dem dazugehörigen Source Code, finden Sie dieses unter dem Repository https://github.com/DevrimBaran/Messaging-Engine-2.<br />

Das System selbst garantiert eine At-Least-Once Ausführung aller Nachrichten. Auch ist eine Art Recovery implementiert, die im Falle eines Absturzes eines Gerätes die letzte auszuführende Aktion wieder aufnimmt. Zusätzlich ist das System so entwickelt, dass die Geräte im lokalen Netz, die auch eine Instanz dieser Applikation gestartet haben, sich gegenseitig finden können und sich gegenseitig jeweils in die Datenbank eintragen, um miteinander kommunizieren zu können.<br />

In diesem Projekt war ich für die Implementierung der Sensor- sowie Aktuatorschnittstellen zuständig. Diese erlauben ohne größere Änderungen an der Implementierung eine theoretisch unendliche Anzahl an Sensoren und Aktuatoren. Man sollte natürliche die physisch maximale Anzahl des anzuschließenden Gerätes beachten. Auch habe ich eine Konfigurationsdatei erstellt, mit der viele Einstellungen einfach in dieser Datei vorgenommen werden können ohne die Implementierung zu ändern. Diese Datei ist auch wiederverwendbar über mehrere Geräte hinweg. Zu den Einstellungen gehören diverse Netzwerkeinstellungen für die Kommunikation sowie Sensor und AKtuatoreinstellungen.

### Querimonia
Diese Applikation war ein Studienprojekt der Universität in Kooperation mit dem Frauenhofer Institut mit 11 weiteren Teilnehmern. Das Projekt hat 6 Monate in Anspruch genommen. Falls Sie sich die Applikation näher mit dem dazugehörigen Code anschauen wollen, finden Sie diese im Repository Querimonia https://github.com/DevrimBaran/Querimonia. <br />

Querimonia ist eine Webapplikation, die dafür gedacht ist die Arbeit von Support Mitarbeitern zu erleichtern, die für die öffentlichen Busverkehrsunternehmen arbeiten. Die Applikation kann Beschwerden von Kunden einlesen und die nötigen Informationen wie Name, IBAN, Busnummer, Bushaltestation, usw. extrahieren. Auch Sprachnachrichten kann die Applikation zu Text umschreiben. Die Applikation analysiert über die Beschwerde auch die potentielle Gefühslage des schreibers. Die Applikation erkennt auch mittels eines Machine Learning Modells, ob es sich darum handelt ob der Bus zu spät kam, der Bus zu früh abgefahren ist, der Bus nicht gekommen ist, der Busfahrer unfreundlich war oder es sich um sonstige Themen handelt. Mit diesen Informationen erstellt Querimonia automatische Antwortbausteine, die der Mitarbeiter lediglich zusammenfügen und gegebenenfalls noch bearbeiten kann. <br />

In dieser Applikation war ich zuständig dafür das angesprochene Machine Learning Modell mit den dazugehörigen 5 Klassifizierungen zu erstellen. Hierfür haben wir 50.000 Beschwerden der Wuppertaler Stadtwerke bekommen, die wir erst händisch auswerten mussten. Anschließend habe ich mit der python API "scikit-learn" das Modell erstellt. Davor habe ich eine Analyse durchgeführt, ob "Tensorflow" oder "scikit-learn" genauer arbeitet. Da die Genauigkeit für unseren Gebrauch bei "scikit-learn" besser war haben wir uns schlussendlich dafür entschieden. Um dies zu machen musste der Text natürlich auch erst Lemmatisiert werden. Dies war mit "openNLP" möglich. <br />
Unter anderem habe ich eben auch einen Lemmatizer implementiert in die Applikation. Für das Machine Learning Modell und den Lemmatizer habe ich REST Schnittstellen definiert. Neben diesen etwas größeren Aufgaben habe ich noch paar kleinere Sachen im Backend entwickelt und auf Redmine unsere Projektseite struckturiert. Das Backend der Anwendung wurde zum größten Teil mit Java programmiert. Für das Machine Learning Modell wurde Python benötigt.

### Genua Connect
Diese Applikation war ein unbenotetes Softwareprojekt der Universität Stuttgart in Kooperation mit der Firma Genua GmbH mit 2 weiteren Teilnehmern. Falls Sie sich die Applikation näher anschauen wollen mit dem dazugehörigen Code finden Sie diese im Repository GenuaConnect https://github.com/DevrimBaran/GenuaConnect. Hier finden Sie auch eine installierbare APK für Ihr Android gerät. <br />

Genua Connect ist eine Android Applikation, die für das Betriebssystem Android 9 entwickelt wurde. <br />
Mit dieser App kann man sich mit dem Netzwerkprotokoll SNMP mit SNMP fähigen Geräten anmelden. Diesen Geräten kann man SNMP Anfragen schicken und so Informationen über die geräte einsehen. Mit der App kann man sich direkt ins WLAN anmelden, indem man einen QR Code einliest. Mit einem QR Code kann man sich auch mit den SNMP fähigen Geräten anmelden. Das Projekt wurde fast ausschließlich mit Java entwickelt. <br />

Ich habe in diesem Projekt die Aufgabe übernommen das SNMP Protokoll und die Anmeldung über QR Code für WIFI und SNMP zu implementieren. Auch habe ich die Anzeige der Netzwerkinformationen des eigenen Gerätes implementiert.

### DB Projekt
Dies war ein kleines Java einzelprojekt. Das Ziel der App war es, Namen mit Alter im JSON Format einspeichern zu können und die gleichen Daten auch aus einer XML Datei zu lesen. Zusätzlich sollte man die Fakultät von einer beliebigen Zahl auslesen können. <br />
Falls Sie sich die Applikation näher anschauen wollen mit dem dazugehörigen Code finden Sie diese im Ordner DBProjekt.
