package com.cloudframe.app.d529351u.dto;

/**
*  The class D51uRetRulFrToSvc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class D51uRetRulFrToSvc extends D51uRetRulFrToSvcSerialized { 
   
			@Getter @Setter private List<D51uRetRuleFromtoSvc> d51uRetRuleFromtoSvc = new ArrayList<>();
    	
	
	/**
	* Constructor for D51uRetRulFrToSvc
	**/
    public D51uRetRulFrToSvc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uRetRulFrToSvc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulFrToSvc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
