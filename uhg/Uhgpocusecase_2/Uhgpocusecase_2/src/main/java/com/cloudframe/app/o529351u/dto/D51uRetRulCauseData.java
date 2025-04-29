package com.cloudframe.app.o529351u.dto;

/**
*  The class D51uRetRulCauseData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class D51uRetRulCauseData extends D51uRetRulCauseDataSerialized { 
   
			@Getter @Setter private List<D51uRetRulCause> d51uRetRulCause = new ArrayList<>();
    	
	
	/**
	* Constructor for D51uRetRulCauseData
	**/
    public D51uRetRulCauseData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uRetRulCauseData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulCauseData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
