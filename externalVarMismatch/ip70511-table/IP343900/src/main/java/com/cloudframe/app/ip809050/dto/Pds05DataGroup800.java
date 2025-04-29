package com.cloudframe.app.ip809050.dto;

/**
*  The class Pds05DataGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class Pds05DataGroup800 extends Pds05DataGroup800Serialized {
   

						@Getter @Setter private char[] pds05Data800 = new char[140];
			@Getter @Setter private List<Pds05800> pds05800 = new ArrayList<>();
    	
	
	/**
	* Constructor for Pds05DataGroup800
	**/
    public Pds05DataGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < PDS_05800_SIZE;arrayIndex++) {
						getPds05800().add(new Pds05800(this, beginPds05800 + 
						arrayIndex * Pds05800.getPds05800FieldLength()));
				}
	   	/*  end of offset */
								setPds05Data800(fillHighValue(140));
    }





}
  
