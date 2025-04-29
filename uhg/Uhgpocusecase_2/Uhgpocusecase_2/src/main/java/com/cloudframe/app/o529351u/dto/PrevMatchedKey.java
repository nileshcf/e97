package com.cloudframe.app.o529351u.dto;

/**
*  The class PrevMatchedKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class PrevMatchedKey extends PrevMatchedKeySerialized { 
   

						@Getter @Setter private char[] prevPs = new char[2];

						@Getter @Setter private char[] prevSvc = new char[6];

						@Getter @Setter private char[] prevCauseCd = new char[1];
	
	/**
	* Constructor for PrevMatchedKey
	**/
    public PrevMatchedKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for PrevMatchedKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PrevMatchedKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setPrevPs(fillSpace(2));
								setPrevSvc(fillSpace(6));
								setPrevCauseCd(fillSpace(1));
    } 



}
  
