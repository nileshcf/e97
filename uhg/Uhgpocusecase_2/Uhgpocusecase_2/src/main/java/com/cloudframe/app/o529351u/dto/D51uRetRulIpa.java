package com.cloudframe.app.o529351u.dto;

/**
*  The class D51uRetRulIpa is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class D51uRetRulIpa extends D51uRetRulIpaSerialized { 
   
			@Getter @Setter private List<D51uRetRuleIpa> d51uRetRuleIpa = new ArrayList<>();
    	
	
	/**
	* Constructor for D51uRetRulIpa
	**/
    public D51uRetRulIpa() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uRetRulIpa. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulIpa(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
