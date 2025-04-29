package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamAllocParms850 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DynamAllocParms850 extends DynamAllocParms850Serialized { 
   


						@Getter @Setter private char[] dynamDd850 = new char[8];


						@Getter @Setter private char[] dynamDsn850 = new char[44];

						@Getter @Setter private char[] dynamExtTyp850 = new char[5];

						@Getter @Setter private char[] dynamExtId850 = new char[8];

							@Getter @Setter private char[] dynamWorkAreas850ConditionGroup3 = new char[16];
						



						@Getter @Setter private char[] dynamDcType850 = new char[7];


						@Getter @Setter private char[] dynamRecfm850 = new char[3];


								@Getter @Setter private long dynamLrecl850;


								@Getter @Setter private long dynamBlksz850;
				@Getter @Setter private DynamAtype850 dynamAtype850 = new DynamAtype850();


								@Getter @Setter private long dynamSpcPri850;


								@Getter @Setter private long dynamSpcSec850;

	
	/**
	* Constructor for DynamAllocParms850
	**/
    public DynamAllocParms850() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DynamAllocParms850. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DynamAllocParms850(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getDynamAtype850().setParent(this,getStartOffset() + 164);
       replaceValue( // serialize and save the value
             ("DD=").toCharArray()
             , getStartOffset() + 0
             ,3
             );
								setDynamDd850(fillSpace(8));
       replaceValue( // serialize and save the value
             (" DSN=").toCharArray()
             , getStartOffset() + 11
             ,5
             );
								setDynamDsn850(fillSpace(44));
								setDynamExtTyp850(fillSpace(5));
								setDynamExtId850(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(16)
             , getStartOffset() + 73
             ,16
             );
       replaceValue( // serialize and save the value
             (" CDELETE").toCharArray()
             , getStartOffset() + 89
             ,8
             );
       replaceValue( // serialize and save the value
             (" TYPE=").toCharArray()
             , getStartOffset() + 97
             ,6
             );
								setDynamDcType850(fillSpace(7));
       replaceValue( // serialize and save the value
             (" UNIT=DISK RECFM=").toCharArray()
             , getStartOffset() + 110
             ,17
             );
								setDynamRecfm850(fillSpace(3));
       replaceValue( // serialize and save the value
             (" LRECL=").toCharArray()
             , getStartOffset() + 130
             ,7
             );
								setDynamLrecl850(0L);
       replaceValue( // serialize and save the value
             (" BLKSIZE=").toCharArray()
             , getStartOffset() + 146
             ,9
             );
								setDynamBlksz850(0L);
							getDynamAtype850().setString(fillSpace(16));
       replaceValue( // serialize and save the value
             (" PRIMARY=").toCharArray()
             , getStartOffset() + 180
             ,9
             );
								setDynamSpcPri850(0L);
       replaceValue( // serialize and save the value
             (" SECONDARY=").toCharArray()
             , getStartOffset() + 198
             ,11
             );
								setDynamSpcSec850(0L);
       replaceValue( // serialize and save the value
             (" RLSE;").toCharArray()
             , getStartOffset() + 218
             ,6
             );
    } 



}
  
