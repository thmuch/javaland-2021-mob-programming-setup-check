# JavaLand 2021 – Remote Mob Programming / Setup-Check

[![de](https://img.shields.io/badge/lang-de-red.svg)](README.md)

At [JavaLand 2021](https://www.javaland.eu/) there will be some online
[community activities](https://www.javaland.eu/de/programm/community-aktivitaeten/).
One of them is a remote mob programming dojo, where some experienced mob programming facilitators
will help you getting started with this programming practice.

If you'd like to attend the mob programming dojo, please make sure you read and follow the
instructions below to check your local setup well in advance *before the event.* Thank you!

Wednesday, March 17, room "HiLow"
- 16:30 moderators (facilitators) will be in the room; we can address setup problems there
- 17:00 mob programming sessions start; *no more setup*
- 19:00 finish of JavaLand 2021 mob programming dojos

You'll receive an e-mail from JavaLand on how to access the virtual room.

We'll have 20-24 seats in up to 4 mob teams, so better be quick – first come, first served.

Note: While these setup instructions are in English, the dojos will be held in German
(unless there is enough request for an English session).


## Software

You'll need

- 'mob' tool from https://mob.sh
- JDK 11, e.g. from https://adoptopenjdk.net/
- an IDE of your choice (IntelliJ IDEA is recommended)


## Hardware

During the remote mob programming session the small teams will work with their cameras and microphones
switched *on*. So please make sure you're using a suitable
- web cam
- microphone & speakers *or* headset


## Check that everything works on your machine

1. Run `mob --version` on your console. It should output `v1.3.0` (or newer).
2. Run `mob moo` on your console. You should hear a 'moo' sound.
3. Check out this git repository on your machine.
4. Run `./mvnw test` in the checked out git repository. The one and only test should be green.
5. Import the project in your IDE and run the tests.

That's it, you're prepared for the mob programming dojo at JavaLand 2021! At the beginning of your
mob session your moderator will give you access to the actual repository being used (i.e. the
repository where the `mob` tool can push your changes).

Oh, one more thing (two things, actually ;-):
- You will need a [GitHub](https://github.com/) account as our common repository will be hosted there.
  If you haven't one so far, please sign up at GitHub *well before* the mob programming dojo.
- Please make sure you have access to the e-mail account linked to your GitHub account. At the beginning
  of the mob session you will receive an e-mail from GitHub asking you to become a collaborator on our
  common repository.


## Further information

- https://www.remotemobprogramming.org/
- https://effectivehomeoffice.com/
- [(Remote) Mob Programming – Building Teams and Keeping Teams Together](https://www.youtube.com/watch?v=CeWmy1Nd8L4&t=338s) (video from Java User Group Switzerland)
