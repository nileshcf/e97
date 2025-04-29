package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip3oo8o1EditsPerfEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip3oo8o1EditsPerfEntry extends Ip3oo8o1EditsPerfEntrySerialized { 
   
      private List<char[]> ip3oo8o1EditPerformedInd; 

	
	/**
	* Constructor for Ip3oo8o1EditsPerfEntry
	**/
    public Ip3oo8o1EditsPerfEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip3oo8o1EditsPerfEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip3oo8o1EditsPerfEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip3oo8o1EditsPerfEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < IP_3OO_8O_1_EDIT_PERFORMED_IND_SIZE;index++) {
             setIp3oo8o1EditPerformedInd(index, CONSTANTS.SPACE);
         }
   }


}
  
