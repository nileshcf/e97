package org.optum.uhg.dto.o529351u;

/**
*  The class CetCicsErrorTableRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:06. using version 5.0.0.158
**/


import org.optum.uhg.dto.serialize.o529351u.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CetCicsErrorTableRedefined extends CetCicsErrorTableRedefinedSerialized { 
   

	
	/**
	* Constructor for CetCicsErrorTableRedefined
	**/
    public CetCicsErrorTableRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CetCicsErrorTableRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CetCicsErrorTableRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    


	
	
	

		public static int getCetCicsErrorTableRedefinedFieldLength() {
			return CET_CICS_ERROR_TABLE_REDEFINED_LENGTH;
		}

}
  
