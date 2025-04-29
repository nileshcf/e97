package com.cloudframe.app.ip299010.dto;

/**
*  The class Ip00054wEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00054wEntry extends Ip00054wEntrySerialized { 
   
				@Getter @Setter private Ip00054wTable5Key1 ip00054wTable5Key1 = new Ip00054wTable5Key1();

						@Getter @Setter private char[] ip00054wReloadDtTm = Field.fillLowValue(10);
	
	/**
	* Constructor for Ip00054wEntry
	**/
    public Ip00054wEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00054wEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00054wEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp00054wTable5Key1().setParent(this,getStartOffset() + 0);
    } 



}
  
