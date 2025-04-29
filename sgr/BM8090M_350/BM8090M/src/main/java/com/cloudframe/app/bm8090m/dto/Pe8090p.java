package com.cloudframe.app.bm8090m.dto;

/**
*  The class Pe8090p is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class Pe8090p extends Pe8090pSerialized { 
   
			@Getter @Setter private List<Pe8090r> pe8090r = new ArrayList<>();
    	

						@Getter @Setter private char[] pe00tc00 = Field.fillLowValue(100);

						@Getter @Setter private char[] pe00tc01 = Field.fillLowValue(60);

						@Getter @Setter private char[] pe00tc02 = Field.fillLowValue(60);
	
	/**
	* Constructor for Pe8090p
	**/
    public Pe8090p() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Pe8090p. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pe8090p(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
