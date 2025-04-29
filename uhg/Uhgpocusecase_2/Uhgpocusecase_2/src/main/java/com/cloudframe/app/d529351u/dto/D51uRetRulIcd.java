package com.cloudframe.app.d529351u.dto;

/**
*  The class D51uRetRulIcd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class D51uRetRulIcd extends D51uRetRulIcdSerialized { 
   
			@Getter @Setter private List<D51uRetRuleIcd> d51uRetRuleIcd = new ArrayList<>();
    	
	
	/**
	* Constructor for D51uRetRulIcd
	**/
    public D51uRetRulIcd() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for D51uRetRulIcd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public D51uRetRulIcd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
