package com.cloudframe.app.move0.dto;

/**
*  The class PackedTo2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;


@Data
public class PackedTo2 extends PackedTo2Serialized {
   

								@Getter @Setter private BigDecimal t11 = BigDecimal.ZERO;
	
	/**
	* Constructor for PackedTo2
	**/
    public PackedTo2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
