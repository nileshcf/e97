package com.cloudframe.app.dbissues.dto;

/**
*  The class F01oParteFija is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class F01oParteFija extends F01oParteFijaSerialized { 
   
				@Getter @Setter private F01oIzdatparr f01oIzdatparr = new F01oIzdatparr();
				@Getter @Setter private F01oIzdattab f01oIzdattab = new F01oIzdattab();

								@Getter @Setter private long f01oIznuchar;
	
	/**
	* Constructor for F01oParteFija
	**/
    public F01oParteFija() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for F01oParteFija. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public F01oParteFija(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getF01oIzdatparr().setParent(this,getStartOffset() + 85);
					getF01oIzdattab().setParent(this,getStartOffset() + 85);
    } 



}
  
