package com.cloudframe.app.dbissues.dto;

/**
*  The class F01iParteFija is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class F01iParteFija extends F01iParteFijaSerialized { 
   
				@Getter @Setter private F01iIzdatparr f01iIzdatparr = new F01iIzdatparr();
				@Getter @Setter private F01iIzdattab f01iIzdattab = new F01iIzdattab();

								@Getter @Setter private long f01iIznuchar;
	
	/**
	* Constructor for F01iParteFija
	**/
    public F01iParteFija() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for F01iParteFija. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public F01iParteFija(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getF01iIzdatparr().setParent(this,getStartOffset() + 85);
					getF01iIzdattab().setParent(this,getStartOffset() + 85);
    } 



}
  
