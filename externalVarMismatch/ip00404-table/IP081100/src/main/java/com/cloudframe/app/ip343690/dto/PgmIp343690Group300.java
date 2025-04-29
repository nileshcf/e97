package com.cloudframe.app.ip343690.dto;

/**
*  The class PgmIp343690Group300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class PgmIp343690Group300 extends PgmIp343690Group300Serialized { 
   

						@Getter @Setter private char[] pgmIp343690300 = new char[8];
	
	/**
	* Constructor for PgmIp343690Group300
	**/
    public PgmIp343690Group300() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for PgmIp343690Group300. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PgmIp343690Group300(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setPgmIp343690300(("IP343690").toCharArray());
    } 



}
  
