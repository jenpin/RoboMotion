##Control Your robot  is a simple java application that will help you track your robot
ad move it on a

##PRE-REQUISITE
- java8
- GRADLE

##Compile & Run SPOT THE FRAUD
You can import the gradle project into your IDE to analyse the code.

#To compile
./gradlew clean build

#Run
./gradlew run -Pmyargs='/Users/jpinto/CreditCardNote/src/main/resources/smallerInputFile,05-12-107,100'

where args1 =fileName holding the transactions
args2 = date to filter the transaction
args3 = threshold amount
Any transaction exceeding the threshold will show up on the console.

The output will be displayed on the console as well a file "src/main/resources/DefaultersList" gets created.
This will hold only the fraud CC nbrs.

##Note
- The arguments are comma separated.
- The expected input style for date is dd-MM-yyyy
- The expected amount is a decimal nbr.It works for negative amounts as well.

##Design
- For scalability, a fileprocessor interface has been created.
- Based on the file extension, the appropriate fileprocessor will be selected.
- THIS HAS BEEN SET TO DEFAULT -> CSVFILEPROCESSOR.
- The behavioural pattern applied is that of Chain Of Responsibility.
- This is so that incase any new rule has to be introduced later, it can be done by
including a single java class and rule in ViolationController.

