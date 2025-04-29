package com.cloudframe.app.sf311010.dto;

/**
*  The class De48Se66SfLenGroup500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class De48Se66SfLenGroup500 extends De48Se66SfLenGroup500Serialized {
   

						@Getter @Setter private char[] de48Se66SfLen500 = new char[2];
					@Getter @Setter private De48Se66SfLen500Redefined de48Se66SfLen500Redefined = new De48Se66SfLen500Redefined();
	
	/**
	* Constructor for De48Se66SfLenGroup500
	**/
    public De48Se66SfLenGroup500() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDe48Se66SfLen500Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setDe48Se66SfLen500(fillSpace(2));
    }





}
  
