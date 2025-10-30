# Willkommen zu meinem Portfolio / Welcome to my Portfolio

---

## 🇩🇪 Deutsche Version / German Version

- Ich habe 2023 mein Softwaretechnik Bachelor Studium an der Universität Stuttgart absolviert und dieses Jahr meinen Informatik Master absolviert. <br />
- Hier sehen Sie alle meine ehemaligen Projekte. <br />

### Projekte

#### Implementierung von verschiedenen Wait-Free Synchronisierungsverfahren für Interprozesskommunikation via Shared Memory für Echtzeitsysteme mittels Rust
Für meine Masterarbeit habe ich verschiedene Wait-Free Algorithmen für Interprozesskommunikation via Shared Memory implementiert und verglichen. Dafür habe ich verschiedene Benchmarks mit dem Rust Paket Criterion geschrieben, um die Performance von MPMC (Multiple Producer Multiple Consumer), SPMC (Single Producer Multiple Consumer), MPSC (Multiple Producer Single Consumer) und SPSC (Single Producer Single Consumer) Algorithmen vergleichen zu können. Um die Performance zu vergleichen, habe ich Python Skripte geschrieben, die ein Violin Plot erstellen, um die Geschwindigkeiten bei einer festgelegten Anzahl von zu produzierenden und konsumierenden Daten zu vergleichen und für MPMC, SPMC und MPSC Algorithmen noch zusätzlich ein Liniendiagramm, um unterschiedliche Performance bei steigender Prozessanzahl sehen zu können. Das Projekt befindet sich im Repository https://github.com/DevrimBaran/MA.git.

#### Verteiltes Kommunikationssystem mit reliable totally ordered UDP Multicast Nachrichten
Dieses Projekt ist durch ein universitäres Gruppenprojekt entstanden. Das entstandene Projekt ist ein Auktionssystem, welches zur Kommunikation zwischen den Bietern und Auktionären einen reliable totally ordered UDP Multicast nutzt. Das Programm ist ein Kommandozeilenprogramm, da der Fokus in diesem Projekt auf der Funktionalität des reliable totally ordered UDP Multicasts liegt. Um diese Funktionalität zu gewährleisten, haben wir den "ISIS Algorithm for total ordering" implementiert. Desweiteren unterstützt das System auch eine Heartbeat Funktion, damit im Falle des Absturzes eines Teilnehmers des Systems entsprechende Maßnahmen ergriffen werden können. Das Projekt ist im Repository https://github.com/confusedSerge/distributed-systems-project zu finden. <br /> 

#### Messaging Engine für eine IoT Umgebung zur direkten Kommunikation
Dieses Projekt war eine Entwicklung einer Messaging Engine für eine IoT-Umgebung zur direkten Kommunikation zwischen mehreren unabhängig voneinander laufenden Geräten. Mit dieser Entwicklung ist es möglich, dass Geräte ohne einen Zwischenserver direkt Informationen untereinander versenden können. Als Prototyp wurden hier Raspberry Pis benutzt, die Sensoren und auch Aktoren angeschlossen hatten. Die Raspberry Pis können jeweils gegenseitig Sensordaten von anderen Raspberry Pis abfragen, aber auch jeweils gegenseitig Aktuatoren von den Raspberry Pis ansteuern. Dies ist dafür gedacht, die Effizienz in Smart Factories sowie Smart Cities zu steigern. Bei Interesse für dieses System und dem dazugehörigen Source Code ist dieses unter dem Repository https://github.com/DevrimBaran/Messaging-Engine-2 zu finden.<br />

Das System selbst garantiert eine At-Least-Once Ausführung aller Nachrichten. Zusätzlich ist eine Recovery Funktion implementiert, die im Falle des Absturzes eines Gerätes die letzte auszuführende Aktion wieder aufnimmt. Außerdem ist das System so entwickelt, dass die Geräte im lokalen Netz, die auch eine Instanz dieser Applikation gestartet haben, sich gegenseitig finden können und sich gegenseitig jeweils in die Datenbank eintragen, um miteinander kommunizieren zu können.<br />

In diesem Projekt war ich für die Implementierung der Sensor- sowie Aktuatorschnittstellen zuständig. Diese erlauben ohne größere Änderungen an der Implementierung eine theoretisch unendliche Anzahl an Sensoren und Aktuatoren. Die physisch maximale Anzahl der anzuschließenden Geräte sollte beachtet werden. Zudem habe ich eine Konfigurationsdatei erstellt, mit der viele Einstellungen vorgenommen werden können, ohne die Implementierung zu ändern. Diese Datei ist wiederverwendbar über mehrere Geräte hinweg. Zu den Einstellungen gehören diverse Netzwerkeinstellungen für die Kommunikation sowie Sensor- und Aktuatoreinstellungen.

