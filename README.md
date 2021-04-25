# Capstone
VIEW :


**HelpMenu : Designed to further teach users about the importance of Cybersecurity, how it applies to their everyday lives, and how they may enter the field or gain more knowledge after this game


**MainMenuManager: Designed to create a main menu containing the help button, a button choosing which scenario to enter, a button to load songs with, and a label containing the reasoning behind CyberTeach


**Scenario1: Designed to create a scenario in which the user must prepare for an intruder. Given a choice of options, the user must decide which ones are best. Discussed are OS hardening, regular updates, firewalls, and port security

**Scenario1Learner: This learner scene is a further application of the original Scenario1, in which the scenario goes over key concepts in networking and the steps that a user can take to protect their network. In addition, it utilizes an IP address finder in which the user can find their own IP address and a subnet mask finder, where the user can see their own subnet address.



**Scenario2: Designed to teach the user about the importance of creating a secure password. The user must decide which passwords would be strongest and also learn that a cyberthreat can easily learn most of their personally identifiable information, including where they live and their family member's names

**Scenario2Learner: Created as a learner scene to expand about Scenario2. This learner scene introduces two of the most popular ways to attack a user's confidentiality, pertaining to their passwords: Brute force attacks and Dictionary attacks. Scenario2Learner introduces these concepts and shows how to mitigate the effectiveness of each attack, by ensuring that the user has a strong password. It does this by containing a password strength checker for the user to verify if their given password is up to par.

**Scenario3: Created to teach users about the importance of securing their data in transit. By having the user acknowledge that the data sent, no matter what it is, should be encrypted and decrypted by only the recipient of the message, this scenario will be successful in creating a sense of urgency for users to keep their data in transit secure. This also introduces the concepts of VPN, Secure Shell, and obfuscation.

**Scenario3Learner: Created to teach users more about Encryption. Gives the user more information about standard encryption protocols, why they're important, and how companies use them. It also contains an encryptor for the user to encrypt their own message.

**Scenario4: Created to teach users about the need to make sure that the data they are sending or receiving has not been corrupted or changed. As such, this scenario introduces the concept of integrity and hashing. By having the user choose between multiple actions to ensure that the data has retained integrity, such as using Digital Certificates and hashing methods, this scenario is successful in teaching users the importance of data integrity.

**Scenario4Learner: Created to expand on the users knowledge gained from Scenario4: Hashing, in which this learner scenario gives more information about how professionals use hashing, and the different methods for it. Additionally, it has an included hasher in which the user can hash their own message and see the hash result.

**Scenario5: Designed to teach the user about Availability, and how some real life scenarios can apply to protecting the availability of systems in CybserSecurity. Additionally, includes more information about what not to do when trying to keep your system available for use.

**Scenario5Learner: Created to teach the user more about Firewalls by having the user interact with an actual Firewall. Gives the user the ability to deny and permit connections according to a given network diagram, along with what services to deny to where.


SRC:
**Main: creates the main method which executes the MainMenuManager. From the MainMenuManager, all of the rest of the scenarios are called.
