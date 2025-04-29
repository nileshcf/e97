package com.cloudframe.app.ar640010.dto;

/**
*  The class SuccessMsg609 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class SuccessMsg609 extends SuccessMsg609Serialized {
   


								@Getter @Setter private long successRequest609;


							@Getter @Setter private char[] successMsg609ConditionGroup3 = new char[10];
						
	
	/**
	* Constructor for SuccessMsg609
	**/
    public SuccessMsg609() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0090-REQUEST NBR: ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setSuccessRequest609(0L);
       replaceValue( // serialize and save the value
             (" SUCCESSFUL ").toCharArray()
             , getStartOffset() + 27
             ,12
             );
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 39
             ,10
             );
    }



	/**
	 * 	initializes SuccessMsg609
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setSuccessRequest609(0);
   }


}
  