#### Querimonia
Diese Applikation war ein Studienprojekt der Universität in Kooperation mit dem Fraunhofer Institut mit 11 weiteren Teilnehmern. Das Projekt hat 6 Monate in Anspruch genommen. Die Applikation ist mit dem Source Code im Repository Querimonia https://github.com/DevrimBaran/Querimonia. <br />

Querimonia ist eine Webapplikation, die dafür gedacht ist, die Arbeit von Support Mitarbeitern zu erleichtern, die für öffentliche Busverkehrsunternehmen arbeiten. Die Applikation kann Beschwerden von Kunden einlesen und die nötigen Informationen wie Name, IBAN, Busnummer, Bushaltestelle, usw. extrahieren. Auch Sprachnachrichten kann die Applikation zu Text umschreiben. Die Applikation analysiert über die Beschwerde auch die potentielle Gefühlslage des Schreibers. Die Applikation erkennt ergänzend mittels eines Machine-Learning Modells, ob es sich darum handelt, ob der Bus zu spät kam, der Bus zu früh abgefahren ist, der Bus nicht gekommen ist, der Busfahrer unfreundlich war oder ob es sich um sonstige Themen handelt. Mit diesen Informationen erstellt Querimonia automatische Antwortbausteine, die der Mitarbeiter lediglich zusammenfügen und gegebenenfalls noch bearbeiten kann. <br />

In dieser Applikation war ich zuständig dafür, das angesprochene Machine-Learning Modell mit den dazugehörigen 5 Klassifizierungen zu erstellen. Hierfür haben wir 50.000 Beschwerden der Wuppertaler Stadtwerke bekommen, die wir erst händisch in 5 Klassen klassifizieren mussten. Anschließend habe ich mit der Python-API "scikit-learn" das Modell erstellt. Davor habe ich eine Analyse durchgeführt, ob "Tensorflow" oder "scikit-learn" genauer arbeitet. Da die Genauigkeit für unseren Gebrauch bei "scikit-learn" besser war, haben wir uns schlussendlich dafür entschieden. Um dies zu machen, musste der Text erst lemmatisiert werden. Dies war mit "openNLP" möglich. <br />
Unter anderem habe ich den Lemmatizer in die Applikation implementiert. Für das Machine Learning Modell und den Lemmatizer habe ich REST Schnittstellen definiert. Neben diesen Aufgabenbereichen habe ich kleinere Sachen im Backend entwickelt und auf Redmine die Projektseite strukturiert. Das Backend der Anwendung wurde zum größten Teil mit Java programmiert. Für das Machine Learning Modell wurde Python benötigt.

#### Genua Connect
Diese Applikation war ein Softwareprojekt der Universität Stuttgart in Kooperation mit der Firma Genua GmbH mit 2 weiteren Teilnehmern. Die Applikation mit dem dazugehörigen Code und installierbarer APK für Android ist im Repository GenuaConnect https://github.com/DevrimBaran/GenuaConnect aufzufinden. <br />

Genua Connect ist eine Android Applikation, die für das Betriebssystem Android 9 entwickelt wurde. <br />
Mit dieser App kann man sich mit dem Netzwerkprotokoll SNMP mit SNMP fähigen Geräten verbinden. Diesen Geräten kann man SNMP Anfragen schicken und so Informationen über die Geräte einsehen. Mit der App kann man sich direkt ins WLAN anmelden, indem man einen QR Code einliest. Mit einem QR Code kann man sich auch mit den SNMP fähigen Geräten anmelden. Das Projekt wurde fast ausschließlich mit Java entwickelt. <br />

Ich habe in diesem Projekt die Aufgabe übernommen, das SNMP Protokoll und die Anmeldung über QR Code für WIFI und SNMP zu implementieren. Auch habe ich die Anzeige der Netzwerkinformationen des eigenen Gerätes implementiert.

#### DB Projekt
Dies war ein kleines Java Einzelprojekt. Das Ziel der App war es, Namen mit Alter im JSON Format einspeichern zu können und die gleichen Daten auch aus einer XML Datei zu lesen. Zusätzlich sollte man die Fakultät von einer beliebigen Zahl auslesen können. <br />
Die Applikation befindet sich im Ordner DBProjekt.

---

## 🇬🇧 English Version / Englische Version

- I completed my Bachelor's degree in Software Engineering at the University of Stuttgart in 2023 and finished my Master's degree in Computer Science this year. <br />
- Here you can see all of my former projects. <br />

### Projects

