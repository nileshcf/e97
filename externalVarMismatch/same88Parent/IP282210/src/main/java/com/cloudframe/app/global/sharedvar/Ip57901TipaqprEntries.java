package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip57901TipaqprEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip57901TipaqprEntries extends Ip57901TipaqprEntriesSerialized { 
   

						@Getter @Setter private char[] ip57901JobGroup = Field.fillLowValue(6);

								@Getter @Setter private short ip57901JobGrpNum;

								@Getter @Setter private short ip57901ProcPriorityNum;

						@Getter @Setter private char[] ip57901ServCd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip57901FuncCd = Field.fillLowValue(4);

								@Getter @Setter private short ip57901QueueNum;
	
	/**
	* Constructor for Ip57901TipaqprEntries
	**/
    public Ip57901TipaqprEntries() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip57901TipaqprEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip57901TipaqprEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip57901TipaqprEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp57901JobGroup(CONSTANTS.SPACE_6);
         	setIp57901JobGrpNum((short)0);
         	setIp57901ProcPriorityNum((short)0);
         setIp57901ServCd(CONSTANTS.SPACE_4);
         setIp57901FuncCd(CONSTANTS.SPACE_4);
         	setIp57901QueueNum((short)0);
   }


}
  
