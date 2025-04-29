package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014Db2Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip02014Db2Table extends Ip02014Db2TableSerialized { 
   

						@Getter @Setter private char[] ip02014ApplSysId = Field.fillLowValue(3);

						@Getter @Setter private char[] ip02014PPkgSetNam = Field.fillLowValue(18);

						@Getter @Setter private char[] ip02014PSrvrNam = Field.fillLowValue(18);

						@Getter @Setter private char[] ip02014BPkgSetNam = Field.fillLowValue(18);

						@Getter @Setter private char[] ip02014BSrvrNam = Field.fillLowValue(18);
	
	/**
	* Constructor for Ip02014Db2Table
	**/
    public Ip02014Db2Table() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02014Db2Table. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014Db2Table(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip02014Db2Table
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014ApplSysId(CONSTANTS.SPACE_3);
         setIp02014PPkgSetNam(CONSTANTS.SPACE_18);
         setIp02014PSrvrNam(CONSTANTS.SPACE_18);
         setIp02014BPkgSetNam(CONSTANTS.SPACE_18);
         setIp02014BSrvrNam(CONSTANTS.SPACE_18);
   }


}
  
