# Willkommen zu meinem Portfolio
- Ich studiere seit 2017 Softwaretechnik an der Universität Stuttgart. <br />
- Hier sehen Sie all meine ehemaligen Projekte. <br />
- Bis jetzt habe ich zwei Android Apps und eine Webapplikation entwickelt.

## Aktuelle Projekte
### Entwicklung einer Messaging Engine für eine IoT Umgebung zur direkten Kommunikation zwischen den Geräten
Mein aktuelles Projekt ist es eine Masseging Engine für eine IoT Umgebung zu entwickeln. Mit dieser Engine sollen die IoT Geräte direkt miteinander kommunizieren können, ohne erst mit dem Server zu kommunizieren. Dies ist dafür gedacht die Effiziens in Smart Factories sowie Smart Cities zu steigern. Da das Projekt noch nicht fertig ist, ist es noch nicht auf meinem Portfolio zu finden. Das Projekt wird vermutlicht erst in 6 Monaten fertig.

## Fertige Projekte
### Querimonia
Diese Applikation war ein Studienprojekt der Universität in Kooperation mit dem Frauenhofer Institut mit 11 weiteren Teilnehmern. Das Projekt hat 6 Monate in Anspruch genommen Meine persönliche Note für die Applikation ist 2.0. Falls Sie sich die Applikation näher mit dem dazugehörigen Code anschauen wollen, finden Sie diese ab mitte Januar im Ordner Querimonia. <br />

Querimonia ist eine Webapplikation, die dafür gedacht ist die Arbeit von Support Mitarbeitern zu erleichtern, die für die öffentlichen Busverkehrsunternehmen arbeiten. Die Applikation kann Beschwerden von Kunden einlesen und die nötigen Informationen wie Name, IBAN, Busnummer, Bushaltestation, usw. extrahieren. Auch Sprachnachrichten kann die Applikation zu Text umschreiben. Die Applikation analysiert über die Beschwerde auch die potentielle Gefühslage des schreibers. Die Applikation erkennt auch mittels eines Machine Learning Modells, ob es sich darum handelt ob der Bus zu spät kam, der Bus zu früh abgefahren ist, der Bus nicht gekommen ist, der Busfahrer unfreundlich war oder es sich um sonstige Themen handelt. Mit diesen Informationen erstellt Querimonia automatische Antwortbausteine, die der Mitarbeiter lediglich zusammenfügen und gegebenenfalls noch bearbeiten kann. <br />

In dieser Applikation war ich zuständig dafür das angesprochene Machine Learning Modell mit den dazugehörigen 5 Klassifizierungen zu erstellen. Hierfür haben wir 50.000 Beschwerden der Wuppertaler Stadtwerke bekommen, die wir erst händisch auswerten mussten. Anschließend habe ich mit der python API "scikit-learn" das Modell erstellt. Davor habe ich eine Analyse durchgeführt, ob "Tensorflow" oder "scikit-learn" genauer arbeitet. Da die Genauigkeit für unseren Gebrauch bei "scikit-learn" besser war haben wir uns schlussendlich dafür entschieden. Um dies zu machen musste der Text natürlich auch erst Lemmatisiert werden. Dies war mit "openNLP" möglich. <br />
Unter anderem habe ich eben auch einen Lemmatizer implementiert in die Applikation. Für das Machine Learning Modell und den Lemmatizer habe ich REST Schnittstellen definiert. Neben diesen etwas größeren Aufgaben habe ich noch paar kleinere Sachen im Backend entwickelt und auf Redmine unsere Projektseite struckturiert. Das Backend der Anwendung wurde zum größten Teil mit Java programmiert. Für das Machine Learning Modell wurde Python benötigt.

### Genua Connect
Diese Applikation war ein unbenotetes Softwareprojekt der Universität Stuttgart in Kooperation mit der Firma Genua GmbH mit 2 weiteren Teilnehmern. Falls Sie sich die Applikation näher anschauen wollen mit dem dazugehörigen Code finden Sie diese im Ordner GenuaConnect. Hier finden Sie auch eine installierbare APK für Ihr Android gerät. <br />

Genua Connect ist eine Android Applikation, die für das Betriebssystem Android 9 entwickelt wurde. <br />
Mit dieser App kann man sich mit dem Netzwerkprotokoll SNMP mit SNMP fähigen Geräten anmelden. Diesen Geräten kann man SNMP Anfragen schicken und so Informationen über die geräte einsehen. Mit der App kann man sich direkt ins WLAN anmelden, indem man einen QR Code einliest. Mit einem QR Code kann man sich auch mit den SNMP fähigen Geräten anmelden. Das Projekt wurde fast ausschließlich mit Java entwickelt. <br />

Ich habe in diesem Projekt die Aufgabe übernommen das SNMP Protokoll und die Anmeldung über QR Code für WIFI und SNMP zu implementieren. Auch habe ich die Anzeige der Netzwerkinformationen des eigenen Gerätes implementiert.

### DB Projekt
Dies war ein kleines Java einzelprojekt. Das Ziel der App war es, Namen mit Alter im JSON Format einspeichern zu können und die gleichen Daten auch aus einer XML Datei zu lesen. Zusätzlich sollte man die Fakultät von einer beliebigen Zahl auslesen können. <br />
Falls Sie sich die Applikation näher anschauen wollen mit dem dazugehörigen Code finden Sie diese im Ordner DBProjekt. Meine Note für diese Applikation beträgt 1.0.
