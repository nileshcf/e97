package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02015Db2Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip02015Db2Table extends Ip02015Db2TableSerialized { 
   

						@Getter @Setter private char[] ip02015ApplSysId = Field.fillLowValue(3);

						@Getter @Setter private char[] ip02015PkgSetNam = Field.fillLowValue(18);

						@Getter @Setter private char[] ip02015SrvrNam = Field.fillLowValue(18);
	
	/**
	* Constructor for Ip02015Db2Table
	**/
    public Ip02015Db2Table() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02015Db2Table. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02015Db2Table(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip02015Db2Table
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02015ApplSysId(CONSTANTS.SPACE_3);
         setIp02015PkgSetNam(CONSTANTS.SPACE_18);
         setIp02015SrvrNam(CONSTANTS.SPACE_18);
   }


}
  