#### Implementation of Various Wait-Free Synchronization Methods for Inter-Process Communication via Shared Memory for Real-Time Systems using Rust
For my Master's thesis, I implemented and compared various wait-free algorithms for inter-process communication via shared memory. To do this, I wrote various benchmarks using the Rust package Criterion to compare the performance of MPMC (Multiple Producer Multiple Consumer), SPMC (Single Producer Multiple Consumer), MPSC (Multiple Producer Single Consumer), and SPSC (Single Producer Single Consumer) algorithms. To compare performance, I wrote Python scripts that create violin plots to compare speeds with a fixed number of data to be produced and consumed, and additionally for MPMC, SPMC, and MPSC algorithms, a line chart to visualize different performance with increasing process numbers. The project can be found in the repository https://github.com/DevrimBaran/MA.git.

#### Distributed Communication System with Reliable Totally Ordered UDP Multicast Messages
This project emerged from a university group project. The resulting project is an auction system that uses reliable totally ordered UDP multicast for communication between bidders and auctioneers. The program is a command-line program, as the focus of this project is on the functionality of the reliable totally ordered UDP multicast. To ensure this functionality, we implemented the "ISIS Algorithm for total ordering." Furthermore, the system also supports a heartbeat function so that appropriate measures can be taken in case of a system participant's crash. The project can be found in the repository https://github.com/confusedSerge/distributed-systems-project. <br />

#### Messaging Engine for an IoT Environment for Direct Communication
This project involved developing a messaging engine for an IoT environment for direct communication between multiple independently running devices. With this development, it is possible for devices to send information directly to each other without an intermediate server. Raspberry Pis were used as prototypes here, with sensors and actuators connected to them. The Raspberry Pis can mutually query sensor data from other Raspberry Pis and also mutually control actuators on the Raspberry Pis. This is intended to increase efficiency in smart factories and smart cities. If you are interested in this system and the associated source code, it can be found in the repository https://github.com/DevrimBaran/Messaging-Engine-2.<br />

The system itself guarantees at-least-once execution of all messages. Additionally, a recovery function is implemented that resumes the last action to be executed in case of a device crash. Furthermore, the system is developed so that devices in the local network that have also started an instance of this application can find each other and enter each other into the database to communicate with one another.<br />

In this project, I was responsible for implementing the sensor and actuator interfaces. These allow for a theoretically unlimited number of sensors and actuators without major changes to the implementation. The physically maximum number of devices to be connected should be considered. Additionally, I created a configuration file with which many settings can be made without changing the implementation. This file is reusable across multiple devices. The settings include various network settings for communication as well as sensor and actuator settings.

#### Querimonia
This application was a university study project in cooperation with the Fraunhofer Institute with 11 other participants. The project took 6 months. The application with its source code can be found in the repository Querimonia https://github.com/DevrimBaran/Querimonia. <br />

Querimonia is a web application designed to facilitate the work of support staff working for public bus transportation companies. The application can read customer complaints and extract necessary information such as name, IBAN, bus number, bus stop, etc. The application can also transcribe voice messages to text. The application analyzes the potential emotional state of the writer through the complaint. Additionally, the application recognizes using a machine learning model whether the issue is about the bus being late, the bus leaving early, the bus not arriving, the bus driver being unfriendly, or other topics. With this information, Querimonia creates automatic response templates that the employee only needs to combine and possibly edit. <br />

In this application, I was responsible for creating the aforementioned machine learning model with the associated 5 classifications. For this, we received 50,000 complaints from Wuppertal City Services, which we first had to manually classify into 5 classes. Then I created the model using the Python API "scikit-learn." Before that, I conducted an analysis to determine whether "Tensorflow" or "scikit-learn" works more accurately. Since the accuracy for our use was better with "scikit-learn," we ultimately decided on it. To do this, the text first had to be lemmatized, which was possible with "openNLP." <br />
Among other things, I implemented the lemmatizer into the application. For the machine learning model and the lemmatizer, I defined REST interfaces. Besides these areas of responsibility, I developed smaller things in the backend and structured the project page on Redmine. The backend of the application was mostly programmed with Java. Python was required for the machine learning model.

#### Genua Connect
This application was a software project at the University of Stuttgart in cooperation with Genua GmbH with 2 other participants. The application with the associated code and installable APK for Android can be found in the repository GenuaConnect https://github.com/DevrimBaran/GenuaConnect. <br />

Genua Connect is an Android application that was developed for the Android 9 operating system. <br />
With this app, you can connect to SNMP-capable devices using the SNMP network protocol. You can send SNMP requests to these devices and view information about the devices. With the app, you can log directly into WiFi by scanning a QR code. You can also connect to SNMP-capable devices using a QR code. The project was developed almost exclusively with Java. <br />

In this project, I took on the task of implementing the SNMP protocol and login via QR code for WiFi and SNMP. I also implemented the display of network information for the device itself.

#### DB Project
This was a small individual Java project. The goal of the app was to be able to save names with ages in JSON format and also read the same data from an XML file. Additionally, you should be able to read the factorial of any number. <br />
The application is located in the DBProjekt folder.
