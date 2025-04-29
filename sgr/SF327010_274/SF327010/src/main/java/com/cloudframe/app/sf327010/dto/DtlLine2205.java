package com.cloudframe.app.sf327010.dto;

/**
*  The class DtlLine2205 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class DtlLine2205 extends DtlLine2205Serialized {
   


						@Getter @Setter private char[] serviceName205 = new char[55];

	
	/**
	* Constructor for DtlLine2205
	**/
    public DtlLine2205() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 0
             ,9
             );
								setServiceName205(fillSpace(55));
       replaceValue( // serialize and save the value
             pad(69," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 64
             ,69
             );
    }





}
  
