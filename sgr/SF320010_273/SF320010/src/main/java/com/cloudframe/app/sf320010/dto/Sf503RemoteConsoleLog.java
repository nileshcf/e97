package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503RemoteConsoleLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf503RemoteConsoleLog extends Sf503RemoteConsoleLogSerialized { 
   

						@Getter @Setter private char[] sf503RcRecordType = Field.fillLowValue(1);

						@Getter @Setter private char[] sf503RcLocalMipId = Field.fillLowValue(3);

						@Getter @Setter private char[] sf503RcRemoteMipId = Field.fillLowValue(3);

						@Getter @Setter private char[] sf503RcOperatorId = Field.fillLowValue(7);
				@Getter @Setter private Sf503RcTime sf503RcTime = new Sf503RcTime();
				@Getter @Setter private Sf503RcDate sf503RcDate = new Sf503RcDate();

						@Getter @Setter private char[] sf503RcMessageArea = Field.fillLowValue(80);
	
	/**
	* Constructor for Sf503RemoteConsoleLog
	**/
    public Sf503RemoteConsoleLog() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503RemoteConsoleLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503RemoteConsoleLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSf503RcTime().setParent(this,getStartOffset() + 15);
					getSf503RcDate().setParent(this,getStartOffset() + 21);
    } 



}
  
