package com.cloudframe.app.bm8090m.dto;

/**
*  The class Pe8090r is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Pe8090r extends Pe8090rSerialized { 
   

								@Getter @Setter private short indtipidef;

						@Getter @Setter private char[] desnombre = Field.fillLowValue(60);

						@Getter @Setter private char[] despriapel = Field.fillLowValue(100);

						@Getter @Setter private char[] dessegapel = Field.fillLowValue(60);

						@Getter @Setter private char[] sepapell = Field.fillLowValue(1);

						@Getter @Setter private char[] indidioma = Field.fillLowValue(2);
	
	/**
	* Constructor for Pe8090r
	**/
    public Pe8090r() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Pe8090r. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pe8090r(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
