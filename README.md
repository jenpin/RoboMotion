##Control Your robot  is a simple java application that will help you track your robot
and move it on a

##PRE-REQUISITE
- java8
- GRADLE

##Compile & Run SPOT THE FRAUD
You can import the gradle project into your IDE to analyse the code.

#To compile
./gradlew clean build

#Run
./gradlew run -Pmyargs='src/main/resources/defaultInputFile'

where args1 =fileName holding the commands

 Command REPORT will show up the robot position on the console.


##Design
- For scalability, a fileprocessor interface has been created.
- Based on the file extension, the appropriate fileprocessor will be selected.
- THIS HAS BEEN SET TO DEFAULT -> CSVFILEPROCESSOR.
- The object creational pattern applied is that of Factory Pattern
- This is so that incase any new command has to be introduced later, it can be done by
including a single java class.

