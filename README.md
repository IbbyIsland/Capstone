# Capstone
VIEW :


**HelpMenu : Designed to further teach users about the importance of Cybersecurity, how it applies to their everyday lives, and how they may enter the field or gain more knowledge after this game


**MainMenuManager: Designed to create a main menu containing the help button, a button choosing which scenario to enter, a button to load songs with, and a label containing the reasoning behind CyberTeach


**Scenario1: Designed to create a scenario in which the user must prepare for an intruder. Given a choice of options, the user must decide which ones are best. Discussed are OS hardening, regular updates, firewalls, and port security

**Scenario1Learner: This learner scene is a further application of the original Scenario1, in which the scenario goes over key concepts in networking and the steps that a user can take to protect their network. In addition, it utilizes an IP address finder in which the user can find their own IP address and a subnet mask finder, where the user can see their own subnet address.



**Scenario2: Designed to teach the user about the importance of creating a secure password. The user must decide which passwords would be strongest and also learn that a cyberthreat can easily learn most of their personally identifiable information, including where they live and their family member's names

**Scenario2Learner: Created as a learner scene to expand about Scenario2. This learner scene introduces two of the most popular ways to attack a user's confidentiality, pertaining to their passwords: Brute force attacks and Dictionary attacks. Scenario2Learner introduces these concepts and shows how to mitigate the effectiveness of each attack, by ensuring that the user has a strong password. It does this by containing a password strength checker for the user to verify if their given password is up to par.

**Scenario3: Created to teach users about the importance of securing their data in transit. By having the user acknowledge that the data sent, no matter what it is, should be encrypted and decrypted by only the recipient of the message, this scenario will be successful in creating a sense of urgency for users to keep their data in transit secure. This also introduces the concepts of VPN, Secure Shell, and obfuscation.

**Scenario4: Created to teach users about the need to make sure that the data they are sending or receiving has not been corrupted or changed. As such, this scenario introduces the concept of integrity and hashing. By having the user choose between multiple actions to ensure that the data has retained integrity, such as using Digital Certificates and hashing methods, this scenario is successful in teaching users the importance of data integrity.


SRC:
**Main: creates the main method which executes the MainMenuManager. From the MainMenuManager, all of the rest of the scenarios are called.
