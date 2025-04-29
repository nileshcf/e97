package com.cloudframe.app.ar640010.dto;

/**
*  The class SpecTable530 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class SpecTable530 extends SpecTable530Serialized {
   
			@Getter @Setter private List<SpecEntry530> specEntry530 = new ArrayList<>();
    	
	
	/**
	* Constructor for SpecTable530
	**/
    public SpecTable530() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SPEC_ENTRY_530_SIZE;arrayIndex++) {
						getSpecEntry530().add(new SpecEntry530(this, beginSpecEntry530 + 
						arrayIndex * SpecEntry530.getSpecEntry530FieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < SPEC_ENTRY_530_SIZE;arrayIndex++) {
					getSpecEntry530().add(new SpecEntry530(this, beginSpecEntry530 + 
						arrayIndex * SpecEntry530.getSpecEntry530FieldLength()));
			}
    }





}
  
