package com.cloudframe.app.d5427dt1.dto;

/**
*  The class SysVariables is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class SysVariables extends SysVariablesSerialized { 
   

								@Getter @Setter private int sysCvdaCicsstatus;

								@Getter @Setter private int sysCvdaInitstatus;

						@Getter @Setter private char[] sysDb2conn = Field.fillLowValue(8);
				@Getter @Setter private SysJobname sysJobname = new SysJobname();

						@Getter @Setter private char[] sysMqconn = Field.fillLowValue(8);

								@Getter @Setter private int sysStartupdate;
	
	/**
	* Constructor for SysVariables
	**/
    public SysVariables() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SysVariables. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SysVariables(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSysJobname().setParent(this,getStartOffset() + 16);
    } 

	/**
	 * 	initializes SysVariables
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setSysCvdaCicsstatus(0);
                     setSysCvdaInitstatus(0);
         setSysDb2conn(CONSTANTS.SPACE_8);
          getSysJobname().initialize();
     
         setSysMqconn(CONSTANTS.SPACE_8);
                     setSysStartupdate(0);
   }


}
  
