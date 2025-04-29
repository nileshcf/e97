package com.cloudframe.app.ar640010.dto;

/**
*  The class DsnQualTable550 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;


@Data
public class DsnQualTable550 extends DsnQualTable550Serialized {
   
      private List<char[]> dsnQual550; 

	
	/**
	* Constructor for DsnQualTable550
	**/
    public DsnQualTable550() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
							for (int arrayIndex = 0; arrayIndex < DSN_QUAL_550_SIZE;arrayIndex++) {
								setDsnQual550(arrayIndex,fillSpace(8));
							}
    }





}
  
