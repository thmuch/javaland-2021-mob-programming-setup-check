# JavaLand 2021 – Remote Mob Programming / Setup-Check

[![de](https://img.shields.io/badge/lang-de-red.svg)](README.md)
[![en](https://img.shields.io/badge/lang-en-green.svg)](README.en.md)

Beim [JavaLand 2021](https://www.javaland.eu/) wird es diverse
Online-[Community-Aktivitäten](https://www.javaland.eu/de/programm/community-aktivitaeten/) geben.
Eine davon ist ein Remote-Mob-Programming-Dojo, bei dem Dir erfahrene Mob-Programming-Moderatoren
helfen, diese Programmierpraktik kennenzulernen.

Wenn Du beim Mob-Programming-Dojo mitmachen möchtest, lies Dir bitte die folgenden Hinweise durch
und prüfe Deine lokale Konfiguration wie unten beschrieben – beides bitte rechtzeitig *vor* dem
Dojo. Danke :-)

Mittwoch, 17. März, Raum "HiLow"
- 16:30 – Die Moderatoren werden im Raum sein und wir können eventuelle Setup-Probleme klären.
- 17:00 – Das Mob-Programming-Dojo beginnt (Dein Setup muss davor funktionsfähig sein).
- 19:00 – Ende des Mob-Programming-Dojos.

Wenn Du zum JavaLand angemeldet bist, erhältst Du vom Veranstalter eine E-Mail, wie Du den virtuellen
Raum betreten kannst.

Wir können 20-24 Plätze für bis zu 4 Mob-Teams vergeben. Also schnell sein – wer zuerst kommt, gewinnt.


## Software

Du brauchst

- das "mob" Kommandozeilen-Tool von https://mob.sh
- JDK 11, z.B. von https://adoptopenjdk.net/
- eine IDE Deiner Wahl (wir empfehlen IntelliJ IDEA)


## Hardware

Bei den Remote-Mob-Programming-Dojos werden die kleinen Teams mit eingeschalteter Kamera und Mikrofon
arbeiten. Prüfe daher bitte vor dem Dojo, ob Du geeignete Geräte angeschlossen hast:
- Webcam
- Mikrofon & Lautsprecher (ohne Hall und Störgeräusche) *oder* ein Headset


## Probiere bitte aus, dass auf Deinem Rechner alles funktioniert

1. Rufe `mob --version` in Deiner Konsole auf. Es sollte `v1.3.0` (oder neuer) ausgeben.
2. Rufe `mob moo` in Deiner Konsole auf. Du solltest ein "Muh"-Geräusch hören.
3. Checke dieses Git-Repository auf Deinem Rechner aus.
4. Rufe `./mvnw test` im ausgecheckten Git-Repository auf. Der einzige Test sollte grün sein.
5. Importiere das Projekt in Deine IDE und lass die Tests laufen.

Das war es auch schon – Du bist vorbereitet, um am Mob-Programming-Dojo beim JavaLand 2021
teilzunehmen! Am Anfang des Dojos wird Dir Dein Moderator Zugriff auf das tatsächlich verwendete
Git-Repository geben, also auf das Repository, in das das `mob`-Tool Deine Änderungen pushen kann.

Eine Sache noch (oder eher zwei ;-):
- Du brauchst einen Account bei [GitHub](https://github.com/), weil auch das beim Dojo verwendete
  Repository dort gehostet ist. Wenn Du noch keinen Account hast, melde Dich bitte bei GitHub
  *rechtzeitig vor* dem Mob-Programming-Dojo an.
- Stell bitte sicher, dass Du Zugriff auf das E-Mail-Konto hast, das mit Deinem GitHub-Account
  verknüpft ist. Am Anfang des Mob-Dojos wirst Du eine E-Mail von GitHub bekommen, in der Du
  bestätigen musst, dass Du schreibenden Zugriff auf unser gemeinsames Dojo-Repository haben willst.


## Weitere Informationen

- https://www.remotemobprogramming.org/
- https://effectivehomeoffice.com/
- [Mob-Programming. Zusammen lernen. Zusammen liefern!](https://www.youtube.com/watch?v=WNz8txII7Wo) (Video von der W-JAX 2019)
