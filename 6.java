Hi I am 6.java

Branching concept:

	TEST -> QUA -> PRD_MASTER -> MASTER


Scenerios:

CASE 1: 
	6.java file -> TEST -> QUA   ->>>> Successfull   

	QUA -> PRD   ->>>>>>> SUCCESSFULL

	PRD -> PRD_MATER    ->>>>>>> successfull




CASE 2:

	6.java filr running in the Production server
	hence changes came
	
	TEST -> QUA -> changes -> TEST -> QUA -> PRD -> MASTER_PRD




CASE 3: 
	6.java filr running in the Production server
        hence changes came

        TEST -> QUA -> changes -> TEST -> QUA -> PRD -> changes -> TEST -> QUA -> PRD ->  MASTER_PRD



