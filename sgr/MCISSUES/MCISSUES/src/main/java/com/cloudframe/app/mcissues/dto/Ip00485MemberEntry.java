package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip00485MemberEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00485MemberEntry extends Ip00485MemberEntrySerialized { 
   
				@Getter @Setter private Ip00485UserTagId ip00485UserTagId = new Ip00485UserTagId();

								@Getter @Setter private short ip00485UserTagStart;

								@Getter @Setter private short ip00485UserTagLngth;

						@Getter @Setter private char[] ip00485UserTagStatus = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00485MemberEntry
	**/
    public Ip00485MemberEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00485MemberEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00485MemberEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp00485UserTagId().setParent(this,getStartOffset() + 0);
    } 



}
  
