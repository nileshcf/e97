package com.cloudframe.app.ar640010.dto;

/**
*  The class MciseqioRequestCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MciseqioRequestCodes extends MciseqioRequestCodesSerialized { 
   

								@Getter @Setter private short mciseqioOpenIanyTtcd;

								@Getter @Setter private short mciseqioOpenIoneTtcd;

								@Getter @Setter private short mciseqioOpenOutput;

								@Getter @Setter private short mciseqioClose;

								@Getter @Setter private short mciseqioGetNext;

								@Getter @Setter private short mciseqioPutNext;

								@Getter @Setter private short mciseqioOpenInotTtcd;

								@Getter @Setter private short mciseqioForceEof;
	
	/**
	* Constructor for MciseqioRequestCodes
	**/
    public MciseqioRequestCodes() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MciseqioRequestCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciseqioRequestCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setMciseqioOpenIanyTtcd((short)0);
								setMciseqioOpenIoneTtcd((short)1);
								setMciseqioOpenOutput((short)2);
								setMciseqioClose((short)3);
								setMciseqioGetNext((short)4);
								setMciseqioPutNext((short)5);
								setMciseqioOpenInotTtcd((short)6);
								setMciseqioForceEof((short)7);
    } 



}
  
